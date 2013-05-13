package db;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Property;
import definition.Fang;

public class DAOFang {

	private static SessionFactory sessionFactory = null;
      
	public static List<DTOFang> getAllFaenge(){
		Session session = null;
      	sessionFactory = DataFactory.getSessionFactory();
      	session = sessionFactory.openSession();
      	
      	Criteria criteria = session.createCriteria(DTOFang.class)
      	                            .createCriteria("status")
      	                                .createCriteria("statusType")
      	                                    .add(Property.forName("id").eq(3));
      	List<DTOFang> costListe = criteria.list();
      	
      	return costListe;
	}
	
	public static void insertFang(Fang fang){
		 Session session = null;
         try 
          {
                 try
                 {
                         sessionFactory = DataFactory.getSessionFactory();
                         session = sessionFactory.openSession();
                         DTOFang fangEntry = new DTOFang();
                         System.out.println("Inserting Record");
                         Transaction tx = session.beginTransaction();
                         fangEntry.setArt(fang.getFischart().getBezeichnung());
                         fangEntry.setDate(fang.getDate().toString());
                         fangEntry.setGroesse(fang.getGroesse().getBetarg());
                         fangEntry.setKoeder(fang.getKoeder().getBezeichnung());
                         fangEntry.setTime(fang.getTime().toString());
                         session.save(fangEntry);
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
