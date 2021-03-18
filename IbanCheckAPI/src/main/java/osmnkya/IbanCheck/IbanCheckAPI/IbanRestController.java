package osmnkya.IbanCheck.IbanCheckAPI;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class IbanRestController {

    @RequestMapping(value = "/{ibans}", method = RequestMethod.GET)
    public boolean checkIban(@PathVariable("ibans") String iban) {
        IbanHandler ibanHandler = new IbanHandler();
        return ibanHandler.isIbanValid(iban);
    }

    @RequestMapping(value = "/ibans", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public String checkIbans(@RequestBody Ibans ibans) {
        StringBuilder sb = new StringBuilder();
        IbanHandler ibanHandler = new IbanHandler();
        List<Iban> ibanList = ibans.getIbans();

        for (Iban iban : ibanList) {
            sb.append("IBAN ")
                    .append(iban.getIban())
                    .append("; ")
                    .append(ibanHandler.isIbanValid(iban.getIban()))
                    .append(System.getProperty("line.separator"));
        }

        return sb.toString();
    }
}
