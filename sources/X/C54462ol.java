package X;

import java.util.Map;

/* renamed from: X.2ol  reason: invalid class name and case insensitive filesystem */
public class C54462ol {
    public final C183538qC A00;
    public final Map A01 = AnonymousClass001.A0t();

    public final synchronized C49082fx A00(C95814uZ r4) {
        C49082fx r1;
        Map map = this.A01;
        r1 = (C49082fx) map.get(r4.getRawString());
        if (r1 == null) {
            r1 = new C49082fx(this);
            map.put(r4.getRawString(), r1);
        }
        return r1;
    }

    public void A01(C624134x r5) {
        AnonymousClass2z0 r3 = r5.A1J;
        C49082fx A002 = A00(AnonymousClass2z0.A01(r3));
        synchronized (A002) {
            A002.A01.put(r3, r5);
            StringBuilder A0o = AnonymousClass001.A0o();
            C18280x3.A1H(A0o, "media-message-send-queue/add ", r3);
            C18260x0.A1J(A0o, A002.toString());
        }
    }

    public void A02(C624134x r7) {
        AnonymousClass2z0 r5 = r7.A1J;
        C49082fx A002 = A00(AnonymousClass2z0.A01(r5));
        synchronized (A002) {
            boolean A1W = AnonymousClass000.A1W(A002.A01.remove(r5));
            boolean remove = A002.A00.remove(r5);
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("media-message-send-queue/cancel ");
            A0o.append(r5);
            C18270x1.A1H(A0o, " ", A002);
            A0o.append(" cancelledPending:");
            A0o.append(A1W);
            C18260x0.A1D(" cancelledReady:", A0o, remove);
            if (A1W) {
                A002.A00();
            }
        }
    }

    public void A03(C624134x r6) {
        AnonymousClass2z0 r4 = r6.A1J;
        C95814uZ A012 = AnonymousClass2z0.A01(r4);
        C49082fx A002 = A00(A012);
        synchronized (A002) {
            if (!A002.A01.containsKey(r4)) {
                StringBuilder A0o = AnonymousClass001.A0o();
                C18280x3.A1H(A0o, "media-message-send-queue/ready-not-in-queue", r4);
                C18260x0.A1J(A0o, A002.toString());
                boolean z = A012 instanceof C95804uY;
                C66423Lj r0 = (C66423Lj) A002.A02.A00.get();
                if (z) {
                    r0.A02(r6);
                } else {
                    r0.A01(r6);
                }
            } else {
                StringBuilder A0o2 = AnonymousClass001.A0o();
                C18280x3.A1H(A0o2, "media-message-send-queue/ready ", r4);
                C18260x0.A1J(A0o2, A002.toString());
                A002.A00.add(r4);
                A002.A00();
            }
        }
    }

    public C54462ol(C183538qC r2) {
        this.A00 = r2;
    }
}
