package X;

import com.whatsapp.payments.pin.ui.PinBottomSheetDialogFragment;
import com.whatsapp.payments.ui.BrazilPayBloksActivity;
import com.whatsapp.util.Log;

/* renamed from: X.9q2  reason: invalid class name and case insensitive filesystem */
public class C204859q2 implements C203069n4 {
    public Object A00;
    public Object A01;
    public final int A02;

    public C204859q2(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public void BZ3(AnonymousClass34V r2) {
        switch (this.A02) {
            case 0:
                ((AnonymousClass9RM) this.A01).A00(r2);
                return;
            case 2:
                ((C197189ci) this.A00).A01.A02();
                return;
            default:
                Log.e("PAY: BrazilPayBloksActivity/provider key iq returned null");
                return;
        }
    }

    public void BZ4(C67993Rl r5) {
        switch (this.A02) {
            case 0:
                C193849Qh r3 = new C193849Qh(r5);
                AnonymousClass9SB r2 = (AnonymousClass9SB) this.A00;
                r2.A00(r3, (AnonymousClass9RM) this.A01, r2.A0B);
                return;
            case 1:
                ((BrazilPayBloksActivity) this.A00).A7E((C52792m3) this.A01, r5.A05);
                return;
            case 2:
                AnonymousClass36K A012 = new C193849Qh(r5).A01((byte[]) this.A01);
                C197189ci r1 = (C197189ci) this.A00;
                r1.A00.A1L();
                r1.A01.A06((PinBottomSheetDialogFragment) null, A012);
                return;
            default:
                ((C1902194o) this.A00).A0D((AnonymousClass99J) this.A01, r5.A05);
                return;
        }
    }
}
