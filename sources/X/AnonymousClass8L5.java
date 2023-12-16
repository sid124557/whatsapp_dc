package X;

import java.io.Serializable;

/* renamed from: X.8L5  reason: invalid class name */
public class AnonymousClass8L5 implements Serializable {
    public static final long serialVersionUID = 8153954923060974396L;
    public final int cellHighWaterMarkDeltaMs = 0;
    public final float cellLowWaterMarkMultiplier = 0.0f;
    public final int cellMaxLowWaterMarkMs = 0;
    public final int cellMinLowWaterMarkMs = 0;
    public final float waterMarkHighMultiplier = 0.0f;
    public final float waterMarkLowMultiplier = 0.0f;
    public final int wifiHighWaterMarkDeltaMs = 0;
    public final float wifiLowWaterMarkMultiplier = 0.0f;
    public final int wifiMaxLowWaterMarkMs = 0;
    public final int wifiMinLowWaterMarkMs = 0;

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WifiMinLowWaterMarkMs=");
        A0o.append(this.wifiMinLowWaterMarkMs);
        A0o.append(",WifiMaxLowWaterMarkMs=");
        A0o.append(this.wifiMaxLowWaterMarkMs);
        A0o.append(",WifiLowWaterMarkMultiplier=");
        A0o.append(this.wifiLowWaterMarkMultiplier);
        A0o.append(",WifiHighWaterMarkDeltaMs=");
        A0o.append(this.wifiHighWaterMarkDeltaMs);
        A0o.append(",CellMinLowWaterMarkMs=");
        A0o.append(this.cellMinLowWaterMarkMs);
        A0o.append(",CellMaxLowWaterMarkMs=");
        A0o.append(this.cellMaxLowWaterMarkMs);
        A0o.append(",CellLowWaterMarkMultiplier=");
        A0o.append(this.cellLowWaterMarkMultiplier);
        A0o.append(",CellHighWaterMarkDeltaMs=");
        A0o.append(this.cellHighWaterMarkDeltaMs);
        A0o.append(",WaterMarkLowMultipler=");
        A0o.append(this.waterMarkLowMultiplier);
        A0o.append(",WaterMarkHighMultipler=");
        A0o.append(this.waterMarkHighMultiplier);
        return A0o.toString();
    }
}
