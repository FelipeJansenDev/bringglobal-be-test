package com.felipeJansen.bringglobal.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.felipeJansen.bringglobal.model.BackbaseField;
import com.felipeJansen.bringglobal.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class TransactionController {

	@Autowired
	private TransactionService transactionService;

	@GetMapping("/")
	public String showHome() {
		return "home";
	}

	@RequestMapping(value = "/getAll", method = RequestMethod.GET)
	public ModelAndView getAllTransactions() throws JsonProcessingException {
		List<BackbaseField> listOfTransactions = transactionService.getAllTransactions();
		ModelAndView modelAndView = getModelAndView(listOfTransactions);
		return modelAndView;
	}

	@RequestMapping(value = "/filter", method=RequestMethod.GET)
	public ModelAndView showAllData(@RequestParam("transactionType") String transactionType) throws JsonProcessingException {
		List<BackbaseField> listOfTransactions = transactionService.getAllTransactionsByTransactionType(transactionType);
		ModelAndView modelAndView = getModelAndView(listOfTransactions);
		modelAndView.addObject("amountTransferred", transactionService.amountTransferredOnTransactions(listOfTransactions));
		return modelAndView;
	}

	private static ModelAndView getModelAndView(List<BackbaseField> listOfTransactions) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("transactionList");
		modelAndView.addObject("transactionList", listOfTransactions);
		return modelAndView;
	}

}
