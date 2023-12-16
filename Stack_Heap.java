// JVM divides memory into two parts: stack and heap
// Stack: stores method calls, local variables, and partial results
// Heap: stores objects

// Stack
// Stack is static memory allocation. It is allocated at runtime.
// Memory is allocated in stack in LIFO(last in first out) order.
// It stores method calls, local variables, partial results and reference to objects in heap.
// while excecuting a method call, varibales declared in that method are stored in stack as well as reference to objects created in that method.
// Stack is thread specific. Each thread has its own stack. Scope of elements in stack is limited to thread.
// It records order of execution of methods.
// Memory allocated to stack lives until the function returns.

// Heap
// Heap is dynamic memory allocation. It is allocated when jvm starts up.
// Memory is allocated in heap in random order.
// It stores objects and instance variables.
// There are variables of class scope that doesn't belong to any method. They are stored in heap.
// Heap is shared among all threads. Scope of elements in heap is global.
// Memory allocated to heap lives until the program ends.
