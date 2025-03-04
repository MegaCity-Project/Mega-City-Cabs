package lk.ijse.megacitycab.service;

import lk.ijse.megacitycab.dto.VehicleDTO;
import lk.ijse.megacitycab.repostory.VehicleRepostory;
import lk.ijse.megacitycab.repostory.VehicleRepostoryImpl;
import lk.ijse.megacitycab.util.map.Map;

import java.io.IOException;
import java.util.List;

public class VehicleServiceImpl implements VehicleService{
    private VehicleRepostory vehicleRepostory = new VehicleRepostoryImpl();
    private Map map = new Map();
    @Override
    public void saveVehicle(VehicleDTO vehicle) throws IOException {
        vehicleRepostory.saveVehicle(map.toVehicle(vehicle));
    }

    @Override
    public List<VehicleDTO> getAllVehicle() throws IOException {
        return map.toVehicleDtoList(vehicleRepostory.getAllVehicle());
    }

    @Override
    public void updateVehicle(VehicleDTO vehicle) throws IOException {

    }

    @Override
    public void deleteVehicle(String vehicle_id) throws IOException {

    }

    @Override
    public VehicleDTO findVehicle(String vehicle_id) throws IOException {
        return null;
    }
}
