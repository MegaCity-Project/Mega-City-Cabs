package lk.ijse.megacitycab.util.map;

import lk.ijse.megacitycab.dto.BoockingDTO;
import lk.ijse.megacitycab.dto.CustomerDTO;
import lk.ijse.megacitycab.entity.Booking;
import lk.ijse.megacitycab.entity.Customer;
import lk.ijse.megacitycab.repostory.CustomerRepotory;
import lk.ijse.megacitycab.repostory.CustomerRepotoryImpl;
import org.modelmapper.ModelMapper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Map {
    private ModelMapper modelMapper = new ModelMapper();
    private CustomerRepotory customerRepotory = new CustomerRepotoryImpl();
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

    public BoockingDTO toBoockingDto(Booking booking){
        String regsraton_number = booking.getCustomer().getRegistration_number();
        BoockingDTO boockingDTO = modelMapper.map(booking, BoockingDTO.class);
        boockingDTO.setRegistration_number(regsraton_number);
        return boockingDTO;
    }

    public Booking toBoocking(BoockingDTO bookingDto) throws IOException {
        Customer customer = customerRepotory.findCustomer(bookingDto.getRegistration_number());
        Booking booking =  modelMapper.map(bookingDto, Booking.class);
        booking.setCustomer(customer);
        return booking;
    }

    public List<BoockingDTO> toBoockingDtoList(List<Booking> bookings){
        List<BoockingDTO> boockingDTOS = new ArrayList<>();
        for (Booking booking : bookings){
            boockingDTOS.add(toBoockingDto(booking));
        }
        return boockingDTOS;
    }


}
