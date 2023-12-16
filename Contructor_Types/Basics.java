// we can't use constructor with static, final, abstract, synchronized, native, and strictfp modifiers
// we can use access modifiers with a constructor - public, private, protected, default
// we can't use return type with a constructor
// we can use parameters with a constructor
// we can use constructor overloading

// Singleton class: A class that can have only one instance.
// Singleton class can be used for database connections, logging, caching and thread pool.

// private constructor
// It is used to restrict the instantiation of a class.
// Objects of class with private constructor are only accessible within the class. 
// It can be used in utility classes where all members of the class are static and we don't want to allow creating instance of the class.
// It can used in class of constants to prevent instantiation. class of constants means final class with only static final members.
// It can be used to create singleton class.
// It can be used to prevent inheritance.
