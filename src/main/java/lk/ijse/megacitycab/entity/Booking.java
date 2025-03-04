package lk.ijse.megacitycab.entity;

import jakarta.persistence.*;
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
public class Booking {
    @Id
    private String booking_Id;
    private String date;
    @ManyToOne
    @JoinColumn(name = "registration_number",nullable = false)
    private Customer customer;
    @OneToMany(mappedBy = "booking")
    private List<VehicleDetails> vehicleDetails;
    private double price;
}
