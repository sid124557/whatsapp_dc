package X;

import java.util.List;

/* renamed from: X.4Vr  reason: invalid class name and case insensitive filesystem */
public final class C87754Vr extends AnonymousClass0QO {
    public final List A00;
    public final List A01;

    public int A00() {
        return this.A00.size();
    }

    public int A01() {
        return this.A01.size();
    }

    public boolean A03(int i, int i2) {
        C1452374s r4 = (C1452374s) this.A01.get(i);
        C1452374s r3 = (C1452374s) this.A00.get(i2);
        if ((r4 instanceof C96934xH) && (r3 instanceof C96934xH)) {
            C96934xH r42 = (C96934xH) r4;
            C96934xH r32 = (C96934xH) r3;
            AnonymousClass1RL r8 = r42.A02;
            C95814uZ A05 = r8.A05();
            AnonymousClass1RL r7 = r32.A02;
            if (C162457s7.A0P(A05, r7.A05()) && C162457s7.A0P(r8.A0H, r7.A0H) && r8.A0L() == r7.A0L() && r8.A05 == r7.A05) {
                C372821q r0 = r8.A07;
                C372821q r2 = C372821q.GUEST;
                if (AnonymousClass000.A1Y(r0, r2) != AnonymousClass000.A1Y(r7.A07, r2) || !C162457s7.A0P(Long.valueOf(r42.A00.A0C), Long.valueOf(r32.A00.A0C))) {
                    return false;
                }
                return true;
            }
        } else if (r4 instanceof C136856nN) {
            return r3 instanceof C136856nN;
        } else {
            if (r4 instanceof C136836nL) {
                return r3 instanceof C136836nL;
            }
            if (r4 instanceof C136846nM) {
                return r3 instanceof C136846nM;
            }
            if (r4 instanceof C136876nP) {
                return r3 instanceof C136876nP;
            }
            if (r4 instanceof C136866nO) {
                return r3 instanceof C136866nO;
            }
        }
        return false;
    }

    public boolean A04(int i, int i2) {
        C1452374s r1 = (C1452374s) this.A01.get(i);
        C1452374s r2 = (C1452374s) this.A00.get(i2);
        if (r1 instanceof C96934xH) {
            if (!(r2 instanceof C96934xH) || !C162457s7.A0P(((C96934xH) r1).A02.A05(), ((C96934xH) r2).A02.A05())) {
                return false;
            }
            return true;
        } else if (r1 instanceof C136856nN) {
            return r2 instanceof C136856nN;
        } else {
            if (r1 instanceof C136836nL) {
                return r2 instanceof C136836nL;
            }
            if (r1 instanceof C136846nM) {
                return r2 instanceof C136846nM;
            }
            if (r1 instanceof C136876nP) {
                return r2 instanceof C136876nP;
            }
            if (r1 instanceof C136866nO) {
                return r2 instanceof C136866nO;
            }
            throw C73153f1.A00();
        }
    }

    public C87754Vr(List list, List list2) {
        this.A01 = list;
        this.A00 = list2;
    }
}
