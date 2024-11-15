FROM openjdk:21
EXPOSE 8080
ADD target/k8s-config-0.0.1-SNAPSHOT.jar k8s-config.jar
ENTRYPOINT ["java", "-jar", "/k8s-config.jar"]