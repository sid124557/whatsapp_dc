package X;

import android.view.View;
import android.widget.ExpandableListView;
import com.whatsapp.catalogcategory.view.fragment.CatalogCategoryExpandableGroupsListFragment;
import com.whatsapp.catalogcategory.view.viewmodel.CatalogCategoryGroupsViewModel;
import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.7zp  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C167137zp implements ExpandableListView.OnChildClickListener {
    public final /* synthetic */ CatalogCategoryExpandableGroupsListFragment A00;

    public final boolean onChildClick(ExpandableListView expandableListView, View view, int i, int i2, long j) {
        C133026gZ r3;
        AnonymousClass6gM r1;
        CatalogCategoryGroupsViewModel catalogCategoryGroupsViewModel = (CatalogCategoryGroupsViewModel) this.A00.A08.getValue();
        Object A07 = catalogCategoryGroupsViewModel.A00.A07();
        if (!(A07 instanceof C133026gZ) || (r3 = (C133026gZ) A07) == null) {
            return true;
        }
        Object obj = r3.A00.get(i);
        if (!(obj instanceof AnonymousClass6gM) || (r1 = (AnonymousClass6gM) obj) == null) {
            return true;
        }
        String str = r1.A00.A01;
        C162457s7.A0C(str);
        Object A072 = C73813g7.A07(r3.A01, str);
        C162457s7.A0K(A072, "null cannot be cast to non-null type kotlin.collections.List<com.whatsapp.catalogcategory.view.adapter.CatalogCategoryListItem.ExpandableCategoryChildItem>");
        C132926gL r12 = (C132926gL) ((List) A072).get(i2);
        C43072Qq r0 = r12.A00;
        UserJid userJid = r12.A01;
        catalogCategoryGroupsViewModel.A04.A01(userJid, r0.A01, 3, 3, i2, r0.A04);
        catalogCategoryGroupsViewModel.A0D(r0, userJid, 3);
        return true;
    }

    public /* synthetic */ C167137zp(CatalogCategoryExpandableGroupsListFragment catalogCategoryExpandableGroupsListFragment) {
        this.A00 = catalogCategoryExpandableGroupsListFragment;
    }
}
