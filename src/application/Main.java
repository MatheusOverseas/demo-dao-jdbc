package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        SellerDao sellerDao = DaoFactory.createSellerDao();
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
//
//        System.out.println("==== TESTE 1: seller findById ====");
//        Seller seller = sellerDao.findById(3);
//        System.out.println(seller);
//
//        System.out.println("\n==== TESTE 2: seller findByIdDepartment ====");
//        List<Seller> list = sellerDao.findByDepartment(new Department(2, null));
//
//        for(Seller obj : list){
//            System.out.println(obj);
//        }
//
//        System.out.println("\n==== TESTE 3: seller findAll ====");
//        list = sellerDao.findAll();
//
//        for(Seller obj : list){
//            System.out.println(obj);
//        }
//
//        System.out.println("\n==== TESTE 4: seller Insert ====");
//        // Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.00, new Department(2, null));
//
//        //sellerDao.insert(newSeller);
//
//        //System.out.println("Inserted! New id = " + newSeller.getId());
//
////        System.out.println("\n==== TESTE 5: seller Update ====");
////        seller = sellerDao.findById(1);
////        seller.setName("Martha Waine");
////
////        sellerDao.update(seller);
////        System.out.println("Updated Completed");
////
////        System.out.println("\n==== TESTE 6: seller Delete ====");
////        System.out.println("Enter id for delete test: ");
////        int id = sc.nextInt();
////
////        sellerDao.deleteById(id);
////
////        System.out.println("Delete completed!");

        System.out.println("==== TEST 7: department insert");
        Department dep = new Department(null, "Clothes");

        departmentDao.insert(dep);

        System.out.println("Insert completed!");

        System.out.println("==== TEST 8: Department update");
        dep = departmentDao.findById(5);
        dep.setName("Games");

        departmentDao.update(dep);
    }
}