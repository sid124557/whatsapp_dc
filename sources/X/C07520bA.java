package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* renamed from: X.0bA  reason: invalid class name and case insensitive filesystem */
public abstract class C07520bA implements C17050uU, C16920uF, AdapterView.OnItemClickListener {
    public Rect A00;

    public static int A00(Context context, ListAdapter listAdapter, int i) {
        FrameLayout frameLayout = null;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        View view = null;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = listAdapter.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = listAdapter.getView(i4, view, frameLayout);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i2) {
                i2 = measuredWidth;
            }
        }
        return i2;
    }

    public abstract void A01(int i);

    public abstract void A02(int i);

    public abstract void A03(int i);

    public abstract void A04(View view);

    public abstract void A05(PopupWindow.OnDismissListener onDismissListener);

    public abstract void A06(C07890cz r1);

    public abstract void A07(boolean z);

    public abstract void A08(boolean z);

    public boolean A09() {
        return true;
    }

    public int getId() {
        return 0;
    }

    public boolean Az7(C07890cz r2, C07910d1 r3) {
        return false;
    }

    public boolean B2v(C07890cz r2, C07910d1 r3) {
        return false;
    }

    public void BG6(Context context, C07890cz r2) {
    }

    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        ListAdapter listAdapter2 = listAdapter;
        if (listAdapter instanceof HeaderViewListAdapter) {
            listAdapter2 = ((HeaderViewListAdapter) listAdapter2).getWrappedAdapter();
        }
        C07890cz r3 = ((AnonymousClass033) listAdapter2).A01;
        MenuItem menuItem = (MenuItem) listAdapter.getItem(i);
        int i2 = 4;
        if (A09()) {
            i2 = 0;
        }
        r3.A0L(menuItem, this, i2);
    }
}
