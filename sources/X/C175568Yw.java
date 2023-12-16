package X;

import com.whatsapp.catalogcategory.view.viewmodel.CatalogCategoryGroupsViewModel;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.8Yw  reason: invalid class name and case insensitive filesystem */
public final class C175568Yw extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ UserJid $bizJid;
    public final /* synthetic */ List $catalogCategoryGroups;
    public final /* synthetic */ Map $categoryParentToChildItemMap;
    public final /* synthetic */ CatalogCategoryGroupsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C175568Yw(CatalogCategoryGroupsViewModel catalogCategoryGroupsViewModel, UserJid userJid, List list, Map map) {
        super(1);
        this.this$0 = catalogCategoryGroupsViewModel;
        this.$catalogCategoryGroups = list;
        this.$categoryParentToChildItemMap = map;
        this.$bizJid = userJid;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C06270Wx r3;
        Object obj2;
        AnonymousClass7DP r9 = (AnonymousClass7DP) obj;
        C162457s7.A0J(r9, 0);
        if (r9 instanceof AnonymousClass6gH) {
            this.this$0.A03.A0G(Boolean.FALSE);
            Map map = ((AnonymousClass6gH) r9).A01;
            Map map2 = this.$categoryParentToChildItemMap;
            UserJid userJid = this.$bizJid;
            Iterator A0q = AnonymousClass000.A0q(map);
            while (A0q.hasNext()) {
                Map.Entry A0w = AnonymousClass001.A0w(A0q);
                Iterable<C43072Qq> iterable = (Iterable) A0w.getValue();
                Object key = A0w.getKey();
                ArrayList A0c = C73783g4.A0c(iterable);
                for (C43072Qq r1 : iterable) {
                    A0c.add(new C132926gL(r1, userJid));
                }
                map2.put(key, A0c);
            }
            r3 = AnonymousClass6CA.A0J(this.this$0.A09);
            obj2 = new C133026gZ(this.$catalogCategoryGroups, this.$categoryParentToChildItemMap);
        } else {
            if (r9 instanceof C132916gE) {
                r3 = this.this$0.A03;
                obj2 = Boolean.TRUE;
            }
            return C59022wD.A00;
        }
        r3.A0G(obj2);
        return C59022wD.A00;
    }
}
