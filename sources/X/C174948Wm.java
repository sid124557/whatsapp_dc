package X;

import androidx.core.widget.NestedScrollView;

/* renamed from: X.8Wm  reason: invalid class name and case insensitive filesystem */
public final class C174948Wm extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ AnonymousClass6GA this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C174948Wm(AnonymousClass6GA r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        int A09;
        NestedScrollView nestedScrollView = this.this$0.A05;
        C162457s7.A0J(nestedScrollView, 0);
        boolean z = true;
        if (!nestedScrollView.canScrollVertically(1) && !nestedScrollView.canScrollVertically(-1)) {
            z = false;
        }
        AnonymousClass6GA r0 = this.this$0;
        if (z) {
            A09 = AnonymousClass0x2.A09(r0.A0A);
        } else {
            A09 = AnonymousClass0x2.A09(r0.A0B);
        }
        this.this$0.A01.setBackgroundColor(A09);
        return C59022wD.A00;
    }
}
