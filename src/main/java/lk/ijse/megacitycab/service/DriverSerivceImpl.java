package lk.ijse.megacitycab.service;

import lk.ijse.megacitycab.dto.DriverDTO;
import lk.ijse.megacitycab.repostory.DriverRepostory;
import lk.ijse.megacitycab.repostory.DriverRepotoryImpl;
import lk.ijse.megacitycab.util.map.Map;

import java.io.IOException;
import java.util.List;

public class DriverSerivceImpl implements DriverService{
    private DriverRepostory driverRepostory = new DriverRepotoryImpl();
    private Map map = new Map();
    @Override
    public void saveDriver(DriverDTO driver) throws IOException {
        driverRepostory.saveDriver(map.toDriver(driver));
    }

    @Override
    public List<DriverDTO> getAllDriver() throws IOException {
        return null;
    }

    @Override
    public void updateDriver(DriverDTO driver) throws IOException {

    }

    @Override
    public void deleteDriver(String driver_id) throws IOException {

    }

    @Override
    public DriverDTO findDriver(String driver_id) throws IOException {
        return null;
    }
}
