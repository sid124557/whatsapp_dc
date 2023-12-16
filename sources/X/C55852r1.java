package X;

import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.net.Uri;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.2r1  reason: invalid class name and case insensitive filesystem */
public final class C55852r1 {
    public final C620633i A00;
    public final AnonymousClass33p A01;
    public final AnonymousClass1VX A02;
    public final C106695a0 A03;
    public final C60132y3 A04;
    public final C60152y5 A05;

    public final C151027Td A00(Integer num, byte b, boolean z) {
        int A022;
        Float A012;
        if (b != 1 && b != 23 && b != 37 && b != 42 && b != 57) {
            return null;
        }
        if (num != null && num.intValue() == 3) {
            AnonymousClass1VX r2 = this.A02;
            int i = 2654;
            if (z) {
                i = 6032;
            }
            C58422vE r4 = C58422vE.A02;
            int A0O = r2.A0O(r4, i);
            int i2 = 2655;
            if (z) {
                i2 = 6029;
            }
            int A0O2 = r2.A0O(r4, i2);
            if (500 <= A0O && A0O < 6001 && 20 <= A0O2 && A0O2 < 101) {
                if (z) {
                    if (r2.A0Y(C58422vE.A01, 6033)) {
                        return new C135596kv(r2);
                    }
                } else if (r2.A0Y(r4, 2653)) {
                    return new C135646l0(r2);
                }
            }
        }
        AnonymousClass1VX r22 = this.A02;
        if (z) {
            return new C135606kw(r22);
        }
        C135626ky r3 = new C135626ky(r22);
        C58422vE r42 = C58422vE.A02;
        if (!r22.A0Y(r42, 700)) {
            return r3;
        }
        int A0O3 = r22.A0O(r42, 1574);
        int A0O4 = r22.A0O(r42, 1575);
        if (500 > A0O3 || A0O3 >= 4001 || 20 > A0O4 || A0O4 >= 101) {
            return r3;
        }
        if (num != null) {
            A022 = num.intValue();
        } else {
            A022 = C18280x3.A02(AnonymousClass0x2.A0F(this.A01), "photo_quality");
        }
        if (!r22.A0Y(r42, 702) || A022 == 0) {
            if (!r22.A0Y(r42, 701)) {
                return r3;
            }
            if (AnonymousClass34G.A02(this.A00, this.A05) < 2013 || (A012 = this.A04.A01(0)) == null) {
                return r3;
            }
            float floatValue = A012.floatValue();
            if (floatValue <= 20.0f || floatValue < ((float) r22.A0O(r42, 1573))) {
                return r3;
            }
        } else if (A022 != 1) {
            return r3;
        }
        return new C135616kx(r22);
    }

    public final Map A01(Rect rect, Uri uri, int[] iArr, boolean z, boolean z2) {
        boolean z3;
        int i;
        int i2;
        int i3;
        int A0B = C107655bf.A0B(uri, this.A00.A0R());
        if (z || !(A0B == 6 || A0B == 8)) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (rect != null) {
            i = rect.width();
            i2 = rect.height();
        } else {
            BitmapFactory.Options A06 = this.A03.A06(uri, 0, true, true);
            if (z3) {
                i = A06.outHeight;
                i2 = A06.outWidth;
            } else {
                i = A06.outWidth;
                i2 = A06.outHeight;
            }
        }
        HashMap A0t = AnonymousClass001.A0t();
        for (int i4 : iArr) {
            boolean z4 = true;
            C151027Td A002 = A00(Integer.valueOf(i4), (byte) 1, z2);
            if (A002 != null) {
                int i5 = A002.A00;
                BitmapFactory.Options options = new BitmapFactory.Options();
                int i6 = 1;
                options.inSampleSize = 1;
                int max = Math.max(i, i2);
                while (true) {
                    max /= 2;
                    if (max <= (i5 * 8) / 10) {
                        break;
                    }
                    i6 *= 2;
                    options.inSampleSize = i6;
                }
                int min = Math.min(i5, Math.max(i / i6, i2 / i6));
                if (i <= i2) {
                    z4 = false;
                }
                if (z4) {
                    i3 = (int) (((float) min) / (((float) i) / (((float) i2) * 1.0f)));
                } else {
                    i3 = min;
                    min = (int) (((float) min) / (((float) i2) / (((float) i) * 1.0f)));
                }
                AnonymousClass0x2.A1H(new C52522lc(min, i3), A0t, i4);
            }
        }
        return A0t;
    }

    public final boolean A02(AnonymousClass33C r5, boolean z) {
        int max = Math.max(r5.A06, r5.A08);
        AnonymousClass1VX r2 = this.A02;
        int i = 3068;
        if (z) {
            i = 6031;
        }
        return C18280x3.A1U(max, r2.A0O(C58422vE.A02, i));
    }

    public final boolean A03(AnonymousClass7YG r5, boolean z) {
        int max = Math.max(r5.A00, r5.A01);
        AnonymousClass1VX r2 = this.A02;
        int i = 3068;
        if (z) {
            i = 6031;
        }
        return C18280x3.A1U(max, r2.A0O(C58422vE.A02, i));
    }

    public final boolean A04(boolean z) {
        int A022 = AnonymousClass34G.A02(this.A00, this.A05);
        AnonymousClass1VX r3 = this.A02;
        C58422vE r2 = C58422vE.A02;
        if (A022 < r3.A0O(r2, 4170)) {
            return false;
        }
        if (z) {
            return r3.A0Y(C58422vE.A01, 6033);
        }
        return r3.A0Y(r2, 2653);
    }

    public C55852r1(C620633i r2, AnonymousClass33p r3, AnonymousClass1VX r4, C106695a0 r5, C60132y3 r6, C60152y5 r7) {
        C18260x0.A0f(r4, r2, r6, r3, r7);
        C162457s7.A0J(r5, 6);
        this.A02 = r4;
        this.A00 = r2;
        this.A04 = r6;
        this.A01 = r3;
        this.A05 = r7;
        this.A03 = r5;
    }
}
