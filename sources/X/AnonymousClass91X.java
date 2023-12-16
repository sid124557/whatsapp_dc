package X;

import android.app.Activity;
import android.content.DialogInterface;
import com.whatsapp.businessdirectory.view.activity.BusinessDirectoryMapViewActivity;
import com.whatsapp.mediacomposer.MediaComposerActivity;
import com.whatsapp.registration.RegisterPhone;
import com.whatsapp.registration.VerifyPhoneNumber;
import com.whatsapp.textstatuscomposer.TextStatusComposerActivity;

/* renamed from: X.91X  reason: invalid class name */
public class AnonymousClass91X implements DialogInterface.OnDismissListener {
    public Object A00;
    public final int A01;

    public AnonymousClass91X(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.A01) {
            case 0:
                ((Activity) this.A00).finish();
                return;
            case 1:
                AnonymousClass4U2 r0 = ((BusinessDirectoryMapViewActivity) this.A00).A0N;
                if (r0 == null) {
                    throw C86604Kt.A0j();
                }
                r0.A0H();
                return;
            case 2:
                ((C90724i8) this.A00).A74();
                return;
            case 3:
                return;
            case 4:
                Activity activity = (Activity) this.A00;
                activity.finish();
                activity.overridePendingTransition(0, 0);
                return;
            case 5:
                ((MediaComposerActivity) this.A00).A1c = false;
                return;
            case 6:
                C114825nf.A00((C114825nf) this.A00);
                return;
            case 7:
                ((RegisterPhone) this.A00).A07 = null;
                return;
            case 8:
                ((VerifyPhoneNumber) this.A00).A7L();
                return;
            default:
                ((TextStatusComposerActivity) this.A00).A0y = false;
                return;
        }
    }
}
