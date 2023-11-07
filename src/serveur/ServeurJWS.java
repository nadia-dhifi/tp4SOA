package serveur;

import javax.xml.ws.Endpoint;
import SERVICE.CalculatriceWS;

public class ServeurJWS {
    public static void main(String[] args) {
        
        String url = "http://localhost:8085/";

        
        SERVICE.CalculatriceWS calculatrice = new SERVICE.CalculatriceWS();

       
        Endpoint.publish(url, calculatrice);

       
        System.out.println("Service web CalculatriceWS publié à l'adresse : " + url);

      
}}