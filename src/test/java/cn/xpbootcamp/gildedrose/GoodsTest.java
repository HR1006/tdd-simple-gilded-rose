package cn.xpbootcamp.gildedrose;

import org.junit.jupiter.api.Test;

public class GoodsTest {

    @Test
    void generalGoodsWhenInTheWarrantyPeriod() {
        int[][] generalGoodsDataArray = {
                {10, 20, 9, 19},
                {2, 0, 1, 0},
                {3, 6, 2, 5}
        };
        for (int[] generalGoodsData : generalGoodsDataArray) {
            Goods goods = new Goods(generalGoodsData[0], generalGoodsData[1]);
            goods.update();
            assert goods.getQuality() == generalGoodsData[3];
        }
    }

}
