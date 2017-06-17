# spring-boot-demo<br>
spring-boot 整合 包含spring、mybits、springMvc
官方例子: http://projects.spring.io/spring-boot/
该项目使用maven管理依赖包

1、发布到服务器时需要增加如下依赖
 <!--以下为发布到tomcat服务器时需要增加包-->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-tomcat</artifactId>
        <scope>provided</scope>
    </dependency>
和
<!---->
    <packaging>war</packaging>

2、如果需要jdbc 依赖 则加入
<!---->
	<dependency>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-jdbc</artifactId>
		<version>1.5.2.RELEASE</version>
	</dependency>
	
3、如果需要mybatis 依赖 则加入
<!---->
        <dependency>
            <groupId>org.mybatis.spring.boot</groupId>
            <artifactId>mybatis-spring-boot-starter</artifactId>
            <version>1.3.0</version>
        </dependency>
2||3、mysql 依赖
<!---->
		<dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>5.1.30</version>
        </dependency>
		
4、spring boot 单元测试 则加入
<!---->
		<dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-test</artifactId>
            <scope>test</scope>
        </dependency>
		<dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <scope>test</scope>
        </dependency>