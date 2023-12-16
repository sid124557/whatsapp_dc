package X;

import android.content.Context;
import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.9VE  reason: invalid class name */
public class AnonymousClass9VE {
    public final Context A00;
    public final C69263Wi A01;
    public final C56972sr A02;
    public final C56612sH A03;
    public final C195319Xg A04;
    public final AnonymousClass39L A05;
    public final AnonymousClass39L A06;
    public final AnonymousClass39U A07;
    public final AnonymousClass1VX A08;
    public final UserJid A09;
    public final UserJid A0A;
    public final C40602Ha A0B;
    public final AnonymousClass9U5 A0C;
    public final AnonymousClass9U4 A0D;
    public final AnonymousClass9U4 A0E;
    public final C194089Rn A0F;
    public final C194149Rt A0G;
    public final AnonymousClass9VU A0H;
    public final C160757oG A0I = C160757oG.A00("PaymentPrecheckAction", "network", "COMMON");
    public final AnonymousClass9SD A0J;
    public final C194969Vi A0K;
    public final C59942xk A0L;
    public final AnonymousClass9W3 A0M;
    public final AnonymousClass9TR A0N;
    public final AnonymousClass9V6 A0O;
    public final C194259Se A0P;
    public final AnonymousClass4FS A0Q;
    public final String A0R;
    public final String A0S;
    public final String A0T;
    public final String A0U;
    public final String A0V;

    public final void A01(AnonymousClass0QU r13, C196039aC r14, C193849Qh r15) {
        C56612sH r1 = this.A03;
        String A022 = AnonymousClass35J.A02(this.A02, r1);
        long A002 = C56612sH.A00(r1);
        Object[] objArr = new Object[6];
        objArr[0] = AnonymousClass36P.A05(this.A09);
        AnonymousClass39L r2 = this.A05;
        objArr[1] = Integer.valueOf(r2.A00());
        AnonymousClass000.A1N(objArr, r2.A00);
        objArr[3] = ((AnonymousClass3H6) r2.A01).A04;
        AnonymousClass000.A1Q(objArr, 4, A002);
        objArr[5] = A022;
        byte[] A003 = AnonymousClass9VB.A00(objArr);
        AnonymousClass9W3 r3 = this.A0M;
        C196019aA r5 = new C196019aA(this, r14, r15, A022, A002);
        C05860Vg A004 = AnonymousClass9W3.A00();
        if (A004 != null) {
            r3.A00.A04(new AnonymousClass94X(r5, r3, A003), A004, r13);
            return;
        }
        r3.A02.A06("sign: cryptoObject is null");
        r3.A03();
        r14.A01();
    }

    public static /* synthetic */ void A00(AnonymousClass9VE r14, C203729oD r15, AnonymousClass36K r16, String str) {
        C203719oC r9;
        AnonymousClass36K r2;
        ArrayList A0s = AnonymousClass001.A0s();
        AnonymousClass39V.A03("action", "pay-precheck", A0s);
        AnonymousClass39V.A03("country", "BR", A0s);
        AnonymousClass39V.A03("credential-id", r14.A0R, A0s);
        AnonymousClass39V.A03("nonce", str, A0s);
        AnonymousClass39V.A01(r14.A09, "receiver", A0s);
        AnonymousClass39V.A03("device-id", r14.A0P.A01(), A0s);
        String str2 = r14.A0U;
        AnonymousClass39V.A03("transaction-type", str2, A0s);
        AnonymousClass1VX r7 = r14.A08;
        if (r7.A0X(1746) && (!"p2m".equals(str2) || r14.A07 == null)) {
            AnonymousClass39V.A03("payment_initiator", "buyer", A0s);
        }
        C59942xk r0 = r14.A0L;
        if (r0 != null) {
            A0s.add(new AnonymousClass39V("offer_id", r0.A01));
        }
        String str3 = r14.A0S;
        if (!TextUtils.isEmpty(str3)) {
            AnonymousClass39V.A03("payment-rails", str3, A0s);
        }
        String str4 = r14.A0T;
        if (!TextUtils.isEmpty(str4)) {
            AnonymousClass39V.A03("request-id", str4, A0s);
        }
        AnonymousClass9SU A0F2 = r14.A0D.A0F("BR");
        if (A0F2 != null) {
            r9 = A0F2.A01(((AnonymousClass3H6) r14.A05.A01).A04);
        } else {
            r9 = null;
        }
        ArrayList A0i = AnonymousClass0x2.A0i(new AnonymousClass36K[]{r16, new AnonymousClass36K(r9.B9q(r14.A05), "amount", new AnonymousClass39V[0]), new AnonymousClass36K(r9.B9q(r14.A06), "total-amount", new AnonymousClass39V[0])});
        AnonymousClass39U r1 = r14.A07;
        if (r1 != null) {
            List A002 = r1.A00();
            List<AnonymousClass38Y> list = r1.A05;
            if (list != null && !list.isEmpty()) {
                String str5 = r1.A03;
                if ("physical-goods".equals(str5)) {
                    C1899593h.A1R("order-type", str5, A002);
                    ArrayList A0p = AnonymousClass000.A0p(list);
                    for (AnonymousClass38Y r12 : list) {
                        ArrayList A0s2 = AnonymousClass001.A0s();
                        AnonymousClass39V.A03(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, r12.A04, A0s2);
                        AnonymousClass39V.A03("address_line1", r12.A00, A0s2);
                        String str6 = r12.A01;
                        if (str6.length() != 0) {
                            AnonymousClass39V.A03("address_line2", str6, A0s2);
                        }
                        String str7 = r12.A02;
                        if (str7.length() != 0) {
                            AnonymousClass39V.A03("city", str7, A0s2);
                        }
                        String str8 = r12.A06;
                        if (str8.length() != 0) {
                            AnonymousClass39V.A03("state", str8, A0s2);
                        }
                        AnonymousClass39V.A03("country", r12.A03, A0s2);
                        AnonymousClass39V.A03("postal_code", r12.A05, A0s2);
                        A0p.add(AnonymousClass36K.A0I("beneficiary", C18300x5.A1Z(A0s2, 0)));
                    }
                    r2 = new AnonymousClass36K(new AnonymousClass36K("beneficiaries", (AnonymousClass39V[]) null, C18280x3.A1a(A0p, 0)), "order", (AnonymousClass39V[]) A002.toArray(new AnonymousClass39V[0]));
                    A0i.add(r2);
                }
            }
            r2 = AnonymousClass36K.A0I("order", (AnonymousClass39V[]) A002.toArray(new AnonymousClass39V[0]));
            A0i.add(r2);
        }
        C195319Xg r13 = r14.A04;
        if (r13 != null && r7.A0X(4443)) {
            A0i.add(r13.A00());
        }
        C203729oD r132 = r15;
        Integer BK3 = r15.BK3();
        AnonymousClass36K r3 = new AnonymousClass36K("account", C18300x5.A1Z(A0s, 0), C18280x3.A1a(A0i, A0i.size()));
        r14.A0C.A0G(new C203909oV(r14.A00, r14.A0B, r14.A01, r132, r14, BK3, 4), r3, "set", C625635p.A0L);
    }

    public AnonymousClass9VE(Context context, C69263Wi r11, C56972sr r12, C56612sH r13, C195319Xg r14, AnonymousClass39L r15, AnonymousClass39L r16, AnonymousClass39U r17, AnonymousClass1VX r18, UserJid userJid, C40602Ha r20, AnonymousClass9U5 r21, AnonymousClass9U4 r22, C194089Rn r23, AnonymousClass9VU r24, AnonymousClass9SD r25, C194969Vi r26, C59942xk r27, AnonymousClass9W3 r28, AnonymousClass9TR r29, C194259Se r30, AnonymousClass4FS r31, String str, String str2, String str3, String str4, String str5) {
        this.A03 = r13;
        this.A08 = r18;
        this.A00 = context;
        this.A01 = r11;
        this.A02 = r12;
        this.A0Q = r31;
        this.A0F = r23;
        this.A0P = r30;
        AnonymousClass9U4 r1 = r22;
        this.A0D = r1;
        this.A0N = r29;
        AnonymousClass9U5 r6 = r21;
        this.A0C = r6;
        this.A0K = r26;
        C40602Ha r5 = r20;
        this.A0B = r5;
        this.A0M = r28;
        AnonymousClass9VU r7 = r24;
        this.A0H = r7;
        this.A0O = new AnonymousClass9V6(r12, r13, r6);
        this.A0G = new C194149Rt(context, r11, r5, r6, r7, "PIN");
        this.A0R = str;
        this.A0A = C56972sr.A04(r12);
        this.A09 = userJid;
        this.A05 = r15;
        this.A06 = r16;
        this.A0U = str4;
        this.A0L = r27;
        this.A0S = str3;
        this.A0T = str2;
        this.A07 = r17;
        this.A04 = r14;
        this.A0E = r1;
        this.A0J = r25;
        this.A0V = str5;
    }
}
