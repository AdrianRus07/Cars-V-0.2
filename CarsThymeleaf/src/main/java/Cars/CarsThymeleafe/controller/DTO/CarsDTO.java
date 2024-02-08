package Cars.CarsThymeleafe.controller.DTO;

import jakarta.persistence.Column;


import lombok.*;


@Getter
@Setter
@ToString

public class CarsDTO {

    private Integer id;

    @Column(name = "Data Fabricatiei")
    private Long fabricationYear;

    @Column()
    private String name;

    @Column(name = "Seria Masinii")
    private String series;

    @Column(name = "Tip Motorizare")
    private String motorType;

    private Integer price;

}
