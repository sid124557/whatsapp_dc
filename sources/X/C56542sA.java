package X;

import com.whatsapp.util.Log;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.2sA  reason: invalid class name and case insensitive filesystem */
public class C56542sA {
    public final C56982ss A00;
    public final C55272q5 A01;
    public final C183538qC A02;

    public void A02(C371321b r11, C95814uZ r12, Runnable runnable, String str, boolean z) {
        C18310x6.A0Q(this.A02).A09.A01(new C70793b4(this, r12, runnable, r11, str, 0, z), 6);
    }

    public void A06(C95814uZ r20, Integer num, boolean z) {
        StringBuilder A0o;
        String str;
        C183538qC r2 = this.A02;
        AnonymousClass2UO A0Q = C18310x6.A0Q(r2);
        C95814uZ r6 = r20;
        boolean z2 = z;
        if (z) {
            A0Q.A02.A00(r6, 3);
            AnonymousClass3LP r4 = C18310x6.A0Q(r2).A0O;
            AnonymousClass4FS r7 = C18310x6.A0Q(r2).A0U;
            AnonymousClass31G.A01(C18310x6.A0Q(r2).A0F, r4, C18310x6.A0Q(r2).A0P, r6, r7, C18290x4.A0d(), (Integer) null, 3);
        } else {
            AnonymousClass3LP r12 = A0Q.A0O;
            AnonymousClass4FS r15 = C18310x6.A0Q(r2).A0U;
            AnonymousClass31G.A01(C18310x6.A0Q(r2).A0F, r12, C18310x6.A0Q(r2).A0P, r6, r15, C18310x6.A0e(), (Integer) null, 4);
        }
        C18310x6.A0Q(r2).A0U.BkM(new C71643cR(this, r6, num, 16, z2));
        AnonymousClass31A A002 = C56982ss.A00(this.A00, r6);
        if (A002 == null) {
            A0o = AnonymousClass001.A0o();
            str = "msgstore/archive/no chat ";
        } else if (A002.A0i == z2) {
            A0o = AnonymousClass001.A0o();
            str = "msgstore/archive/nop ";
        } else {
            A07(z2);
            A002.A0i = z2;
            C18310x6.A0Q(r2).A0B.A08();
            C18310x6.A0Q(r2).A09.A01(new C117665sI(this, A002, 23, z2), 3);
            return;
        }
        AnonymousClass000.A17(r6, str, " ", A0o);
        A0o.append(z2);
        AnonymousClass0x2.A19(A0o);
    }

    public Long A00(C95814uZ r5) {
        C183538qC r3 = this.A02;
        Set A06 = C18310x6.A0Q(r3).A04.A06(r5, false);
        Long A0N = C18310x6.A0Q(r3).A0S.A0N(r5);
        C65203Gp r0 = C18310x6.A0Q(r3).A04;
        if (A0N != null) {
            r0.A0O(A06);
            return A0N;
        }
        r0.A0N(A06);
        return A0N;
    }

    public HashMap A01(Integer num, List list) {
        Set A0R = C18310x6.A0Q(this.A02).A0S.A0R();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C95814uZ A0P = C18300x5.A0P(it);
            if (!(A0P instanceof C28001fK)) {
                A06(A0P, num, true);
            }
        }
        HashMap A0t = AnonymousClass001.A0t();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C95814uZ A0P2 = C18300x5.A0P(it2);
            if (!(A0P2 instanceof C28001fK) && A0R.contains(A0P2)) {
                A0t.put(A0P2, A00(A0P2));
            }
        }
        return A0t;
    }

    public void A03(C95814uZ r5) {
        AnonymousClass31A A0A = this.A00.A0A(r5, false);
        if (A0A == null) {
            C18260x0.A1S(AnonymousClass001.A0o(), "msgstore/reset-show-group-description/no chat ", r5);
        } else if (!A0A.A0p) {
            C18260x0.A1R(AnonymousClass001.A0o(), "msgstore/reset-show-group-description/nop ", r5);
        } else {
            A0A.A0p = false;
            C18310x6.A0Q(this.A02).A09.A01(new C70093Zw(this, 12, A0A), 5);
        }
    }

    public void A04(C95814uZ r4, int i, boolean z) {
        if (!z) {
            C18260x0.A1E("ChatManager/updatePushRecordingButtonMode skipped, enabled=", AnonymousClass001.A0o(), z);
        } else {
            C18310x6.A0Q(this.A02).A0U.BkV(new C71733ca((Object) r4, (Object) this, i, 37), "ChatManager/updatePushRecordingButtonMode");
        }
    }

    public final void A05(C95814uZ r25, C624134x r26, int i, int i2, int i3, boolean z, boolean z2) {
        AnonymousClass2z0 r0;
        int i4;
        int i5;
        boolean z3;
        long j;
        AnonymousClass2z0 r02;
        C95814uZ r14 = r25;
        AnonymousClass31A A002 = C56982ss.A00(this.A00, r14);
        StringBuilder A0o = AnonymousClass001.A0o();
        C624134x r2 = r26;
        if (A002 == null) {
            AnonymousClass000.A17(r14, "msgstore/setchatseen/nochat/", "/", A0o);
            if (r26 != null) {
                r02 = r2.A1J;
            } else {
                r02 = null;
            }
            C18260x0.A0o(r02, A0o);
            return;
        }
        AnonymousClass000.A17(r14, "msgstore/setchatseen/", "/", A0o);
        A0o.append(A002.A08());
        A0o.append("/");
        if (r26 != null) {
            r0 = r2.A1J;
        } else {
            r0 = null;
        }
        A0o.append(r0);
        int i6 = i;
        C18260x0.A0y("/", A0o, i6);
        boolean z4 = true;
        boolean A1U = AnonymousClass000.A1U(A002.A08, -1);
        if (r26 != null) {
            C183538qC r10 = this.A02;
            C56362rr r3 = C18310x6.A0Q(r10).A0J;
            C95814uZ A003 = AnonymousClass2z0.A00(r2);
            i4 = r3.A00(A003, r2.A1M);
            AnonymousClass2Y4 r32 = C18310x6.A0Q(r10).A0E;
            C626936e.A06(A003);
            i5 = r32.A00(A003, r2.A1M);
        } else {
            i4 = 0;
            i5 = 0;
        }
        boolean A0G = A002.A0G(i6, i2, i4, i5);
        long j2 = A002.A0T;
        long j3 = A002.A0M;
        if (j3 > j2) {
            A002.A0T = j3;
            A002.A07 = 0;
            z3 = true;
        } else {
            z4 = A0G;
            z3 = false;
        }
        if (r26 == null || r2.A1L == 0) {
            j = 1;
        } else {
            j = r2.A1L;
        }
        long A012 = C627636p.A01(r2);
        long j4 = A002.A0Q;
        if (j == 1) {
            A012 = A002.A0O;
            long j5 = A002.A0V;
            if (A012 > j5) {
                j = A002.A0N;
            } else {
                j = A002.A0U;
                A012 = j5;
            }
        }
        if (j4 < A012 || z4 || A002.A0N == 0) {
            if (A002.A0N == 0) {
                C183538qC r33 = this.A02;
                C56382rt r03 = C18310x6.A0Q(r33).A0I;
                C95814uZ r22 = A002.A0q;
                A002.A0N = r03.A02(r22);
                A002.A0O = C18310x6.A0Q(r33).A0J.A06(r22);
                A002.A0c = null;
            }
            if (A002.A0L != 1) {
                A002.A0L = 1;
            }
            A002.A0P = j;
            A002.A0Q = A012;
            long j6 = j2;
            AnonymousClass31A r12 = A002;
            C18310x6.A0Q(this.A02).A09.A01(new C71123bb(r12, this, r14, i3, j4, j6, z, A1U, z2, z3), 2);
        }
    }

    public final void A07(boolean z) {
        if (z) {
            C183538qC r1 = this.A02;
            if (C18310x6.A0Q(r1).A06.A01() == 0 && !C18310x6.A0Q(r1).A08.A28()) {
                Log.i("chatMAnager/setChatArchived/Enabling archive2.0");
                C18310x6.A0Q(r1).A07.A02();
            }
        }
    }

    public final void A08(boolean z) {
        boolean z2;
        synchronized (this.A01) {
            C56982ss r3 = this.A00;
            synchronized (r3) {
                z2 = r3.A00;
            }
            if (!z2) {
                C40412Fs r2 = new C40412Fs(this);
                C18260x0.A1D("msgstore-manager/initializeChats lazily:", AnonymousClass001.A0o(), z);
                synchronized (r3) {
                    r3.A0G();
                    C626936e.A0C(AnonymousClass000.A1X(r3.A05));
                    r3.A05 = r2;
                    if (!z) {
                        r3.A0G();
                    }
                }
            }
        }
    }

    public boolean A09(C95814uZ r8) {
        AnonymousClass31A A002 = C56982ss.A00(this.A00, r8);
        if (A002 == null) {
            return false;
        }
        if (A002.A08 == 0 && A002.A09 == 0 && A002.A0Q == Math.max(A002.A0O, A002.A0V) && A002.A0M <= A002.A0T) {
            return false;
        }
        return true;
    }

    public C56542sA(C56982ss r1, C55272q5 r2, C183538qC r3) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }
}
