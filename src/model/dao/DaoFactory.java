package model.dao;

import db.DB;
import model.dao.impl.SellerDaoJDBC;
import model.entites.Seller;

public class DaoFactory {

    public static SellerDao createSellerDao(){
        return new SellerDaoJDBC(DB.getConnection());
    }
}
