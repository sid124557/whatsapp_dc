package X;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import java.util.HashMap;

/* renamed from: X.7t2  reason: invalid class name and case insensitive filesystem */
public final class C162957t2 implements Handler.Callback {
    public final /* synthetic */ C161367pV A00;

    public /* synthetic */ C162957t2(C161367pV r1) {
        this.A00 = r1;
    }

    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            HashMap hashMap = this.A00.A03;
            synchronized (hashMap) {
                C160537np r4 = (C160537np) message.obj;
                C162767sj r3 = (C162767sj) hashMap.get(r4);
                if (r3 != null && r3.A05.isEmpty()) {
                    if (r3.A03) {
                        C161367pV r2 = r3.A06;
                        r2.A04.removeMessages(1, r3.A04);
                        r2.A02.A01(r2.A00, r3);
                        r3.A03 = false;
                        r3.A00 = 2;
                    }
                    hashMap.remove(r4);
                }
            }
            return true;
        } else if (i != 1) {
            return false;
        } else {
            HashMap hashMap2 = this.A00.A03;
            synchronized (hashMap2) {
                C160537np r7 = (C160537np) message.obj;
                C162767sj r5 = (C162767sj) hashMap2.get(r7);
                if (r5 != null && r5.A00 == 3) {
                    String valueOf = String.valueOf(r7);
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("Timeout waiting for ServiceConnection callback ");
                    A0o.append(valueOf);
                    Log.e("GmsClientSupervisor", A0o.toString(), new Exception());
                    ComponentName componentName = r5.A01;
                    if (componentName == null && (componentName = r7.A00) == null) {
                        String str = r7.A02;
                        C162177rO.A02(str);
                        componentName = new ComponentName(str, "unknown");
                    }
                    r5.onServiceDisconnected(componentName);
                }
            }
            return true;
        }
    }
}
