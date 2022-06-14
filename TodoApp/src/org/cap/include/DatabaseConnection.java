package org.cap.include;

import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DatabaseConnection {

    public static SessionFactory sf = null;
    public static Session ses = null;

    private DatabaseConnection() {
        try {
            sf = new Configuration().configure().buildSessionFactory();
            ses = sf.openSession();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex, "Database connection", JOptionPane.ERROR_MESSAGE);
        }
    }
    public static Session getDatabaseSession()
    {
        if(ses==null)
        {
            new DatabaseConnection();
        }
        return ses;
    }

}
