package X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import com.google.android.finsky.externalreferrer.IGetInstallReferrerService;

/* renamed from: X.0Z8  reason: invalid class name */
public final class AnonymousClass0Z8 implements ServiceConnection {
    public final C16270sk A00;
    public final /* synthetic */ C05990Vt A01;

    public AnonymousClass0Z8(C05990Vt r1, C16270sk r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    public static IGetInstallReferrerService A00(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
        if (queryLocalInterface instanceof IGetInstallReferrerService) {
            return (IGetInstallReferrerService) queryLocalInterface;
        }
        return new AnonymousClass6O7(iBinder);
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        AnonymousClass0S4.A00("Install Referrer service connected.");
        C05990Vt r1 = this.A01;
        r1.A02 = A00(iBinder);
        r1.A00 = 2;
        this.A00.BUe(0);
    }

    public void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("InstallReferrerClient", 5)) {
            Log.w("InstallReferrerClient", "Install Referrer service disconnected.");
        }
        C05990Vt r1 = this.A01;
        r1.A02 = null;
        r1.A00 = 0;
    }
}
