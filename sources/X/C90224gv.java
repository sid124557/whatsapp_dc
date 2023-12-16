package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.4gv  reason: invalid class name and case insensitive filesystem */
public class C90224gv extends C90244gx {
    public final C55682qk A00;
    public final C184068rC A01;
    public final C106665Zw A02;
    public final C29441ip A03;
    public final C160157n8 A04;
    public final C105915Wx A05;
    public final AnonymousClass31C A06;
    public final C105255Ue A07;

    public C90224gv(C55682qk r2, C620433g r3, C184068rC r4, C106665Zw r5, C29441ip r6, C160157n8 r7, C105915Wx r8, AnonymousClass31C r9, C105255Ue r10) {
        super(r3, r7.A07);
        this.A02 = r5;
        this.A00 = r2;
        this.A07 = r10;
        this.A06 = r9;
        this.A04 = r7;
        this.A03 = r6;
        this.A01 = r4;
        this.A05 = r8;
    }

    public boolean A06() {
        if (!this.A03.A0F()) {
            StringBuilder A0l = AnonymousClass000.A0l("app/sendGetBizProductCatalog jid=");
            A0l.append(this.A04.A07);
            C18260x0.A1L(A0l, " failed");
            return false;
        }
        C90244gx.A00(this.A01, this);
        StringBuilder A0l2 = AnonymousClass000.A0l("app/sendGetBizProductCatalog jid=");
        A0l2.append(this.A04.A07);
        C18260x0.A1L(A0l2, " success");
        return true;
    }

    public void BQs(String str) {
        C160157n8 r2 = this.A04;
        if (r2.A08 == null) {
            this.A07.A01();
        }
        Log.e("sendGetBizProductCatalog/delivery-error");
        this.A01.BSo(r2, -1);
    }

    public void BdM(AnonymousClass36K r6, String str) {
        C160157n8 r4 = this.A04;
        if (r4.A08 == null) {
            this.A07.A01();
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("sendGetBizProductCatalog/onSuccess jid=");
        UserJid userJid = r4.A07;
        C18260x0.A0m(userJid, A0o);
        C106665Zw r2 = this.A02;
        C64523Dv A022 = r2.A02(r6);
        r2.A04(this.A01, userJid, r6);
        if (A022 != null) {
            this.A01.BdO(A022, r4);
            return;
        }
        this.A01.BSo(r4, 0);
        this.A00.A0A("RequestBizProductCatalogProtocolHelper/get product catalog error", true, "error_code=0");
    }
}
