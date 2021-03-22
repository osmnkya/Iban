package osmnkya.IbanCheck.IbanCheckAPI;

import org.springframework.web.bind.annotation.*;

@RestController
public class IbanCheckRest {

    @RequestMapping(value = "/iban/{iban}", method = RequestMethod.GET)
    public boolean checkIban(@PathVariable("iban") String iban) {
        IbanControl ibanHandler = new IbanControl();
        return ibanHandler.isIbanValid(iban);
    }
}
