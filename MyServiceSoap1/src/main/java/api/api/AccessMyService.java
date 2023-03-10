package api.api;

import api.DAO;
import api.DAOService;

public class AccessMyService {
    public static void main(String[] args) {
        DAOService service=new DAOService();
        DAO dao=service.getDAOPort();
        System.out.println(dao.getOne(2));
    }
}
