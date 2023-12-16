package X;

import android.os.Process;
import com.whatsapp.avatar.home.AvatarHomeActivity;
import com.whatsapp.avatar.home.AvatarHomeViewModel;
import com.whatsapp.community.AddGroupsToCommunityActivity;
import com.whatsapp.community.NewCommunityActivity;
import com.whatsapp.community.deactivate.DeactivateCommunityDisclaimerActivity;
import com.whatsapp.settings.SettingsChat;
import com.whatsapp.util.Log;

/* renamed from: X.4Hz  reason: invalid class name and case insensitive filesystem */
public class C85884Hz implements C181548mw {
    public Object A00;
    public final int A01;

    public C85884Hz(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void BP1() {
        switch (this.A01) {
            case 0:
                AvatarHomeViewModel avatarHomeViewModel = (AvatarHomeViewModel) ((AvatarHomeActivity) this.A00).A0L.getValue();
                Log.i("onConfirmDeleteAvatarClicked");
                avatarHomeViewModel.A00.A0H(new AnonymousClass1IJ(AnonymousClass1IG.A00, true, false, false));
                avatarHomeViewModel.A04.A03((Boolean) null, 25);
                C43222Rg r4 = avatarHomeViewModel.A03;
                AnonymousClass2AW r3 = new AnonymousClass2AW(avatarHomeViewModel, 0);
                C18270x1.A0l(C18270x1.A04(((C51932kc) r4.A03.get()).A01), "pref_avatar_user_remote_deletion", true);
                r4.A01.BkP(new C71403c3(r4, r3, 7));
                return;
            case 1:
                ((AddGroupsToCommunityActivity) this.A00).A75();
                return;
            case 2:
                ((AddGroupsToCommunityActivity) this.A00).A74();
                return;
            case 3:
                ((NewCommunityActivity) this.A00).A76();
                return;
            case 4:
                ((DeactivateCommunityDisclaimerActivity) this.A00).A74();
                return;
            default:
                SettingsChat settingsChat = (SettingsChat) this.A00;
                settingsChat.A03.toggle();
                C54412og r1 = settingsChat.A0A;
                C54412og.A00(r1).putBoolean("otp_split_mode_user_choice", settingsChat.A03.isChecked()).commit();
                settingsChat.finishAffinity();
                C18260x0.A0q("Killing WhatsApp process - reason: ", "Split layout change requested by user", AnonymousClass001.A0o());
                Process.killProcess(Process.myPid());
                return;
        }
    }
}
