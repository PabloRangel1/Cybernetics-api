# Usa a imagem base do Java 17
FROM eclipse-temurin:17-jdk-jammy

# Argumento com o nome EXATO do seu arquivo .jar
ARG JAR_FILE=target/cadastroDeColaboradores-0.0.1-SNAPSHOT.jar

# Define o diretório de trabalho dentro do contêiner
WORKDIR /app

# Copia o .jar para dentro do contêiner como 'app.jar'
COPY ${JAR_FILE} app.jar

# Expõe a porta 8080 do contêiner
EXPOSE 8080


# Comando para executar a aplicação quando o contêiner iniciar
ENTRYPOINT ["java", "-jar", "app.jar"]