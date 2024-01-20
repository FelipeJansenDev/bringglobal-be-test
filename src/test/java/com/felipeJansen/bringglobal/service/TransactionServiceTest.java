package com.felipeJansen.bringglobal.service;

import junit.framework.TestCase;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:test-context.xml"})
public class TransactionServiceTest extends TestCase {

    @InjectMocks
    private TransactionService transactionService;
}