1. Write an interface name InterfaceSet with the following components:

 Attribute: max an integer variable initialize to 10, static and final

Method signatures:

 - public void add(int e) -> this method adds e in an array., e is not added in the array  if e already exists in the array. Attribute count in increment every successful add of e.


- public void display( ) -> display the contents of the array (NOTE: the array is an attribute in the class later)

- public int count( ) -> returns the value of count (NOTE: count is an attribute in the class later)

- public boolean isElementOf(int e) -> returns true if e is in the array false if not

- public int getElement(int index) -> returns the value in array at index

- public Set union(Set s) -> returns the union

     Example:

    current Object set[] ={1,2,3};

     Set s[] = {1,3,10,5};

    returns: Set union[]={1,2,3,10,5};

    NOTE: current object added first, then parameter Set s.

2. Write a class Set that implements interface InterfaceSet. Class Set has the following attributes: set - an array of integer and an integer variable count. Default constructor must set the size of the array with the max variable from interface. A constructor that accepts an integer variable size and set the array size of attribute set array to size. 

NOTE: remove the public modifier in defining interface and class