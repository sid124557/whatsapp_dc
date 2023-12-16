package X;

import android.content.Context;
import android.view.View;
import com.whatsapp.PagerSlidingTabStrip;
import com.whatsapp.R;

/* renamed from: X.1e9  reason: invalid class name and case insensitive filesystem */
public final class C27581e9 extends C19410zx implements C181598n1 {
    public final PagerSlidingTabStrip A00;
    public final AnonymousClass2L0[] A01 = new AnonymousClass2L0[this.A00];

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27581e9(Context context, C08270df r9, PagerSlidingTabStrip pagerSlidingTabStrip, String str, boolean z) {
        super(context, r9, str, z, true);
        C162457s7.A0J(pagerSlidingTabStrip, 4);
        this.A00 = pagerSlidingTabStrip;
    }

    public View BAT(int i) {
        AnonymousClass2L0[] r4 = this.A01;
        AnonymousClass2L0 r3 = r4[i];
        if (r3 == null) {
            PagerSlidingTabStrip pagerSlidingTabStrip = this.A00;
            r3 = new AnonymousClass2L0(C18310x6.A0I(C18280x3.A0D(pagerSlidingTabStrip), pagerSlidingTabStrip, R.layout.f8nameremoved, false));
            CharSequence A04 = A04(i);
            C162457s7.A0J(A04, 0);
            r3.A01.setText(A04);
            r4[i] = r3;
        }
        return r3.A00;
    }
}
