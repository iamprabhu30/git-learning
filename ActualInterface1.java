interface firstclass {
    void m1();
    void m2();
}

interface Secondclass extends firstclass {
    void m3();
    void m4();
}

interface Thirdclass extends Secondclass {
    void m5();
    void m6();
}

abstract class Fclass implements Thirdclass{
    void m7() {
        System.out.println("Hi i'm from method 7");
    }
    abstract void m8();
}

class Interface extends Fclass {
    void m8() {
        System.out.println("Hi i'm from method 8");
		
    }
	public void m1() {
        System.out.println("Hi i'm from method 1");
    }
    public void m2() {
        System.out.println("Hi i'm from method 2");
    }
    public void m3() {
        System.out.println("Hi i'm from method 3");
    }
    public void m4() {
        System.out.println("Hi i'm from method 4");
    }
    public void m5() {
        System.out.println("Hi i'm from method 5");
    }
    public void m6() {
        System.out.println("Hi i'm from method 6");
    }
}

//class EGInterface1 implements Thirdclass {
   // public void m1() {
    //    System.out.println("Hi i'm from method 1");
    //
   // public void m2() {
    //    System.out.println("Hi i'm from method 2");
   // }
  //  public void m3() {
   //     System.out.println("Hi i'm from method 3");
   // }
  //  public void m4() {
  //      System.out.println("Hi i'm from method 4");
  //  }
  //  public void m5() {
  //      System.out.println("Hi i'm from method 5");
  //  }
   // public void m6() {
   //     System.out.println("Hi i'm from method 6");
  //  }
//}

class ActualInterface1 {
    public static void main(String[] args) {
        //EGInterface1 i = new EGInterface1();
       
        Interface i = new Interface();
		 i.m1();
        i.m2();
        i.m3();
        i.m4();
        i.m5();
        i.m6();
		i.m7();
        i.m8();
    }
}
