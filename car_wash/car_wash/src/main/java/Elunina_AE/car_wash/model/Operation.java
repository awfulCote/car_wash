package Elunina_AE.car_wash.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Entity
@Data
@Table(name = "operations", uniqueConstraints = @UniqueConstraint(columnNames = {"name"}))
public class Operation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String name;

    @NotNull
    private Integer duration;

    @NotNull
    private BigDecimal cost;
}
