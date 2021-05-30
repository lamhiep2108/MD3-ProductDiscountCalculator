<%--
  Created by IntelliJ IDEA.
  User: lamhiep
  Date: 5/30/2021
  Time: 6:14 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<h2>Product Discount Calculator</h2>
<form method="post" action="${pageContext.request.contextPath}/ProductDiscountCalculator">

    <label>
        <h2>Product Description: </h2>
        <input type="text" name="ProductDescription" placeholder="enter Product Description">
        <h2>List Price: </h2>
        <input type="text" name="ListPrice" placeholder="enter List Price">
        <h2>List Price</h2>
        <input type="text" name="DiscountPercent" placeholder="enter Discount Percent">
    </label>
    <br>
    <br>
    <input type="submit" id="Calculate
    Discount" value="Calculate Discount">
</form>
</body>
</html>
