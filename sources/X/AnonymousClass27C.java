package X;

import android.os.Bundle;
import com.whatsapp.group.AddMembersRouter;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: X.27C  reason: invalid class name */
public final class AnonymousClass27C {
    public static final void A00(C08270df r6, C15910sA r7, C27991fJ r8, C27991fJ r9, Collection collection, AnonymousClass4GP r11, AnonymousClass4GQ r12, int i, int i2, boolean z) {
        C162457s7.A0J(r7, 1);
        C162457s7.A0J(r8, 2);
        C162457s7.A0J(collection, 5);
        C08240dc r2 = new C08240dc(r6);
        AddMembersRouter addMembersRouter = new AddMembersRouter();
        Bundle A08 = AnonymousClass002.A08();
        AnonymousClass0x2.A0v(A08, r8, "group");
        A08.putString("parent_group", C18290x4.A0n(r9));
        ArrayList A0u = C18300x5.A0u(collection);
        C627336j.A0H(collection, A0u);
        A08.putStringArrayList("jids", A0u);
        A08.putInt("request_invite_members", i);
        A08.putBoolean("is_cag_and_community_add", z);
        A08.putInt("entry_point", i2);
        addMembersRouter.A0u(A08);
        r2.A0C(addMembersRouter, "tag");
        r2.A04();
        r6.A0j(new C86484Kh(r11, 0), r7, "AddMembersRouter");
        r6.A0j(new C86484Kh(r12, 1), r7, "AddMembersSuccess");
    }
}
