<html>
<head>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.3/jquery.min.js"></script>
    <script>
        $(document).ready(()=>{
            $("table").click(()=>{
                $.get("list",(returns)=>{
                    alert(returns);
                    // alert($(returns).find("data").html())
                    // $("table").html($(returns).find("data").html());
                })
            })
        })
    </script>
</head>
<body>
<h2>Hello World!</h2>
<%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core" %>
<data>
<table>
    <thead>
<%--        <tr><th>ID</th><th>Name</th><th>Price</th></tr>--%>
    <tr><th>Data</th></tr>
    </thead>
    <tbody>
        <core:forEach var="each" items="${data}">
            <tr>
<%--                <td>${data.id}</td><td>${data.name}</td><td>${data.price}</td>--%>
                <td>${each}</td>
            </tr>
        </core:forEach>
    </tbody>
</table>
</data>
</body>
</html>
