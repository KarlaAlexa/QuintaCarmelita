package QuintaCarmelita.com;

public class User {
    public String name;
    public String email;

    public User(){
        //public no-arg constructor neededd
    }

    public User(String name, String email){
        this.name= name;
        this.email= email;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

    public void setEmail(String email){
        this.email=email;
    }

    public String getEmail(){
        return email;
    }

}
