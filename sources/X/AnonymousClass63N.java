package X;

import com.whatsapp.R;

/* renamed from: X.63N  reason: invalid class name */
public final class AnonymousClass63N extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ C89644eZ $activity;
    public final /* synthetic */ C1224964p $chatLockAuthCallback;
    public final /* synthetic */ AnonymousClass3XA $result;
    public final /* synthetic */ C112625k2 this$0;

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C162457s7.A0J(obj, 0);
        boolean z = obj instanceof C91634kb;
        C1224964p r0 = this.$chatLockAuthCallback;
        if (z) {
            ((C112595jz) r0).A01.BaI(new AnonymousClass5S5(AnonymousClass58T.SUCCESS, (Integer) null, (Integer) null));
            this.this$0.Aya();
        } else {
            r0.BSk();
            C88634aS r3 = new C88634aS(this.$activity, R.style.f12nameremoved);
            r3.A0V(R.string.f11nameremoved);
            r3.A0U(R.string.f11nameremoved);
            r3.A0X(new AnonymousClass69A(4), R.string.f11nameremoved);
            r3.create();
            r3.A0S();
        }
        this.$result.A05(obj);
        return C59022wD.A00;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass63N(C89644eZ r2, AnonymousClass3XA r3, C1224964p r4, C112625k2 r5) {
        super(1);
        this.$chatLockAuthCallback = r4;
        this.this$0 = r5;
        this.$activity = r2;
        this.$result = r3;
    }
}
