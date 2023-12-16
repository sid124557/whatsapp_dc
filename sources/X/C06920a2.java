package X;

import android.view.MenuItem;

/* renamed from: X.0a2  reason: invalid class name and case insensitive filesystem */
public class C06920a2 implements MenuItem.OnActionExpandListener {
    public final MenuItem.OnActionExpandListener A00;
    public final /* synthetic */ AnonymousClass04I A01;

    public C06920a2(MenuItem.OnActionExpandListener onActionExpandListener, AnonymousClass04I r2) {
        this.A01 = r2;
        this.A00 = onActionExpandListener;
    }

    public boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.A00.onMenuItemActionCollapse(this.A01.A00(menuItem));
    }

    public boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.A00.onMenuItemActionExpand(this.A01.A00(menuItem));
    }
}
