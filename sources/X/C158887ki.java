package X;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.7ki  reason: invalid class name and case insensitive filesystem */
public final class C158887ki {
    public static final Map A0E = AnonymousClass001.A0t();
    public ServiceConnection A00;
    public IInterface A01;
    public boolean A02;
    public final Context A03;
    public final Intent A04;
    public final IBinder.DeathRecipient A05 = new C163047tB(this);
    public final C157897j6 A06;
    public final C181288mW A07;
    public final Object A08 = AnonymousClass002.A0D();
    public final String A09;
    public final WeakReference A0A;
    public final List A0B = AnonymousClass001.A0s();
    public final Set A0C = AnonymousClass002.A0K();
    public final AtomicInteger A0D = AnonymousClass6CA.A0d();

    public final Handler A00() {
        Handler handler;
        Map map = A0E;
        synchronized (map) {
            String str = this.A09;
            if (!map.containsKey(str)) {
                HandlerThread handlerThread = new HandlerThread(str, 10);
                handlerThread.start();
                map.put(str, AnonymousClass6C9.A0R(handlerThread));
            }
            handler = (Handler) map.get(str);
        }
        return handler;
    }

    public final void A01() {
        Set<C152017Xf> set = this.A0C;
        for (C152017Xf A012 : set) {
            A012.A01(new RemoteException(String.valueOf(this.A09).concat(" : Binder has died.")));
        }
        set.clear();
    }

    public final void A02(C152017Xf r3) {
        synchronized (this.A08) {
            this.A0C.remove(r3);
        }
        A00().post(new AnonymousClass6Zk(this, 0));
    }

    public C158887ki(Context context, Intent intent, C157897j6 r4, C181288mW r5, String str) {
        this.A03 = context;
        this.A06 = r4;
        this.A09 = str;
        this.A04 = intent;
        this.A07 = r5;
        this.A0A = AnonymousClass0x9.A14((Object) null);
    }
}
