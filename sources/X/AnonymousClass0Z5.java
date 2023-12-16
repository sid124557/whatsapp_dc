package X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.ConditionVariable;
import android.os.IBinder;

/* renamed from: X.0Z5  reason: invalid class name */
public class AnonymousClass0Z5 implements ServiceConnection {
    public final /* synthetic */ ConditionVariable A00;
    public final /* synthetic */ C10170hV A01;

    public AnonymousClass0Z5(ConditionVariable conditionVariable, C10170hV r2) {
        this.A01 = r2;
        this.A00 = conditionVariable;
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.A00.open();
    }

    public void onServiceDisconnected(ComponentName componentName) {
        this.A00.close();
    }
}
