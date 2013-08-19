package db;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import definition.Fischart;


public class DAOFischart {

	private static SessionFactory sessionFactory = null;
	
	public static List<Fischart> getAllFischarten(){
		return null;
	}
	
	public static void insertFischart(Fischart fischart){
		Session session = null;
        try 
         {
                try
                {
                        sessionFactory = DataFactory.getSessionFactory();
                        session = sessionFactory.openSession();
                        DTOFischart fischartEntry = new DTOFischart();
                        System.out.println("Inserting Record");
                        Transaction tx = session.beginTransaction();
                        fischartEntry.setBezeichnung(fischart.getBezeichnung());
                        session.save(fischartEntry);
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
