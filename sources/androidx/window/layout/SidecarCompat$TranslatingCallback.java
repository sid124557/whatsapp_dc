package androidx.window.layout;

import X.AnonymousClass0P8;
import X.C03060Ir;
import X.C06420Xp;
import X.C08870fF;
import X.C16110sU;
import X.C162457s7;
import android.app.Activity;
import android.os.IBinder;
import android.util.Log;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarWindowLayoutInfo;

public final class SidecarCompat$TranslatingCallback implements SidecarInterface.SidecarCallback {
    public final /* synthetic */ C08870fF A00;

    public void onDeviceStateChanged(SidecarDeviceState sidecarDeviceState) {
        SidecarInterface A01;
        C162457s7.A0J(sidecarDeviceState, 0);
        C08870fF r5 = this.A00;
        for (Activity activity : r5.A04.values()) {
            IBinder A002 = C03060Ir.A00(activity);
            SidecarWindowLayoutInfo sidecarWindowLayoutInfo = null;
            if (!(A002 == null || (A01 = r5.A01()) == null)) {
                sidecarWindowLayoutInfo = A01.getWindowLayoutInfo(A002);
            }
            C16110sU r1 = r5.A00;
            if (r1 != null) {
                r1.Bfq(activity, r5.A01.A04(sidecarDeviceState, sidecarWindowLayoutInfo));
            }
        }
    }

    public void onWindowLayoutChanged(IBinder iBinder, SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
        SidecarDeviceState sidecarDeviceState;
        C162457s7.A0J(iBinder, 0);
        C162457s7.A0J(sidecarWindowLayoutInfo, 1);
        C08870fF r3 = this.A00;
        Activity activity = (Activity) r3.A04.get(iBinder);
        if (activity == null) {
            Log.w("SidecarCompat", "Unable to resolve activity from window token. Missing a call to #onWindowLayoutChangeListenerAdded()?");
            return;
        }
        C06420Xp r1 = r3.A01;
        SidecarInterface A01 = r3.A01();
        if (A01 == null || (sidecarDeviceState = A01.getDeviceState()) == null) {
            sidecarDeviceState = new SidecarDeviceState();
        }
        AnonymousClass0P8 A04 = r1.A04(sidecarDeviceState, sidecarWindowLayoutInfo);
        C16110sU r0 = r3.A00;
        if (r0 != null) {
            r0.Bfq(activity, A04);
        }
    }

    public SidecarCompat$TranslatingCallback(C08870fF r1) {
        this.A00 = r1;
    }
}
