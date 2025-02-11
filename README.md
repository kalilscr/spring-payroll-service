## About

Spring MVC + Spring HATEOAS app with [HAL](https://stateless.co/hal_specification.html) representations of each resource

REST app where a field is evolved but old data is retained for backward compatibility

REST app where conditional links are used to signal valid state changes to clients

To view more examples of using Spring HATEOAS, see https://github.com/spring-projects/spring-hateoas-examples.

More about HAL see https://datatracker.ietf.org/doc/html/draft-kelly-json-hal-08

## Run The Application

[install java 21](https://gist.github.com/kalilscr/16149c2533ae57d1824a70b56eac93a8)

[install maven](https://gist.github.com/kalilscr/a8dc1f0f8f6877f9fcc36bb1d179fc48)

mvn spring-boot:run

## Test the application routes

### in your terminal:

`You may need to replace the {id} in the preceding URL, based on the specific IDs in your database. That information can be found from /orders or /employees call.`

curl -v localhost:8080/employees/{id}

curl -v localhost:8080/employees | json_pp

curl -v -X POST localhost:8080/employees
-H 'Content-Type:application/json'
-d '{"name": "Samwise Gamgee", "role": "gardener"}' | json_pp

curl -v -X PUT localhost:8080/employees/{id}
-H 'Content-Type:application/json'
-d '{"name": "Samwise Gamgee", "role": "ring bearer"}' | json_pp

curl -v -X DELETE localhost:8080/employees/{id}

curl -v http://localhost:8080/orders | json_pp

curl -v -X DELETE http://localhost:8080/orders/{id}/cancel | json_pp

curl -v -X PUT localhost:8080/orders/{id}/complete | json_pp

## Other Useful Links

- RFC-7807 https://datatracker.ietf.org/doc/html/rfc7807
