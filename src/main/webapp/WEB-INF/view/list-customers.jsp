<%--
  Created by IntelliJ IDEA.
  User: vansh
  Date: 26-07-2021
  Time: 09:56 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Customer</title>
    <link type="text/css"
          rel="stylesheet"
          href="${pageContext.request.contextPath}/resources/css/style.css" />
</head>
<body>
        <div id="wrapper">
            <div id="header">
                <h2>CRM - Customer Relationship Manager</h2>
            </div>
        </div>
        <div id="container">
            <div id="content">

                <table>
                    <tr>
                        <th>First Name</th>
                        <th>Last Name</th>
                        <th>Email</th>
                    </tr>

                    <c:forEach var="currentCustomer" items="${customers}">
                        <tr>
                            <td> ${currentCustomer.firstName} </td>
                            <td> ${currentCustomer.lastName} </td>
                            <td> ${currentCustomer.email} </td>
                        </tr>
                     </c:forEach>

                </table>

            </div>

        </div>

</body>
</html>
