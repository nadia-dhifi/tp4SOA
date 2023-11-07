package SERVICE;


import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService
public class CalculatriceWS {

    @WebMethod
    public double somme(@WebParam(name = "a") double a, @WebParam(name = "b") double b) {
        return a + b;
    }
}





