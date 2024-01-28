#!/bin/bash
MVN_EXECUTABLE="D:\\JetBrains\\IntelliJ IDEA 2022.3\\plugins\\maven\\lib\\maven3\\bin\\mvn"

for dir in */ ; do
    if [ -e "$dir/pom.xml" ]; then
        echo "Building image for $dir"
        cd "$dir"
        "$MVN_EXECUTABLE" package
        cd ..
    fi
done

read -p "Appuyez sur Entrée pour fermer la fenêtre..."