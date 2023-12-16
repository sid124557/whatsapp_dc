package X;

import android.app.Activity;
import android.view.View;
import com.whatsapp.calling.fragment.CallConfirmationFragment;
import com.whatsapp.jid.GroupJid;

/* renamed from: X.5en  reason: invalid class name and case insensitive filesystem */
public class C109545en implements View.OnClickListener {
    public Object A00;
    public Object A01;
    public Object A02;
    public boolean A03;
    public final int A04;

    public C109545en(Object obj, Object obj2, Object obj3, int i, boolean z) {
        this.A04 = i;
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = obj3;
        this.A03 = z;
    }

    public final void onClick(View view) {
        C003203q r4;
        AnonymousClass2z0 r0;
        C95814uZ r5;
        switch (this.A04) {
            case 0:
                AnonymousClass7X9 r02 = (AnonymousClass7X9) this.A00;
                C165977xw r3 = (C165977xw) this.A02;
                boolean z = this.A03;
                AnonymousClass344.A00(C154207cn.A00(r3, (C166107y9) this.A01, r02.A00, z), r02.A04);
                return;
            case 1:
                CallConfirmationFragment callConfirmationFragment = (CallConfirmationFragment) this.A00;
                callConfirmationFragment.A1V((Activity) this.A01, (AnonymousClass3ZH) this.A02, this.A03);
                callConfirmationFragment.A1L();
                return;
            default:
                GroupJid groupJid = (GroupJid) this.A00;
                AnonymousClass570 r42 = (AnonymousClass570) this.A01;
                C624134x r32 = (C624134x) this.A02;
                boolean z2 = this.A03;
                C27991fJ A012 = AnonymousClass34R.A01(groupJid);
                if (A012 != null) {
                    C70333aK.A00(r42.getWaWorkers(), r42, r32, A012, 23);
                }
                Activity A042 = C111095hX.A04(r42);
                if ((A042 instanceof C009707r) && (r4 = (C003203q) A042) != null && (r0 = r32.A1J) != null && (r5 = r0.A00) != null) {
                    AnonymousClass27C.A00(r4.getSupportFragmentManager(), r4, (C27991fJ) r5, (C27991fJ) groupJid, C72023d3.A00, AnonymousClass8XS.A00, C1221463g.A00, 1, 6, z2);
                    return;
                }
                return;
        }
    }
}
