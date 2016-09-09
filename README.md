# java-dumb-passwords
> #### Guard your users from security problems by preventing them from having dumb passwords

### Introduction

This Artifact can be used to verify **the user provided password is not one of the top 10,000 worst passwords** as analyzed by a respectable IT security analyst. Read about all [here](https://xato.net/10-000-top-passwords-6d6380716fe0#.473dkcjfm), [here(wired)](http://www.wired.com/2013/12/web-semantics-the-ten-thousand-worst-passwords/) or [here(telegram)](http://www.telegraph.co.uk/technology/internet-security/10303159/Most-common-and-hackable-passwords-on-the-internet.html)

# Installation

## Prerequisites

- Java version Oracle JDK 7, 8 or OpenJDK 7

### Maven
Include the following in your `pom.xml` for Maven:

```xml
<dependency>
    <groupId>com.unicodelabs</groupId>
    <artifactId>java-dumb-passwords</artifactId>
    <version>1.0.0</version>
</dependency>
```

###Jar-File
You can also download the jar file from the latest release on the [releases page](https://github.com/iamraphson/java-dumb-passwords/releases).

## Usage
A DumbPassword class provides one public method for checking dumb passwords. Instantianting the class is as given below:

```java
final DumbPassword dumbPasswords = new DumbPassword();
```
## API
#### dumbPasswords.checkPassword(string) => true or false
Check if the string provided, representing the user's proposed submitted password is not one of the
**top 10,000 worst passwords** users use.

returns `true` if the password is one of them and `false` if the password is not.

## Contributing

Please feel free to fork this package and contribute by submitting a pull request to enhance the functionalities.


## Security Vulnerabilities

If you discover a security vulnerability within Java-dumb-passwords java library , please send an e-mail to Ayeni Olusegun at nsegun5@gmail.com. All security vulnerabilities will be promptly addressed.

## How can I thank you?

Why not star the github repo? I'd love the attention! Why not share the link for this repository on Twitter or HackerNews? Spread the word!

Don't forget to [follow me on twitter](https://twitter.com/iamraphson)!

Thanks!
Ayeni Olusegun.

## License

The MIT License (MIT). Please see [License File](LICENSE.md) for more information.