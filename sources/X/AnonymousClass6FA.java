package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.catalogcategory.view.CategoryThumbnailLoader;
import java.util.List;
import java.util.Map;

/* renamed from: X.6FA  reason: invalid class name */
public final class AnonymousClass6FA extends BaseExpandableListAdapter {
    public List A00 = C72023d3.A00;
    public Map A01 = C73813g7.A0A();
    public final CategoryThumbnailLoader A02;

    public AnonymousClass6FA(CategoryThumbnailLoader categoryThumbnailLoader) {
        C162457s7.A0J(categoryThumbnailLoader, 1);
        this.A02 = categoryThumbnailLoader;
    }

    public View getChildView(int i, int i2, boolean z, View view, ViewGroup viewGroup) {
        int i3;
        AnonymousClass4GQ r1;
        C162457s7.A0J(viewGroup, 4);
        AnonymousClass7DQ A002 = getChild(i, i2);
        if (A002 instanceof C132926gL) {
            i3 = R.layout.f8nameremoved;
            r1 = new AnonymousClass8Y2(this);
        } else if (A002 instanceof AnonymousClass6gI) {
            i3 = R.layout.f8nameremoved;
            r1 = AnonymousClass8Z8.A00;
        } else {
            throw AnonymousClass001.A0e("Unhandled group-child type in getChildView()");
        }
        if (view == null) {
            view = AnonymousClass001.A0R(C18280x3.A0D(viewGroup), viewGroup, i3);
            C162457s7.A0H(view);
            view.setTag(r1.invoke(view));
        }
        Object tag = view.getTag();
        C162457s7.A0K(tag, "null cannot be cast to non-null type com.whatsapp.catalogcategory.view.adapter.viewholder.CatalogCategoryViewHolder");
        ((C125636Iu) tag).A07(A002);
        return view;
    }

    public View getGroupView(int i, boolean z, View view, ViewGroup viewGroup) {
        int i2;
        AnonymousClass4GQ r1;
        int i3;
        C162457s7.A0J(viewGroup, 3);
        AnonymousClass7DQ r4 = (AnonymousClass7DQ) this.A00.get(i);
        if (r4 instanceof AnonymousClass6gM) {
            AnonymousClass8Y3 r2 = new AnonymousClass8Y3(this);
            if (view == null) {
                view = AnonymousClass001.A0R(C18280x3.A0D(viewGroup), viewGroup, R.layout.f8nameremoved);
                C162457s7.A0H(view);
                view.setTag(r2.invoke(view));
            }
            Object tag = view.getTag();
            C162457s7.A0K(tag, "null cannot be cast to non-null type com.whatsapp.catalogcategory.view.adapter.viewholder.CategoryGroupExpandableItemViewHolder");
            C132976gS r12 = (C132976gS) tag;
            r12.A07(r4);
            ImageView imageView = (ImageView) r12.A02.getValue();
            if (z) {
                i3 = R.drawable.vec_ic_catalog_expand_less;
            } else {
                i3 = R.drawable.vec_ic_catalog_expand_more;
            }
            imageView.setImageResource(i3);
            return view;
        }
        if (r4 instanceof C132926gL) {
            i2 = R.layout.f8nameremoved;
            r1 = new AnonymousClass8Y4(this);
        } else if (r4 instanceof AnonymousClass6gJ) {
            i2 = R.layout.f8nameremoved;
            r1 = AnonymousClass8Z9.A00;
        } else {
            throw AnonymousClass001.A0e("Unhandled group type in getGroupView()");
        }
        if (view == null) {
            view = AnonymousClass001.A0R(C18280x3.A0D(viewGroup), viewGroup, i2);
            C162457s7.A0H(view);
            view.setTag(r1.invoke(view));
        }
        Object tag2 = view.getTag();
        C162457s7.A0K(tag2, "null cannot be cast to non-null type com.whatsapp.catalogcategory.view.adapter.viewholder.CatalogCategoryViewHolder");
        ((C125636Iu) tag2).A07(r4);
        return view;
    }

    /* renamed from: A00 */
    public AnonymousClass7DQ getChild(int i, int i2) {
        AnonymousClass7DQ r2 = (AnonymousClass7DQ) this.A00.get(i);
        if (r2 instanceof AnonymousClass6gM) {
            Map map = this.A01;
            String str = ((AnonymousClass6gM) r2).A00.A01;
            C162457s7.A0C(str);
            return (AnonymousClass7DQ) ((List) C73813g7.A07(map, str)).get(i2);
        }
        throw AnonymousClass001.A0e("Unhandled category parent type in getChild()");
    }

    public long getChildId(int i, int i2) {
        return (long) ((i * 1000) + i2);
    }

    public int getChildTypeCount() {
        return 5;
    }

    public int getChildrenCount(int i) {
        AnonymousClass7DQ r2 = (AnonymousClass7DQ) this.A00.get(i);
        if (!(r2 instanceof AnonymousClass6gM)) {
            return 0;
        }
        Map map = this.A01;
        String str = ((AnonymousClass6gM) r2).A00.A01;
        C162457s7.A0C(str);
        return ((List) C73813g7.A07(map, str)).size();
    }

    public /* bridge */ /* synthetic */ Object getGroup(int i) {
        return this.A00.get(i);
    }

    public int getGroupCount() {
        return this.A00.size();
    }

    public long getGroupId(int i) {
        return (long) i;
    }

    public int getGroupType(int i) {
        return ((AnonymousClass7DQ) this.A00.get(i)).A00;
    }

    public int getGroupTypeCount() {
        return 5;
    }

    public boolean hasStableIds() {
        return true;
    }

    public int getChildType(int i, int i2) {
        return getChild(i, i2).A00;
    }

    public boolean isChildSelectable(int i, int i2) {
        return true;
    }
}
