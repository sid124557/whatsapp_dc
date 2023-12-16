package X;

import com.whatsapp.mediaview.DeleteMessagesDialogFragment;
import com.whatsapp.mediaview.RevokeNuxDialogFragment;

/* renamed from: X.3CU  reason: invalid class name */
public class AnonymousClass3CU implements C1228165x {
    public final /* synthetic */ DeleteMessagesDialogFragment A00;

    public AnonymousClass3CU(DeleteMessagesDialogFragment deleteMessagesDialogFragment) {
        this.A00 = deleteMessagesDialogFragment;
    }

    public void BZn() {
        this.A00.A1K();
    }

    public void Bbc(C95814uZ r4, int i) {
        DeleteMessagesDialogFragment deleteMessagesDialogFragment = this.A00;
        if (deleteMessagesDialogFragment.A16()) {
            new RevokeNuxDialogFragment(r4, i).A1O(deleteMessagesDialogFragment.A0T(), (String) null);
        }
    }
}
