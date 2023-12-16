package X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.whatsapp.util.Log;

/* renamed from: X.0Z3  reason: invalid class name */
public class AnonymousClass0Z3 implements ServiceConnection {
    public final /* synthetic */ AnonymousClass0E2 A00;

    public AnonymousClass0Z3(AnonymousClass0E2 r1) {
        this.A00 = r1;
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        AnonymousClass0E2 r2 = this.A00;
        r2.A0T.set(true);
        r2.A0H.A0G();
        r2.A0R.open();
        Log.i("settings-gdrive/service-connected");
    }

    public void onServiceDisconnected(ComponentName componentName) {
        AnonymousClass0E2 r2 = this.A00;
        r2.A0T.set(false);
        r2.A0R.close();
        Log.i("settings-gdrive/service-disconnected");
    }
}
