package com.telusko.DemoHib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Alien telusko = new Alien();
        telusko.setAid(101);
        telusko.setAname("Navin");
        telusko.setColor("Green");
        
        Configuration con = new Configuration();
        
        SessionFactory sf = con.buildSessionFactory();
        
        Session session = sf.openSession();
        session.save(telusko);
    }
}
