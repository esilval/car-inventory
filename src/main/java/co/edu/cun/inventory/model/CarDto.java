package co.edu.cun.inventory.model;

import co.edu.cun.inventory.model.enums.CarStatus;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CarDto {

    private Integer id;

    private String brand;

    private String line;

    private String plateCar;

    private CarStatus status;
}
