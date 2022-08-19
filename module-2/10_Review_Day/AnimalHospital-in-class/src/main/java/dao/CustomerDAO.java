package dao;

import model.Customer;

import java.util.List;

public interface CustomerDAO {

    Customer getCustomer(int customerId);

    List<Customer> getAllCustomers();

    Customer createCustomer(Customer customer);

    void updateCustomer(Customer customer);

    void deleteCustomer(int customerId);

}
