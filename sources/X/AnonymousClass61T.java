package X;

import android.widget.TextView;
import com.whatsapp.ListItemWithLeftIcon;
import com.whatsapp.R;
import com.whatsapp.group.GroupPermissionsActivity;
import com.whatsapp.group.GroupPermissionsLayout;
import java.util.List;

/* renamed from: X.61T  reason: invalid class name */
public final class AnonymousClass61T extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ GroupPermissionsActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass61T(GroupPermissionsActivity groupPermissionsActivity) {
        super(1);
        this.this$0 = groupPermissionsActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        List list = (List) obj;
        C162457s7.A0J(list, 0);
        GroupPermissionsLayout groupPermissionsLayout = this.this$0.A0A;
        if (groupPermissionsLayout == null) {
            throw C18270x1.A0S("groupPermissionsLayout");
        }
        ListItemWithLeftIcon listItemWithLeftIcon = groupPermissionsLayout.A07;
        if (listItemWithLeftIcon == null) {
            throw C18270x1.A0S("manageAdminsView");
        }
        listItemWithLeftIcon.setDescription((CharSequence) AnonymousClass5VS.A00(groupPermissionsLayout.getWaLocale(), list, true));
        ListItemWithLeftIcon listItemWithLeftIcon2 = groupPermissionsLayout.A07;
        if (listItemWithLeftIcon2 == null) {
            throw C18270x1.A0S("manageAdminsView");
        }
        TextView A0F = C18280x3.A0F(listItemWithLeftIcon2, R.id.list_item_description);
        A0F.setMaxLines(1);
        C86664Kz.A1S(A0F);
        return C59022wD.A00;
    }
}
