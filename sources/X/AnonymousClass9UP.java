package X;

import android.content.Context;
import com.whatsapp.payments.pin.ui.PinBottomSheetDialogFragment;

/* renamed from: X.9UP  reason: invalid class name */
public class AnonymousClass9UP implements C202989mw {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    public AnonymousClass9UP(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.A04 = i;
        this.A00 = obj2;
        this.A03 = obj3;
        this.A01 = obj;
        this.A02 = obj4;
    }

    public void BS6(AnonymousClass34V r3) {
        switch (this.A04) {
            case 0:
                ((AnonymousClass9R8) this.A02).A00(r3);
                return;
            case 1:
                ((C203729oD) this.A01).BS7(r3, (Integer) this.A02);
                return;
            default:
                ((PinBottomSheetDialogFragment) this.A03).A1a();
                ((C194939Vd) this.A00).A02();
                return;
        }
    }

    public void BdD(String str) {
        String str2 = str;
        switch (this.A04) {
            case 0:
                AnonymousClass9QC r7 = (AnonymousClass9QC) this.A00;
                byte[] A002 = AnonymousClass9V6.A00(Boolean.TRUE, str2, "RECOVERACCOUNT", C56612sH.A00(r7.A09.A01));
                C67993Rl r2 = ((C193849Qh) this.A03).A00;
                AnonymousClass9IM r22 = new AnonymousClass9IM(C18290x4.A0h(r2.A04), r2.A05, r2.A03, C1899693i.A12(r2, A002));
                Object obj = this.A02;
                AnonymousClass9U5 r10 = r7.A03;
                String A032 = r10.A07.A03();
                AnonymousClass9IU r8 = new AnonymousClass9IU(new C35351wj(A032, 18), r22);
                r10.A0F(new C203909oV((Context) this.A01, r7.A02, r7.A00, obj, r7, r8, 1), r8.A00, A032, 0);
                return;
            case 1:
                AnonymousClass9VE r4 = (AnonymousClass9VE) this.A00;
                AnonymousClass9VE.A00(r4, (C203729oD) this.A01, ((C193849Qh) this.A03).A01(AnonymousClass9V6.A00(Boolean.TRUE, str2, "AUTH", C56612sH.A00(r4.A0O.A01))), AnonymousClass35J.A02(r4.A02, r4.A03));
                return;
            default:
                ((C194939Vd) this.A00).A06((PinBottomSheetDialogFragment) this.A03, ((C193849Qh) this.A01).A01(AnonymousClass9V6.A00(Boolean.TRUE, str2, "AUTH", C56612sH.A00(((AnonymousClass9V6) this.A02).A01))));
                return;
        }
    }
}
