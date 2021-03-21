
- maven的加载顺序：
短路径优先
如果路径一样长，先声明的优先

- 各个模块不统一slf4j标准，输出如下：按照各自的标准输出
~~~
 2021-03-20 18:25:52 [INFO] com.zk.Testlog4j2: log4j2 test
 [INFO ] 2021-03-20 18:25:52,830 method:com.zk.test.Log4jTest.main(Log4jTest.java:15)lbw
 2021-03-20 18:25:52 [DEBUG] com.zk.LogbackTest: logback test
~~~
可以在当前项目分别创建log4j log4j2 logback日志配置文件，那么这三个包会按照当前项目的日志配置文件打印日志


- slf4j绑定了多个日志框架(slf4,slf4j2,logback),slf4j会随机绑定一个日志框架         
~~~
SLF4J: Class path contains multiple SLF4J bindings.
SLF4J: Found binding in [jar:file:/D:/Program%20Files/apache-maven-3.5.4/repository/org/slf4j/slf4j-log4j12/1.7.29/slf4j-log4j12-1.7.29.jar!/org/slf4j/impl/StaticLoggerBinder.class]
SLF4J: Found binding in [jar:file:/D:/Program%20Files/apache-maven-3.5.4/repository/org/apache/logging/log4j/log4j-slf4j-impl/2.9.0/log4j-slf4j-impl-2.9.0.jar!/org/slf4j/impl/StaticLoggerBinder.class]
SLF4J: Found binding in [jar:file:/D:/Program%20Files/apache-maven-3.5.4/repository/ch/qos/logback/logback-classic/1.2.3/logback-classic-1.2.3.jar!/org/slf4j/impl/StaticLoggerBinder.class]
SLF4J: See http://www.slf4j.org/codes.html#multiple_bindings for an explanation.
SLF4J: Actual binding is of type [org.slf4j.impl.Log4jLoggerFactory]

[INFO ] 2021-03-20 18:33:47,520 method:com.zk.Testlog4j2.main(Testlog4j2.java:15)log4j2 test
[INFO ] 2021-03-20 18:33:47,523 method:com.zk.test.Log4jTest.main(Log4jTest.java:15)lbw
[DEBUG] 2021-03-20 18:33:47,524 method:com.zk.LogbackTest.main(LogbackTest.java:11)logback test

~~~
问题：如何指定日志实现库
方法1：exclude掉各个模块依赖的slf4
方法2：添加一个slf4不存在的版本/slf4j2不存在的版本

- 如果有的jar包实现了slf4j标准有的没有实现
