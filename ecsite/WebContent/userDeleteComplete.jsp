<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="Content-Style-Type" content="text/css">
<meta http-equiv="Content-Script-Type" content="text/javascript">
<meta http-equiv="imagetoolbar" content="no">
<meta name="description" content="">
<meta name="keywords" content="">
<title>UserDeleteComplete画面</title>

<link rel="stylesheet" type="text/css" href="./css/style.css">

</head>
<body>

	<!-- ヘッダー -->
	<jsp:include page="header.jsp"/>

	<!-- メイン -->
	<div id="main">

		<!-- トップ -->
		<div id="top">
			<p>UserDeleteComplete</p>
		</div>

		<!-- コンテンツ -->
		<div id="contents">
			<h3>退会しました。</h3>
			<s:form action="GoHomeAction">
				<s:submit value="Homeへ"/>
			</s:form>
		</div>

	</div>

	<!-- フッター -->
	<jsp:include page="footer.jsp"/>

</body>
</html>