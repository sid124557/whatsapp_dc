package X;

import android.text.TextUtils;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9W6  reason: invalid class name */
public final class AnonymousClass9W6 {
    public HashSet A00;
    public final C617332a A01;
    public final AnonymousClass1VX A02;
    public final C620933l A03;
    public final C1907099n A04;

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000d, code lost:
        r0 = (X.AnonymousClass99H) r4.A08;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A05(X.C133686hm r4) {
        /*
            r3 = this;
            r2 = 0
            if (r4 == 0) goto L_0x0018
            X.1VX r1 = r3.A02
            r0 = 5724(0x165c, float:8.021E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x0018
            X.6hx r0 = r4.A08
            X.99H r0 = (X.AnonymousClass99H) r0
            if (r0 == 0) goto L_0x0018
            boolean r0 = r0.A0I
            if (r0 == 0) goto L_0x0018
            r2 = 1
        L_0x0018:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9W6.A05(X.6hm):boolean");
    }

    public static boolean A00(C166587yw r4, String str) {
        C133796hx r42 = r4.A08;
        if (!(r42 instanceof AnonymousClass99H)) {
            return false;
        }
        boolean equals = "p2m".equals(str);
        if ((!"OD_UNSECURED".equals(((AnonymousClass99H) r42).A0B)) || equals) {
            return false;
        }
        return true;
    }

    public AnonymousClass39Q A02(String str, String str2, String str3) {
        BigDecimal bigDecimal;
        C85204Fi A012 = this.A01.A01("INR");
        if (!TextUtils.isEmpty(str)) {
            bigDecimal = new BigDecimal(str);
        } else if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return ((AnonymousClass1S3) A012).A00;
        } else {
            bigDecimal = new BigDecimal(str3);
        }
        return C1899593h.A08(A012, bigDecimal);
    }

    public String A04(C166587yw r4) {
        Object obj = r4.A09.A00;
        C626936e.A06(obj);
        String str = (String) obj;
        if (A06(r4)) {
            return str.replaceAll("X{8}", "••");
        }
        return C195169Wk.A05(str);
    }

    public boolean A06(C166587yw r3) {
        C133796hx r1;
        if (r3 == null || (r1 = r3.A08) == null || !(r1 instanceof C133766hu)) {
            return false;
        }
        return A08(((AnonymousClass99H) r1).A0B);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x004b A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A07(X.C166587yw r6, java.lang.String r7, boolean r8) {
        /*
            r5 = this;
            X.6hx r1 = r6.A08
            boolean r0 = r1 instanceof X.AnonymousClass99H
            if (r0 == 0) goto L_0x005f
            X.99H r1 = (X.AnonymousClass99H) r1
            java.lang.String r0 = r1.A0B
            boolean r0 = r5.A08(r0)
            if (r0 == 0) goto L_0x005f
            java.util.HashSet r0 = r5.A00
            if (r0 != 0) goto L_0x0032
            X.1VX r1 = r5.A02
            r0 = 5210(0x145a, float:7.301E-42)
            java.lang.String r1 = r1.A0Q(r0)
            if (r1 != 0) goto L_0x0058
            java.lang.String r4 = "6012"
            java.lang.String r3 = "7407"
            java.lang.String r2 = "7409"
            java.lang.String r1 = "7408"
            java.lang.String r0 = "6211"
            java.lang.String[] r0 = new java.lang.String[]{r2, r1, r0, r4, r3}
        L_0x002c:
            java.util.HashSet r0 = X.C18280x3.A0h(r0)
            r5.A00 = r0
        L_0x0032:
            boolean r0 = r0.contains(r7)
            if (r0 == 0) goto L_0x004d
            X.9JD r1 = X.AnonymousClass9JD.RUPAY_CREDIT_CARD_FOR_RESTRICTED_MERCHANT
        L_0x003a:
            X.9JD r0 = X.AnonymousClass9JD.RUPAY_CREDIT_CARD_FOR_RESTRICTED_MERCHANT
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x004b
            X.9JD r0 = X.AnonymousClass9JD.RUPAY_CREDIT_CARD_FOR_NOT_P2M
            boolean r1 = r1.equals(r0)
            r0 = 0
            if (r1 == 0) goto L_0x004c
        L_0x004b:
            r0 = 1
        L_0x004c:
            return r0
        L_0x004d:
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 != 0) goto L_0x0055
            if (r8 == 0) goto L_0x005f
        L_0x0055:
            X.9JD r1 = X.AnonymousClass9JD.RUPAY_CREDIT_CARD_FOR_NOT_P2M
            goto L_0x003a
        L_0x0058:
            java.lang.String r0 = ","
            java.lang.String[] r0 = r1.split(r0)
            goto L_0x002c
        L_0x005f:
            X.9JD r1 = X.AnonymousClass9JD.NONE
            goto L_0x003a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9W6.A07(X.7yw, java.lang.String, boolean):boolean");
    }

    public boolean A08(String str) {
        if (!this.A04.A02.A0X(4638) || !"CREDIT".equals(str)) {
            return false;
        }
        return true;
    }

    public AnonymousClass9W6(C617332a r1, AnonymousClass1VX r2, C620933l r3, C1907099n r4) {
        this.A02 = r2;
        this.A03 = r3;
        this.A04 = r4;
        this.A01 = r1;
    }

    public static boolean A01(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass99H r0 = (AnonymousClass99H) C1899693i.A0C(it).A08;
            if (r0 != null && r0.A0H) {
                return true;
            }
        }
        return false;
    }

    public String A03(C166587yw r6) {
        String str;
        String A042 = A04(r6);
        String str2 = r6.A0B;
        boolean A06 = A06(r6);
        Object[] A1b = C18310x6.A1b(str2, 0);
        A1b[1] = A042;
        if (A06) {
            str = "%s %s";
        } else {
            str = "%s ••%s";
        }
        return String.format(str, A1b);
    }
}
