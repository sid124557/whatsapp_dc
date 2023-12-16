package X;

import android.content.Intent;
import com.whatsapp.jid.Jid;
import com.whatsapp.payments.ui.PaymentInvitePickerActivity;
import java.util.ArrayList;

/* renamed from: X.9iQ  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C200499iQ implements Runnable {
    public final /* synthetic */ PaymentInvitePickerActivity A00;
    public final /* synthetic */ ArrayList A01;

    public final void run() {
        Intent putExtra;
        int i;
        PaymentInvitePickerActivity paymentInvitePickerActivity = this.A00;
        ArrayList arrayList = this.A01;
        int size = arrayList.size();
        Intent A07 = C18320x8.A07();
        if (size == 1) {
            putExtra = A07.putExtra("extra_invitee_jid", ((Jid) arrayList.get(0)).getRawString());
            i = -1;
        } else {
            putExtra = A07.putExtra("extra_inviter_count", arrayList.size());
            i = 501;
        }
        paymentInvitePickerActivity.setResult(i, putExtra);
        paymentInvitePickerActivity.finish();
    }

    public /* synthetic */ C200499iQ(PaymentInvitePickerActivity paymentInvitePickerActivity, ArrayList arrayList) {
        this.A00 = paymentInvitePickerActivity;
        this.A01 = arrayList;
    }
}
