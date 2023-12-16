package X;

import android.os.Bundle;
import com.whatsapp.newsletter.multiadmin.AdminInviteErrorDialog;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.27t  reason: invalid class name */
public final class AnonymousClass27t {
    public static final AdminInviteErrorDialog A00(AnonymousClass21J r4, String str, String str2, List list) {
        C162457s7.A0J(r4, 3);
        AdminInviteErrorDialog adminInviteErrorDialog = new AdminInviteErrorDialog();
        Bundle A08 = AnonymousClass002.A08();
        A08.putString("arg_dialog_message", str);
        ArrayList A0u = C18300x5.A0u(list);
        C627336j.A0H(list, A0u);
        A08.putStringArrayList("invitee_jids", A0u);
        A08.putString("arg_caption", str2);
        A08.putString("arg_action", r4.toString());
        adminInviteErrorDialog.A0u(A08);
        return adminInviteErrorDialog;
    }
}
