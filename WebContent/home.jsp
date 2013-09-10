<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<input type="button" value="Enable page updates" onclick="addAttributeToScriptSession();"/>
<input type="button" value="Disable page updates" onclick="removeAttributeToScriptSession();"/>
  <table>
    <thead>
      <th>Id</th>
      <th>Name</th>
      <th>Address</th>
      <th>Age</th>
      <th>Is Superhero?</th>
    </thead>
    <tbody id="peopleTable"></tbody>
  </table>
</body>
</html>