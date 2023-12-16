package X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import org.npci.upi.security.services.CLRemoteService;

/* renamed from: X.7sd  reason: invalid class name and case insensitive filesystem */
public class C162717sd implements ServiceConnection {
    public final /* synthetic */ C156697h3 A00;

    public C162717sd(C156697h3 r1) {
        this.A00 = r1;
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        CLRemoteService r1;
        C156697h3 r2 = this.A00;
        if (iBinder == null) {
            r1 = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("org.npci.upi.security.services.CLRemoteService");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof CLRemoteService)) {
                r1 = new C173378Py(iBinder);
            } else {
                r1 = (CLRemoteService) queryLocalInterface;
            }
        }
        r2.A03 = r1;
        C40652Hf r0 = r2.A02;
        AnonymousClass000.A0A().post(new C70123Zz(r0.A00, 36, C156697h3.A04));
        Log.d("Remote Service", "Service Connected");
    }

    public void onServiceDisconnected(ComponentName componentName) {
        C156697h3 r1 = this.A00;
        r1.A03 = null;
        r1.A02.A00.A02.A0A("payments/indiaupi", true, "CL service disconnected");
        com.whatsapp.util.Log.e("CLServices serviceDisconnected");
        Log.d("Remote Service", "Service Disconnected");
    }
}
