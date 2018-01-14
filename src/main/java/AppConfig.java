import com.pluralsight.repository.CustomerRepository;
import com.pluralsight.repository.HibernateCustomerRepositoryImpl;
import com.pluralsight.service.CustomerService;
import com.pluralsight.service.CustomerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.pluralsight"})
public class AppConfig {

  //  @Bean(name = "customerService")
  //  public CustomerService getCustomerService() {
        // Using setter injection
  //      CustomerServiceImpl service = new CustomerServiceImpl();

        // using constructor injection
        //CustomerServiceImpl service = new CustomerServiceImpl(getCustomerRepository());

        //With @Autowired you don't need this
        //service.setCustomerRepository(getCustomerRepository());
    //    return service;
   // }

//    @Bean(name = "customerRepository")
//    public CustomerRepository getCustomerRepository() {
//        return new HibernateCustomerRepositoryImpl();
//    }
}
