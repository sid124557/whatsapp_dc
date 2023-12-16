package X;

import android.content.DialogInterface;
import android.widget.TextView;
import com.whatsapp.dialogs.PromptDialogFragment;

/* renamed from: X.37E  reason: invalid class name */
public final /* synthetic */ class AnonymousClass37E implements DialogInterface.OnShowListener {
    public final /* synthetic */ AnonymousClass043 A00;
    public final /* synthetic */ PromptDialogFragment A01;

    public final void onShow(DialogInterface dialogInterface) {
        PromptDialogFragment promptDialogFragment = this.A01;
        TextView textView = (TextView) this.A00.getWindow().findViewById(16908299);
        C18270x1.A0q(textView, promptDialogFragment.A02);
        C06560Yg.A0O(textView, new AnonymousClass4TJ(textView, promptDialogFragment.A00));
    }

    public /* synthetic */ AnonymousClass37E(AnonymousClass043 r1, PromptDialogFragment promptDialogFragment) {
        this.A01 = promptDialogFragment;
        this.A00 = r1;
    }
}
