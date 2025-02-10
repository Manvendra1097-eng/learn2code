### Type of memory in Java

1. Stack memory
    > It holds local variables, method calls and reference variable
2. Heap memory
    > Heap memory is where all the objects and their instance variables are stored.
   
    > It is divided into several regions:<br>
      __Young Generation__: This is where new objects are allocated.<br>
   > It consists of: <br>
      __Eden Space:__ Most new objects are allocated here. <br>
      __Survivor Spaces (S0 and S1):__ Objects that survive garbage collection in the Eden space are moved here.

    > __Old Generation (Tenured Generation):__ Objects that have survived multiple garbage collections in the Young Generation are moved here.
3. Metaspace
    > It holds the all metadata regarding class and methods like class is loaded by JVM , bytecode of methods etc.<br>

    > It also holds static variables and method as they are related to class not objects.
4. Program counter register (PCR)
    > The PC register is a small memory area that stores the address of the current instruction being executed by the thread. Each thread has its own PC register.
5. Native method stack
    > The native method stack is used for native methods written in languages like C or C++. It stores information about the native methods invoked by the JVM.
   
---
In `minor gc` all lived object is moved to survival space either (s0 or s1) and all dead object are removed and if any object which survive 
several `minor gc` are moved to `older generation` space. 
`Major GC` is running on whole heap area including yong and old generation.

---
In java garbage collection is handled automatically we can call it using `System.gc()` but it's not granted that JVM call it.