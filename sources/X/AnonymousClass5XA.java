package X;

import android.view.ContextMenu;
import android.view.MenuItem;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;

/* renamed from: X.5XA  reason: invalid class name */
public final class AnonymousClass5XA {
    public final C69263Wi A00;
    public final C56972sr A01;
    public final C64773Ex A02;
    public final AnonymousClass5ZU A03;
    public final AnonymousClass5Y0 A04;
    public final C105055Tk A05;
    public final C106165Xw A06;

    public final void A01(ContextMenu contextMenu, C89644eZ r8, AnonymousClass3ZH r9) {
        MenuItem add;
        MenuItem.OnMenuItemClickListener r0;
        C86614Ku.A1S(r8, 0, contextMenu);
        if (!(r9.A0H instanceof C27981fH)) {
            String A0h = C18300x5.A0h(this.A03, r9);
            contextMenu.add(r8.getResources().getString(R.string.f11nameremoved, AnonymousClass000.A1b(A0h))).setOnMenuItemClickListener(new C1237369o(r8, r9, 1));
            if (r9.A0F != null) {
                add = contextMenu.add(C107345b9.A05(r8, this.A04, C18320x8.A0b(r8.getResources(), A0h, new Object[1], 0, R.string.f11nameremoved)));
                r0 = new C1237369o(r8, r9, 0);
            } else if (!this.A01.A0Y()) {
                C95814uZ r3 = r9.A0H;
                C162457s7.A0K(r3, "null cannot be cast to non-null type com.whatsapp.jid.UserJid");
                contextMenu.add(R.string.f11nameremoved).setOnMenuItemClickListener(new AnonymousClass69G(this, r8, r3, 0));
                add = contextMenu.add(R.string.f11nameremoved);
                r0 = new AnonymousClass69G(this, r8, r3, 1);
            } else {
                return;
            }
            add.setOnMenuItemClickListener(r0);
        }
    }

    public AnonymousClass5XA(C69263Wi r1, C56972sr r2, C64773Ex r3, AnonymousClass5ZU r4, AnonymousClass5Y0 r5, C105055Tk r6, C106165Xw r7) {
        C18260x0.A0f(r1, r2, r5, r3, r4);
        C18260x0.A0U(r6, r7);
        this.A00 = r1;
        this.A01 = r2;
        this.A04 = r5;
        this.A02 = r3;
        this.A03 = r4;
        this.A05 = r6;
        this.A06 = r7;
    }

    public static final void A00(ContextMenu contextMenu, C89644eZ r4, UserJid userJid) {
        C18260x0.A0O(r4, userJid);
        C162457s7.A0J(contextMenu, 2);
        contextMenu.add(R.string.f11nameremoved).setOnMenuItemClickListener(new C1237369o((Object) r4, 2, (Object) userJid));
    }
}
