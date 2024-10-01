class Cricket{
    public void stats(){
        System.out.println("stats are good");
    }
    public String batting(int x){
        if(x>50)
        return "half century";
        else
        return "duck";
    }
}
public class Demo {
    public static void main(String[] args) {
       Cricket obj=new Cricket();
       obj.stats();
      String str= obj.batting(79);
      System.out.println(str);
    }
    
}
