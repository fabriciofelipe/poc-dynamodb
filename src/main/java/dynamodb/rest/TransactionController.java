package dynamodb.rest;


import dynamodb.entity.TransactionResponse;
import dynamodb.service.TransactionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class TransactionController {

    private final TransactionService transactionService;

    @RequestMapping(path="/transactions/{transactionsCode}", method= RequestMethod.GET)
    public @ResponseBody
    ResponseEntity<List<TransactionResponse>> findById(@PathVariable List<String> transactionsCode) {
        return Optional.ofNullable(transactionsCode)
                .map(transactionService::findTransactions)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }


}
