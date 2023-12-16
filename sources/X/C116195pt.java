package X;

import android.view.View;
import com.whatsapp.R;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.jid.UserJid;

/* renamed from: X.5pt  reason: invalid class name and case insensitive filesystem */
public final class C116195pt implements C183218pg {
    public final /* synthetic */ AnonymousClass5R5 A00;
    public final /* synthetic */ C30471mV A01;

    public C116195pt(AnonymousClass5R5 r1, C30471mV r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public void BPD(View view, C149947On r17) {
        AnonymousClass5R5 r3 = this.A00;
        C30471mV r9 = this.A01;
        r3.A00 = r9;
        View view2 = view;
        if (r9.A1I == 23) {
            C30771mz r92 = (C30771mz) r9;
            UserJid userJid = r92.A01;
            if (userJid == null) {
                r3.A01.A0H(R.string.f11nameremoved, 0);
                return;
            }
            r3.A06.A01(3);
            boolean A0a = r3.A02.A0a(userJid);
            if (view != null) {
                AnonymousClass5ZY.A02(view2.getContext(), view2, r3.A04, r3.A05, r3.A07, r92, r3.A0E, 5, false, A0a, A0a);
                return;
            }
            return;
        }
        AnonymousClass1VX r4 = r3.A0A;
        C89644eZ r2 = r3.A03;
        if (!r3.A08.A0C()) {
            r2.startActivityForResult(RequestPermissionActivity.A0X(r2, r4, AnonymousClass73T.A00()), 34);
        } else {
            r3.A00(view2);
        }
    }
}
