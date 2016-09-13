package com.netease;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.netease.Kitchen;

public class NoodlesServlet extends HttpServlet {

	static public Logger log;
	
	static private void InitLog() {
        try {
        	
            log = Logger.getLogger(NoodlesServlet.class.getName());
            PropertyConfigurator.configure("log4j.properties");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
	
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    	NoodlesServlet.InitLog();
        PrintWriter writer = response.getWriter();
        String vegetable = request.getParameter("vegetable");
        if (vegetable == null) {
            vegetable = "Tomato";
        }		
        
        
        writer.println(Kitchen.makeNoodles(vegetable));
        log.info(vegetable);
        
    }
}
