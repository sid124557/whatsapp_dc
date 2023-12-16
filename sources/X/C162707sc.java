package X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* renamed from: X.7sc  reason: invalid class name and case insensitive filesystem */
public final class C162707sc implements ServiceConnection {
    public final /* synthetic */ C158887ki A00;

    public /* synthetic */ C162707sc(C158887ki r1) {
        this.A00 = r1;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C158887ki r3 = this.A00;
        r3.A06.A02("ServiceConnectionImpl.onServiceConnected(%s)", AnonymousClass000.A1b(componentName));
        r3.A00().post(new C129156Zl(iBinder, this));
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        C158887ki r3 = this.A00;
        r3.A06.A02("ServiceConnectionImpl.onServiceDisconnected(%s)", AnonymousClass000.A1b(componentName));
        r3.A00().post(new AnonymousClass6Zk(this, 1));
    }
}
