package X;

import com.google.android.exoplayer2.decoder.SimpleOutputBuffer;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;

/* renamed from: X.86D  reason: invalid class name */
public abstract class AnonymousClass86D implements C185818uI {
    public int A00;
    public int A01;
    public int A02;
    public C143896ze A03;
    public C126496Oc A04;
    public boolean A05;
    public boolean A06;
    public final Object A07 = AnonymousClass002.A0D();
    public final Thread A08;
    public final ArrayDeque A09 = AnonymousClass6CA.A0a();
    public final ArrayDeque A0A = AnonymousClass6CA.A0a();
    public final C126496Oc[] A0B;
    public final AnonymousClass6OV[] A0C;

    public C143896ze A03(C126496Oc r8, AnonymousClass6OV r9, boolean z) {
        C126516Og r2 = (C126516Og) this;
        C126476Oa r82 = (C126476Oa) r8;
        C126506Oe r92 = (C126506Oe) r9;
        try {
            ByteBuffer byteBuffer = r82.A01;
            byteBuffer.getClass();
            C185358tW A042 = r2.A04(byteBuffer.array(), byteBuffer.limit(), z);
            long j = r82.A00;
            long j2 = r82.A00;
            r92.timeUs = j;
            r92.A01 = A042;
            if (j2 != Long.MAX_VALUE) {
                j = j2;
            }
            r92.A00 = j;
            r92.clearFlag(Integer.MIN_VALUE);
            return null;
        } catch (AnonymousClass6OY e) {
            return e;
        }
    }

    public /* bridge */ /* synthetic */ Object B1R() {
        C126496Oc r0;
        synchronized (this.A07) {
            C143896ze r02 = this.A03;
            if (r02 == null) {
                C161487pm.A04(AnonymousClass000.A1X(this.A04));
                int i = this.A00;
                if (i == 0) {
                    r0 = null;
                } else {
                    C126496Oc[] r03 = this.A0B;
                    int i2 = i - 1;
                    this.A00 = i2;
                    r0 = r03[i2];
                }
                this.A04 = r0;
            } else {
                throw r02;
            }
        }
        return r0;
    }

    public /* bridge */ /* synthetic */ Object B1V() {
        synchronized (this.A07) {
            C143896ze r0 = this.A03;
            if (r0 == null) {
                ArrayDeque arrayDeque = this.A0A;
                if (arrayDeque.isEmpty()) {
                    return null;
                }
                AnonymousClass6OV r02 = (AnonymousClass6OV) arrayDeque.removeFirst();
                return r02;
            }
            throw r0;
        }
    }

    public /* bridge */ /* synthetic */ void Bi7(Object obj) {
        Object obj2 = this.A07;
        synchronized (obj2) {
            C143896ze r0 = this.A03;
            if (r0 == null) {
                C161487pm.A03(AnonymousClass000.A1Y(obj, this.A04));
                ArrayDeque arrayDeque = this.A09;
                arrayDeque.addLast(obj);
                if (!arrayDeque.isEmpty() && this.A01 > 0) {
                    obj2.notify();
                }
                this.A04 = null;
            } else {
                throw r0;
            }
        }
    }

    public final void flush() {
        synchronized (this.A07) {
            this.A05 = true;
            this.A02 = 0;
            C126496Oc r3 = this.A04;
            if (r3 != null) {
                r3.clear();
                C126496Oc[] r2 = this.A0B;
                int i = this.A00;
                this.A00 = i + 1;
                r2[i] = r3;
                this.A04 = null;
            }
            while (true) {
                ArrayDeque arrayDeque = this.A09;
                if (arrayDeque.isEmpty()) {
                    break;
                }
                C126496Oc r32 = (C126496Oc) arrayDeque.removeFirst();
                r32.clear();
                C126496Oc[] r22 = this.A0B;
                int i2 = this.A00;
                this.A00 = i2 + 1;
                r22[i2] = r32;
            }
            while (true) {
                ArrayDeque arrayDeque2 = this.A0A;
                if (!arrayDeque2.isEmpty()) {
                    ((AnonymousClass6OV) arrayDeque2.removeFirst()).release();
                }
            }
        }
    }

    public void release() {
        Object obj = this.A07;
        synchronized (obj) {
            this.A06 = true;
            obj.notify();
        }
        try {
            this.A08.join();
        } catch (InterruptedException unused) {
            C18300x5.A11();
        }
    }

    public AnonymousClass86D(C126496Oc[] r6, AnonymousClass6OV[] r7) {
        AnonymousClass6OV simpleOutputBuffer;
        C126496Oc r1;
        this.A0B = r6;
        this.A00 = r6.length;
        for (int i = 0; i < this.A00; i++) {
            C126496Oc[] r2 = this.A0B;
            if (this instanceof C126516Og) {
                r1 = new C126476Oa();
            } else {
                r1 = new C126496Oc(2);
            }
            r2[i] = r1;
        }
        this.A0C = r7;
        int length = r7.length;
        this.A01 = length;
        for (int i2 = 0; i2 < length; i2++) {
            if (this instanceof C126516Og) {
                simpleOutputBuffer = new C126736Pc(new C1897892q(this, 1));
            } else {
                simpleOutputBuffer = new SimpleOutputBuffer(new C1897892q(this, 0));
            }
            r7[i2] = simpleOutputBuffer;
        }
        C173728Rl r0 = new C173728Rl(this);
        this.A08 = r0;
        r0.start();
    }
}
