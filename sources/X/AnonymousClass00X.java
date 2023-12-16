package X;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* renamed from: X.00X  reason: invalid class name */
public class AnonymousClass00X extends Service implements C15910sA {
    public final AnonymousClass0NR A00 = new AnonymousClass0NR(this);

    public AnonymousClass0O9 getLifecycle() {
        return this.A00.A02;
    }

    public IBinder onBind(Intent intent) {
        this.A00.A00(AnonymousClass0GH.ON_START);
        return null;
    }

    public void onCreate() {
        this.A00.A00(AnonymousClass0GH.ON_CREATE);
        super.onCreate();
    }

    public void onDestroy() {
        AnonymousClass0NR r1 = this.A00;
        r1.A00(AnonymousClass0GH.ON_STOP);
        r1.A00(AnonymousClass0GH.ON_DESTROY);
        super.onDestroy();
    }

    public void onStart(Intent intent, int i) {
        this.A00.A00(AnonymousClass0GH.ON_START);
        super.onStart(intent, i);
    }
}
