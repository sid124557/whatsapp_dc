package X;

import android.media.MediaFormat;
import android.os.Process;
import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* renamed from: X.85n  reason: invalid class name and case insensitive filesystem */
public class C1684685n implements C186348v9 {
    public int A00;
    public C158247jf A01;
    public C149317Lz A02;
    public AnonymousClass7M1 A03;
    public AnonymousClass8U0 A04 = new AnonymousClass8U0();
    public boolean A05;
    public boolean A06;
    public final int A07 = ((int) TimeUnit.MILLISECONDS.toMicros(250));
    public final C180608lL A08;
    public final C158667kM A09;
    public final C1445471z A0A;
    public final AnonymousClass720 A0B;
    public final C147757Fp A0C;
    public final AnonymousClass7QR A0D;
    public final C183838qk A0E;
    public final ExecutorService A0F;
    public volatile long A0G;
    public volatile C160727oD A0H;
    public volatile C186218uw A0I;
    public volatile Future A0J;
    public volatile boolean A0K;
    public volatile boolean A0L;
    public volatile boolean A0M;

    public void AzQ(int i) {
        AnonymousClass7M1 r0;
        C1445171w.A00("VideoDemuxDecodeWrapperTag", "configure", new Object[0]);
        this.A00 = i;
        C180608lL r2 = this.A08;
        AnonymousClass720 r1 = this.A0B;
        AnonymousClass7QR r11 = this.A0D;
        C151367Um r9 = r11.A07;
        this.A0H = new C160727oD(r2, r1, r9);
        this.A0I = this.A0E.B0Z();
        C153977cN.A01(this.A0H, r11);
        C160727oD r02 = this.A0H;
        C142366x5 r8 = C142366x5.VIDEO;
        r02.A07(r8);
        if (!C159277lY.A02(r11)) {
            C151307Uf A042 = this.A0H.A04();
            C158247jf r12 = r11.A04;
            r12.A07 = A042.A05;
            r12.A05 = A042.A03;
            r12.A06 = A042.A04;
        }
        C186218uw r22 = this.A0I;
        MediaFormat A032 = this.A0H.A03();
        if (r22 != null && A032 != null) {
            ArrayList A0s = AnonymousClass001.A0s();
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                if (i2 >= 4) {
                    break;
                }
                try {
                    r22.BhK(A032, r9, A0s, i);
                    break;
                } catch (Throwable th) {
                    if (!(th instanceof IllegalStateException) || i3 > 4 || th.getMessage() == null || !th.getMessage().startsWith("codec name:")) {
                        Object[] objArr = new Object[4];
                        objArr[0] = A032;
                        AnonymousClass000.A1M(objArr, i3);
                        objArr[2] = Arrays.toString(A0s.toArray());
                        objArr[3] = th;
                        C1445171w.A00("VideoDemuxDecodeWrapperTag", "prepareDecoderWithRetry: media format=%s, number of retries=%s, blacklisted decoders=%s, Exception=%s", objArr);
                        StringBuilder A0o = AnonymousClass001.A0o();
                        A0o.append("media format:");
                        A0o.append(A032);
                        A0o.append(", number of retries:");
                        A0o.append(i3);
                        A0o.append(", blacklisted decoders:");
                        C18320x8.A1P(A0o, A0s.toArray());
                        throw new IllegalStateException(A0o.toString(), th);
                    }
                    A0s.add(th.getMessage().substring(11));
                    i2 = i3;
                }
            }
        }
        C153537bV r03 = r11.A05;
        if (r03 != null) {
            AnonymousClass7WV r13 = new AnonymousClass7WV(r03);
            r13.A00(r8, this.A00);
            r0 = new AnonymousClass7M1(r13);
        } else {
            r0 = null;
        }
        this.A03 = r0;
        this.A02 = A01();
        this.A09.A0D = this.A0I.B6p();
        this.A05 = true;
        C1445171w.A00("VideoDemuxDecodeWrapperTag", "configure: mIsConfigured done", new Object[0]);
    }

    public final long A00(long j) {
        AnonymousClass7M1 r4 = this.A03;
        if (r4 == null || j < 0) {
            return j;
        }
        if (!r4.A03) {
            C159297la.A02(AnonymousClass000.A1W(r4.A02.A00), "No track is selected");
            r4.A03 = true;
        }
        long j2 = (long) (((float) r4.A00) + (((float) (j - r4.A01)) / 1.0f));
        r4.A00 = j2;
        C159297la.A02(AnonymousClass000.A1W(r4.A02.A00), "No track is selected");
        r4.A01 = j;
        return j2;
    }

    public final C149317Lz A01() {
        C153537bV r0 = this.A0D.A05;
        if (r0 == null) {
            return null;
        }
        C149317Lz r3 = new C149317Lz(r0);
        C142366x5 r2 = C142366x5.VIDEO;
        int i = this.A00;
        r3.A00 = r2;
        C153007aW A002 = r3.A03.A00(r2, i);
        r3.A01 = A002;
        if (A002 != null) {
            Iterator A0u = AnonymousClass6C7.A0u(A002.A04);
            r3.A02 = A0u;
            if (A0u != null && A0u.hasNext()) {
                r3.A02.next();
            }
            return r3;
        }
        throw AnonymousClass001.A0c("Requested Track is not available");
    }

    public long B1I() {
        Trace.beginSection("VideoDemuxDecodeWrapper.decodeFrameAndAdvance");
        if (this.A06) {
            try {
                C186218uw r1 = this.A0I;
                long j = (long) this.A07;
                long B1K = r1.B1K(j) + 0;
                while (B1K < 0 && !this.A0I.BJA() && !this.A0K) {
                    Trace.beginSection("VideoDemuxDecodeWrapper.decodeFrameAndAdvanceLoop");
                    B1K = 0 + this.A0I.B1K(j);
                    Trace.endSection();
                }
                if (this.A0J.isDone() && !this.A0L) {
                    this.A0J.get();
                    this.A0L = true;
                }
                if (this.A0I.BJA() && !this.A0L) {
                    this.A0J.get();
                }
                long A002 = A00(B1K);
                Trace.endSection();
                return A002;
            } catch (IllegalStateException e) {
                throw new IllegalStateException(AnonymousClass000.A0Z("Previous Enqueue Buffer: ", AnonymousClass001.A0o(), 0), e);
            }
        } else {
            C1445171w.A00("VideoDemuxDecodeWrapperTag", "throwIfNotStartedNonRealtime: VideoDemuxDecodeWrapper not started", AnonymousClass4L0.A0U());
            throw new C143926zh("VideoDemuxDecodeWrapper not started");
        }
    }

    public void B1J(long j) {
        if (!this.A06) {
            C1445171w.A00("VideoDemuxDecodeWrapperTag", "throwIfNotStartedNonRealtime: VideoDemuxDecodeWrapper not started", AnonymousClass4L0.A0U());
            throw new C143926zh("VideoDemuxDecodeWrapper not started");
        }
        while (B6n() <= j && !this.A0I.BJA() && !this.A0K) {
            B1I();
        }
    }

    public long B6n() {
        C153007aW r0;
        long B6n = this.A0I.B6n() + 0;
        C149317Lz r02 = this.A02;
        if (r02 == null || (r0 = r02.A01) == null || AnonymousClass002.A0J(r0.A04).isEmpty()) {
            return A00(B6n);
        }
        C159297la.A02(AnonymousClass000.A1W(this.A02.A00), "No track is selected");
        return B6n;
    }

    public C152527Zf B9T() {
        return this.A0H.A04;
    }

    public boolean BHN() {
        return this.A0I.BJA();
    }

    public void start() {
        if (this.A05) {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            C1445171w.A00("VideoDemuxDecodeWrapperTag", "start", new Object[0]);
            this.A0M = false;
            this.A0J = this.A0F.submit(new AnonymousClass91J(this, threadPriority, 0));
            this.A06 = true;
            return;
        }
        C1445171w.A00("VideoDemuxDecodeWrapperTag", "throwIfNotStartedNonRealtime: VideoDemuxDecodeWrapper not configured", AnonymousClass4L0.A0U());
        throw new C143926zh("VideoDemuxDecodeWrapper not configured");
    }

    public C1684685n(C180608lL r4, C158667kM r5, C1445471z r6, AnonymousClass720 r7, C147757Fp r8, AnonymousClass7QR r9, C183838qk r10, ExecutorService executorService) {
        this.A0F = executorService;
        this.A0D = r9;
        this.A0C = r8;
        this.A0A = r6;
        this.A08 = r4;
        this.A0B = r7;
        this.A09 = r5;
        this.A0E = r10;
        this.A01 = r9.A04;
    }

    public void Bl2(long j) {
        C153007aW r0;
        Object[] A0L2 = AnonymousClass002.A0L();
        C18280x3.A1S(A0L2, j);
        C1445171w.A00("VideoDemuxDecodeWrapperTag", "seekTo: ptsUs=%s", A0L2);
        if (!this.A05) {
            C1445171w.A00("VideoDemuxDecodeWrapperTag", "throwIfNotStartedNonRealtime: VideoDemuxDecodeWrapper not configured", AnonymousClass4L0.A0U());
            throw new C143926zh("VideoDemuxDecodeWrapper not configured");
        } else if (!this.A06) {
            C149317Lz r02 = this.A02;
            if (r02 == null || (r0 = r02.A01) == null || AnonymousClass002.A0J(r0.A04).isEmpty()) {
                float f = (float) j;
                C153537bV r03 = this.A0D.A05;
                if (r03 != null) {
                    AnonymousClass7WV r2 = new AnonymousClass7WV(r03);
                    r2.A00(C142366x5.VIDEO, this.A00);
                    C159297la.A02(AnonymousClass000.A1W(r2.A00), "No track is selected");
                }
                j = (long) (f * 1.0f);
            } else {
                C149317Lz A012 = A01();
                this.A02 = A012;
                C159297la.A02(AnonymousClass000.A1W(A012.A00), "No track is selected");
            }
            if (j >= 0) {
                this.A0H.A06(j);
            }
        } else {
            C1445171w.A00("VideoDemuxDecodeWrapperTag", "throwIfNotStartedNonRealtime: VideoDemuxDecodeWrapper has already started", AnonymousClass4L0.A0U());
            throw new C143926zh("VideoDemuxDecodeWrapper has already started");
        }
    }

    public void cancel() {
        C1445171w.A00("VideoDemuxDecodeWrapperTag", "cancel", AnonymousClass4L0.A0U());
        this.A0K = true;
        C1445171w.A00("VideoDemuxDecodeWrapperTag", "cancelExtractionFuture", new Object[0]);
        if (this.A0J != null && !this.A0J.isDone()) {
            AnonymousClass8U0 r5 = this.A04;
            if (r5.mEnableThreadLockSync) {
                C1445171w.A00("VideoDemuxDecodeWrapperTag", "cancelExtractionFuture mExtractFuturelock.isEnabled", new Object[0]);
                this.A0M = true;
                try {
                    this.A0J.get();
                } catch (Throwable th) {
                    C1445171w.A00("VideoDemuxDecodeWrapperTag", "cancelExtractionFuture Throwable=%s", th);
                }
                if (r5.mEnableThreadLockSync) {
                    r5.lock();
                }
                try {
                    C1445171w.A00("VideoDemuxDecodeWrapperTag", "cancelExtractionFuture mExtractFuturelock.open", new Object[0]);
                    r5.close();
                    C1445171w.A00("VideoDemuxDecodeWrapperTag", "cancelExtractionFuture mExtractFuturelock done", new Object[0]);
                    return;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            } else {
                C1445171w.A00("VideoDemuxDecodeWrapperTag", "cancelExtractionFuture: mExtractFuture.cancel", new Object[0]);
                this.A0J.cancel(true);
                try {
                    this.A0J.get();
                    return;
                } catch (Throwable th3) {
                    C1445171w.A00("VideoDemuxDecodeWrapperTag", "cancelExtractionFuture Throwable=%s", th3);
                    return;
                }
            }
        } else {
            return;
        }
    }

    public void release() {
        C1445171w.A00("VideoDemuxDecodeWrapperTag", "release", AnonymousClass4L0.A0U());
        AnonymousClass7VY r2 = new AnonymousClass7VY();
        AnonymousClass7RG.A00(new C188878zd(r2, this.A0H));
        AnonymousClass7RG.A00(new C188878zd(r2, this.A0I));
        Throwable th = r2.A01;
        if (th != null) {
            throw th;
        }
    }
}
