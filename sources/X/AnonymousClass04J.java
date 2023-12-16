package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: X.04J  reason: invalid class name */
public class AnonymousClass04J extends C07890cz implements SubMenu {
    public C07890cz A00;
    public C07910d1 A01;

    public SubMenu setHeaderIcon(int i) {
        if (i > 0) {
            this.A01 = AnonymousClass0RP.A00(this.A0N, i);
        }
        this.A02 = null;
        A0F(false);
        return this;
    }

    public SubMenu setHeaderTitle(int i) {
        Resources resources = this.A0O;
        if (i > 0) {
            this.A05 = resources.getText(i);
        }
        this.A02 = null;
        A0F(false);
        return this;
    }

    public SubMenu setHeaderView(View view) {
        if (view != null) {
            this.A02 = view;
            this.A05 = null;
            this.A01 = null;
        } else {
            this.A02 = null;
        }
        A0F(false);
        return this;
    }

    public C07890cz A02() {
        return this.A00.A02();
    }

    public String A04() {
        int itemId;
        C07910d1 r0 = this.A01;
        if (r0 == null || (itemId = r0.getItemId()) == 0) {
            return null;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("android:menu:actionviewstates");
        return AnonymousClass000.A0Y(":", A0o, itemId);
    }

    public void A0D(C16460tR r2) {
        this.A00.A0D(r2);
    }

    public boolean A0H() {
        return this.A00.A0H();
    }

    public boolean A0I() {
        return this.A00.A0I();
    }

    public boolean A0J() {
        return this.A00.A0J();
    }

    public boolean A0M(C07910d1 r2) {
        return this.A00.A0M(r2);
    }

    public boolean A0N(C07910d1 r2) {
        return this.A00.A0N(r2);
    }

    public MenuItem getItem() {
        return this.A01;
    }

    public void setGroupDividerEnabled(boolean z) {
        this.A00.setGroupDividerEnabled(z);
    }

    public SubMenu setIcon(int i) {
        this.A01.setIcon(i);
        return this;
    }

    public void setQwertyMode(boolean z) {
        this.A00.setQwertyMode(z);
    }

    public AnonymousClass04J(Context context, C07890cz r2, C07910d1 r3) {
        super(context);
        this.A00 = r2;
        this.A01 = r3;
    }

    public boolean A0K(MenuItem menuItem, C07890cz r4) {
        if (super.A0K(menuItem, r4) || this.A00.A0K(menuItem, r4)) {
            return true;
        }
        return false;
    }

    public SubMenu setHeaderIcon(Drawable drawable) {
        if (drawable != null) {
            this.A01 = drawable;
        }
        this.A02 = null;
        A0F(false);
        return this;
    }

    public SubMenu setHeaderTitle(CharSequence charSequence) {
        if (charSequence != null) {
            this.A05 = charSequence;
        }
        this.A02 = null;
        A0F(false);
        return this;
    }

    public SubMenu setIcon(Drawable drawable) {
        this.A01.setIcon(drawable);
        return this;
    }
}
