package X;

import androidx.appcompat.widget.SwitchCompat;
import com.whatsapp.group.GroupPermissionsActivity;
import com.whatsapp.group.GroupPermissionsLayout;

/* renamed from: X.61e  reason: invalid class name and case insensitive filesystem */
public final class C1216061e extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ GroupPermissionsActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1216061e(GroupPermissionsActivity groupPermissionsActivity) {
        super(1);
        this.this$0 = groupPermissionsActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        boolean A1Z = AnonymousClass001.A1Z(obj);
        GroupPermissionsLayout groupPermissionsLayout = this.this$0.A0A;
        if (groupPermissionsLayout == null) {
            throw C18270x1.A0S("groupPermissionsLayout");
        }
        SwitchCompat switchCompat = groupPermissionsLayout.A04;
        if (switchCompat == null) {
            throw C18270x1.A0S("sendMessagesSwitch");
        }
        switchCompat.setChecked(A1Z);
        SwitchCompat switchCompat2 = groupPermissionsLayout.A04;
        if (switchCompat2 == null) {
            throw C18270x1.A0S("sendMessagesSwitch");
        }
        switchCompat2.jumpDrawablesToCurrentState();
        return C59022wD.A00;
    }
}
