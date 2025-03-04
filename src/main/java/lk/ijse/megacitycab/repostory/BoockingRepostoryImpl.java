package lk.ijse.megacitycab.repostory;

import lk.ijse.megacitycab.config.FactoryConfiguration;
import lk.ijse.megacitycab.entity.Booking;
import lk.ijse.megacitycab.entity.Customer;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;

import java.io.IOException;
import java.util.List;

public class BoockingRepostoryImpl implements BoockingRepostory{
    @Override
    public void saveBoocking(Booking booking) throws IOException {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        session.save(booking);
        transaction.commit();
        session.close();
    }

    @Override
    public List<Booking> getAllBoocking() throws IOException {
        Session session = FactoryConfiguration.getInstance().getSession();
        NativeQuery nativeQuery = session.createNativeQuery("SELECT * FROM booking");
        nativeQuery.addEntity(Booking.class);
        List<Booking> bookings = nativeQuery.getResultList();
        session.close();
        return bookings;
    }

    @Override
    public void updateBoocking(Booking booking) throws IOException {

    }

    @Override
    public void deleteBoocking(String booking_id) throws IOException {

    }

    @Override
    public Booking findBoocking(String booking_id) throws IOException {
        return null;
    }
}
