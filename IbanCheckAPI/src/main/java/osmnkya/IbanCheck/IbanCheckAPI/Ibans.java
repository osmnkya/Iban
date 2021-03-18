package osmnkya.IbanCheck.IbanCheckAPI;

import java.util.List;

public class Ibans {
    private List<Iban> ibans;

    List<Iban> getIbans() {
        return ibans;
    }

    public void setIbans(List<Iban> ibans) {
        this.ibans = ibans;
    }
}
