package dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import javax.sql.DataSource;
import model.Customer;

import java.util.ArrayList;
import java.util.List;

public class JdbcCustomerDao implements CustomerDAO {

    private  JdbcTemplate jdbcTemplate;


    public JdbcCustomerDao(DataSource datasource){
        this.jdbcTemplate = new JdbcTemplate(datasource);
    }


    public Customer getCustomer(int customerId) {
        return null;
    }


    public List<Customer> getAllCustomers() {
        List<Customer> customers = new ArrayList<Customer>();
        String sql = "SELECT customer_id, customer_name, customer_street, " +
                     "   customer_city, customer_postalcode, email " +
                     " FROM customer;";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
        while (results.next()){
            customers.add(mapRowToCustomer(results));
        }
        return customers;
    }

    private Customer mapRowToCustomer(SqlRowSet results) {
        Customer customer = new Customer();
        customer.setCustomerId(results.getInt("customer_id"));
        customer.setCustomerName(results.getString("customer_name"));
        customer.setAddress(results.getString("customer_street"));
        customer.setCity(results.getString("customer_city"));
        customer.setPostalCode(results.getString("customer_postalcode"));
        customer.setEmail(results.getString("email"));

        return customer;
    }


    public Customer createCustomer(Customer customer) {
        return null;
    }


    public void updateCustomer(Customer customer) {

    }


    public void deleteCustomer(int customerId) {

    }
}
