# Api Projeto Java Santander
 Java RESTful API criada para o Santander DEV WEEK.

 ## Diagrama de Classes 

 ```mermaid
 classDiagram
  class User {
    - name: String
    - account: Account
    - features: List<Feature>
    - card: Card
    - news: List<News>
  }

  class Account {
    - Number: String
    - Agency: String
    - Balance: Double
    - Limit: Double
  }

  class Feature {
    - icon: String
    - description: String
  }

  class Card {
    - number: String
    - limit: Double
  }

  class News {
    - newsIcon: String
    - newsDescription: String
  }

  User "1" *-- "1" Account
  User "1" *-- "N" Feature
  User "1" *-- "1" Card
  User "1" *-- "N" News
```
