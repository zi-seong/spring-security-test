package com.js.security_test.securingweb.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {



    @Autowired
    AccountRepository accountRepository;
    public Account create() {
        Account account = new Account();
        account.setEmail("jspark@email.com");
        account.setPassword("password");
        accountRepository.save(account);
        return account;
    }
}
