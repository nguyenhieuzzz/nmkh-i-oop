public class Person {
    
    private String name;

    
    public Person() {
    }

    
    public Person(String name) {
        this.name = name;
    }

    
    public String getName() {
        return name;
    }

    
    public void setName(String newName) {
        this.name = newName;
    }

    
    public static void main(String[] args) {
       
        Person person = new Person();

        
        person.setName("Nguyễn Văn A");

        
        System.out.println("Tên người dùng là: " + person.getName());
    }
}

