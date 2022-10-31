public class NumberSystems {
    public static void main(String[] args) {
        // jak wygląda algorytm przeliczania systemów liczbowych
        // system dziesiętny 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 - mamy w nim 10 elementów
        // 154 -> (1*10^2) + (5*10^1) + (4*10^0) = (1*100) + (5*10) + (4*1) = 100 + 50 + 4 = 154
        // elementy biorące udział w systemie to (0,1,2,3,4,5,6,7,8,9)

        // system dwójkowy (binarny)
        // liczbę 101 w xsystemie dwójkowym przeliczamy na liczbe w systenmie dziesiętnym
        // 101 -> (1 * 2^2) + (0*2^1) + (1*2^0) = (1*4) + 0 + 1 = 4 + 1 = 5
        // elementy biorace udział w systemie (0,1)

        // system ósemkowy (oktalny)
        // zamieniamy liczbę 47 z systemu ósemkowego na system dziesiętny
        // 47 -> 4 * 8^1 + 7 * 8^0 = 4*8 + 7 = 32 + 7 = 39
        // elementy biorące udział w systemie (0,1,2,3,4,5,6,7)

        // system szenastkowy (heksadecymalny)
        // 3af - przekształcamy liczbę z systemu szesnastkowego na dziesiętny
        // mamy 16 elementów - (0,1,2,3,4,5,6,7,8,9,a,b,c,d,e,f)
        // 3af -> (3 * 16^2) + (a*16^1) + (f*16^0) =
        // = (3 * 256) + (10 * 16) + (15 * 1) = 768 + 160 + 15 = 943
        // sprawdzenie czy wyszło dobrze
        System.out.println(Integer.toBinaryString(5)); // liczba 5 to binarnie jest 101
        System.out.println(Integer.toOctalString(39));
        System.out.println(Integer.toHexString(943));

        // rozpisanie wartości binarnych
        // 8 4 2 1  - to jest potęga dwójki w systemie binarnym
        // 1 0 1 1  - to jest jedna jedynka, jedna dwójka, zero czwórek i jedna ósemka
        // -------- *
        // 8+0+2+1 = 11
        //              czyli to jest 1*1 + 1*2 + 0*4 + 1*8 = 8 + 0 + 2 + 1 = 11
        // dowód na to jest następujący:
        int a = 11;
        System.out.println(Integer.toBinaryString(a));


        // Operatory bitowe
        // & - iloczyn bitowy
        // | - suma bitowa
        // ^ - operator XOR (exclusive or)
        // >> - operator przesunięcia bitowego w prawo
        // << - operator przesunięcia bitowego w lewo

        int b = 1; // 0 0 0 1
        int c = 5; // 0 1 0 1
        // ------------------- *
        //            0 0 0 1  - i to w przeliczeniu na system dziesiętny daje nam jeden
        System.out.println(b & c); // bierzemy bity z liczby przechowywanej w zmiennej a
                                // bierzemy bity z liczby przechowywanej w zmiennej b
                                // mnożymy bitowo te bity i jeden razy bitowo 5 daje nam jeden

        // jeszcze raz to samo
        System.out.println(Integer.toBinaryString(b));
        System.out.println(Integer.toBinaryString(c));
        System.out.println("-----------------------");
        System.out.println(Integer.toBinaryString(b & c));

        // żeby to poprawić - to znaczy żeby wyświetlały się też zera a nie tylko same cyfry
        // można zastosować zamiast printline funkcje printf (souf) - skrót
        System.out.printf("%10s\n", Integer.toBinaryString(b));
        System.out.printf("%10s\n", Integer.toBinaryString(c));
        System.out.println("-----------------------");
        System.out.printf("%10s\n", Integer.toBinaryString(b & c));

        // teraz to już jest lepiej, ale jeszcze dobrze by było gdyby były zera pokazane
        System.out.println(String.format("%32s", Integer.toBinaryString(b)));
        System.out.println(String.format("%32s", Integer.toBinaryString(c)));
        System.out.println("-----------------------------------------------");
        System.out.println(String.format("%32s", Integer.toBinaryString(b & c)));

        // ale to jeszcze nie jest to bo nie ma zer w pustych miejscach
        // dlatego stosujemy funkcję replace zamiast pustych miejsc wkląda zera
        System.out.println(String.format("%32s", Integer.toBinaryString(b)).replace(' ', '0' ));
        System.out.println(String.format("%32s", Integer.toBinaryString(c)).replace(' ', '0'));
        System.out.println("-----------------------------------------------");
        System.out.println(String.format("%32s", Integer.toBinaryString(b & c)).replace(' ', '0'));


        // a jak wygląda suma bitowa?
        int d = 1; // 0 0 0 1
        int e = 5; // 0 1 0 1
        // ------------------- +
        //            0 1 0 1  - jeden + jeden jest jeden
        System.out.println(d | e);
        System.out.println(String.format("%32s", Integer.toBinaryString(d)).replace(' ', '0' ));
        System.out.println(String.format("%32s", Integer.toBinaryString(e)).replace(' ', '0'));
        System.out.println("-----------------------------------------------");
        System.out.println(String.format("%32s", Integer.toBinaryString(b | c)).replace(' ', '0'));

        // jak działa XOR
        // 1 1 - jeżeli bity są równe (takie same) to dostajemy 0
        // 1 0 - jeżeli bity są różne to dostajemy 1
        // 0 1 - dostajemy 1
        // 0 0 - dostajemy 0
        int f = 1; // 0 0 0 1
        int g = 5; // 0 1 0 1
        // ------------------- ^
        //            0 1 0 0  -
        System.out.println(d ^ e);
        System.out.println(String.format("%32s", Integer.toBinaryString(f)).replace(' ', '0' ));
        System.out.println(String.format("%32s", Integer.toBinaryString(g)).replace(' ', '0' ));
        System.out.println(String.format("%32s", Integer.toBinaryString(f ^ g)).replace(' ', '0'));
        // no i wychodzi tak jak trzeba

        // przesunięcie bitowe w prawo
        int h = 5;
        System.out.println(h >> 2); // jeżeli wezmę bitowo 5 i przesunę o dwa miejsca w prawo
        // to z takiej liczby 0 1 0 1 będę miał -> 0 0 0 1 (bo jedynka lewa przesunie się na miejsce jedynki prawej)
        System.out.println(String.format("%32s", Integer.toBinaryString(h >> 2)).replace(' ', '0'));

        // przesunięcie bitowe w lewo
        // z liczby 0 1 0 1 -> powstanie 0 1 0 1 0 0 - czyli powstały dwa zera po lewej stronie
        // czyli to jest jakaś grubsza liczba

        System.out.println(String.format("%32s", Integer.toBinaryString(h << 2)).replace(' ', '0'));

        System.out.println("-------------------------------------");
        // o co chodzi z reprezentacją liczb ujemnych
        System.out.println(String.format("%32s", Integer.toBinaryString(1)).replace(' ', '0'));
        System.out.println(String.format("%32s", Integer.toBinaryString(-1)).replace(' ', '0'));
        // transformacja liczby 1 na -1 wygląda nastgępująco
        // 0 0 0 1 - to jest jedynka
        // 1 1 1 0 - i w niej wszystkie bity odwracamy
        // 1 1 1 1 - a na końcu do wszystkiego jeszcze dodajemy 1


        // kolejność wykonywania działań
        System.out.println(6 + 5 / 2); // kolejność wykonywana tak jak w działaniach matematycznych
        






    }
}
