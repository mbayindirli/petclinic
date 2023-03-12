<%--
  Created by IntelliJ IDEA.
  User: fmss
  Date: 12.03.2023
  Time: 20:18
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <c:forEach items="${owners}" var="owner">
        <thead>
        <tr>
           <td>
               id
           </td>
            <td>
                ad
            </td>
            <td>
                soyad
            </td>
        </tr>
        </thead>
        <tr><td>
                ${owner.id}
        </td>
            <td>
                    ${owner.firstName}
            </td>
            <td>
                    ${owner.lastName}
            </td>
        </tr>

    </c:forEach>
</table>
</body>
</html>
