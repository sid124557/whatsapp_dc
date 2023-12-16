package com.whatsapp.community;

import X.AnonymousClass0x2;
import X.AnonymousClass0x7;
import X.AnonymousClass1VX;
import X.AnonymousClass4UI;
import X.AnonymousClass5X8;
import X.AnonymousClass64B;
import X.AnonymousClass6C6;
import X.C06560Yg;
import X.C106715a2;
import X.C106905aM;
import X.C172578Lw;
import X.C18320x8;
import X.C27991fJ;
import X.C86664Kz;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.util.Log;

public class NewCommunityAdminBottomSheetFragment extends Hilt_NewCommunityAdminBottomSheetFragment implements AnonymousClass64B {
    public AnonymousClass5X8 A00;
    public AnonymousClass4UI A01;
    public AnonymousClass1VX A02;
    public C106715a2 A03;

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C27991fJ r1 = (C27991fJ) A0H().getParcelable("parent_group_jid");
        if (r1 != null) {
            this.A01.A00 = r1;
            return C86664Kz.A0h(layoutInflater, viewGroup, R.layout.f8nameremoved);
        }
        Log.e("NewCommunityAdminBottomSheetFragment/onCreateView parent jid was null");
        A1K();
        return null;
    }

    public void A0p(Bundle bundle) {
        super.A0p(bundle);
        AnonymousClass6C6.A01(this, this.A01.A01, 130);
    }

    public void A0w(Bundle bundle, View view) {
        super.A0w(bundle, view);
        AnonymousClass0x2.A0z(C06560Yg.A02(view, R.id.bottom_sheet_close_button), this, 35);
        C106905aM.A03(view, R.id.newCommunityAdminNux_title);
        TextEmojiLabel A0K = AnonymousClass0x7.A0K(view, R.id.newCommunityAdminNux_description);
        AnonymousClass0x2.A14(this.A02, A0K);
        String[] strArr = new String[1];
        AnonymousClass0x7.A1E(this.A00.A00("https://www.whatsapp.com/communities/learning"), strArr, 0);
        A0K.setText(this.A03.A04(A1D(), AnonymousClass0x7.A0n(this, "learn-more", new Object[1], 0, R.string.f11nameremoved), new Runnable[]{new C172578Lw(16)}, new String[]{"learn-more"}, strArr));
        C18320x8.A13(C06560Yg.A02(view, R.id.newCommunityAdminNux_continueButton), this, 41);
        C18320x8.A13(C06560Yg.A02(view, R.id.newCommunityAdminNux_removeAsAdminButton), this, 42);
    }
}
