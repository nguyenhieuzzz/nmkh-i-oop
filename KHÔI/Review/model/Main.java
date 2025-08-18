class CellPhone {
    // Constructor for CellPhone
    CellPhone() {  
        // Initialization code here
    }

    public void ring(Tune t) {
        t.play();  // Calling play method from Tune class
    }
}

class Tune {
    public void play() {
        System.out.println("Tune.play()");  // Output when play is called from Tune
    }
}

class ObnoxiousTune extends Tune {
    ObnoxiousTune() {
        System.out.println("ObnoxiousTune.play()");  // Output when play is called from ObnoxiousTune
    }
}
