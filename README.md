# Spring-H2-Basic


H2 console:
-----------

URL to access the H2 console: http://localhost:8080/h2-console

In order to access H2 console:

- the project has to include the Spring MVC dependency.
- the file application.properties has to include: spring.h2.console.enabled=true

Once in H2 console the url datasource can be found in the IDE console as:
-------------------------------------------------------------------------

  #H2 console available at '/h2-console'. Database available at 'jdbc:h2:mem:5043b12d-00a3-40e3-9b54-442aa3053bfe'
  
  or
  
  a property can be set in the application.properties file as follow: spring.datasource.url=jdbc:h2:mem:ariel
  
  
