package day5;
class par{
    par(){
        System.out.println("This is parent class");
    }
}
class chi{
    chi(){
        super();
        System.out.println("This is Child class");
    }
}

public class super_key_constructor {
    chi obj =new chi();
    
}
