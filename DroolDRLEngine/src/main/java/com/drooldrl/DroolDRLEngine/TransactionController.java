package com.drooldrl.DroolDRLEngine;

import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransactionController {

    @Autowired
    private TransactionService transactionService;

   @PostMapping("/transaction1")
    public Transaction transactionNow(@RequestBody Transaction transaction ){
       Transaction transactionResult = new Transaction();
       transactionResult= transactionService.newTransaction(transaction);
//       session.insert(transaction);
//       session.fireAllRules();
       return transactionResult;

    }

//    @Autowired
//    private OrderDiscountService orderDiscountService;
//
//    @PostMapping("/get-discount")
//    public ResponseEntity<OrderDiscount> getDiscount(@RequestBody OrderRequest orderRequest) {
//        OrderDiscount discount = orderDiscountService.getDiscount(orderRequest);
//        return new ResponseEntity<>(discount, HttpStatus.OK);
//    }

}
