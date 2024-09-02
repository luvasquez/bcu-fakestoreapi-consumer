# bcu-fakestoreapi-consumer
API developed in Spring Boot aimed at implementing the behavior of an online shopping cart (Test for Banco Cuscatlán Honduras)

## Data:
Example of a order data JSON object:
```
{
    "id": 1,
    "orderDescription": "status: new order in progress...",
    "client": {
        "id": 1,
        "name": "Luis Eduardo",
        "lastName": "Vásquez Villalta",
        "dui": "12345678-9",
        "email": "vasquez.eduardoluis@gmail.com",
        "address": "Lost city, San Salvador +503 El Salvador"
    },
    "details": [
        {
            "idProduct": 2,
            "productDetail": "Mens Casual Premium Slim Fit T-Shirts ",
            "quantity": 2,
            "amount": 44.6
        }
    ]
}
```


## Commands
- run:
```bash
mvn clean package; java -jar target/app-1.0-SNAPSHOT.jar
```
- install:
```bash
mvn clean install
```
- test:
```bash
mvn clean test
```
