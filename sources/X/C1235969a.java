package X;

import android.app.Activity;
import android.os.SystemClock;
import com.whatsapp.R;
import com.whatsapp.chatinfo.ListChatInfoActivity;
import com.whatsapp.settings.SettingsChatHistoryFragment;
import com.whatsapp.util.Log;

/* renamed from: X.69a  reason: invalid class name and case insensitive filesystem */
public class C1235969a implements AnonymousClass66K {
    public Object A00;
    public final int A01;

    public C1235969a(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void BWt() {
        Activity activity;
        int i;
        switch (this.A01) {
            case 0:
                activity = (Activity) this.A00;
                i = 2;
                break;
            case 1:
                activity = ((C89864fP) this.A00).A03;
                i = 20;
                break;
            default:
                return;
        }
        C621433s.A00(activity, i);
    }

    public void BYT(boolean z) {
        boolean z2 = z;
        switch (this.A01) {
            case 0:
                Log.i("list_chat_info/onclick_leaveGroup");
                ListChatInfoActivity listChatInfoActivity = (ListChatInfoActivity) this.A00;
                C18270x1.A0w(new C33801ti(listChatInfoActivity, listChatInfoActivity.A03, listChatInfoActivity.A7G(), z), listChatInfoActivity.A04);
                return;
            case 1:
                C89864fP r2 = (C89864fP) this.A00;
                C621433s.A00(r2.A03, 20);
                r2.A09.BpA(0, R.string.f11nameremoved);
                long elapsedRealtime = SystemClock.elapsedRealtime();
                AnonymousClass6AB r1 = (AnonymousClass6AB) r2.A0Z;
                if (r1.A01 != 0) {
                    AnonymousClass4VQ r0 = ((C113245l7) r1.A00).A3B;
                    r0.A0K();
                    r0.A0J();
                }
                C33601tO r12 = r2.A00;
                if (r12 != null) {
                    r12.A01 = null;
                    r12.A00 = null;
                    r12.A0D(true);
                }
                C33601tO r3 = new C33601tO(r2.A0E, r2.A0o, r2.A01, r2.A02, elapsedRealtime, false, z2);
                r2.A00 = r3;
                r2.A0x.BkL(r3, new Object[0]);
                return;
            default:
                SettingsChatHistoryFragment settingsChatHistoryFragment = (SettingsChatHistoryFragment) this.A00;
                C89114bZ r02 = settingsChatHistoryFragment.A00;
                if (r02 != null) {
                    r02.BpA(R.string.f11nameremoved, R.string.f11nameremoved);
                }
                settingsChatHistoryFragment.A0C.BkM(new C71363bz(10, this, z));
                return;
        }
    }
}
