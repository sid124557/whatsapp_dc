package X;

import android.view.ViewGroup;
import android.widget.FrameLayout;

/* renamed from: X.8WI  reason: invalid class name */
public final class AnonymousClass8WI extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ C148867Ka this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8WI(C148867Ka r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        FrameLayout frameLayout = new FrameLayout(this.this$0.A01.getContext());
        frameLayout.setOnTouchListener(this.this$0.A00);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setBackgroundColor(0);
        return frameLayout;
    }
}
