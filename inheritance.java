// inheritance: it has super class and sub class;it shows how both are sharing information.
// types of inheritance: single inheritances, multi-level heritance, multiple iheritance 
// single inheritances:  a class inherit properties and methods from only one superclass. this is the most basic from of inheritance and is implemented in java using the extends keyword

class superclass{
    //properties and methos
}
class subclass extends superclass{
    //properties and method
}

//muli-level inheritance: a class inherits properties and method from a superclass, which in turn inherits properties and method from another superclass. this form a chain of inheritance.

class superclass1{
    //properties and methods
}
class superclass2 extends superclass1{
    //properties and methods
}
class subclass extends superclass2{
    //properties and methods
}

//heritance inheritance: multiple subclass inherit properties and method from a single superclass.

class superclass{
    //properties and methods
}
class subclass1 extends superclass{
    //properties and methods
}
class subclass2 extends superclass{
    //properties and method
}

// multiple interitance: a class inherits properties and methods from multiple superclass through interface. java doesnot support multiple inheritance of classes but it allows a class to implement multiple interface
// why multiple inheritance is not supported
class superclass1{
    public void walk(){
        system.out.printin("superclass is walk method");
    }
}
class superclass2{
    public void walk(){
        system.out.printin("superclass2 walk method");
    }
}
class child extends superclass1, superclass2{
    //whicj walk method should child class use?
    //superclass1 or superclass2

}

// child class inherits from both superclass1 and superclass2. both have a method called "walk" with same signature but with different implementation .it is not clear whicj method among two to use, this leads to ambiguity and confusion
