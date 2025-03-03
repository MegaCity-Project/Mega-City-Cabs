package lk.ijse.megacitycab.entity;

import jakarta.persistence.*;
import lk.ijse.megacitycab.util.enums.FuelType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table
public class Vehicle {
    @Id
    private String vehicleId;
    @ManyToOne
    private Driver driver;
    private String brand;
    private String color;
    private double pricePreMilage;
    private String licanePlateNumber;
    @Enumerated(EnumType.STRING)
    private FuelType fuelType;
    @OneToMany(mappedBy = "vehicle")
    private List<VehicleDetails> vehicleDetails;
}
