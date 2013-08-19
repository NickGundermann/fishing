package db;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import definition.Gewaesser;

public class DAOGewaesser {
	
	private static SessionFactory sessionFactory = null;
	
	public static List<Gewaesser> getAllGewaesser(){
		return null;
	}
	
	public static void insertGewaesser(Gewaesser gewaesser){
		Session session = null;
        try 
         {
                try
                {
                        sessionFactory = DataFactory.getSessionFactory();
                        session = sessionFactory.openSession();
                        DTOGewaesser gewaesserEntry = new DTOGewaesser();
                        System.out.println("Inserting Record");
                        Transaction tx = session.beginTransaction();
                        gewaesserEntry.setBezeichnung(gewaesser.getBezeichnung());
                        gewaesserEntry.setGroesse(gewaesser.getGroesse().getBetarg());
                        gewaesserEntry.setLage(gewaesser.getLage().toString());
                        session.save(gewaesserEntry);
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
