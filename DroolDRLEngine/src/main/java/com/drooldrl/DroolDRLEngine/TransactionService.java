package com.drooldrl.DroolDRLEngine;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionService {

    @Autowired
    private KieContainer kieContainer;

    public Transaction newTransaction(Transaction transaction) {
        Transaction transaction1 = new Transaction();
        KieSession kieSession = kieContainer.newKieSession();
        kieSession.setGlobal("transaction1", transaction1);
        kieSession.insert(transaction);
        kieSession.fireAllRules();
        kieSession.dispose();
        return transaction1;
    }

}
