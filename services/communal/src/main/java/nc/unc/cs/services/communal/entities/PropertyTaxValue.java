package nc.unc.cs.services.communal.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PropertyTaxValue {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long propertyTaxValueId;

    @NonNull
    @Column(nullable = false, unique = true, updatable = false, length = 40)
    private String region;

    @NonNull
    @Column(nullable = false)
    private Integer pricePerSquareMeter;

    @NonNull
    @Column(nullable = false)
    private Integer cadastralValue;

    public void setRegion(String region) {
        this.region = region.trim().toUpperCase();
    }
}
