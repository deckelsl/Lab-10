class Cookie{
  private int cookieNum;
  private double temp;
  private double time;
  private boolean baked;

  Cookie(){
    cookieNum = 0;
    temp = 0;
    time = 0;
    baked = false;
  }

  Cookie(int aCookieNum, double aTemp, double aTime){
    cookieNum = aCookieNum;
    temp = aTemp;
    time = aTime;
    baked = false;
  }

  boolean getBaked(){
    return baked;
  }

  void setCookieNum(int theCookieNum){
    cookieNum = theCookieNum;
  }

  void bake(double theTemp, double theTime){
    temp = theTemp;
    time = theTime;
    System.out.println(cookieNum + " cookies were baked at " + temp + " degrees F for " + time + " minutes");
    baked = true;
  }
}