package cn.xpbootcamp.gildedrose;

public class BackstagePass extends Goods {

    public BackstagePass() {
    }

    public BackstagePass(int sellIn, int quality) {
        super(sellIn, quality);
    }

    @Override
    protected void updateQuality() {
        int sellIn = getSellIn();
        int quality = getQuality();
        if (sellIn <= 0) {
            quality = 0;
        } else if (sellIn <= 5) {
            quality += 3;
        } else if (sellIn <= 10) {
            quality += 2;
        } else {
            quality += 1;
        }
        if (quality > 50) {
            quality = 50;
        }
        setQuality(quality);
    }

}
