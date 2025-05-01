# Nested Classes
Java lets you define a class within a class, called a *nested class*.

- [Nested Classes](#nested-classes)
  - [Types of Nested Classes](#types-of-nested-classes)
    - [Access](#access)
  - [Uses of Nested Classes](#uses-of-nested-classes)
  - [](#)

## Types of Nested Classes
In Java, nested classes can be divided into *static* and *non-static* classes.

Non-static nested classes are called **inner classes**. Static classes are called (suprise) **static nested classes**.

### Access
A nested class is a *member of its enclosing class*. Inner classes have access to other members of the enclosing class, **even if they are private**. Static nested classes **do not** have access to other members of the enclosing class. 

As a member of the enclosing class, a nested class can be declared as *public*, *private*, *protected*, or *package private*. This is unlike outer classes, which can only be declared as public or package private.

## Uses of Nested Classes
- **Logically grouping classes used in only one place:** If a class is only useful to another class, it can be embedded in that class to pair the two together.
- **Increase Encapsulation:** If class B needs access to members of class A that would otherwise be private, making B a nested class gives it access while keeping those members private.
- **Readability:** Places code closer to where it is used.

## 
