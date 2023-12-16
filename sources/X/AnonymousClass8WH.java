package X;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.8WH  reason: invalid class name */
public final class AnonymousClass8WH extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ AnonymousClass7UX this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8WH(AnonymousClass7UX r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        View rootView = this.this$0.A06.getRootView();
        C162457s7.A0K(rootView, "null cannot be cast to non-null type android.view.ViewGroup");
        return new C148867Ka(this.this$0.A05, (ViewGroup) rootView);
    }
}
