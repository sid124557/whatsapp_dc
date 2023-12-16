package X;

/* renamed from: X.7ea  reason: invalid class name and case insensitive filesystem */
public final class C155267ea {
    public static final int[] A00 = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};
    public static final int[] A01 = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    public static int A00(C158517k6 r2) {
        int A002 = r2.A00(4);
        if (A002 == 15) {
            return r2.A00(24);
        }
        if (A002 < 13) {
            return A01[A002];
        }
        throw new C140626uD((String) null, (Throwable) null, true);
    }
}
