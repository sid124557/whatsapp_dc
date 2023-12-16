package X;

import android.content.DialogInterface;
import com.whatsapp.pininchat.expirationDialog.PinInChatExpirationDialogFragment;

/* renamed from: X.3AX  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3AX implements C15930sC {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C89654ea A01;
    public final /* synthetic */ C22741Px A02;
    public final /* synthetic */ C624134x A03;

    public final void BOf(Object obj) {
        C22741Px r5 = this.A02;
        C624134x r4 = this.A03;
        C89654ea r3 = this.A01;
        int i = this.A00;
        ((DialogInterface) obj).dismiss();
        PinInChatExpirationDialogFragment pinInChatExpirationDialogFragment = new PinInChatExpirationDialogFragment();
        pinInChatExpirationDialogFragment.A00 = new AnonymousClass2NV(r5, r4, i);
        pinInChatExpirationDialogFragment.A1S(r3.getSupportFragmentManager(), "PinInChatExpirationDialogFragment");
    }

    public /* synthetic */ AnonymousClass3AX(C89654ea r1, C22741Px r2, C624134x r3, int i) {
        this.A02 = r2;
        this.A03 = r3;
        this.A01 = r1;
        this.A00 = i;
    }
}
