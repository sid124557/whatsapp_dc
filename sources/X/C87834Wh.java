package X;

import android.view.ViewGroup;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.4Wh  reason: invalid class name and case insensitive filesystem */
public class C87834Wh extends AnonymousClass0R6 {
    public List A00 = AnonymousClass001.A0s();
    public final /* synthetic */ AnonymousClass5TV A01;

    public C87834Wh(AnonymousClass5TV r2) {
        this.A01 = r2;
    }

    public int A0G() {
        return this.A00.size();
    }

    public void A0K(C95814uZ r3) {
        if (r3 != null) {
            for (C102225Hy r0 : this.A00) {
                if (r3.equals(r0.A01)) {
                }
            }
            return;
        }
        A05();
    }

    public /* bridge */ /* synthetic */ void BNf(C05570Ua r8, int i) {
        AnonymousClass4YS r82 = (AnonymousClass4YS) r8;
        C102225Hy r5 = (C102225Hy) this.A00.get(i);
        AnonymousClass5TV r6 = this.A01;
        AnonymousClass3ZH A0A = r6.A0C.A0A(r5.A01);
        r6.A0G.A0A(r82.A00, A0A, false);
        r82.A02.A0K((List) null, r6.A0F.A0L(A0A));
        r82.A01.setText(C107565bW.A00(r6.A0H, r6.A0I, r5.A00));
    }

    public /* bridge */ /* synthetic */ C05570Ua BQR(ViewGroup viewGroup, int i) {
        return new AnonymousClass4YS(AnonymousClass001.A0R(C86604Kt.A0D(viewGroup), viewGroup, R.layout.f8nameremoved));
    }
}
