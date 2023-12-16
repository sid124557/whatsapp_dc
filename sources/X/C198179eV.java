package X;

/* renamed from: X.9eV  reason: invalid class name and case insensitive filesystem */
public class C198179eV implements Comparable {
    public int A00;
    public int A01;
    public AnonymousClass9K0 A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public boolean A0C;

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Integer.compare(this.A02.priority.intValue(), ((C198179eV) obj).A02.priority.intValue());
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C198179eV(X.AnonymousClass36K r5) {
        /*
            r4 = this;
            r4.<init>()
            java.lang.String r3 = r5.A00
            java.lang.String r1 = "otp"
            boolean r0 = r3.equals(r1)
            java.lang.String r2 = "value"
            if (r0 == 0) goto L_0x0088
            r4.A0B = r1
            java.lang.String r0 = "type"
            r3 = 0
            java.lang.String r1 = r5.A0r(r0, r3)
            r4.A05 = r1
            int r0 = r1.hashCode()
            switch(r0) {
                case 82233: goto L_0x007d;
                case 2467610: goto L_0x0072;
                case 66081660: goto L_0x0067;
                case 81425707: goto L_0x005c;
                default: goto L_0x0021;
            }
        L_0x0021:
            X.9K0 r0 = X.AnonymousClass9K0.UNKNOWN
        L_0x0023:
            r4.A02 = r0
            java.lang.String r0 = r5.A0r(r2, r3)
            r4.A04 = r0
            java.lang.String r0 = "length"
            java.lang.String r1 = r5.A0r(r0, r3)
            r0 = 6
            int r0 = X.C615531h.A01(r1, r0)
            r4.A00 = r0
            java.lang.String r0 = "resend-interval-sec"
            java.lang.String r1 = r5.A0r(r0, r3)
            r0 = 60
            int r0 = X.C615531h.A01(r1, r0)
            r4.A01 = r0
        L_0x0046:
            java.lang.String r0 = "disabled"
            r1 = 0
            java.lang.String r0 = r5.A0r(r0, r1)
            boolean r0 = X.C1899693i.A0y(r0)
            r4.A0C = r0
            java.lang.String r0 = "identifier"
            java.lang.String r0 = r5.A0r(r0, r1)
            r4.A03 = r0
            return
        L_0x005c:
            java.lang.String r0 = "VACAT"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0021
            X.9K0 r0 = X.AnonymousClass9K0.OTP_VACAT
            goto L_0x0023
        L_0x0067:
            java.lang.String r0 = "EMAIL"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0021
            X.9K0 r0 = X.AnonymousClass9K0.OTP_EMAIL
            goto L_0x0023
        L_0x0072:
            java.lang.String r0 = "PUSH"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0021
            X.9K0 r0 = X.AnonymousClass9K0.OTP_BANK
            goto L_0x0023
        L_0x007d:
            java.lang.String r0 = "SMS"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0021
            X.9K0 r0 = X.AnonymousClass9K0.OTP_SMS
            goto L_0x0023
        L_0x0088:
            java.lang.String r1 = "app-to-app"
            boolean r0 = r3.equals(r1)
            if (r0 == 0) goto L_0x00b6
            r4.A0B = r1
            r1 = 0
            java.lang.String r0 = r5.A0r(r2, r1)
            r4.A06 = r0
            java.lang.String r0 = "request-payload"
            java.lang.String r0 = r5.A0r(r0, r1)
            r4.A09 = r0
            java.lang.String r0 = "source"
            java.lang.String r0 = r5.A0r(r0, r1)
            r4.A07 = r0
            java.lang.String r0 = "intent-action"
            java.lang.String r0 = r5.A0r(r0, r1)
            r4.A08 = r0
            X.9K0 r0 = X.AnonymousClass9K0.BANK_APP
        L_0x00b3:
            r4.A02 = r0
            goto L_0x0046
        L_0x00b6:
            java.lang.String r1 = "customer-service"
            boolean r0 = r3.equals(r1)
            if (r0 == 0) goto L_0x0046
            r4.A0B = r1
            java.lang.String r0 = X.AnonymousClass36K.A0L(r5, r2)
            r4.A0A = r0
            X.9K0 r0 = X.AnonymousClass9K0.CALL_BANK
            goto L_0x00b3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C198179eV.<init>(X.36K):void");
    }

    public C198179eV() {
    }
}
