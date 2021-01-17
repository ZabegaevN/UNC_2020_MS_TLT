package nc.unc.cs.services.bank.integration;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateTax {
    private Long serviceId;
    private Long citizenId;
    private Integer taxAmount;
}