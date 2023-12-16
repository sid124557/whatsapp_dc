package X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: X.7se  reason: invalid class name and case insensitive filesystem */
public class C162727se implements ServiceConnection {
    public boolean A00 = false;
    public final BlockingQueue A01 = new LinkedBlockingQueue();

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.A01.add(iBinder);
    }

    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
