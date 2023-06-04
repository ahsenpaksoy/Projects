package coffeemachine;

public class Kahve {
    String hangiKahve;
    String sut;
    String seker;
    int kacSeker;
    String boyut;

    @Override
    public String toString() {
        return "Kahve{" +
                "hangiKahve='" + hangiKahve + '\'' +
                ", sut='" + sut + '\'' +
                ", seker='" + seker + '\'' +
                ", kacSeker=" + kacSeker +
                ", boyut='" + boyut + '\'' +
                '}';
    }
}
