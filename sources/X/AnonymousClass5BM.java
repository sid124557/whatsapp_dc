package X;

import android.os.Bundle;
import com.whatsapp.newsletter.multiadmin.InviteNewsletterAdminMessageFragment;
import java.util.List;

/* renamed from: X.5BM  reason: invalid class name */
public final class AnonymousClass5BM {
    public static final InviteNewsletterAdminMessageFragment A00(C95804uY r3, List list, boolean z) {
        InviteNewsletterAdminMessageFragment inviteNewsletterAdminMessageFragment = new InviteNewsletterAdminMessageFragment();
        Bundle A08 = AnonymousClass002.A08();
        AnonymousClass0x2.A0v(A08, r3, "newsletter_jid");
        C86644Kx.A0r(A08, "invitee_jids", list);
        A08.putBoolean("arg_from_contacts_picker", z);
        inviteNewsletterAdminMessageFragment.A0u(A08);
        return inviteNewsletterAdminMessageFragment;
    }
}
