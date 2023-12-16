package X;

import com.google.android.exoplayer2.Timeline;

/* renamed from: X.7jZ  reason: invalid class name and case insensitive filesystem */
public final class C158187jZ {
    public AnonymousClass6PS A00;
    public AnonymousClass6PS A01;
    public AnonymousClass6PS A02;
    public C129586aY A03 = C129586aY.of();
    public AnonymousClass8OQ A04 = AnonymousClass8OQ.of();
    public final C153417bH A05;

    public static AnonymousClass7XD A00(C1685685x r1) {
        return r1.A01(r1.A06.A02);
    }

    public static AnonymousClass7XD A01(C1685685x r1) {
        return r1.A01(r1.A06.A00);
    }

    public final void A04(Timeline timeline, AnonymousClass6PS r4, C160667o6 r5) {
        if (r4 != null) {
            int A042 = timeline.A04(r4.A04);
            Object obj = timeline;
            if (A042 == -1) {
                Object obj2 = this.A04.get(r4);
                obj = obj2;
                if (obj2 == null) {
                    return;
                }
            }
            r5.put(r4, obj);
        }
    }

    public C158187jZ(C153417bH r2) {
        this.A05 = r2;
    }

    public static AnonymousClass6PS A02(C186498vS r10, C153417bH r11, AnonymousClass6PS r12, C129586aY r13) {
        Object A0C;
        int i;
        AnonymousClass6PS r6;
        Timeline B6b = r10.B6b();
        int B6V = r10.B6V();
        boolean A1T = AnonymousClass000.A1T(B6b.A01());
        if (A1T) {
            A0C = null;
        } else {
            A0C = B6b.A0C(B6V);
        }
        if (r10.BIQ() || A1T) {
            i = -1;
        } else {
            i = B6b.A09(r11, B6V, false).A01(C161207pD.A00(r10.B6W()) - r11.A02);
        }
        int i2 = 0;
        while (true) {
            if (i2 < r13.size()) {
                r6 = (AnonymousClass6PS) r13.get(i2);
                boolean BIQ = r10.BIQ();
                int B6L = r10.B6L();
                int B6M = r10.B6M();
                if (r6.A04.equals(A0C)) {
                    int i3 = r6.A00;
                    if (BIQ) {
                        if (i3 == B6L && r6.A01 == B6M) {
                            break;
                        }
                    } else if (i3 == -1 && r6.A02 == i) {
                        return r6;
                    }
                }
                i2++;
            } else {
                if (r13.isEmpty()) {
                    r6 = r12;
                    if (r12 != null) {
                        boolean BIQ2 = r10.BIQ();
                        int B6L2 = r10.B6L();
                        int B6M2 = r10.B6M();
                        if (r12.A04.equals(A0C)) {
                            int i4 = r12.A00;
                            if (!BIQ2 ? !(i4 == -1 && r12.A02 == i) : !(i4 == B6L2 && r12.A01 == B6M2)) {
                                return null;
                            }
                        }
                    }
                }
                return null;
            }
        }
        return r6;
    }

    public final void A03(Timeline timeline) {
        boolean contains;
        C160667o6 builder = AnonymousClass8OQ.builder();
        if (this.A03.isEmpty()) {
            A04(timeline, this.A01, builder);
            if (!C1447372t.A00(this.A02, this.A01)) {
                A04(timeline, this.A02, builder);
            }
            if (!C1447372t.A00(this.A00, this.A01)) {
                contains = C1447372t.A00(this.A00, this.A02);
            }
            this.A04 = builder.build();
        }
        for (int i = 0; i < this.A03.size(); i++) {
            A04(timeline, (AnonymousClass6PS) this.A03.get(i), builder);
        }
        contains = this.A03.contains(this.A00);
        if (!contains) {
            A04(timeline, this.A00, builder);
        }
        this.A04 = builder.build();
    }
}
