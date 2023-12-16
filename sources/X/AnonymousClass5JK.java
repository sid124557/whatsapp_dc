package X;

import android.content.Context;
import android.os.HandlerThread;
import android.os.Looper;

/* renamed from: X.5JK  reason: invalid class name */
public final class AnonymousClass5JK {
    public final Context A00;
    public final AnonymousClass4MZ A01;
    public final C86844Mb A02;
    public final AnonymousClass66R A03 = C154517dI.A01(C121035zZ.A00);

    public AnonymousClass5JK(Context context, AnonymousClass5Y0 r8, AnonymousClass5MY r9, C104185Pz r10) {
        C18260x0.A0a(r8, r9, r10, 1);
        this.A00 = context;
        Looper mainLooper = context.getMainLooper();
        C162457s7.A0D(mainLooper);
        AnonymousClass4MZ r4 = new AnonymousClass4MZ(mainLooper, r9, r10);
        this.A01 = r4;
        Looper looper = ((HandlerThread) this.A03.getValue()).getLooper();
        C162457s7.A0D(looper);
        this.A02 = new C86844Mb(context, looper, r8, r4, r10);
    }
}
