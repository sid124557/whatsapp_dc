package X;

import android.content.res.ColorStateList;
import android.view.Menu;
import android.view.MenuItem;

/* renamed from: X.5g5  reason: invalid class name and case insensitive filesystem */
public final class C110345g5 implements C16910uE {
    public final int A00;
    public final ColorStateList A01;
    public final C16910uE A02;

    public C110345g5(C16910uE r2, int i) {
        C162457s7.A0J(r2, 1);
        this.A02 = r2;
        this.A00 = i;
        ColorStateList valueOf = ColorStateList.valueOf(i);
        C162457s7.A0D(valueOf);
        this.A01 = valueOf;
    }

    public void BQw(AnonymousClass0R2 r2) {
        C162457s7.A0J(r2, 0);
        this.A02.BQw(r2);
    }

    public boolean BLz(MenuItem menuItem, AnonymousClass0R2 r3) {
        C18260x0.A0O(r3, menuItem);
        return this.A02.BLz(menuItem, r3);
    }

    public boolean BQL(Menu menu, AnonymousClass0R2 r6) {
        C18260x0.A0O(r6, menu);
        boolean BQL = this.A02.BQL(menu, r6);
        AnonymousClass5VV.A00(this.A01, menu, (C142006wU) null, this.A00);
        return BQL;
    }

    public boolean BYg(Menu menu, AnonymousClass0R2 r6) {
        C18260x0.A0O(r6, menu);
        boolean BYg = this.A02.BYg(menu, r6);
        AnonymousClass5VV.A00(this.A01, menu, (C142006wU) null, this.A00);
        return BYg;
    }
}
