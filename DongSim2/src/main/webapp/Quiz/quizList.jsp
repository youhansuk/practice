<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>북 퀴즈</title>
</head>
<body>
		
		<div>
		<h2>퀴즈 리스트</h2>
		
		<table border="1">
			<thead>
				<tr>
					<th width="150" >퀴즈 번호</th>
			        <th width="70">책 번호</th>
			        <th width="70">학년</th>
			        <th width="700">문제</th>
			        <th width="300">답</th>
			        <th width="50">Y/N</th>
			   </tr>
			</thead>

			<tbody>
				<c:forEach var="dto" items="${list}">
					<tr>
						<td>${dto.getIdx()}</td>
						<td>${dto.getDx_book_idx()}</td>
						<td>${dto.getGradations()}</td>
						<td>${dto.getQuestion()}</td>
						<td>${dto.getAnswer()}</td>
						<td>${dto.getUse_yn()}<td>
					</tr>
				</c:forEach>
			</tbody>
   		</table>
   	</div>
   	
   	 
</body>
</html>