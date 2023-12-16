package X;

import android.content.DialogInterface;
import com.whatsapp.location.StopLiveLocationDialogFragment;

/* renamed from: X.371  reason: invalid class name */
public final /* synthetic */ class AnonymousClass371 implements DialogInterface.OnClickListener {
    public final /* synthetic */ StopLiveLocationDialogFragment A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;

    public final void onClick(DialogInterface dialogInterface, int i) {
        StopLiveLocationDialogFragment stopLiveLocationDialogFragment = this.A00;
        String str = this.A01;
        stopLiveLocationDialogFragment.A01.BkM(new C70313aI(stopLiveLocationDialogFragment, this.A02, str, 9));
    }

    public /* synthetic */ AnonymousClass371(StopLiveLocationDialogFragment stopLiveLocationDialogFragment, String str, String str2) {
        this.A00 = stopLiveLocationDialogFragment;
        this.A01 = str;
        this.A02 = str2;
    }
}
