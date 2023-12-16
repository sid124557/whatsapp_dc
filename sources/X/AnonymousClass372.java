package X;

import android.app.Activity;
import android.content.DialogInterface;
import com.whatsapp.calling.fragment.CallConfirmationFragment;

/* renamed from: X.372  reason: invalid class name */
public final /* synthetic */ class AnonymousClass372 implements DialogInterface.OnClickListener {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ CallConfirmationFragment A01;
    public final /* synthetic */ AnonymousClass3ZH A02;
    public final /* synthetic */ boolean A03;

    public final void onClick(DialogInterface dialogInterface, int i) {
        CallConfirmationFragment callConfirmationFragment = this.A01;
        Activity activity = this.A00;
        AnonymousClass3ZH r4 = this.A02;
        boolean z = this.A03;
        C18260x0.A0L(callConfirmationFragment.A03, "call_confirmation_dialog_count", C18280x3.A02(AnonymousClass0x2.A0F(callConfirmationFragment.A03), "call_confirmation_dialog_count") + 1);
        callConfirmationFragment.A1V(activity, r4, z);
    }

    public /* synthetic */ AnonymousClass372(Activity activity, CallConfirmationFragment callConfirmationFragment, AnonymousClass3ZH r3, boolean z) {
        this.A01 = callConfirmationFragment;
        this.A00 = activity;
        this.A02 = r3;
        this.A03 = z;
    }
}
