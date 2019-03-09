# spring-security-2.x.x-oauth2.0-jwt
This project acts as as authorization server
## Generate Private Key
Copy and paste ``` openssl rsa -in jwt.pem ``` inside your terminal.
A code will get generated. Copy the code and set as value of ``` privateKey ``` variable of ``` OAuth2Config ``` class.
## Generate Public Key
Copy and paste ``` openssl rsa -in jwt.pem -pubout``` inside your terminal.
A code will get generated. Copy the code and set as value of ``` publicKey ``` variable of ``` OAuth2Config ``` class.