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

    public void setSellIn(int sellIn) {
        this.sellIn = sellIn;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    protected void updateSellIn() {
        setSellIn(getSellIn() - 1);
    }

    protected void updateQuality() {
        if (getSellIn() > 0) {
            setQuality(getQuality() - 1);
        } else {
            setQuality(getQuality() - 2);
        }
        if (getQuality() < 0) {
            setQuality(0);
        }
    }

    public void update() {
        updateQuality();
        updateSellIn();
    }

}
