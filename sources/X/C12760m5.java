package X;

import android.content.Context;
import android.content.Intent;
import android.os.ConditionVariable;

/* renamed from: X.0m5  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C12760m5 implements Runnable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ Intent A01;
    public final /* synthetic */ ConditionVariable A02;

    public final void run() {
        C10170hV.A05(this.A00, this.A01, this.A02);
    }

    public /* synthetic */ C12760m5(Context context, Intent intent, ConditionVariable conditionVariable) {
        this.A02 = conditionVariable;
        this.A00 = context;
        this.A01 = intent;
    }
}
