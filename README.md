# log4j2 to slf4j example

## Log4j 2 version

- Java 6 use log4j2 v 2.3.x
- Java 7 use log4j2 v 2.12.x
- Java 8+ use log4j2 latest version

## Log4j 2 SLF4J Binding

If you have code in your application like this:

```java
// Instance of SLF4J
private static final org.slf4j.Logger logger =
    org.slf4j.LoggerFactory.getLogger(MyClass.class);
```

And you want to use Log4J 2 (log4j2.xml), then you might need:

![](https://i.stack.imgur.com/saWHF.png)


## Log4j 2 to SLF4J Adapter
If you have code in your application like this:

```java
// Instance of Log4J 2
private static final org.apache.logging.log4j.Logger logger =
    org.apache.logging.log4j.LogManager.getLogger(MyClass.class);
```

And you want to use SLF4J (e.g. logback.xml), then you might need:

![](https://i.stack.imgur.com/ByYgP.png)

Reference:
- https://stackoverflow.com/a/25636647/1849597
