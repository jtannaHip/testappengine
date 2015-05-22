package com.test.browse.web;

import java.io.PrintWriter;
import java.util.logging.Level;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;

public class HelloWorld extends HttpServlet {

	@Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) {
		resp.setContentType("application/json");
		resp.setCharacterEncoding("UTF-8");
		final JSONObject respobj = new JSONObject();
		
		PrintWriter pw = null;
		
		try {
			pw = resp.getWriter();
			respobj.put("msg", "hello world !!");
	        pw.print(respobj.toString(2));			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (null != pw) {
				pw.flush();
			}
		}	
	}
	
}
