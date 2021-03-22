package osmnkya.IbanCheck.IbanCheckAPI;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class IbanCheckRest {

    @RequestMapping(value = "/{iban}", method = RequestMethod.GET)
    public boolean checkIban(@PathVariable("iban") String iban) {
        IbanControl ibanHandler = new IbanControl();
        return ibanHandler.isIbanValid(iban);
    }
}
