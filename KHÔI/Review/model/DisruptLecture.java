public class DisruptLecture {
    public static void main(String[] args) {
        CellPhone noiseMaker = new CellPhone();  
        ObnoxiousTune ot = new ObnoxiousTune();  // Tạo đối tượng ObnoxiousTune

        noiseMaker.ring(ot);  // gọi phương thức ring() của CellPhone, truyền ObnoxiousTune vào
    }
}

class CellPhone {
    public void ring(Tune t) {
        t.play();  // Gọi phương thức play của đối tượng Tune
    }
}

class Tune {
    public void play() {
        System.out.println("Tune.play()");  // Output khi play() được gọi từ Tune
    }
}

class ObnoxiousTune extends Tune {
    @Override
    public void play() {
        System.out.println("ObnoxiousTune.play()");  // Output khi play() được gọi từ ObnoxiousTune
    }
}

