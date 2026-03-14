# Introduction To Computer Hardware.

## ToDo:
- java.lang.UnsatisfiedLinkError: Error looking up function
https://www.google.com/search?q=java.lang.UnsatisfiedLinkError%3A+Error+looking+up+function+&sca_esv=6e72ffa629272dce&rlz=1C1HKFL_enAU1205AU1205&sxsrf=ANbL-n62eZE97-jh8iOAcctRcxQFjNqbVg%3A1773483057616&ei=MTS1af-jJann2roP5dfuuAU&biw=974&bih=910&ved=0ahUKEwi_gKidk5-TAxWps1YBHeWrG1cQ4dUDCBQ&uact=5&oq=java.lang.UnsatisfiedLinkError%3A+Error+looking+up+function+&gs_lp=Egxnd3Mtd2l6LXNlcnAiOmphdmEubGFuZy5VbnNhdGlzZmllZExpbmtFcnJvcjogRXJyb3IgbG9va2luZyB1cCBmdW5jdGlvbiAyBhAAGBYYHjIGEAAYFhgeMgUQABjvBTIFEAAY7wUyBRAAGO8FMgUQABjvBUitBlAAWABwAHgAkAEAmAHbAaAB2wGqAQMyLTG4AQPIAQD4AQGYAgGgAuABmAMAkgcDMi0xoAezBLIHAzItMbgH4AHCBwMyLTHIBwOACAA&sclient=gws-wiz-serp

## Using.
### Windows 11 Home.

Version: 25H2

Build id: 26200.7840

### Eclipse 

Version: 2025-12 (4.38.0)

Build id: 20251204-0850

## Dependencies.
### Eclipse.
 - https://www.eclipse.org/downloads/
 
### The Java Development Kit (JDK).
 - https://www.eclipse.org/downloads/packages/ 

### Apache Maven. 
 - https://maven.apache.org/install.html
 
### Java Native Access Library.
 - https://github.com/java-native-access/jna

 #### edit pom.xml.
````
    <dependency>
    	<groupId>net.java.dev.jna</groupId>
    	<artifactId>jna</artifactId>
    	<version>5.18.1</version> <!-- Check for newest 2026 version -->
    </dependency>
````
