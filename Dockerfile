FROM openjdk:11
#ARG JAR_FILE=/target/complaintredressal-0.0.1-SNAPSHOT.jar
#COPY ${JAR_FILE} compapp.jar
#ENTRYPOINT ["java","-jar","/complaintredressal.jar"]
EXPOSE 8083
ADD /target/concierge-0.0.1-SNAPSHOT.jar concierge.jar
ENTRYPOINT ["java","-jar","concierge.jar"]