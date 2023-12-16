package X;

import android.content.Context;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.R;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.9Vt  reason: invalid class name and case insensitive filesystem */
public class C195069Vt {
    public static Map A0D = new C201749kf();
    public static Map A0E = new C201759kg();
    public final C116985rC A00;
    public final C111095hX A01;
    public final C69263Wi A02;
    public final AnonymousClass5NS A03;
    public final C617332a A04;
    public final AnonymousClass9U5 A05;
    public final AnonymousClass9U4 A06;
    public final C190839Aa A07;
    public final C194199Ry A08;
    public final AnonymousClass2YZ A09;
    public final C194649Ty A0A;
    public final C194259Se A0B;
    public final C60482yd A0C;

    public void A00(Context context, String str) {
        C69263Wi r5 = this.A02;
        r5.A0G(0, R.string.f11nameremoved);
        HashMap A0t = AnonymousClass001.A0t();
        A0t.put("action", "start");
        HashMap A0t2 = AnonymousClass001.A0t();
        A0t2.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "modal");
        HashMap A0t3 = AnonymousClass001.A0t();
        A0t3.put("style", A0t2);
        A0t.put("presentation", A0t3);
        HashMap A0t4 = AnonymousClass001.A0t();
        A0t4.put("device_id", this.A0B.A01());
        AnonymousClass2YZ r7 = this.A09;
        C161447pg r6 = r7.A01;
        r6.A0E(A0t4);
        C52622lm r10 = new C52622lm("br_merchant_onboarding", (String) null, A0t);
        C204609pd r3 = new C204609pd(this, 0);
        C205149qV r8 = new C205149qV(this, 0);
        AnonymousClass3XA r2 = new AnonymousClass3XA();
        r6.A0P.put("BRMerchantData", r3);
        r7.A00(r8, new AnonymousClass9W9(r2, 0, this), r10, str, (Map) null);
        r2.A04(new C205009qH(context, 0, this), r5.A08);
    }

    public C195069Vt(C116985rC r1, C111095hX r2, C69263Wi r3, AnonymousClass5NS r4, C617332a r5, AnonymousClass9U5 r6, AnonymousClass9U4 r7, C190839Aa r8, C194199Ry r9, AnonymousClass2YZ r10, C194649Ty r11, C194259Se r12, C60482yd r13) {
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
        this.A0B = r12;
        this.A06 = r7;
        this.A0C = r13;
        this.A09 = r10;
        this.A05 = r6;
        this.A04 = r5;
        this.A07 = r8;
        this.A0A = r11;
        this.A08 = r9;
        this.A03 = r4;
    }

    public C195069Vt() {
    }
}
