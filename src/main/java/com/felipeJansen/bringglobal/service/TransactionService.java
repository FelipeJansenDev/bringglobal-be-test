package com.felipeJansen.bringglobal.service;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.felipeJansen.bringglobal.model.BackbaseField;
import com.felipeJansen.bringglobal.model.Transaction;
import kong.unirest.Unirest;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class TransactionService {

    public List<BackbaseField> getAllTransactions() throws JsonProcessingException {
        return getBackbaseFieldList();
    }

    public List<BackbaseField> getAllTransactionsByTransactionType(String transactionType) throws JsonProcessingException {
        return getBackbaseFieldList().stream()
                .filter(transaction -> transaction.getTransactionType().equalsIgnoreCase(transactionType))
                .collect(Collectors.toList());
    }

    public Double amountTransferredOnTransactions(List<BackbaseField> backbaseFieldList) {
        return backbaseFieldList.stream().mapToDouble(objeto -> Double.parseDouble(objeto.getTransactionAmount())).sum();
    }

    private List<BackbaseField> getBackbaseFieldList() throws JsonProcessingException {
        List<BackbaseField> backbaseFieldList = new ArrayList<>();
        String response = Unirest.get("http://localhost:3001/transactions").asString().getBody();
        ObjectMapper mapper = new ObjectMapper();
        List<Transaction> listOfTransactions = Arrays.asList(mapper.readValue(response, Transaction[].class));
        listOfTransactions.stream().forEach(transaction -> backbaseFieldList.add(transactionToBackBase(transaction)));
        return backbaseFieldList;
    }

    private BackbaseField transactionToBackBase(Transaction transaction) {
        BackbaseField backbaseField = new BackbaseField();
        backbaseField.setAccountId(transaction.getId());
        backbaseField.setCounterpartyAccount(transaction.getOther_account().getId());
        backbaseField.setCounterpartyName(transaction.getOther_account().getHolder().getName());
        backbaseField.setCounterPartyLogoPath(transaction.getOther_account().getMetadata().getImage_URL());
        backbaseField.setInstructedAmount(transaction.getDetails().getValue().getAmount());
        backbaseField.setInstructedCurrency(transaction.getDetails().getValue().getCurrency());
        backbaseField.setTransactionAmount(transaction.getDetails().getValue().getAmount());
        backbaseField.setTransactionType(transaction.getDetails().getType());
        backbaseField.setDescription(transaction.getDetails().getDescription());
        return backbaseField;
    }

}
