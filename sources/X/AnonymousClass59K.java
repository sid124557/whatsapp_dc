package X;

/* renamed from: X.59K  reason: invalid class name */
public enum AnonymousClass59K {
    LEFT_CROP_TO_LEFT(0, r6, r6),
    LEFT_CROP_TO_RIGHT(1, r6, r12),
    TOP_CROP_TO_TOP(2, r0, r18),
    TOP_CROP_TO_BOTTOM(3, r18, r1),
    RIGHT_CROP_TO_RIGHT(4, r12, r20),
    RIGHT_CROP_TO_LEFT(5, r20, r6),
    BOTTOM_CROP_TO_TOP(6, r1, r0),
    BOTTOM_CROP_TO_BOTTOM(7, r1, r1);
    
    public final int direction;
    public final int origin;
    public final int value;

    /* access modifiers changed from: public */
    static {
        AnonymousClass59K[] r1;
        A00 = C73653fr.A00(r1);
    }

    /* access modifiers changed from: public */
    AnonymousClass59K(int i, int i2, int i3) {
        this.value = i;
        this.origin = i2;
        this.direction = i3;
    }
}
