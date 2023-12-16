package X;

import android.content.DialogInterface;
import com.whatsapp.R;

/* renamed from: X.3U3  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3U3 implements C182958pG {
    public final /* synthetic */ C97654yv A00;

    public final void BaP(String str, int i) {
        C97654yv r4 = this.A00;
        if (!r4.BHW()) {
            r4.A0Z = false;
            r4.BjL();
            if (i != 0) {
                if (i == 1) {
                    AnonymousClass35W.A03((C55502qS) null, (AnonymousClass304) null, r4.A0K, (C43242Ri) null, (Boolean) null, 1, 3, AnonymousClass35W.A04(str));
                } else if (i != 2 || r4.A78(str, false, 3)) {
                    return;
                }
                AnonymousClass33I r1 = r4.A0R;
                r1.A07.Bon(C18300x5.A0U(6), "qr_code_scanning_dialog_fragment_tag");
            } else {
                C19340zH A002 = AnonymousClass5V0.A00(r4);
                A002.setPositiveButton(R.string.f11nameremoved, (DialogInterface.OnClickListener) null);
                A002.A0A(R.string.f11nameremoved);
                A002.A0L(new AnonymousClass4IY(r4, 2));
                C18280x3.A0q(A002);
            }
            r4.A0R.A0e = true;
        }
    }

    public /* synthetic */ AnonymousClass3U3(C97654yv r1) {
        this.A00 = r1;
    }
}
