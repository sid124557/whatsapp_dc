package X;

import android.view.View;
import com.whatsapp.WaEditText;
import com.whatsapp.avatar.home.AvatarHomeActivity;
import com.whatsapp.expressionstray.stickers.SearchFunStickersBottomSheet;

/* renamed from: X.4H4  reason: invalid class name */
public class AnonymousClass4H4 extends AnonymousClass7XV {
    public Object A00;
    public final int A01;

    public AnonymousClass4H4(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void A02(View view, float f) {
        WaEditText waEditText;
        if (this.A01 != 0 && (waEditText = ((SearchFunStickersBottomSheet) this.A00).A08) != null) {
            waEditText.A05();
            waEditText.clearFocus();
        }
    }

    public void A03(View view, int i) {
        if (this.A01 == 0) {
            AvatarHomeActivity avatarHomeActivity = (AvatarHomeActivity) this.A00;
            if (i == 5) {
                avatarHomeActivity.A75();
                return;
            }
            C107405bG.A0C(avatarHomeActivity.getWindow(), false);
            C107405bG.A07(avatarHomeActivity, AnonymousClass34K.A00(avatarHomeActivity));
            AnonymousClass0R8 supportActionBar = avatarHomeActivity.getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.A07();
            }
        }
    }
}
