FROM oracle/graalvm-ce:19.2.0.1 as graalvm
COPY . /home/app/micronaut-two
WORKDIR /home/app/micronaut-two
RUN gu install native-image
RUN native-image --no-server -cp build/libs/micronaut-two-*-all.jar

FROM frolvlad/alpine-glibc
EXPOSE 8080
COPY --from=graalvm /home/app/micronaut-two .
ENTRYPOINT ["./micronaut-two"]
