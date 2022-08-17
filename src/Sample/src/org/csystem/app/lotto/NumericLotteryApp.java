/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Sayısal loto kuponu üreten bir program tasarlayıp yazınız
	(İleride daha iyisi yazılacaktır)
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app.lotto;

import org.csystem.util.array.ArrayUtil;

import java.util.Scanner;

public class NumericLotteryApp {
    public static void run()
    {
        Scanner kb = new Scanner(System.in);
        NumericLottery numericLottery = new NumericLottery();

        for (;;) {
            System.out.print("Kaç tane kupon oynamak istersiniz:");
            int n = Integer.parseInt(kb.nextLine());

            if (n <= 0)
                break;
            ArrayUtil.print(2, numericLottery.getNumbers(n));
        }

        System.out.println("Tekrar yapıyor musunuz?");
    }
}
