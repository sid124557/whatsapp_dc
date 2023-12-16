package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.4gt  reason: invalid class name and case insensitive filesystem */
public class C90204gt extends C90244gx {
    public final C55682qk A00;
    public final C620433g A01;
    public final C181788nK A02;
    public final C106665Zw A03;
    public final C105915Wx A04;
    public final AnonymousClass31C A05;
    public final C105255Ue A06;
    public final String A07;
    public final String A08;
    public final List A09;

    public void BQs(String str) {
        this.A06.A03("plm_details_view_tag");
        Log.e("RequestBizProductListProtocolHelper/onDeliveryFailure");
        C86644Kx.A1K(this.A02, 3);
    }

    public void BdM(AnonymousClass36K r5, String str) {
        this.A06.A03("plm_details_view_tag");
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("RequestBizProductListProtocolHelper/onSuccess/jid=");
        UserJid userJid = this.A00;
        C18260x0.A0m(userJid, A0o);
        C106665Zw r2 = this.A03;
        C64523Dv A022 = r2.A02(r5);
        r2.A04(this.A01, userJid, r5);
        if (A022 == null) {
            C86644Kx.A1K(this.A02, 4);
            this.A00.A0A("RequestBizProductListProtocolHelper/get product catalog error", true, "error_code=0");
            return;
        }
        List list = A022.A02;
        C181788nK r22 = this.A02;
        C64543Dx r0 = new C64543Dx(1);
        r0.A02 = list;
        r22.Bh3(r0);
    }

    public C90204gt(C55682qk r3, C620433g r4, C181788nK r5, C106665Zw r6, UserJid userJid, C105915Wx r8, AnonymousClass31C r9, C40662Hg r10, String str, String str2, List list) {
        super(r4, userJid);
        this.A02 = r5;
        this.A06 = C86644Kx.A0a((C64333Db) AnonymousClass29x.A00(C64333Db.class, r10.A00.A00));
        this.A05 = r9;
        this.A01 = r4;
        this.A03 = r6;
        this.A00 = r3;
        this.A08 = str;
        this.A07 = str2;
        this.A09 = list;
        this.A04 = r8;
    }
}
