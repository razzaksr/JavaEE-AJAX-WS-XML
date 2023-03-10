package xmls;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ListJAXB {
    public static void main(String[] args) throws JAXBException, FileNotFoundException {
        JAXBContext context=JAXBContext.newInstance(Hais.class);

//        Marshaller marshaller= context.createMarshaller();
//        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
//
//        List<Hai> haiList=new ArrayList<>();
//        haiList.add(new Hai(1,"Robok",1200));
//        haiList.add(new Hai(1,"Robok",1200));
//        haiList.add(new Hai(1,"Robok",1200));
//
//        Hais hais=new Hais(haiList);
//
//        marshaller.marshal(hais,new FileOutputStream("sample.xml"));

        Unmarshaller unmarshaller=context.createUnmarshaller();
        Hais hais= (Hais) unmarshaller.unmarshal(new File("sample.xml"));
        System.out.println(hais.getMany());
    }
}
