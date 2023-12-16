package X;

import android.content.ServiceConnection;
import android.os.ConditionVariable;

/* renamed from: X.0md  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C13100md implements Runnable {
    public final /* synthetic */ ServiceConnection A00;
    public final /* synthetic */ ConditionVariable A01;
    public final /* synthetic */ C10170hV A02;
    public final /* synthetic */ C627736r A03;
    public final /* synthetic */ String A04;

    public final void run() {
        C10170hV r3 = this.A02;
        r3.A07(this.A00, this.A01, this.A04);
    }

    public /* synthetic */ C13100md(ServiceConnection serviceConnection, ConditionVariable conditionVariable, C10170hV r3, C627736r r4, String str) {
        this.A02 = r3;
        this.A01 = conditionVariable;
        this.A03 = r4;
        this.A04 = str;
        this.A00 = serviceConnection;
    }
}
