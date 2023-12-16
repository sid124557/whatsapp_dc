package X;

import java.util.List;

/* renamed from: X.2oR  reason: invalid class name and case insensitive filesystem */
public abstract class C54262oR {
    public void A00() {
        C36611zb r1 = (C36611zb) this;
        C105695Wa r2 = (C105695Wa) C18300x5.A0b(r1.A00.A04);
        List list = r1.A03;
        boolean z = r1.A04;
        int i = 10;
        if (z) {
            i = 9;
        }
        r2.A01((Boolean) null, Integer.valueOf(i), (Integer) null, (Integer) null, r1.A02, list, 1, z);
    }

    public void A02(Integer num, Integer num2, String str, boolean z) {
        C36611zb r2 = (C36611zb) this;
        String str2 = str;
        C106245Ye.A00(AnonymousClass000.A0V("XFamilyCrosspostRequestSessionManager/[Retry]Delivery Failure encountered for session: ", str, AnonymousClass001.A0o()));
        C105695Wa r1 = (C105695Wa) r2.A00.A04.get();
        List list = r2.A03;
        boolean z2 = r2.A04;
        int i = 10;
        if (z2) {
            i = 9;
        }
        r1.A01(r2.A01, Integer.valueOf(i), num, num2, str2, list, 4, z2);
    }

    public void A03(Integer num, String str, int i, boolean z) {
        C36611zb r1 = (C36611zb) this;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("XFamilyCrosspostRequestSessionManager/[Retry]Error encountered for session: ");
        String str2 = str;
        A0o.append(str);
        A0o.append(" with errorCode: ");
        A0o.append(i);
        Integer num2 = num;
        C18260x0.A1N(A0o, " and errorSubCode: ", num);
        C105695Wa r2 = (C105695Wa) r1.A00.A04.get();
        List list = r1.A03;
        boolean z2 = r1.A04;
        int i2 = 10;
        if (z2) {
            i2 = 9;
        }
        r2.A01(r1.A01, Integer.valueOf(i2), Integer.valueOf(i), num2, str2, list, 3, z2);
    }

    public void A01(C52732lx r1, C53872no r2) {
    }
}
