public class HW1 {
    public static void main(String[] args) {
        boolean a = true;
        boolean b;
        byte d = 5;
        short s = 128;
        int i = s;
        System.out.println((float) (d + s) / i);  // расширение
        System.out.println((byte) (d + s) / i);    // сужение
        System.out.println((byte) (d + s)); // в консоль - "-123", сумма чисел выходит за пределы значений типа byte
        System.out.println((byte) (5 + 122)); // в консоль 127
        System.out.println((d + s) / i);
        long l = i - d;
        double dd = (s * s) / (d * d);   // ??? В консолть - 655.0, вместо 655,36
        System.out.println(dd);
        // dd = (double) (s*s)/(d*d);   // ??? В консоль - 655,36
        //System.out.println(dd);
        float fl = (float) dd / d;   // В консоль 131.0. После приведения типа переменной dd к double - 131.07199
        System.out.println(fl);
        System.out.println((int) dd);
        char c = '@';
        String st = "Java";
        System.out.println(c + st + c);
        s = d;
        b = false;
        System.out.println(s);
        System.out.println(a = b);
        int m = 1;
        //int n = ++m;  // В консоль 2 и 2
        //int n = m++; // В консоль 1 и 2
        //int n = --m; // В консоль 0 и 0
        int n = m--; // В консоль 1 и 0
        System.out.println(n);
        System.out.println(m);


    }
}
