# picocli-trial

## Prerequisites

### Prerequisites for GraalVM

~~~
$ sudo apt-get install build-essential libz-dev zlib1g-dev
~~~

### Install GraalVM

[Download GraalVM](https://www.graalvm.org/downloads/) and unzip it.

Point the `PATH` environment variable to GraalVM's `bin` directory.
~~~
export PATH=<graalvm>/bin:$PATH
~~~

### Install native-image command

~~~
$ gu install native-image
~~~

`native-image` command will be kicked automatically via native-image-maven-plugin.

## Build & Run

### Java

~~~
$ mvn clean package

$ java -jar target/picocli-trial-1.0-SNAPSHOT-jar-with-dependencies.jar <hi or bye> <name>
~~~

### Native image

~~~
$ mvn clean package -P graalvm

$ ./target/say <hi or bye> <name>
~~~

Don't omit `clean`. If you omit `clean` then the native image will be broken.
