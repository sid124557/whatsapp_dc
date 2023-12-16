package X;

import android.content.DialogInterface;
import android.os.Bundle;
import com.whatsapp.R;
import com.whatsapp.conversation.conversationrow.ConversationRowContact$MessageSharedContactDialogFragment;
import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.P2mLiteOrderDetailsActivity;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4I7  reason: invalid class name */
public class AnonymousClass4I7 implements DialogInterface.OnClickListener {
    public Object A00;
    public Object A01;
    public String A02;
    public final int A03;

    public AnonymousClass4I7(Object obj, Object obj2, String str, int i) {
        this.A03 = i;
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.A03) {
            case 0:
                ConversationRowContact$MessageSharedContactDialogFragment conversationRowContact$MessageSharedContactDialogFragment = (ConversationRowContact$MessageSharedContactDialogFragment) this.A00;
                String str = this.A02;
                UserJid userJid = ((C59392wq) ((List) this.A01).get(i)).A01;
                if (userJid != null) {
                    conversationRowContact$MessageSharedContactDialogFragment.A00.A01(conversationRowContact$MessageSharedContactDialogFragment.A1D(), userJid, str, (String) null);
                    return;
                }
                return;
            case 1:
                P2mLiteOrderDetailsActivity p2mLiteOrderDetailsActivity = (P2mLiteOrderDetailsActivity) this.A00;
                String str2 = this.A02;
                String A0l = C18290x4.A0l(p2mLiteOrderDetailsActivity, R.string.f11nameremoved);
                AnonymousClass303 A002 = C57062t0.A00();
                A002.A03("payments_error_code", "10755");
                A002.A03("payments_error_text", A0l);
                p2mLiteOrderDetailsActivity.A76(A002, (C30791n7) this.A01, 115, "error_dialog", str2, 1);
                return;
            default:
                P2mLiteOrderDetailsActivity p2mLiteOrderDetailsActivity2 = (P2mLiteOrderDetailsActivity) this.A00;
                String str3 = this.A02;
                String A0l2 = C18290x4.A0l(p2mLiteOrderDetailsActivity2, R.string.f11nameremoved);
                AnonymousClass303 A003 = C57062t0.A00();
                A003.A03("payments_error_code", "10755");
                A003.A03("payments_error_text", A0l2);
                p2mLiteOrderDetailsActivity2.A76(A003, (C30791n7) this.A01, 158, "error_dialog", str3, 1);
                AnonymousClass5WY r2 = p2mLiteOrderDetailsActivity2.A00;
                if (r2 != null) {
                    C53202mi r0 = p2mLiteOrderDetailsActivity2.A09;
                    if (r0 != null) {
                        p2mLiteOrderDetailsActivity2.startActivity(r2.A00(p2mLiteOrderDetailsActivity2, (Bundle) null, (C631938h) null, (Integer) null, "payments-blocked", (String) null, (ArrayList) null, (ArrayList) null, r0.A00()));
                        return;
                    }
                    throw C18270x1.A0S("supportGatingUtils");
                }
                throw C18270x1.A0S("sendFeedback");
        }
    }
}
