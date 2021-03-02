## Garbage Collection in Java

- In java, garbage means unreferenced objects. 
- Garbage Collection is process of reclaiming the runtime unused memory automatically. In other words, it is a way to destroy the unused objects.
- To do so, we were using ***free*** function in C language and ***delete*** in C++. But, in java it is performed automatically. So, java provides better memory management.



### Advantages

- It makes java memory efficient because garbage collector removes the unreferenced objects from heap memory.
- It is automatically done by the garbage collector(a part of JVM) so we don't need to make extra efforts

### How can Objects be unreferenced?

- By nulling the reference ( object = null)
- By assigning a reference to another ( obj1 = obj2)
- By annonymous object etc. ( new classname())


**Note: final, finalize, finally perform different roles**

- final - once defined its value cannot be changed 
  - final variable - constant
  - final method - cannot be overriden
  - final class - cannot extend it 
- finalize - used in garbage collection
- finally - its a method used for exception handling


### Finalize

- The finalize() method is invoked each time before the object is garbage collected. This method can be used to perform cleanup processing. This method is defined in Object class as:
- protected void finalize(){}  
- Note: The Garbage collector of JVM collects only those objects that are created by new keyword. So if you have created any object without new, you can use finalize method to perform cleanup processing (destroying remaining objects).


### gc()

- The gc() method is used to invoke the garbage collector to perform cleanup processing. The gc() is found in System and Runtime classes. 
- public static void gc(){}  
- Note: Garbage collection is performed by a daemon thread called Garbage Collector(GC). This thread calls the finalize() method before object is garbage collected.
- Note: A daemon thread is a thread that does not prevent the JVM from exiting when the program finishes but the thread is still running




garbage collection occurs (for deference(s) of objects) in separate threads

gc()
