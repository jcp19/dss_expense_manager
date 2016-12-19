/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dss.g22;

import dss.g22.business.Facade;
import dss.g22.presentation.Login;

/**
 *
 * @author joao
 */
public class ExpenseManagerApp {
    
    public static void main(String[] args) {
        Facade f = new Facade();
        Login l = new Login(f);
        
        l.setVisible(true);
    }
}
