package lk.ijse.megacitycab.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table
public class VehicleDetails {
    @Id
    private String vehicleDetailsId;
    @ManyToOne
    private Booking booking;
    @ManyToOne
    private Vehicle vehicle;
    private String totalMilage;
    private String price;
}
