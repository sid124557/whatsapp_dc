package X;

import android.content.SharedPreferences;
import java.util.LinkedHashMap;

/* renamed from: X.2aR  reason: invalid class name and case insensitive filesystem */
public final class C45702aR {
    public final C56612sH A00;
    public final C60152y5 A01;
    public final C41102Iy A02;

    public final C41092Ix A00(C41062Iu r21, C373021s r22, String str, int i, int i2) {
        String str2;
        String str3;
        String str4;
        Object obj;
        C373021s r3 = r22;
        C162457s7.A0J(r3, 2);
        C56612sH r5 = this.A00;
        String num = Integer.toString(i);
        C162457s7.A0D(num);
        C61182zq r2 = new C61182zq(C60152y5.A02(this.A01, "com.whatsapp.psa.qp_surface"), r5, num);
        C373021s r1 = C373021s.IMPRESSION;
        String str5 = str;
        if (r3 == r1 && System.currentTimeMillis() - r2.A02(r1, str5) <= ((long) i2)) {
            return null;
        }
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put("nux_id", String.valueOf(i));
        C41062Iu r0 = r21;
        if (!(r21 == null || (obj = r0.A00.get("INSTANCE_LOG_DATA")) == null)) {
            A0r.put("instance_log_data", obj);
        }
        String A0d = C18280x3.A0d(A0r);
        C162457s7.A0D(A0d);
        C41102Iy r6 = this.A02;
        long currentTimeMillis = System.currentTimeMillis() / ((long) 1000);
        int ordinal = r3.ordinal();
        if (ordinal == 0) {
            str2 = "impression";
        } else if (ordinal == 1) {
            str2 = "primary_click";
        } else if (ordinal != 2) {
            str2 = "dismiss";
            if (!(ordinal == 3 || ordinal == 4)) {
                throw C73153f1.A00();
            }
        } else {
            str2 = "secondary_click";
        }
        AnonymousClass31C r13 = r6.A00;
        String A03 = r13.A03();
        C35651xD r7 = new C35651xD(new C35381wm(A03, 18), Long.valueOf(currentTimeMillis), str5, A0d, str2);
        C69903Yy r62 = new C69903Yy();
        r62.element = new C41092Ix();
        r13.A0K(new AnonymousClass4KQ(r62, 13), C41032Ir.A05(r7), A03, 376, 0);
        C41092Ix r4 = (C41092Ix) r62.element;
        if (r4.A00 == 0) {
            r4 = null;
        }
        if (r3 == r1) {
            r2.A04(str5, "impressionCount", "lastImpressionTime", "lastImpressionForSurface");
        } else if (ordinal != 0) {
            if (ordinal == 1) {
                str3 = "primaryActionCount";
                str4 = "primaryActionTime";
            } else if (ordinal != 2) {
                r2.A04(str5, "dismissActionCount", "dismissActionTime", "lastDismissForSurface");
                return r4;
            } else {
                str3 = "secondaryActionCount";
                str4 = "secondaryActionTime";
            }
            r2.A04(str5, str3, str4, (String) null);
            return r4;
        } else {
            r2.A04(str5, "impressionCount", "lastImpressionTime", (String) null);
        }
        String A032 = r2.A03("lastQPForImpressionForSurface");
        SharedPreferences sharedPreferences = r2.A00;
        C18270x1.A0j(sharedPreferences.edit(), A032, str5);
        C18270x1.A0o(sharedPreferences, C61182zq.A00(str5, "eligibilityDurationAfterFirstImpression"), System.currentTimeMillis());
        return r4;
    }

    public C45702aR(C56612sH r1, C60152y5 r2, C41102Iy r3) {
        C18260x0.A0Q(r2, r1);
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
    }
}
