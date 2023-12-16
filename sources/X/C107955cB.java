package X;

import android.content.DialogInterface;
import com.whatsapp.textstatuscomposer.DiscardWarningDialogFragment;
import com.whatsapp.textstatuscomposer.TextStatusComposerActivity;

/* renamed from: X.5cB  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C107955cB implements DialogInterface.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ DiscardWarningDialogFragment A01;
    public final /* synthetic */ boolean A02;

    public final void onClick(DialogInterface dialogInterface, int i) {
        C116155pp r0;
        DiscardWarningDialogFragment discardWarningDialogFragment = this.A01;
        int i2 = this.A00;
        boolean z = this.A02;
        TextStatusComposerActivity textStatusComposerActivity = (TextStatusComposerActivity) discardWarningDialogFragment.A0R();
        discardWarningDialogFragment.A1L();
        if (i2 != 2 || !z) {
            C116155pp r2 = textStatusComposerActivity.A0n;
            if (r2 != null) {
                r2.A05(true);
                r2.A04(r2.A09);
                r2.A09 = null;
                r2.A04(r2.A0A);
                r2.A0A = null;
            }
            textStatusComposerActivity.finish();
        } else if (textStatusComposerActivity.A0m != null && (r0 = textStatusComposerActivity.A0n) != null) {
            r0.A01();
        }
    }

    public /* synthetic */ C107955cB(DiscardWarningDialogFragment discardWarningDialogFragment, int i, boolean z) {
        this.A01 = discardWarningDialogFragment;
        this.A00 = i;
        this.A02 = z;
    }
}
