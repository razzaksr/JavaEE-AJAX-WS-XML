package service;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public class DAO {
    private String[] hai={"Flipkat","Amazon","Gpay","facebook","microsoft","youtube","ibm"};

    @WebMethod
    public String[] access(){
        return hai;
    }

    @WebMethod
    public String getOne(int index){
        if(index<hai.length&&index>=0) {
            return hai[index]+" has data";
        }
        else
            return index+" hasn't data";
    }

    @WebMethod
    public String add(int index, String data){
        if(index<hai.length&&index>=0) {
            hai[index] = data;
            return data+" has added";
        }
        else
            return data+" hasn't added";
    }
}
