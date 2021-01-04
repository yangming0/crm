## springboot后台项目

### 1.框架搭建

#### 1.1技术选型

* 后台：Springboot + mybatis +mysql
* 前端：layui + thymeleaf
* 开发工具： jdk1.8 + IDEA + GIT + Maven

#### 1.2项目搭建

##### 1.2.1Spring initializr概述

Spring initializr是Spring官方提供的一个用来初始化一个Spring boot项目的工具。

在IDEA中，直接File->New->Project，在左侧就能看到Spring initializr，点击Next就可以选择组件。

##### 1.2.2创建springboot项目

* 用spring initializr创建项目
* 在application.properties添加配置
* 添加mybatis依赖
* 添加个控制器

##### 1.2.3使用git将代码上传到码云

* 添加码云的插件
* Create Token
* Share Project On Gitee
* 修改内容，提交测试

### 2.LayUI

#### 整合layui的后台管理页面

* 下载layui资源包

* 把https://www.layui.com/demo/layuiAdmin.html 的源码copy到index.html

* 导入layui资源

* 修改index.html的css/js的引用路径

  1. 声明页面支持thymeleaf模板引擎

     ```html
     <html xmlns:th="http://www.thymeleaf.org">
     ```

     

  2. 使用thymeleaf的方法去访问资源路径

     ```html
     th:href="@{a/b/c.css}"
     ```

* 修改静态资源不重启即时生效

  1. 修改pom.xml

     ```xml
     <dependency>
     	<groupId>org.springframework.boot</groupId>
       <artifactId>spring-boot-devtools</artifactId>
       <optional>true</optional>
     </dependency>
     ```

  2. 勾选build project automatically

  3. 关掉设置，使用快捷键，mac快捷键：shift+option+cmmand+ /    Windows快捷键：Shift+Ctrl+Alt+/，选择registry后，勾选compiler.automake.allow.when.app.running然后重启InteliJ IDEA 即可

  

  
