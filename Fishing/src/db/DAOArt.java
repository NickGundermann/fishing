package db;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import definition.Koederart;

public class DAOArt {
	
	private static SessionFactory sessionFactory = null;
	
	public static List<Koederart> getAllArten(){
		return null;
	}
	
	public static void insertArt(Koederart art){
		Session session = null;
        try 
         {
                try
                {
                        sessionFactory = DataFactory.getSessionFactory();
                        session = sessionFactory.openSession();
                        DTOArt artEntry = new DTOArt();
                        System.out.println("Inserting Record");
                        Transaction tx = session.beginTransaction();
                        artEntry.setBezeichnung(art.getBezeichnung());
                        session.save(artEntry);
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
