package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.5ie  reason: invalid class name and case insensitive filesystem */
public class C111765ie implements AnonymousClass4CO {
    public final /* synthetic */ C90504hW A00;

    public C111765ie(C90504hW r1) {
        this.A00 = r1;
    }

    public void BT5(UserJid userJid, int i) {
        C90504hW r2 = this.A00;
        if (AnonymousClass75J.A00(userJid, r2.A0M)) {
            C87614Tz r1 = r2.A0I;
            r1.A02 = true;
            r1.A01 = Integer.valueOf(i);
            if (!r2.A0D.A01) {
                r2.A0H.A0S(i);
                r2.A0N.A06("catalog_collections_view_tag", false);
            }
        }
    }

    public void BT6(UserJid userJid, boolean z, boolean z2) {
        C90504hW r2 = this.A00;
        if (AnonymousClass75J.A00(userJid, r2.A0M)) {
            if (!z && z2) {
                r2.A0I.A02 = true;
            }
            r2.A0I.A01 = null;
            if (!r2.A0D.A01) {
                r2.A02.A06(new C116935r6(userJid, 1, this), userJid);
            }
        }
    }
}
