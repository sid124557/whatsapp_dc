package X;

import android.content.DialogInterface;
import android.view.KeyEvent;
import com.whatsapp.companiondevice.LinkedDevicesEnterCodeActivity;
import com.whatsapp.util.Log;

/* renamed from: X.37B  reason: invalid class name */
public final /* synthetic */ class AnonymousClass37B implements DialogInterface.OnKeyListener {
    public final /* synthetic */ C60172y7 A00;
    public final /* synthetic */ LinkedDevicesEnterCodeActivity A01;

    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        LinkedDevicesEnterCodeActivity linkedDevicesEnterCodeActivity = this.A01;
        C60172y7 r2 = this.A00;
        if (i != 4) {
            return false;
        }
        Log.i("LinkedDevicesEnterCodeActivity cancel the progress dialog on press back button");
        C44752Xi r0 = linkedDevicesEnterCodeActivity.A07;
        C626936e.A01();
        C45482a5 r02 = r0.A01;
        if (r02 != null) {
            r02.A00().A01();
        }
        if (r2 != null) {
            new AnonymousClass3TD(linkedDevicesEnterCodeActivity.A0D).A00(r2.A02, (String) null);
        }
        if (!linkedDevicesEnterCodeActivity.BHW()) {
            linkedDevicesEnterCodeActivity.A74();
            linkedDevicesEnterCodeActivity.finish();
        }
        return true;
    }

    public /* synthetic */ AnonymousClass37B(C60172y7 r1, LinkedDevicesEnterCodeActivity linkedDevicesEnterCodeActivity) {
        this.A01 = linkedDevicesEnterCodeActivity;
        this.A00 = r1;
    }
}
