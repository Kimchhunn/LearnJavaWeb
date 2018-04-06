### How to import JSTL library in IntelliJ
   # 1. Create one directory "lib" in WEB-INF.
   # 2. Copy the library into lib directory:
        - javax.servlet.jsp.jstl-1.2.1.jar	
        - jstl-1.2.jar	
        - mysql-connector-java-5.1.23-bin.jar (optional, in case of using JDBC)
   # 3. Add library to project by
        - Go to File --> Project Structure --> Library --> Modules
        - Click "+" --> Library --> New Library --> From Maven
        - Search for "javax.servlet:jstl:1.2" and tick "Download To" --> OK
        - Click "javax.servlet:jstl:1.2" --> Add Selected
        

        
