<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page
	import=" java.io.IOException, 
 java.io.PrintWriter, java.util.Enumeration,
  javax.servlet.ServletException,
  javax.servlet.annotation.WebServlet,
javax.servlet.http.HttpServlet,
 javax.servlet.http.HttpServletRequest,
javax.servlet.http.HttpServletResponse"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Exemplo de HTTP Header Request</title>
</head>

<body bgcolor=\"#f0f0f0\">
	<h1 align=\"center\">Exemplo de HTTP Header Request</h1>
	<table width=\ "100%\" border=\ "1\" align=\"center\">
		<tr bgcolor=\"#949494\">
			<th>Header Name</th>
			<th>Header Value(s)</th>
		</tr>

		<%
			Enumeration headerNames = request.getHeaderNames();
			while (headerNames.hasMoreElements()) {
				String paramName = (String) headerNames.nextElement();
				out.print("<tr><td>" + paramName + "</td>\n");
				String paramValue = request.getHeader(paramName);
				out.println("<td> " + paramValue + "</td></tr>\n");
			}
		%>

		<br />
		<br />
		<table width=\ "100%\" border=\ "1\" align=\"center\">
			<tr bgcolor=\"#949494\">
				<th>Parameter Name</th>
				<th>Parameter Value(s)</th>
			</tr>
			<%
				Enumeration parameterNames = request.getParameterNames();
				while (parameterNames.hasMoreElements()) {
					String paramName = (String) parameterNames.nextElement();
					out.print("<tr><td>" + paramName + "</td>\n");
					String paramValue = request.getParameter(paramName);
					out.println("<td> " + paramValue + "</td></tr>\n");
				}
			%>
		</table>
</body>
</html>