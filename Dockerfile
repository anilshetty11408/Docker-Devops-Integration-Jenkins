FROM openjdk:17
EXPOSE 8080
COPY target/docker-devops-integration-jenkins.jar docker-devops-integration-jenkins.jar
ENTRYPOINT ["java", "jar","docker-devops-integration-jenkins.jar"]