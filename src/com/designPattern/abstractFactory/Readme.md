### Difference between Factory and Abstract Factory Design Pattern in Java? 

Example
Both the Abstract Factory and Factory design pattern are creational design pattern and use to decouple clients from creating objects they need, But there is a significant difference between Factory and Abstract Factory design patterns, Factory design pattern produces implementation of Products like Garment Factory produce different kinds of clothes, On the other hand, Abstract Factory design pattern adds another layer of abstraction over Factory Pattern and Abstract Factory implementation itself like the AbstractFactory will allow you to choose a particular Factory implementation based upon need which will then produce different kinds of products.

In short
1) Abstract Factory design pattern  creates Factory
2) Factory design pattern creates Products


Btw, If you are serious about learning design patterns and principles, I suggest you take a look at these Design Pattern Courses.  This list contains best design pattern courses that cover both SOLID design principles like Open Closed and Liskov substitution, and all-important Object Oriented design patterns like Decorator, Observer, Chain of Responsibility, and much more.


### Difference between Abstract Factory and Factory design pattern in Java
Difference between Factory vs Abstract Factory pattern in JavaLet see another example of Abstract Factory and Factory design pattern in Java from JDK itself to get a better understanding. If you have done some XML work in Java e.g. reading XML files using DOM parser, you may be familiar with DocumentBuilderFactory  class which is an example abstract factory design pattern because it returns a factory called DocumentBuilder which then used to create Document.



//Example of Abstract Factory and Factory design pattern  in Java
DocumentBuilderFactory abstractFactory = DocumentBuilderFactory.newInstance();
DocumentBuilder factory = abstractFactory.newDocumentBuilder();
Document doc = factory.parse(stocks)

In this example DocumentBuilderFactory (Abstract Factory) creates DocumentBuilder (Factory) which creates Documents (Products).

Let's see some more difference between Abstract Factory and Factory design pattern in Java in point form :

1) One more difference between Abstract Factory and Factory design pattern is that AbstractFactory pattern uses composition to delegate responsibility of creating object to another class while Factory design pattern uses inheritance and relies on derived class or sub class to create object.

2) Abstract Factory may use Factory design pattern for creating objects but they are not just limited to that they can also use Builder design pattern to build object by doing series of steps or Prototype pattern to build object by copying or customizing the prototype of that object. It completely depends upon your implementation whether to use Factory pattern or Builder pattern for creating products.


### When to use Abstract Factory and Factory method design pattern in Java
Factory method design patterns are a modern way of creating objects. It offers some notable advantages over new() operator to create Objects e.g. By using the Factory method design pattern client is completely decoupled with object creation code, which enforces Encapsulation, and the result is a loosely coupled and highly cohesive system.

Any change like a new product from Factory requires almost no change in existing clients. See When to use Factory method design pattern in Java for more scenarios.

On the other hand if you need an additional level of abstraction over your Factory pattern then Abstract Factory is the right design pattern to use. Abstract Factory allows you to use different Factory implementation for different purposes.

Abstract Factory pattern can be implemented using Factory method and Singleton design pattern in Java. One of the best examples of Abstract Factory and Factory patterns in Java is DocumentBuilderFactory and DocumentBuilder javax.xml.parsers package.


That's all on the difference between Abstract Factory and Factory design pattern in Java. In short Abstract Factory, design pattern provides an abstraction over Factory pattern itself while Factory design pattern provides an abstraction over products.