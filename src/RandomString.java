import java.util.Random;

public class RandomString {

    Random rnd = new Random();

    public char getRandomChar() {

        char c = (char) ('a' + rnd.nextInt(26));
        return c;
    }
    public String getRandomString(){
        RandomString randomString=new RandomString();
        char char1 = randomString.getRandomChar();
        char char2 = randomString.getRandomChar();
        char char3 = randomString.getRandomChar();

        String concat = char1+""+char2+""+char3;
        return concat;
    }
}
