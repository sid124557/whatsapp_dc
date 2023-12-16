package X;

import com.whatsapp.util.Log;
import java.util.concurrent.locks.Lock;

/* renamed from: X.2be  reason: invalid class name and case insensitive filesystem */
public class C46452be {
    public final C64393Dh A00;
    public final C69263Wi A01;
    public final C56512s6 A02;
    public final AnonymousClass2RD A03;
    public final C183538qC A04;

    public final void A00() {
        C183538qC r1 = this.A02.A06;
        if (!((AnonymousClass2NX) r1.get()).A00 && !((AnonymousClass2NX) r1.get()).A01) {
            Log.d("MediaStateRefresher/clearExternalDirTrash");
            AnonymousClass2RD r3 = this.A03;
            if (r3.A04 == null) {
                synchronized (r3) {
                    if (r3.A04 == null) {
                        r3.A04 = new C45972as(r3.A00.A00(), r3.A02);
                    }
                }
            }
            C45972as r2 = r3.A04;
            Lock lock = r2.A03;
            lock.lock();
            if (!r2.A00) {
                lock.unlock();
                C69993Zl.A00(r2.A02, r2, 29);
                return;
            }
            lock.unlock();
        }
    }

    public C46452be(C64393Dh r1, C69263Wi r2, C56512s6 r3, AnonymousClass2RD r4, C183538qC r5) {
        this.A01 = r2;
        this.A00 = r1;
        this.A03 = r4;
        this.A02 = r3;
        this.A04 = r5;
    }
}
