package X;

import android.content.Context;
import com.whatsapp.jid.UserJid;
import com.whatsapp.wabloks.ui.WaBloksActivity;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.9Tf  reason: invalid class name and case insensitive filesystem */
public class C194519Tf {
    public C64773Ex A00;
    public C620733j A01;
    public C624034w A02;
    public C195219Wq A03;
    public String A04;

    public void A00() {
        this.A04 = "wa_p2m_lite_receipt_support";
    }

    public void A01(Context context) {
        C64773Ex r0;
        try {
            C626936e.A06(this.A04);
            C626936e.A06(this.A01);
            JSONObject A1G = AnonymousClass0x9.A1G();
            A1G.put("ref", this.A04);
            A1G.put("locale", this.A01.A08());
            C624034w r02 = this.A02;
            if (r02 != null) {
                A1G.put("transaction_id", r02.A0K);
                C624034w r03 = this.A02;
                AnonymousClass39Q r5 = r03.A08;
                if (r5 != null) {
                    A1G.put("transaction_amount", AnonymousClass9UO.A01(this.A01, r03.A03(), r5, 0, true));
                }
                C195219Wq r2 = this.A03;
                if (r2 != null) {
                    A1G.put("transaction_status", this.A01.A0C(r2.A0B(this.A02)));
                }
                C624034w r04 = this.A02;
                A1G.put("transaction_status_enum", AnonymousClass36S.A03(r04.A03, r04.A02));
                Boolean A06 = this.A02.A06();
                if (A06 != null) {
                    A1G.put("is_transaction_sender", A06);
                }
                UserJid userJid = this.A02.A0D;
                if (!(userJid == null || (r0 = this.A00) == null)) {
                    A1G.put("receiver_name", r0.A0A(userJid).A0L());
                }
            }
            context.startActivity(WaBloksActivity.A0X(context, "com.bloks.www.payments.whatsapp.f2care", AnonymousClass0x9.A1G().put("params", AnonymousClass0x9.A1G().put("server_params", A1G)).toString()));
        } catch (JSONException unused) {
        }
    }

    public void A02(C64773Ex r1) {
        this.A00 = r1;
    }

    public void A03(C620733j r1) {
        this.A01 = r1;
    }

    public void A04(C195219Wq r1) {
        this.A03 = r1;
    }
}
