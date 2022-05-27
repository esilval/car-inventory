package co.edu.cun.inventory.entity;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "CAR")
public class Car {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "BRAND")
    private String brand;

    @Column(name = "LINE")
    private String line;

    @Column(name = "PLATE_CAR")
    private String plateCar;

    @Column(name = "STATUS")
    private String status;

}
