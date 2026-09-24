class student{
    String name;
    int age;
    int energy;
    String mood;
    float attendence;
    void setvalue(String n,int a,int e,String m,float at)
    {
        name=n;
        age=a;
        energy=e;
        mood=m;
        attendence=at;
    }
    void skipclass()
    {
        if(energy<=2){
            System.out.println("skip the class");
        }
    }
    void taketest(){
        if(attendence>85){
            System.out.println("i am taking rest");
        }
    }
    void sleep(){
        if(mood == "tired")
        {
            System.out.println("i am feeling sleepy");
        }
    }
    void study(){
        if(mood == "ambetious"){
            System.out.println("i am study");
        }
    }
    void eat(){
        if(energy>=5){
            System.out.println("i am going to eat");

        }
    }
    public static void main(String[] a){
        student s1 = new student();
        s1.setvalue("Alice", 20, 3, "tired", 90.0f);
        s1.skipclass();
        s1.taketest();
        s1.sleep();
        s1.study();
        s1.eat();
        System.out.println(s1.name+" "+s1.age+" "+s1.energy+" "+s1.mood+" "+s1.attendence);

    }

}