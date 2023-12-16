package X;

import java.lang.ref.WeakReference;

/* renamed from: X.5zR  reason: invalid class name and case insensitive filesystem */
public final class C120955zR extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ WeakReference $adapterRef;
    public final /* synthetic */ WeakReference $managerRef;
    public final /* synthetic */ WeakReference $scrollerRef;
    public final /* synthetic */ int $targetPos;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C120955zR(WeakReference weakReference, WeakReference weakReference2, WeakReference weakReference3, int i) {
        super(0);
        this.$adapterRef = weakReference;
        this.$targetPos = i;
        this.$scrollerRef = weakReference2;
        this.$managerRef = weakReference3;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        AnonymousClass4WX r0 = (AnonymousClass4WX) this.$adapterRef.get();
        if (r0 != null && this.$targetPos < r0.A00.size()) {
            AnonymousClass000.A0A().postDelayed(new C71713cY(this.$scrollerRef, this.$managerRef, this.$targetPos, 26), 250);
        }
        return C59022wD.A00;
    }
}
