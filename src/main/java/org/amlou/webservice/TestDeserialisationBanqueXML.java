package org.amlou.webservice;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;

import java.io.File;
import java.util.Date;

public class TestDeserialisationBanqueXML {
    public static void main(String[] args) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(Banque.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        Banque banque = (Banque) unmarshaller.unmarshal(new File( "banque.xml"));
        System.out.println("********************");
        for (Compte c: banque.comptes) {
            System.out.println(c.toString());
            System.out.println("--------------------");
        }
    }
}
