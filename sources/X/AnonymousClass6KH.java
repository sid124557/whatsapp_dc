package X;

import android.text.TextUtils;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.6KH  reason: invalid class name */
public class AnonymousClass6KH extends AnonymousClass7FC {
    public static final int[] A03 = new int[0];
    public AnonymousClass7U9 A00;
    public final AnonymousClass7U2 A01;
    public final AtomicReference A02;

    public static boolean A01(C166637z1 r3, AnonymousClass7W6 r4, int i) {
        if ((i & 7) != 4 || r3.A05 != r4.A00 || r3.A0F != r4.A01) {
            return false;
        }
        String str = r4.A02;
        return str == null || TextUtils.equals(str, r3.A0S);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0034, code lost:
        if (r0 != r11) goto L_0x0036;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List A00(X.C166617yz r12, int r13, int r14, boolean r15) {
        /*
            int r7 = r12.A01
            java.util.ArrayList r5 = X.AnonymousClass002.A0I(r7)
            r6 = 0
            r0 = 0
        L_0x0008:
            if (r0 >= r7) goto L_0x0010
            X.C18270x1.A1K(r5, r0)
            int r0 = r0 + 1
            goto L_0x0008
        L_0x0010:
            r3 = 2147483647(0x7fffffff, float:NaN)
            if (r13 == r3) goto L_0x0093
            if (r14 == r3) goto L_0x0093
            r4 = 2147483647(0x7fffffff, float:NaN)
        L_0x001a:
            if (r6 >= r7) goto L_0x006f
            X.7z1[] r0 = r12.A03
            r2 = r0[r6]
            int r10 = r2.A0I
            if (r10 <= 0) goto L_0x005f
            int r9 = r2.A09
            if (r9 <= 0) goto L_0x005f
            r8 = r13
            r1 = r14
            if (r15 == 0) goto L_0x006c
            r11 = 1
            boolean r0 = X.C86624Kv.A1W(r10, r9)
            if (r13 > r14) goto L_0x0034
            r11 = 0
        L_0x0034:
            if (r0 == r11) goto L_0x006c
        L_0x0036:
            int r11 = r10 * r8
            int r0 = r9 * r1
            if (r11 < r0) goto L_0x0062
            int r0 = r0 + r10
            int r0 = r0 + -1
            int r0 = r0 / r10
            android.graphics.Point r9 = new android.graphics.Point
            r9.<init>(r1, r0)
        L_0x0045:
            int r10 = r2.A0I
            int r8 = r2.A09
            int r2 = r10 * r8
            int r0 = r9.x
            float r0 = (float) r0
            r1 = 1065017672(0x3f7ae148, float:0.98)
            float r0 = r0 * r1
            int r0 = (int) r0
            if (r10 < r0) goto L_0x005f
            int r0 = r9.y
            float r0 = (float) r0
            float r0 = r0 * r1
            int r0 = (int) r0
            if (r8 < r0) goto L_0x005f
            if (r2 >= r4) goto L_0x005f
            r4 = r2
        L_0x005f:
            int r6 = r6 + 1
            goto L_0x001a
        L_0x0062:
            int r11 = r11 + r9
            int r0 = r11 + -1
            int r0 = r0 / r9
            android.graphics.Point r9 = new android.graphics.Point
            r9.<init>(r0, r8)
            goto L_0x0045
        L_0x006c:
            r1 = r13
            r8 = r14
            goto L_0x0036
        L_0x006f:
            if (r4 == r3) goto L_0x0093
            int r3 = r5.size()
        L_0x0075:
            int r3 = r3 + -1
            if (r3 < 0) goto L_0x0093
            int r1 = X.C86614Ku.A07(r5, r3)
            X.7z1[] r0 = r12.A03
            r0 = r0[r1]
            int r2 = r0.A0I
            r1 = -1
            if (r2 == r1) goto L_0x008f
            int r0 = r0.A09
            if (r0 == r1) goto L_0x008f
            int r2 = r2 * r0
            if (r2 == r1) goto L_0x008f
            if (r2 <= r4) goto L_0x0075
        L_0x008f:
            r5.remove(r3)
            goto L_0x0075
        L_0x0093:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6KH.A00(X.7yz, int, int, boolean):java.util.List");
    }

    public static boolean A02(C166637z1 r1, List list) {
        String A002;
        String str = r1.A0R;
        if (str == null) {
            A002 = null;
        } else {
            try {
                A002 = new Locale(str).getISO3Language();
            } catch (MissingResourceException unused) {
                A002 = C1447272s.A00(str);
            }
        }
        return list.contains(A002);
    }

    public void A03(AnonymousClass6KF r3) {
        AnonymousClass81Q r0;
        AnonymousClass6KG r1 = new AnonymousClass6KG(r3);
        if (!this.A02.getAndSet(r1).equals(r1) && (r0 = this.A00) != null) {
            r0.A0j.A00.sendEmptyMessage(11);
        }
    }

    public AnonymousClass6KH(AnonymousClass7U2 r3) {
        this.A01 = r3;
        this.A02 = new AtomicReference(AnonymousClass6KG.A09);
    }

    public AnonymousClass6KH() {
        this((AnonymousClass7U2) null);
    }
}
