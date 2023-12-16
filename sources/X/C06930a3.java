package X;

import android.view.MenuItem;

/* renamed from: X.0a3  reason: invalid class name and case insensitive filesystem */
public class C06930a3 implements MenuItem.OnMenuItemClickListener {
    public final MenuItem.OnMenuItemClickListener A00;
    public final /* synthetic */ AnonymousClass04I A01;

    public C06930a3(MenuItem.OnMenuItemClickListener onMenuItemClickListener, AnonymousClass04I r2) {
        this.A01 = r2;
        this.A00 = onMenuItemClickListener;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        return this.A00.onMenuItemClick(this.A01.A00(menuItem));
    }
}
