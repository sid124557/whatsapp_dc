package X;

import java.util.List;

/* renamed from: X.6PX  reason: invalid class name */
public final class AnonymousClass6PX extends C126516Og {
    public final float A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final C161467pi A04 = new C161467pi();
    public final String A05;
    public final boolean A06;

    public AnonymousClass6PX(List list) {
        super("Tx3gDecoder");
        String str = "sans-serif";
        boolean z = false;
        if (list.size() == 1 && (AnonymousClass6C9.A1V(list, 0).length == 48 || AnonymousClass6C9.A1V(list, 0).length == 53)) {
            byte[] A1V = AnonymousClass6C9.A1V(list, 0);
            this.A03 = A1V[24];
            this.A02 = AnonymousClass6CA.A0C(A1V, 29, AnonymousClass6C8.A0G(A1V, 28, AnonymousClass6C9.A0G(A1V, 27, (A1V[26] & 255) << 24)));
            this.A05 = "Serif".equals(AnonymousClass6CA.A0W(AnonymousClass79T.A05, A1V, 43, A1V.length - 43)) ? "serif" : str;
            int i = A1V[25] * 20;
            this.A01 = i;
            z = (A1V[0] & 32) != 0 ? true : z;
            this.A06 = z;
            if (z) {
                this.A00 = AnonymousClass001.A01(((float) AnonymousClass6CA.A0B(A1V, 11, AnonymousClass6C9.A0F(A1V, 10))) / ((float) i), 0.95f, 0.0f);
            } else {
                this.A00 = 0.85f;
            }
        } else {
            this.A02 = -1;
            this.A05 = str;
            this.A00 = 0.85f;
            this.A01 = -1;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(android.text.SpannableStringBuilder r6, int r7, int r8, int r9, int r10, int r11) {
        /*
            if (r7 == r8) goto L_0x002b
            r5 = r11 | 33
            r0 = r7 & 1
            r4 = 0
            r3 = 1
            boolean r2 = X.AnonymousClass000.A1S(r0)
            r0 = r7 & 2
            boolean r1 = X.AnonymousClass000.A1S(r0)
            if (r2 == 0) goto L_0x0036
            if (r1 == 0) goto L_0x0017
            r3 = 3
        L_0x0017:
            android.text.style.StyleSpan r0 = new android.text.style.StyleSpan
            r0.<init>(r3)
            r6.setSpan(r0, r9, r10, r5)
        L_0x001f:
            r0 = r7 & 4
            if (r0 == 0) goto L_0x002c
            android.text.style.UnderlineSpan r0 = new android.text.style.UnderlineSpan
            r0.<init>()
        L_0x0028:
            r6.setSpan(r0, r9, r10, r5)
        L_0x002b:
            return
        L_0x002c:
            if (r2 != 0) goto L_0x002b
            if (r1 != 0) goto L_0x002b
            android.text.style.StyleSpan r0 = new android.text.style.StyleSpan
            r0.<init>(r4)
            goto L_0x0028
        L_0x0036:
            if (r1 == 0) goto L_0x001f
            r3 = 2
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6PX.A00(android.text.SpannableStringBuilder, int, int, int, int, int):void");
    }
}
