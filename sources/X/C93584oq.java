package X;

import android.view.View;
import android.widget.FrameLayout;
import com.whatsapp.R;
import com.whatsapp.WaTextView;

/* renamed from: X.4oq  reason: invalid class name and case insensitive filesystem */
public final class C93584oq extends C88144Xm {
    public C93314oJ A00;
    public final View A01;
    public final FrameLayout A02;
    public final C56972sr A03;
    public final WaTextView A04;
    public final C64773Ex A05;
    public final C105365Uq A06;
    public final C105165Tv A07;
    public final AnonymousClass677 A08;
    public final AnonymousClass543 A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C93584oq(View view, C56972sr r3, C64773Ex r4, C105365Uq r5, C105165Tv r6, AnonymousClass677 r7, AnonymousClass543 r8) {
        super(view);
        C18260x0.A0c(r3, r4, view, r5);
        this.A03 = r3;
        this.A05 = r4;
        this.A01 = view;
        this.A06 = r5;
        this.A07 = r6;
        this.A08 = r7;
        this.A09 = r8;
        this.A02 = (FrameLayout) C18290x4.A0M(view, R.id.chat_bubble_container);
        this.A04 = (WaTextView) C18290x4.A0M(view, R.id.report_to_admin_footer_tv);
    }
}
