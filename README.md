hello-springmvc

Spring MVC Tutorial with IntelliJ IDEA, Gradle with tomcat-plugin

To run locally:
./gradlew tomcatRun ==> to start tomcat with app deployed **** seems to be buggy, not reliable
./gradlew jettyRun ==> to start jetty with app deployed *** use this, seems to be more stable

If using jettyRun, use port: 9080 instead.

Hello page:
http://localhost:8080/hello_springmvc/hello

With a name param:
http://localhost:8080/hello_springmvc/hello?name=bob

Goodbye page:
http://localhost:8080/hello_springmvc/hello/goodbye

Some notes on the context-root i.e. /hello_springmvc in the url:
1. The context-root defaults to the WAR file name (in IDEA, Open Module Settings (F4) > Artifacts).
