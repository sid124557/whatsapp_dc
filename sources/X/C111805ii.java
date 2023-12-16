package X;

import com.whatsapp.R;
import com.whatsapp.biz.catalog.view.CatalogMediaCard;
import com.whatsapp.jid.UserJid;
import java.util.Iterator;

/* renamed from: X.5ii  reason: invalid class name and case insensitive filesystem */
public class C111805ii implements C184038r9 {
    public final /* synthetic */ C50482iF A00;
    public final /* synthetic */ UserJid A01;

    public C111805ii(C50482iF r1, UserJid userJid) {
        this.A00 = r1;
        this.A01 = userJid;
    }

    public void BTF(C160157n8 r6, int i) {
        C50482iF r2 = this.A00;
        r2.A00 = false;
        if (i == 406 || i == 404) {
            r2.A06.A0F(this.A01);
        }
        C97104xd r0 = r2.A05;
        UserJid userJid = this.A01;
        Iterator A03 = C61102zi.A03(r0);
        while (A03.hasNext()) {
            C111965iy r1 = (C111965iy) A03.next();
            CatalogMediaCard catalogMediaCard = r1.A06;
            if (AnonymousClass75J.A00(catalogMediaCard.A07, userJid)) {
                C50482iF r02 = r1.A05;
                if (!r02.A06.A0J(catalogMediaCard.A07)) {
                    int i2 = R.string.f11nameremoved;
                    if (i != -1) {
                        i2 = R.string.f11nameremoved;
                        if (i != 404) {
                            i2 = R.string.f11nameremoved;
                        }
                    }
                    catalogMediaCard.setError(i2);
                }
            }
        }
    }

    public void BTG(C64523Dv r5, C160157n8 r6) {
        C50482iF r3 = this.A00;
        r3.A00 = false;
        if (r6.A08 == null) {
            C105405Uu r0 = r3.A06;
            UserJid userJid = this.A01;
            r0.A0D(r5, userJid, false);
            r3.A05.A08(userJid);
        }
    }
}
