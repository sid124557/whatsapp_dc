package X;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import com.facebook.android.exoplayer2.Timeline;
import com.facebook.android.exoplayer2.util.Util;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.81Q  reason: invalid class name */
public final class AnonymousClass81Q implements C187408xA, Handler.Callback, C180198ke {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public long A05 = -9223372036854775807L;
    public long A06;
    public AnonymousClass7F1 A07;
    public C148507Iq A08;
    public C160477nh A09;
    public C187398x9 A0A;
    public C158037jK A0B;
    public C185778uE A0C;
    public C142576xQ A0D = C142576xQ.UNKNOWN;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public C187398x9[] A0S;
    public final long A0T;
    public final long A0U;
    public final Handler A0V;
    public final HandlerThread A0W;
    public final C1676681z A0X;
    public final C153737br A0Y;
    public final AnonymousClass7TG A0Z;
    public final C186328v7 A0a;
    public final C153657bj A0b;
    public final C151817Wk A0c;
    public final C1672580j A0d;
    public final AnonymousClass7FC A0e;
    public final AnonymousClass7NU A0f;
    public final C177658gE A0g;
    public final C186588vc A0h;
    public final AnonymousClass820 A0i;
    public final C160207nD A0j;
    public final AnonymousClass821 A0k;
    public final ArrayList A0l;
    public final boolean A0m;
    public final boolean A0n;
    public final boolean A0o;
    public final boolean A0p;
    public final boolean A0q;
    public final C187398x9[] A0r;
    public final C184688sM[] A0s;

    public static final void A00(C153097af r4) {
        synchronized (r4) {
        }
        try {
            r4.A09.BF2(r4.A01, r4.A04);
        } finally {
            r4.A03(true);
        }
    }

    public final int A01(Timeline timeline, Timeline timeline2, int i) {
        Timeline timeline3 = timeline;
        int i2 = i;
        int A002 = timeline.A00();
        int i3 = -1;
        for (int i4 = 0; i4 < A002 && i3 == -1; i4++) {
            C151817Wk r5 = this.A0c;
            i2 = timeline3.A03(r5, this.A0d, i2, this.A03, this.A0R);
            if (i2 == -1) {
                break;
            }
            i3 = timeline2.A04(timeline.A08(r5, i2, true).A04);
        }
        return i3;
    }

    public final void A08() {
        this.A0N = false;
        AnonymousClass820 r2 = this.A0X.A03;
        if (!r2.A03) {
            r2.A00 = SystemClock.elapsedRealtime();
            r2.A03 = true;
        }
        AnonymousClass820 r22 = this.A0i;
        if (!r22.A03) {
            r22.A00 = SystemClock.elapsedRealtime();
            r22.A03 = true;
        }
        if (this.A0q) {
            AnonymousClass821 r23 = this.A0k;
            synchronized (r23) {
                if (!r23.A03) {
                    r23.A00 = SystemClock.elapsedRealtime();
                    r23.A03 = true;
                }
            }
        }
        for (C187398x9 r1 : this.A0S) {
            C1673180p r12 = (C1673180p) r1;
            C159197lM.A02(AnonymousClass001.A1T(r12.A01));
            r12.A01 = 2;
            r12.A08();
        }
    }

    public final void A0K(boolean z) {
        AnonymousClass7Z2 r4 = this.A0b.A05.A02.A04;
        long A032 = A03(r4, this.A09.A0D, false, true);
        if (A032 != this.A09.A0D) {
            C160477nh r5 = this.A09;
            this.A09 = r5.A01(r4, A032, r5.A01);
            if (z) {
                this.A0Z.A00(5);
            }
        }
    }

    public final void A0M(boolean z, boolean z2) {
        A0N(true, z, z);
        this.A0Z.A01 += this.A02 + (z2 ? 1 : 0);
        this.A02 = 0;
        this.A0a.Bcs();
        A0C(1);
    }

    public long A02() {
        long j;
        C152757a4 r5 = this.A0b.A04;
        if (r5 != null) {
            C185238tJ[] r7 = r5.A0D;
            long j2 = Long.MAX_VALUE;
            for (C185238tJ r2 : r7) {
                if (r2 instanceof AnonymousClass81Z) {
                    AnonymousClass81Z r22 = (AnonymousClass81Z) r2;
                    AnonymousClass7XN r23 = r22.A01.A0K[r22.A00].A09;
                    synchronized (r23) {
                        if (r23.A02 == 0) {
                            j = Long.MIN_VALUE;
                        } else {
                            j = r23.A0E[r23.A04];
                        }
                    }
                    j2 = Math.min(j2, j);
                }
            }
            if (!(j2 == Long.MAX_VALUE || j2 == -9223372036854775807L)) {
                return r5.A08.B4w(j2);
            }
        }
        return 0;
    }

    public final long A03(AnonymousClass7Z2 r18, long j, boolean z, boolean z2) {
        long[] jArr;
        int length;
        long j2 = j;
        A09();
        this.A0N = false;
        A0C(2);
        C153657bj r7 = this.A0b;
        C152757a4 r5 = r7.A05;
        C152757a4 r6 = r5;
        while (true) {
            if (r6 == null) {
                break;
            }
            AnonymousClass7Z2 r3 = r6.A02.A04;
            if (r18.equals(r3) && r6.A07) {
                Timeline timeline = this.A09.A03;
                int i = r3.A02;
                C151817Wk r0 = this.A0c;
                timeline.A08(r0, i, false);
                C156497gj r12 = r0.A03;
                int i2 = 0;
                while (true) {
                    jArr = r12.A01;
                    length = jArr.length;
                    if (i2 >= length) {
                        break;
                    }
                    long j3 = jArr[i2];
                    if (j3 == Long.MIN_VALUE || j < j3) {
                        break;
                    }
                    i2++;
                }
                if (i2 >= length || i2 == -1 || jArr[i2] == r6.A02.A02) {
                    r7.A08(r6);
                }
            }
            r6 = r7.A00();
        }
        r7.A08(r6);
        if (r5 != r6 || z2) {
            for (C187398x9 A0I2 : this.A0S) {
                A0I(A0I2);
            }
            this.A0S = new C187398x9[0];
            r5 = null;
        }
        if (r6 != null) {
            A0F(r5);
            if (r6.A06) {
                C187418xB r72 = r6.A08;
                j2 = r72.Bl6(j2, z);
                r72.B1k(j2 - this.A0T, this.A0n);
            }
            A0D(j2);
            A0J(this.A0E);
        } else {
            r7.A06(true);
            A0D(j2);
        }
        this.A0j.A00.sendEmptyMessage(2);
        return j2;
    }

    public final Pair A04(C148507Iq r15, boolean z) {
        int A012;
        Timeline timeline = this.A09.A03;
        Timeline timeline2 = r15.A02;
        if (!AnonymousClass000.A1T(timeline.A01())) {
            if (AnonymousClass000.A1T(timeline2.A01())) {
                timeline2 = timeline;
            }
            try {
                C1672580j r8 = this.A0d;
                C151817Wk r7 = this.A0c;
                Pair A072 = timeline2.A07(r7, r8, r15.A00, r15.A01, 0);
                A072.getClass();
                if (timeline == timeline2) {
                    return A072;
                }
                int A042 = timeline.A04(timeline2.A08(r7, C18280x3.A03(A072), true).A04);
                if (A042 != -1) {
                    return Pair.create(Integer.valueOf(A042), A072.second);
                }
                if (z && (A012 = A01(timeline2, timeline, C18280x3.A03(A072))) != -1) {
                    return A05(timeline, timeline.A08(r7, A012, false).A00);
                }
            } catch (IndexOutOfBoundsException unused) {
                throw new C144036zu(timeline, r15.A00, r15.A01);
            }
        }
        return null;
    }

    public final Pair A05(Timeline timeline, int i) {
        Timeline timeline2 = timeline;
        Pair A072 = timeline2.A07(this.A0c, this.A0d, i, -9223372036854775807L, 0);
        A072.getClass();
        return A072;
    }

    public final void A06() {
        int i;
        AnonymousClass7TG r5 = this.A0Z;
        C160477nh r4 = this.A09;
        if (r4 != r5.A02 || r5.A01 > 0 || r5.A03) {
            Handler handler = this.A0V;
            int i2 = r5.A01;
            if (r5.A03) {
                i = r5.A00;
            } else {
                i = -1;
            }
            handler.obtainMessage(0, i2, i, r4).sendToTarget();
            r5.A02 = this.A09;
            r5.A01 = 0;
            r5.A03 = false;
        }
    }

    public final void A07() {
        C153657bj r0 = this.A0b;
        C152757a4 r4 = r0.A04;
        C152757a4 r1 = r0.A06;
        if (r4 != null && !r4.A07) {
            if (r1 == null || r1.A01 == r4) {
                C187398x9[] r3 = this.A0S;
                int length = r3.length;
                int i = 0;
                while (i < length) {
                    if (r3[i].BFS()) {
                        i++;
                    } else {
                        return;
                    }
                }
                r4.A08.BL2();
            }
        }
    }

    public final void A09() {
        this.A0X.A03.A00();
        this.A0i.A00();
        if (this.A0q) {
            this.A0k.A00();
        }
        for (C187398x9 r2 : this.A0S) {
            C1673180p r22 = (C1673180p) r2;
            if (r22.A01 == 2) {
                r22.A01 = 1;
                r22.A09();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x005a, code lost:
        if (r3 == Long.MIN_VALUE) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00f4, code lost:
        if (r10 == null) goto L_0x011f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00f8, code lost:
        if (r10.A02 == null) goto L_0x011f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00fc, code lost:
        if (r10.A00 != r7) goto L_0x011f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00fe, code lost:
        r0 = r10.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0102, code lost:
        if (r0 <= r2) goto L_0x011f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0106, code lost:
        if (r0 > r4) goto L_0x011f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0108, code lost:
        A0H(r10.A03);
        r1 = r13.A01;
        r8.remove(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0116, code lost:
        if (r1 >= r8.size()) goto L_0x011f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0118, code lost:
        r10 = (X.AnonymousClass8LV) r8.get(r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0A() {
        /*
            r13 = this;
            X.7bj r0 = r13.A0b
            X.7a4 r6 = r0.A05
            if (r6 == 0) goto L_0x004f
            X.8xB r0 = r6.A08
            long r9 = r0.BiL()
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0061
            r13.A0D(r9)
            X.7nh r0 = r13.A09
            long r1 = r0.A0D
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0032
            X.7nh r7 = r13.A09
            X.7Z2 r8 = r7.A04
            long r11 = r7.A01
            X.7nh r0 = r7.A01(r8, r9, r11)
            r13.A09 = r0
            X.7TG r1 = r13.A0Z
            r0 = 5
            r1.A00(r0)
        L_0x0032:
            X.7nh r5 = r13.A09
            X.8x9[] r0 = r13.A0S
            int r0 = r0.length
            if (r0 == 0) goto L_0x005c
            boolean r0 = r6.A07
            if (r0 != 0) goto L_0x0050
            X.7Or r0 = r6.A02
            long r3 = r0.A03
        L_0x0041:
            r5.A0C = r3
            X.7nh r3 = r13.A09
            long r1 = r3.A0D
            X.8xB r0 = r6.A08
            long r0 = r0.B4w(r1)
            r3.A0B = r0
        L_0x004f:
            return
        L_0x0050:
            X.8xB r0 = r6.A08
            long r3 = r0.B4y()
            r1 = -9223372036854775808
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0041
        L_0x005c:
            X.7Or r0 = r6.A02
            long r3 = r0.A01
            goto L_0x0041
        L_0x0061:
            X.81z r1 = r13.A0X
            X.8x9 r0 = r1.A00
            if (r0 == 0) goto L_0x00ca
            boolean r0 = r0.BHW()
            if (r0 != 0) goto L_0x00ca
            X.8x9 r0 = r1.A00
            boolean r0 = r0.BIe()
            if (r0 != 0) goto L_0x007d
            X.8x9 r0 = r1.A00
            boolean r0 = r0.BFS()
            if (r0 != 0) goto L_0x00ca
        L_0x007d:
            r1.A00()
            X.8sW r0 = r1.A01
            long r4 = r0.BBa()
        L_0x0086:
            r13.A06 = r4
            long r0 = r6.A00
            long r4 = r4 - r0
            X.7nh r0 = r13.A09
            long r2 = r0.A0D
            java.util.ArrayList r8 = r13.A0l
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L_0x011f
            X.7nh r7 = r13.A09
            X.7Z2 r9 = r7.A04
            int r1 = r9.A00
            r0 = -1
            if (r1 != r0) goto L_0x011f
            long r0 = r7.A02
            int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r7 != 0) goto L_0x00a9
            r0 = 1
            long r2 = r2 - r0
        L_0x00a9:
            int r7 = r9.A02
            int r11 = r13.A01
        L_0x00ad:
            if (r11 <= 0) goto L_0x00d1
            int r0 = r11 + -1
            java.lang.Object r1 = r8.get(r0)
            X.8LV r1 = (X.AnonymousClass8LV) r1
            if (r1 == 0) goto L_0x00d1
            int r0 = r1.A00
            if (r0 > r7) goto L_0x00c5
            if (r0 != r7) goto L_0x00d1
            long r0 = r1.A01
            int r9 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r9 <= 0) goto L_0x00d1
        L_0x00c5:
            int r11 = r11 + -1
            r13.A01 = r11
            goto L_0x00ad
        L_0x00ca:
            X.820 r0 = r1.A03
            long r4 = r0.BBa()
            goto L_0x0086
        L_0x00d1:
            int r0 = r8.size()
            if (r11 >= r0) goto L_0x011f
            java.lang.Object r10 = r8.get(r11)
            X.8LV r10 = (X.AnonymousClass8LV) r10
            if (r10 == 0) goto L_0x011f
            java.lang.Object r0 = r10.A02
            if (r0 == 0) goto L_0x00f6
            int r0 = r10.A00
            if (r0 < r7) goto L_0x00ef
            if (r0 != r7) goto L_0x00f6
            long r0 = r10.A01
            int r9 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r9 > 0) goto L_0x00f6
        L_0x00ef:
            int r11 = r11 + 1
            r13.A01 = r11
            goto L_0x00d1
        L_0x00f4:
            if (r10 == 0) goto L_0x011f
        L_0x00f6:
            java.lang.Object r0 = r10.A02
            if (r0 == 0) goto L_0x011f
            int r0 = r10.A00
            if (r0 != r7) goto L_0x011f
            long r0 = r10.A01
            int r9 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r9 <= 0) goto L_0x011f
            int r9 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r9 > 0) goto L_0x011f
            X.7af r0 = r10.A03
            r13.A0H(r0)
            int r1 = r13.A01
            r8.remove(r1)
            int r0 = r8.size()
            if (r1 >= r0) goto L_0x011f
            java.lang.Object r10 = r8.get(r1)
            X.8LV r10 = (X.AnonymousClass8LV) r10
            goto L_0x00f4
        L_0x011f:
            X.7nh r0 = r13.A09
            r0.A0D = r4
            goto L_0x0032
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass81Q.A0A():void");
    }

    public final void A0B(byte b, boolean z) {
        C152757a4 r1 = this.A0b.A04;
        if (r1 != null && this.A0Q) {
            r1.A08.Brk(b, z);
        }
    }

    public final void A0C(int i) {
        long j;
        C160477nh r1 = this.A09;
        int i2 = i;
        if (r1.A00 != i2) {
            Timeline timeline = r1.A03;
            Object obj = r1.A08;
            C160477nh r2 = new C160477nh(timeline, r1.A04, r1.A05, r1.A06, r1.A07, obj, i2, r1.A02, r1.A01, r1.A0A, r1.A09);
            C160477nh.A00(r1, r2);
            this.A09 = r2;
            if (i2 == 2) {
                j = System.currentTimeMillis();
            } else {
                j = -1;
            }
            this.A04 = j;
        }
    }

    public final void A0D(long j) {
        long j2;
        C152757a4 r1 = this.A0b.A05;
        if (!AnonymousClass000.A1W(r1)) {
            j2 = (long) 0;
        } else {
            j2 = r1.A00;
        }
        long j3 = j + j2;
        this.A06 = j3;
        this.A0X.A03.A01(j3);
        for (C187398x9 r3 : this.A0S) {
            long j4 = this.A06;
            C1673180p r32 = (C1673180p) r3;
            r32.A08 = false;
            r32.A02 = j4;
            r32.A0C(j4, false);
        }
    }

    public final void A0E(AnonymousClass7F1 r22, boolean z) {
        long j;
        AnonymousClass7TG r5 = this.A0Z;
        boolean z2 = true;
        r5.A01++;
        AnonymousClass7F1 r6 = r22;
        AnonymousClass7Z2 r14 = r6.A01;
        long j2 = r6.A00;
        boolean A1T = AnonymousClass000.A1T((j2 > -9223372036854775807L ? 1 : (j2 == -9223372036854775807L ? 0 : -1)));
        try {
            if (this.A0C == null || this.A02 > 0) {
                this.A07 = r6;
                this.A08 = null;
            } else {
                C153657bj r8 = this.A0b;
                C152757a4 r3 = r8.A05;
                boolean z3 = z;
                if (z || r3 == null || j2 == 0) {
                    j = j2;
                } else {
                    j = r3.A08.B4F(this.A0B, j2);
                }
                if (Util.A05(j) != Util.A05(this.A09.A0D)) {
                    j2 = A03(r14, j, z3, C18300x5.A1W(r8.A05, r8.A06));
                    if (j2 == j2) {
                        z2 = false;
                    }
                    A1T |= z2;
                }
            }
        } finally {
            this.A09 = this.A09.A01(r14, j2, j2);
            if (A1T) {
                r5.A00(2);
            }
        }
    }

    public final void A0F(C152757a4 r10) {
        C152757a4 r6 = this.A0b.A05;
        if (r6 != null && r10 != r6) {
            C187398x9[] r8 = this.A0r;
            int length = r8.length;
            boolean[] zArr = new boolean[length];
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                C187398x9 r2 = r8[i2];
                zArr[i2] = AnonymousClass000.A1S(((C1673180p) r2).A01);
                C157937jA[] r1 = r6.A05.A03;
                if (r1[i2] != null) {
                    i++;
                }
                if (zArr[i2]) {
                    if (r1[i2] != null) {
                        C1673180p r12 = (C1673180p) r2;
                        if (r12.A08) {
                            if (r12.A06 != r10.A0D[i2]) {
                            }
                        }
                    }
                    A0I(r2);
                }
            }
            this.A09 = this.A09.A02(r6.A03, r6.A05);
            A0O(zArr, i);
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:4:0x0010 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0015  */
    public void A0G(X.C158167jX r4) {
        /*
            r3 = this;
            android.os.Handler r1 = r3.A0V
            r0 = 1
            X.C18290x4.A1C(r1, r4, r0)
            X.7bj r0 = r3.A0b
            X.7a4 r2 = r0.A05
            if (r2 != 0) goto L_0x0011
            X.7a4 r2 = r0.A04
        L_0x000e:
            if (r2 != 0) goto L_0x0011
            return
        L_0x0011:
            X.7NU r0 = r2.A05
            if (r0 == 0) goto L_0x001e
            X.8xC[] r0 = r0.A04
            int r1 = r0.length
            r0 = 0
        L_0x0019:
            if (r0 >= r1) goto L_0x001e
            int r0 = r0 + 1
            goto L_0x0019
        L_0x001e:
            X.7a4 r2 = r2.A01
            goto L_0x000e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass81Q.A0G(X.7jX):void");
    }

    public final void A0H(C153097af r5) {
        Looper looper = r5.A03;
        C160207nD r1 = this.A0j;
        Handler handler = r1.A00;
        if (looper == handler.getLooper()) {
            A00(r5);
            int i = this.A09.A00;
            if (i == 3 || i == 2) {
                handler.sendEmptyMessage(2);
                return;
            }
            return;
        }
        C150717Rx.A00(r1, r5, 15);
    }

    public final void A0I(C187398x9 r4) {
        C1676681z r1 = this.A0X;
        if (r4 == r1.A00) {
            r1.A01 = null;
            r1.A00 = null;
        }
        C1673180p r42 = (C1673180p) r4;
        if (r42.A01 == 2) {
            r42.A01 = 1;
            r42.A09();
        }
        C159197lM.A02(AnonymousClass001.A1T(r42.A01));
        r42.A0C.A00 = null;
        r42.A01 = 0;
        r42.A06 = null;
        r42.A0A = null;
        r42.A08 = false;
        r42.A0B();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0038, code lost:
        if (r16 != false) goto L_0x003a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0J(boolean r16) {
        /*
            r15 = this;
            X.7bj r4 = r15.A0b
            X.7a4 r6 = r4.A04
            boolean r0 = r6.A07
            if (r0 != 0) goto L_0x00aa
            r2 = 0
        L_0x000a:
            r8 = -9223372036854775808
            r7 = 0
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 != 0) goto L_0x0015
            r15.A0L(r7)
        L_0x0014:
            return
        L_0x0015:
            long r12 = r15.A06
            long r0 = r6.A00
            long r12 = r12 - r0
            boolean r0 = r15.A0p
            if (r0 == 0) goto L_0x008b
            X.7a4 r0 = r4.A05
            if (r6 == r0) goto L_0x008b
            if (r0 == 0) goto L_0x008b
            long r10 = r15.A02()
        L_0x0028:
            X.8v7 r8 = r15.A0a
            X.81z r0 = r15.A0X
            X.7jX r0 = r0.BBQ()
            float r9 = r0.A01
            boolean r1 = r15.A0L
            r0 = 1
            if (r1 != 0) goto L_0x003a
            r14 = 0
            if (r16 == 0) goto L_0x003b
        L_0x003a:
            r14 = 1
        L_0x003b:
            boolean r4 = r8.Bo6(r9, r10, r12, r14)
            boolean r1 = r15.A0P
            if (r1 == 0) goto L_0x0076
            boolean r1 = r15.A0L
            if (r1 == 0) goto L_0x0076
            boolean r1 = r15.A0N
            if (r1 == 0) goto L_0x0076
            if (r4 != 0) goto L_0x0076
            X.7nh r1 = r15.A09
            int r5 = r1.A00
            r1 = 2
            if (r5 != r1) goto L_0x0076
            java.lang.Object[] r5 = X.AnonymousClass0x9.A1X()
            r8 = 1000(0x3e8, double:4.94E-321)
            long r12 = r12 / r8
            X.AnonymousClass000.A1Q(r5, r7, r12)
            long r10 = r10 / r8
            X.AnonymousClass000.A1Q(r5, r0, r10)
            long r2 = r2 / r8
            X.AnonymousClass000.A1Q(r5, r1, r2)
            java.lang.String r1 = "PlaybackPositionMs: %d, bufferedDurationMs: %d, nextLoadPositionMs: %d"
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r2 = java.lang.String.format(r0, r1, r5)
            android.os.Handler r1 = r15.A0V
            r0 = 5
            X.C18290x4.A1C(r1, r2, r0)
            r15.A0P = r7
        L_0x0076:
            r15.A0L(r4)
            if (r4 == 0) goto L_0x0014
            long r3 = r15.A06
            long r0 = r6.A00
            long r3 = r3 - r0
            X.8xB r2 = r6.A08
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r2.Aze(r3, r0)
            return
        L_0x008b:
            X.8xB r0 = r6.A08
            long r10 = r0.B4w(r12)
            boolean r0 = r15.A0K
            if (r0 == 0) goto L_0x0028
            X.7a4 r8 = r4.A05
        L_0x0097:
            if (r8 == 0) goto L_0x0028
            if (r8 == r6) goto L_0x0028
            long r0 = r15.A06
            long r4 = r8.A00
            long r0 = r0 - r4
            X.8xB r4 = r8.A08
            long r0 = r4.B4w(r0)
            long r10 = r10 + r0
            X.7a4 r8 = r8.A01
            goto L_0x0097
        L_0x00aa:
            X.8xB r0 = r6.A08
            long r2 = r0.BA0()
            goto L_0x000a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass81Q.A0J(boolean):void");
    }

    public final void A0L(boolean z) {
        C160477nh r0 = this.A09;
        boolean z2 = z;
        if (r0.A0A != z2) {
            Timeline timeline = r0.A03;
            Object obj = r0.A08;
            AnonymousClass7Z2 r4 = r0.A04;
            long j = r0.A02;
            long j2 = r0.A01;
            C160477nh r2 = new C160477nh(timeline, r4, r0.A05, r0.A06, r0.A07, obj, r0.A00, j, j2, z2, r0.A09);
            C160477nh.A00(r0, r2);
            this.A09 = r2;
        }
    }

    public final void A0N(boolean z, boolean z2, boolean z3) {
        Object obj;
        Timeline timeline;
        AnonymousClass7Z2 r8;
        long j;
        long j2;
        C166607yy r9;
        AnonymousClass7NU r10;
        C185778uE r1;
        int i;
        this.A0j.A00.removeMessages(2);
        this.A0N = false;
        this.A0X.A03.A00();
        this.A0i.A00();
        if (this.A0q) {
            this.A0k.A00();
        }
        this.A06 = 0;
        for (C187398x9 A0I2 : this.A0S) {
            try {
                A0I(A0I2);
            } catch (AnonymousClass6JW | RuntimeException e) {
                Log.e("ExoPlayerImplInternal", "Stop failed.", e);
            }
        }
        this.A0S = new C187398x9[0];
        C153657bj r2 = this.A0b;
        r2.A06(!z2);
        A0L(false);
        if (z2) {
            this.A08 = null;
        }
        if (z3) {
            timeline = Timeline.A00;
            r2.A07 = timeline;
            ArrayList arrayList = this.A0l;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((AnonymousClass8LV) it.next()).A03.A03(false);
            }
            arrayList.clear();
            this.A01 = 0;
            obj = null;
        } else {
            C160477nh r12 = this.A09;
            timeline = r12.A03;
            obj = r12.A08;
        }
        C160477nh r13 = this.A09;
        if (z2) {
            Timeline timeline2 = r13.A03;
            if (AnonymousClass000.A1T(timeline2.A01())) {
                i = 0;
            } else {
                i = timeline2.A09(this.A0d, timeline2.A05(this.A0R), 0).A00;
            }
            r8 = new AnonymousClass7Z2(i, -1, -1, -1);
            j2 = -9223372036854775807L;
            j = -9223372036854775807L;
        } else {
            r8 = r13.A04;
            j = r13.A0D;
            j2 = this.A09.A01;
        }
        C160477nh r4 = this.A09;
        int i2 = r4.A00;
        if (z3) {
            r9 = C166607yy.A03;
            r10 = this.A0f;
        } else {
            r9 = r4.A05;
            r10 = r4.A06;
        }
        this.A09 = new C160477nh(timeline, r8, r9, r10, C142576xQ.UNKNOWN, obj, i2, j, j2, false, false);
        if (z && (r1 = this.A0C) != null) {
            r1.Bix(this);
            this.A0C = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0068, code lost:
        if (r11.A09.A00 != 3) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006f, code lost:
        if (r18 == false) goto L_0x0071;
     */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00cd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0O(boolean[] r22, int r23) {
        /*
            r21 = this;
            r0 = r23
            X.8x9[] r0 = new X.C187398x9[r0]
            r11 = r21
            r11.A0S = r0
            X.7bj r10 = r11.A0b
            X.7a4 r0 = r10.A05
            r20 = r0
            r9 = 0
            r2 = 0
        L_0x0010:
            X.8x9[] r1 = r11.A0r
            int r0 = r1.length
            if (r9 >= r0) goto L_0x0100
            r0 = r20
            X.7NU r0 = r0.A05
            X.7jA[] r0 = r0.A03
            r0 = r0[r9]
            if (r0 == 0) goto L_0x00de
            boolean r5 = r22[r9]
            int r19 = r2 + 1
            X.7a4 r13 = r10.A05
            r8 = r1[r9]
            X.8x9[] r0 = r11.A0S
            r0[r2] = r8
            r7 = r8
            X.80p r7 = (X.C1673180p) r7
            int r0 = r7.A01
            if (r0 != 0) goto L_0x00dc
            X.7a4 r0 = r10.A06
            boolean r16 = X.AnonymousClass000.A1Y(r0, r13)
            X.7NU r2 = r13.A05
            X.7jA[] r1 = r2.A03
            r15 = r1[r9]
            X.8xC[] r1 = r2.A04
            r4 = r1[r9]
            r3 = 0
            if (r4 == 0) goto L_0x005b
            r1 = r4
            X.81g r1 = (X.C1674881g) r1
            int[] r1 = r1.A03
            int r2 = r1.length
        L_0x004b:
            X.7z1[] r14 = new X.C166637z1[r2]
        L_0x004d:
            if (r3 >= r2) goto L_0x005d
            r1 = r4
            X.81g r1 = (X.C1674881g) r1
            X.7z1[] r1 = r1.A04
            r1 = r1[r3]
            r14[r3] = r1
            int r3 = r3 + 1
            goto L_0x004d
        L_0x005b:
            r2 = 0
            goto L_0x004b
        L_0x005d:
            boolean r1 = r11.A0L
            if (r1 == 0) goto L_0x006a
            X.7nh r1 = r11.A09
            int r2 = r1.A00
            r1 = 3
            r18 = 1
            if (r2 == r1) goto L_0x006c
        L_0x006a:
            r18 = 0
        L_0x006c:
            if (r5 != 0) goto L_0x0071
            r6 = 1
            if (r18 != 0) goto L_0x0072
        L_0x0071:
            r6 = 0
        L_0x0072:
            X.8tJ[] r1 = r13.A0D
            r12 = r1[r9]
            long r4 = r11.A06
            boolean r1 = r11.A0H
            if (r1 != 0) goto L_0x00ea
            long r2 = r0.A00
        L_0x007e:
            long r0 = r13.A00
            r13 = 1
            r7.A04 = r15
            r7.A01 = r13
            r13 = r16
            r7.A0D(r6, r13)
            boolean r13 = r7.A08
            r13 = r13 ^ 1
            X.C159197lM.A02(r13)
            r7.A06 = r12
            long r12 = r7.A02
            r16 = -9223372036854775808
            int r15 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r15 != 0) goto L_0x009d
            r7.A02 = r2
        L_0x009d:
            r7.A0A = r14
            r7.A03 = r0
            r7.A0A(r0)
            r0 = 0
            r7.A08 = r0
            r7.A02 = r4
            r7.A0C(r4, r6)
            X.81z r2 = r11.A0X
            boolean r0 = r8 instanceof X.AnonymousClass6JR
            if (r0 == 0) goto L_0x00e2
            r1 = r8
            X.6JR r1 = (X.AnonymousClass6JR) r1
        L_0x00b5:
            if (r1 == 0) goto L_0x00cb
            X.8sW r0 = r2.A01
            if (r1 == r0) goto L_0x00cb
            if (r0 != 0) goto L_0x00f2
            r2.A01 = r1
            r2.A00 = r8
            X.820 r0 = r2.A03
            X.7jX r0 = r0.A02
            r1.Bmx(r0)
            r2.A00()
        L_0x00cb:
            if (r18 == 0) goto L_0x00dc
            int r0 = r7.A01
            boolean r0 = X.AnonymousClass6C9.A1M(r0)
            X.C159197lM.A02(r0)
            r0 = 2
            r7.A01 = r0
            r7.A08()
        L_0x00dc:
            r2 = r19
        L_0x00de:
            int r9 = r9 + 1
            goto L_0x0010
        L_0x00e2:
            boolean r0 = r8 instanceof X.C125866Ju
            if (r0 == 0) goto L_0x00cb
            r1 = r8
            X.6Ju r1 = (X.C125866Ju) r1
            goto L_0x00b5
        L_0x00ea:
            X.7Or r1 = r0.A02
            long r2 = r1.A03
            long r0 = r0.A00
            long r2 = r2 + r0
            goto L_0x007e
        L_0x00f2:
            java.lang.String r0 = "Multiple renderer media clocks enabled."
            java.lang.IllegalStateException r2 = X.AnonymousClass001.A0e(r0)
            r1 = 2
            r0 = 1000(0x3e8, float:1.401E-42)
            X.6JW r0 = X.AnonymousClass6JW.A00(r2, r1, r0)
            throw r0
        L_0x0100:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass81Q.A0O(boolean[], int):void");
    }

    public final boolean A0P() {
        C152757a4 r5 = this.A0b.A05;
        long j = r5.A02.A01;
        if (j == -9223372036854775807L || this.A09.A0D < j) {
            return true;
        }
        C152757a4 r1 = r5.A01;
        if (r1 == null) {
            return false;
        }
        if (r1.A07 || r1.A02.A04.A00 != -1) {
            return true;
        }
        return false;
    }

    public final boolean A0Q(AnonymousClass8LV r8) {
        Object obj = r8.A02;
        if (obj == null) {
            C153097af r0 = r8.A03;
            Pair A042 = A04(new C148507Iq(r0.A0A, r0.A00, Util.A04(r0.A02)), false);
            if (A042 != null) {
                int A032 = C18280x3.A03(A042);
                long A0R2 = AnonymousClass6C8.A0R(A042);
                Object obj2 = this.A09.A03.A08(this.A0c, A032, true).A04;
                r8.A00 = A032;
                r8.A01 = A0R2;
                r8.A02 = obj2;
                return true;
            }
        } else {
            int A043 = this.A09.A03.A04(obj);
            if (A043 != -1) {
                r8.A00 = A043;
                return true;
            }
        }
        return false;
    }

    public /* bridge */ /* synthetic */ void BQ7(C185998ua r3) {
        C150717Rx.A00(this.A0j, r3, 10);
    }

    public void BYl(C187418xB r3) {
        C150717Rx.A00(this.A0j, r3, 9);
    }

    public void Bbp(Timeline timeline, C185778uE r5, Object obj) {
        C150717Rx.A00(this.A0j, new C148497Ip(timeline, r5, obj), 8);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x02d3, code lost:
        if (com.facebook.android.exoplayer2.util.Util.A05(r0.A09.A0D - r0.A09.A02) <= 1000) goto L_0x02e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x02ee, code lost:
        if (r8.BHW() == false) goto L_0x02f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x02fa, code lost:
        if (r8.BHW() == false) goto L_0x02fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x03bd, code lost:
        if (A0P() != false) goto L_0x03bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x03c9, code lost:
        if (((X.C1673180p) r1).A0B == 1) goto L_0x03cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x0481, code lost:
        if ((r12 - r4) >= ((long) r8)) goto L_0x0483;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0077, code lost:
        if (r9.A00 < 100) goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x04c2, code lost:
        if (r25 == false) goto L_0x04c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:286:0x04d2, code lost:
        if (((X.C1673180p) r1).A0B == 1) goto L_0x04d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:517:0x09e7, code lost:
        if (r9.A00 != -1) goto L_0x09e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:544:0x0ad9, code lost:
        if (r9.equals(r5) == false) goto L_0x0adb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:588:0x0c12, code lost:
        if (r0.A0L != false) goto L_0x0c14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:596:0x0c32, code lost:
        if (r1.A08 == r2) goto L_0x0c34;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:597:0x0c34, code lost:
        A0J(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:605:0x0c58, code lost:
        if (r1.A07() == false) goto L_0x0c5a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:606:0x0c5a, code lost:
        A0K(true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:620:0x0ca7, code lost:
        r5.A03(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:637:0x0d4a, code lost:
        A06();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:638:0x0d4d, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01c7, code lost:
        if (r4.A01 == null) goto L_0x01c9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x037b A[Catch:{ all -> 0x08a6, 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }] */
    /* JADX WARNING: Removed duplicated region for block: B:299:0x0535 A[Catch:{ all -> 0x08a6, 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }] */
    /* JADX WARNING: Removed duplicated region for block: B:324:0x05a5 A[Catch:{ all -> 0x08a6, 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }] */
    /* JADX WARNING: Removed duplicated region for block: B:330:0x05b9 A[Catch:{ all -> 0x08a6, 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }] */
    /* JADX WARNING: Removed duplicated region for block: B:333:0x05cc A[Catch:{ all -> 0x08a6, 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }] */
    /* JADX WARNING: Removed duplicated region for block: B:438:0x0825 A[Catch:{ all -> 0x08a6, 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }] */
    /* JADX WARNING: Removed duplicated region for block: B:461:0x0885 A[Catch:{ all -> 0x08a6, 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }] */
    /* JADX WARNING: Removed duplicated region for block: B:468:0x08a0 A[Catch:{ all -> 0x08a6, 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0126 A[Catch:{ all -> 0x08a6, 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }] */
    /* JADX WARNING: Removed duplicated region for block: B:559:0x0b20 A[Catch:{ all -> 0x08a6, 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }] */
    /* JADX WARNING: Removed duplicated region for block: B:562:0x0b40 A[Catch:{ all -> 0x08a6, 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x012d A[Catch:{ all -> 0x08a6, 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0183 A[Catch:{ all -> 0x08a6, 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:413:0x0789=Splitter:B:413:0x0789, B:463:0x088b=Splitter:B:463:0x088b, B:42:0x00ed=Splitter:B:42:0x00ed, B:433:0x081d=Splitter:B:433:0x081d} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean handleMessage(android.os.Message r39) {
        /*
            r38 = this;
            java.lang.String r18 = "ExoPlayerImplInternal"
            r6 = 1
            r3 = 0
            r0 = r38
            r2 = r39
            int r1 = r2.what     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            switch(r1) {
                case 0: goto L_0x06f6;
                case 1: goto L_0x0729;
                case 2: goto L_0x000e;
                case 3: goto L_0x079f;
                case 4: goto L_0x08be;
                case 5: goto L_0x08d7;
                case 6: goto L_0x08df;
                case 7: goto L_0x05ee;
                case 8: goto L_0x08ea;
                case 9: goto L_0x0b92;
                case 10: goto L_0x0c26;
                case 11: goto L_0x0609;
                case 12: goto L_0x0c39;
                case 13: goto L_0x0c48;
                case 14: goto L_0x0c5f;
                case 15: goto L_0x0c90;
                case 16: goto L_0x0d4a;
                case 17: goto L_0x0d43;
                case 18: goto L_0x0cce;
                default: goto L_0x000d;
            }     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
        L_0x000d:
            return r3
        L_0x000e:
            long r16 = android.os.SystemClock.uptimeMillis()     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.8uE r2 = r0.A0C     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            if (r2 == 0) goto L_0x001d
            int r1 = r0.A02     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            if (r1 <= 0) goto L_0x0044
            r2.BL3()     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
        L_0x001d:
            X.7bj r7 = r0.A0b     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.7a4 r10 = r7.A05     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            if (r10 == 0) goto L_0x05d8
            X.7a4 r15 = r7.A06     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            java.lang.String r1 = "doSomeWork"
            X.C153827c5.A01(r1)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r0.A0A()     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            long r13 = X.AnonymousClass6C8.A0L()     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.8xB r8 = r10.A08     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.7nh r1 = r0.A09     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            long r1 = r1.A0D     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            long r4 = r0.A0T     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            long r1 = r1 - r4
            boolean r4 = r0.A0n     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r8.B1k(r1, r4)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.8x9[] r12 = r0.A0S     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            int r11 = r12.length     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            goto L_0x028e
        L_0x0044:
            X.7bj r9 = r0.A0b     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.7a4 r5 = r9.A04     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            if (r5 == 0) goto L_0x0079
            X.7Or r1 = r5.A02     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            boolean r1 = r1.A05     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            if (r1 != 0) goto L_0x010d
            boolean r1 = r5.A07     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            if (r1 == 0) goto L_0x010d
            boolean r1 = r5.A06     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            if (r1 == 0) goto L_0x0064
            X.8xB r1 = r5.A08     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            long r7 = r1.B4y()     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r4 = -9223372036854775808
            int r1 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r1 != 0) goto L_0x010d
        L_0x0064:
            X.7a4 r5 = r9.A04     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.7Or r1 = r5.A02     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            long r1 = r1.A01     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r4 == 0) goto L_0x010d
            int r2 = r9.A00     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r1 = 100
            if (r2 >= r1) goto L_0x010d
        L_0x0079:
            long r1 = r0.A06     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.7nh r4 = r0.A09     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            if (r5 != 0) goto L_0x009b
            X.7Z2 r8 = r4.A04     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            long r4 = r4.A02     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            com.facebook.android.exoplayer2.Timeline r2 = r9.A07     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            int r7 = r8.A02     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.7Wk r1 = r9.A0A     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r2.A08(r1, r7, r3)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            int r2 = r8.A00     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r1 = -1
            if (r2 != r1) goto L_0x00ed
            long r1 = r8.A03     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r10 = r7
            r11 = r4
            r13 = r1
            X.7Or r12 = r9.A01(r10, r11, r13)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            goto L_0x009f
        L_0x009b:
            X.7Or r12 = r9.A02(r5, r1)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
        L_0x009f:
            if (r12 == 0) goto L_0x00ed
            X.7nh r1 = r0.A09     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            com.facebook.android.exoplayer2.Timeline r4 = r1.A03     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.7Z2 r1 = r12.A04     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            int r2 = r1.A02     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.7Wk r1 = r0.A0c     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.7Wk r1 = r4.A08(r1, r2, r6)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            java.lang.Object r11 = r1.A04     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.8sM[] r10 = r0.A0s     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.7FC r8 = r0.A0e     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.8v7 r1 = r0.A0a     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.7ZV r23 = r1.B4U()     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.8uE r7 = r0.A0C     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r13 = 0
            X.7a4 r1 = r9.A04     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            if (r1 != 0) goto L_0x00e0
            long r4 = r12.A03     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            long r4 = r4 + r13
        L_0x00c6:
            X.7a4 r1 = new X.7a4     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r19 = r1
            r20 = r12
            r21 = r7
            r22 = r8
            r24 = r11
            r25 = r10
            r26 = r4
            r19.<init>(r20, r21, r22, r23, r24, r25, r26)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.7a4 r4 = r9.A04     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            if (r4 == 0) goto L_0x00f8
            X.7a4 r2 = r9.A05     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            goto L_0x00e8
        L_0x00e0:
            long r4 = r1.A00     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.7Or r1 = r1.A02     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            long r1 = r1.A01     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            long r4 = r4 + r1
            goto L_0x00c6
        L_0x00e8:
            boolean r2 = X.AnonymousClass000.A1W(r2)
            goto L_0x00f3
        L_0x00ed:
            X.8uE r1 = r0.A0C     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r1.BL3()     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            goto L_0x010d
        L_0x00f3:
            X.C159197lM.A02(r2)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r4.A01 = r1     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
        L_0x00f8:
            r2 = 0
            r9.A08 = r2     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r9.A04 = r1     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            int r2 = r9.A00     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            int r2 = r2 + 1
            r9.A00 = r2     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.8xB r4 = r1.A08     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            long r1 = r12.A03     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r4.BhH(r0, r1)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r0.A0L(r6)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
        L_0x010d:
            X.7a4 r2 = r9.A04     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r11 = 0
            if (r2 == 0) goto L_0x0126
            boolean r1 = r2.A07     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            if (r1 == 0) goto L_0x0183
            boolean r1 = r2.A06     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            if (r1 == 0) goto L_0x0126
            X.8xB r1 = r2.A08     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            long r7 = r1.B4y()     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r4 = -9223372036854775808
            int r1 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r1 != 0) goto L_0x0183
        L_0x0126:
            r0.A0L(r3)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
        L_0x0129:
            X.7a4 r12 = r9.A05     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            if (r12 == 0) goto L_0x001d
            X.7a4 r10 = r9.A06     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r13 = 0
        L_0x0130:
            boolean r1 = r0.A0L     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            if (r1 == 0) goto L_0x018d
            if (r12 == r10) goto L_0x018d
            long r7 = r0.A06     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.7a4 r2 = r12.A01     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            boolean r1 = r0.A0H     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            if (r1 != 0) goto L_0x0141
            long r4 = r2.A00     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            goto L_0x0148
        L_0x0141:
            X.7Or r1 = r2.A02     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            long r4 = r1.A03     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            long r1 = r2.A00     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            long r4 = r4 + r1
        L_0x0148:
            int r1 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r1 < 0) goto L_0x018d
            if (r13 == 0) goto L_0x0151
            r0.A06()     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
        L_0x0151:
            X.7Or r1 = r12.A02     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            boolean r1 = r1.A06     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r13 = 3
            if (r1 == 0) goto L_0x0159
            r13 = 0
        L_0x0159:
            X.7a4 r8 = r9.A00()     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r0.A0F(r12)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.7nh r12 = r0.A09     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.7Or r1 = r8.A02     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.7Z2 r7 = r1.A04     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            long r4 = r1.A03     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            long r1 = r1.A00     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r19 = r12
            r20 = r7
            r21 = r4
            r23 = r1
            X.7nh r1 = r19.A01(r20, r21, r23)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r0.A09 = r1     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.7TG r1 = r0.A0Z     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r1.A00(r13)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r0.A0A()     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r12 = r8
            r13 = 1
            goto L_0x0130
        L_0x0183:
            X.7nh r1 = r0.A09     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            boolean r1 = r1.A0A     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            if (r1 != 0) goto L_0x0129
            r0.A0J(r3)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            goto L_0x0129
        L_0x018d:
            X.7Or r1 = r10.A02     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            boolean r1 = r1.A05     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            if (r1 != 0) goto L_0x026d
            X.7a4 r1 = r10.A01     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            if (r1 == 0) goto L_0x001d
            boolean r1 = r1.A07     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            if (r1 != 0) goto L_0x019d
            goto L_0x001d
        L_0x019d:
            X.8x9[] r13 = r0.A0r     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            int r12 = r13.length     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            if (r11 >= r12) goto L_0x01bc
            r4 = r13[r11]     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.8tJ[] r1 = r10.A0D     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r2 = r1[r11]     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r1 = r4
            X.80p r1 = (X.C1673180p) r1     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.8tJ r1 = r1.A06     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            if (r1 != r2) goto L_0x001d
            if (r2 == 0) goto L_0x01b9
            boolean r1 = r4.BFS()     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            if (r1 != 0) goto L_0x01b9
            goto L_0x001d
        L_0x01b9:
            int r11 = r11 + 1
            goto L_0x019d
        L_0x01bc:
            X.7NU r1 = r10.A05     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r23 = r1
            X.7a4 r4 = r9.A06     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            if (r4 == 0) goto L_0x01c9
            X.7a4 r2 = r4.A01     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r1 = 1
            if (r2 != 0) goto L_0x01ca
        L_0x01c9:
            r1 = 0
        L_0x01ca:
            X.C159197lM.A02(r1)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.7a4 r14 = r4.A01     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r9.A06 = r14     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.7NU r15 = r14.A05     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.8xB r1 = r14.A08     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            long r7 = r1.BiL()     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            boolean r22 = X.AnonymousClass000.A1S(r1)
            r11 = 0
        L_0x01e5:
            if (r11 >= r12) goto L_0x001d
            r10 = r13[r11]     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r1 = r23
            X.7jA[] r2 = r1.A03     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r1 = r2[r11]     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            if (r1 == 0) goto L_0x0269
            if (r22 != 0) goto L_0x0265
            r1 = r10
            X.80p r1 = (X.C1673180p) r1     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            boolean r1 = r1.A08     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            if (r1 != 0) goto L_0x0269
            X.8xC[] r1 = r15.A04     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r7 = r1[r11]     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.7jA[] r5 = r15.A03     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r1 = r5[r11]     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            boolean r4 = X.AnonymousClass000.A1W(r1)
            r2 = r2[r11]     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r1 = r5[r11]     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            if (r4 == 0) goto L_0x0265
            boolean r1 = r1.equals(r2)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            if (r1 == 0) goto L_0x0265
            r4 = 0
            if (r7 == 0) goto L_0x0216
            goto L_0x0218
        L_0x0216:
            r2 = 0
            goto L_0x021e
        L_0x0218:
            r1 = r7
            X.81g r1 = (X.C1674881g) r1     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            int[] r1 = r1.A03     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            int r2 = r1.length     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
        L_0x021e:
            X.7z1[] r9 = new X.C166637z1[r2]     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
        L_0x0220:
            if (r4 >= r2) goto L_0x022e
            r1 = r7
            X.81g r1 = (X.C1674881g) r1     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.7z1[] r1 = r1.A04     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r1 = r1[r4]     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r9[r4] = r1     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            int r4 = r4 + 1
            goto L_0x0220
        L_0x022e:
            java.lang.String r2 = "replaceStream"
            r1 = r18
            android.util.Log.e(r1, r2)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.8tJ[] r1 = r14.A0D     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r8 = r1[r11]     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            boolean r1 = r0.A0H     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            if (r1 != 0) goto L_0x025d
            long r1 = r14.A00     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r4 = r1
        L_0x0240:
            X.80p r10 = (X.C1673180p) r10     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            boolean r7 = r10.A08     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r7 = r7 ^ 1
            X.C159197lM.A02(r7)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r10.A06 = r8     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            long r7 = r10.A02     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r20 = -9223372036854775808
            int r19 = (r7 > r20 ? 1 : (r7 == r20 ? 0 : -1))
            if (r19 != 0) goto L_0x0255
            r10.A02 = r1     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
        L_0x0255:
            r10.A0A = r9     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r10.A03 = r4     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r10.A0A(r4)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            goto L_0x0269
        L_0x025d:
            X.7Or r1 = r14.A02     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            long r1 = r1.A03     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            long r4 = r14.A00     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            long r1 = r1 + r4
            goto L_0x0240
        L_0x0265:
            X.80p r10 = (X.C1673180p) r10     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r10.A08 = r6     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
        L_0x0269:
            int r11 = r11 + 1
            goto L_0x01e5
        L_0x026d:
            X.8x9[] r2 = r0.A0r     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            int r1 = r2.length     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            if (r11 >= r1) goto L_0x001d
            r4 = r2[r11]     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.8tJ[] r1 = r10.A0D     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r2 = r1[r11]     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            if (r2 == 0) goto L_0x028b
            r1 = r4
            X.80p r1 = (X.C1673180p) r1     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.8tJ r1 = r1.A06     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            if (r1 != r2) goto L_0x028b
            boolean r1 = r4.BFS()     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            if (r1 == 0) goto L_0x028b
            X.80p r4 = (X.C1673180p) r4     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r4.A08 = r6     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
        L_0x028b:
            int r11 = r11 + 1
            goto L_0x026d
        L_0x028e:
            boolean r26 = X.C86624Kv.A1W(r11, r6)
            r25 = 1
            r24 = 1
            r9 = 0
            r23 = 0
        L_0x0299:
            java.lang.String r22 = "Temporarily ignoring stream error: "
            if (r9 >= r11) goto L_0x0385
            r8 = r12[r9]     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            long r1 = r0.A06     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r8.BjR(r1, r13)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.7Or r1 = r15.A02     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            boolean r1 = r1.A05     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            if (r1 == 0) goto L_0x02e6
            boolean r1 = r0.A0K     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            if (r1 == 0) goto L_0x02db
            boolean r1 = r8.BFS()     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            if (r1 != 0) goto L_0x02d5
            boolean r1 = r0.A0F     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            if (r1 != 0) goto L_0x02e6
            X.7nh r1 = r0.A09     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            long r1 = r1.A0D     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r19 = -1
            int r4 = (r1 > r19 ? 1 : (r1 == r19 ? 0 : -1))
            if (r4 == 0) goto L_0x02e6
            X.7nh r1 = r0.A09     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            long r4 = r1.A0D     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.7nh r1 = r0.A09     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            long r1 = r1.A02     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            long r4 = r4 - r1
            long r19 = com.facebook.android.exoplayer2.util.Util.A05(r4)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r4 = 1000(0x3e8, double:4.94E-321)
            int r1 = (r19 > r4 ? 1 : (r19 == r4 ? 0 : -1))
            if (r1 <= 0) goto L_0x02e6
        L_0x02d5:
            r1 = r8
            X.80p r1 = (X.C1673180p) r1     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r1.A08 = r6     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            goto L_0x02e6
        L_0x02db:
            boolean r1 = r0.A0F     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            if (r1 == 0) goto L_0x02d5
            boolean r1 = r8.BFS()     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            if (r1 == 0) goto L_0x02e6
            goto L_0x02d5
        L_0x02e6:
            if (r26 == 0) goto L_0x02f0
            boolean r1 = r8.BHW()     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r26 = 1
            if (r1 != 0) goto L_0x02f2
        L_0x02f0:
            r26 = 0
        L_0x02f2:
            if (r24 == 0) goto L_0x02fc
            boolean r1 = r8.BHW()     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r24 = 1
            if (r1 != 0) goto L_0x02fe
        L_0x02fc:
            r24 = 0
        L_0x02fe:
            boolean r1 = r8.BIe()     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            if (r1 != 0) goto L_0x0377
            boolean r1 = r8.BHW()     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            if (r1 != 0) goto L_0x0377
            X.7a4 r1 = r7.A06     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.7a4 r1 = r1.A01     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            if (r1 == 0) goto L_0x031b
            boolean r1 = r1.A07     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            if (r1 == 0) goto L_0x031b
            boolean r1 = r8.BFS()     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            if (r1 == 0) goto L_0x031b
            goto L_0x0377
        L_0x031b:
            r21 = 0
            r1 = r8
            X.80p r1 = (X.C1673180p) r1     // Catch:{ 6KR -> 0x0329 }
            X.8tJ r1 = r1.A06     // Catch:{ 6KR -> 0x0329 }
            r1.getClass()     // Catch:{ 6KR -> 0x0329 }
            r1.BL1()     // Catch:{ 6KR -> 0x0329 }
            goto L_0x0364
        L_0x0329:
            r4 = move-exception
            java.lang.Class r2 = r4.getClass()     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            java.lang.Class<X.6KR> r1 = X.AnonymousClass6KR.class
            boolean r1 = r2.equals(r1)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            if (r1 == 0) goto L_0x079e
            boolean r1 = r0.A0J     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            if (r1 == 0) goto L_0x079e
            long r1 = r0.A05     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r19 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r1 > r19 ? 1 : (r1 == r19 ? 0 : -1))
            if (r5 != 0) goto L_0x0367
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r1 = r22
            java.lang.String r2 = X.AnonymousClass000.A0a(r1, r2, r4)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r1 = r18
            android.util.Log.w(r1, r2)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r0.A05 = r1     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            boolean r1 = r0.A0m     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            if (r1 == 0) goto L_0x0364
            android.os.Handler r2 = r0.A0V     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r1 = 4
            X.C18290x4.A1C(r2, r4, r1)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
        L_0x0364:
            r0.A0A = r8     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            goto L_0x0374
        L_0x0367:
            long r19 = java.lang.System.currentTimeMillis()     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            long r19 = r19 - r1
            long r1 = r0.A0U     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            int r5 = (r19 > r1 ? 1 : (r19 == r1 ? 0 : -1))
            if (r5 > 0) goto L_0x079e
            goto L_0x0364
        L_0x0374:
            r23 = 1
            goto L_0x0379
        L_0x0377:
            r21 = 1
        L_0x0379:
            if (r25 == 0) goto L_0x037f
            r25 = 1
            if (r21 != 0) goto L_0x0381
        L_0x037f:
            r25 = 0
        L_0x0381:
            int r9 = r9 + 1
            goto L_0x0299
        L_0x0385:
            if (r25 != 0) goto L_0x038a
            r0.A07()     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
        L_0x038a:
            boolean r1 = r0.A0M     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            if (r1 == 0) goto L_0x039b
            if (r26 == 0) goto L_0x039b
            if (r24 != 0) goto L_0x039b
            X.8x9[] r1 = r0.A0S     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            int r2 = r1.length     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r1 = 0
        L_0x0396:
            if (r1 >= r2) goto L_0x039b
            int r1 = r1 + 1
            goto L_0x0396
        L_0x039b:
            X.7Or r1 = r10.A02     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            long r4 = r1.A01     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r9 = 3
            if (r24 == 0) goto L_0x03ad
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r1 == 0) goto L_0x0521
            goto L_0x0519
        L_0x03ad:
            X.7nh r4 = r0.A09     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            int r2 = r4.A00     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r1 = 2
            if (r2 != r1) goto L_0x04b0
            X.8x9[] r1 = r0.A0S     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            int r1 = r1.length     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            if (r1 != 0) goto L_0x0418
            boolean r1 = r0.A0P()     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            if (r1 == 0) goto L_0x04b0
        L_0x03bf:
            X.8x9 r1 = r0.A0A     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            if (r1 == 0) goto L_0x0415
            X.80p r1 = (X.C1673180p) r1     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            int r1 = r1.A0B     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r37 = 1
            if (r1 != r6) goto L_0x0415
        L_0x03cb:
            X.6xQ r1 = r0.A0D     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r19 = r1
            X.7nh r14 = r0.A09     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            int r1 = r14.A00     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            if (r1 == r9) goto L_0x0409
            com.facebook.android.exoplayer2.Timeline r15 = r14.A03     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            java.lang.Object r13 = r14.A08     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.7Z2 r12 = r14.A04     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            long r4 = r14.A02     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            long r1 = r14.A01     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            boolean r11 = r14.A0A     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.7yy r10 = r14.A05     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.7NU r8 = r14.A06     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.7nh r7 = new X.7nh     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r24 = r7
            r25 = r15
            r26 = r12
            r27 = r10
            r28 = r8
            r29 = r19
            r30 = r13
            r31 = r9
            r32 = r4
            r34 = r1
            r36 = r11
            r24.<init>(r25, r26, r27, r28, r29, r30, r31, r32, r34, r36, r37)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.C160477nh.A00(r14, r7)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r0.A09 = r7     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r1 = -1
            r0.A04 = r1     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
        L_0x0409:
            boolean r1 = r0.A0L     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            if (r1 == 0) goto L_0x0410
            r0.A08()     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
        L_0x0410:
            r1 = 0
            r0.A0A = r1     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            goto L_0x052e
        L_0x0415:
            r37 = 0
            goto L_0x03cb
        L_0x0418:
            if (r25 != 0) goto L_0x041c
            goto L_0x04a6
        L_0x041c:
            boolean r1 = r4.A0A     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            if (r1 == 0) goto L_0x03bf
            X.7a4 r10 = r7.A04     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.7Or r2 = r10.A02     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            boolean r1 = r2.A05     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r5 = r1 ^ 1
            boolean r1 = r10.A07     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            if (r1 != 0) goto L_0x0439
            long r1 = r2.A03     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
        L_0x042e:
            boolean r4 = r0.A0p     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            if (r4 == 0) goto L_0x0460
            X.7a4 r11 = r7.A05     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.7a4 r4 = r7.A04     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            if (r11 == r4) goto L_0x0460
            goto L_0x044c
        L_0x0439:
            X.8xB r1 = r10.A08     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            long r1 = r1.B4y()     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r11 = -9223372036854775808
            int r4 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r4 != 0) goto L_0x042e
            if (r5 == 0) goto L_0x042e
            X.7Or r1 = r10.A02     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            long r1 = r1.A01     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            goto L_0x042e
        L_0x044c:
            if (r11 == 0) goto L_0x0460
            long r4 = r0.A06     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            long r7 = r11.A00     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            long r4 = r4 - r7
            X.8xB r7 = r11.A08     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            long r28 = r7.B4w(r4)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            long r4 = r0.A02()     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            long r28 = r28 + r4
            goto L_0x046b
        L_0x0460:
            long r4 = r0.A06     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            long r7 = r10.A00     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            long r4 = r4 - r7
            X.8xB r7 = r10.A08     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            long r28 = r7.B4w(r4)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
        L_0x046b:
            long r12 = java.lang.System.currentTimeMillis()     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            int r8 = r0.A00     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            if (r8 <= 0) goto L_0x0483
            long r4 = r0.A04     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r10 = 0
            int r7 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r7 <= 0) goto L_0x0483
            long r12 = r12 - r4
            long r4 = (long) r8     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            int r7 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            r31 = 1
            if (r7 < 0) goto L_0x0485
        L_0x0483:
            r31 = 0
        L_0x0485:
            r7 = -9223372036854775808
            int r4 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r4 == 0) goto L_0x03bf
            X.8v7 r4 = r0.A0a     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.81z r1 = r0.A0X     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.7jX r1 = r1.BBQ()     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            float r2 = r1.A01     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            boolean r1 = r0.A0N     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r26 = r4
            r27 = r2
            r30 = r1
            boolean r1 = r26.BoZ(r27, r28, r30, r31)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            if (r1 != 0) goto L_0x03bf
            X.6xQ r1 = X.C142576xQ.BUFFER_BELOW_THRESHOLD     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            goto L_0x04ae
        L_0x04a6:
            X.8x9 r1 = r0.A0A     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            if (r1 == 0) goto L_0x04b0
            X.80p r1 = (X.C1673180p) r1     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.6xQ r1 = r1.A07     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
        L_0x04ae:
            r0.A0D = r1     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
        L_0x04b0:
            X.7nh r1 = r0.A09     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            int r1 = r1.A00     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            if (r1 != r9) goto L_0x052e
            X.8x9[] r1 = r0.A0S     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            int r1 = r1.length     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            if (r1 != 0) goto L_0x04c2
            boolean r1 = r0.A0P()     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            if (r1 == 0) goto L_0x04c4
            goto L_0x052e
        L_0x04c2:
            if (r25 != 0) goto L_0x052e
        L_0x04c4:
            boolean r1 = r0.A0L     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r0.A0N = r1     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.8x9 r1 = r0.A0A     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            if (r1 == 0) goto L_0x0516
            X.80p r1 = (X.C1673180p) r1     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            int r1 = r1.A0B     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r37 = 1
            if (r1 != r6) goto L_0x0516
        L_0x04d4:
            X.7nh r13 = r0.A09     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            int r2 = r13.A00     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r1 = 2
            if (r2 == r1) goto L_0x052b
            com.facebook.android.exoplayer2.Timeline r1 = r13.A03     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r19 = r1
            java.lang.Object r15 = r13.A08     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.7Z2 r14 = r13.A04     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            long r4 = r13.A02     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            long r1 = r13.A01     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            boolean r12 = r13.A0A     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.7yy r11 = r13.A05     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.7NU r10 = r13.A06     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.6xQ r8 = r13.A07     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r31 = 2
            X.7nh r7 = new X.7nh     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r24 = r7
            r25 = r19
            r26 = r14
            r27 = r11
            r28 = r10
            r29 = r8
            r30 = r15
            r32 = r4
            r34 = r1
            r36 = r12
            r24.<init>(r25, r26, r27, r28, r29, r30, r31, r32, r34, r36, r37)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.C160477nh.A00(r13, r7)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r0.A09 = r7     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r0.A04 = r1     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            goto L_0x052b
        L_0x0516:
            r37 = 0
            goto L_0x04d4
        L_0x0519:
            X.7nh r1 = r0.A09     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            long r1 = r1.A0D     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            int r8 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r8 > 0) goto L_0x03ad
        L_0x0521:
            X.7Or r1 = r10.A02     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            boolean r1 = r1.A05     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            if (r1 == 0) goto L_0x03ad
            r1 = 4
            r0.A0C(r1)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
        L_0x052b:
            r0.A09()     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
        L_0x052e:
            X.7nh r1 = r0.A09     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            int r2 = r1.A00     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r1 = 2
            if (r2 != r1) goto L_0x0594
            X.8x9[] r8 = r0.A0S     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            int r7 = r8.length     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r5 = 0
        L_0x0539:
            if (r5 >= r7) goto L_0x0594
            r1 = r8[r5]     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.80p r1 = (X.C1673180p) r1     // Catch:{ 6KR -> 0x0548 }
            X.8tJ r1 = r1.A06     // Catch:{ 6KR -> 0x0548 }
            r1.getClass()     // Catch:{ 6KR -> 0x0548 }
            r1.BL1()     // Catch:{ 6KR -> 0x0548 }
            goto L_0x058f
        L_0x0548:
            r4 = move-exception
            java.lang.Class r2 = r4.getClass()     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            java.lang.Class<X.6KR> r1 = X.AnonymousClass6KR.class
            boolean r1 = r2.equals(r1)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            if (r1 == 0) goto L_0x079e
            boolean r1 = r0.A0J     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            if (r1 == 0) goto L_0x079e
            long r1 = r0.A05     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r10 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r10 != 0) goto L_0x0584
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r1 = r22
            java.lang.String r2 = X.AnonymousClass000.A0a(r1, r2, r4)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r1 = r18
            android.util.Log.w(r1, r2)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r0.A05 = r1     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            boolean r1 = r0.A0m     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            if (r1 == 0) goto L_0x058f
            android.os.Handler r2 = r0.A0V     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r1 = 4
            X.C18290x4.A1C(r2, r4, r1)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            goto L_0x058f
        L_0x0584:
            long r11 = java.lang.System.currentTimeMillis()     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            long r11 = r11 - r1
            long r1 = r0.A0U     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            int r10 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r10 > 0) goto L_0x079e
        L_0x058f:
            int r5 = r5 + 1
            r23 = 1
            goto L_0x0539
        L_0x0594:
            boolean r1 = r0.A0L     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            if (r1 == 0) goto L_0x059e
            X.7nh r1 = r0.A09     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            int r1 = r1.A00     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            if (r1 == r9) goto L_0x05b9
        L_0x059e:
            X.7nh r1 = r0.A09     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            int r2 = r1.A00     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r1 = 2
            if (r2 == r1) goto L_0x05b9
            X.8x9[] r1 = r0.A0S     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            int r1 = r1.length     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            if (r1 == 0) goto L_0x05b0
            r1 = 4
            if (r2 == r1) goto L_0x05b0
            r7 = 1000(0x3e8, double:4.94E-321)
            goto L_0x05bb
        L_0x05b0:
            X.7nD r1 = r0.A0j     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            android.os.Handler r2 = r1.A00     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r1 = 2
            r2.removeMessages(r1)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            goto L_0x05ca
        L_0x05b9:
            r7 = 10
        L_0x05bb:
            X.7nD r1 = r0.A0j     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            android.os.Handler r5 = r1.A00     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r4 = 2
            r5.removeMessages(r4)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            long r16 = r16 + r7
            r1 = r16
            r5.sendEmptyMessageAtTime(r4, r1)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
        L_0x05ca:
            if (r23 != 0) goto L_0x05d3
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0.A05 = r1     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
        L_0x05d3:
            X.C153827c5.A00()     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            goto L_0x0d4a
        L_0x05d8:
            r0.A07()     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r7 = 10
            X.7nD r1 = r0.A0j     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            android.os.Handler r5 = r1.A00     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r4 = 2
            r5.removeMessages(r4)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            long r16 = r16 + r7
            r1 = r16
            r5.sendEmptyMessageAtTime(r4, r1)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            goto L_0x0d4a
        L_0x05ee:
            r0.A0N(r6, r6, r6)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.8v7 r1 = r0.A0a     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r1.BZm()     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r0.A0C(r6)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            android.os.HandlerThread r1 = r0.A0W     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r1.quit()     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            monitor-enter(r0)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r0.A0O = r6     // Catch:{ all -> 0x0606 }
            r0.notifyAll()     // Catch:{ all -> 0x0606 }
            monitor-exit(r0)     // Catch:{ all -> 0x0606 }
            return r6
        L_0x0606:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0606 }
            throw r1     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
        L_0x0609:
            X.7bj r5 = r0.A0b     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.7a4 r1 = r5.A05     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            if (r1 == 0) goto L_0x0d4a
            X.81z r1 = r0.A0X     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r1.BBQ()     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.7a4 r10 = r5.A05     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.7a4 r4 = r5.A06     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r2 = 1
        L_0x0619:
            if (r10 == 0) goto L_0x0d4a
            boolean r1 = r10.A07     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            if (r1 == 0) goto L_0x0d4a
            boolean r1 = r10.A02()     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            if (r1 == 0) goto L_0x0626
            goto L_0x062c
        L_0x0626:
            if (r10 != r4) goto L_0x0629
            r2 = 0
        L_0x0629:
            X.7a4 r10 = r10.A01     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            goto L_0x0619
        L_0x062c:
            r9 = 4
            if (r2 == 0) goto L_0x06a7
            X.7a4 r7 = r5.A05     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            boolean r10 = r5.A08(r7)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.8x9[] r5 = r0.A0r     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            int r4 = r5.length     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            boolean[] r8 = new boolean[r4]     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.7nh r1 = r0.A09     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            long r1 = r1.A0D     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            long r12 = r7.A00(r8, r1, r10)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.7yy r10 = r7.A03     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.7NU r1 = r7.A05     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.8v7 r2 = r0.A0a     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.8xC[] r1 = r1.A04     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r2.BeT(r10, r5, r1)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.7nh r2 = r0.A09     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            int r1 = r2.A00     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            if (r1 == r9) goto L_0x066f
            long r1 = r2.A0D     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            int r10 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r10 == 0) goto L_0x066f
            X.7nh r10 = r0.A09     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.7Z2 r11 = r10.A04     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            long r1 = r10.A01     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r14 = r1
            X.7nh r1 = r10.A01(r11, r12, r14)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r0.A09 = r1     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.7TG r2 = r0.A0Z     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r1 = 5
            r2.A00(r1)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r0.A0D(r12)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
        L_0x066f:
            boolean[] r11 = new boolean[r4]     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r13 = 0
            r10 = 0
        L_0x0673:
            if (r13 >= r4) goto L_0x06d1
            r14 = r5[r13]     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r1 = r14
            X.80p r1 = (X.C1673180p) r1     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            int r1 = r1.A01     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            boolean r12 = X.AnonymousClass000.A1S(r1)
            r11[r13] = r12     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.8tJ[] r1 = r7.A0D     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r2 = r1[r13]     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            if (r2 == 0) goto L_0x068a
            int r10 = r10 + 1
        L_0x068a:
            if (r12 == 0) goto L_0x06a4
            r12 = r14
            X.80p r12 = (X.C1673180p) r12     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.8tJ r1 = r12.A06     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            if (r2 == r1) goto L_0x0697
            r0.A0I(r14)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            goto L_0x06a4
        L_0x0697:
            boolean r1 = r8[r13]     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            if (r1 == 0) goto L_0x06a4
            long r1 = r0.A06     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r12.A08 = r3     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r12.A02 = r1     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r12.A0C(r1, r3)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
        L_0x06a4:
            int r13 = r13 + 1
            goto L_0x0673
        L_0x06a7:
            r5.A08(r10)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            boolean r1 = r10.A07     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            if (r1 == 0) goto L_0x06e0
            X.7Or r1 = r10.A02     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            long r4 = r1.A03     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            long r1 = r0.A06     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            long r7 = r10.A00     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            long r1 = r1 - r7
            long r1 = java.lang.Math.max(r4, r1)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.8sM[] r4 = r10.A0C     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            int r4 = r4.length     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            boolean[] r4 = new boolean[r4]     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r10.A00(r4, r1, r3)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.7yy r5 = r10.A03     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.7NU r1 = r10.A05     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.8v7 r4 = r0.A0a     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.8x9[] r2 = r0.A0r     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.8xC[] r1 = r1.A04     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r4.BeT(r5, r2, r1)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            goto L_0x06e0
        L_0x06d1:
            X.7nh r4 = r0.A09     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.7yy r2 = r7.A03     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.7NU r1 = r7.A05     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.7nh r1 = r4.A02(r2, r1)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r0.A09 = r1     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r0.A0O(r11, r10)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
        L_0x06e0:
            X.7nh r1 = r0.A09     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            int r1 = r1.A00     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            if (r1 == r9) goto L_0x0d4a
            r0.A0J(r3)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r0.A0A()     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.7nD r1 = r0.A0j     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            android.os.Handler r2 = r1.A00     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r1 = 2
            r2.sendEmptyMessage(r1)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            goto L_0x0d4a
        L_0x06f6:
            java.lang.Object r5 = r2.obj     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.8uE r5 = (X.C185778uE) r5     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            int r1 = r2.arg1     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            boolean r4 = X.AnonymousClass000.A1S(r1)
            int r1 = r2.arg2     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            boolean r2 = X.AnonymousClass000.A1S(r1)
            int r1 = r0.A02     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            int r1 = r1 + 1
            r0.A02 = r1     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r0.A0N(r6, r4, r2)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.8v7 r1 = r0.A0a     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r1.BYk()     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r0.A0C = r5     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r1 = 2
            r0.A0C(r1)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.7br r1 = r0.A0Y     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r5.BhR(r1, r0, r6)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.7nD r1 = r0.A0j     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            android.os.Handler r2 = r1.A00     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r1 = 2
            r2.sendEmptyMessage(r1)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            goto L_0x0d4a
        L_0x0729:
            int r1 = r2.arg1     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            boolean r8 = X.AnonymousClass000.A1S(r1)
            r7 = 3
            r0.A0N = r3     // Catch:{ all -> 0x0794 }
            r0.A0L = r8     // Catch:{ all -> 0x0794 }
            X.7bj r4 = r0.A0b     // Catch:{ all -> 0x0794 }
            X.7a4 r1 = r4.A04     // Catch:{ all -> 0x0794 }
            if (r1 == 0) goto L_0x073f
            X.8xB r1 = r1.A08     // Catch:{ all -> 0x0794 }
            r1.Bmw(r8)     // Catch:{ all -> 0x0794 }
        L_0x073f:
            if (r8 != 0) goto L_0x0760
            r0.A09()     // Catch:{ all -> 0x0794 }
            r0.A0A()     // Catch:{ all -> 0x0794 }
            boolean r2 = r0.A0o     // Catch:{ all -> 0x0794 }
            r1 = 2
            r0.A0B(r1, r2)     // Catch:{ all -> 0x0794 }
            boolean r1 = r0.A0G     // Catch:{ all -> 0x0794 }
            if (r1 == 0) goto L_0x0789
            X.7a4 r4 = r4.A04     // Catch:{ all -> 0x0794 }
            if (r4 == 0) goto L_0x0789
            X.8xB r9 = r4.A08     // Catch:{ all -> 0x0794 }
            long r1 = r0.A06     // Catch:{ all -> 0x0794 }
            long r4 = r4.A00     // Catch:{ all -> 0x0794 }
            long r1 = r1 - r4
            r9.Aye(r1)     // Catch:{ all -> 0x0794 }
            goto L_0x0789
        L_0x0760:
            boolean r1 = r0.A0o     // Catch:{ all -> 0x0794 }
            r0.A0B(r3, r1)     // Catch:{ all -> 0x0794 }
            X.8v7 r4 = r0.A0a     // Catch:{ all -> 0x0794 }
            r1 = -1
            r4.Bmr(r1, r1)     // Catch:{ all -> 0x0794 }
            X.7nh r1 = r0.A09     // Catch:{ all -> 0x0794 }
            int r2 = r1.A00     // Catch:{ all -> 0x0794 }
            if (r2 != r7) goto L_0x077e
            r0.A08()     // Catch:{ all -> 0x0794 }
            X.7nD r1 = r0.A0j     // Catch:{ all -> 0x0794 }
            android.os.Handler r2 = r1.A00     // Catch:{ all -> 0x0794 }
            r1 = 2
            r2.sendEmptyMessage(r1)     // Catch:{ all -> 0x0794 }
            goto L_0x0789
        L_0x077e:
            r1 = 2
            if (r2 != r1) goto L_0x0789
            X.7nD r1 = r0.A0j     // Catch:{ all -> 0x0794 }
            android.os.Handler r2 = r1.A00     // Catch:{ all -> 0x0794 }
            r1 = 2
            r2.sendEmptyMessage(r1)     // Catch:{ all -> 0x0794 }
        L_0x0789:
            android.os.Handler r2 = r0.A0V     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r8)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.C18290x4.A1C(r2, r1, r7)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            goto L_0x0d4a
        L_0x0794:
            r4 = move-exception
            android.os.Handler r2 = r0.A0V     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r8)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.C18290x4.A1C(r2, r1, r7)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
        L_0x079e:
            throw r4     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
        L_0x079f:
            java.lang.Object r12 = r2.obj     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.7Iq r12 = (X.C148507Iq) r12     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.7TG r11 = r0.A0Z     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r17 = 1
            int r1 = r11.A01     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            int r1 = r1 + 1
            r11.A01 = r1     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            android.util.Pair r9 = r0.A04(r12, r6)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r7 = 0
            r19 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r9 != 0) goto L_0x07f2
            X.7nh r1 = r0.A09     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            com.facebook.android.exoplayer2.Timeline r4 = r1.A03     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            int r1 = r4.A01()     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            boolean r1 = X.AnonymousClass000.A1T(r1)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            if (r1 == 0) goto L_0x07ca
            r1 = 0
            goto L_0x07d8
        L_0x07ca:
            boolean r1 = r0.A0R     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            int r2 = r4.A05(r1)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.80j r1 = r0.A0d     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.80j r1 = r4.A09(r1, r2, r7)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            int r1 = r1.A00     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
        L_0x07d8:
            r24 = -1
            r23 = -1
            X.7Z2 r13 = new X.7Z2     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r21 = r13
            r22 = r1
            r26 = r23
            r21.<init>(r22, r23, r24, r26)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x081b
        L_0x07f2:
            java.lang.Object r1 = r9.first     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            int r2 = X.AnonymousClass0x7.A05(r1)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            java.lang.Object r1 = r9.second     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            long r4 = X.C18320x8.A05(r1)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.7bj r1 = r0.A0b     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.7Z2 r13 = r1.A04(r2, r4)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            int r2 = r13.A00     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r1 = -1
            if (r2 == r1) goto L_0x080a
            goto L_0x0819
        L_0x080a:
            java.lang.Object r1 = r9.second     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            long r1 = X.C18320x8.A05(r1)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            long r9 = r12.A01     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            int r14 = (r9 > r19 ? 1 : (r9 == r19 ? 0 : -1))
            r16 = 0
            if (r14 != 0) goto L_0x081d
            goto L_0x081b
        L_0x0819:
            r1 = 0
        L_0x081b:
            r16 = 1
        L_0x081d:
            X.8uE r9 = r0.A0C     // Catch:{ all -> 0x08a6 }
            if (r9 == 0) goto L_0x0885
            int r9 = r0.A02     // Catch:{ all -> 0x08a6 }
            if (r9 > 0) goto L_0x0885
            int r9 = (r1 > r19 ? 1 : (r1 == r19 ? 0 : -1))
            if (r9 != 0) goto L_0x0831
            r7 = 4
            r0.A0C(r7)     // Catch:{ all -> 0x08a6 }
            r0.A0N(r3, r6, r3)     // Catch:{ all -> 0x08a6 }
            goto L_0x088a
        L_0x0831:
            X.7nh r9 = r0.A09     // Catch:{ all -> 0x08a6 }
            X.7Z2 r9 = r9.A04     // Catch:{ all -> 0x08a6 }
            boolean r9 = r13.equals(r9)     // Catch:{ all -> 0x08a6 }
            if (r9 == 0) goto L_0x0866
            X.7bj r9 = r0.A0b     // Catch:{ all -> 0x08a6 }
            X.7a4 r10 = r9.A05     // Catch:{ all -> 0x08a6 }
            if (r10 == 0) goto L_0x0846
            int r9 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r9 == 0) goto L_0x0846
            goto L_0x0849
        L_0x0846:
            r21 = r1
            goto L_0x0851
        L_0x0849:
            X.8xB r8 = r10.A08     // Catch:{ all -> 0x08a6 }
            X.7jK r7 = r0.A0B     // Catch:{ all -> 0x08a6 }
            long r21 = r8.B4F(r7, r1)     // Catch:{ all -> 0x08a6 }
        L_0x0851:
            long r14 = com.facebook.android.exoplayer2.util.Util.A05(r21)     // Catch:{ all -> 0x08a6 }
            X.7nh r7 = r0.A09     // Catch:{ all -> 0x08a6 }
            long r7 = r7.A0D     // Catch:{ all -> 0x08a6 }
            long r8 = com.facebook.android.exoplayer2.util.Util.A05(r7)     // Catch:{ all -> 0x08a6 }
            int r7 = (r14 > r8 ? 1 : (r14 == r8 ? 0 : -1))
            if (r7 != 0) goto L_0x0868
            X.7nh r7 = r0.A09     // Catch:{ all -> 0x08a6 }
            long r7 = r7.A0D     // Catch:{ all -> 0x08a6 }
            goto L_0x088e
        L_0x0866:
            r21 = r1
        L_0x0868:
            X.7bj r7 = r0.A0b     // Catch:{ all -> 0x08a6 }
            X.7a4 r8 = r7.A05     // Catch:{ all -> 0x08a6 }
            X.7a4 r7 = r7.A06     // Catch:{ all -> 0x08a6 }
            boolean r24 = X.C18300x5.A1W(r8, r7)
            r19 = r0
            r20 = r13
            r23 = r3
            long r7 = r19.A03(r20, r21, r23, r24)     // Catch:{ all -> 0x08a6 }
            int r9 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r9 != 0) goto L_0x0882
            r17 = 0
        L_0x0882:
            r16 = r16 | r17
            goto L_0x088b
        L_0x0885:
            r0.A08 = r12     // Catch:{ all -> 0x08a6 }
            r7 = 0
            r0.A07 = r7     // Catch:{ all -> 0x08a6 }
        L_0x088a:
            r7 = r1
        L_0x088b:
            X.7nh r1 = r0.A09     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            goto L_0x0890
        L_0x088e:
            X.7nh r1 = r0.A09     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
        L_0x0890:
            r19 = r1
            r20 = r13
            r21 = r7
            r23 = r4
            X.7nh r1 = r19.A01(r20, r21, r23)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r0.A09 = r1     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            if (r16 == 0) goto L_0x0d4a
            r1 = 2
            r11.A00(r1)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            goto L_0x0d4a
        L_0x08a6:
            r8 = move-exception
            X.7nh r7 = r0.A09     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r19 = r7
            r20 = r13
            r21 = r1
            r23 = r4
            X.7nh r1 = r19.A01(r20, r21, r23)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r0.A09 = r1     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            if (r16 == 0) goto L_0x08bd
            r1 = 2
            r11.A00(r1)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
        L_0x08bd:
            throw r8     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
        L_0x08be:
            java.lang.Object r2 = r2.obj     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.7jX r2 = (X.C158167jX) r2     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.81z r1 = r0.A0X     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r1.Bmx(r2)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.821 r1 = r0.A0k     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            if (r1 == 0) goto L_0x08ce
            r1.Bmx(r2)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
        L_0x08ce:
            X.820 r1 = r0.A0i     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            if (r1 == 0) goto L_0x0d4a
            r1.Bmx(r2)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            goto L_0x0d4a
        L_0x08d7:
            java.lang.Object r1 = r2.obj     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.7jK r1 = (X.C158037jK) r1     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r0.A0B = r1     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            goto L_0x0d4a
        L_0x08df:
            int r1 = r2.arg1     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            boolean r1 = X.AnonymousClass000.A1S(r1)
            r0.A0M(r1, r6)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            goto L_0x0d4a
        L_0x08ea:
            java.lang.Object r7 = r2.obj     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.7Ip r7 = (X.C148497Ip) r7     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.8uE r2 = r7.A01     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.8uE r1 = r0.A0C     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            if (r2 != r1) goto L_0x0d4a
            X.7nh r15 = r0.A09     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            com.facebook.android.exoplayer2.Timeline r5 = r15.A03     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            com.facebook.android.exoplayer2.Timeline r4 = r7.A00     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            java.lang.Object r1 = r7.A02     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r25 = r1
            X.7bj r7 = r0.A0b     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r7.A07 = r4     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.7Z2 r1 = r15.A04     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r21 = r1
            long r8 = r15.A02     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            long r1 = r15.A01     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            int r10 = r15.A00     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r17 = r10
            boolean r10 = r15.A0A     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r16 = r10
            X.7yy r14 = r15.A05     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.7NU r13 = r15.A06     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.6xQ r12 = r15.A07     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            boolean r11 = r15.A09     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.7nh r10 = new X.7nh     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r19 = r10
            r20 = r4
            r22 = r14
            r23 = r13
            r24 = r12
            r26 = r17
            r27 = r8
            r29 = r1
            r31 = r16
            r32 = r11
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r29, r31, r32)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.C160477nh.A00(r15, r10)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r0.A09 = r10     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            java.util.ArrayList r8 = r0.A0l     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            int r2 = r8.size()     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
        L_0x093e:
            int r2 = r2 + -1
            if (r2 < 0) goto L_0x095d
            java.lang.Object r1 = r8.get(r2)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.8LV r1 = (X.AnonymousClass8LV) r1     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            boolean r1 = r0.A0Q(r1)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            if (r1 != 0) goto L_0x093e
            java.lang.Object r1 = r8.get(r2)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.8LV r1 = (X.AnonymousClass8LV) r1     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.7af r1 = r1.A03     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r1.A03(r3)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r8.remove(r2)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            goto L_0x093e
        L_0x095d:
            java.util.Collections.sort(r8)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            int r8 = r0.A02     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r33 = 0
            if (r8 <= 0) goto L_0x09c2
            X.7TG r2 = r0.A0Z     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            int r1 = r2.A01     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            int r1 = r1 + r8
            r2.A01 = r1     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r0.A02 = r3     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.7Iq r1 = r0.A08     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r8 = 0
            if (r1 == 0) goto L_0x0983
            android.util.Pair r2 = r0.A04(r1, r6)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r0.A08 = r8     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            if (r2 != 0) goto L_0x09b1
            goto L_0x0af7
        L_0x0983:
            X.7F1 r5 = r0.A07     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            if (r5 == 0) goto L_0x0995
            long r1 = r5.A00     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.7Z2 r9 = r5.A01     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r0.A07 = r8     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
        L_0x098d:
            X.7nh r7 = r0.A09     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            int r5 = r9.A00     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r4 = -1
            if (r5 == r4) goto L_0x09f5
            goto L_0x09e9
        L_0x0995:
            X.7nh r1 = r0.A09     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            long r1 = r1.A02     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            int r5 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r5 != 0) goto L_0x0d4a
            int r1 = r4.A01()     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            boolean r1 = X.AnonymousClass000.A1T(r1)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            if (r1 != 0) goto L_0x0af7
            boolean r1 = r0.A0R     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            int r1 = r4.A05(r1)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            android.util.Pair r2 = r0.A05(r4, r1)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
        L_0x09b1:
            java.lang.Object r1 = r2.first     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            int r4 = X.AnonymousClass0x7.A05(r1)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            java.lang.Object r1 = r2.second     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            long r1 = X.C18320x8.A05(r1)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.7Z2 r9 = r7.A04(r4, r1)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            goto L_0x098d
        L_0x09c2:
            X.7nh r2 = r0.A09     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.7Z2 r1 = r2.A04     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            int r10 = r1.A02     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            long r1 = r2.A01     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            int r8 = r5.A01()     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            boolean r8 = X.AnonymousClass000.A1T(r8)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            if (r8 == 0) goto L_0x09f8
            int r4 = r4.A01()     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            boolean r4 = X.AnonymousClass000.A1T(r4)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            if (r4 != 0) goto L_0x0d4a
            X.7Z2 r9 = r7.A04(r10, r1)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.7nh r7 = r0.A09     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            int r5 = r9.A00     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r4 = -1
            if (r5 == r4) goto L_0x09f5
        L_0x09e9:
            r8 = r9
            r9 = r33
            r11 = r1
            X.7nh r1 = r7.A01(r8, r9, r11)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r0.A09 = r1     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            goto L_0x0d4a
        L_0x09f5:
            r33 = r1
            goto L_0x09e9
        L_0x09f8:
            X.7a4 r8 = r7.A05     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            if (r8 != 0) goto L_0x0a35
            X.7a4 r8 = r7.A04     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            if (r8 != 0) goto L_0x0a35
            X.7Wk r9 = r0.A0c     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.7Wk r9 = r5.A08(r9, r10, r6)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            java.lang.Object r9 = r9.A04     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
        L_0x0a08:
            int r9 = r4.A04(r9)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r11 = -1
            if (r9 != r11) goto L_0x0a87
            int r1 = r0.A01(r5, r4, r10)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            if (r1 == r11) goto L_0x0af7
            X.7Wk r5 = r0.A0c     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.7Wk r1 = r4.A08(r5, r1, r3)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            int r1 = r1.A00     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            android.util.Pair r2 = r0.A05(r4, r1)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            java.lang.Object r1 = r2.first     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            int r12 = X.AnonymousClass0x7.A05(r1)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            java.lang.Object r1 = r2.second     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            long r1 = X.C18320x8.A05(r1)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.7Z2 r9 = r7.A04(r12, r1)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r4.A08(r5, r12, r6)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            goto L_0x0a38
        L_0x0a35:
            java.lang.Object r9 = r8.A0B     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            goto L_0x0a08
        L_0x0a38:
            if (r8 == 0) goto L_0x0adb
            java.lang.Object r13 = r5.A04     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
        L_0x0a3c:
            X.7Or r10 = r8.A02     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.7Z2 r4 = r10.A04     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.7Z2 r20 = r4.A00(r11)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            long r4 = r10.A03     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r23 = r4
            long r4 = r10.A02     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r25 = r4
            long r4 = r10.A00     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r27 = r4
            long r14 = r10.A01     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            boolean r4 = r10.A06     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r16 = r4
            boolean r4 = r10.A05     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r5 = r4
            X.7Or r4 = new X.7Or     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r19 = r4
            r21 = r23
            r23 = r25
            r25 = r27
            r27 = r14
            r29 = r16
            r30 = r5
            r19.<init>(r20, r21, r23, r25, r27, r29, r30)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
        L_0x0a6c:
            r8.A02 = r4     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.7a4 r8 = r8.A01     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            if (r8 == 0) goto L_0x0adb
            java.lang.Object r4 = r8.A0B     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            boolean r4 = r4.equals(r13)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            if (r4 == 0) goto L_0x0a3c
            X.7Or r5 = r8.A02     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.7Z2 r4 = r5.A04     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.7Z2 r4 = r4.A00(r12)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.7Or r4 = r7.A03(r5, r4)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            goto L_0x0a6c
        L_0x0a87:
            if (r9 == r10) goto L_0x0ac9
            X.7nh r12 = r0.A09     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            com.facebook.android.exoplayer2.Timeline r4 = r12.A03     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r20 = r4
            java.lang.Object r4 = r12.A08     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r25 = r4
            X.7Z2 r4 = r12.A04     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.7Z2 r21 = r4.A00(r9)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            long r14 = r12.A02     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            long r4 = r12.A01     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            int r8 = r12.A00     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r26 = r8
            boolean r8 = r12.A0A     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r31 = r8
            X.7yy r8 = r12.A05     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r17 = r8
            X.7NU r8 = r12.A06     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r16 = r8
            X.6xQ r13 = r12.A07     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            boolean r10 = r12.A09     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.7nh r8 = new X.7nh     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r19 = r8
            r22 = r17
            r23 = r16
            r24 = r13
            r27 = r14
            r29 = r4
            r32 = r10
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r29, r31, r32)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.C160477nh.A00(r12, r8)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r0.A09 = r8     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
        L_0x0ac9:
            X.7nh r4 = r0.A09     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.7Z2 r5 = r4.A04     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            int r4 = r5.A00     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            if (r4 == r11) goto L_0x0b00
            X.7Z2 r9 = r7.A04(r9, r1)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            boolean r4 = r9.equals(r5)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            if (r4 != 0) goto L_0x0b00
        L_0x0adb:
            int r4 = r9.A00     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            if (r4 != r11) goto L_0x0ae1
            r33 = r1
        L_0x0ae1:
            X.7a4 r5 = r7.A05     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.7a4 r4 = r7.A06     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            boolean r36 = X.C18300x5.A1W(r5, r4)
            r31 = r0
            r32 = r9
            r35 = r3
            long r33 = r31.A03(r32, r33, r35, r36)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.7nh r7 = r0.A09     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            goto L_0x09e9
        L_0x0af7:
            r1 = 4
            r0.A0C(r1)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r0.A0N(r3, r6, r3)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            goto L_0x0d4a
        L_0x0b00:
            long r14 = r0.A06     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            int r13 = r5.A02     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.7a4 r12 = r7.A05     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            if (r12 != 0) goto L_0x0b0c
            X.7a4 r12 = r7.A04     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r10 = 0
            goto L_0x0b3e
        L_0x0b0c:
            X.7Or r2 = r12.A02     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.7Z2 r1 = r2.A04     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.7Z2 r1 = r1.A00(r13)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.7Or r1 = r7.A03(r2, r1)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r12.A02 = r1     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
        L_0x0b1a:
            X.7Or r1 = r12.A02     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            boolean r1 = r1.A06     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            if (r1 == 0) goto L_0x0b3a
            com.facebook.android.exoplayer2.Timeline r8 = r7.A07     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.7Wk r5 = r7.A0A     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.80j r4 = r7.A0B     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            int r2 = r7.A01     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            boolean r1 = r7.A09     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r19 = r8
            r20 = r5
            r21 = r4
            r22 = r13
            r23 = r2
            r24 = r1
            int r13 = r19.A03(r20, r21, r22, r23, r24)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
        L_0x0b3a:
            X.7a4 r1 = r12.A01     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r10 = r12
            r12 = r1
        L_0x0b3e:
            if (r12 == 0) goto L_0x0d4a
            if (r10 == 0) goto L_0x0b0c
            if (r13 == r11) goto L_0x0b85
            java.lang.Object r4 = r12.A0B     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            com.facebook.android.exoplayer2.Timeline r2 = r7.A07     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.7Wk r1 = r7.A0A     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.7Wk r1 = r2.A08(r1, r13, r6)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            java.lang.Object r1 = r1.A04     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            boolean r1 = r4.equals(r1)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            if (r1 == 0) goto L_0x0b85
            X.7Or r9 = r7.A02(r10, r14)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            if (r9 == 0) goto L_0x0b85
            X.7Or r2 = r12.A02     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.7Z2 r1 = r2.A04     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.7Z2 r1 = r1.A00(r13)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.7Or r8 = r7.A03(r2, r1)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r12.A02 = r8     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            long r4 = r8.A03     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            long r1 = r9.A03     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            int r16 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r16 != 0) goto L_0x0b85
            long r4 = r8.A02     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            long r1 = r9.A02     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            int r16 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r16 != 0) goto L_0x0b85
            X.7Z2 r2 = r8.A04     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.7Z2 r1 = r9.A04     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            boolean r1 = r2.equals(r1)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            if (r1 == 0) goto L_0x0b85
            goto L_0x0b1a
        L_0x0b85:
            boolean r1 = r7.A08(r10)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r1 = r1 ^ 1
            if (r1 != 0) goto L_0x0d4a
            r0.A0K(r3)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            goto L_0x0d4a
        L_0x0b92:
            java.lang.Object r2 = r2.obj     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.8xB r2 = (X.C187418xB) r2     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.7bj r8 = r0.A0b     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.7a4 r7 = r8.A04     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            if (r7 == 0) goto L_0x0d4a
            X.8xB r1 = r7.A08     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            if (r1 != r2) goto L_0x0d4a
            X.81z r1 = r0.A0X     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r1.BBQ()     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r7.A07 = r6     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.8xB r1 = r7.A08     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.7yy r1 = r1.BDs()     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r7.A03 = r1     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r7.A02()     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.7Or r1 = r7.A02     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            long r1 = r1.A03     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.8sM[] r4 = r7.A0C     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            int r4 = r4.length     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            boolean[] r4 = new boolean[r4]     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            long r21 = r7.A00(r4, r1, r3)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            long r4 = r7.A00     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.7Or r9 = r7.A02     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            long r1 = r9.A03     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            long r1 = r1 - r21
            long r4 = r4 + r1
            r7.A00 = r4     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.7Z2 r14 = r9.A04     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            long r10 = r9.A02     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            long r4 = r9.A00     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            long r1 = r9.A01     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            boolean r12 = r9.A06     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            boolean r13 = r9.A05     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.7Or r9 = new X.7Or     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r19 = r9
            r20 = r14
            r23 = r10
            r25 = r4
            r27 = r1
            r29 = r12
            r30 = r13
            r19.<init>(r20, r21, r23, r25, r27, r29, r30)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r7.A02 = r9     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.7yy r5 = r7.A03     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.7NU r1 = r7.A05     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.8v7 r4 = r0.A0a     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.8x9[] r2 = r0.A0r     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.8xC[] r1 = r1.A04     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r4.BeT(r5, r2, r1)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.7a4 r1 = r8.A05     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            if (r1 != 0) goto L_0x0c0b
            X.7a4 r1 = r8.A00()     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.7Or r1 = r1.A02     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            long r1 = r1.A03     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r0.A0D(r1)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r1 = 0
            r0.A0F(r1)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
        L_0x0c0b:
            boolean r1 = r0.A0I     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            if (r1 != 0) goto L_0x0c14
            boolean r1 = r0.A0L     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r2 = 2
            if (r1 == 0) goto L_0x0c15
        L_0x0c14:
            r2 = 0
        L_0x0c15:
            boolean r1 = r0.A0o     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r0.A0B(r2, r1)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            boolean r2 = r0.A0L     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.7a4 r1 = r8.A04     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            if (r1 == 0) goto L_0x0c34
            X.8xB r1 = r1.A08     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r1.Bmw(r2)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            goto L_0x0c34
        L_0x0c26:
            java.lang.Object r2 = r2.obj     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.8xB r2 = (X.C187418xB) r2     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.7bj r1 = r0.A0b     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.7a4 r1 = r1.A04     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            if (r1 == 0) goto L_0x0d4a
            X.8xB r1 = r1.A08     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            if (r1 != r2) goto L_0x0d4a
        L_0x0c34:
            r0.A0J(r3)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            goto L_0x0d4a
        L_0x0c39:
            int r2 = r2.arg1     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r0.A03 = r2     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.7bj r1 = r0.A0b     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r1.A01 = r2     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            boolean r1 = r1.A07()     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            if (r1 != 0) goto L_0x0d4a
            goto L_0x0c5a
        L_0x0c48:
            int r1 = r2.arg1     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            boolean r2 = X.AnonymousClass000.A1S(r1)
            r0.A0R = r2     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.7bj r1 = r0.A0b     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r1.A09 = r2     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            boolean r1 = r1.A07()     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            if (r1 != 0) goto L_0x0d4a
        L_0x0c5a:
            r0.A0K(r6)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            goto L_0x0d4a
        L_0x0c5f:
            java.lang.Object r5 = r2.obj     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.7af r5 = (X.C153097af) r5     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            long r1 = r5.A02     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r4 != 0) goto L_0x0c73
            r0.A0H(r5)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            goto L_0x0d4a
        L_0x0c73:
            X.8uE r1 = r0.A0C     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            if (r1 == 0) goto L_0x0cc3
            int r1 = r0.A02     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            if (r1 > 0) goto L_0x0cc3
            X.8LV r2 = new X.8LV     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r2.<init>(r5)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            boolean r1 = r0.A0Q(r2)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            if (r1 == 0) goto L_0x0ca7
            java.util.ArrayList r1 = r0.A0l     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r1.add(r2)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            java.util.Collections.sort(r1)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            goto L_0x0d4a
        L_0x0c90:
            java.lang.Object r5 = r2.obj     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.7af r5 = (X.C153097af) r5     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            android.os.Looper r4 = r5.A03     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            java.lang.Thread r1 = r4.getThread()     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            boolean r1 = r1.isAlive()     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            if (r1 != 0) goto L_0x0cac
            java.lang.String r2 = "TAG"
            java.lang.String r1 = "Trying to send message on a dead thread."
            android.util.Log.w(r2, r1)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
        L_0x0ca7:
            r5.A03(r3)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            goto L_0x0d4a
        L_0x0cac:
            r1 = 0
            android.os.Handler r2 = new android.os.Handler     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r2.<init>(r4, r1)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.7nD r1 = new X.7nD     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r1.<init>(r2)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.8MF r2 = new X.8MF     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r2.<init>(r0, r3, r5)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            android.os.Handler r1 = r1.A00     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r1.post(r2)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            goto L_0x0d4a
        L_0x0cc3:
            java.util.ArrayList r2 = r0.A0l     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.8LV r1 = new X.8LV     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r1.<init>(r5)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r2.add(r1)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            goto L_0x0d4a
        L_0x0cce:
            java.lang.Object r9 = r2.obj     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.7F1 r9 = (X.AnonymousClass7F1) r9     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            long r4 = r9.A00     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.7bj r10 = r0.A0b     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.7a4 r1 = r10.A05     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            if (r1 == 0) goto L_0x0d4a
            X.8xB r2 = r1.A08     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.7jK r1 = X.C158037jK.A02     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            long r1 = r2.B4F(r1, r4)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            long r7 = r1 - r4
            long r13 = java.lang.Math.abs(r7)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r11 = 1200000(0x124f80, double:5.92879E-318)
            int r4 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r4 <= 0) goto L_0x0d02
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            java.lang.String r1 = "Unable to find keyframe, skip fast seek. Distance: "
            java.lang.String r2 = X.AnonymousClass000.A0Z(r1, r2, r7)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r1 = r18
            android.util.Log.d(r1, r2)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.7nh r1 = r0.A09     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            long r1 = r1.A0D     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
        L_0x0d02:
            X.7a4 r10 = r10.A05     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            if (r10 != 0) goto L_0x0d09
            r12 = 0
            goto L_0x0d14
        L_0x0d09:
            long r4 = r0.A06     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            long r7 = r10.A00     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            long r4 = r4 - r7
            X.8xB r7 = r10.A08     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            long r12 = r7.B4w(r4)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
        L_0x0d14:
            long r4 = r0.A02()     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            long r12 = r12 + r4
            X.8v7 r5 = r0.A0a     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.81z r4 = r0.A0X     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.7jX r4 = r4.BBQ()     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            float r4 = r4.A01     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r15 = r3
            r10 = r5
            r11 = r4
            r14 = r3
            boolean r4 = r10.BoZ(r11, r12, r14, r15)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            if (r4 != 0) goto L_0x0d38
            java.lang.String r2 = "Can't start playback now, skip fast seek"
            r1 = r18
            android.util.Log.d(r1, r2)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.7nh r1 = r0.A09     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            long r1 = r1.A0D     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
        L_0x0d38:
            X.7Z2 r5 = r9.A01     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.7F1 r4 = new X.7F1     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r4.<init>(r5, r1)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r0.A0E(r4, r6)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            goto L_0x0d4a
        L_0x0d43:
            java.lang.Object r1 = r2.obj     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            X.7F1 r1 = (X.AnonymousClass7F1) r1     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            r0.A0E(r1, r3)     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
        L_0x0d4a:
            r0.A06()     // Catch:{ 6JW -> 0x0d62, IOException -> 0x0d4e, RuntimeException -> 0x0d70 }
            return r6
        L_0x0d4e:
            r4 = move-exception
            java.lang.String r2 = "Source error."
            r1 = r18
            android.util.Log.e(r1, r2, r4)
            r0.A0M(r3, r3)
            android.os.Handler r5 = r0.A0V
            r1 = 2000(0x7d0, float:2.803E-42)
            X.6JW r4 = X.AnonymousClass6JW.A00(r4, r3, r1)
            goto L_0x0d84
        L_0x0d62:
            r4 = move-exception
            java.lang.String r2 = "Playback error."
            r1 = r18
            android.util.Log.e(r1, r2, r4)
            r0.A0M(r3, r3)
            android.os.Handler r5 = r0.A0V
            goto L_0x0d84
        L_0x0d70:
            r4 = move-exception
            java.lang.String r2 = "Internal runtime error."
            r1 = r18
            android.util.Log.e(r1, r2, r4)
            r0.A0M(r3, r3)
            android.os.Handler r5 = r0.A0V
            r2 = 2
            r1 = 1000(0x3e8, float:1.401E-42)
            X.6JW r4 = X.AnonymousClass6JW.A00(r4, r2, r1)
        L_0x0d84:
            r1 = 2
            X.C18290x4.A1C(r5, r4, r1)
            r0.A06()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass81Q.handleMessage(android.os.Message):boolean");
    }

    public AnonymousClass81Q(Handler handler, C153737br r17, C186328v7 r18, C159967mm r19, AnonymousClass7FC r20, AnonymousClass7NU r21, C177658gE r22, C186588vc r23, C187398x9[] r24, int i, int i2, long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        C187398x9[] r4 = r24;
        this.A0r = r4;
        AnonymousClass7FC r6 = r20;
        this.A0e = r6;
        AnonymousClass7NU r12 = r21;
        this.A0f = r12;
        C186328v7 r9 = r18;
        this.A0a = r9;
        C177658gE r7 = r22;
        this.A0g = r7;
        this.A0L = z;
        this.A03 = i;
        this.A0R = false;
        this.A0V = handler;
        this.A0Y = r17;
        C186588vc r5 = r23;
        this.A0h = r5;
        this.A0b = new C153657bj();
        this.A0Q = z2;
        this.A0F = z3;
        this.A0E = z4;
        this.A0I = z5;
        this.A0G = z6;
        this.A0P = z7;
        this.A0U = j;
        this.A0m = z8;
        this.A00 = i2;
        this.A0q = z10;
        this.A0p = z9;
        this.A0o = z11;
        this.A0K = z12;
        this.A0M = z13;
        this.A0H = z14;
        this.A0J = AnonymousClass001.A1W((j > 0 ? 1 : (j == 0 ? 0 : -1)));
        this.A0T = r9.B4a();
        this.A0n = r9.BkE();
        this.A0B = C158037jK.A03;
        this.A09 = new C160477nh(Timeline.A00, C166607yy.A03, r12, -9223372036854775807L);
        AnonymousClass821 r10 = null;
        this.A0Z = new AnonymousClass7TG();
        int length = r4.length;
        C184688sM[] r8 = new C184688sM[length];
        this.A0s = r8;
        for (int i3 = 0; i3 < length; i3++) {
            C1673180p r0 = r24[i3];
            r0.A00 = i3;
            r0.A05 = r19;
            r8[i3] = r0;
        }
        this.A0X = new C1676681z(this, r5);
        this.A0i = new AnonymousClass820(r5);
        this.A0k = z10 ? new AnonymousClass821(r5) : r10;
        this.A0l = AnonymousClass001.A0s();
        this.A0S = new C187398x9[0];
        this.A0d = new C1672580j();
        this.A0c = new C151817Wk();
        r6.A00 = this;
        r6.A01 = r7;
        HandlerThread handlerThread = new HandlerThread("ExoPlayerImplInternal:Handler", -16);
        this.A0W = handlerThread;
        this.A0j = new C160207nD(new Handler(AnonymousClass6C9.A0S(handlerThread), this));
    }
}
