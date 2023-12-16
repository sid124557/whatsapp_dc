package com.whatsapp.community;

import X.AnonymousClass0x2;
import X.AnonymousClass0x7;
import X.AnonymousClass1VX;
import X.AnonymousClass24P;
import X.AnonymousClass34R;
import X.AnonymousClass64B;
import X.AnonymousClass7CJ;
import X.C06560Yg;
import X.C106715a2;
import X.C106905aM;
import X.C124086Ax;
import X.C125196Gs;
import X.C162457s7;
import X.C172578Lw;
import X.C18320x8;
import X.C27991fJ;
import X.C620633i;
import X.C64653Ej;
import X.C66433Lk;
import X.C86664Kz;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;

public class AboutCommunityBottomSheetFragment extends Hilt_AboutCommunityBottomSheetFragment implements AnonymousClass64B {
    public AnonymousClass7CJ A00;
    public C64653Ej A01;
    public C620633i A02;
    public AnonymousClass1VX A03;
    public C27991fJ A04;
    public C66433Lk A05;
    public C106715a2 A06;

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C86664Kz.A0h(layoutInflater, viewGroup, R.layout.f8nameremoved);
    }

    public void A0p(Bundle bundle) {
        super.A0p(bundle);
        try {
            C27991fJ A052 = AnonymousClass34R.A05(A0H().getString("EXTRA_PARENT_GROUP_JID"));
            this.A04 = A052;
            AnonymousClass7CJ r1 = this.A00;
            C162457s7.A0J(r1, 1);
            C125196Gs r0 = (C125196Gs) C124086Ax.A00(this, A052, r1, 2).A01(C125196Gs.class);
            r0.A01.A01("community_home", r0.A00);
        } catch (AnonymousClass24P e) {
            throw new RuntimeException(e);
        }
    }

    public void A0w(Bundle bundle, View view) {
        super.A0w(bundle, view);
        AnonymousClass0x2.A0z(C06560Yg.A02(view, R.id.bottom_sheet_close_button), this, 21);
        C106905aM.A03(view, R.id.about_community_title);
        TextEmojiLabel A0K = AnonymousClass0x7.A0K(view, R.id.about_community_description);
        if (this.A03.A0X(2356)) {
            A0K.setText(R.string.f11nameremoved);
        } else {
            String[] strArr = new String[1];
            AnonymousClass0x7.A1E(C66433Lk.A00(this.A05, "570221114584995"), strArr, 0);
            SpannableString A042 = this.A06.A04(A0K.getContext(), AnonymousClass0x7.A0n(this, "learn-more", new Object[1], 0, R.string.f11nameremoved), new Runnable[]{new C172578Lw(14)}, new String[]{"learn-more"}, strArr);
            AnonymousClass0x2.A12(A0K, this.A02);
            AnonymousClass0x2.A14(this.A03, A0K);
            A0K.setText(A042);
        }
        TextEmojiLabel A0K2 = AnonymousClass0x7.A0K(view, R.id.additional_community_description);
        if (this.A03.A0X(2356)) {
            String[] strArr2 = new String[1];
            AnonymousClass0x7.A1E(C66433Lk.A00(this.A05, "812356880201038"), strArr2, 0);
            SpannableString A043 = this.A06.A04(A0K2.getContext(), AnonymousClass0x7.A0n(this, "learn-more", new Object[1], 0, R.string.f11nameremoved), new Runnable[]{new C172578Lw(15)}, new String[]{"learn-more"}, strArr2);
            AnonymousClass0x2.A12(A0K2, this.A02);
            AnonymousClass0x2.A14(this.A03, A0K2);
            A0K2.setText(A043);
        } else {
            A0K2.setText(R.string.f11nameremoved);
        }
        C18320x8.A13(C06560Yg.A02(view, R.id.about_community_join_button), this, 21);
    }
}
