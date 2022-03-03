import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PriceList {
    public static void main(String[] args) {
        List<MobilePhone> mobilePhoneList = new ArrayList<>();
        mobilePhoneList.add(new MobilePhone("Samsung", "Galaxy S22", "Black", 256, 100000));
        mobilePhoneList.add(new MobilePhone("Apple", "iPhone 13 Pro Max", "Blue", 256, 250000));
        mobilePhoneList.add(new MobilePhone("OnePlus", "OnePlus 9", "Green", 256, 76000));
        mobilePhoneList.add(new MobilePhone("Oppo", "Find X3 Neo", "Rеd", 256, 95000));
        mobilePhoneList.add(new MobilePhone("Poco", "Pocophone F1", "Black", 256, 65000));
        mobilePhoneList.add(new MobilePhone("Realme", "GT Master Explore Edition", "gold", 256, 57000));
        mobilePhoneList.add(new MobilePhone("Vivo", "iQOO 9 Pro", "Orange", 256, 80000));
        mobilePhoneList.add(new MobilePhone("Xiaomi", "Xiaomi 12 Pro", "Green", 256, 71000));
        mobilePhoneList.add(new MobilePhone("Huawei", "Huawei P50", "White", 256, 129999));
        mobilePhoneList.add(new MobilePhone("Meizu", "Meizu 18 Pro", "silver", 256, 89000));
        PriceList priceList = new PriceList();
        priceList.priceIfl(mobilePhoneList);

    }

    //    private void choiceByPrice(List<MobilePhone> list) {
//        for (MobilePhone mobilePhone : list) {
//            if (mobilePhone.getPrice() < 100000) {
//                System.out.println(mobilePhone);
//            }
//        }
//    }
    private List<MobilePhone> priceIfl(List<MobilePhone> list) {
        int infl = 5;
        for (MobilePhone mobilePhoneList:list) {
            System.out.println(mobilePhoneList.getPrice()*infl);
        }
        return null;
    }
}