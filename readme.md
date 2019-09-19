
#### 生成依赖

~~~ shell
mvn dependency:copy-dependencies -DoutputDirectory=lib 
~~~

#### 编写启动脚本
~~~ shell
java -cp .;printpdf-1.0-SNAPSHOT.jar;lib/commons-logging-1.2.jar;lib/fontbox-2.0.6.jar;lib/pdfbox-2.0.6.jar com.liqwer.Main

pause
~~~

  打印出来是中文乱码， 不好用