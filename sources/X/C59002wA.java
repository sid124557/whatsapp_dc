package X;

import android.os.Bundle;
import com.whatsapp.group.NewGroupRouter;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2wA  reason: invalid class name and case insensitive filesystem */
public final class C59002wA {
    public static final NewGroupRouter A00(C27991fJ r5, List list, int i, boolean z) {
        NewGroupRouter newGroupRouter = new NewGroupRouter();
        Bundle A08 = AnonymousClass002.A08();
        ArrayList A0u = C18300x5.A0u(list);
        C627336j.A0H(list, A0u);
        A08.putStringArrayList("preselected_jids", A0u);
        A08.putString("parent_group", C18290x4.A0n(r5));
        A08.putBoolean("duplicate_ug_found", false);
        A08.putInt("entry_point", i);
        A08.putBoolean("create_lazily", false);
        A08.putBoolean("optional_participants", z);
        newGroupRouter.A0u(A08);
        return newGroupRouter;
    }

    public final NewGroupRouter A01(C27991fJ r7, String str, List list, List list2, int i, boolean z, boolean z2) {
        Bundle A08 = AnonymousClass002.A08();
        if (list2 != null && !list2.isEmpty()) {
            C107395bF.A09(A08, list2);
        }
        NewGroupRouter newGroupRouter = new NewGroupRouter();
        Bundle A082 = AnonymousClass002.A08();
        ArrayList A0u = C18300x5.A0u(list);
        C627336j.A0H(list, A0u);
        A082.putStringArrayList("preselected_jids", A0u);
        A082.putString("parent_group", C18290x4.A0n(r7));
        A082.putBoolean("duplicate_ug_found", z);
        A082.putInt("entry_point", i);
        A082.putBoolean("include_captions", z2);
        A082.putString("appended_message", str);
        A082.putBoolean("create_lazily", false);
        A082.putBoolean("optional_participants", false);
        A082.putBundle("optional_messages", A08);
        newGroupRouter.A0u(A082);
        return newGroupRouter;
    }
}
