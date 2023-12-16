package X;

import android.os.SystemClock;
import com.whatsapp.accountsync.ProfileActivity;

/* renamed from: X.1tY  reason: invalid class name and case insensitive filesystem */
public class C33701tY extends AnonymousClass5ZM {
    public final /* synthetic */ ProfileActivity A00;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        ProfileActivity profileActivity;
        int i = 0;
        while (true) {
            profileActivity = this.A00;
            if (profileActivity.A06.A0l.A01) {
                if (i >= 45000) {
                    break;
                }
                i += 200;
                SystemClock.sleep(200);
            } else if (i < 45000) {
                return null;
            }
        }
        if (!profileActivity.A06.A0l.A01) {
            return null;
        }
        profileActivity.A06.A0A(3);
        return null;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C33701tY(ProfileActivity profileActivity) {
        super(profileActivity, true);
        this.A00 = profileActivity;
    }

    public void A0A() {
        C621433s.A01(this.A00, 104);
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        ProfileActivity profileActivity = this.A00;
        C621433s.A00(profileActivity, 104);
        profileActivity.A79();
    }
}
