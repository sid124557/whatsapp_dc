package X;

import android.content.Context;
import android.content.SharedPreferences;
import com.whatsapp.fieldstats.events.WamCall;
import com.whatsapp.util.Log;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.3Mn  reason: invalid class name and case insensitive filesystem */
public class C66723Mn implements AnonymousClass4FV {
    public int A00;
    public C56172rX A01;
    public C56172rX A02;
    public C56172rX A03;
    public C55452qN A04;
    public C55452qN A05;
    public C55452qN A06;
    public C183538qC A07;
    public C183538qC A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public final C380625j A0C;
    public final AnonymousClass33p A0D;
    public final AnonymousClass1VX A0E;
    public final AnonymousClass2GQ A0F;
    public final AnonymousClass2YD A0G;
    public final C56092rP A0H;
    public final C66693Mk A0I;
    public final C26071bX A0J;
    public final AnonymousClass2O6 A0K;
    public final CountDownLatch A0L = new CountDownLatch(1);
    public final CountDownLatch A0M = new CountDownLatch(1);
    public final CountDownLatch A0N = new CountDownLatch(1);
    public volatile int A0O;
    public volatile boolean A0P;
    public volatile boolean A0Q;
    public volatile boolean A0R;
    public volatile boolean A0S;

    public final Integer A00(AnonymousClass5ZC r9, int i, boolean z) {
        AnonymousClass5ZC r2 = r9;
        int A002 = this.A0G.A00(i);
        if (A002 != 0) {
            int abs = Math.abs(A002);
            r2 = new AnonymousClass5ZC(abs, abs, abs, abs, false);
        } else {
            A002 = r9.A01;
            if (z) {
                A002 = -A002;
            }
        }
        if (r2.A00()) {
            return Integer.valueOf(A002);
        }
        return null;
    }

    public Integer AzK(AnonymousClass3ZG r3, AnonymousClass5ZC r4, boolean z) {
        int i = r3.code;
        if (r4 == null) {
            r4 = r3.samplingRate;
        }
        return A00(r4, i, false);
    }

    public void Bh9(AnonymousClass5ZC r14, byte[] bArr, int i, int i2, boolean z) {
        int i3 = i;
        Integer A002 = A00(r14, i3, false);
        if (A002 != null) {
            int intValue = A002.intValue();
            byte[] bArr2 = bArr;
            int i4 = i2;
            if (i4 != 2) {
                this.A0K.A01.execute(new C70553ag(this, bArr2, i4, i3, intValue));
                return;
            }
            this.A0K.A02.execute(new C71583cL((Object) this, i3, (Object) bArr, intValue, 6));
        }
    }

    public void BhA(AnonymousClass3ZG r3) {
        Bh7(r3, (AnonymousClass5ZC) null, true);
    }

    @Deprecated
    public void BhB(AnonymousClass3ZG r2) {
        A03(r2, 1);
        A05(r2, "");
    }

    public void BhC(AnonymousClass3ZG r2, AnonymousClass5ZC r3) {
        Bh7(r2, r3, false);
    }

    public void BhD(AnonymousClass3ZG r3) {
        Bh7(r3, (AnonymousClass5ZC) null, false);
    }

    public void Bn6(int i) {
        synchronized (this) {
            this.A0O = i;
        }
    }

    public final void A01() {
        if (this.A04.A00() > this.A02.A04.A00.A05.A05.remaining() && !this.A02.A04.A00.A05()) {
            if (this.A02.A04.A05()) {
                this.A02.A03();
                this.A0J.A05();
                this.A04.A03((Integer) null);
            } else {
                A06("no space in buffer for more events");
                return;
            }
        }
        if (this.A04.A00() > this.A02.A00()) {
            Log.e("wamruntime/logPrivateStatsEventInternal: dropping event because it is larger than the buffer itself");
            return;
        }
        C56172rX r2 = this.A02;
        C55452qN r0 = this.A04;
        r2.A04(r0.A01, r0.A02);
        C26071bX r22 = this.A0J;
        r22.A0K = Long.valueOf(this.A02.A01());
        int i = (this.A00 + 1) % 10;
        this.A00 = i;
        if (i == 0) {
            r22.A05();
        }
        this.A02.A02();
    }

    public final void A02() {
        if (this.A05.A00() > this.A03.A04.A00.A05.A05.remaining() && !this.A03.A04.A00.A05()) {
            if (this.A03.A04.A05()) {
                this.A03.A03();
                this.A05.A03((Integer) null);
            } else {
                C26071bX r4 = this.A0J;
                Long l = r4.A0Q;
                Long A0T = AnonymousClass0x2.A0T();
                if (l == null) {
                    r4.A0Q = A0T;
                    l = A0T;
                }
                Long l2 = r4.A0R;
                if (l2 == null) {
                    r4.A0R = A0T;
                    l2 = A0T;
                }
                r4.A0Q = AnonymousClass0x7.A0j(l);
                r4.A0R = AnonymousClass0x9.A0n(l2.longValue(), (long) this.A05.A00());
                r4.A05();
                Log.w("wamruntime/logevent: no room for a new event record");
                return;
            }
        }
        if (this.A05.A00() > this.A03.A00()) {
            Log.e("wamruntime/logevent: dropping wam real time event because it is larger than the buffer itself");
            return;
        }
        C56172rX r2 = this.A03;
        C55452qN r0 = this.A05;
        r2.A04(r0.A01, r0.A02);
        C26071bX r22 = this.A0J;
        r22.A0L = Long.valueOf(this.A03.A01());
        int i = (this.A00 + 1) % 10;
        this.A00 = i;
        if (i == 0) {
            r22.A05();
        }
        this.A03.A02();
        ((C84544Ct) this.A08.get()).BlE(this.A03, false);
    }

    public final void A03(AnonymousClass3ZG r3, int i) {
        C71733ca r1;
        C72173dI r0;
        if (r3.bufferChannel != 2) {
            r1 = new C71733ca((Object) r3, (Object) this, i, 48);
            r0 = this.A0K.A01;
        } else {
            r1 = new C71733ca((Object) r3, (Object) this, i, 49);
            r0 = this.A0K.A02;
        }
        r0.execute(r1);
    }

    public final void A05(AnonymousClass3ZG r4, String str) {
        if (r4 instanceof WamCall) {
            StringBuilder A0o = AnonymousClass001.A0o();
            AnonymousClass001.A1K("wamruntime/printevent", str, ": ", A0o);
            C18260x0.A1L(A0o, r4.toString());
        }
    }

    public final void A06(String str) {
        C26071bX r4 = this.A0J;
        Long l = r4.A0O;
        Long A0T = AnonymousClass0x2.A0T();
        if (l == null) {
            r4.A0O = A0T;
            l = A0T;
        }
        Long l2 = r4.A0P;
        if (l2 == null) {
            r4.A0P = A0T;
            l2 = A0T;
        }
        r4.A0O = AnonymousClass0x7.A0j(l);
        r4.A0P = AnonymousClass0x9.A0n(l2.longValue(), (long) this.A04.A00());
        r4.A05();
        C18260x0.A0t("wamruntime/recordPrivateStatsDroppedEvent: ", str, AnonymousClass001.A0o());
    }

    public final void A07(CountDownLatch countDownLatch) {
        C72173dI r0;
        CountDownLatch countDownLatch2 = this.A0M;
        AnonymousClass2O6 r02 = this.A0K;
        if (countDownLatch == countDownLatch2) {
            r0 = r02.A02;
        } else {
            r0 = r02.A01;
        }
        r0.A01();
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("wamruntime: unexpected thread interrupt (");
            A0o.append(e);
            Log.a(AnonymousClass000.A0e(A0o));
            C18300x5.A11();
        }
    }

    public final void A08(boolean z, int i) {
        if (this.A06.A00() > this.A01.A04.A00.A05.A05.remaining() && !this.A01.A04.A00.A05()) {
            if (this.A01.A04.A05()) {
                this.A01.A03();
                C18270x1.A0l(C18270x1.A03(this.A0D), "wam_is_current_buffer_real_time", false);
                this.A06.A03((Integer) null);
            } else {
                this.A06.A00();
                C26071bX r4 = this.A0J;
                Long l = r4.A0M;
                Long A0T = AnonymousClass0x2.A0T();
                if (l == null) {
                    r4.A0M = A0T;
                    l = A0T;
                }
                Long l2 = r4.A0N;
                if (l2 == null) {
                    r4.A0N = A0T;
                    l2 = A0T;
                }
                r4.A0M = AnonymousClass0x7.A0j(l);
                r4.A0N = AnonymousClass0x9.A0n(l2.longValue(), (long) this.A06.A00());
                r4.A05();
                if (this.A0P) {
                    AnonymousClass66R r1 = this.A0F.A00;
                    SharedPreferences A0F2 = C18310x6.A0F(r1);
                    String valueOf = String.valueOf(i);
                    C18270x1.A0h(C18270x1.A04(r1), valueOf, C18280x3.A02(A0F2, valueOf) + 1);
                }
                Log.w("wamruntime/recordDroppedEvent");
                return;
            }
        }
        if (this.A06.A00() > this.A01.A00()) {
            Log.e("wamruntime/logevent: dropping event because it is larger than the buffer itself");
            return;
        }
        C56172rX r2 = this.A01;
        C55452qN r0 = this.A06;
        r2.A04(r0.A01, r0.A02);
        C26071bX r12 = this.A0J;
        r12.A0J = Long.valueOf(this.A01.A01());
        int i2 = (this.A00 + 1) % 10;
        this.A00 = i2;
        if (i2 == 0) {
            r12.A05();
        }
        if (this.A01.A04.A00.A00() == 1 && !z) {
            Log.d("WamRuntime/maybeLogWamClientErrors");
            if (!this.A01.A01) {
                r12.A0D = Boolean.TRUE;
            }
            if (!r12.A06()) {
                A04(r12, 0, true);
            }
            if (this.A0P) {
                AnonymousClass2GQ r13 = this.A0F;
                AnonymousClass66R r5 = r13.A00;
                List<AnonymousClass3ZG> A012 = C829345m.A01(new C72623e1(C827544u.A00, C829345m.A04(C827444t.A00, new C72623e1(new AnonymousClass42L(r13), C73723fy.A0R(C18310x6.A0F(r5).getAll().keySet())))));
                C18270x1.A0m(C18310x6.A0F(r5));
                for (AnonymousClass3ZG A042 : A012) {
                    A04(A042, 0, true);
                }
            }
        }
    }

    public final boolean A09() {
        if (!this.A09) {
            A07(this.A0L);
            this.A0I.A00(0);
            this.A09 = true;
        }
        return this.A01.A01;
    }

    public final boolean A0A() {
        if (!this.A0A) {
            A07(this.A0M);
            this.A0I.A00(2);
            this.A0A = true;
        }
        return this.A02.A01;
    }

    public final boolean A0B() {
        if (!this.A0B) {
            A07(this.A0N);
            this.A0I.A00(1);
            this.A0B = true;
        }
        return this.A03.A01;
    }

    public void BFx(Context context, C40502Gq r6, AnonymousClass2L6 r7, C183538qC r8, C183538qC r9, int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3) {
        this.A08 = r8;
        this.A07 = r9;
        this.A0S = z2;
        this.A0P = z3;
        this.A0O = i4;
        this.A0H.A02 = this;
        AnonymousClass1VX r1 = this.A0E;
        synchronized (r1) {
            r1.A02 = this;
        }
        this.A0K.A00.execute(new AnonymousClass3Zr(context, this));
        C66693Mk r3 = this.A0I;
        r3.A02.A00.execute(new C71343bx(r3, 44, r6));
    }

    public void BKX() {
        this.A0K.A01.execute(new C69993Zl(this, 23));
    }

    public void Bh7(AnonymousClass3ZG r4, AnonymousClass5ZC r5, boolean z) {
        String str;
        int i = r4.code;
        if (r5 == null) {
            r5 = r4.samplingRate;
        }
        Integer A002 = A00(r5, i, z);
        if (A002 != null) {
            A03(r4, A002.intValue());
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("(sampled with weight ");
            A0o.append(A002);
            str = AnonymousClass000.A0e(A0o);
        } else {
            str = "(dropped)";
        }
        A05(r4, str);
    }

    public void Bpp() {
        C69993Zl r1 = new C69993Zl(this, 24);
        AnonymousClass2O6 r2 = this.A0K;
        r2.A01.execute(r1);
        r2.A02.execute(new C69993Zl(this, 25));
    }

    public C66723Mn(C380625j r3, AnonymousClass33p r4, AnonymousClass1VX r5, AnonymousClass2GQ r6, AnonymousClass2YD r7, C56092rP r8, C66693Mk r9, C26071bX r10, AnonymousClass2O6 r11) {
        this.A0E = r5;
        this.A0H = r8;
        this.A0K = r11;
        this.A0J = r10;
        this.A0I = r9;
        this.A0D = r4;
        this.A0G = r7;
        this.A0F = r6;
        this.A0C = r3;
        this.A0S = false;
        this.A0Q = false;
        this.A0R = false;
    }

    public final void A04(AnonymousClass3ZG r3, int i, boolean z) {
        if (A09()) {
            this.A06.A02(r3, i);
            this.A06.A03((Integer) null);
            A08(z, r3.code);
            C26071bX r0 = this.A0J;
            if (r3 == r0) {
                r0.A0M = null;
                r0.A0N = null;
                r0.A00 = null;
                r0.A0O = null;
                r0.A0P = null;
                r0.A0Q = null;
                r0.A0R = null;
                r0.A01 = null;
                r0.A02 = null;
                r0.A03 = null;
                r0.A04 = null;
                r0.A05 = null;
                r0.A06 = null;
                r0.A07 = null;
                r0.A08 = null;
                r0.A09 = null;
                r0.A0A = null;
                r0.A0B = null;
                r0.A0C = null;
                r0.A0D = null;
                r0.A0E = null;
                r0.A0F = null;
                r0.A0G = null;
                r0.A0H = null;
                r0.A0I = null;
                r0.A05();
            }
            if (!z) {
                this.A01.A02();
            }
        }
    }

    public boolean BIV() {
        return this.A0S;
    }

    public void BYU() {
    }

    public void BhE(AnonymousClass3ZG r3, int i) {
        A03(r3, i);
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("(with weight=");
        A0o.append(i);
        A05(r3, AnonymousClass000.A0e(A0o));
    }

    public void BlF(boolean z) {
        int nextInt;
        C18260x0.A1D("wamruntime/send/force=", AnonymousClass001.A0o(), z);
        C71703cX r1 = new C71703cX(35, (Object) this, z);
        AnonymousClass2O6 r2 = this.A0K;
        r2.A01.execute(r1);
        if (this.A0O <= 0 || (nextInt = AnonymousClass0x9.A1C().nextInt(this.A0O) + 5) <= 0) {
            r2.A02.execute(new C71703cX(36, (Object) this, z));
            return;
        }
        r2.A02.A04(new C117655sH(this, nextInt, 1, z), (long) (nextInt * 1000));
    }
}
