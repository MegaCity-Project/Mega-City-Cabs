package lk.ijse.megacitycab.service;

import lk.ijse.megacitycab.dto.CustomerDTO;

import java.io.IOException;
import java.util.List;

public interface CustomerService {
    void saveCustomer(CustomerDTO customer) throws IOException;
    List<CustomerDTO> getAllCustomer();
    void updateCustomer(CustomerDTO customer);
    void deleteCustomer(CustomerDTO customer);
    CustomerDTO findCustomer(String registration_number);
}
