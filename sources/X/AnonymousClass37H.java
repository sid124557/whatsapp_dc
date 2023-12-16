package X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.IBinder;
import com.whatsapp.util.Log;

/* renamed from: X.37H  reason: invalid class name */
public class AnonymousClass37H implements ServiceConnection {
    public final String A00;
    public final boolean A01;
    public final /* synthetic */ C46732c7 A02;

    public AnonymousClass37H(C46732c7 r1, String str, boolean z) {
        this.A02 = r1;
        this.A00 = str;
        this.A01 = z;
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C46732c7 r2 = this.A02;
        try {
            if (r2.A02.A01(componentName.getPackageName()).A03 && "com.facebook.stella".equals(componentName.getPackageName())) {
                r2.A05.execute(new C70103Zx(this, 48, iBinder));
                return;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        Log.e("CallbackServiceProxy/service component mismatch.");
        r2.A00.A00.unbindService(this);
    }

    public void onServiceDisconnected(ComponentName componentName) {
    }
}
