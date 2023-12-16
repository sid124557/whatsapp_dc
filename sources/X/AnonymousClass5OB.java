package X;

import android.view.ContextMenu;
import android.view.MenuItem;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;

/* renamed from: X.5OB  reason: invalid class name */
public final class AnonymousClass5OB {
    public final AnonymousClass5XA A00;
    public final C56972sr A01;
    public final C89644eZ A02;
    public final AnonymousClass5ZU A03;
    public final C53232ml A04;

    public AnonymousClass5OB(AnonymousClass5XA r1, C56972sr r2, C89644eZ r3, AnonymousClass5ZU r4, C53232ml r5) {
        C18260x0.A0f(r4, r2, r5, r1, r3);
        this.A03 = r4;
        this.A01 = r2;
        this.A04 = r5;
        this.A00 = r1;
        this.A02 = r3;
    }

    public final void A00(ContextMenu contextMenu, C372821q r9, C102295Ih r10) {
        MenuItem add;
        int i;
        MenuItem.OnMenuItemClickListener r1;
        C18260x0.A0P(r9, contextMenu);
        C95814uZ r5 = r10.A00.A0H;
        C162457s7.A0K(r5, "null cannot be cast to non-null type com.whatsapp.jid.UserJid");
        UserJid userJid = (UserJid) r5;
        C56972sr r12 = this.A01;
        if (!r12.A0a(userJid)) {
            AnonymousClass3ZH r13 = r10.A00;
            AnonymousClass5XA r0 = this.A00;
            C89644eZ r4 = this.A02;
            r0.A01(contextMenu, r4, r13);
            if (r9 == C372821q.OWNER) {
                C372821q r6 = r10.A02;
                boolean z = r10.A01;
                String A0h = C18300x5.A0h(this.A03, r10.A00);
                if (z) {
                    add = contextMenu.add(R.string.f11nameremoved);
                    r1 = new C109285eN(userJid, this, A0h);
                } else {
                    if (r6 == C372821q.ADMIN) {
                        add = contextMenu.add(R.string.f11nameremoved);
                        i = 6;
                    } else if (r6 == C372821q.SUBSCRIBED) {
                        add = contextMenu.add(R.string.f11nameremoved);
                        i = 7;
                    }
                    r1 = new C1237369o((Object) this, i, (Object) userJid);
                }
                add.setOnMenuItemClickListener(r1);
            }
            AnonymousClass5XA.A00(contextMenu, r4, userJid);
        } else if (r9 == C372821q.ADMIN) {
            C27981fH A0H = r12.A0H();
            if (A0H != null) {
                userJid = A0H;
            }
            contextMenu.add(R.string.f11nameremoved).setOnMenuItemClickListener(new C1237369o((Object) this, 8, (Object) userJid));
        }
    }
}
