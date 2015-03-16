package br.com.arqdsis.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Protocolo
 */
@WebServlet("/protocolo")
public class Protocolo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	// Method to handle GET method request.
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Set response content type
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String title = "Exemplo de HTTP Header Request";
		String docType = "<!doctype html public \"-//w3c//dtd html 4.0 "
				+ "transitional//en\">\n";
		out.println(docType + "<html>\n" + "<head><title>" + title
				+ "</title></head>\n" + "<body bgcolor=\"#f0f0f0\">\n"
				+ "<h1 align=\"center\">" + title + "</h1>\n"
				+ "<table width=\"100%\" border=\"1\" align=\"center\">\n"
				+ "<tr bgcolor=\"#949494\">\n"
				+ "<th>Header Name</th><th>Header Value(s)</th>\n" + "</tr>\n");
		Enumeration headerNames = request.getHeaderNames();
		while (headerNames.hasMoreElements()) {
			String paramName = (String) headerNames.nextElement();
			out.print("<tr><td>" + paramName + "</td>\n");
			String paramValue = request.getHeader(paramName);
			out.println("<td> " + paramValue + "</td></tr>\n");
		}
		out.println(docType + "<br><br>\n"
				+ "<table width=\"100%\" border=\"1\" align=\"center\">\n"
				+ "<tr bgcolor=\"#949494\">\n"
				+ "<th>Parameter Name</th><th>Parameter Value(s)</th>\n"
				+ "</tr>\n");
		Enumeration parameterNames = request.getParameterNames();
		while (parameterNames.hasMoreElements()) {
			String paramName = (String) parameterNames.nextElement();
			out.print("<tr><td>" + paramName + "</td>\n");
			String paramValue = request.getParameter(paramName);
			out.println("<td> " + paramValue + "</td></tr>\n");
		}
		out.println("</table>\n</body></html>");
	}

	// Method to handle POST method request.
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}