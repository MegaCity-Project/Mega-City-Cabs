package lk.ijse.megacitycab.util.map;

import lk.ijse.megacitycab.dto.CustomerDTO;
import lk.ijse.megacitycab.entity.Customer;
import org.modelmapper.ModelMapper;

import java.util.List;
import java.util.stream.Collectors;

public class Map {
    private ModelMapper modelMapper = new ModelMapper();
    public CustomerDTO toCustomerDto(Customer customer){
        return modelMapper.map(customer, CustomerDTO.class);
    }

    public Customer toCustomer(CustomerDTO customer){
        return modelMapper.map(customer, Customer.class);
    }

    public List<CustomerDTO> toCustomerDtoList(List<Customer> customerList) {
        return customerList.stream()
                .map(customer -> modelMapper.map(customer, CustomerDTO.class))
                .collect(Collectors.toList());
    }

}
