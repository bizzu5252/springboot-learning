
## Docker Postgres Setup

Pull Docker image with Postgres database and run:

    docker pull postgres
    docker run --name postgres-demo -e POSTGRES_PASSWORD={password} -p 5432:5432 -d postgres

Start container commands:

    docker start postgres-demo

Stop container commands:

    docker stop postgres-demo

Connection Info:

    JDBC URL: `jdbc:postgresql://localhost:5432/conference_app`

    Username: `postgres`

    Password: `{password}`

Note: This stores the data inside the container - when you delete the container, the data is deleted as well.

Connect to PSQL prompt from docker:  
   docker exec -it postgres-demo psql -U postgres
   
## Application Database Setup

Create the Database:

    psql> create database conference_app;


Setup the Tables:

    docker cp create_tables.sql postgres-demo:/create_tables.sql
    docker exec -it postgres-demo psql -d conference_app -f create_tables.sql -U postgres

Install the Data:

    docker cp insert_data.sql postgres-demo:/insert_data.sql
    docker exec -it postgres-demo psql -d conference_app -f insert_data.sql -U postgres

Download "Postico" Database Client from below url:

It'll help in looking at the tables and the contents in UI.

    https://eggerapps.at/postico/
