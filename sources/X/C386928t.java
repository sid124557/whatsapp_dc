package X;

import android.os.Bundle;
import com.whatsapp.jid.UserJid;
import com.whatsapp.status.StatusConfirmMuteDialogFragment;

/* renamed from: X.28t  reason: invalid class name and case insensitive filesystem */
public final class C386928t {
    public static final StatusConfirmMuteDialogFragment A00(UserJid userJid, Long l, String str, String str2, String str3, boolean z) {
        C162457s7.A0J(userJid, 0);
        StatusConfirmMuteDialogFragment statusConfirmMuteDialogFragment = new StatusConfirmMuteDialogFragment();
        Bundle A08 = AnonymousClass002.A08();
        AnonymousClass0x2.A0v(A08, userJid, "jid");
        A08.putString("message_id", str);
        A08.putLong("status_item_index", AnonymousClass0x2.A0D(l));
        A08.putString("psa_campaign_id", str2);
        A08.putString("psa_campaign_ids", str3);
        A08.putBoolean("is_message_sampled", z);
        statusConfirmMuteDialogFragment.A0u(A08);
        return statusConfirmMuteDialogFragment;
    }
}
