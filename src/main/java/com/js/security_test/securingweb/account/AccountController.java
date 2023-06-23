package com.js.security_test.securingweb.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {



    @Autowired
    AccountRepository accountRepository;

    @Autowired
    AccountService accountService;

    @GetMapping("/create")
    public Account create() {
        Account account = new Account();
        account.setEmail("jspark@email.com");
        account.setPassword("password");
        return accountService.save(account);
    }
}
