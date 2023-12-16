package X;

import com.whatsapp.ListItemWithLeftIcon;
import com.whatsapp.R;
import com.whatsapp.group.GroupPermissionsActivity;
import com.whatsapp.group.GroupPermissionsLayout;

/* renamed from: X.61g  reason: invalid class name and case insensitive filesystem */
public final class C1216261g extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ GroupPermissionsActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1216261g(GroupPermissionsActivity groupPermissionsActivity) {
        super(1);
        this.this$0 = groupPermissionsActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        boolean A1Z = AnonymousClass001.A1Z(obj);
        GroupPermissionsLayout groupPermissionsLayout = this.this$0.A0A;
        if (groupPermissionsLayout == null) {
            throw C18270x1.A0S("groupPermissionsLayout");
        }
        int A08 = AnonymousClass001.A08(A1Z ? 1 : 0);
        ListItemWithLeftIcon listItemWithLeftIcon = groupPermissionsLayout.A07;
        if (listItemWithLeftIcon == null) {
            throw C18270x1.A0S("manageAdminsView");
        }
        listItemWithLeftIcon.setVisibility(A08);
        C86604Kt.A1F(groupPermissionsLayout, R.id.admins_section_title, A08);
        return C59022wD.A00;
    }
}
