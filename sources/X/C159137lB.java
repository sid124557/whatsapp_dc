package X;

import com.facebook.profilo.core.TraceEvents;
import com.facebook.profilo.logger.MultiBufferLogger;
import com.facebook.soloader.SoLoader;

/* renamed from: X.7lB  reason: invalid class name and case insensitive filesystem */
public abstract class C159137lB {
    public int A00;
    public C166567yu A01;
    public MultiBufferLogger A02;
    public String A03;
    public boolean A04;
    public volatile boolean A05;

    /* JADX INFO: finally extract failed */
    public final void A01() {
        if (!this.A04) {
            synchronized (this) {
                if (!this.A04) {
                    MultiBufferLogger A002 = A00();
                    try {
                        int writeStandardEntry = A002.writeStandardEntry(6, 21, 0, 0, 0, 0, 0);
                        StringBuilder A0o = AnonymousClass001.A0o();
                        A0o.append("ensureSoLibLoaded: ");
                        String str = this.A03;
                        A002.writeBytesEntry(0, 83, writeStandardEntry, AnonymousClass000.A0X(str, A0o));
                        SoLoader.A06(str);
                        this.A04 = true;
                        A002.writeStandardEntry(6, 22, 0, 0, 0, 0, 0);
                    } catch (Throwable th) {
                        A002.writeStandardEntry(6, 22, 0, 0, 0, 0, 0);
                        throw th;
                    }
                }
            }
        }
    }

    public abstract void disable();

    public abstract void enable();

    public abstract int getSupportedProviders();

    public abstract int getTracingProviders();

    public final MultiBufferLogger A00() {
        if (!this.A05) {
            synchronized (this) {
                if (!this.A05) {
                    this.A02 = new MultiBufferLogger();
                    this.A05 = true;
                }
            }
        }
        return this.A02;
    }

    public final void A03(C166567yu r3, AnonymousClass843 r4) {
        if (this.A00 != 0 && (r3.A02 & getSupportedProviders()) != 0) {
            A01();
            onTraceEnded(r3, r4);
            A02(r3);
            A00().removeBuffer(r3.A09);
        }
    }

    public C159137lB(String str) {
        this.A03 = str;
        this.A04 = AnonymousClass000.A1X(str);
    }

    public final void A02(C166567yu r4) {
        int supportedProviders = getSupportedProviders() & TraceEvents.sProviders;
        int i = this.A00;
        if (i != 0) {
            int i2 = i & TraceEvents.sProviders;
            int i3 = this.A00;
            if (i2 == i3) {
                return;
            }
            if (i3 != 0) {
                disable();
                this.A01 = null;
            }
        }
        if (supportedProviders != 0) {
            this.A01 = r4;
            enable();
        }
        this.A00 = supportedProviders;
    }

    public void onTraceEnded(C166567yu r1, AnonymousClass843 r2) {
    }

    public void onTraceStarted(C166567yu r1, AnonymousClass843 r2) {
    }

    public C159137lB() {
        this((String) null);
    }
}
