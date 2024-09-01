public class KonversiTipeData {
    public static void main(String[] args) {
        byte tipeDataByte = 10;
        short tipeDataShort = tipeDataByte;
        int tipeDataInt = tipeDataShort;
        long tipeDataLong = tipeDataInt;
        float tipeDataFloat = tipeDataLong;
        double tipeDataDouble = tipeDataFloat;

        int tipeDataInteger = -129;
        int tipeDataByte2 = (byte) tipeDataInteger;

        System.out.println(tipeDataByte2);
    }
}
