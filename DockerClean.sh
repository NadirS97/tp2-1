# Arrêter tous les conteneurs en cours d'exécution
docker stop $(docker ps -q)

# Supprimer tous les conteneurs
docker rm $(docker ps -a -q)

# Supprimer toutes les images non utilisées
docker image prune -a

# Supprimer tous les volumes non utilisés
docker volume prune

# Supprimer tous les caches (y compris les images intermédiaires)
docker builder prune

