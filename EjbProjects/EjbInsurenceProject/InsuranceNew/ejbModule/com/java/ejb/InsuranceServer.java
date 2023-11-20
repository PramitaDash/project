package com.java.ejb;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class InsuranceServer
 */
@Stateless
@LocalBean
public class InsuranceServer implements InsuranceServerRemote {

    /**
     * Default constructor. 
     */
    public InsuranceServer() {
        // TODO Auto-generated constructor stub
    }

}
