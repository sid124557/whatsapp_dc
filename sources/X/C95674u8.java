package X;

import android.view.View;
import java.util.List;

/* renamed from: X.4u8  reason: invalid class name and case insensitive filesystem */
public class C95674u8 extends AnonymousClass1FE {
    public final /* synthetic */ AnonymousClass5TS A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C95674u8(C28891hw r8, AnonymousClass5TS r9, C66493Lq r10, C27991fJ r11, String str) {
        super(r8, r10, r11, str, (List) null, 17);
        this.A00 = r9;
    }

    public void A00(Integer num) {
        View view;
        AnonymousClass5TS r4 = this.A00;
        if (!r4.A02.isFinishing() && (view = r4.A01) != null) {
            view.postDelayed(new C70003Zm(this, 5), 300);
        }
        AnonymousClass65G r1 = r4.A00;
        if (r1 != null) {
            r1.BPU(AnonymousClass000.A1X(num));
            r4.A00 = null;
        }
    }

    public void BkI(int i) {
        this.A00.A03.A0S(new C117705sM((Object) this, i, 35));
        A00((Integer) null);
    }
}
