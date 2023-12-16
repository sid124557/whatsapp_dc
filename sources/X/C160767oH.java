package X;

import android.os.Handler;
import android.os.Looper;
import com.facebook.android.exoplayer2.util.Util;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.7oH  reason: invalid class name and case insensitive filesystem */
public final class C160767oH {
    public final int A00;
    public final AnonymousClass7Z2 A01;
    public final CopyOnWriteArrayList A02;

    public void A05(C166637z1 r11, int i, long j) {
        A0A(new C150007Ot(r11, (Object) null, 1, i, 0, A01(j), -9223372036854775807L));
    }

    public void A06(AnonymousClass7A4 r9, C150007Ot r10) {
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            AnonymousClass7F9 r0 = (AnonymousClass7F9) it.next();
            A00(r0.A00, new C71593cM((Object) this, (Object) r0.A01, (Object) r9, (Object) r10, 1));
        }
    }

    public void A07(AnonymousClass7A4 r9, C150007Ot r10) {
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            AnonymousClass7F9 r0 = (AnonymousClass7F9) it.next();
            A00(r0.A00, new C71593cM((Object) this, (Object) r0.A01, (Object) r9, (Object) r10, 0));
        }
    }

    public void A08(AnonymousClass7A4 r11, C150007Ot r12, IOException iOException, boolean z) {
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            AnonymousClass7F9 r0 = (AnonymousClass7F9) it.next();
            A00(r0.A00, new C70773b2(this, r0.A01, r11, r12, iOException, 0, z));
        }
    }

    public void A09(AnonymousClass7A4 r9, C150007Ot r10, Object obj) {
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            AnonymousClass7F9 r0 = (AnonymousClass7F9) it.next();
            A00(r0.A00, new C71453c8(this, r9, r10, r0.A01, obj));
        }
    }

    public void A02() {
        C159197lM.A02(AnonymousClass000.A1W(this.A01));
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            AnonymousClass7F9 r0 = (AnonymousClass7F9) it.next();
            A00(r0.A00, new AnonymousClass8MF(this, 5, r0.A01));
        }
    }

    public void A03() {
        C159197lM.A02(AnonymousClass000.A1W(this.A01));
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            AnonymousClass7F9 r0 = (AnonymousClass7F9) it.next();
            A00(r0.A00, new AnonymousClass8MF(this, 6, r0.A01));
        }
    }

    public void A04() {
        C159197lM.A02(AnonymousClass000.A1W(this.A01));
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            AnonymousClass7F9 r0 = (AnonymousClass7F9) it.next();
            A00(r0.A00, new AnonymousClass8MF(this, 7, r0.A01));
        }
    }

    public void A0A(C150007Ot r6) {
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            AnonymousClass7F9 r0 = (AnonymousClass7F9) it.next();
            A00(r0.A00, new C172708Mj(this, r0.A01, r6, 0));
        }
    }

    public C160767oH(AnonymousClass7Z2 r1, CopyOnWriteArrayList copyOnWriteArrayList, int i) {
        this.A02 = copyOnWriteArrayList;
        this.A00 = i;
        this.A01 = r1;
    }

    public static final void A00(Handler handler, Runnable runnable) {
        if (handler.getLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            handler.post(runnable);
        }
    }

    public final long A01(long j) {
        long A05 = Util.A05(j);
        if (A05 != -9223372036854775807L) {
            return 0 + A05;
        }
        return -9223372036854775807L;
    }

    public C160767oH() {
        this((AnonymousClass7Z2) null, new CopyOnWriteArrayList(), 0);
    }
}
