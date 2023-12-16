package X;

import android.view.View;
import android.widget.ExpandableListView;
import com.whatsapp.R;
import com.whatsapp.catalogcategory.view.fragment.CatalogCategoryExpandableGroupsListFragment;
import com.whatsapp.catalogcategory.view.viewmodel.CatalogCategoryGroupsViewModel;
import com.whatsapp.jid.UserJid;

/* renamed from: X.7zq  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C167147zq implements ExpandableListView.OnGroupClickListener {
    public final /* synthetic */ CatalogCategoryExpandableGroupsListFragment A00;

    public final boolean onGroupClick(ExpandableListView expandableListView, View view, int i, long j) {
        C132926gL r1;
        CatalogCategoryExpandableGroupsListFragment catalogCategoryExpandableGroupsListFragment = this.A00;
        AnonymousClass6FA r0 = catalogCategoryExpandableGroupsListFragment.A04;
        if (r0 == null) {
            throw C18270x1.A0S("expandableListAdapter");
        }
        int i2 = i;
        if (r0.getGroupType(i2) == 3) {
            CatalogCategoryGroupsViewModel catalogCategoryGroupsViewModel = (CatalogCategoryGroupsViewModel) catalogCategoryExpandableGroupsListFragment.A08.getValue();
            AnonymousClass7DR r02 = (AnonymousClass7DR) catalogCategoryGroupsViewModel.A00.A07();
            if (r02 == null) {
                return true;
            }
            Object obj = r02.A00.get(i2);
            if (!(obj instanceof C132926gL) || (r1 = (C132926gL) obj) == null) {
                return true;
            }
            C43072Qq r03 = r1.A00;
            UserJid userJid = r1.A01;
            catalogCategoryGroupsViewModel.A04.A01(userJid, r03.A01, 2, 3, i2, r03.A04);
            catalogCategoryGroupsViewModel.A0D(r03, userJid, 2);
            return true;
        }
        int i3 = catalogCategoryExpandableGroupsListFragment.A00;
        if (i3 != i2) {
            if (i3 != -1) {
                ExpandableListView expandableListView2 = catalogCategoryExpandableGroupsListFragment.A01;
                if (expandableListView2 == null) {
                    throw C18270x1.A0S("expandableListView");
                }
                expandableListView2.collapseGroup(i3);
            }
            AnonymousClass66R r12 = catalogCategoryExpandableGroupsListFragment.A08;
            if (AnonymousClass0x9.A1Q(((CatalogCategoryGroupsViewModel) r12.getValue()).A02.A07())) {
                C19340zH A002 = AnonymousClass5V0.A00(catalogCategoryExpandableGroupsListFragment.A0G());
                A002.A0T(R.string.f11nameremoved);
                A002.A0d(catalogCategoryExpandableGroupsListFragment.A0V(), new C1897492m(catalogCategoryExpandableGroupsListFragment, 166), R.string.f11nameremoved);
                A002.A0S();
                return true;
            }
            CatalogCategoryGroupsViewModel catalogCategoryGroupsViewModel2 = (CatalogCategoryGroupsViewModel) r12.getValue();
            C06270Wx r13 = catalogCategoryGroupsViewModel2.A00;
            if (r13.A07() instanceof C133026gZ) {
                Object A07 = r13.A07();
                C162457s7.A0K(A07, "null cannot be cast to non-null type com.whatsapp.catalogcategory.view.viewmodel.CatalogCategoryGroupListState.CategoryGroupsWithChildItems");
                Object obj2 = ((C133026gZ) A07).A00.get(i2);
                C162457s7.A0K(obj2, "null cannot be cast to non-null type com.whatsapp.catalogcategory.view.adapter.CatalogCategoryListItem.ExpandableCategoryParentItem");
                AnonymousClass6gM r14 = (AnonymousClass6gM) obj2;
                C43072Qq r04 = r14.A00;
                catalogCategoryGroupsViewModel2.A04.A01(r14.A01, r04.A01, 2, 3, i2, r04.A04);
            }
            ExpandableListView expandableListView3 = catalogCategoryExpandableGroupsListFragment.A01;
            if (expandableListView3 == null) {
                throw C18270x1.A0S("expandableListView");
            }
            expandableListView3.smoothScrollToPosition(i2);
            ExpandableListView expandableListView4 = catalogCategoryExpandableGroupsListFragment.A01;
            if (expandableListView4 == null) {
                throw C18270x1.A0S("expandableListView");
            }
            expandableListView4.expandGroup(i2);
            return true;
        }
        ExpandableListView expandableListView5 = catalogCategoryExpandableGroupsListFragment.A01;
        if (expandableListView5 == null) {
            throw C18270x1.A0S("expandableListView");
        }
        expandableListView5.collapseGroup(i2);
        return true;
    }

    public /* synthetic */ C167147zq(CatalogCategoryExpandableGroupsListFragment catalogCategoryExpandableGroupsListFragment) {
        this.A00 = catalogCategoryExpandableGroupsListFragment;
    }
}
