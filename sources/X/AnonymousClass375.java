package X;

import android.app.Activity;
import android.content.DialogInterface;
import com.whatsapp.calling.fragment.CallConfirmationFragment;

/* renamed from: X.375  reason: invalid class name */
public final /* synthetic */ class AnonymousClass375 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Activity A01;
    public final /* synthetic */ CallConfirmationFragment A02;
    public final /* synthetic */ AnonymousClass3ZH A03;
    public final /* synthetic */ boolean A04;

    public final void onClick(DialogInterface dialogInterface, int i) {
        CallConfirmationFragment callConfirmationFragment = this.A02;
        int i2 = this.A00;
        Activity activity = this.A01;
        AnonymousClass3ZH r5 = this.A03;
        boolean z = this.A04;
        if (i2 > 0) {
            AnonymousClass33p r0 = callConfirmationFragment.A03;
            C18270x1.A0h(C18270x1.A03(r0), "call_log_education_dialog_shown_count", AnonymousClass0x2.A0F(r0).getInt("call_log_education_dialog_shown_count", 0) + 1);
        }
        callConfirmationFragment.A1V(activity, r5, z);
    }

    public /* synthetic */ AnonymousClass375(Activity activity, CallConfirmationFragment callConfirmationFragment, AnonymousClass3ZH r3, int i, boolean z) {
        this.A02 = callConfirmationFragment;
        this.A00 = i;
        this.A01 = activity;
        this.A03 = r3;
        this.A04 = z;
    }
}
