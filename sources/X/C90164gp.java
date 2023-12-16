package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.4gp  reason: invalid class name and case insensitive filesystem */
public class C90164gp extends AnonymousClass8JJ {
    public final C146947Cf A00;
    public final C149847Od A01;
    public final AnonymousClass1VX A02;
    public final C105915Wx A03;
    public final AnonymousClass31C A04;
    public final C105255Ue A05;
    public final C147527Eq A06;

    public boolean A02() {
        AnonymousClass36K r7;
        boolean z;
        String A032 = this.A04.A03();
        this.A05.A04("report_product_tag");
        C620433g r0 = this.A01;
        C149847Od r3 = this.A01;
        String A012 = r0.A07.A01(r3.A02);
        C105915Wx r2 = this.A03;
        C147527Eq r4 = this.A06;
        AnonymousClass8PC r1 = new AnonymousClass8PC(this, A032, A012);
        C118115t1 r02 = new C118115t1(this, A032, A012);
        if (r4 != null) {
            C41032Ir r12 = (C41032Ir) r1.invoke();
            C162457s7.A0J(r12, 1);
            r4.A00.put(A032, r12);
            r7 = r12.A00;
            C162457s7.A0H(r7);
        } else {
            r7 = (AnonymousClass36K) r02.invoke();
        }
        try {
            if (r2.A00.A0X(1319)) {
                z = C105915Wx.A00(this, A032);
            } else {
                z = r2.A01.A0K(this, r7, A032, 193, 32000);
            }
        } catch (AnonymousClass24Y e) {
            Log.e(e.getMessage());
            z = false;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("app/sendReportBizProduct productId=");
        A0o.append(r3.A03);
        C18260x0.A1E(" success:", A0o, z);
        return z;
    }

    public void BQs(String str) {
        Log.e("sendReportBizProduct/delivery-error");
        AnonymousClass75Q.A00(this.A06, str);
        C105255Ue r4 = this.A05;
        r4.A03("report_product_tag");
        C146947Cf r0 = this.A00;
        r0.A00.A04(this.A01, false);
        r4.A06("report_product_tag", false);
    }

    public void BSN(AnonymousClass36K r9, String str) {
        C41032Ir r2;
        boolean z;
        Log.e("sendReportBizProduct/response-error");
        C105255Ue r6 = this.A05;
        r6.A03("report_product_tag");
        try {
            C147527Eq r4 = this.A06;
            C162457s7.A0J(str, 1);
            if (r4 != null) {
                r2 = (C41032Ir) r4.A00.get(str);
            } else {
                r2 = null;
            }
            C35711xJ r22 = (C35711xJ) r2;
            if (!this.A02.A0X(3497) || r22 == null) {
                C149847Od r23 = this.A01;
                z = false;
                if (!A01(r23.A02, C57492tj.A01(r9))) {
                    this.A00.A00.A04(r23, false);
                }
            } else {
                AnonymousClass36K.A0N(r9, "iq");
                C626836d.A04(r9, new AnonymousClass92Z(r22.A00, 73), new String[0]);
                AnonymousClass4B7[] r24 = {new C1896292a(378), new C1896292a(379), new C1896292a(380), new C1896292a(381), new C1896292a(382), new C1896292a(383), new C1896292a(384), new C1896292a(385)};
                C149847Od r25 = this.A01;
                z = false;
                if (!A01(r25.A02, ((C183498q8) C626836d.A07(r9, "IQErrorBadRequest|IQErrorNotAuthorized|IQErrorItemNotFound|IQErrorNotAcceptable|IQErrorInternalServerError|IQErrorServiceUnavailable|IQErrorDirectConnectionInvalidEncryptedInfo|IQErrorUnavailableForLegalReasons", AnonymousClass0x2.A0i(r24), new String[]{"error"})).B5b().intValue())) {
                    this.A00.A00.A04(r25, false);
                }
            }
            r6.A06("report_product_tag", z);
            AnonymousClass75Q.A00(r4, str);
        } catch (Throwable th) {
            AnonymousClass75Q.A00(this.A06, str);
            throw th;
        }
    }

    public void BdM(AnonymousClass36K r9, String str) {
        C41032Ir r1;
        boolean z;
        C146947Cf r0;
        C149847Od r12;
        C105255Ue r5 = this.A05;
        r5.A03("report_product_tag");
        try {
            C147527Eq r3 = this.A06;
            C162457s7.A0J(str, 1);
            if (r3 != null) {
                r1 = (C41032Ir) r3.A00.get(str);
            } else {
                r1 = null;
            }
            C35711xJ r13 = (C35711xJ) r1;
            if (r13 != null) {
                AnonymousClass36K.A0N(r9, "iq");
                AnonymousClass36K r7 = r13.A00;
                String A0A = C626836d.A0A(r9, C139696sT.A00, new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE, "success", "#elementValue"});
                C626836d.A04(r9, new AnonymousClass92Z(r7, 74), new String[0]);
                z = A0A.equals("true");
                C146947Cf r02 = this.A00;
                r02.A00.A04(this.A01, z);
            } else {
                AnonymousClass36K A0l = r9.A0l(PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE);
                z = false;
                if (A0l != null) {
                    AnonymousClass36K A0l2 = A0l.A0l("success");
                    if (A0l2 != null) {
                        if ("true".equals(A0l2.A0n())) {
                            r0 = this.A00;
                            r12 = this.A01;
                            z = true;
                        }
                        r0 = this.A00;
                        r12 = this.A01;
                    }
                    AnonymousClass75Q.A00(r3, str);
                }
                StringBuilder A0o = AnonymousClass001.A0o();
                C18260x0.A1K(A0o, C18300x5.A0k(r9, "sendReportBizProduct/corrupted-response:", A0o));
                r0 = this.A00;
                r12 = this.A01;
                r0.A00.A04(r12, z);
            }
            r5.A06("report_product_tag", z);
            AnonymousClass75Q.A00(r3, str);
        } catch (Throwable th) {
            AnonymousClass75Q.A00(this.A06, str);
            throw th;
        }
    }

    public C90164gp(C620433g r2, C146947Cf r3, C149847Od r4, AnonymousClass1VX r5, C105915Wx r6, AnonymousClass31C r7, C105255Ue r8) {
        super(r2);
        C147527Eq r0;
        this.A05 = r8;
        this.A04 = r7;
        this.A01 = r4;
        this.A03 = r6;
        this.A00 = r3;
        this.A02 = r5;
        if (r5.A0X(3497)) {
            r0 = new C147527Eq();
        } else {
            r0 = null;
        }
        this.A06 = r0;
    }

    public void BRC(UserJid userJid) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("sendReportBizProduct/direct-connection-error/jid=");
        C18260x0.A1K(A0o, userJid.getRawString());
        C146947Cf r0 = this.A00;
        r0.A00.A04(this.A01, false);
    }

    public void BRD(UserJid userJid) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("sendReportBizProduct/direct-connection-success/jid=");
        C18260x0.A1K(A0o, userJid.getRawString());
        A02();
    }
}
