class Sugar extends Cookie {
  private String shape;
  private boolean decorated;

  Sugar(){
    shape = "";
    decorated = false;
  }

  Sugar(String aShape){
    shape = aShape;
    decorated = false;
  }

  String getShape(){
    return shape;
  }

  void setShape(String theShape){
    shape = theShape;
  }

  void cutShapes(String bShape, int numCut){
    setCookieNum(numCut);
    shape = bShape;
    System.out.println(numCut + " cookies were cut into " + shape);
  }

  void decorate(){
    if (getBaked() == true){
      decorated = true;
      System.out.println("The cookies were decorated");
    }
    else {
      System.out.println("Make sure to bake the cookies first");
    }
  }
}