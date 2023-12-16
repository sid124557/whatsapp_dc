package X;

import android.app.Activity;
import android.content.DialogInterface;
import com.whatsapp.calling.calllink.view.CallLinkActivity;
import com.whatsapp.calling.calllink.viewmodel.CallLinkViewModel;
import com.whatsapp.voipcalling.VoipActivityV2;

/* renamed from: X.8zx  reason: invalid class name and case insensitive filesystem */
public class C189078zx extends C47702dg {
    public Object A00;
    public final int A01;

    public C189078zx(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void A00() {
        switch (this.A01) {
            case 0:
                CallLinkViewModel callLinkViewModel = ((CallLinkActivity) this.A00).A06;
                callLinkViewModel.A0D(callLinkViewModel.A0E());
                return;
            case 1:
                ((VoipActivityV2) this.A00).A7P();
                return;
            default:
                super.A00();
                return;
        }
    }

    public void A01(DialogInterface dialogInterface) {
        switch (this.A01) {
            case 0:
                ((Activity) this.A00).finish();
                return;
            case 2:
                dialogInterface.dismiss();
                ((VoipActivityV2) this.A00).finish();
                return;
            default:
                super.A01(dialogInterface);
                return;
        }
    }
}
