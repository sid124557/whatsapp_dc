package X;

import com.facebook.android.exoplayer2.decoder.SimpleOutputBuffer;
import java.util.ArrayDeque;

/* renamed from: X.7a2  reason: invalid class name and case insensitive filesystem */
public abstract class C152737a2 {
    public int A00;
    public int A01;
    public int A02;
    public C143656zG A03;
    public AnonymousClass6Jl A04;
    public boolean A05;
    public boolean A06;
    public final Object A07 = AnonymousClass002.A0D();
    public final Thread A08;
    public final ArrayDeque A09 = AnonymousClass6CA.A0a();
    public final ArrayDeque A0A = AnonymousClass6CA.A0a();
    public final AnonymousClass6Jl[] A0B;
    public final SimpleOutputBuffer[] A0C;

    public abstract C143656zG A00(AnonymousClass6Jl r1, SimpleOutputBuffer simpleOutputBuffer, boolean z);

    public void A01() {
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

    public final void A02(AnonymousClass6Jl r3) {
        Object obj = this.A07;
        synchronized (obj) {
            C143656zG r0 = this.A03;
            if (r0 == null) {
                C159197lM.A01(AnonymousClass000.A1Y(r3, this.A04));
                ArrayDeque arrayDeque = this.A09;
                arrayDeque.addLast(r3);
                if (!arrayDeque.isEmpty() && this.A01 > 0) {
                    obj.notify();
                }
                this.A04 = null;
            } else {
                throw r0;
            }
        }
    }

    public C152737a2(AnonymousClass6Jl[] r6, SimpleOutputBuffer[] simpleOutputBufferArr) {
        this.A0B = r6;
        this.A00 = r6.length;
        for (int i = 0; i < this.A00; i++) {
            this.A0B[i] = new AnonymousClass6Jl(2);
        }
        this.A0C = simpleOutputBufferArr;
        int length = simpleOutputBufferArr.length;
        this.A01 = length;
        for (int i2 = 0; i2 < length; i2++) {
            simpleOutputBufferArr[i2] = new SimpleOutputBuffer(this);
        }
        C173708Ri r0 = new C173708Ri(this);
        this.A08 = r0;
        r0.start();
    }
}
