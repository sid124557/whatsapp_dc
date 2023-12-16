package X;

import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.7kx  reason: invalid class name and case insensitive filesystem */
public class C159017kx {
    public final int A00;
    public final AnonymousClass6PS A01;
    public final CopyOnWriteArrayList A02;

    public void A01(C166527yp r11, int i, long j) {
        A06(new AnonymousClass7P1(r11, (Object) null, 1, i, 0, A00(j), -9223372036854775807L));
    }

    public void A02(C156527gm r9, AnonymousClass7P1 r10) {
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            AnonymousClass7G4 r0 = (AnonymousClass7G4) it.next();
            C162387ry.A0A(r0.A00, new C71593cM((Object) this, (Object) r0.A01, (Object) r9, (Object) r10, 7));
        }
    }

    public void A03(C156527gm r9, AnonymousClass7P1 r10) {
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            AnonymousClass7G4 r0 = (AnonymousClass7G4) it.next();
            C162387ry.A0A(r0.A00, new C71593cM((Object) this, (Object) r0.A01, (Object) r9, (Object) r10, 6));
        }
    }

    public void A04(C156527gm r9, AnonymousClass7P1 r10) {
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            AnonymousClass7G4 r0 = (AnonymousClass7G4) it.next();
            C162387ry.A0A(r0.A00, new C71593cM((Object) this, (Object) r0.A01, (Object) r9, (Object) r10, 5));
        }
    }

    public void A05(C156527gm r11, AnonymousClass7P1 r12, IOException iOException, boolean z) {
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            AnonymousClass7G4 r0 = (AnonymousClass7G4) it.next();
            C162387ry.A0A(r0.A00, new C70773b2(this, r11, r12, iOException, r0.A01, 1, z));
        }
    }

    public void A06(AnonymousClass7P1 r6) {
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            AnonymousClass7G4 r0 = (AnonymousClass7G4) it.next();
            C162387ry.A0A(r0.A00, new C172708Mj(this, r0.A01, r6, 8));
        }
    }

    public C159017kx(AnonymousClass6PS r1, CopyOnWriteArrayList copyOnWriteArrayList, int i) {
        this.A02 = copyOnWriteArrayList;
        this.A00 = i;
        this.A01 = r1;
    }

    public final long A00(long j) {
        long A012 = C161207pD.A01(j);
        if (A012 != -9223372036854775807L) {
            return 0 + A012;
        }
        return -9223372036854775807L;
    }

    public C159017kx() {
        this((AnonymousClass6PS) null, new CopyOnWriteArrayList(), 0);
    }
}
