public class BonusService {
    public long calculate(long amount, boolean registered) {
        int percent = registered ? 3 : 1;
        long bonus = amount * percent / 100;
        long limit = 500;
        if (bonus > limit) { //1
            bonus = limit;
        }
        //  if (bonus < limit) //2
        //      if (amount == 0) { //3
        //           System.out.println("Совершите покупку, чтобы получить бонусы!");
        //        }
        //   if (!registered) { //4
        //   }
        //   boolean b = amount < 99;
        //  if (!registered && b) { //5
        //      System.out.println("Суммы покупки недостаточно для начисления бонусов"); //4
        //  }

        return bonus;
    }
}
//После вебинара с разбором поняла, что делала вообще не там) не в test)