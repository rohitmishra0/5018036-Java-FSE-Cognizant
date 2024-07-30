// CustomerRepositoryImpl.java
public class CustomerRepositoryImpl implements CustomerRepository {
    @Override
    public Customer findCustomerById(int id) {
        //Returning a dummy customer.
        return new Customer(id, "John Doe");
    }
}
