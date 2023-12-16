package X;

import android.content.Context;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;

/* renamed from: X.5T7  reason: invalid class name */
public class AnonymousClass5T7 {
    public final C111095hX A00;
    public final C69263Wi A01;
    public final C56972sr A02;
    public final C105035Th A03;
    public final C620433g A04;
    public final C29211iS A05;
    public final AnonymousClass5Y9 A06;
    public final C105255Ue A07;

    public AnonymousClass3XA A00(Context context, UserJid userJid, int i, int i2) {
        this.A07.A02(774781666, "catalog_collections_view_tag", "CatalogModuleHelper");
        AnonymousClass3XA r3 = new AnonymousClass3XA();
        this.A05.A06(new C111775if(context, r3, this, userJid, i, i2));
        this.A06.A05(userJid, context.getResources().getDimensionPixelSize(R.dimen.f6nameremoved));
        return r3;
    }

    public AnonymousClass3XA A01(UserJid userJid) {
        AnonymousClass3XA r3 = new AnonymousClass3XA();
        this.A04.A06(new C1898192t(r3, this, userJid, 1), userJid);
        return r3;
    }

    public AnonymousClass3XA A02(UserJid userJid) {
        AnonymousClass3XA r3 = new AnonymousClass3XA();
        this.A04.A06(new C1898192t(r3, this, userJid, 0), userJid);
        return r3;
    }

    public AnonymousClass5T7(C111095hX r1, C69263Wi r2, C56972sr r3, C105035Th r4, C620433g r5, C29211iS r6, AnonymousClass5Y9 r7, C105255Ue r8) {
        this.A01 = r2;
        this.A00 = r1;
        this.A07 = r8;
        this.A06 = r7;
        this.A05 = r6;
        this.A02 = r3;
        this.A04 = r5;
        this.A03 = r4;
    }
}
