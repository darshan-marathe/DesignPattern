# Decorator Design Patterns
### What is a decorator design pattern in Java?

   <p>Decorator design pattern is used to enhance the functionality of a particular object at run-time or dynamically.<br/>
  At the same time other instance of same class will not be affected by this so individual object gets the new behavior.<br/>
  Basically we wrap the original object through decorator object.<br/>
  Decorator design pattern is based on abstract classes and we derive concrete implementation from that classes,<br/>
  It’s a structural design pattern and most widely used.</p>

### What Problem is Solved by Decorator design Pattern?
<p>Now the question is why this pattern has came into existence what is the problem with existing system which needs <br/>
to be solved? so the answer is if anyone wants to add some functionality to an individual object or change the state of <br/>a particular object at run time it is not possible.</p>

<p> What is possible is that we can provide the specific behavior to all the object of that class at design time by<br/> 
the help of inheritance or using subclass, but Decorator pattern makes possible that we provide individual object of same class a specific behavior or state at run time.<br/> This doesn’t affect other object of same Class in Java.</p>

### When to use Decorator pattern in Java
<p>When sub classing is become impractical and we need large number of different possibilities to make independent <br/>object or we can say we have number of combination for an object.</p>

<p>Secondly when we want to add functionality to individual object not to all object at run-time we use decorator design pattern.</p>

##### Example:
   we have  **Car** interface. it has multiple sub class like
`Tata, Mahendra, honda, and so on`.</p>
  and we have some additional functionality to car like, `AC, Sheet-cover, 
Cameras, PowerWindow, and so on`.<br/>
 And this additional functionality will dynamically add or remove on object creation.

to solve this problem we can create sub classes like `TataACPowerWindow` or `TataCameras`.
so it become impractcal and we need large number of different combinations of class.


![plot](/Users/marathed/TomTom/Development/src/com/designPattern/decorator/img.png)


   