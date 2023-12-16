package X;

import java.util.List;

/* renamed from: X.32f  reason: invalid class name and case insensitive filesystem */
public final class C617832f {
    public static final AnonymousClass5ZC A04 = new AnonymousClass5ZC(1, 1);
    public final C55682qk A00;
    public final C56612sH A01;
    public final AnonymousClass1VX A02;
    public final C29011i8 A03;

    public static boolean A00(String str) {
        if (str == null) {
            return false;
        }
        if (str.contains("express") || str.contains("express-optimistic")) {
            return true;
        }
        return false;
    }

    public boolean A01(C633138t r10, boolean z) {
        C47502dM r0;
        String A032;
        AnonymousClass5LI A0B = this.A03.A0B();
        if (A0B == null) {
            return false;
        }
        AnonymousClass1VX r7 = this.A02;
        C56612sH r6 = this.A01;
        String str = r10.A02;
        List list = A0B.A0A;
        C47502dM A002 = AnonymousClass3UQ.A00("fallback", str, (String) null, list, z);
        if ((z || (((A032 = AnonymousClass3UQ.A03(r6, r7, (String) null, str, false)) == null || (r0 = AnonymousClass3UQ.A00("primary", str, A032, list, false)) == null) && (r0 = AnonymousClass3UQ.A00("primary", str, "0", list, false)) == null)) && (r0 = AnonymousClass3UQ.A00("primary", str, (String) null, list, z)) == null) {
            r0 = A002;
            if (A002 == null) {
                return false;
            }
        }
        if (r0.A0C) {
            return true;
        }
        return false;
    }

    public C617832f(C55682qk r1, C56612sH r2, AnonymousClass1VX r3, C29011i8 r4) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
        this.A03 = r4;
    }
}
