package X;

import android.content.Context;
import java.util.concurrent.Callable;

/* renamed from: X.8Of  reason: invalid class name and case insensitive filesystem */
public final class C173078Of implements Callable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ Context A02;
    public final /* synthetic */ C160247nJ A03;
    public final /* synthetic */ C158047jL A04;
    public final /* synthetic */ Object A05;

    public C173078Of(Context context, C160247nJ r2, C158047jL r3, Object obj, int i, long j) {
        this.A02 = context;
        this.A04 = r3;
        this.A05 = obj;
        this.A03 = r2;
        this.A00 = i;
        this.A01 = j;
    }

    public /* bridge */ /* synthetic */ Object call() {
        return C160247nJ.A04.A02(this.A02, this.A03, this.A04, this.A05, this.A00, this.A01);
    }
}
