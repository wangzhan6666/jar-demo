/*
* 目的：springboot程序打jar包与运行
* 步骤：①双击Maven Lifecycle install 生成jar文件(PS:文件路径：C:\Users\黑火8\.m2\repository\com\wangzhan\springboot\jar-demo\1.0.0\jar-demo-1.0.0.jar
*                                                      或：D:\IDEA\save_date\jar-demo\target\jar-demo-1.0.0.jar)
*      ②打开cmd，进入该jar文件的目录下，使用  java -jar 文件名  的方式启动jar文件,例如：C:\Users\黑火8\.m2\repository\com\wangzhan\springboot\jar-demo\1.0.0>java -jar jar-demo-1.0.0.jar
* 
* 注意事项：一定要在pom.xml文件中的springboot提供的项目编译打包插件中指定版本(版本号不要改变,就是这个1.4.2.RELEASE)：<version>1.4.2.RELEASE</version>
*
* */
