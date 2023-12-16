package X;

import android.util.Log;

/* renamed from: X.7mV  reason: invalid class name and case insensitive filesystem */
public final class C159817mV {
    public static final int[] A00 = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};
    public static final int[] A01 = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    public static AnonymousClass7JX A00(C160807oL r9, boolean z) {
        int i;
        int i2;
        int i3;
        int A04 = r9.A04(5);
        if (A04 == 31) {
            A04 = r9.A04(6) + 32;
        }
        int A042 = r9.A04(4);
        if (A042 == 15) {
            i2 = r9.A04(24);
        } else if (A042 < 13) {
            i2 = A01[A042];
        } else {
            throw new AnonymousClass6u7();
        }
        int A043 = r9.A04(4);
        String A0Y = AnonymousClass000.A0Y("mp4a.40.", AnonymousClass001.A0o(), i);
        if (i == 5 || i == 29) {
            int A044 = r9.A04(4);
            if (A044 == 15) {
                i3 = r9.A04(24);
            } else if (A044 < 13) {
                i3 = A01[A044];
            } else {
                throw new AnonymousClass6u7();
            }
            i = r9.A04(5);
            if (i == 31) {
                i = r9.A04(6) + 32;
            }
            if (i == 22) {
                A043 = r9.A04(4);
            }
        }
        if (z) {
            if (!(i == 1 || i == 2 || i == 3 || i == 4 || i == 6 || i == 7 || i == 17)) {
                switch (i) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw AnonymousClass6u7.A02("Unsupported audio object type: ", AnonymousClass001.A0o(), i);
                }
            }
            if (r9.A0D()) {
                Log.w("AacUtil", "Unexpected frameLengthFlag = 1");
            }
            if (r9.A0D()) {
                r9.A09(14);
            }
            boolean A0D = r9.A0D();
            if (A043 != 0) {
                if (i == 6 || i == 20) {
                    r9.A09(3);
                }
                if (A0D) {
                    if (i == 22) {
                        r9.A09(16);
                    } else if (i == 17 || i == 19 || i == 20 || i == 23) {
                        r9.A09(3);
                    }
                    r9.A09(1);
                }
                switch (i) {
                    case 17:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        int A045 = r9.A04(2);
                        if (A045 == 2 || A045 == 3) {
                            throw AnonymousClass6u7.A02("Unsupported epConfig: ", AnonymousClass001.A0o(), A045);
                        }
                }
            } else {
                throw C18320x8.A0m();
            }
        }
        int i4 = A00[A043];
        if (i4 != -1) {
            return new AnonymousClass7JX(i3, i4, A0Y);
        }
        throw new AnonymousClass6u7();
    }
}
