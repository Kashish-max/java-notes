// For each class, a seperate bytecode file is created
// Classes can't have same name as that of package
// Classes can start with any letter, $, _ but not with numbers
// Classes can start with uppercase or lowercase but convention is to start with uppercase

// Four Access modifiers: public, private, protected, default(package-private)
// public: accessible from anywhere - inside package(all classes), outside package(all classes)
// protected: accessible from package and outside package but through inheritance only - inside package(all classes), outside package(subclass only)
// default: accessible within package only - inside package(all classes), outside package(no class)
// private: accessible within class only - inside package(native class only), outside package(no class)

// Non-access modifiers: static, final, abstract, synchronized, volatile, transient, native
// static: can be used with variables, methods, blocks, nested classes. Attributes and methods belongs to class rather than instance of class.
// final: can be used with variables, methods, classes. final variables can't be changed. final methods can't be overridden. final classes can't be inherited.
// abstract: can be used with classes, methods. abstract classes can't be instantiated. abstract methods must be inherited and implemented by subclass.
// synchronized: can be used with methods, blocks. 
// volatile: can be used with variables
// transient: can be used with variables
// native: can be used with methods


// Java doesn't support multiple inheritance, i.e., a class can't extend more than one class as mutiple parent classes can have same methods leading to ambiguity.
// Java supports multiple inheritance through interfaces. A class can implement more than one interface.