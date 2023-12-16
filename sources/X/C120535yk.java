package X;

import android.graphics.Paint;

/* renamed from: X.5yk  reason: invalid class name and case insensitive filesystem */
public final class C120535yk extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ C157787is this$0;

    public /* bridge */ /* synthetic */ Object invoke() {
        Paint A0a = C86664Kz.A0a(1);
        C157787is r1 = this.this$0;
        C86634Kw.A17(A0a);
        A0a.setDither(true);
        A0a.setStrokeWidth(r1.A04.A01);
        A0a.setStrokeCap(Paint.Cap.ROUND);
        AnonymousClass5CO r2 = r1.A05;
        if (r2 instanceof AnonymousClass576) {
            C86614Ku.A10(r1.A08, A0a, ((AnonymousClass576) r2).A00.statusColor);
        }
        return A0a;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C120535yk(C157787is r2) {
        super(0);
        this.this$0 = r2;
    }
}
