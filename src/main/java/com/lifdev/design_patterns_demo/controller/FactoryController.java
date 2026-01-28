
import com.lifdev.design_patterns_demo.factory.PaymentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/factory")
public class FactoryController {

    private final PaymentService service;

    public FactoryController(PaymentService service) {
        this.service = service;
    }

    @GetMapping("/pay")
    public String pay() {
        service.pay("card", 5000);
        return "Paiement OK";
    }
}
