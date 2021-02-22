# Inheritance

## Why Inheritance?
1. reusability of code
2. extension of classes 
3. building new class upon the existing one 
4. upgradation 
5. extending its functionality 
6. properties of variable remains same 

## Types of inheritance 
1) single inheritance (check)
2) multiple inheritance (not possible in java) - diamond problem - can be achieved using interface (check)
3) hierarchical inheritance  
4) hybrid inheritance
5) multi-path inheritance
6) multilevel inheritance  (not possible in java) - can be achieved using interface 

## Abstraction

The idea of hiding certain data and showing only what is essential. Java uses Abstract Classes and Interfaces to achieve this.

### Abstract Classes

**Abstract** Keyword is used for Classes and Methods.

Abstract class: is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class).

Abstract method: can only be used in an abstract class, and it does not have a body. The body is provided by the subclass (inherited from).

### Interfaces

An interface is a completely "abstract class" that is used to group related methods with empty bodies.

### Inheritance via Classes vs Interfaces

Multiple Inheritance is impossible to implement via Class based inheritance but it is possible via Interfaces