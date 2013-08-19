package db;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import definition.Firma;

public class DAOFirma {
	
	private static SessionFactory sessionFactory = null;
	
	public static List<Firma> getAllFirmen(){
		return null;
	}
	
	public static void insertFirma(Firma firma){
		 Session session = null;
         try 
          {
                 try
                 {
                         sessionFactory = DataFactory.getSessionFactory();
                         session = sessionFactory.openSession();
                         DTOFirma firmaEntry = new DTOFirma();
                         System.out.println("Inserting Record");
                         Transaction tx = session.beginTransaction();
                         firmaEntry.setFirmenname(firma.getFirmenname());
                         session.save(firmaEntry);
                         tx.commit();
                         System.out.println("Done");
                 }
                 catch (Exception e)
                 {
                         System.out.println(e.getMessage());
                 }
            }
                 finally
                 {
                         session.close();
                 }
	}

}
