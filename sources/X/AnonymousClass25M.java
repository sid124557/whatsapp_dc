package X;

import android.os.Bundle;
import com.whatsapp.community.CommunityConfirmLinkDialogFragment;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.25M  reason: invalid class name */
public final class AnonymousClass25M {
    public static final CommunityConfirmLinkDialogFragment A00(C370220q r4, List list) {
        C18260x0.A0O(list, r4);
        CommunityConfirmLinkDialogFragment communityConfirmLinkDialogFragment = new CommunityConfirmLinkDialogFragment();
        Bundle A08 = AnonymousClass002.A08();
        ArrayList A0u = C18300x5.A0u(list);
        C627336j.A0H(list, A0u);
        A08.putStringArrayList("subgroup_jid_list", A0u);
        A08.putString("link_mode", r4.toString());
        communityConfirmLinkDialogFragment.A0u(A08);
        return communityConfirmLinkDialogFragment;
    }
}
