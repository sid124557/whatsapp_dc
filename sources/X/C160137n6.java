package X;

import android.util.Log;

/* renamed from: X.7n6  reason: invalid class name and case insensitive filesystem */
public final class C160137n6 {
    public final float A00;
    public final int A01;
    public final Integer A02;
    public final String A03;
    public final boolean A04;
    public final boolean A05;

    public static boolean A01(String str) {
        try {
            int parseInt = Integer.parseInt(str);
            return parseInt == 1 || parseInt == -1;
        } catch (NumberFormatException e) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("Failed to parse bold/italic: '");
            A0o.append(str);
            C159307lc.A01(AnonymousClass000.A0X("'", A0o), "SsaStyle", e);
            return false;
        }
    }

    public C160137n6(Integer num, String str, float f, int i, boolean z, boolean z2) {
        this.A03 = str;
        this.A01 = i;
        this.A02 = num;
        this.A00 = f;
        this.A04 = z;
        this.A05 = z2;
    }

    public static int A00(String str) {
        try {
            int parseInt = Integer.parseInt(str.trim());
            switch (parseInt) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    return parseInt;
            }
        } catch (NumberFormatException unused) {
        }
        Log.w("SsaStyle", AnonymousClass000.A0V("Ignoring unknown alignment: ", str, AnonymousClass001.A0o()));
        return -1;
    }
}
