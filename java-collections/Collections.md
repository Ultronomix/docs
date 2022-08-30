# Generics
Generics are constructs introduced in Java 5 which enforce compile time type safety by allowing you to use parameterized types
-   They are used heavily with the Collections API
They are essentially a place holder for a future datatype that helps us enforce type safety
Generics can be declared on a class, method parameters, or return types
With Generics you can restrict a class to only accept objects of a given type and the compiler will prevent you from using any other types
To make a class or interface generic, use angled brackets when declaring it, and use an arbitrary "generic type" which is determined by invoking the code
Naming conventions for Generics
-   E => Element
-   K => Map Key
-   V => Map Value
-   N => Number
-   T => Generic Data type
-   S, U, V and so => For multiple generic data types

### Make a Class Generic

To make a class (or interface) generic, use the angle brackets when declaring it, and use an arbitrary "generic type" which is determined by the invoking code. The generic type can then be reused throughout the class to enforce type safety.

```java
public class MyGenericClass<T> {
  private T instance;
  
  // simple generic setter method
  public void setObject(T object) {
    this.instance = object;
  }
}
```

# Data structure:
a data organization, management, and storage format that enables effiecient access and modification
-   Each one prioritizes access and modification in different
-   Typically one is better for specific tasks for others
There are two different types of data structures:
-   Linear: arranged in an orderly manner where each element is attached adjacently
    -   Elements can ve access in one time single run
    -   Simplier to implement
    -   single level
    -   Memory inefficient
-   Hierarchical: arranges elements in a sorted order, adn there is a relationship between them
    -   Cannot be accessed in a single run
    -   Complex to implement
    -   Multi-leveled
    -   Memory Efficient
Java implements many of the linear structures in the Collection API


# Collection Framework
The Collection API is a framework of Java classes and interfaces that implement commonly used data structures
**ALMOST** every class in the collections api extends from the Iterable interface
-   Exception is the Map classes

<img src = "https://bytesofgigabytes.com/IMAGES/java/collection/collection%20hierarchy%20in%20java.png" width = 800 style = "background:white">

# Iterable Interable and Iterator Interface
## Iterable and Iterator
The `Iterable` interface defines a data structure which can be directly traversed using the `.iterator()` method, which returns an `Iterator`. This can be useful for fine-grained control over iteration. The `Iterator` interface contains methods for traversal, including:
* `hasNext()`
* `next()`
* `remove()`

For example:

```java
Set<String> names = new ArrayList<>();
// add names...
Iterator<String> it = names.iterator();
while (it.hasNext()) {
  String name = it.next();
  doSomething(name);
}
```

### Enhanced For Loop
Any object which implements the `Iterable` interface can also be iterated over using a special kind of `for`-loop: the "enhanced" for loop. The syntax is as follows:
```java
Set<String> names = new ArrayList<>();
// add names...
for (String name : names) {
  System.out.println(name);
}
```

Classes that implement the Iterable interface also have the .forEach() each method, which allows user to iterate through the data structure, and perform some logic with a lamda expression


# Implementations of Collection Interfaces
## Lists
The most basic datatype, a collection of ordered data that is preserved
-   Duplicate entries are allowed
-   Elements are accessed by their index, which start at 0
ArrayList: a concrete implementation of the List interface that contains an array within it
-   The array is resizable, once it reaches the max capacity it increases its size by 50%
-   You can traverse it quickly via index
-   Insertion and deltion is slower, because it may have to resive the internal array
LinkedList: a concrete implementation of the List and Queue interface which is composed of nodes that reference each other
-   Insertion and deletion is relatively quick
-   Traverse to a specific index is slower
Vector: an older concrete implementation of the List interface, which is a threadsafe arraylist
-   Doubles in size if needed
Stack: an older concrete implementation of the List interface, used to implement the stack data structure, (first in last out), but you should now use ArrayDeque
## Sets
A collection of data that is not ordered and does not allow duplicate elements
-   does not preserve the order in which elements are inserted
HashSet: a concrete implementation fo the Set interface backed by a HashMap
-   There is no ordering when iterating
-   Allows one null value
-   Allows fast insertion and traveral
TreeSet: a concerete implementation of the Set interface which maintains sorted order when elements are inserted
-   It is backed by a Sorted Tree
-   Insertion and deletion is slow
-   It cannot contain null elements
## Queues
Collection of data that follows first in first out, unless otherwise specified
ArrayDeque: a concrete implementation of the Queue interface that allows programmers to implement stack or queue behavior
-   It is a double ended queue
-   It stores items in a resizable array
Useful ArrayDeque methods:
-   pop()
-   push()
-   peekFirst()
-   peekLast()
-   pollFirst()
-   pollLast()
-   offerFirst()
-   offerLast()
Priority Queue: a concrete implementation of the Queue interface which orders elements based on their natural ordering
-   It uses a Comparator to order the elements
## Maps
Data structure that uses key/value pairs to store and retrieve data
The Map interface does not implement the Collection Interface, however it is still considered to be part of the Collections API
You cannot iterate over a Map, because it does not implement the iterable interface, you can iterate through different values in a Map:
-   use the entrySet() method to iterate over the set of Map.entry
-   use keySet() method to iterate over the set of keys
-   use values() method to return a Collection of values which then can be iterated over
HashMap: a concrete implementation of the Maps interface that:
-   Stores elements in a key/value pair
-   Insertion and retreival is fast
-   Tradeoff is that it does not maintain insetion order
-   Permits on null key and null values
TreeMap: a concrete implementation of the Maps interface that:
-   Stores its keys in a sorted tree structure
-   Insertion and retrieval is slow
-   Cannot contain null keys
HashTable: older concrete implementation of the Maps interface that is threadsage, and cannot contain null keys or values

## Collections Class
The [Collections](https://docs.oracle.com/javase/8/docs/api/java/util/Collections.html) class - not to be confused with the Collection interface - defines many `static` helper methods which operate on any given collection. Use this class for help with sorting, searching, reversing, or performing other operations on collections.

## Comparable and Comparator Interfaces
[`Comparable`](https://docs.oracle.com/javase/8/docs/api/java/lang/Comparable.html) is an interface which defines the natural ordering for a class. A class must implement `Comparable` if it is to be sorted by the `compareTo()` method.
```java
public interface Comparable<T> {
	public int compareTo(T o);
}
```

The `compareTo()` method returns an `int` which is:
* Zero, if the two objects are equal
* Negative, if this object is smaller than that
* Positive, if this object is greater than that

[`Comparator`](https://docs.oracle.com/javase/8/docs/api/java/util/Comparator.html) is an interface which allows you to define a total ordering on some collection of objects. A class that is to be sorted by `compare()` does not have to implement `Comparator`.
```java
public interface Comparator<T> {
	public int compare(T firstObject, T secondObject);
}
```