package X;

/* renamed from: X.6xs  reason: invalid class name and case insensitive filesystem */
public enum C142836xs {
    LEFT(0),
    TOP(1),
    RIGHT(2),
    BOTTOM(3);
    
    public final int mIntValue;

    public static C142836xs A00(int i) {
        if (i == 0) {
            return LEFT;
        }
        if (i == 1) {
            return TOP;
        }
        if (i == 2) {
            return RIGHT;
        }
        if (i == 3) {
            return BOTTOM;
        }
        throw AnonymousClass000.A0G("Unknown enum value: ", AnonymousClass001.A0o(), i);
    }

    public static void A01(String str, StringBuilder sb, float[] fArr, int i) {
        C142836xs A002 = A00((int) fArr[i + 1]);
        float f = fArr[i + 2];
        sb.append(str);
        sb.append(A002);
        sb.append(": ");
        sb.append(f);
    }

    /* access modifiers changed from: public */
    C142836xs(int i) {
        this.mIntValue = i;
    }
}
