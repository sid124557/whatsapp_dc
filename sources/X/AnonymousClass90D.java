package X;

import java.util.Map;

/* renamed from: X.90D  reason: invalid class name */
public class AnonymousClass90D extends C56812sb {
    public Object A00;
    public final int A01;

    public AnonymousClass90D(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void A00(int i, int i2) {
        if (1 - this.A01 != 0) {
            super.A00(i, i2);
            return;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamsysRegistrationWrapper/send-funnel-log/status/");
        A0o.append(i);
        C18260x0.A0y("/failureReason/", A0o, i2);
        ((C105935Wz) this.A00).A02((Object) null);
    }

    public void A04(String str, String str2, String str3, int i, int i2, long j) {
        int i3;
        int i4;
        String str4 = str2;
        String str5 = str3;
        int i5 = i;
        int i6 = i2;
        long j2 = j;
        if (this.A01 != 0) {
            super.A04(str, str4, str5, i5, i6, j2);
            return;
        }
        C105935Wz r2 = (C105935Wz) this.A00;
        if (i5 != 1) {
            i3 = 0;
            if (i5 != 3) {
                i3 = -1;
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("WamsysRegistrationWrapper/reg-onboard-abprop-request-status-unspecified; response-status ");
                A0o.append(i5);
                C18260x0.A0x(" failure-reason ", A0o, i6);
            }
        } else {
            i3 = 1;
        }
        if (i6 != 6) {
            i4 = 1;
            if (i6 != 33) {
                i4 = -1;
            }
        } else {
            i4 = 0;
        }
        r2.A02(new C156777hB(str4, str5, i3, i4, j2));
    }

    public void A0B(String str, String str2, Map map, Map map2, int i, int i2) {
        int i3;
        if (2 - this.A01 != 0) {
            super.A0B(str, str2, map, map2, i, i2);
            return;
        }
        C105935Wz r3 = (C105935Wz) this.A00;
        if (i != 2) {
            i3 = 0;
            if (i != 3) {
                i3 = -1;
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("WamsysRegistrationWrapper/autoconf-request-status-unspecified; response-status ");
                A0o.append(i);
                C18260x0.A0x(" failure-reason ", A0o, i2);
            }
        } else {
            i3 = 1;
        }
        AnonymousClass7O3 r2 = new AnonymousClass7O3(i3);
        r2.A00 = i2;
        r2.A03 = str;
        r2.A02 = C100545Bi.A00(map);
        r2.A01 = AnonymousClass75A.A00(map2);
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("WamsysRegistrationWrapper/autoconf-request-status/reg-block raw\n\nversionUpgrade: ");
        A0o2.append(map);
        C18260x0.A1P(A0o2, "\n\ncustomBlockScreen: ", map2);
        r3.A02(r2);
    }

    public void A0C(Map map, Map map2, int i, int i2) {
        int i3;
        if (3 - this.A01 != 0) {
            super.A0C(map, map2, i, i2);
            return;
        }
        C105935Wz r4 = (C105935Wz) this.A00;
        if (i != 1) {
            i3 = 0;
            if (i != 3) {
                i3 = -1;
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("WamsysRegistrationWrapper/autoconf-verifier-request-status-unspecified; response-status ");
                A0o.append(i);
                C18260x0.A0x(" failure-reason ", A0o, i2);
            }
        } else {
            i3 = 1;
        }
        AnonymousClass7ZN r2 = new AnonymousClass7ZN(i3);
        r2.A00 = i2;
        r2.A02 = C100545Bi.A00(map);
        r2.A01 = AnonymousClass75A.A00(map2);
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("WamsysRegistrationWrapper/autoconf-verifier-request-status/reg-block raw\n\nversionUpgrade: ");
        A0o2.append(map);
        C18260x0.A1P(A0o2, "\n\ncustomBlockScreen: ", map2);
        r4.A02(r2);
    }
}
