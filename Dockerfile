FROM eclipse-temurin:17-jre
EXPOSE 8080
COPY target/docker-devops-integration-jenkins.jar docker-devops-integration-jenkins.jar
ENTRYPOINT ["java", "jar","docker-devops-integration-jenkins.jar"]