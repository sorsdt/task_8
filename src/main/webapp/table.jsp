<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="myTag" uri="myTagLib" %>
<jsp:useBean id="myBean" class="epam.webapp.model.MyBean"/>
<jsp:setProperty name="myBean" property="rows" value="${param.rows}"/>
<jsp:setProperty name="myBean" property="cols" value="${param.cols}"/>
<html>
<head>
    <title>${param.title}</title>
    <link rel="stylesheet" href="css/css.css">
</head>
<body class="bg_color">
<a href="index.jsp">Main</a><br><br>
<table title="${param.title} by Java Bean" bgcolor="${param.color}" border="1px">
    <c:forEach var="i" begin="1" end="${param.rows}" step="1">
        <tr>
            <c:forEach var="j" begin="1" end="${param.cols}" step="1">
                <td>${myBean.table[i-1][j-1]}</td>
            </c:forEach>
        </tr>
    </c:forEach>
</table>
<br>
<table title="${param.title} by Custom Tags" bgcolor="${param.color}" border="1px">
    <myTag:printAllRows cols="${param.cols}">
        <jsp:attribute name="rows">
            <%=request.getParameter("rows")%>
        </jsp:attribute>
    </myTag:printAllRows>
</table>
</body>
</html>