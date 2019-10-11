# appengine-springboot
A simple example of Spring Boot Application for Google Cloud Platform AppEngine
<br>
For this example I followed this link: [cloud-app-engine-springboot](https://codelabs.developers.google.com/codelabs/cloud-app-engine-springboot/#0")

The example is a simple Spring Boot application that i created directly from: [start.spring.io] (https://start.spring.io/#!type=maven-project&language=java&platformVersion=2.1.9.RELEASE&packaging=jar&jvmVersion=1.8&groupId=com.example&artifactId=demo&name=demo&description=Demo%20project%20for%20Spring%20Boot&packageName=com.example.demo&dependencies=web)

After the creation I added the appEngine official plugin to the pom.xml

```xml
...
<plugin>
	<groupId>com.google.cloud.tools</groupId>
	<artifactId>appengine-maven-plugin</artifactId>
	<version>2.1.0</version>
	<configuration>
	  <version>1</version>
	  <projectId>GCLOUD_CONFIG</projectId>
	</configuration>
</plugin>
...
```

At the end I added the file app.yml in the folder `appengine-springboot\src\main\appengine`.
The `app.yml` is the following:
```
runtime: java11
instance_class: F1
```
