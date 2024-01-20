<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<style>
    table {
        font-family: arial, sans-serif;
        border-collapse: collapse;
        width: 100%;
    }

    td, th {
        border: 1px solid #dddddd;
        text-align: left;
        padding: 8px;
    }

    tr:nth-child(even) {
        background-color: #dddddd;
    }
</style>
<head>
</head>
<body>
${skillList}
<h3>Lista de Transações:</h3>
<ul>
    <table>
        <tr>
            <th>Account</th>
            <th>Description</th>
            <th>Transaction Amount</th>
            <th>Transaction Type</th>
        </tr>
        <c:forEach var="transaction" items="${transactionList}">
            <tr>
                <td>${transaction.accountId}</td>
                <td>${transaction.description}</td>
                <td>${transaction.transactionAmount}</td>
                <td>${transaction.transactionType}</td>
            </tr>
        </c:forEach>
    </table>
    <br/><br/>
    <p>O total equivalente de transaçãções foi: ${amountTransferred}</p>
</ul>
</body>
</html>