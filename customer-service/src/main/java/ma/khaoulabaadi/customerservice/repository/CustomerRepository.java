package ma.khaoulabaadi.customerservice.repository;

import ma.khaoulabaadi.customerservice.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
