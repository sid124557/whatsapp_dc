package X;

import com.whatsapp.util.Log;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.3Mk  reason: invalid class name and case insensitive filesystem */
public class C66693Mk implements AnonymousClass4AF {
    public final C59182wU A00 = new C59182wU();
    public final C59182wU A01 = new C59182wU();
    public final AnonymousClass2O6 A02;
    public final CountDownLatch A03 = C18290x4.A14();

    public void A00(int i) {
        C72173dI r0;
        AnonymousClass2O6 r02 = this.A02;
        if (i != 2) {
            r0 = r02.A01;
        } else {
            r0 = r02.A02;
        }
        r0.A01();
        try {
            this.A03.await();
        } catch (InterruptedException e) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("wamruntime: unexpected thread interrupt (");
            A0o.append(e);
            Log.a(AnonymousClass000.A0e(A0o));
            C18300x5.A11();
        }
    }

    public void A01(Object obj, int i, int i2) {
        C59182wU r0;
        if (i2 == 1 || i2 == 0) {
            r0 = this.A00;
        } else {
            r0 = this.A01;
        }
        r0.A00(i, obj);
    }

    public void Blk(Object obj, int i, int i2) {
        C71583cL r6;
        C72173dI r5;
        AnonymousClass2O6 r62 = this.A02;
        long j = r62.A00.A05;
        Thread currentThread = Thread.currentThread();
        Object obj2 = obj;
        int i3 = i;
        int i4 = i2;
        if (AnonymousClass000.A1T((j > currentThread.getId() ? 1 : (j == currentThread.getId() ? 0 : -1)))) {
            A01(obj, i, i2);
            return;
        }
        if (i2 != 2) {
            r5 = r62.A01;
            r6 = new C71583cL(this, obj2, i4, i3, 4);
        } else {
            r5 = r62.A02;
            if (r5.A05 == currentThread.getId()) {
                A00(i2);
                this.A01.A00(i, obj);
                return;
            }
            r6 = new C71583cL(this, obj2, i4, i3, 5);
        }
        r5.execute(r6);
    }

    public C66693Mk(AnonymousClass2O6 r2) {
        this.A02 = r2;
    }
}
