<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
    <head>
        <title>Listado Personas</title>
    </head>
    <body>

        <h1>Listado de Personas</h1>

        <table border="1">
            <tr>
                <th>Nombre</th>
                <th>Apellido Paterno</th>
                <th>Email</th>
            </tr>

            <c:forEach var="persona" items="${personas}">
                <tr>
                    <td>${persona.nombre}</td>
                    <td>${persona.apellidoPaterno}</td>
                    <td>${persona.email}</td>
                </tr>
            </c:forEach>
        </table>
        <br>
        <a href="index.jsp">Regresar al Inicio</a>
    </body>
</html>