package codevelhope.SpringBoot;

import jakarta.persistence.*;

import java.time.Year;

@Entity
@Table
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(nullable = false)
    private String carName;

    @Column
    private Year firstAppearance;

    @Column(nullable = false)
    private String inventor;

    public Car() {}

    public Car(long id, String carName, Year firstAppearance, String inventor) {
        this.carName = carName;
        this.firstAppearance = firstAppearance;
        this.id = id;
        this.inventor = inventor;
    }
    public String getCarName() {
        return carName;
    }

    public long getId() {
        return id;
    }

    public String getInventor() {
        return inventor;
    }

    public Year getFirstAppearance() {
        return firstAppearance;
    }
}