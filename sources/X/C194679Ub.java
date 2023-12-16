package X;

import org.json.JSONObject;

/* renamed from: X.9Ub  reason: invalid class name and case insensitive filesystem */
public class C194679Ub {
    public AnonymousClass39L A00;

    public C194679Ub(C617332a r4, C192029Hw r5) {
        C60042xu r2 = new C60042xu();
        r2.A02 = r4.A01(r5.A01);
        r2.A01 = Long.parseLong(r5.A03);
        r2.A00 = Integer.parseInt(r5.A02);
        this.A00 = r2.A01();
    }

    public C194679Ub(String str) {
        JSONObject A1H = AnonymousClass0x9.A1H(str);
        C60042xu r1 = new C60042xu();
        r1.A02 = AnonymousClass1S3.A06;
        r1.A01();
        this.A00 = new C60042xu(C18300x5.A10("min_amount", A1H)).A01();
    }
}
