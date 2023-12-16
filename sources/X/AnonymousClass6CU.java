package X;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.ResultReceiver;

/* renamed from: X.6CU  reason: invalid class name */
public class AnonymousClass6CU extends Service {
    public IBinder A00 = new C124606De(this);
    public ResultReceiver A01;

    public IBinder onBind(Intent intent) {
        return this.A00;
    }

    public AnonymousClass6CU(ResultReceiver resultReceiver) {
        this.A01 = resultReceiver;
    }
}
