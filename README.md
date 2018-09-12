# Creating-your-own-webservices-and-consuming-it
Create your own web-service which returns resource in JSON format and consume it where you want.
So lets start with what are webservices and later than how to consume them, and then, how to create your own web services.
<br>
<h2> Web-Services</h2>
A Web-service is a piece of software  thet makes it available over the Internet in the form a standardised format like JSON, XML, etc.<br>

There are severa webservice over the internet which can be consumed in several projects. They return the data in any of the standard format and you just have to parse them into your own software.<br>

<h2> Consuming a web service</h2>
Consuming a web service means using the data returned by the webservice in your software. consuming the webservice depends on the type of the  data it returns, eg. if a web-service returns data in the form of JSON, then you have to apply JSON parsing.,br>
There are several libraries for parsing wach of the data return type.
<h2> How to create a Web-service</h2>
For creating your own web-service, fllow the below mentioned steps:-<br>
1.  Get a hosting plan(free or paid).<br>
2.  Create a database in the CPanel of your website.<br>
3.  Create scripts for operation like insert, update, select nd delete from your database (I have used PHP for this).<br>
4.  Deploy this PHP file on your website and copy paste the link of each script at the required place in your project.(In the URL class object in Java).<br>
5.  Now simply use the parsing classes to parse this data returned in the form of JSON/XML, etc.<br>

<h2> Files and functioning</h2>
<h3>1.a.  <u><b>JAVA files:-</b></u><br></h3>
1. <b>MainActivity.java</b> :- It contains 2 buttons which help the application to view or save data in the database.<br>
2. <b>AddRecords.java</b> :- This java class helps the project to save data on the server using the 
  <br>
> URL class and URLConnection classes.
  <br>
3.  <b>ViewRecords.java</b>:-  It populates the data recived from the database in the listview.<br>
4.  <b>Validations.java</b>:- is used to validate the entered data in the EditText.<br>
5.  <b>Operation.java</b>:- is used to create a connection with the given URL. <br>
6.  <b>ListViewAdapter.java</b>:- is the class which defines the layout of the listview which will display the records fetched using the webservice.<br>
7.  <b>URLNames.java</b>:-   is the class which contains the url of the links of the url of the PHP files which ill perform the insert  and fetching of the data operations.<br>
8.  <b>CategoryTO.java</b>:- is used to tell the data which we are fetching, it just contains getter and setters of the variables that we are fetching.<br>
<br>

<h3>1.b. <u><b>Layout files:-</b></u><br></h3>

These files are attached in the code of the java files, you can chekc them in the resource layouts folder.<br>
<hr>
<br>
>P.S. : Please let me know if you find any issue .

