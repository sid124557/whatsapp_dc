package X;

import android.content.DialogInterface;
import com.whatsapp.conversation.ChangeNumberNotificationDialogFragment;
import com.whatsapp.jid.UserJid;

/* renamed from: X.370  reason: invalid class name */
public final /* synthetic */ class AnonymousClass370 implements DialogInterface.OnClickListener {
    public final /* synthetic */ ChangeNumberNotificationDialogFragment A00;
    public final /* synthetic */ AnonymousClass3ZH A01;
    public final /* synthetic */ boolean A02;

    public final void onClick(DialogInterface dialogInterface, int i) {
        ChangeNumberNotificationDialogFragment changeNumberNotificationDialogFragment = this.A00;
        boolean z = this.A02;
        AnonymousClass3ZH r2 = this.A01;
        if (z) {
            dialogInterface.dismiss();
            return;
        }
        C835949a r1 = changeNumberNotificationDialogFragment.A01;
        if (r1 != null) {
            r1.Awp(r2, AnonymousClass3ZH.A02(r2, UserJid.class));
        }
    }

    public /* synthetic */ AnonymousClass370(ChangeNumberNotificationDialogFragment changeNumberNotificationDialogFragment, AnonymousClass3ZH r2, boolean z) {
        this.A00 = changeNumberNotificationDialogFragment;
        this.A02 = z;
        this.A01 = r2;
    }
}
