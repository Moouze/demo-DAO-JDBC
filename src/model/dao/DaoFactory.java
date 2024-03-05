package model.dao;

import model.dao.impl.SellerDaoJDBC;
import model.entites.Seller;

public class DaoFactory {

    public static SellerDao createSellerDao(){
        return new SellerDaoJDBC();
    }
}
