package X;

import com.whatsapp.community.CommunityAdminDialogFragment;
import com.whatsapp.jid.UserJid;

/* renamed from: X.2FG  reason: invalid class name */
public class AnonymousClass2FG {
    public final /* synthetic */ C46632bx A00;

    public AnonymousClass2FG(C46632bx r1) {
        this.A00 = r1;
    }

    public static void A00(CommunityAdminDialogFragment communityAdminDialogFragment) {
        AnonymousClass2FG r0 = communityAdminDialogFragment.A01;
        int i = communityAdminDialogFragment.A00;
        UserJid userJid = communityAdminDialogFragment.A02;
        C46632bx r1 = r0.A00;
        if (!r1.A02.A0a(userJid)) {
            return;
        }
        if (i == 3) {
            r1.A04.A00();
        } else if (i == 4) {
            r1.A04.A01();
        }
    }
}
