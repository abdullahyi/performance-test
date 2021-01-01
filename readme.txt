docker run -p 6379:6379 -d redis redis-server --requirepass starapo
docker run --name zookeeper -p 2181:2181 zookeeper
docker run --name kafka -p 9092:9092 -e KAFKA_ZOOKEEPER_CONNECT=192.168.1.2:2181 -e KAFKA_ADVERTISED_LISTENERS=PLAINTEXT://192.168.1.2:9092 -e KAFKA_OFFSETS_TOPIC_REPLICATION_FACTOR=1 -e ALLOW_PLAINTEXT_LISTENER=yes bitnami/kafka
docker run --name postgres -e POSTGRES_PASSWORD=starapo -p 5432:5432 -d postgres
docker run -d --name cassandra -p 9042:9042 cassandra