package Cars.CarsThymeleafe.entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.stereotype.Controller;



@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Cars {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;

    @Column(name = "Data Fabricatiei")
    private Long fabricationYear;

    @Column(name = "Nume")
    private String name;

    @Column(name = "Seria Masinii")
    private String series;

    @Column(name = "Tip Motorizare")
    private String motorType;

    private Integer price;


}
