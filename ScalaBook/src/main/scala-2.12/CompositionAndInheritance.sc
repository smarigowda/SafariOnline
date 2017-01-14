abstract class Element {
  // no abstract modifier is necessary
  // declaration
  def contents: Array[String]
  // parameter-less methods as apposed to empty param methods
  def height: Int = contents.length
  def width: Int = if(height == 0 ) 0 else contents(0).length

  // uniform access principle
  // pre-computed when the class is initialized
//  val height: Int = contents.length
//  val width: Int = if(height == 0 ) 0 else contents(0).length


  // do not define a method which has side-effects as parameter less
  // ex: if the method performs an operation
  // ex: if it merely provides access to a property then its ok to
  // define it as parameter less method and leave parenthesis off
}

new Element