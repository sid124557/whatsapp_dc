package X;

import android.text.TextUtils;
import java.util.List;

/* renamed from: X.5Th  reason: invalid class name and case insensitive filesystem */
public class C105035Th {
    public final C56972sr A00;
    public final C48372en A01;
    public final C48392ep A02;
    public final C56422rx A03;
    public final AnonymousClass33p A04;
    public final AnonymousClass1VX A05;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
        if ((r2.A00() & com.facebook.msys.mci.DefaultCrypto.BUFFER_SIZE) <= 0) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A00(X.C108985dt r4) {
        /*
            r3 = this;
            X.2en r2 = r3.A01
            X.1VX r1 = r2.A01
            r0 = 3832(0xef8, float:5.37E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x0015
            int r0 = r2.A00()
            r1 = r0 & 8192(0x2000, float:1.14794E-41)
            r0 = 1
            if (r1 > 0) goto L_0x0016
        L_0x0015:
            r0 = 0
        L_0x0016:
            java.lang.String r1 = "UNBLOCKED"
            if (r0 == 0) goto L_0x0023
            if (r4 == 0) goto L_0x0023
            boolean r0 = r4.A0X
            if (r0 == 0) goto L_0x0023
            java.lang.String r0 = r4.A0B
            return r0
        L_0x0023:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C105035Th.A00(X.5dt):java.lang.String");
    }

    public boolean A01(C108985dt r4) {
        if (this.A05.A0X(355) && r4 != null) {
            String str = r4.A0J;
            if (!TextUtils.isEmpty(str)) {
                return this.A02.A01(str);
            }
        }
        return false;
    }

    public boolean A02(C108985dt r3) {
        AnonymousClass1VX r1 = this.A05;
        if (!r1.A0X(355) || !r1.A0X(636) || !A01(r3)) {
            return false;
        }
        return true;
    }

    public boolean A03(C108985dt r5) {
        List list;
        if (this.A01.A01()) {
            if (r5 == null) {
                return false;
            }
            if (r5.A0X && (list = r5.A0Q) != null && !this.A00.A0a(r5.A08)) {
                AnonymousClass33p r2 = this.A04;
                String A002 = C106675Zy.A00(r2.A0Z());
                if (A002 == null || A002.equals("ZZ")) {
                    A002 = C106675Zy.A01(r2.A0Z(), r2.A0b());
                }
                return list.contains(A002);
            }
        }
        return true;
    }

    public C105035Th(C56972sr r1, C48372en r2, C48392ep r3, C56422rx r4, AnonymousClass33p r5, AnonymousClass1VX r6) {
        this.A05 = r6;
        this.A02 = r3;
        this.A04 = r5;
        this.A00 = r1;
        this.A03 = r4;
        this.A01 = r2;
    }
}
