package com.test.browse.web;

import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class HelloWorld extends HttpServlet {

	private static final Logger logger = Logger.getLogger(HelloWorld.class.getName());
	
	@Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) {
		resp.setContentType("application/json");
		resp.setCharacterEncoding("UTF-8");
		
		PrintWriter pw = null;
		
		/*try {
			pw = resp.getWriter();
			respobj.put("msg", "hello world !!");
	        pw.print(respobj.toString(2));			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (null != pw) {
				pw.flush();
			}
		}*/
		
		
		try {
			pw = resp.getWriter();
			pw.print("{'msg':'hello world !!'}");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (null != pw) {
				pw.flush();
			}
		}
		
		logger.info("Hello World !!");
		
		
		int i = 1;
		int j = i;
	}
	
}
