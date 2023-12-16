package X;

import android.view.LayoutInflater;
import android.view.View;
import com.whatsapp.R;

/* renamed from: X.51d  reason: invalid class name and case insensitive filesystem */
public final class C985051d extends C105395Ut {
    public final View A00;
    public final C104835Sn A01;

    public C985051d(C69263Wi r10, C85244Fm r11, C620633i r12, C620733j r13, C48132eP r14, C624134x r15, C104835Sn r16, C104035Pj r17, C183538qC r18) {
        super(r11, r10, r12, r13, r14, r17);
        this.A01 = r16;
        View A0H = C18310x6.A0H(LayoutInflater.from(A03()), R.layout.f8nameremoved);
        C162457s7.A0D(A0H);
        this.A00 = A0H;
        AnonymousClass2z0 r1 = r15.A1J;
        if ((r1.A00 instanceof C135166kE) && r1.A02 && C627636p.A0m(r15)) {
            r18.get();
        }
        C18300x5.A0G(A0H, R.id.status_playback_deleting_subtitle).setText(R.string.f11nameremoved);
    }

    public long A02() {
        return this.A01.A00;
    }

    public void A07() {
        C105395Ut.A01(this.A01, this);
    }

    public void A08() {
        this.A01.A02();
    }
}
