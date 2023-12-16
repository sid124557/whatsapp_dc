package X;

import android.os.Bundle;
import com.whatsapp.jid.UserJid;
import com.whatsapp.status.StatusConfirmUnmuteDialogFragment;

/* renamed from: X.28u  reason: invalid class name and case insensitive filesystem */
public final class C387028u {
    public static final StatusConfirmUnmuteDialogFragment A00(UserJid userJid, Long l, String str, String str2, String str3, boolean z) {
        C162457s7.A0J(userJid, 0);
        StatusConfirmUnmuteDialogFragment statusConfirmUnmuteDialogFragment = new StatusConfirmUnmuteDialogFragment();
        Bundle A08 = AnonymousClass002.A08();
        AnonymousClass0x2.A0v(A08, userJid, "jid");
        A08.putString("message_id", str);
        A08.putLong("status_item_index", AnonymousClass0x2.A0D(l));
        A08.putString("psa_campaign_id", str2);
        A08.putString("psa_campaign_ids", str3);
        A08.putBoolean("is_message_sampled", z);
        statusConfirmUnmuteDialogFragment.A0u(A08);
        return statusConfirmUnmuteDialogFragment;
    }
}
