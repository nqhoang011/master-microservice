package com.hoangnguyen.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
@Schema(
        name = "Account",
        description = "Schema to hold Account information"
)
public class AccountsDto {

    @Schema(
            description = "Account number of Bank account",
            example = "1928374650"
    )
    @NotEmpty(message = "AccountNumber cannot be null or empty")
    @Pattern(regexp = "(^$|[0-9]{10})", message = "Account number must be 10 digits")
    private Long accountNumber;

    @Schema(
            description = "Account type of Bank account",
            example = "Savings"
    )
    @NotEmpty(message = "AccountType can not be null or empty")
    private String accountType;

    @Schema(
            description = "Bank branch address",
            example = "Ho Chi Minh city, Vietnam"
    )
    @NotEmpty(message = "BranchAddress cannot be null or empty")
    private String branchAddress;
}
