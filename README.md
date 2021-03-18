# picocli-trial

## Prerequisites

### Prerequisites for GraalVM

~~~
$ sudo apt-get install build-essential libz-dev zlib1g-dev
~~~

### Install GraalVM

[Download GraalVM](https://www.graalvm.org/downloads/) and unzip it.

Configure `PATH` environment variable to point GraalVM's `bin` directory.
~~~
export PATH=<graalvm>/bin:$PATH
~~~

### Install native-image command

~~~
$ gu install native-image
~~~

## Build

~~~
$ mvn package
~~~
