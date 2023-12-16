package X;

import java.lang.ref.WeakReference;

/* renamed from: X.5zQ  reason: invalid class name and case insensitive filesystem */
public final class C120945zQ extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ int $entryPoint;
    public final /* synthetic */ AnonymousClass1RL $newsletter;
    public final /* synthetic */ WeakReference $weakActivity;
    public final /* synthetic */ C105325Um this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C120945zQ(AnonymousClass1RL r2, C105325Um r3, WeakReference weakReference, int i) {
        super(0);
        this.$weakActivity = weakReference;
        this.this$0 = r3;
        this.$newsletter = r2;
        this.$entryPoint = i;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C89654ea A0F = C18320x8.A0F(this.$weakActivity);
        if (A0F != null) {
            C105325Um r3 = this.this$0;
            AnonymousClass1RL r0 = this.$newsletter;
            r3.A04(A0F, r0.A0I(), (AnonymousClass4GQ) null, this.$entryPoint);
        }
        return C59022wD.A00;
    }
}
