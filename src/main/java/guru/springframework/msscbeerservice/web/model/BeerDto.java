package guru.springframework.msscbeerservice.web.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import javax.validation.constraints.Positive;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;


@Data
//@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDto  implements Serializable {
    static final long serialVersionUID = -3479166379690980394L;

    @Null
    private UUID id;

    @Null
    private Integer version;

    @Null
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:MM:ssZ", shape = JsonFormat.Shape.STRING)
    private OffsetDateTime createdDate;

    @Null
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:MM:ssZ", shape = JsonFormat.Shape.STRING)
    private OffsetDateTime lastModifiedDate;

    @NotBlank
    private String beerName;

    @NotNull
    private BeerStyleEnum beerStyle;

    @NotNull
    private String upc;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @Positive
    @NotNull
    private BigDecimal price;
    
    private Integer quantityOnHand;
}
