package com.testserver.web1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestServieWeb1 extends HttpServlet{

	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println("doDelete����������");
		super.doDelete(req, resp);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		System.out.println("doGet()����������");
		
		PrintWriter pw = resp.getWriter();
		pw.println("<h1>hello world!!!!</h1>");
		pw.close();
	}

	@Override
	public void destroy() {
	
		System.out.println("destroy()����������");
		super.destroy();
	}

	@Override
	public void init() throws ServletException {
		System.out.println("init()����������");
		super.init();
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		System.out.println("doPost()����������");
		
			PrintWriter pw = resp.getWriter();
			pw.println("hello doPost");
			pw.close();
	}

}
