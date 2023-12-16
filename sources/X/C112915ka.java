package X;

import android.content.Intent;
import com.whatsapp.R;

/* renamed from: X.5ka  reason: invalid class name and case insensitive filesystem */
public class C112915ka implements AnonymousClass4E6 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C89654ea A01;
    public final /* synthetic */ C103755Oh A02;

    public C112915ka(C89654ea r1, C103755Oh r2, int i) {
        this.A02 = r2;
        this.A01 = r1;
        this.A00 = i;
    }

    public void BUA(AnonymousClass3ZH r1, boolean z) {
    }

    public void BfA(AnonymousClass3ZH r8) {
        String string;
        C103755Oh r6 = this.A02;
        boolean A0X = r6.A06.A0X(6186);
        C89654ea r5 = this.A01;
        if (A0X) {
            string = r5.getString(R.string.f11nameremoved);
        } else {
            Object[] A0L = AnonymousClass002.A0L();
            C18290x4.A1K(r6.A03, r8, A0L);
            string = r5.getString(R.string.f11nameremoved, A0L);
        }
        int i = this.A00;
        C69263Wi r2 = r6.A00;
        r2.A0K((AnonymousClass4FU) null);
        r2.A0S(new C71323bv(12, string, r6));
        if (i == 2) {
            Intent A022 = C627736r.A02(r5);
            A022.setFlags(67108864);
            r5.startActivity(A022);
        } else if (i != 1) {
            return;
        }
        r5.finish();
    }

    public void BX7(AnonymousClass3ZH r1) {
    }
}
