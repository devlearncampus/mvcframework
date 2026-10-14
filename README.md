[  공지  ] 

1.JNDI 연결 문제 관련
[ 문제 원인 ]
 - 현재 JNDI 연결에서 에러가 발생하고 있어 확인해보니, 우리가 새롭게 이클립스 STS 로 교체하였기 때문에, Server를 복사해오는 과정에서
   JNDI가 설정되어있지 않은 Tomcat 을 STS로 가져와서 쓰고 있었기 때문임.
   
[ 해결책 ]
  따라서 아래의 두가지 방법 중 한가지를 사용하면 됨 
  1) 현재 STS 에 Server를 등록할때 JNDI 가 이미 설정된 Tomcat 원본으로부터 가져오면 됨
  2) 만일 이게 귀찮고 번거롭다면, JNDI를 사용하지 않고 mybatis-config.xml 에서 Mybatis 자체적인 POOL 을 이용하면 됨( 이와 관련된 소스는 이미 이 Git소스에 올려져 있음)
     이 방법을 이용할 경우 STS 의 server.xml, context.xml 의 JNDI 관련 설정은 모두 지우기 바람

     
