class Person:
  def __init__(self, fname, lname):
    self.firstname = fname
    self.lastname = lname

  def printname(self):
    print(self.firstname, self.lastname)

x = Person("John", "Doe")
x.printname()   

#Create a class Student, which will inherit the prop and methods from the Person class
class Student(Person):
  pass

x = Student("Mike", "Olsen")
x.printname()
