# SOLID Principles
SOLID is an acronym representing five key object oriented design (OOD) principles. These principles aim to make code more maintainable, flexible, and understandable.<sup>[1](https://medium.com/@cibofdevs/understanding-solid-principles-in-java-with-real-life-examples-d6fe93b0acc2)</sup>

- [SOLID Principles](#solid-principles)
  - [Single Responsibility Principle (SRP)](#single-responsibility-principle-srp)
  - [Open/Closed Principle (OCP)](#openclosed-principle-ocp)
  - [Liskov Substitution Principle (LSP)](#liskov-substitution-principle-lsp)
  - [Interface Segregation Principle (ISP)](#interface-segregation-principle-isp)
  - [Dependency Inversion Principle (DIP)](#dependency-inversion-principle-dip)
  - [Sources](#sources)


The five SOLID principles are:
* **S**ingle Responsibility Principle (SRP)
* **O**pen/Closed Principle (OCP)
* **L**iskov Substitution Principle (LSP)
* **I**nterface Segregation Principle (ISP)
* **D**ependency Inversion Principle (DIP)

## Single Responsibility Principle (SRP)
A class should have only **one** responsibility, and as such should only have one reason to change.<sup>[2](https://www.baeldung.com/solid-principles)</sup>

## Open/Closed Principle (OCP)
Classes should be open for *extension*, but closed for modification.

**Note:** One exception to this rule is bugfixes.<sup>[2](https://www.baeldung.com/solid-principles)</sup>

## Liskov Substitution Principle (LSP)
Subtypes should be substitutable for base types without changing the correctness of the program.<sup>[1](https://medium.com/@cibofdevs/understanding-solid-principles-in-java-with-real-life-examples-d6fe93b0acc2)</sup>

Put another way: If class B is a subtype of class A, we should be able to swap A with B without breaking our application.<sup>[2](https://www.baeldung.com/solid-principles)</sup>

## Interface Segregation Principle (ISP)
Clients (i.e. classes) should not depend on interfaces they do not use.<sup>[1](https://medium.com/@cibofdevs/understanding-solid-principles-in-java-with-real-life-examples-d6fe93b0acc2)</sup>

Larger interfaces should be split into smaller interfaces so that implementing classes only have to implement methods relevant to them.<sup>[2](https://www.baeldung.com/solid-principles)</sup>

## Dependency Inversion Principle (DIP)
High-level modules should not depend on low-level modules. Instead, both should depend on abstractions.<sup>[1](https://medium.com/@cibofdevs/understanding-solid-principles-in-java-with-real-life-examples-d6fe93b0acc2)</sup>

## Sources
1. [Understanding SOLID Principles in Java with Real-Life Examples](https://medium.com/@cibofdevs/understanding-solid-principles-in-java-with-real-life-examples-d6fe93b0acc2)
2. [A Solid Guide to SOLID Principles](https://www.baeldung.com/solid-principles) 