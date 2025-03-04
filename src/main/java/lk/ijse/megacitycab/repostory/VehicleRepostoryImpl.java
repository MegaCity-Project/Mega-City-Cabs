package lk.ijse.megacitycab.repostory;

import lk.ijse.megacitycab.config.FactoryConfiguration;
import lk.ijse.megacitycab.entity.Vehicle;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.io.IOException;
import java.util.List;

public class VehicleRepostoryImpl implements VehicleRepostory{
    @Override
    public void saveVehicle(Vehicle vehicle) throws IOException {
        Session session = FactoryConfiguration.factoryConfiguration.getSession();
        Transaction transaction = session.beginTransaction();
        session.save(vehicle);
        transaction.commit();
        session.close();
    }

    @Override
    public List<Vehicle> getAllVehicle() throws IOException {
        return null;
    }

    @Override
    public void updateVehicle(Vehicle vehicle) throws IOException {

    }

    @Override
    public void deleteVehicle(String vehicle_id) throws IOException {

    }

    @Override
    public Vehicle findVehicle(String vehicle_id) throws IOException {
        return null;
    }
}
