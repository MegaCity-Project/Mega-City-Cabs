package lk.ijse.megacitycab.repostory;

import lk.ijse.megacitycab.config.FactoryConfiguration;
import lk.ijse.megacitycab.entity.Customer;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.io.IOException;
import java.util.List;

public class CustomerRepotoryImpl implements CustomerRepotory {
    @Override
    public void saveCustomer(Customer customer) throws IOException {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        session.save(customer);
        transaction.commit();
        session.close();
    }

    @Override
    public List<Customer> getAllCustomer() {
        return null;
    }

    @Override
    public void updateCustomer(Customer customer) {

    }

    @Override
    public void deleteCustomer(Customer customer) {

    }

    @Override
    public Customer findCustomer(String registration_number) {
        return null;
    }
}
