package com.sniper.ssm;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/CheckBox")
public class CheckBox extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public CheckBox() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		
		String title = "Check Box";
		String docType = "<!DOCTYPE html> \n";
		PrintWriter out = response.getWriter();
		out.println(docType +
	            "<html>\n" +
	            "<head><title>" + title + "</title></head>\n" +
	            "<body bgcolor=\"#f0f0f0\">\n" +
	            "<h1 align=\"center\">" + title + "</h1>\n" +
	            "<ul>\n" +
	            "  <li><b>Baidu</b>: "
	            + request.getParameter("baidu") + "\n" +
	            "  <li><b>Google </b>: "
	            + request.getParameter("google") + "\n" +
	            "  <li><b>Taobao </b>: "
	            + request.getParameter("taobao") + "\n" +
	            "</ul>\n" +
	            "</body></html>");
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("POST request received");
		doGet(request, response);
	}

}
