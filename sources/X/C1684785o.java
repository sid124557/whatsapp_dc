package X;

import android.content.Context;
import android.media.MediaCodec;
import java.nio.ByteBuffer;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* renamed from: X.85o  reason: invalid class name and case insensitive filesystem */
public class C1684785o implements C186228ux {
    public AnonymousClass7RI A00;
    public Future A01;
    public boolean A02;
    public final Context A03;
    public final MediaCodec.BufferInfo A04;
    public final C180608lL A05;
    public final C158667kM A06;
    public final C186208uv A07;
    public final AnonymousClass7QR A08;
    public final ByteBuffer A09;
    public final ExecutorService A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final byte[] A0D = new byte[7];

    public void cancel() {
        this.A02 = true;
        Future future = this.A01;
        if (future != null) {
            if (!future.isDone()) {
                this.A01.cancel(true);
            }
            try {
                this.A01.get();
            } catch (Throwable unused) {
            }
        }
        release();
    }

    public void B1y(long j) {
    }

    public boolean BHF() {
        Future future = this.A01;
        if (future == null || !future.isDone()) {
            return false;
        }
        this.A01.get();
        return true;
    }

    public void BjW(long j) {
    }

    public boolean BpL() {
        C1683385a A002 = this.A00.A00.A00(5000);
        if (A002 == null) {
            return false;
        }
        A002.Blq(0, 0, 0, 4);
        this.A00.A00.A03(A002);
        return true;
    }

    public void BpW(C160227nH r10, int i) {
        C142366x5 r3 = C142366x5.AUDIO;
        long A002 = C153977cN.A00(this.A03, this.A05, r3, this.A08);
        this.A01 = this.A0A.submit(new AnonymousClass91G(r10, this, i, 0, A002));
    }

    public void BsQ() {
        Future future = this.A01;
        if (future != null) {
            future.get();
        }
    }

    public void flush() {
        this.A00.A00.A04.flush();
    }

    public void release() {
        AnonymousClass7VY r2 = new AnonymousClass7VY();
        try {
            AnonymousClass7RI r0 = this.A00;
            AnonymousClass7VY r1 = new AnonymousClass7VY();
            AnonymousClass7B2.A00(r1, r0.A00);
            Throwable th = r1.A01;
            if (th != null) {
                throw th;
            }
        } catch (Throwable th2) {
            r2.A00(th2);
        }
        Throwable th3 = r2.A01;
        if (th3 != null) {
            throw th3;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0023, code lost:
        if (r1 != false) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C1684785o(android.content.Context r3, X.C180608lL r4, X.C158667kM r5, X.C147747Fo r6, X.C150307Qc r7, X.AnonymousClass7QR r8, java.lang.String r9, java.util.concurrent.ExecutorService r10) {
        /*
            r2 = this;
            r2.<init>()
            r0 = 7
            byte[] r0 = new byte[r0]
            r2.A0D = r0
            r2.A06 = r5
            r2.A08 = r8
            r2.A0A = r10
            r2.A05 = r4
            r2.A03 = r3
            boolean r1 = r7.A00()
            r2.A0B = r1
            java.lang.String r0 = ".aac"
            boolean r0 = r9.endsWith(r0)
            r2.A0C = r0
            if (r0 != 0) goto L_0x0025
            r0 = 0
            if (r1 == 0) goto L_0x0032
        L_0x0025:
            r0 = 1048576(0x100000, float:1.469368E-39)
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocateDirect(r0)
            r2.A09 = r0
            android.media.MediaCodec$BufferInfo r0 = new android.media.MediaCodec$BufferInfo
            r0.<init>()
        L_0x0032:
            r2.A04 = r0
            boolean r0 = r6.A01
            r1 = r0 ^ 1
            java.lang.String r0 = "PlatformBasedCodecMuxer cannot be used to produce fragMp4"
            X.C159297la.A02(r1, r0)
            X.85b r0 = new X.85b
            r0.<init>()
            r2.A07 = r0
            r0.AzR(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1684785o.<init>(android.content.Context, X.8lL, X.7kM, X.7Fo, X.7Qc, X.7QR, java.lang.String, java.util.concurrent.ExecutorService):void");
    }
}
