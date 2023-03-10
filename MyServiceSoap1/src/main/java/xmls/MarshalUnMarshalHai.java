package xmls;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.FileNotFoundException;

public class MarshalUnMarshalHai {
    public static void main(String[] args) throws JAXBException, FileNotFoundException {
        JAXBContext context=JAXBContext.newInstance(Hai.class);
//        Marshaller marshaller=context.createMarshaller();
//        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
//        Hai h1=new Hai(12,"Boat",1200);
//        marshaller.marshal(h1,new FileOutputStream("simple.xml"));

        File file= new File("simple.xml");
        Unmarshaller unmarshaller=context.createUnmarshaller();
        Hai h= (Hai) unmarshaller.unmarshal(file);
        System.out.println(h);
    }
}
