package X;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.whatsapp.ephemeral.ChangeEphemeralSettingActivity;
import com.whatsapp.jid.UserJid;

/* renamed from: X.975  reason: invalid class name */
public class AnonymousClass975 extends C88914b0 {
    public final /* synthetic */ ChangeEphemeralSettingActivity A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass975(Context context, ChangeEphemeralSettingActivity changeEphemeralSettingActivity) {
        super(context);
        this.A00 = changeEphemeralSettingActivity;
    }

    public void onClick(View view) {
        ChangeEphemeralSettingActivity changeEphemeralSettingActivity = this.A00;
        int i = 4;
        if (changeEphemeralSettingActivity.A0I instanceof UserJid) {
            i = 3;
        }
        Intent A07 = C18320x8.A07();
        C627736r.A1G(changeEphemeralSettingActivity, A07, i);
        changeEphemeralSettingActivity.startActivity(A07);
    }
}
