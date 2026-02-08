# User Management App

Application de gestion d'utilisateurs avec Spring Boot

Deux versions disponibles :  
1. Version Map : utilisation d’une Map comme base de données.  
2. Version MySQL :utilisation d’une base MySQL réelle.

## Prérequis

- Java JDK 25
- Maven
- MySQL Server(8.0 ou supérieur)
- Postman (pour tester les endpoints REST)
- Un IDE (IntelliJ IDEA recommandé)


## Installation & Exécution

### 1. Cloner le projet

```bash
git clone https://github.com/Adriane2208/user-management.git
cd user-management
````

### 2. Lancer la version Map (sans base MySQL)

```bash
mvn spring-boot:run
```

- Test des endpoints via navigateur ou Postman :

    * `GET http://localhost:8080/users` → liste des utilisateurs
    * `POST http://localhost:8080/users` → ajouter un utilisateur
    * `GET http://localhost:8080/users/{id}` → récupérer un utilisateur
    * `DELETE http://localhost:8080/users/{id}` → supprimer un utilisateur

### 3. Lancer la version MySQL

1. Créer la base de données MySQL :

```sql
CREATE DATABASE user_management_db;
```

2. Configurer `src/main/resources/application.properties` :

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/user_management_db
spring.datasource.username=root
spring.datasource.password=ton_mot_de_passe
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

3. Lancer l’application :

```bash
git checkout mysql-version
mvn spring-boot:run
```

Les mêmes endpoints REST sont disponibles, mais les utilisateurs sont persistés dans MySQL.

## Endpoints REST

| Méthode | URL         | Description                  | Exemple JSON POST                                                                 |
| ------- | ----------- | ---------------------------- |-----------------------------------------------------------------------------------|
| GET     | /users      | Lister tous les utilisateurs | -                                                                                 |
| GET     | /users/{id} | Récupérer un utilisateur     | -                                                                                 |
| POST    | /users      | Ajouter un utilisateur       | {"name":"Stephane","email":"[stephane@example.com](mailto:stephane@example.com)"} |
| DELETE  | /users/{id} | Supprimer un utilisateur     | -                                                                                 |



## Tests réalisés

* Ajouter plusieurs utilisateurs avec POST
* Vérifier la liste complète avec GET
* Récupérer un utilisateur par ID avec GET
* Supprimer un utilisateur avec DELETE
* Testé via Postman et navigateur



## Choix techniques

* **Spring Boot** pour créer rapidement une application MVC
* **Maven** pour gérer les dépendances
* **Map** pour la première version, simulation d’une base
* **MySQL** pour la deuxième version, persistance réelle
* Architecture **MVC** :

    * Model : classe `User`
    * Repository : interface `UserRepository`
    * RepositoryImpl : implémentation Map ou MySQL
    * Service : interface `UserService`
    * ServiceImpl : logique métier
    * Controller : `UserController` → expose les endpoints REST



## Défis rencontrés

* Problème initial avec `mysql` dans Windows CMD
* Gestion des IDs auto-incrémentés avec Map
* Adaptation du code pour MySQL après la version Map
* Postman → URL parfois avec saut de ligne `%0A`
* Synchronisation des dépendances Maven (Spring Boot 4 + JDK 25)



## Auteur

NGOUABE DJEUGOUE Adriane Laville


