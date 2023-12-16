package X;

import org.json.JSONObject;

/* renamed from: X.9cZ  reason: invalid class name and case insensitive filesystem */
public class C197099cZ implements C203499no {
    public final AnonymousClass4FV A00;
    public final AnonymousClass9TD A01;

    public void BKC(Integer num, Integer num2, String str, String str2, boolean z) {
        BKB(num, num2, str, (String) null);
    }

    public C134246ig B0d() {
        C134246ig r1 = new C134246ig();
        r1.A0V = this.A01.A00();
        r1.A0R = "BR";
        return r1;
    }

    public void BJy(AnonymousClass3ZO r3, Integer num, Integer num2, String str, String str2) {
        int i;
        C1905899a r1 = new C1905899a();
        r1.A01 = num;
        r1.A08 = str;
        if (num2 != null) {
            r1.A00 = num2;
        }
        r1.A06 = str2;
        if (r3 != null) {
            r1.A05 = r3.A06;
            r1.A07 = r3.A08;
            r1.A04 = r3.A05;
            r1.A02 = Integer.valueOf(r3.A01);
            i = 1;
        } else {
            i = 2;
        }
        r1.A03 = Integer.valueOf(i);
        this.A00.BhD(r1);
    }

    public void BK0(AnonymousClass34V r4, int i) {
        int i2;
        AnonymousClass4FV r2 = this.A00;
        C134246ig B0d = B0d();
        B0d.A0B = Integer.valueOf(i);
        if (r4 != null) {
            B0d.A0S = String.valueOf(r4.A00);
            B0d.A0T = r4.A08;
            i2 = 2;
        } else {
            i2 = 1;
        }
        B0d.A0C = Integer.valueOf(i2);
        B0d.A08 = C18290x4.A0a();
        r2.BhD(B0d);
    }

    public void BKA(C134246ig r2) {
        r2.A0V = this.A01.A00();
        r2.A0R = "BR";
        this.A00.BhD(r2);
    }

    public void BKF(AnonymousClass303 r1, Integer num, Integer num2, String str, String str2, String str3, String str4, boolean z, boolean z2) {
        BKE(r1, num, num2, "payment_transaction_details", str2);
    }

    public void reset() {
        this.A01.A01();
    }

    public C197099cZ(AnonymousClass4FV r1, AnonymousClass9TD r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public void BKB(Integer num, Integer num2, String str, String str2) {
        C134246ig B0d = B0d();
        B0d.A0b = str;
        B0d.A08 = num;
        if (num2 != null) {
            B0d.A07 = num2;
        }
        if (str2 != null) {
            B0d.A0a = str2;
        }
        this.A00.BhD(B0d);
    }

    public void BKE(AnonymousClass303 r5, Integer num, Integer num2, String str, String str2) {
        C134246ig B0d = B0d();
        B0d.A0b = str;
        B0d.A08 = num;
        if (num2 != null) {
            B0d.A07 = num2;
        }
        if (str2 != null) {
            B0d.A0a = str2;
        }
        if (r5 != null) {
            JSONObject jSONObject = r5.A01;
            if (jSONObject.has("is_payment_account_setup")) {
                B0d.A01 = Boolean.valueOf(jSONObject.optBoolean("is_payment_account_setup"));
                jSONObject.remove("is_payment_account_setup");
            }
            if (jSONObject.length() > 0) {
                B0d.A0Z = r5.toString();
            }
        }
        this.A00.BhD(B0d);
    }

    public void Bq0() {
    }
}
