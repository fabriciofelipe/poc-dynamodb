package dynamodb.entity;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Builder
@Data
@DynamoDBTable(tableName="Transaction")
public class TransactionResponse {

    private Long id;

    @DynamoDBHashKey
    private String code;

    @DynamoDBAttribute
    private LocalDateTime createDate;

    @DynamoDBAttribute
    private BigDecimal originalValue;

    @DynamoDBAttribute
    private BigDecimal discountValue;

    @DynamoDBAttribute
    private BigDecimal totalValue;

    private BigDecimal grossValue;

    @DynamoDBAttribute
    private Integer mainPaymentMethodId;

    @DynamoDBAttribute
    private Long creditorId;

    @DynamoDBAttribute
    private String creditorEmail;

    @DynamoDBAttribute
    private String creditorName;

    @DynamoDBAttribute
    private String creditorNickname;

    @DynamoDBAttribute
    private Long debtorId;

    @DynamoDBAttribute
    private String debtorName;

    @DynamoDBAttribute
    private String debtorEmail;

    @DynamoDBAttribute
    private String debtorNickname;

    @DynamoDBAttribute
    private BigDecimal creditorTaxValue;

    @DynamoDBAttribute
    private Integer statusId;

    @DynamoDBAttribute
    private String creditBinClean;

    @DynamoDBAttribute
    private String creditHolderClean;

    @DynamoDBAttribute
    private String channel;

    @DynamoDBAttribute
    private Integer typeId;

    @DynamoDBAttribute
    private String operationType;

    @DynamoDBAttribute
    private String cardRechargeType;

    @DynamoDBAttribute
    private String operationComment;

    @DynamoDBAttribute
    private LocalDateTime escrowDate;

    @DynamoDBAttribute
    private String referenceCode;
}
