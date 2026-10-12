package ma.khaoulabaadi.ebankservice.entities;

import jakarta.persistence.Id;
import jakarta.persistence.Transient;
import lombok.*;
import ma.khaoulabaadi.ebankservice.model.Customer;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BankAccount {
    @Id
    private String id;
    private Date createdAt;
    private double balance;
    private String type;
    private long customerId;
    @Transient
    private Customer customer;
}