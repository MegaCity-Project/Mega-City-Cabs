package lk.ijse.megacitycab.repostory;

import lk.ijse.megacitycab.config.FactoryConfiguration;
import lk.ijse.megacitycab.entity.Vehicle;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;

import java.io.IOException;
import java.util.List;

public class VehicleRepostoryImpl implements VehicleRepostory{
    @Override
    public void saveVehicle(Vehicle vehicle) throws IOException {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        session.save(vehicle);
        transaction.commit();
        session.close();
    }

    @Override
    public List<Vehicle> getAllVehicle() throws IOException {
        Session session = FactoryConfiguration.getInstance().getSession();
        NativeQuery nativeQuery = session.createNativeQuery("SELECT * FROM vehicle");
        nativeQuery.addEntity(Vehicle.class);
        List<Vehicle> resultList = nativeQuery.getResultList();
        session.close();
        return resultList;
    }

    @Override
    public void updateVehicle(Vehicle vehicle) throws IOException {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        session.update(vehicle);
        transaction.commit();
        session.close();
    }

    @Override
    public void deleteVehicle(String vehicle_id) throws IOException {

    }

    @Override
    public Vehicle findVehicle(String vehicle_id) throws IOException {
        return null;
    }
}
