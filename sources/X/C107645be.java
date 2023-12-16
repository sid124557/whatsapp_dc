package X;

import com.whatsapp.chatinfo.ContactInfoActivity;
import com.whatsapp.conversationslist.ConversationsFragment;
import com.whatsapp.jid.UserJid;

/* renamed from: X.5be  reason: invalid class name and case insensitive filesystem */
public class C107645be implements AnonymousClass4CK {
    public Object A00;
    public final int A01;

    public C107645be(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void BNs(UserJid userJid) {
        switch (this.A01) {
            case 0:
                ContactInfoActivity contactInfoActivity = (ContactInfoActivity) this.A00;
                if (userJid.equals(AnonymousClass32Y.A08(AnonymousClass0x7.A0l(contactInfoActivity))) && contactInfoActivity.A0v.A0B != null) {
                    contactInfoActivity.A7X(false, false);
                    return;
                }
                return;
            case 1:
                C89884fR r1 = (C89884fR) this.A00;
                if (userJid != null && userJid.equals(r1.A0r)) {
                    r1.A09();
                    return;
                }
                return;
            case 2:
                C113245l7 r12 = (C113245l7) this.A00;
                if (userJid != null && userJid.equals(r12.A4J)) {
                    r12.A37.A0D();
                    r12.A2z.invalidateOptionsMenu();
                    C87604Ty r0 = r12.A1w;
                    if (r0 != null) {
                        r0.A0E();
                        return;
                    }
                    return;
                }
                return;
            default:
                ConversationsFragment conversationsFragment = (ConversationsFragment) this.A00;
                conversationsFragment.A0s.A00 = null;
                conversationsFragment.A1f(userJid);
                return;
        }
    }

    public /* synthetic */ void BNp(UserJid userJid) {
    }
}
