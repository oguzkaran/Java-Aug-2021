package org.csystem.application.lottery;

import org.csystem.util.array.ArrayUtil;

import java.util.Scanner;

public class NumericLotteryApp {
    private NumericLotteryApp()
    {
    }

    public static void run()
    {
        Scanner kb = new Scanner(System.in);
        NumericLottery lottery = new NumericLottery();

        for (;;) {
            System.out.print("Kaç kupon oynamak istersiniz?");
            int n = Integer.parseInt(kb.nextLine());

            if (n <= 0)
                break;

            ArrayUtil.display(2, lottery.getNumbers(n));
        }
    }
}
