package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

/* renamed from: X.5QD  reason: invalid class name */
public final class AnonymousClass5QD {
    public final C105145Tt A00;
    public final AnonymousClass5Y9 A01;
    public final C40042Eh A02;
    public final C55752qr A03;

    public void A00(UserJid userJid, String str, AnonymousClass4GQ r5) {
        C162457s7.A0J(str, 0);
        A01(userJid, C18290x4.A13(str), new C175418Yh(str, r5));
    }

    public void A01(UserJid userJid, Set set, AnonymousClass4GQ r13) {
        UserJid userJid2;
        C162457s7.A0J(set, 0);
        Iterator it = set.iterator();
        do {
            userJid2 = userJid;
            if (it.hasNext()) {
            } else {
                Log.d("WACC CachedCatalogCategoryRepository requestSubCategories isEachCached");
                LinkedHashMap A0r = C18320x8.A0r();
                Iterator it2 = set.iterator();
                while (it2.hasNext()) {
                    String A0m = AnonymousClass001.A0m(it2);
                    A0r.put(A0m, this.A03.A01(userJid, A0m));
                }
                r13.invoke(new AnonymousClass6gH(A0r, true));
                return;
            }
        } while (this.A03.A05(userJid, AnonymousClass001.A0m(it)));
        Log.d("WACC CachedCatalogCategoryRepository requestSubCategories sendingNetworkRequest");
        Set set2 = set;
        if (set.contains("catalog_category_dummy_root_id")) {
            set2 = C72063d7.A00;
        }
        C111795ih r1 = new C111795ih(this, userJid, set, r13);
        int i = this.A02.A00;
        C151157Tq r4 = new C151157Tq(userJid2, this.A00.A02, set2, i, i);
        AnonymousClass8ET r3 = new AnonymousClass8ET(r1, this);
        AnonymousClass5Y9 r2 = this.A01;
        r2.A0F.A00(r4, new AnonymousClass92N(r2, 1, r3));
    }

    public AnonymousClass5QD(C105145Tt r2, AnonymousClass5Y9 r3, C40042Eh r4, C55752qr r5) {
        C18260x0.A0Q(r3, r5);
        C162457s7.A0J(r2, 4);
        this.A01 = r3;
        this.A03 = r5;
        this.A02 = r4;
        this.A00 = r2;
    }
}
