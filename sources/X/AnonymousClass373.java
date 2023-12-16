package X;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import com.whatsapp.conversation.conversationrow.DeviceUpdateDialogFragment;

/* renamed from: X.373  reason: invalid class name */
public final /* synthetic */ class AnonymousClass373 implements DialogInterface.OnClickListener {
    public final /* synthetic */ DeviceUpdateDialogFragment A00;
    public final /* synthetic */ C95814uZ A01;
    public final /* synthetic */ C95814uZ A02;
    public final /* synthetic */ String A03;

    public final void onClick(DialogInterface dialogInterface, int i) {
        DeviceUpdateDialogFragment deviceUpdateDialogFragment = this.A00;
        String str = this.A03;
        C95814uZ r2 = this.A01;
        C95814uZ r1 = this.A02;
        if (deviceUpdateDialogFragment.A01.A0a(r2)) {
            str = r1.getRawString();
        }
        Context A1D = deviceUpdateDialogFragment.A1D();
        Intent A07 = C18320x8.A07();
        A07.setClassName(A1D.getPackageName(), "com.whatsapp.identity.IdentityVerificationActivity");
        A07.putExtra("jid", str);
        deviceUpdateDialogFragment.A0m(A07);
    }

    public /* synthetic */ AnonymousClass373(DeviceUpdateDialogFragment deviceUpdateDialogFragment, C95814uZ r2, C95814uZ r3, String str) {
        this.A00 = deviceUpdateDialogFragment;
        this.A03 = str;
        this.A01 = r2;
        this.A02 = r3;
    }
}
