package X;

import android.content.Context;
import android.os.Bundle;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;

/* renamed from: X.9AY  reason: invalid class name */
public class AnonymousClass9AY extends C1908099x {
    public final /* synthetic */ AnonymousClass9AD A00;
    public final /* synthetic */ C59942xk A01;
    public final /* synthetic */ AnonymousClass9NS A02;
    public final /* synthetic */ Integer A03;

    public void A03(AnonymousClass34V r8) {
        super.A03(r8);
        A06(r8);
        this.A02.A00.A83((AnonymousClass99D) null, (AnonymousClass99D) null, r8, (String) null, (String) null, false);
    }

    public void A04(AnonymousClass34V r8) {
        super.A04(r8);
        A06(r8);
        this.A02.A00.A83((AnonymousClass99D) null, (AnonymousClass99D) null, r8, (String) null, (String) null, false);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9AY(Context context, C69263Wi r8, C40602Ha r9, C153607bd r10, AnonymousClass9AD r11, C59942xk r12, AnonymousClass9NS r13, Integer num) {
        super(context, r8, r9, r10, "pay-precheck");
        this.A00 = r11;
        this.A02 = r13;
        this.A01 = r12;
        this.A03 = num;
    }

    public void A05(AnonymousClass36K r19) {
        C59942xk r2;
        String str;
        AnonymousClass99D r10;
        String str2;
        String str3;
        C59942xk r22;
        AnonymousClass36K r0 = r19;
        super.A05(r0);
        try {
            AnonymousClass36K A0l = r0.A0l("account");
            if (A0l == null) {
                Log.e("PAY: IndiaUpiPayPrecheckAction sendPrecheck: empty account node");
                A06((AnonymousClass34V) null);
                this.A02.A00.A83((AnonymousClass99D) null, (AnonymousClass99D) null, C1899693i.A0M(), (String) null, (String) null, false);
                return;
            }
            AnonymousClass99E r9 = new AnonymousClass99E();
            AnonymousClass9AD r6 = this.A00;
            C617332a r102 = r6.A04;
            r9.A04(r102, A0l, 8);
            AnonymousClass36K A0l2 = A0l.A0l("transaction");
            AnonymousClass36K A0l3 = A0l.A0l("upi");
            AnonymousClass36K A0l4 = A0l.A0l("account");
            AnonymousClass34V A002 = AnonymousClass34V.A00(A0l);
            AnonymousClass36K A0l5 = A0l.A0l("offer_eligibility");
            if (A0l2 == null || A0l3 == null) {
                Bundle bundle = r9.A00;
                if (bundle != null && bundle.getString("updatedVpaFor") != null) {
                    AnonymousClass99D r11 = new AnonymousClass99D();
                    if (A0l4 != null) {
                        r11.A04(r102, A0l4, 0);
                    }
                    Bundle bundle2 = r9.A00;
                    if (bundle2 != null) {
                        str = bundle2.getString("updatedVpaFor");
                    } else {
                        str = null;
                    }
                    if ("sender".equals(str)) {
                        r10 = new AnonymousClass99D();
                        r10.A05 = C56972sr.A04(r6.A02);
                        AnonymousClass3QD A003 = AnonymousClass3QD.A00();
                        Bundle bundle3 = r9.A00;
                        if (bundle3 != null) {
                            str2 = bundle3.getString("updatedSenderVpa");
                        } else {
                            str2 = null;
                        }
                        C166557yt A0G = C1899693i.A0G(A003, str2, "upiHandle");
                        r10.A02 = A0G;
                        Bundle bundle4 = r9.A00;
                        if (bundle4 != null) {
                            str3 = bundle4.getString("updatedSenderVpaId");
                        } else {
                            str3 = null;
                        }
                        r10.A03 = str3;
                        r6.A08.A08((AnonymousClass4EY) null);
                        if (A0G.A00 == null) {
                            r10 = null;
                        } else {
                            r6.A06.A0G(A0G, r11.A03);
                        }
                        r11 = null;
                    } else if (r11.A05 != null) {
                        if (r11.A04) {
                            r11.A02 = null;
                            r11.A03 = null;
                        }
                        C194569Tl A004 = AnonymousClass9U4.A00(r6.A09);
                        AnonymousClass0x7.A1B(new C203869oR(A004, r11), A004.A03);
                        r10 = null;
                    } else {
                        r10 = null;
                        r11 = null;
                    }
                    r6.A0B.A07(this.A03, "pay-precheck");
                    this.A02.A00.A83(r10, r11, (AnonymousClass34V) null, (String) null, (String) null, false);
                } else if (A002 != null) {
                    if (A002.A00 == 2896004) {
                        r6.A0D.BkM(new C198949fk(this));
                    }
                    if (!(A0l5 == null || (r2 = this.A01) == null)) {
                        r6.A0A.A08((C203119n9) null, A0l5, r2.A01);
                    }
                    A06(A002);
                    this.A02.A00.A83((AnonymousClass99D) null, (AnonymousClass99D) null, A002, (String) null, (String) null, false);
                } else {
                    A06((AnonymousClass34V) null);
                    this.A02.A00.A83((AnonymousClass99D) null, (AnonymousClass99D) null, C1899693i.A0M(), (String) null, (String) null, false);
                }
            } else {
                String A0q = A0l2.A0q(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                String A0q2 = A0l3.A0q("token");
                if (!(A0l5 == null || (r22 = this.A01) == null)) {
                    r6.A0A.A08((C203119n9) null, A0l5, r22.A01);
                }
                r6.A0B.A07(this.A03, "pay-precheck");
                this.A02.A00.A83((AnonymousClass99D) null, (AnonymousClass99D) null, (AnonymousClass34V) null, A0q, A0q2, AnonymousClass000.A1W(A0l5));
            }
        } catch (AnonymousClass24Y unused) {
            A06((AnonymousClass34V) null);
            this.A02.A00.A83((AnonymousClass99D) null, (AnonymousClass99D) null, C1899693i.A0M(), (String) null, (String) null, false);
        }
    }

    public final void A06(AnonymousClass34V r4) {
        this.A00.A0B.A05(r4, this.A03, "pay-precheck");
    }
}
