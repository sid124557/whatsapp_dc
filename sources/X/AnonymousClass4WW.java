package X;

import android.view.ViewGroup;
import com.whatsapp.R;

/* renamed from: X.4WW  reason: invalid class name */
public class AnonymousClass4WW extends AnonymousClass0R6 {
    public final C009707r A00;
    public final AnonymousClass4UF A01;
    public final int[] A02;
    public final int[] A03;
    public final int[] A04;

    public int A0G() {
        return this.A03.length;
    }

    public /* bridge */ /* synthetic */ void BNf(C05570Ua r3, int i) {
        AnonymousClass4ZB r32 = (AnonymousClass4ZB) r3;
        boolean A1U = AnonymousClass000.A1U(i, C86604Kt.A05(this.A01.A01));
        r32.A07(A1U, i);
        r32.A01.setChecked(A1U);
    }

    public AnonymousClass4WW(C009707r r1, AnonymousClass4UF r2, int[] iArr, int[] iArr2, int[] iArr3) {
        this.A00 = r1;
        this.A01 = r2;
        this.A03 = iArr;
        this.A04 = iArr2;
        this.A02 = iArr3;
    }

    public /* bridge */ /* synthetic */ C05570Ua BQR(ViewGroup viewGroup, int i) {
        AnonymousClass4ZB r2 = new AnonymousClass4ZB(AnonymousClass001.A0R(C86604Kt.A0D(viewGroup), viewGroup, R.layout.f8nameremoved), this.A03, this.A04, this.A02);
        this.A01.A01.A0B(this.A00, r2);
        C18310x6.A19(r2.A00, this, r2, 16);
        return r2;
    }
}
