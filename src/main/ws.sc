object hello {
  class Employee (val firstName:String, val lastName:String) //private constructor!

  object Employee {
    def apply(firstName:String, lastName:String) = new Employee(firstName, lastName)
  }
  var a = Employee.apply("Aleksander", "Neufied")
  a.firstName
  val b = Employee("Jamie", "Pindar")
  a.lastName
}