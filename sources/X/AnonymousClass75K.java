package X;

import android.os.PowerManager;

/* renamed from: X.75K  reason: invalid class name */
public class AnonymousClass75K {
    public static PowerManager.WakeLock A00(PowerManager powerManager, String str, int i) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("com.whatsapp");
        return powerManager.newWakeLock(i, AnonymousClass000.A0V(":", str, A0o));
    }
}
