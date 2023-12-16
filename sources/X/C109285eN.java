package X;

import android.os.Bundle;
import android.view.MenuItem;
import com.whatsapp.jid.UserJid;
import com.whatsapp.newsletter.multiadmin.RevokeNewsletterAdminInviteDialogFragment;

/* renamed from: X.5eN  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C109285eN implements MenuItem.OnMenuItemClickListener {
    public final /* synthetic */ UserJid A00;
    public final /* synthetic */ AnonymousClass5OB A01;
    public final /* synthetic */ String A02;

    public final boolean onMenuItemClick(MenuItem menuItem) {
        AnonymousClass5OB r0 = this.A01;
        UserJid userJid = this.A00;
        String str = this.A02;
        C162457s7.A0J(userJid, 1);
        C08270df supportFragmentManager = r0.A02.getSupportFragmentManager();
        RevokeNewsletterAdminInviteDialogFragment revokeNewsletterAdminInviteDialogFragment = new RevokeNewsletterAdminInviteDialogFragment();
        Bundle A08 = AnonymousClass002.A08();
        AnonymousClass0x2.A0v(A08, userJid, "arg_contact_jid");
        A08.putString("arg_contact_name", str);
        revokeNewsletterAdminInviteDialogFragment.A0u(A08);
        AnonymousClass344.A01(revokeNewsletterAdminInviteDialogFragment, supportFragmentManager);
        return true;
    }

    public /* synthetic */ C109285eN(UserJid userJid, AnonymousClass5OB r2, String str) {
        this.A01 = r2;
        this.A00 = userJid;
        this.A02 = str;
    }
}
