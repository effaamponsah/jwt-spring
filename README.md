# JWT Secured Spring boot
### Intro
> This is a simple JWT secured spring boot app. Clone the project and have a look at it or use the docker image provided to try it out with 
```docker pull effaamponsah/jwt-spring```
### Instructions
> Run it as a normal spring boot app :). Nothing really new about this part.
There are 2 endpoints, **/login** and **/users**.

**/users** is protected with jwt and token must be provided as header to the request with key **access-token**.
> **/users** is a GET request

Use the **/login** to get the token.
> **/login** is a POST request with body
>```javascript
>{	
>       "username": "dennis123",
>       "password": "password"
>}
>```
>The above credentials are hardcoded since its a simple demo.