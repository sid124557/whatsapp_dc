package X;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import com.whatsapp.R;
import com.whatsapp.blocklist.UnblockDialogFragment;
import com.whatsapp.groupenforcements.ui.CreateGroupSuspendDialog;
import com.whatsapp.jid.UserJid;
import com.whatsapp.pnh.RequestPhoneNumberViewModel;
import java.util.List;

/* renamed from: X.4Hu  reason: invalid class name and case insensitive filesystem */
public class C85834Hu implements DialogInterface.OnClickListener {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public C85834Hu(Object obj, Object obj2, Object obj3, int i) {
        this.A03 = i;
        this.A00 = obj3;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.A03) {
            case 0:
                List list = (List) this.A00;
                C56962sq r2 = (C56962sq) this.A01;
                Activity activity = (Activity) this.A02;
                if (list.size() == 1) {
                    Object A0k = C18290x4.A0k(list);
                    C626936e.A06(A0k);
                    r2.A0G(activity, (UserJid) A0k);
                    return;
                }
                Intent A07 = C18320x8.A07();
                A07.setClassName(activity.getPackageName(), "com.whatsapp.blocklist.BlockList");
                activity.startActivity(A07);
                return;
            case 1:
                ((C112625k2) this.A00).A01.A08((C89644eZ) this.A01, C91594kQ.A00, (C64583Eb) this.A02, 5);
                return;
            case 2:
                List list2 = (List) this.A01;
                C95814uZ r22 = (C95814uZ) this.A02;
                C003203q A0Q = ((C08310eF) this.A00).A0Q();
                if (A0Q instanceof C836049b) {
                    ((C836049b) A0Q).BPr(r22, ((C59392wq) list2.get(i)).A00);
                    return;
                }
                return;
            case 3:
                ((CreateGroupSuspendDialog) this.A00).A00.A00((C89654ea) this.A01, (C27991fJ) this.A02);
                return;
            case 4:
                C53712nX r6 = (C53712nX) this.A00;
                C27981fH r4 = (C27981fH) this.A01;
                Integer num = (Integer) this.A02;
                RequestPhoneNumberViewModel requestPhoneNumberViewModel = r6.A05;
                if (requestPhoneNumberViewModel == null) {
                    return;
                }
                if (r6.A02.A0P(r4)) {
                    AnonymousClass29V r5 = new AnonymousClass29V(new AnonymousClass3E4(r4, r6, num), r4, r6, 1);
                    AnonymousClass3ZH A0A = r6.A03.A0A(r4);
                    C89644eZ r42 = r6.A01;
                    r42.Boo(UnblockDialogFragment.A00(r5, AnonymousClass002.A0F(r42, r6.A04.A0H(A0A), new Object[1], 0, R.string.f11nameremoved), 0, false));
                    return;
                }
                int intValue = num.intValue();
                C162457s7.A0J(r4, 0);
                C71713cY.A00(requestPhoneNumberViewModel.A06, requestPhoneNumberViewModel, r4, intValue, 8);
                dialogInterface.dismiss();
                return;
            default:
                C70133a0.A01((AnonymousClass4FS) this.A00, this.A01, this.A02, 19);
                return;
        }
    }
}
