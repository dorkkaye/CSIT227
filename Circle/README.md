Graded Exercise: Circle and Cylinder

1.       Problem (Circle.java)
a.       Implement a class called Circle for representing a circle. The circle has two data members, a Point object representing the       center of the circle and a float value representing the radius.
a.       Include appropriate constructors for your Circle class.
b.       Encapsulate it.
c.       Also include methods for finding the area and circumference of the circle.
                                area = pi * radius * radius
                                circumference = 2 * pi * radius.
                                (You may use the static constant pi in the Math class)
d.       Override the toString() and equals().
e.       Write a simple main method that creates Circle objects and tests each of the methods that you have defined.
p

2.       Problem (Cylinder.java)
a.       Implement a class called Cylinder. A cylinder has a circle and one additional data member for representing the height (type float).
b.       Create appropriate constructors for your Cylinder class.
c.       Encapsulate it.
d.       Include methods for finding the volume and area of your Cylinder.
          area = 2 * (area of the circle in this cylinder) + 2 * pi * radius + height
          volume = (area of the circle in this cylinder) * height
e.       Override the toString method of the Object class. Try to use the toString of the Circle class and then just concatenate the remaining values.
f.        Override the equals method of the Object class. Two Cylinder objects are equal if they have the same center and the same radius and the same height.
Write a simple main method that creates Cylinder objects and tests each of the methods that you have defined.
