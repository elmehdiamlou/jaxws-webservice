package org.amlou.webservice;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;

import java.io.File;
import java.util.Date;

public class TestSerialisationCompteXML {
    public static void main(String[] args) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(Compte.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(new Compte(1, 4500, new Date(), TypeCompte.COURANT), new File("compte.xml"));
    }
}
