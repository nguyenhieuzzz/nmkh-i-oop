class Battery {
    
    public Battery() {
        System.out.println("Battery đã được tạo.");
    }
}

class Disk {
    
    public Disk() {
        System.out.println("Disk đã được tạo.");
    }
}

public class Notebook {
    
    long ram = 1048576;                               
    String name = new String("IBM");                 
    float price = 1995.00f;                          
    Battery bat = new Battery();                       
    Disk d;                                           
    int i = f();                                       

    
    public int f() {
        return 10;
    }

    
    public static void main(String[] args) {
        
        Notebook notebook = new Notebook();

       
        System.out.println("Tên máy: " + notebook.name);
        System.out.println("RAM: " + notebook.ram);
        System.out.println("Giá: " + notebook.price);
        System.out.println("Giá trị i (từ hàm f()): " + notebook.i);

        
        if (notebook.d == null) {
            System.out.println("Disk chưa được khởi tạo (null).");
        }
    }
}
