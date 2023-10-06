<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <table>
        <tr>
            <td>Entered Name:</td>
            <td><%= request.getParameter("user_name")%></td>
        </tr>
        <tr>
            <td>Entered Phone Number:</td>
            <td><%= request.getParameter("phone_number")%></td>
        </tr>
        <tr>
            <td>Address:</td>
            <td><%= request.getParameter("address")%></td>
        </tr>
    </table>
</body>
</html>
