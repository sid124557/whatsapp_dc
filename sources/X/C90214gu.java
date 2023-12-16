package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.4gu  reason: invalid class name and case insensitive filesystem */
public class C90214gu extends C90244gx {
    public final C105405Uu A00;
    public final C184098rF A01;
    public final C106665Zw A02;
    public final C29441ip A03;
    public final AnonymousClass7PB A04;
    public final C105915Wx A05;
    public final AnonymousClass31C A06;
    public final C105255Ue A07;

    public C90214gu(C620433g r2, C105405Uu r3, C184098rF r4, C106665Zw r5, C29441ip r6, AnonymousClass7PB r7, C105915Wx r8, AnonymousClass31C r9, C105255Ue r10) {
        super(r2, r7.A01);
        this.A02 = r5;
        this.A06 = r9;
        this.A07 = r10;
        this.A04 = r7;
        this.A00 = r3;
        this.A03 = r6;
        this.A05 = r8;
        this.A01 = r4;
    }

    public void BQs(String str) {
        Log.e("ProductRequestProtocolHelper/onDeliveryFailure");
        this.A07.A03("view_product_tag");
        this.A01.BT2(this.A04, 0);
    }

    public void BdM(AnonymousClass36K r7, String str) {
        this.A07.A03("view_product_tag");
        C106665Zw r2 = this.A02;
        C64523Dv A022 = r2.A02(r7);
        AnonymousClass7PB r5 = this.A04;
        UserJid userJid = r5.A01;
        r2.A04(this.A01, userJid, r7);
        if (A022 != null) {
            List list = A022.A02;
            if (!list.isEmpty()) {
                Log.d("ProductRequestProtocolHelper/onSuccess/success");
                this.A00.A0E((C109015dw) list.get(0), userJid);
                this.A01.BT4(r5, ((C109015dw) list.get(0)).A0F);
                return;
            }
        }
        Log.e("ProductRequestProtocolHelper/onSuccess/error: empty response");
    }
}
