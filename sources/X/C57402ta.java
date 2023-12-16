package X;

import android.os.Bundle;
import com.whatsapp.mute.ui.MuteDialogFragment;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: X.2ta  reason: invalid class name and case insensitive filesystem */
public final class C57402ta {
    public static final MuteDialogFragment A00(C95814uZ r4, AnonymousClass21R r5) {
        C18260x0.A0O(r4, r5);
        MuteDialogFragment muteDialogFragment = new MuteDialogFragment();
        Bundle A08 = AnonymousClass002.A08();
        AnonymousClass0x2.A0v(A08, r4, "jid");
        A08.putInt("mute_entry_point", r5.ordinal());
        muteDialogFragment.A0u(A08);
        return muteDialogFragment;
    }

    public static final MuteDialogFragment A01(AnonymousClass21R r5, Collection collection) {
        boolean A1U = C18270x1.A1U(collection, r5);
        MuteDialogFragment muteDialogFragment = new MuteDialogFragment();
        Bundle A08 = AnonymousClass002.A08();
        ArrayList A0u = C18300x5.A0u(collection);
        C627336j.A0H(collection, A0u);
        A08.putStringArrayList("jids", A0u);
        A08.putBoolean("mute_in_conversation_fragment", A1U);
        A08.putInt("mute_entry_point", r5.ordinal());
        muteDialogFragment.A0u(A08);
        return muteDialogFragment;
    }
}
