package templatemethodpattern;

public class Main {
    public static void main(String[] args) {
        EnglishTeacher eng = new EnglishTeacher();
        MathTeacher mt = new MathTeacher();
        KoreanTeacher kr = new KoreanTeacher();

        eng.startClass();
        mt.startClass();
        kr.startClass();
    }
}
