/*
package lk.ijse.hibernate;

*/
/*
    @author THINUX
    @created 04-Mar-23
*//*


import lk.ijse.hibernate.entity.Customer1;
import lk.ijse.hibernate.util.SessionFactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class RemovedState {
    public static void main(String[] args) {
        Session session = SessionFactoryConfiguration.getInstance().getSession();

        Transaction transaction = session.beginTransaction();

        Customer1 customer = session.get(Customer1.class, 1L); // Persistence State

        session.delete(customer); // Removed State

        transaction.commit();
        session.close();
    }
}
*/
