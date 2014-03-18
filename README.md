hello-springmvc

Spring MVC Tutorial with IntelliJ IDEA, Gradle with tomcat-plugin

To run locally:
./gradlew tomcatRun ==> to start tomcat with app deployed
./gradlew jettyRun ==> to start jetty with app deployed

If using jettyRun, use port: 9080 instead.

Hello page:
http://localhost:8080/hello-springmvc/hello

With a name param:
http://localhost:8080/hello-springmvc/hello?name=bob

Goodbye page:
http://localhost:8080/hello-springmvc/hello/goodbye

Form sample page:
http://localhost:8080/hello-springmvc/hello/form ==> submits to "/result" (in HelloController)

Some notes on the context-root i.e. /hello-springmvc in the url:
1. The context-root defaults to the WAR file name (in IDEA, Open Module Settings (F4) > Artifacts).
If you deploy this WAR in tomcat (e.g., under /webapps), the url should have the /context-root as well,
e.g. http://localhost:8080/hello-springmvc/........
2. When using gradle jettyRun or tomcatRun, use the contextPath property to set the context-root
for that runtime.
