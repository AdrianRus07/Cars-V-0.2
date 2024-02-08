package Cars.CarsThymeleafe.controller.DTO;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class CarRequestDTO {

    private Long fabricationYear;

    private String name;

    private String series;

    private String motorType;

    private Integer price;
}
