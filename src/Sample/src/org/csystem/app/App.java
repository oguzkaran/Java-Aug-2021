/*----------------------------------------------------------------------------------------------------------------------
    Character sınıfının char parametreli valuOf metodu ['\u0000', '\u007F'] aralığındaki karakterlere ilişkin sıra
    numarasını ön bellekten alır. Bu karakter aslında standart ASCII karaktelerdir. Bu lar dışındaki değerler için ön bellek
    kullanımı garanti değildir.
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {
    public static void main(String [] args)
    {
        Character c1 = Character.valueOf('D');
        Character c2 = Character.valueOf('D');

        System.out.println(c1 == c2);

        Character c3 = Character.valueOf('Ş');
        Character c4 = Character.valueOf('Ş');

        System.out.println(c3 == c4);
    }
}

