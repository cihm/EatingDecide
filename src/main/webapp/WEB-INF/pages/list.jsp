<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<body>
	<h2>Spring MVC and List Example</h2>
 
	<c:if test="${not empty lists}">
 
		<ul>
			<c:forEach var="listValue2" items="${lists}">
				<li>${listValue2}</li>
			</c:forEach>
		</ul>
 
	</c:if>
</body>
</html>