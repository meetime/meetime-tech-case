FROM openjdk:8-jdk-slim

RUN apt-get update && \
    apt-get install -y wget && \
    wget -O sbt.tgz https://github.com/sbt/sbt/releases/download/v1.6.1/sbt-1.6.1.tgz && \
    tar -zxvf sbt.tgz && \
    mv sbt /usr/local && \
    rm sbt.tgz && \
    ln -s /usr/local/sbt/bin/sbt /usr/local/bin/sbt

WORKDIR /app

COPY . /app

EXPOSE 9000

ENV JAVA_TOOL_OPTIONS="-agentlib:jdwp=transport=dt_socket,address=5005,server=y,suspend=n"

CMD ["sbt", "run"]
