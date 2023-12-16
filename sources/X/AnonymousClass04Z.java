package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;

/* renamed from: X.04Z  reason: invalid class name */
public class AnonymousClass04Z extends C002803e {
    public MenuItem A00;
    public C16500tV A01;
    public final int A02;
    public final int A03;

    public boolean onHoverEvent(MotionEvent motionEvent) {
        AnonymousClass033 r4;
        int i;
        C07910d1 r3;
        int pointToPosition;
        int i2;
        if (this.A01 != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                i = headerViewListAdapter.getHeadersCount();
                r4 = (AnonymousClass033) headerViewListAdapter.getWrappedAdapter();
            } else {
                r4 = (AnonymousClass033) adapter;
                i = 0;
            }
            if (motionEvent.getAction() == 10 || (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i2 = pointToPosition - i) < 0 || i2 >= r4.getCount()) {
                r3 = null;
            } else {
                r3 = r4.getItem(i2);
            }
            MenuItem menuItem = this.A00;
            if (menuItem != r3) {
                C07890cz r1 = r4.A01;
                if (menuItem != null) {
                    this.A01.BUs(menuItem, r1);
                }
                this.A00 = r3;
                if (r3 != null) {
                    this.A01.BUr(r3, r1);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    public AnonymousClass04Z(Context context, boolean z) {
        super(context, z);
        if (1 == AnonymousClass001.A0M(context).getLayoutDirection()) {
            this.A02 = 21;
            this.A03 = 22;
            return;
        }
        this.A02 = 22;
        this.A03 = 21;
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null) {
            if (i == this.A02) {
                if (listMenuItemView.isEnabled() && listMenuItemView.A0D.hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            } else if (i == this.A03) {
                setSelection(-1);
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
                }
                ((AnonymousClass033) adapter).A01.A0G(false);
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    public void setHoverListener(C16500tV r1) {
        this.A01 = r1;
    }

    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
