<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.ch.mvcframework.movie.model.MovieManager" %>
<%! MovieManager manager = new MovieManager();%>
<%
	//클라이언트가 전송한 파라미터를 받아 영화에 대한 피드백 메시지 만들기
	request.setCharacterEncoding("utf-8");//파라미터에 대한 인코딩 
	String movie=request.getParameter("movie");
	out.print(movie);

	String msg=manager.getAdvice(movie);
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
	function request(){
		document.querySelector("form").action="/movie/model1/form.jsp";
		document.querySelector("form").method="post";
		document.querySelector("form").submit();
	}
	
	addEventListener("load", function(){
		document.querySelector("button").addEventListener("click", ()=>{
			request();
		});
	});
</script>
</head>
<body>
	
	<form>
		<select name="movie">
			<option value="귀멸의칼날">귀멸의칼날</option>
			<option value="미션임파서블">미션임파서블</option>
			<option value="에이리언">에이리언</option>
			<option value="주토피아">주토피아</option>			
		</select>	
		<button type="button">피드백 요청</button>
	</form>
	
	<!-- 
			이 프로그램에 대해 유지보수성을 고려할 필요가 없을 정도로 간단한 기능으로 판단된다면
			굳이 유지보수성을 염두해 둔 java클래스까지 도입할 필요가 없다
			따라서 스크립트만으로 해결해보자 - 이러한 개발 방식을 가리켜 이름조차 없는 막개발 방식이라 함...스크립트 위주의 개발방식 
			아주 간단한 분야에 유용함 
	 -->
	<h3>
		선택한 결과 <br>
		<span style="color:red">
			<%=msg%>
		</span>
	</h3>	
	
</body>
</html>








