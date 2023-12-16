package X;

import com.whatsapp.util.Log;

/* renamed from: X.4Ii  reason: invalid class name and case insensitive filesystem */
public class C85974Ii implements AnonymousClass4EI {
    public Object A00;
    public final int A01;

    public C85974Ii(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void BQp() {
        switch (this.A01) {
            case 0:
                Log.e("DeleteAccountConfirmation/Failed to delete shops user.");
                return;
            case 1:
                ((AnonymousClass4DP) this.A00).onFailure(new Exception("AvatarUserManagementHelper/createAvatarUser/onDeliveryFailure"));
                return;
            case 2:
                ((AnonymousClass4DP) this.A00).onFailure(new Exception("AvatarUserManagementHelper/deleteAvatarUser/onDeliveryFailure"));
                return;
            case 3:
                ((AnonymousClass4DP) this.A00).onFailure(new Exception("AvatarUserManagementHelper/generateAvatarRefreshToken/onDeliveryFailure"));
                return;
            case 4:
                return;
            default:
                ((AnonymousClass4EJ) this.A00).BQp();
                return;
        }
    }

    public void BSB(Exception exc) {
        switch (this.A01) {
            case 0:
                Log.e("DeleteAccountConfirmation/Failed to delete shops user.");
                return;
            case 4:
                return;
            case 5:
            case 6:
                C162457s7.A0J(exc, 0);
                ((AnonymousClass4EJ) this.A00).BSB(exc);
                return;
            default:
                C162457s7.A0J(exc, 0);
                ((AnonymousClass4DP) this.A00).onFailure(exc);
                return;
        }
    }

    public void Bd3(C60272yH r3) {
        AnonymousClass4DP r1;
        switch (this.A01) {
            case 0:
                Log.i("DeleteAccountConfirmation/Shops user deleted successfully.");
                return;
            case 1:
                r1 = (AnonymousClass4DP) this.A00;
                if (r3 == null) {
                    r1.onFailure(AnonymousClass001.A0e("Avatar User Entity is null"));
                    return;
                }
                break;
            case 2:
                ((AnonymousClass4DP) this.A00).onSuccess();
                return;
            case 3:
                r1 = (AnonymousClass4DP) this.A00;
                if (r3 == null) {
                    r1.onFailure(AnonymousClass001.A0e("Avatar User Entity is null"));
                    return;
                }
                break;
            case 4:
                AnonymousClass0x9.A0c(((AnonymousClass1gK) this.A00).A04).A03();
                return;
            default:
                ((AnonymousClass4EJ) this.A00).Bd3(r3);
                return;
        }
        r1.onSuccess();
    }
}
