package X;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import java.util.Map;
import java.util.Set;

/* renamed from: X.2p1  reason: invalid class name and case insensitive filesystem */
public class C54622p1 {
    public final Handler A00 = AnonymousClass000.A0A();
    public final Map A01 = AnonymousClass001.A0t();
    public final Set A02 = AnonymousClass002.A0K();

    public void A02(C32451qQ r4) {
        synchronized (this) {
            Class<?> cls = r4.getClass();
            C18260x0.A1R(AnonymousClass001.A0o(), "FgServiceManager register:", cls);
            this.A01.put(cls, r4);
        }
        A00();
    }

    public final void A00() {
        this.A00.post(new C71283br((Object) this, 35));
    }

    public void A01(Context context, Class cls) {
        C18260x0.A1R(AnonymousClass001.A0o(), "FgServiceManager/stopService ", cls);
        if (Build.VERSION.SDK_INT >= 26) {
            synchronized (this) {
                this.A02.add(cls);
            }
            A00();
            return;
        }
        context.stopService(AnonymousClass0x9.A08(context, cls));
    }

    public boolean A03(Context context, Intent intent, Class cls) {
        C18260x0.A1R(AnonymousClass001.A0o(), "FgServiceManager/startService ", cls);
        intent.setClass(context, cls);
        if (Build.VERSION.SDK_INT >= 26) {
            synchronized (this) {
                this.A02.remove(cls);
            }
        }
        return AnonymousClass29R.A00(context, intent);
    }
}
