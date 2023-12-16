package X;

import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.os.ResultReceiver;
import org.npci.upi.security.services.CLResultReceiver;

/* renamed from: X.6E6  reason: invalid class name */
public class AnonymousClass6E6 extends ResultReceiver {
    public CLResultReceiver A00;

    public AnonymousClass6E6(CLResultReceiver cLResultReceiver) {
        super(new Handler());
        this.A00 = cLResultReceiver;
    }

    public void onReceiveResult(int i, Bundle bundle) {
        super.onReceiveResult(i, bundle);
        if (i == 2) {
            try {
                this.A00.Br8(bundle);
            } catch (RemoteException e) {
                e.getLocalizedMessage();
            }
        } else if (i == 3) {
            this.A00.B3R(bundle);
        } else if (i == 4) {
            this.A00.Br7(bundle);
        } else {
            this.A00.BlK(bundle);
        }
    }
}
