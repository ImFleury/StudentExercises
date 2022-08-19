//import dao.CustomerDAO;
//import dao.JdbcCustomerDao;
//import model.Customer;


import dao.*;
import model.*;
import org.apache.commons.dbcp2.BasicDataSource;

//import javax.sql.DataSource;
//import java.time.LocalDate;
//import java.time.format.DateTimeParseException;

import java.util.List;

public class AnimalHospitalCLI {

    private CustomerDAO customerDAO;

    public static void main(String[] args) {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setUrl("jdbc:postgresql://localhost:5432/AnimalHospital");
        dataSource.setUsername("postgres");
        dataSource.setPassword("postgres1");

        AnimalHospitalCLI application = new AnimalHospitalCLI(dataSource);
        application.run();
    }

    public AnimalHospitalCLI(BasicDataSource dataSource) {

        customerDAO = new JdbcCustomerDao(dataSource);
    }

    private void run() {

        displayAllCustomers();
    }


    private void displayAllCustomers(){

        List<Customer> customers = customerDAO.getAllCustomers();
        System.out.println("It worked!");
        for(Customer customer : customers){
            System.out.println(customer.toString());
            System.out.println();
        }

    }
}
