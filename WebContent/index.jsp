<%-- 
    Document   : index
    Created on : 06.04.2008, 15:39:59
    Author     : Siegfried Bolz
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>DWR</title>

<%-- This files are created in the runtime --%>
<script type='text/javascript' src='/StarDapioREST/dwr/engine.js'></script>
<script type='text/javascript'
	src='/StarDapioREST/dwr/interface/DWRBean.js'></script>
<script type='text/javascript' src='/StarDapioREST/dwr/engine.js'></script>

</head>

<body>
	<!--  onload="dwr.engine.setActiveReverseAjax(true);"> -->
	<h1>Ha</h1>
	<p>Test</p>
	<button
		onclick="DWRBean.getData({callback:function(str){alert(str)}})">Button</button>
</body>
</html>