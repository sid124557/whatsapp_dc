package X;

import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.chatinfo.view.custom.SharePhoneNumberBottomSheet;
import com.whatsapp.jid.Jid;

/* renamed from: X.3LX  reason: invalid class name */
public final class AnonymousClass3LX implements AnonymousClass485 {
    public DialogFragment A00(Jid jid, int i) {
        C162457s7.A0J(jid, 0);
        SharePhoneNumberBottomSheet sharePhoneNumberBottomSheet = new SharePhoneNumberBottomSheet();
        Bundle A08 = AnonymousClass002.A08();
        AnonymousClass0x2.A0v(A08, jid, "arg_jid");
        A08.putInt("arg_entry_point", i);
        sharePhoneNumberBottomSheet.A0u(A08);
        return sharePhoneNumberBottomSheet;
    }
}
