package X;

import android.view.View;
import com.facebook.shimmer.ShimmerFrameLayout;

/* renamed from: X.8Yr  reason: invalid class name and case insensitive filesystem */
public final class C175518Yr extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ AnonymousClass6JK $adapter;
    public final /* synthetic */ ShimmerFrameLayout $shimmerContainer;
    public final /* synthetic */ View $touchInterceptor;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C175518Yr(View view, ShimmerFrameLayout shimmerFrameLayout, AnonymousClass6JK r4) {
        super(1);
        this.$shimmerContainer = shimmerFrameLayout;
        this.$touchInterceptor = view;
        this.$adapter = r4;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C51222jT r4 = (C51222jT) obj;
        boolean z = r4.A01;
        ShimmerFrameLayout shimmerFrameLayout = this.$shimmerContainer;
        if (z) {
            shimmerFrameLayout.A01();
        } else {
            shimmerFrameLayout.A00();
        }
        View view = this.$touchInterceptor;
        C162457s7.A0C(view);
        view.setVisibility(AnonymousClass001.A08(z ? 1 : 0));
        AnonymousClass6JK r0 = this.$adapter;
        r0.A00 = r4;
        r0.A05();
        return C59022wD.A00;
    }
}
