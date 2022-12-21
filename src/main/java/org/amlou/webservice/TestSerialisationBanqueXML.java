package org.amlou.webservice;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;

import java.io.File;
import java.util.Date;

public class TestSerialisationBanqueXML {
    public static void main(String[] args) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(Banque.class);
        Banque banque= new Banque();
        banque.comptes.add(new Compte( 1, 54000, new Date(), TypeCompte.COURANT));
        banque.comptes.add(new Compte (2, 12000, new Date(), TypeCompte.EPARGNE));
        banque.comptes.add(new Compte (3, 7000, new Date(), TypeCompte.COURANT));
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(banque, new File("banque.xml"));
    }
}
