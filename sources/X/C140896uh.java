package X;

/* renamed from: X.6uh  reason: invalid class name and case insensitive filesystem */
public enum C140896uh {
    TOP_LEFT(0.0f, 1.0f, 1.0f, 0),
    TOP_RIGHT(0.0f, 2.0f, 1.0f, 1),
    BOTTOM_LEFT(1.0f, 1.0f, 2.0f, 2),
    BOTTOM_RIGHT(1.0f, 2.0f, 2.0f, 3);
    
    public final float bottom;
    public final float left;
    public final float right;
    public final float top;

    /* access modifiers changed from: public */
    static {
        TOP_LEFT = new C140896uh("TOP_LEFT", 0.0f, 0.0f, 1.0f, 1.0f, 0);
        TOP_RIGHT = new C140896uh("TOP_RIGHT", 1.0f, 0.0f, 2.0f, 1.0f, 1);
        BOTTOM_LEFT = new C140896uh("BOTTOM_LEFT", 0.0f, 1.0f, 1.0f, 2.0f, 2);
        BOTTOM_RIGHT = new C140896uh("BOTTOM_RIGHT", 1.0f, 1.0f, 2.0f, 2.0f, 3);
    }

    /* access modifiers changed from: public */
    C140896uh(float f, float f2, float f3, int i) {
        this.left = r2;
        this.top = f;
        this.right = f2;
        this.bottom = f3;
    }
}
