package service;
import jakarta.jws.*;
import metier.Compte;

import java.util.ArrayList;
import java.util.List;
@WebService
public class BanqueService {

    List<Compte> comptes = new ArrayList<Compte>();
    @WebMethod
    public double convertion(@WebParam double montant) {

        return montant*3.3;
    }
    comptes.add(1,5,8);
    public List<Compte> getComptes(){

        return comptes;
    }


}
