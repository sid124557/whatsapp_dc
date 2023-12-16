package X;

import com.whatsapp.SecondaryProcessAbstractAppShellDelegate;
import org.json.JSONObject;

/* renamed from: X.9ca  reason: invalid class name and case insensitive filesystem */
public class C197109ca implements C203499no {
    public AnonymousClass1VX A00;
    public Integer A01;
    public final AnonymousClass4FV A02;
    public final C196629bS A03;
    public final AnonymousClass9TD A04;

    public C134246ig A05(Integer num, Integer num2, String str, String str2) {
        return A04((AnonymousClass303) null, num, num2, str, str2, (String) null, (String) null, false);
    }

    public void A0A(Integer num, Integer num2, String str, String str2, String str3, String str4, boolean z) {
        this.A02.BhD(A04((AnonymousClass303) null, num, num2, str, str2, str3, str4, z));
    }

    public void BKE(AnonymousClass303 r11, Integer num, Integer num2, String str, String str2) {
        BKF(r11, num, num2, str, str2, (String) null, (String) null, false, false);
    }

    public void BKF(AnonymousClass303 r12, Integer num, Integer num2, String str, String str2, String str3, String str4, boolean z, boolean z2) {
        A02(A04((AnonymousClass303) null, num, num2, str, str2, str3, str4, z2), r12, this, z);
    }

    public static String A00(C166587yw r2) {
        if (!(r2 instanceof C133696hn)) {
            return SecondaryProcessAbstractAppShellDelegate.COMPRESSED_WHATSAPP_LIB_NAME;
        }
        String str = (String) ((C133696hn) r2).A00.A00;
        if (str == null) {
            return null;
        }
        AnonymousClass224 A002 = AnonymousClass281.A00(str);
        if (A002 != null) {
            return A002.methodName;
        }
        if ("other".equals(str)) {
            return "other";
        }
        return null;
    }

    public static final void A01(C134246ig r3, AnonymousClass303 r4) {
        if (r4 != null) {
            JSONObject jSONObject = r4.A01;
            if (jSONObject.has("is_payment_account_setup")) {
                r3.A01 = Boolean.valueOf(jSONObject.optBoolean("is_payment_account_setup"));
                jSONObject.remove("is_payment_account_setup");
            }
            if (jSONObject.length() > 0) {
                r3.A0Z = r4.toString();
            }
        }
    }

    public AnonymousClass303 A06(C166587yw r3, AnonymousClass303 r4) {
        if (r4 == null) {
            r4 = C1899593h.A0K();
        }
        String A002 = A00(r3);
        if (A002 != null) {
            r4.A03("payment_method", A002);
        }
        return r4;
    }

    public C134246ig B0d() {
        C134246ig r1 = new C134246ig();
        r1.A0V = this.A04.A00();
        r1.A0R = "IN";
        A0B(this.A03.A07());
        r1.A0F = this.A01;
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
        this.A02.BhD(r1);
    }

    public void BKA(C134246ig r2) {
        r2.A0V = this.A04.A00();
        r2.A0R = "IN";
        this.A02.BhD(r2);
    }

    public void Bq0() {
        this.A04.A02();
    }

    public void reset() {
        this.A04.A01();
    }

    public C197109ca(AnonymousClass4FV r1, C196629bS r2, AnonymousClass9TD r3) {
        this.A02 = r1;
        this.A04 = r3;
        this.A03 = r2;
    }

    public static void A02(C134246ig r1, AnonymousClass303 r2, C197109ca r3, boolean z) {
        r1.A05 = Boolean.valueOf(z);
        A01(r1, r2);
        r3.A02.BhD(r1);
    }

    public C134246ig A03(AnonymousClass34V r3, int i) {
        int i2;
        C134246ig B0d = B0d();
        B0d.A0B = Integer.valueOf(i);
        if (r3 != null) {
            B0d.A0S = String.valueOf(r3.A00);
            B0d.A0T = r3.A08;
            i2 = 2;
        } else {
            i2 = 1;
        }
        B0d.A0C = Integer.valueOf(i2);
        B0d.A08 = C18290x4.A0a();
        return B0d;
    }

    public C134246ig A04(AnonymousClass303 r4, Integer num, Integer num2, String str, String str2, String str3, String str4, boolean z) {
        C134246ig B0d = B0d();
        B0d.A0b = str;
        B0d.A06 = Boolean.valueOf(z);
        B0d.A08 = num;
        if (this.A00.A0X(1330)) {
            B0d.A0W = str3;
            B0d.A0X = str4;
        }
        if (num2 != null) {
            B0d.A07 = num2;
        }
        if (str2 != null) {
            B0d.A0a = str2;
        }
        A01(B0d, r4);
        return B0d;
    }

    public void A07(C166587yw r3, AnonymousClass34V r4, int i) {
        String str;
        C134246ig A032 = A03(r4, i);
        C133796hx r0 = r3.A08;
        if (r0 == null) {
            str = "";
        } else {
            str = ((AnonymousClass99H) r0).A0C;
        }
        A032.A0O = str;
        this.A02.BhD(A032);
    }

    public void A08(AnonymousClass34V r3, int i, int i2) {
        C134246ig B0d = B0d();
        B0d.A0B = Integer.valueOf(i);
        if (r3 != null) {
            B0d.A0S = String.valueOf(r3.A00);
            B0d.A0T = r3.A08;
        }
        B0d.A0A = Integer.valueOf(i2);
        B0d.A08 = C18290x4.A0a();
        B0d.A0b = "api_event";
        C626936e.A06(B0d);
        BKA(B0d);
    }

    public void A09(AnonymousClass303 r3, Integer num, Integer num2, String str, String str2, String str3) {
        C134246ig A05 = A05(num, num2, str2, str3);
        A05.A0Y = str;
        A01(A05, r3);
        this.A02.BhD(A05);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0031, code lost:
        r0 = java.lang.Integer.valueOf(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0035, code lost:
        r3.A01 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0037, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0B(java.lang.String r4) {
        /*
            r3 = this;
            java.lang.Integer r2 = X.AnonymousClass001.A0f()
            if (r4 == 0) goto L_0x000e
            int r0 = r4.hashCode()
            r1 = 2
            switch(r0) {
                case 81882: goto L_0x0028;
                case 2023329: goto L_0x001e;
                case 2212537: goto L_0x0011;
                default: goto L_0x000e;
            }
        L_0x000e:
            r3.A01 = r2
            return
        L_0x0011:
            java.lang.String r0 = "HDFC"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x000e
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            goto L_0x0035
        L_0x001e:
            java.lang.String r0 = "AXIS"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x000e
            r0 = 3
            goto L_0x0031
        L_0x0028:
            java.lang.String r0 = "SBI"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x000e
            r0 = 4
        L_0x0031:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x0035:
            r3.A01 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C197109ca.A0B(java.lang.String):void");
    }

    public void BK0(AnonymousClass34V r2, int i) {
        BKA(A03(r2, i));
    }

    public void BKB(Integer num, Integer num2, String str, String str2) {
        this.A02.BhD(A05(num, num2, str, str2));
    }

    public void BKC(Integer num, Integer num2, String str, String str2, boolean z) {
        C134246ig A05 = A05(num, num2, str, str2);
        A05.A05 = Boolean.valueOf(z);
        this.A02.BhD(A05);
    }
}
