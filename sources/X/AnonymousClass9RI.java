package X;

import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9RI  reason: invalid class name */
public class AnonymousClass9RI {
    public final AnonymousClass9AD A00;
    public final AnonymousClass9NS A01;
    public final Runnable A02;

    public AnonymousClass9RI(AnonymousClass9AD r1, AnonymousClass9NS r2, Runnable runnable) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = runnable;
    }

    public void A00(AnonymousClass39Q r17, C166587yw r18, UserJid userJid, C166557yt r20, AnonymousClass99L r21, C59942xk r22, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List list, long j, boolean z, boolean z2, boolean z3, boolean z4) {
        String str10;
        if (z3) {
            this.A02.run();
            return;
        }
        AnonymousClass99L r0 = r21;
        if (z4) {
            str10 = (String) C1899593h.A0X(r0.A0C);
        } else {
            str10 = null;
        }
        AnonymousClass9AD r12 = this.A00;
        String str11 = r18.A0A;
        AnonymousClass9NS r14 = this.A01;
        String str12 = r0.A0Q;
        String str13 = r0.A0R;
        String str14 = r0.A0O;
        String str15 = r0.A0P;
        String str16 = r0.A0S;
        String str17 = r0.A0M;
        AnonymousClass36K r4 = null;
        String str18 = r0.A0N;
        ArrayList A0s = AnonymousClass001.A0s();
        AnonymousClass39V.A03("sender-vpa", str12, A0s);
        if (!TextUtils.isEmpty(str13)) {
            AnonymousClass39V.A03("sender-vpa-id", str13, A0s);
        }
        if (!TextUtils.isEmpty(str14)) {
            C626936e.A06(str14);
            AnonymousClass39V.A03("receiver-vpa", str14, A0s);
        }
        if (!TextUtils.isEmpty(str15)) {
            AnonymousClass39V.A03("receiver-vpa-id", str15, A0s);
        }
        if (!TextUtils.isEmpty(str10)) {
            AnonymousClass39V.A03("upi-bank-info", str10, A0s);
        }
        AnonymousClass39V.A03("seq-no", str16, A0s);
        if (!TextUtils.isEmpty(str17)) {
            AnonymousClass39V.A03("mcc", str17, A0s);
        }
        String str19 = str3;
        if (!TextUtils.isEmpty(str19)) {
            AnonymousClass39V.A03("ref-id", str19, A0s);
        }
        if (!TextUtils.isEmpty((CharSequence) null)) {
            AnonymousClass39V.A03("ref-url", (String) null, A0s);
        }
        C166557yt r7 = r20;
        String str20 = str2;
        if (!C161527pr.A02(r7)) {
            Object obj = r7.A00;
            C626936e.A06(obj);
            String str21 = (String) obj;
            AnonymousClass39V.A03("payee-name", str21, A0s);
            if (!TextUtils.isEmpty(str20) && r12.A05.A0X(1918)) {
                C626936e.A06(obj);
                AnonymousClass39V.A03("receiver-name", str21, A0s);
                AnonymousClass39V.A03("receiver-vpa-token", str20, A0s);
            }
        }
        if (!TextUtils.isEmpty((CharSequence) null)) {
            AnonymousClass39V.A03("mode", (String) null, A0s);
        }
        if (!TextUtils.isEmpty(str18)) {
            AnonymousClass39V.A03("purpose-code", str18, A0s);
        }
        String str22 = str8;
        if (!TextUtils.isEmpty(str22)) {
            AnonymousClass39V.A03("note", str22, A0s);
        }
        AnonymousClass1VX r8 = r12.A05;
        if (r8.A0X(1918)) {
            if (!TextUtils.isEmpty(str20)) {
                AnonymousClass39V.A03("merchant-token", str20, A0s);
            }
            String str23 = "1";
            String str24 = "0";
            if (z) {
                str24 = str23;
            }
            AnonymousClass39V.A03("merchant", str24, A0s);
            if (!z2) {
                str23 = "0";
            }
            AnonymousClass39V.A03("verified-merchant", str23, A0s);
        }
        String str25 = str9;
        if (!TextUtils.isEmpty(str25)) {
            AnonymousClass39V.A03("international-pay-detail", str25, A0s);
        }
        String str26 = str4;
        if (!TextUtils.isEmpty(str26)) {
            AnonymousClass39V.A03("business_order_id", str26, A0s);
        }
        AnonymousClass36K r5 = null;
        if (!TextUtils.isEmpty(str19)) {
            String str27 = str7;
            if (!TextUtils.isEmpty(str27)) {
                ArrayList A0s2 = AnonymousClass001.A0s();
                AnonymousClass39V.A03("order-id", str19, A0s2);
                AnonymousClass39V.A03("payment-config-id", str27, A0s2);
                String str28 = str5;
                if (!TextUtils.isEmpty(str28) && r8.A0X(1599)) {
                    AnonymousClass39V.A03("discount-program-name", str28, A0s2);
                }
                long j2 = j;
                if (j != 0) {
                    A0s2.add(new AnonymousClass39V("expiry-ts", j2));
                }
                String str29 = str6;
                if (r8.A0X(1330) && !TextUtils.isEmpty(str29)) {
                    AnonymousClass39V.A03("order-type", str29, A0s2);
                }
                if ("physical-goods".equals(str29) && r8.A0X(3012) && list != null) {
                    ArrayList A0p = AnonymousClass000.A0p(list);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        AnonymousClass38Y r82 = (AnonymousClass38Y) it.next();
                        ArrayList A0s3 = AnonymousClass001.A0s();
                        AnonymousClass39V.A03(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, r82.A04, A0s3);
                        AnonymousClass39V.A03("address_line1", r82.A00, A0s3);
                        String str30 = r82.A01;
                        if (!TextUtils.isEmpty(str30)) {
                            AnonymousClass39V.A03("address_line2", str30, A0s3);
                        }
                        String str31 = r82.A02;
                        if (!TextUtils.isEmpty(str31)) {
                            AnonymousClass39V.A03("city", str31, A0s3);
                        }
                        String str32 = r82.A06;
                        if (!TextUtils.isEmpty(str32)) {
                            AnonymousClass39V.A03("state", str32, A0s3);
                        }
                        AnonymousClass39V.A03("country", r82.A03, A0s3);
                        AnonymousClass39V.A03("postal_code", r82.A05, A0s3);
                        A0p.add(AnonymousClass36K.A0I("beneficiary", C18300x5.A1Z(A0s3, 0)));
                    }
                    r5 = new AnonymousClass36K("beneficiaries", (AnonymousClass39V[]) null, C18280x3.A1a(A0p, 0));
                }
                r5 = new AnonymousClass36K(r5, "order", C18300x5.A1Z(A0s2, 0));
            }
        }
        AnonymousClass36K r6 = new AnonymousClass36K(r5, "upi", C18300x5.A1Z(A0s, 0));
        Log.i("PAY: IndiaUpiPayPrecheckAction sendPrecheck called");
        ArrayList A0s4 = AnonymousClass001.A0s();
        AnonymousClass39V.A03("action", "pay-precheck", A0s4);
        AnonymousClass39V.A03("country", "IN", A0s4);
        AnonymousClass39V.A03("credential-id", str11, A0s4);
        UserJid userJid2 = userJid;
        if (userJid != null) {
            AnonymousClass39V.A01(userJid2, "receiver", A0s4);
        }
        C1899593h.A1S("version", A0s4, 1);
        AnonymousClass39V.A03("nonce", AnonymousClass35J.A02(r12.A02, r12.A03), A0s4);
        AnonymousClass39V.A03("device-id", r12.A0C.A01(), A0s4);
        AnonymousClass39V.A03("transaction-type", str, A0s4);
        C59942xk r13 = r22;
        if (r22 != null) {
            A0s4.add(new AnonymousClass39V("offer_id", r13.A01));
        }
        AnonymousClass39Q r3 = r17;
        if (r17 != null) {
            r4 = r12.A08.A05(AnonymousClass1S3.A05, r3, "amount");
        }
        C153607bd A022 = AnonymousClass9OC.A02(r12, "pay-precheck");
        r12.A08.A0G(new AnonymousClass9AY(r12.A00, r12.A01, r12.A07, A022, r12, r13, r14, r12.A0B.A00("pay-precheck")), new AnonymousClass36K("account", C18300x5.A1Z(A0s4, 0), new AnonymousClass36K[]{r6, r4}), "set", C625635p.A0L);
    }
}
