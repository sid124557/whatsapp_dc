package X;

import com.whatsapp.catalogcategory.view.viewmodel.CatalogCategoryTabsViewModel;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.62p  reason: invalid class name and case insensitive filesystem */
public final class C1219762p extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ UserJid $bizJid;
    public final /* synthetic */ CatalogCategoryTabsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1219762p(CatalogCategoryTabsViewModel catalogCategoryTabsViewModel, UserJid userJid) {
        super(1);
        this.this$0 = catalogCategoryTabsViewModel;
        this.$bizJid = userJid;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ArrayList arrayList;
        AnonymousClass7DP r9 = (AnonymousClass7DP) obj;
        C162457s7.A0J(r9, 0);
        if (r9 instanceof AnonymousClass6gG) {
            List<C43072Qq> list = ((AnonymousClass6gG) r9).A01;
            C06270Wx r6 = (C06270Wx) this.this$0.A05.getValue();
            CatalogCategoryTabsViewModel catalogCategoryTabsViewModel = this.this$0;
            UserJid userJid = this.$bizJid;
            if (catalogCategoryTabsViewModel.A02.A00.A0X(2273)) {
                arrayList = C73783g4.A0d(list);
                for (C43072Qq r0 : list) {
                    String str = r0.A02;
                    C162457s7.A0C(str);
                    String str2 = r0.A01;
                    C162457s7.A0C(str2);
                    arrayList.add(new AnonymousClass7ZH(userJid, str, str2, r0.A04));
                }
            } else {
                ArrayList A0s = AnonymousClass001.A0s();
                for (Object next : list) {
                    C86624Kv.A1Q(next, A0s, ((C43072Qq) next).A04 ? 1 : 0);
                }
                arrayList = C73783g4.A0d(A0s);
                Iterator it = A0s.iterator();
                while (it.hasNext()) {
                    C43072Qq r02 = (C43072Qq) it.next();
                    String str3 = r02.A02;
                    C162457s7.A0C(str3);
                    String str4 = r02.A01;
                    C162457s7.A0C(str4);
                    arrayList.add(new AnonymousClass7ZH(userJid, str3, str4, r02.A04));
                }
            }
            r6.A0G(arrayList);
        }
        return C59022wD.A00;
    }
}
