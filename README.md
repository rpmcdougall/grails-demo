# grails-demo
Demo Grails CRUD API

Install Grails
```
sdk install grails
```

Create IntelliJ Project
````
./gradlew idea
````

Create class for thing you want to model
````
./grailsw create-domain-class thingyouwanttomodel
````

Run Tests
````
./gradlew check
````

Create Controller
````
./grailsw create-controller package.name.of.Class
````
Create unit tests
````
./grailsw create-unit-test package.name.Thing
````

Create Views
```
./grailsw generate-vews package.name.Class
````
Add gson file for rendering json if needed
````
touch _class.gson
````

Run dev server
```
./gradlew bootRun=
````
