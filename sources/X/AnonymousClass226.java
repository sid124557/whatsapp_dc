package X;

/* renamed from: X.226  reason: invalid class name */
public enum AnonymousClass226 {
    TWENTY_FOUR_HOURS(24, 2, false),
    SEVEN_DAYS(7, 3, false),
    THIRTY_DAYS(30, 3, false),
    FIVE_SECONDS(5, 0, true),
    FIFTEEN_SECONDS(15, 0, true);
    
    public final boolean debugMenuOnlyField;
    public final int displayUnit;
    public final int durationInDisplayUnit;

    /* access modifiers changed from: public */
    static {
        AnonymousClass226[] r0;
        A00 = C73653fr.A00(r0);
    }

    /* access modifiers changed from: public */
    AnonymousClass226(int i, int i2, boolean z) {
        this.durationInDisplayUnit = i;
        this.displayUnit = i2;
        this.debugMenuOnlyField = z;
    }
}
