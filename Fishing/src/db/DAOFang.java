package db;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Property;

import com.sfcontroll.business.Entry;
import com.sfcontroll.db.DTOCostsEntry;
import com.sfcontroll.db.DataFactory;
import com.sfcontrolling.gui.MainGuiLoader;

import definition.Fang;

public class DAOFang {

	  private static SessionFactory sessionFactory = null;
      public static List<DTOCostsEntry> getEntry(){
      	Session session = null;
      	sessionFactory = DataFactory.getSessionFactory();
      	session = sessionFactory.openSession();
      	
      	Criteria criteria = session.createCriteria(DTOCostsEntry.class)
      	                            .createCriteria("status")
      	                                .createCriteria("statusType")
      	                                    .add(Property.forName("id").eq(3));
      	List<DTOCostsEntry> costListe = criteria.list();
      	
      	return costListe;
      }
      
      public static void insertEntry(Entry newEntry)
      {               
              Session session = null;
              try 
               {
                      try
                      {
                              sessionFactory = DataFactory.getSessionFactory();
                              session = sessionFactory.openSession();
                              DTOCostsEntry costEntry = new DTOCostsEntry();
                              System.out.println("Inserting Record");
                              Transaction tx = session.beginTransaction();
                              costEntry.setName(newEntry.getName());
                              costEntry.setCategory(MainGuiLoader.categoryContainer.get(newEntry.getCategory()));
                              costEntry.setDate(newEntry.getDate());
                              session.save(costEntry);
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
	
	public static List<Fang> getAllFang(){
		return null;
	}
	
	public static void insertFang(Fang fang){
		
	}
	
}
