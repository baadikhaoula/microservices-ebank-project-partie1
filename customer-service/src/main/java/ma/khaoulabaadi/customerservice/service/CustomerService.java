package ma.khaoulabaadi.customerservice.service;

import java.util.List;

import ma.khaoulabaadi.customerservice.entities.Customer;
import ma.khaoulabaadi.customerservice.repository.CustomerRepository;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    private CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }
    // Méthode pour récupérer tous les clients
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }
    // Méthode pour trouver un client par son ID
    public Customer findCustomerById(Long id) {
        return customerRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Customer Not found"));
    }
    //  Méthode pour sauvegarder un client (créer ou mettre à jour)
    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }
}