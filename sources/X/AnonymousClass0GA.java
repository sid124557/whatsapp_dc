package X;

/* renamed from: X.0GA  reason: invalid class name */
public enum AnonymousClass0GA {
    PRIMARY(0.1f, 0, 0, true),
    PRIMARY_FALLBACK(0.2f, 1, 0, false),
    ELEVATED(1.0f, 2, 5, false),
    PERSISTENT(0.6f, 3, 5, false);
    
    public final float colorAlphaMultiplierDark;
    public final float colorAlphaMultiplierLight;
    public final float cornerRadiusDp;
    public final boolean hasFoaStroke;
    public final int shadowColorDark;
    public final int shadowColorLight;
    public final float shadowSizeDp;
    public final int verticalOffsetDp;

    /* access modifiers changed from: public */
    AnonymousClass0GA(float f, int i, int i2, boolean z) {
        this.cornerRadiusDp = 4.0f;
        this.shadowSizeDp = 12.0f;
        this.colorAlphaMultiplierLight = r6;
        this.colorAlphaMultiplierDark = f;
        this.shadowColorLight = -13350828;
        this.shadowColorDark = -14931149;
        this.hasFoaStroke = z;
        this.verticalOffsetDp = i2;
    }
}
