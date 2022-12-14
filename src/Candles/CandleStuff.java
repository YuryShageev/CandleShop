package Candles;

public abstract class CandleStuff {

    private byte box;
    private byte candle;
    private byte sticker;
    private byte filling;
    private byte lace;

    private String candleColor;
    private String stickerName;
    private String boxColor;
    private String laceColor;

    public CandleStuff(byte box, byte candle, byte sticker, byte filling, byte lace) {
        this.box = box;
        this.candle = candle;
        this.sticker = sticker;
        this.filling = filling;
        this.lace = lace;
    }

    public CandleStuff(String candleColor, String stickerName, String boxColor, String laceColor) {
        this.candleColor = validateLine(candleColor);
        this.stickerName = validateLine(stickerName);
        this.boxColor = validateLine(boxColor);
        this.laceColor = validateLine(laceColor);
    }

    public String validateLine(String value) {
        if (value != null || !value.isBlank() || !value.isEmpty()) {
            return value;
        } else {
            throw new IllegalArgumentException("Этот параметр должен быть заполнен");
        }
    }

    public byte validateCost(byte value) {
        if (value != 0 && value > 0) {
            return value;
        } else {
            throw new RuntimeException("Стоимость должна быть указана");
        }
    }

    public byte getBox() {
        return box;
    }

    public void setBox(byte box) {
        this.box = box;
    }

    public byte getCandle() {
        return candle;
    }

    public void setCandle(byte candle) {
        this.candle = candle;
    }

    public byte getSticker() {
        return sticker;
    }

    public void setSticker(byte sticker) {
        this.sticker = sticker;
    }

    public byte getFilling() {
        return filling;
    }

    public void setFilling(byte filling) {
        this.filling = filling;
    }

    public byte getLace() {
        return lace;
    }

    public void setLace(byte lace) {
        this.lace = lace;
    }

    public String getCandleColor() {
        return candleColor;
    }

    public void setCandleColor(String candleColor) {
        this.candleColor = candleColor;
    }

    public String getStickerName() {
        return stickerName;
    }

    public void setStickerName(String stickerName) {
        this.stickerName = stickerName;
    }

    public String getBoxColor() {
        return boxColor;
    }

    public void setBoxColor(String boxColor) {
        this.boxColor = boxColor;
    }

    public String getLaceColor() {
        return laceColor;
    }

    public void setLaceColor(String laceColor) {
        this.laceColor = laceColor;
    }
}
