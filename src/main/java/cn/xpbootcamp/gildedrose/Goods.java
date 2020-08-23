package cn.xpbootcamp.gildedrose;

public class Goods {

    private int sellIn;

    private int quality;

    public Goods() {
    }

    public Goods(int sellIn, int quality) {
        this.sellIn = sellIn;
        this.quality = quality;
    }

    public int getSellIn() {
        return sellIn;
    }

    private void subSellIn() {
        this.sellIn -= 1;
    }

    public int getQuality() {
        return quality;
    }

    private void subQuality() {
        if (this.sellIn > 0) {
            this.quality -= 1;
        }
        if (this.quality < 0) {
            this.quality = 0;
        }
    }

    public void update() {
        subSellIn();
        subQuality();
    }

}
