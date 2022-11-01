package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("==== TESTE 1: seller findById ====");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);

        System.out.println("\n==== TESTE 2: seller findByIdDepartment ====");
        List<Seller> list = sellerDao.findByDepartment(new Department(2, null));

        for(Seller obj : list){
            System.out.println(obj);
        }

    }
}