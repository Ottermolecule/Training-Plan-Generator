public class Exercises{
    String name;
    String type;
    int order;
    String noFollow;
    String intensity;
    String Description;
    public Exercises(String name, String type, int order, String noFollow, String intensity, String Description) {
        this.name = name;
        this.type = type;
        this.order = order;
    }

    public String getIntensity(){
        return this.intensity;
    }

//    public static void Exercises(String Name, String Type, int Order, String noFollow, String Intensity, String Description){
//
//        Exercises stretching = new Exercises("stretching")
//    }
}
