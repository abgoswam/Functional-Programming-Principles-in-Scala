// https://drive.google.com/file/d/0B9eSRvzszfvpWmc0eF9Ka0phaElLb1ZKUnAwamN5NWl5OFVJ/view

//class User {
//  private String name;
//  private Int age;
//
//  public User(String name, Int age) {
//    this.name  = name;
//    this.age = age;
// }
//  public getAge() {
//    return age;
//  }
//  public setAge(Int age) {
//    this.age = age;
// }
//}
// User joe = new User("Joe", 30)

case class User(name:String, var age:Int)
val joe = User("Joe", 30)

println(joe.age)
println(joe.name)
