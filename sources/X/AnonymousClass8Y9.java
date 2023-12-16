package X;

import com.whatsapp.catalogcategory.view.fragment.CatalogCategoryExpandableGroupsListFragment;
import com.whatsapp.catalogcategory.view.viewmodel.CatalogCategoryGroupsViewModel;
import com.whatsapp.jid.UserJid;
import java.util.List;
import java.util.Map;

/* renamed from: X.8Y9  reason: invalid class name */
public final class AnonymousClass8Y9 extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ CatalogCategoryExpandableGroupsListFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8Y9(CatalogCategoryExpandableGroupsListFragment catalogCategoryExpandableGroupsListFragment) {
        super(1);
        this.this$0 = catalogCategoryExpandableGroupsListFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass6FA r2;
        List list;
        Map map;
        AnonymousClass7DR r5 = (AnonymousClass7DR) obj;
        if (r5 instanceof C133016gY) {
            r2 = this.this$0.A04;
            if (r2 == null) {
                throw C18270x1.A0S("expandableListAdapter");
            }
            list = r5.A00;
            map = C73813g7.A0A();
        } else {
            if (r5 instanceof C133036ga) {
                AnonymousClass6FA r1 = this.this$0.A04;
                if (r1 == null) {
                    throw C18270x1.A0S("expandableListAdapter");
                }
                C133036ga r52 = (C133036ga) r5;
                List list2 = r52.A00;
                Map map2 = r52.A01;
                r1.A00 = list2;
                r1.A01 = map2;
                r1.notifyDataSetChanged();
                if (AnonymousClass001.A1U(this.this$0.A0L.A02.compareTo(AnonymousClass0GC.RESUMED))) {
                    CatalogCategoryGroupsViewModel catalogCategoryGroupsViewModel = (CatalogCategoryGroupsViewModel) this.this$0.A08.getValue();
                    UserJid userJid = this.this$0.A05;
                    if (userJid == null) {
                        throw C18270x1.A0S("bizJid");
                    }
                    catalogCategoryGroupsViewModel.A0E(userJid, list2);
                }
            } else if (r5 instanceof C133026gZ) {
                r2 = this.this$0.A04;
                if (r2 == null) {
                    throw C18270x1.A0S("expandableListAdapter");
                }
                C133026gZ r53 = (C133026gZ) r5;
                list = r53.A00;
                map = r53.A01;
            }
            return C59022wD.A00;
        }
        r2.A00 = list;
        r2.A01 = map;
        r2.notifyDataSetChanged();
        return C59022wD.A00;
    }
}
