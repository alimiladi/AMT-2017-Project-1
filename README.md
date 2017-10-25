# AMT-2017-Project-1
### First bootcamp project for AMT course

## Objects
This application handles books. A book is defined by a unique identifier `isbn`, a name, an author and a number of pages.

## Features
With the book's app you can create, update existant books, show a paginated list of all the books, delete a book and generate a random number of books.
The book objects are stored in a mysql database.
This database runs on a mysql docker container. 

## Topology
As mentionned before, there is a container running th app's database. 
You can administrate the datatbase by a phpmyadmin container. (`192.168.99.199:6060`)
There is also a Glassfish 4.1.1 application server which runs on a different container. 

## Deployment and run
You should have a docker machine intalled on your computer for the setup of this application.
To deploy the application, you just have to 
1. First you have to place yourself in the `topology` directory. 
2. You have to run `docker-compose up --build`
3. Open your browser and type `192.168.99.100:8080/AMT2017Project1-1.0-SNAPSHOT`
You can then start to use the application.

## Usage
The home page is empty and you have a navigation bar that allows you to use the app.
`Create` button allows you to create a new book and insert it into the database.
`Manage Books` button allows you to show a pginated list of all the books in the datebase.
`Configuration` button allows you to generate a randon number of books and insert them into the database.

The database is already populated with some test data in the first use.

**Enjoy!!**
