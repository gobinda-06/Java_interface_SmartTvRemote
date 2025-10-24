interface TvRemote {
    void channelChange();
    void volumeChange();
}

interface SmartTvRemote extends TvRemote {
    void wifiConnect();

    // Default methods in interface can have a body
    default void channelChange() {
        System.out.println("Changing Channel on Smart TV");
    }

    default void volumeChange() {
        System.out.println("Changing Volume on Smart TV");
    }
}

// Class implements the interface
class Main implements SmartTvRemote {
    public void wifiConnect() {
        System.out.println("Connecting to Wifi on Smart TV");
    }

    public static void main(String[] args) {
        Main myRemote = new Main();
        myRemote.channelChange();
        myRemote.volumeChange();
        myRemote.wifiConnect();
    }
}
