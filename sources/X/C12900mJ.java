package X;

import android.view.MenuItem;

/* renamed from: X.0mJ  reason: invalid class name and case insensitive filesystem */
public class C12900mJ implements Runnable {
    public final /* synthetic */ MenuItem A00;
    public final /* synthetic */ C07590bH A01;
    public final /* synthetic */ C03670Lc A02;
    public final /* synthetic */ C07890cz A03;

    public C12900mJ(MenuItem menuItem, C07590bH r2, C03670Lc r3, C07890cz r4) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = menuItem;
        this.A03 = r4;
    }

    public void run() {
        C03670Lc r1 = this.A02;
        if (r1 != null) {
            AnonymousClass04L r2 = this.A01.A00;
            r2.A0D = true;
            r1.A01.A0G(false);
            r2.A0D = false;
        }
        MenuItem menuItem = this.A00;
        if (menuItem.isEnabled() && menuItem.hasSubMenu()) {
            this.A03.A0L(menuItem, (C17050uU) null, 4);
        }
    }
}
