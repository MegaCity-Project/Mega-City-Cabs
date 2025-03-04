package lk.ijse.megacitycab.repostory;

import lk.ijse.megacitycab.config.FactoryConfiguration;
import lk.ijse.megacitycab.entity.Driver;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.io.IOException;
import java.util.List;

public class DriverRepotoryImpl implements DriverRepostory{
    @Override
    public void saveDriver(Driver driver) throws IOException {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        session.save(driver);
        transaction.commit();
        session.close();
    }

    @Override
    public List<Driver> getAllDriver() throws IOException {
        return null;
    }

    @Override
    public void updateDriver(Driver driver) throws IOException {

    }

    @Override
    public void deleteDriver(String driver_id) throws IOException {

    }

    @Override
    public Driver findDriver(String driver_id) throws IOException {
        return null;
    }
}
