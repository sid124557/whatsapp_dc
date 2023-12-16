package X;

import android.content.DialogInterface;
import android.os.SystemClock;
import com.whatsapp.R;
import com.whatsapp.conversation.conversationrow.SecurityNotificationDialogFragment;
import com.whatsapp.settings.SettingsCompanionLogoutDialog;
import com.whatsapp.stickers.StarOrRemoveFromRecentsStickerDialogFragment;
import com.whatsapp.util.Log;
import com.whatsapp.webview.ui.WaInAppBrowsingActivity;
import java.util.Collections;

/* renamed from: X.4I5  reason: invalid class name */
public class AnonymousClass4I5 implements DialogInterface.OnClickListener {
    public Object A00;
    public boolean A01;
    public final int A02;

    public AnonymousClass4I5(int i, Object obj, boolean z) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = z;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        String str;
        switch (this.A02) {
            case 0:
                SecurityNotificationDialogFragment securityNotificationDialogFragment = (SecurityNotificationDialogFragment) this.A00;
                boolean z = this.A01;
                C66433Lk r1 = securityNotificationDialogFragment.A05;
                if (z) {
                    str = "seeing-your-security-code-could-not-be-verified";
                } else {
                    str = "26000361";
                }
                securityNotificationDialogFragment.A00.A0A(securityNotificationDialogFragment.A1D(), C18310x6.A0D(C66433Lk.A00(r1, str)));
                return;
            case 1:
                SettingsCompanionLogoutDialog settingsCompanionLogoutDialog = (SettingsCompanionLogoutDialog) this.A00;
                if (this.A01) {
                    Log.i("SettingsCompanionLogoutDialog/onCreateDialog/remove account");
                    settingsCompanionLogoutDialog.A00.A0A(settingsCompanionLogoutDialog.A0G(), C627736r.A13(settingsCompanionLogoutDialog.A0G(), (String) null, settingsCompanionLogoutDialog.A06.A02(), settingsCompanionLogoutDialog.A05.A0C(), 18, SystemClock.elapsedRealtime()));
                    return;
                }
                settingsCompanionLogoutDialog.A07.BkP(new C71283br((Object) settingsCompanionLogoutDialog, 48));
                settingsCompanionLogoutDialog.A01.A0G(0, R.string.f11nameremoved);
                return;
            case 2:
                StarOrRemoveFromRecentsStickerDialogFragment starOrRemoveFromRecentsStickerDialogFragment = (StarOrRemoveFromRecentsStickerDialogFragment) this.A00;
                boolean z2 = this.A01;
                if (i == -3) {
                    AnonymousClass4FS r3 = starOrRemoveFromRecentsStickerDialogFragment.A03;
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("remove_recent_sticker");
                    r3.BkN(new C71363bz(13, starOrRemoveFromRecentsStickerDialogFragment, z2), AnonymousClass000.A0X(starOrRemoveFromRecentsStickerDialogFragment.A01.A0D, A0o));
                    return;
                } else if (i == -1) {
                    starOrRemoveFromRecentsStickerDialogFragment.A02.A0E(Collections.singleton(starOrRemoveFromRecentsStickerDialogFragment.A01));
                    return;
                } else {
                    return;
                }
            default:
                WaInAppBrowsingActivity waInAppBrowsingActivity = (WaInAppBrowsingActivity) this.A00;
                boolean z3 = this.A01;
                dialogInterface.dismiss();
                if (z3) {
                    waInAppBrowsingActivity.A76(0, waInAppBrowsingActivity.A74());
                    return;
                }
                return;
        }
    }
}
