package xmls;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlRootElement;

@Data
@AllArgsConstructor
@NoArgsConstructor
//@XmlRootElement
public class Hai {
    private int id;
    private String name;
    private int price;
}
