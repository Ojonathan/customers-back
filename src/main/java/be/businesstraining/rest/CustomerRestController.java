package be.businesstraining.rest;

import be.businesstraining.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class CustomerRestController {

    private CustomerRepository respository;

    @Autowired// por defecto autowired no es necesario ya que lo hace por defecto usando el constructor
    public CustomerRestController(CustomerRepository respository) {
        this.respository = respository;
    }
    @GetMapping("/customers")
    public Iterable findAll(){
        return respository.findAll();
    }
}
