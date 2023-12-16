package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: X.6Cd  reason: invalid class name and case insensitive filesystem */
public class C124406Cd extends BroadcastReceiver {
    public static C124406Cd A02;
    public final Handler A00 = AnonymousClass000.A0A();
    public final ArrayList A01 = AnonymousClass001.A0s();

    public synchronized void onReceive(Context context, Intent intent) {
        if (!isInitialStickyBroadcast()) {
            ArrayList arrayList = this.A01;
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                } else if (((Reference) arrayList.get(size)).get() == null) {
                    arrayList.remove(size);
                }
            }
            for (int i = 0; i < arrayList.size(); i++) {
                AnonymousClass88U r0 = (AnonymousClass88U) ((WeakReference) arrayList.get(i)).get();
                if (r0 != null) {
                    AnonymousClass88U.A01(r0);
                }
            }
        }
    }
}
