package X;

import android.content.DialogInterface;
import android.content.Intent;
import com.whatsapp.invites.PromptSendGroupInviteDialogFragment;
import java.util.ArrayList;

/* renamed from: X.377  reason: invalid class name */
public final /* synthetic */ class AnonymousClass377 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ Intent A02;
    public final /* synthetic */ PromptSendGroupInviteDialogFragment A03;
    public final /* synthetic */ C27991fJ A04;
    public final /* synthetic */ ArrayList A05;

    public final void onClick(DialogInterface dialogInterface, int i) {
        C003203q A0Q;
        C003203q A0Q2;
        PromptSendGroupInviteDialogFragment promptSendGroupInviteDialogFragment = this.A03;
        Intent intent = this.A02;
        int i2 = this.A00;
        C27991fJ r6 = this.A04;
        ArrayList arrayList = this.A05;
        int i3 = this.A01;
        if (i != -2) {
            if (i == -1 && (A0Q2 = promptSendGroupInviteDialogFragment.A0Q()) != null && !A0Q2.isFinishing()) {
                promptSendGroupInviteDialogFragment.A0Q().startActivityForResult(intent, i2);
            }
        } else if (r6 != null && arrayList != null && !arrayList.isEmpty() && (A0Q = promptSendGroupInviteDialogFragment.A0Q()) != null && !A0Q.isFinishing() && promptSendGroupInviteDialogFragment.A02.A0Y(C58422vE.A02, 4136)) {
            C003203q A0Q3 = promptSendGroupInviteDialogFragment.A0Q();
            A0Q3.startActivity(C627736r.A0X(A0Q3, r6, arrayList, i3, false));
        }
    }

    public /* synthetic */ AnonymousClass377(Intent intent, PromptSendGroupInviteDialogFragment promptSendGroupInviteDialogFragment, C27991fJ r3, ArrayList arrayList, int i, int i2) {
        this.A03 = promptSendGroupInviteDialogFragment;
        this.A02 = intent;
        this.A00 = i;
        this.A04 = r3;
        this.A05 = arrayList;
        this.A01 = i2;
    }
}
