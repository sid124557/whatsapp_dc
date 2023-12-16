package X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.ConditionVariable;
import android.os.IBinder;

/* renamed from: X.0Z6  reason: invalid class name */
public class AnonymousClass0Z6 implements ServiceConnection {
    public final /* synthetic */ ConditionVariable A00;
    public final /* synthetic */ C10170hV A01;
    public final /* synthetic */ C17110ua A02;

    public AnonymousClass0Z6(ConditionVariable conditionVariable, C10170hV r2, C17110ua r3) {
        this.A01 = r2;
        this.A00 = conditionVariable;
        this.A02 = r3;
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.A00.open();
        C10170hV r2 = this.A01;
        r2.A03.A01(this.A02);
        r2.A02.A09();
    }

    public void onServiceDisconnected(ComponentName componentName) {
        this.A00.close();
    }
}
