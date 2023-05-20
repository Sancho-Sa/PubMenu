package edu.pub.pubmenu.mappers;

import edu.pub.pubmenu.entities.Customer;
import edu.pub.pubmenu.model.CustomerDTO;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerMapper {

    Customer customerDtoToCustomer(CustomerDTO dto);

    CustomerDTO customerToCustomerDto(Customer customer);
}
