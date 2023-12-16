package X;

import android.util.Log;
import java.util.Locale;

/* renamed from: X.7Wc  reason: invalid class name and case insensitive filesystem */
public class C151737Wc {
    public final int A00;
    public final AnonymousClass7BP A01;
    public final String A02;
    public final String A03;

    /* JADX WARNING: Removed duplicated region for block: B:4:0x0015 A[LOOP:0: B:4:0x0015->B:7:0x0020, LOOP_START, PHI: r1 
      PHI: (r1v3 int) = (r1v2 int), (r1v5 int) binds: [B:3:0x0005, B:7:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C151737Wc(java.lang.String r7, java.lang.String... r8) {
        /*
            r6 = this;
            int r5 = r8.length
            if (r5 != 0) goto L_0x0023
            java.lang.String r0 = ""
        L_0x0005:
            r6.<init>()
            r6.A03 = r0
            r6.A02 = r7
            r1 = 0
            X.7BP r0 = new X.7BP
            r0.<init>(r7, r1)
            r6.A01 = r0
            r1 = 2
        L_0x0015:
            java.lang.String r0 = r6.A02
            boolean r0 = android.util.Log.isLoggable(r0, r1)
            if (r0 != 0) goto L_0x0047
            int r1 = r1 + 1
            r0 = 7
            if (r1 > r0) goto L_0x0047
            goto L_0x0015
        L_0x0023:
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()
            r0 = 91
            r4.append(r0)
            r3 = 0
        L_0x002d:
            r2 = r8[r3]
            int r1 = r4.length()
            r0 = 1
            if (r1 <= r0) goto L_0x0039
            X.C18320x8.A1K(r4)
        L_0x0039:
            r4.append(r2)
            int r3 = r3 + 1
            if (r3 < r5) goto L_0x002d
            java.lang.String r0 = "] "
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r4)
            goto L_0x0005
        L_0x0047:
            r6.A00 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C151737Wc.<init>(java.lang.String, java.lang.String[]):void");
    }

    public void A00(String str, Object... objArr) {
        if (this.A00 <= 3) {
            String str2 = this.A02;
            if (objArr.length > 0) {
                str = String.format(Locale.US, str, objArr);
            }
            Log.d(str2, this.A03.concat(str));
        }
    }

    public void A01(String str, Object... objArr) {
        if (objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        AnonymousClass6C9.A13(this.A03, str, "Auth");
    }
}
