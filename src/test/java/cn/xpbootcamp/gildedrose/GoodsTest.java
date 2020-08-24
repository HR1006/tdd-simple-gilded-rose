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

    @Test
    void generalGoodsWhenOutTheWarrantyPeriod() {
        int[][] generalGoodsDataArray = {
                {0, 6, -1, 4},
                {-1, 6, -2, 4}
        };
        for (int[] generalGoodsData : generalGoodsDataArray) {
            Goods goods = new Goods(generalGoodsData[0], generalGoodsData[1]);
            goods.update();
            assert goods.getQuality() == generalGoodsData[3];
        }
    }

    @Test
    void BackstagePassWhenInTheWarrantyPeriod() {
        int[][] generalGoodsDataArray = {
                {15, 20, 14, 21},
                {10, 45, 9, 47},
                {9, 45, 8, 47},
                {10, 49, 9, 50},
                {10, 50, 9, 50},
                {5, 49, 4, 50},
                {5, 45, 4, 48},
                {1, 20, 0, 23},
        };
        for (int[] generalGoodsData : generalGoodsDataArray) {
            BackstagePass goods = new BackstagePass(generalGoodsData[0], generalGoodsData[1]);
            goods.update();
            assert goods.getQuality() == generalGoodsData[3];
        }
    }

}
