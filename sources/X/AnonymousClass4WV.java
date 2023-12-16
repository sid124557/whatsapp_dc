package X;

import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.wds.components.profilephoto.WDSProfilePhoto;
import java.util.List;

/* renamed from: X.4WV  reason: invalid class name */
public final class AnonymousClass4WV extends AnonymousClass0R6 {
    public final AnonymousClass64J A00;
    public final C64773Ex A01;
    public final C105365Uq A02;
    public final List A03;

    public /* bridge */ /* synthetic */ C05570Ua BQR(ViewGroup viewGroup, int i) {
        return new AnonymousClass4YE(C18310x6.A0I(C86604Kt.A0E(viewGroup, 0), viewGroup, R.layout.f8nameremoved, false), this.A00);
    }

    public int A0G() {
        return this.A03.size();
    }

    public /* bridge */ /* synthetic */ void BNf(C05570Ua r9, int i) {
        AnonymousClass4YE r92 = (AnonymousClass4YE) r9;
        C162457s7.A0J(r92, 0);
        C95814uZ r7 = (C95814uZ) this.A03.get(i);
        AnonymousClass3ZH A0A = this.A01.A0A(r7);
        AnonymousClass5YB r5 = r92.A00;
        r5.A08(A0A);
        WDSProfilePhoto wDSProfilePhoto = r92.A01;
        AnonymousClass5YB.A03(r5, AnonymousClass5Yj.A03(wDSProfilePhoto.getContext(), wDSProfilePhoto.getContext(), R.attr.f3nameremoved, R.color.f5nameremoved));
        this.A02.A08(wDSProfilePhoto, A0A);
        C109345eT.A00(r92.A0H, r7, 46);
    }

    public AnonymousClass4WV(AnonymousClass64J r1, C64773Ex r2, C105365Uq r3, List list) {
        C18260x0.A0Q(r2, r1);
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
        this.A03 = list;
    }
}
