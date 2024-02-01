#!/bin/bash

# Construction d'images docker pour chaque microservice spring boot

for dir in */ ; do
    if [ -e "$dir/pom.xml" ]; then
        echo "Building image for $dir"
        cd "$dir"
        mvn spring-boot:build-image -DskipTests
        cd ..
    fi
done

docker compose build

read -p "Appuyez sur Entrée pour fermer la fenêtre..."