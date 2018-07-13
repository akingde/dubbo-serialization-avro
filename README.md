# dubbo-serialization-avro
avro serialization implement for dubbo.

## 1. build from src
we use maven to build and manage dependencies.

download src
```shell
git clone https://github.com/dubbo/dubbo-serialization-avro.git
```

build from src, and install to you local maven repository.
```shell
cd dubbo-serialization-avro
maven clean source:jar install -Dmaven.test.skip=true
```

## 2. Easy to use
Add dependencies in `pom.xml`:
```shell
<dependency>
    <groupId>org.apache.dubbo</groupId>
    <artifactId>dubbo-serialization-avro</artifactId>
    <version>2.7.0-SNAPSHOT</version>
</dependency>
```

Configure you dubbo use the serialization
```xml
<!-- protocol serialization style -->
<dubbo:protocol serialization="avro" />
<!-- default configuration, will take effect if serialization is not configured in <dubbo:protocol> -->
<dubbo:provider serialization="avro" />
```

That's All, Thx for use!