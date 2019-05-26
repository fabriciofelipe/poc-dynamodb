package dynamodb.service;

import dynamodb.entity.TransactionResponse;
import dynamodb.repository.TransactionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TransactionService {

    private final TransactionRepository transactionRepository;


    public List<TransactionResponse> findTransactions(List<String> transactionsCode) {
        return Optional.of(transactionsCode)
                .map(transactionRepository::findByCode)
                .orElse(null);
    }
}
