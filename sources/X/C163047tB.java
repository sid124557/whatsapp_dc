package X;

import android.os.IBinder;
import android.os.RemoteException;
import java.util.List;

/* renamed from: X.7tB  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C163047tB implements IBinder.DeathRecipient {
    public final /* synthetic */ C158887ki A00;

    public final void binderDied() {
        C158887ki r6 = this.A00;
        C157897j6 r3 = r6.A06;
        r3.A02("reportBinderDeath", new Object[0]);
        r6.A0A.get();
        Object[] A0L = AnonymousClass002.A0L();
        String str = r6.A09;
        A0L[0] = str;
        r3.A02("%s : Binder has died.", A0L);
        List<C172698Mi> list = r6.A0B;
        for (C172698Mi A01 : list) {
            A01.A01(new RemoteException(String.valueOf(str).concat(" : Binder has died.")));
        }
        list.clear();
        synchronized (r6.A08) {
            r6.A01();
        }
    }

    public /* synthetic */ C163047tB(C158887ki r1) {
        this.A00 = r1;
    }
}
