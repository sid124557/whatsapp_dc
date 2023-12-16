package X;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;

/* renamed from: X.4SJ  reason: invalid class name */
public final class AnonymousClass4SJ extends C07890cz {
    public final int A00;
    public final Class A01;

    public AnonymousClass4SJ(Context context, Class cls, int i) {
        super(context);
        this.A01 = cls;
        this.A00 = i;
    }

    public MenuItem A01(int i, int i2, int i3, CharSequence charSequence) {
        int size = size() + 1;
        int i4 = this.A00;
        if (size <= i4) {
            A08();
            MenuItem A012 = super.A01(i, i2, i3, charSequence);
            if (A012 instanceof C07910d1) {
                C07910d1 r2 = (C07910d1) A012;
                r2.A02 = 4 | (r2.A02 & -5);
            }
            A07();
            return A012;
        }
        String simpleName = this.A01.getSimpleName();
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Maximum number of items supported by ");
        A0o.append(simpleName);
        A0o.append(" is ");
        A0o.append(i4);
        A0o.append(". Limit can be checked with ");
        A0o.append(simpleName);
        throw AnonymousClass000.A0F("#getMaxItemCount()", A0o);
    }

    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(this.A01.getSimpleName());
        throw AnonymousClass002.A0G(AnonymousClass000.A0X(" does not support submenus", A0o));
    }
}
