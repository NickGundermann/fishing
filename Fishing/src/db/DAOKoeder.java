package db;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import definition.Koeder;

public class DAOKoeder {
	
	private static SessionFactory sessionFactory = null;
	
	public static List<Koeder> getAllKoeder(){
		return null;
	}
	
	public static void insertKoeder(Koeder koeder){
		Session session = null;
        try 
         {
                try
                {
                        sessionFactory = DataFactory.getSessionFactory();
                        session = sessionFactory.openSession();
                        DTOKoeder koederEntry = new DTOKoeder();
                        System.out.println("Inserting Record");
                        Transaction tx = session.beginTransaction();
                        koederEntry.setBezeichnung(koeder.getBezeichnung());
                        koederEntry.setArtId(koeder.getArt().getBezeichnung());
                        koederEntry.setFirmenId(koeder.getFirma().getFirmenname());
                        koederEntry.setGewicht(koeder.getGewicht().getBetrag());
                        koederEntry.setGroesse(koeder.getGroesse().getBetarg());
                        session.save(koederEntry);
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
