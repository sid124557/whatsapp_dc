package X;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.ListItemWithLeftIcon;
import com.whatsapp.R;
import com.whatsapp.chatinfo.ChatMediaVisibilityDialog;
import com.whatsapp.chatinfo.ChatMediaVisibilityOffDialog;

/* renamed from: X.5QY  reason: invalid class name */
public final class AnonymousClass5QY {
    public final View A00;
    public final C89644eZ A01;
    public final C106995aW A02;
    public final C64773Ex A03;
    public final C56982ss A04;
    public final C95814uZ A05;

    public final void A00() {
        DialogFragment chatMediaVisibilityDialog;
        AnonymousClass31A A0A;
        int i = 0;
        if (!this.A02.A0J || (A0A = this.A04.A0A(this.A05, false)) == null || !A0A.A0j) {
            C95814uZ r3 = this.A05;
            if (AnonymousClass352.A00(this.A03, this.A04, r3) <= 0) {
                AnonymousClass5G1 r0 = new AnonymousClass5G1(this);
                C626936e.A06(r3);
                chatMediaVisibilityDialog = new ChatMediaVisibilityDialog(r0);
                C86604Kt.A18(AnonymousClass002.A08(), chatMediaVisibilityDialog, r3, "chatJid");
                this.A01.Boo(chatMediaVisibilityDialog);
            }
        } else {
            i = 1;
        }
        chatMediaVisibilityDialog = new ChatMediaVisibilityOffDialog();
        Bundle A08 = AnonymousClass002.A08();
        A08.putInt("reason", i);
        chatMediaVisibilityDialog.A0u(A08);
        this.A01.Boo(chatMediaVisibilityDialog);
    }

    public AnonymousClass5QY(View view, C89644eZ r3, C106995aW r4, C64773Ex r5, C56982ss r6, C95814uZ r7) {
        C18260x0.A0f(r4, r6, r5, r7, view);
        C162457s7.A0J(r3, 6);
        this.A02 = r4;
        this.A04 = r6;
        this.A03 = r5;
        this.A05 = r7;
        this.A00 = view;
        this.A01 = r3;
    }

    public final void A01(int i) {
        boolean z;
        AnonymousClass31A A0A;
        int i2 = R.string.f11nameremoved;
        C95814uZ r2 = this.A05;
        C56982ss r1 = this.A04;
        if (AnonymousClass001.A1W(AnonymousClass352.A00(this.A03, r1, r2)) || (this.A02.A0J && (A0A = r1.A0A(r2, false)) != null && A0A.A0j)) {
            z = false;
        } else {
            z = true;
            if (i != 0) {
                z = false;
                if (2 == i) {
                    i2 = R.string.f11nameremoved;
                }
            }
        }
        View view = this.A00;
        if (view instanceof ListItemWithLeftIcon) {
            ListItemWithLeftIcon listItemWithLeftIcon = (ListItemWithLeftIcon) view;
            if (z) {
                listItemWithLeftIcon.setDescriptionVisibility(8);
                return;
            }
            C89364cO.A02(this.A01, listItemWithLeftIcon, i2);
            listItemWithLeftIcon.setDescriptionVisibility(0);
        }
    }
}
