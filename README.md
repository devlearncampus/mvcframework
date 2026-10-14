[  공지  ] 

1.JNDI 연결 문제 관련
[ 문제 원인 ]
 - 현재 JNDI 연결에서 에러가 발생하고 있어 확인해보니, 우리가 새롭게 이클립스 STS 로 교체하였기 때문에, Server를 복사해오는 과정에서
   JNDI가 설정되어있지 않은 Tomcat 을 STS로 가져와서 쓰고 있었기 때문임.
   
[ 해결책 ]
  따라서 아래의 두가지 방법 중 한가지를 사용하면 됨 
  방법1) 현재 STS 에 Tomcat Server 의 원본을 등록할때, 원본 Tomcat은 다음의 사항이 준비되어 있어야 함 
         - server.xml, context.xml 에 JNDI 설정되어 있을 것 
         - tomcat/lib 에 mysql 드라이버 jar 파일을 복사해놓았을 것
  
  방법2) 만일 방법1 이 귀찮고 번거롭다면, JNDI를 아예 사용하지 않고 mybatis-config.xml 에서 Mybatis 자체적인 POOL 을 이용하면 됨( 이와 관련된 소스는 이미 이 Git소스에 올려져 있음)
         이 방법을 이용할 경우 다음의 사항을 준수할것 
         - STS 의 server.xml, context.xml 의 JNDI 관련 설정은 모두 지우기 바람
         - mybatis-config.xml 의 내용중 데이터베이스 접속 정보를, 현재 github 에 올려진 설정 정보대로 작성할 것

    
