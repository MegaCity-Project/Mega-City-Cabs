package lk.ijse.megacitycab.map;

import lk.ijse.megacitycab.dto.CustomerDTO;
import lk.ijse.megacitycab.entity.Customer;
import org.modelmapper.ModelMapper;

public class Map {
    private ModelMapper modelMapper = new ModelMapper();
    public CustomerDTO toCustomerDto(Customer customer){
        return modelMapper.map(customer, CustomerDTO.class);
    }

    public Customer toCustomer(CustomerDTO customer){
        return modelMapper.map(customer, Customer.class);
    }
}
