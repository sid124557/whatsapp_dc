package X;

import com.whatsapp.avatar.home.AvatarHomeViewModel;
import com.whatsapp.util.Log;

/* renamed from: X.2AW  reason: invalid class name */
public class AnonymousClass2AW implements AnonymousClass4DP {
    public Object A00;
    public final int A01;

    public AnonymousClass2AW(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void onFailure(Exception exc) {
        switch (this.A01) {
            case 0:
                Log.i("onConfirmDeleteAvatarClicked/error");
                ((AvatarHomeViewModel) this.A00).A00.A0H(new AnonymousClass1IJ(AnonymousClass1IG.A00, false, true, false));
                return;
            case 1:
                C162457s7.A0J(exc, 0);
                Log.e("AvatarBackup/restore failed", exc);
                ((C72183dJ) this.A00).BQr(exc);
                return;
            default:
                C162457s7.A0J(exc, 0);
                Log.e("AvatarUserManagementHelper/generateTokenAfterMigration failed", exc);
                return;
        }
    }

    public void onSuccess() {
        switch (this.A01) {
            case 0:
                Log.i("onConfirmDeleteAvatarClicked/success");
                ((AvatarHomeViewModel) this.A00).A00.A0H(new AnonymousClass1II(true));
                return;
            case 1:
                Log.d("AvatarBackup/restore success");
                ((C72183dJ) this.A00).BQt(Boolean.TRUE);
                return;
            default:
                C54612p0 r3 = (C54612p0) this.A00;
                r3.A00.A0S(new C71273bq((Object) r3, 6));
                Log.d("AvatarUserManagementHelper/generateTokenAfterMigration success");
                return;
        }
    }
}
