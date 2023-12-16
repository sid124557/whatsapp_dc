package X;

import com.facebook.profilo.writer.NativeTraceWriterCallbacks;

/* renamed from: X.844  reason: invalid class name */
public class AnonymousClass844 implements NativeTraceWriterCallbacks {
    public final /* synthetic */ C124796Dx A00;
    public final /* synthetic */ C166567yu A01;

    public AnonymousClass844(C124796Dx r1, C166567yu r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public void onTraceWriteAbort(long j, int i) {
        this.A00.A02.BeN(this.A01, i);
    }

    public void onTraceWriteEnd(long j) {
        this.A00.A02.BeO(this.A01);
    }

    public void onTraceWriteException(long j, Throwable th) {
        this.A00.A02.BeP(this.A01, th);
    }

    public void onTraceWriteStart(long j, int i) {
        this.A00.A02.BeQ(this.A01);
    }
}
