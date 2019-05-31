package dynamodb.repository;

import dynamodb.entity.TransactionResponse;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

@EnableScan
public interface TransactionRepository extends CrudRepository<TransactionResponse, String> {

    List<TransactionResponse> findByTransactionCodeIn(List<String> transactionCode);

}
