package lk.ijse.megacitycab.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
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
public class Customer{
    @Id
    private String registration_number;
    private String name;
    private String phone;
    private String address;
    @Column(unique = true)
    private String email;
}
