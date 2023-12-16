package X;

import android.view.View;
import com.whatsapp.payments.pin.ui.PinBottomSheetDialogFragment;

/* renamed from: X.9qQ  reason: invalid class name and case insensitive filesystem */
public class C205099qQ implements C203139nB {
    public Object A00;
    public Object A01;
    public final int A02;

    public C205099qQ(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public void BPT(String str) {
        C205069qN r2;
        int i;
        if (this.A02 != 0) {
            PinBottomSheetDialogFragment pinBottomSheetDialogFragment = (PinBottomSheetDialogFragment) this.A01;
            pinBottomSheetDialogFragment.A1b();
            C194939Vd r3 = (C194939Vd) this.A00;
            C89644eZ r6 = r3.A06;
            C69263Wi r7 = r3.A04;
            AnonymousClass9U5 r9 = r3.A0D;
            C40602Ha r8 = r3.A0B;
            AnonymousClass9VU r10 = r3.A0G;
            C194149Rt r5 = new C194149Rt(r6, r7, r8, r9, r10, "PIN");
            C67993Rl A012 = r10.A01("FB", "PIN");
            if (A012 != null) {
                C194939Vd.A00(new C193849Qh(A012), pinBottomSheetDialogFragment, r3, str);
            } else {
                r5.A00(new AnonymousClass9cK(this, str), "FB");
            }
        } else {
            PinBottomSheetDialogFragment pinBottomSheetDialogFragment2 = (PinBottomSheetDialogFragment) this.A01;
            pinBottomSheetDialogFragment2.A1b();
            AnonymousClass9S2 r22 = (AnonymousClass9S2) this.A00;
            int A013 = r22.A05.A01();
            AnonymousClass9VB r32 = r22.A06;
            if (A013 == 1) {
                r2 = new C205069qN(pinBottomSheetDialogFragment2, 4, this);
                i = 2;
            } else {
                r2 = new C205069qN(pinBottomSheetDialogFragment2, 5, this);
                i = 3;
            }
            r32.A01(new C204889q5(r2, r32, str, i), r2, "FB");
        }
    }

    public void BTk(View view) {
        if (this.A02 != 0) {
            C194939Vd r4 = (C194939Vd) this.A00;
            C89644eZ r1 = r4.A06;
            if (r4 instanceof AnonymousClass9ET) {
                AnonymousClass9ET r42 = (AnonymousClass9ET) r4;
                AnonymousClass9NB r3 = new AnonymousClass9NB(r1);
                C18270x1.A0w(new AnonymousClass9GP(r3, r42.A01), r42.A02);
                return;
            }
            return;
        }
        AnonymousClass9S2 r12 = (AnonymousClass9S2) this.A00;
        AnonymousClass9NB r32 = new AnonymousClass9NB(r12.A01);
        C18270x1.A0w(new AnonymousClass9GP(r32, r12.A04), r12.A09);
    }
}
