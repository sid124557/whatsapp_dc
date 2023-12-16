package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.Iterator;

/* renamed from: X.5ij  reason: invalid class name and case insensitive filesystem */
public class C111815ij implements C184038r9 {
    public final /* synthetic */ AnonymousClass5Y9 A00;
    public final /* synthetic */ UserJid A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ boolean A03;

    public C111815ij(AnonymousClass5Y9 r1, UserJid userJid, String str, boolean z) {
        this.A00 = r1;
        this.A03 = z;
        this.A02 = str;
        this.A01 = userJid;
    }

    public void BTG(C64523Dv r9, C160157n8 r10) {
        AnonymousClass5Y9 r7 = this.A00;
        r7.A02 = false;
        boolean z = this.A03;
        if (z) {
            AnonymousClass0x9.A1I(r7.A05);
        }
        String str = r10.A08;
        if (str == null || str.equals(this.A02)) {
            boolean z2 = true;
            boolean A1W = AnonymousClass000.A1W(str);
            C105405Uu r0 = r7.A0C;
            UserJid userJid = this.A01;
            r0.A0D(r9, userJid, A1W);
            C29211iS r2 = r7.A0B;
            String str2 = this.A02;
            r2.A08(userJid, false, AnonymousClass000.A1X(str2));
            if (z) {
                AnonymousClass08M r22 = r7.A03;
                if (str2 != null) {
                    z2 = false;
                }
                r22.A0G(new C132326f6(userJid, "catalog_products_all_items_collection_id", false, z2));
            }
        }
    }

    public void BTF(C160157n8 r6, int i) {
        C18260x0.A0x("onFetchPageCatalogFail error =", AnonymousClass001.A0o(), i);
        AnonymousClass5Y9 r4 = this.A00;
        r4.A02 = false;
        boolean z = this.A03;
        if (z) {
            AnonymousClass0x9.A1I(r4.A05);
        }
        if (i == 406 || i == 404) {
            Log.d("remove catalog cache");
            r4.A0C.A0F(this.A01);
        }
        C29211iS r0 = r4.A0B;
        UserJid userJid = this.A01;
        Iterator A032 = C61102zi.A03(r0);
        while (A032.hasNext()) {
            ((AnonymousClass4CO) A032.next()).BT5(userJid, i);
        }
        if (z) {
            r4.A03.A0G(new C132316f5(userJid, i, "catalog_products_all_items_collection_id"));
        }
    }
}
