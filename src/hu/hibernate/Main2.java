package hu.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

import java.util.ArrayList;
import java.util.List;

public class Main2 {
    private static SessionFactory factory;
    public static void main(String[] args) {
        try {
            factory = new Configuration().configure().buildSessionFactory();
        } catch (Throwable ex) {
            System.err.println("Failed to create sessionFactory object." + ex);
            throw new ExceptionInInitializerError(ex);
        }
        Session session = factory.openSession();
        Transaction t = session.beginTransaction();

        session.createSQLQuery("insert into PRODUCT(naam, prijs) VALUES ('zalm',100)");
        session.delete(new product("zalm",100));
        //var query=  session.createSQLQuery("select * from PRODUCT");
        List objects= session.createNativeQuery("select * from PRODUCT",product.class).getResultList();
        ArrayList<product> products=new ArrayList<product>();
        for (Object object : objects) {
            products.add((product) object);

        }
        session.update("zalm",new product("zalm",140));



        factory.close();
        session.close();

    }
}
