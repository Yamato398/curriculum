package study;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * 本課題では、コレクションフレームワークのList系クラスとMap系クラスの基本的な記述を学びましょう。
 * 現場で必ず使用するものなので、ポイントをしっかり押さえておきましょう。
 *
 * 問①〜問③まであります。
 * 問②に関しては、コメントを記述してください。
 *
 */
public class Study {

    public static final String SHOP_SHOHIN_00 = "バナナ";
    public static final String SHOP_SHOHIN_01 = "牛乳";
    public static final String SHOP_SHOHIN_02 = "豚肉";
    public static final String SHOP_SHOHIN_03 = "コロッケ";

    public static void main(String args[]) {

        // ① 定数を全て使って、String型のListを記述してください。
    	 List<String> list = new LinkedList<>();

        //要素の追加
    	 list.add(SHOP_SHOHIN_00);
         list.add(SHOP_SHOHIN_01);
         list.add(SHOP_SHOHIN_02);
         list.add(SHOP_SHOHIN_03);

        // ② 以下の「shopMap.put(shohinList.get(1), 180);」の処理について、コメントを記述してください。
        /*
         * [shopMapという配列の二番目の要素に180を代入]
         *
         */
        LinkedHashMap<String, Integer> shopMap = new LinkedHashMap<String, Integer>();
        shopMap.put(list.get(0), 125);
        shopMap.put(list.get(1), 180);
        shopMap.put(list.get(2), 350);
        shopMap.put(list.get(3), 100);

        // ③ カリキュラムを参考に拡張for文を使って、課題の画像と同じ表示になるよう記述してください。
        // 「shohinList」と「shopMap」が保持する値を上手く利用しましょう。
//        for (int i = 0; i < list.length; i++) {
//            System.out.println(sampleList.get(i));
        
//        System.out.println(shopMap);
//        System.out.println(shopMap.get(list.get(0)));
//        System.out.println(shopMap.get(list.get(1)));
//        System.out.println(shopMap.get(list.get(2)));
//        System.out.println(shopMap.get(list.get(3)));
   
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i) + "=" + shopMap.get(list.get(i)) + "円になります！");
        }
        


    }
}