package X;

import android.content.DialogInterface;
import android.content.Intent;
import com.whatsapp.account.delete.DeleteAccountFeedback;

/* renamed from: X.36y  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C628436y implements DialogInterface.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ DeleteAccountFeedback.ChangeNumberMessageDialogFragment A01;
    public final /* synthetic */ String A02;

    public final void onClick(DialogInterface dialogInterface, int i) {
        DeleteAccountFeedback.ChangeNumberMessageDialogFragment changeNumberMessageDialogFragment = this.A01;
        int i2 = this.A00;
        String str = this.A02;
        C003203q A0Q = changeNumberMessageDialogFragment.A0Q();
        Intent A07 = C18320x8.A07();
        A07.setClassName(A0Q.getPackageName(), "com.whatsapp.account.delete.DeleteAccountConfirmation");
        A07.putExtra("deleteReason", i2);
        A07.putExtra("additionalComments", str);
        changeNumberMessageDialogFragment.A0m(A07);
    }

    public /* synthetic */ C628436y(DeleteAccountFeedback.ChangeNumberMessageDialogFragment changeNumberMessageDialogFragment, String str, int i) {
        this.A01 = changeNumberMessageDialogFragment;
        this.A00 = i;
        this.A02 = str;
    }
}
