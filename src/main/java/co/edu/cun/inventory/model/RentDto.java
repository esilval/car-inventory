package co.edu.cun.inventory.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RentDto {

    private Integer id;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate rentDate;

    private Integer days;

    private CarDto car;

    private ClientDto client;
}
