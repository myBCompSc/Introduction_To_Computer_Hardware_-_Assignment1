# Introduction To Computer Hardware.
  
## Using.
### Windows 11 Home.

Version: 25H2

Build id: 26200.7840

### Eclipse 

Version: 2025-12 (4.38.0)

Build id: 20251204-0850

## Dependencies.
### Eclipse.
 - https://www.eclipse.org/downloads/packages/release/2026-03/r/eclipse-ide-enterprise-java-and-web-developers
 
### The Java Development Kit (JDK).
 - https://www.oracle.com/anz/java/technologies/downloads/#java25

### Apache Maven. 
 - https://maven.apache.org/install.html

### Java Native Access Library.
 - https://github.com/java-native-access/jna

 #### edit pom.xml.
````
 <dependency>
	    <groupId>net.java.dev.jna</groupId>
	    <artifactId>jna</artifactId>
	    <version>5.18.1</version> <!-- Use the latest version -->
	</dependency>
	<dependency>
	    <groupId>net.java.dev.jna</groupId>
	    <artifactId>jna-platform</artifactId>
	    <version>5.18.1</version> <!-- Use the latest version -->
	</dependency>
````

### MSYS2.
 - https://www.msys2.org/#installation

 ### MinGW.
  - https://sourceforge.net/projects/mingw-w64/

### JavaFX.
 - https://gluonhq.com/products/javafx/
