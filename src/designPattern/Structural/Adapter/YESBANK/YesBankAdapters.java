package designPattern.Structural.Adapter.YESBANK;

import designPattern.Structural.Adapter.BankAPIforPhonepay;

public class YesBankAdapters implements BankAPIforPhonepay {
    yesBank_remote yb  = new yesBank_remote();


    @Override
    public int checkBal(int Ano) {
        return yb.getBalance(Ano);
    }

    @Override
    public void addMoney(int Ano, int money) {
        yb.addMoney(Ano,money);

    }

    @Override
    public void subMoney(int Ano, int money) {
        yb.substractMoney(Ano, money);

    }
}
