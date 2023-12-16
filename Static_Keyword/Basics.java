// Static members of class: static variables, static methods, static blocks, static nested classes
// static keyword can be used only in a 'class scope'. It can't be used in a 'method scope'
// Static members of a class can access only static members of outer class
// Static members belong to class and not to its instances
// Static members of a class can be accessed using the class name without creating instance of the class
// Static members helps in memory management as they are allocated memory only once at the time class is loaded
// Static members are shared among all instances of the class
// Even though static members can be accessed using instance of the class, it is not recommended to do so
// Changing static variable of one instance changes it for all instances
// Static block is used to initialize static variables. It is executed only once when class is loaded that is when it is accessed for the first time.
// constructor is used to initialize instance variables. It is executed each time when an instance of the class is created.