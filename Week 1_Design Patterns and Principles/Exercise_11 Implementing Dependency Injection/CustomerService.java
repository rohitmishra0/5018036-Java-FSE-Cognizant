// CustomerService.java
public class CustomerService {
    private final CustomerRepository customerRepository;

    // Constructor Injection(Constructor)
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Customer getCustomer(int id) {
        return customerRepository.findCustomerById(id);
    }
}
