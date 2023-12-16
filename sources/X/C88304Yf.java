package X;

import android.view.View;
import com.whatsapp.R;

/* renamed from: X.4Yf  reason: invalid class name and case insensitive filesystem */
public final class C88304Yf extends C05570Ua {
    public final AnonymousClass5MP A00;
    public final C64773Ex A01;
    public final C105365Uq A02;
    public final AnonymousClass66R A03;
    public final AnonymousClass66R A04;
    public final AnonymousClass66R A05;
    public final AnonymousClass66R A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C88304Yf(View view, AnonymousClass64J r7, AnonymousClass5MP r8, C64773Ex r9, C105365Uq r10) {
        super(view);
        C162457s7.A0J(r7, 1);
        C18260x0.A0a(view, r9, r10, 2);
        this.A01 = r9;
        this.A02 = r10;
        this.A00 = r8;
        this.A05 = C154517dI.A01(new C174628Vg(view));
        this.A06 = C154517dI.A01(new C174638Vh(view));
        this.A04 = C154517dI.A01(new C174618Vf(view));
        this.A03 = C154517dI.A01(new C175058Wx(view, r7));
        View A0E = C18280x3.A0E(view, R.id.multi_contact_photo);
        A0E.setVisibility(8);
        C86644Kx.A0H(this.A04).setVisibility(0);
        C86604Kt.A1E(view, R.id.date_time, 8);
        C86604Kt.A1E(view, R.id.count, 8);
        C86604Kt.A1E(view, R.id.call_type_icon, 8);
        C86604Kt.A1E(view, R.id.selection_check, 8);
        AnonymousClass0YY.A06(A0E, 2);
        C06560Yg.A0O(view, new C188778zT(view, 15));
        C107235av.A02(view);
    }
}
