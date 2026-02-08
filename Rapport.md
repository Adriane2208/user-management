# Rapport Technique - User Management App

## 1. Objectif
Développer une application simple de gestion d'utilisateurs en Java avec Spring Boot, en utilisant d’abord une Map comme stockage puis MySQL.

## 2. Choix techniques
- **Spring Boot** : framework MVC rapide et léger
- **Maven** : gestion des dépendances
- **Map** : première version pour simuler une base de données
- **MySQL** : deuxième version avec persistance réelle
- **Postman** : test des endpoints REST

## 3. Architecture MVC
- **Model** : `User` (id, name, email)
- **Repository** : `UserRepository` (interface CRUD)
- **RepositoryImpl** : implémentation Map / MySQL
- **Service** : `UserService` (interface pour la logique métier)
- **ServiceImpl** : implémentation du service
- **Controller** : `UserController` expose les endpoints REST

## 4. Défis rencontrés
- Gestion du chemin MySQL sur Windows
- Synchronisation des dépendances Maven avec JDK 25
- Conversion LF → CRLF sur Windows
- Postman → éviter les sauts de ligne (%0A) dans l’URL
- Adapter le code Map pour MySQL

## 5. Tests réalisés
- `GET /users` : lister tous les utilisateurs
- `POST /users` : ajouter un utilisateur
- `GET /users/{id}` : récupérer un utilisateur par ID
- `DELETE /users/{id}` : supprimer un utilisateur
- Tests réalisés via **Postman** et navigateur

## 6. Conclusion
L’application fonctionne avec deux versions de stockage et respecte le modèle MVC. Tous les endpoints ont été testés et les données sont persistées correctement dans MySQL pour la deuxième version.
