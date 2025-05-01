# Cheatsheet (From Phind, need to refine based on manual research)
This is a starting point using the AI tool phind. Initially, I will only partially trust it as a basic outline. My goal here is to compile Java basics so I can hammer home those points and improve my overall understanding.

#  Java Software Engineer Cheat Sheet

##  Core Concepts

- Everything in Java is an object except primitives
- Primitives: `byte`, `short`, `int`, `long`, `float`, `double`, `boolean`, `char`
- Autoboxing/unboxing converts between primitives and wrapper classes (i.e. `int` -> `Integer` and `Integer` -> `int`)
- **Static** members belong to the *class*, **instance** members to *objects*
- Method overloading vs overriding:
  - **Overloading:** Multiple methods with same name, different parameters
  - **Overriding:** Subclass providing specific implementation



##  [OOP Principles (SOLID)](/notes/SOLID/README.md)

- **Single Responsibility Principle (SRP):** One class, one responsibility
- **Open/Closed Principle:** Extend functionality without modifying existing code
- **Liskov Substitution Principle:** Derived classes must be substitutable for base classes
- **Interface Segregation Principle:** Clients shouldn't depend on interfaces they don't use
- **Dependency Inversion Principle:** Depend on abstractions, not concretions

##  Collections Framework

- Interfaces:
  - `List`: Ordered, indexed, duplicates allowed (ArrayList, LinkedList)
  - `Set`: Unique elements, no order guarantee (HashSet, TreeSet)
  - `Map`: Key-value pairs (HashMap, TreeMap)


- Common operations:
```java
// List operations
list.add(element);
list.get(index);
list.remove(index);

// Set operations
set.add(element);
set.contains(element);
set.remove(element);

// Map operations
map.put(key, value);
map.get(key);
map.containsKey(key);
```



##  Concurrency Basics

- Thread states: NEW → RUNNABLE → BLOCKED → WAITING → TIMED_WAITING → TERMINATED
- Synchronization methods:
```java
public synchronized void method() {
    // Thread-safe code
}

synchronized (lockObject) {
    // Critical section
}
```


- Key concurrency utilities:
  - `Atomic` classes for thread-safe updates
  - `Lock` interface for manual locking
  - `ExecutorService` for task management
  - `ConcurrentCollections` for thread-safe collections



##  Database Fundamentals

- Connection lifecycle:
```java
try (Connection conn = DriverManager.getConnection(url, user, password)) {
    Statement stmt = conn.createStatement();
    ResultSet rs = stmt.executeQuery(query);
    // Process results
} catch (SQLException e) {
    // Handle error
}
```


- SQL best practices:
  - Use prepared statements to prevent SQL injection
  - Close resources in finally blocks or use try-with-resources
  - Batch updates for performance
  - Connection pooling for efficiency



##  Error Handling

- Exception hierarchy:
  - `Throwable` → `Error` → unchecked exceptions
  - `Throwable` → `Exception` → checked exceptions


- Best practices:
```java
try {
    // Code that might throw
} catch (SpecificException e) {
    log.error("Error details", e);
    throw new CustomException("User-friendly message");
} finally {
    // Cleanup resources
}
```



##  Design Patterns

- Creational:
  - Singleton: Single instance control
  - Factory Method: Object creation delegation
  - Builder: Step-by-step construction


- Structural:
  - Adapter: Interface conversion
  - Decorator: Dynamic behavior addition
  - Facade: Simplified interface


- Behavioral:
  - Observer: Event notification
  - Strategy: Algorithm encapsulation
  - Template Method: Algorithm skeleton



##  Performance Optimization

- Memory management:
  - Avoid unnecessary object creation
  - Use stack variables when possible
  - Clear references to unused objects
  - Consider using weak references for caches


- Code optimization:
  - Prefer composition over inheritance
  - Use final fields and methods when appropriate
  - Implement equals/hashCode correctly
  - Cache frequently accessed data



##  Security Best Practices

- Input validation:
  - Validate all external inputs
  - Sanitize data before processing
  - Implement proper error handling


- Common security measures:
  - Use prepared statements for SQL
  - Implement secure password hashing
  - Use HTTPS for communication
  - Follow principle of least privilege



##  Testing Fundamentals

- Test types:
  - Unit tests: Individual components
  - Integration tests: Component interactions
  - End-to-end tests: Full system workflow


- Best practices:
```java
@Test
void testMethod_shouldBehaveAsExpected() {
    // Arrange
    setupTestData();
    
    // Act
    result = methodUnderTest();
    
    // Assert
    assertEquals(expectedResult, result);
}
```



While this cheat sheet covers key concepts, practice and experience are essential for mastering Java software engineering. Focus on understanding the underlying principles rather than just memorizing syntax.