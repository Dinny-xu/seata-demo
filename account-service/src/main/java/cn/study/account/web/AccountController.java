package cn.study.account.web;

import cn.study.account.service.AccountService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 账户服务
 * @Author dinny-xu
 * @Date 2022/9/15
 * @Time 3:29 下午
 */
@RestController
@RequestMapping("account")
public class AccountController {

    private final AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @PutMapping("/{userId}/{money}")
    public ResponseEntity<Void> debit(@PathVariable("userId") String userId, @PathVariable("money") Integer money){
        accountService.debit(userId, money);
        return ResponseEntity.noContent().build();
    }
}
