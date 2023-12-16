package X;

import android.util.Log;
import java.nio.ByteBuffer;
import java.util.AbstractCollection;
import java.util.ArrayDeque;
import java.util.PriorityQueue;

/* renamed from: X.88O  reason: invalid class name */
public abstract class AnonymousClass88O implements C187598xV {
    public long A00;
    public long A01;
    public C126726Pb A02;
    public final ArrayDeque A03 = AnonymousClass6CA.A0a();
    public final ArrayDeque A04;
    public final PriorityQueue A05;

    public void A02(C126476Oa r12) {
        AnonymousClass7M8 r4;
        byte[] bArr;
        int i;
        C126756Pe r5 = (C126756Pe) this;
        ByteBuffer byteBuffer = r12.A01;
        byteBuffer.getClass();
        byte[] array = byteBuffer.array();
        C161467pi r6 = r5.A08;
        r6.A0U(array, byteBuffer.limit());
        while (C161467pi.A00(r6) >= 3) {
            int A0C = r6.A0C() & 7;
            int i2 = A0C & 3;
            boolean A1U = AnonymousClass000.A1U(A0C & 4, 4);
            byte A0C2 = (byte) r6.A0C();
            byte A0C3 = (byte) r6.A0C();
            if ((i2 == 2 || i2 == 3) && A1U) {
                if (i2 == 3) {
                    r5.A04();
                    int i3 = (A0C2 & 192) >> 6;
                    int i4 = r5.A01;
                    if (!(i4 == -1 || i3 == (i4 + 1) % 4)) {
                        r5.A05();
                        StringBuilder A0o = AnonymousClass001.A0o();
                        A0o.append("Sequence number discontinuity. previous=");
                        A0o.append(r5.A01);
                        AnonymousClass6C7.A1I(" current=", "Cea708Decoder", A0o, i3);
                    }
                    r5.A01 = i3;
                    byte b = A0C2 & 63;
                    if (b == 0) {
                        b = 64;
                    }
                    r4 = new AnonymousClass7M8(i3, b);
                    r5.A03 = r4;
                    bArr = r4.A03;
                    i = r4.A00;
                } else {
                    r4 = r5.A03;
                    if (r4 == null) {
                        Log.e("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                    } else {
                        bArr = r4.A03;
                        int i5 = r4.A00;
                        i = i5 + 1;
                        bArr[i5] = A0C2;
                    }
                }
                int i6 = i + 1;
                r4.A00 = i6;
                bArr[i] = A0C3;
                if (i6 == (r4.A01 * 2) - 1) {
                    r5.A04();
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0036, code lost:
        r4.clear();
        r8.A03.add(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003e, code lost:
        return r5;
     */
    /* renamed from: A01 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C126506Oe B1V() {
        /*
            r8 = this;
            java.util.ArrayDeque r6 = r8.A04
            boolean r0 = r6.isEmpty()
            r5 = 0
            if (r0 == 0) goto L_0x000a
        L_0x0009:
            return r5
        L_0x000a:
            java.util.PriorityQueue r7 = r8.A05
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x0009
            java.lang.Object r0 = r7.peek()
            X.6Oc r0 = (X.C126496Oc) r0
            long r3 = r0.A00
            long r1 = r8.A00
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0009
            java.lang.Object r4 = r7.poll()
            X.6Oa r4 = (X.C126476Oa) r4
            boolean r0 = X.C153567bZ.A00(r4)
            if (r0 == 0) goto L_0x003f
            java.lang.Object r5 = r6.pollFirst()
            X.6Oe r5 = (X.C126506Oe) r5
            r0 = 4
            r5.addFlag(r0)
        L_0x0036:
            r4.clear()
            java.util.ArrayDeque r0 = r8.A03
            r0.add(r4)
            return r5
        L_0x003f:
            r8.A02(r4)
            r3 = r8
            boolean r2 = r8 instanceof X.C126756Pe
            if (r2 == 0) goto L_0x007a
            r0 = r3
            X.6Pe r0 = (X.C126756Pe) r0
            java.util.List r1 = r0.A04
            java.util.List r0 = r0.A05
            boolean r0 = X.C18300x5.A1W(r1, r0)
        L_0x0052:
            if (r0 == 0) goto L_0x0086
            if (r2 == 0) goto L_0x0073
            X.6Pe r3 = (X.C126756Pe) r3
            java.util.List r0 = r3.A04
            r3.A05 = r0
        L_0x005c:
            r0.getClass()
            X.88F r2 = new X.88F
            r2.<init>(r0)
            java.lang.Object r5 = r6.pollFirst()
            X.6Oe r5 = (X.C126506Oe) r5
            long r0 = r4.A00
            r5.timeUs = r0
            r5.A01 = r2
            r5.A00 = r0
            goto L_0x0036
        L_0x0073:
            X.6Pf r3 = (X.C126766Pf) r3
            java.util.List r0 = r3.A07
            r3.A08 = r0
            goto L_0x005c
        L_0x007a:
            r0 = r3
            X.6Pf r0 = (X.C126766Pf) r0
            java.util.List r1 = r0.A07
            java.util.List r0 = r0.A08
            boolean r0 = X.C18300x5.A1W(r1, r0)
            goto L_0x0052
        L_0x0086:
            r4.clear()
            java.util.ArrayDeque r0 = r8.A03
            r0.add(r4)
            goto L_0x000a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass88O.B1V():X.6Oe");
    }

    public /* bridge */ /* synthetic */ Object B1R() {
        C161487pm.A04(AnonymousClass000.A1X(this.A02));
        ArrayDeque arrayDeque = this.A03;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        C126726Pb r0 = (C126726Pb) arrayDeque.pollFirst();
        this.A02 = r0;
        return r0;
    }

    public /* bridge */ /* synthetic */ void Bi7(Object obj) {
        AbstractCollection abstractCollection;
        C126476Oa r5 = (C126476Oa) obj;
        C161487pm.A03(AnonymousClass000.A1Y(r5, this.A02));
        C126726Pb r52 = (C126726Pb) r5;
        if (AnonymousClass000.A1U(r52.flags & Integer.MIN_VALUE, Integer.MIN_VALUE)) {
            r52.clear();
            abstractCollection = this.A03;
        } else {
            long j = this.A01;
            this.A01 = 1 + j;
            r52.A00 = j;
            abstractCollection = this.A05;
        }
        abstractCollection.add(r52);
        this.A02 = null;
    }

    public void Bn1(long j) {
        this.A00 = j;
    }

    public void flush() {
        this.A01 = 0;
        this.A00 = 0;
        while (true) {
            PriorityQueue priorityQueue = this.A05;
            if (priorityQueue.isEmpty()) {
                break;
            }
            C153567bZ r1 = (C153567bZ) priorityQueue.poll();
            r1.clear();
            this.A03.add(r1);
        }
        C126726Pb r12 = this.A02;
        if (r12 != null) {
            r12.clear();
            this.A03.add(r12);
            this.A02 = null;
        }
    }

    public String getName() {
        if (this instanceof C126756Pe) {
            return "Cea708Decoder";
        }
        return "Cea608Decoder";
    }

    public void release() {
    }

    public AnonymousClass88O() {
        int i = 0;
        int i2 = 0;
        do {
            this.A03.add(new C126726Pb());
            i2++;
        } while (i2 < 10);
        this.A04 = AnonymousClass6CA.A0a();
        do {
            this.A04.add(new C126746Pd(new C1897892q(this, 2)));
            i++;
        } while (i < 2);
        this.A05 = new PriorityQueue();
    }
}
