package lk.ijse.megacitycab.service;

import lk.ijse.megacitycab.dto.CustomerDTO;
import lk.ijse.megacitycab.map.Map;
import lk.ijse.megacitycab.repostory.CustomerRepotory;
import lk.ijse.megacitycab.repostory.CustomerRepotoryImpl;

import java.io.IOException;
import java.util.List;

public class CustomerServiceImpl implements CustomerService{
    private Map map = new Map();
    private CustomerRepotory customerRepotory = new CustomerRepotoryImpl();

    @Override
    public void saveCustomer(CustomerDTO customer) throws IOException {
        customerRepotory.saveCustomer(map.toCustomer(customer));
    }

    @Override
    public List<CustomerDTO> getAllCustomer() throws IOException {
        return map.toCustomerDtoList(customerRepotory.getAllCustomer());
    }

    @Override
    public void updateCustomer(CustomerDTO customer) {

    }

    @Override
    public void deleteCustomer(CustomerDTO customer) {

    }

    @Override
    public CustomerDTO findCustomer(String registration_number) {
        return null;
    }
}
