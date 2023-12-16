package com.whatsapp.community.deactivate;

import X.AnonymousClass002;
import X.AnonymousClass043;
import X.AnonymousClass0x2;
import X.AnonymousClass0x7;
import X.AnonymousClass0x9;
import X.AnonymousClass34R;
import X.AnonymousClass3ZH;
import X.AnonymousClass480;
import X.AnonymousClass5V0;
import X.AnonymousClass5ZU;
import X.C003203q;
import X.C106905aM;
import X.C162457s7;
import X.C18270x1;
import X.C18280x3;
import X.C18300x5;
import X.C18310x6;
import X.C19340zH;
import X.C27991fJ;
import X.C626936e;
import X.C64773Ex;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;

public final class DeactivateCommunityConfirmationFragment extends Hilt_DeactivateCommunityConfirmationFragment {
    public AnonymousClass480 A00;
    public C64773Ex A01;
    public AnonymousClass5ZU A02;

    public void A1G(Context context) {
        C162457s7.A0J(context, 0);
        super.A1G(context);
        C626936e.A06(context);
        this.A00 = (AnonymousClass480) context;
    }

    public void A0g() {
        super.A0g();
        Dialog dialog = this.A03;
        if (dialog instanceof AnonymousClass043) {
            Button button = ((AnonymousClass043) dialog).A00.A0G;
            AnonymousClass0x2.A0q(button.getContext(), button, R.color.f5nameremoved);
        }
    }

    public Dialog A1J(Bundle bundle) {
        String A0k = C18310x6.A0k(A0H(), "parent_group_jid");
        C162457s7.A0D(A0k);
        C27991fJ A05 = AnonymousClass34R.A05(A0k);
        C64773Ex r0 = this.A01;
        if (r0 != null) {
            AnonymousClass3ZH A0A = r0.A0A(A05);
            C003203q A0R = A0R();
            View A0H = C18310x6.A0H(LayoutInflater.from(A0R), R.layout.f8nameremoved);
            Object[] objArr = new Object[1];
            AnonymousClass5ZU r02 = this.A02;
            if (r02 != null) {
                String A0e = C18300x5.A0e(A0R, r02.A0H(A0A), objArr, 0, R.string.f11nameremoved);
                Object[] objArr2 = new Object[1];
                AnonymousClass5ZU r03 = this.A02;
                if (r03 != null) {
                    Spanned A0B = AnonymousClass0x9.A0B(AnonymousClass002.A0F(A0R, Html.escapeHtml(r03.A0H(A0A)), objArr2, 0, R.string.f11nameremoved));
                    C162457s7.A0D(A0B);
                    TextEmojiLabel textEmojiLabel = (TextEmojiLabel) C18280x3.A0E(A0H, R.id.deactivate_community_confirm_dialog_title);
                    textEmojiLabel.A0I(A0e);
                    C106905aM.A04(textEmojiLabel);
                    AnonymousClass0x7.A0K(A0H, R.id.deactivate_community_confirm_dialog_message).A0I(A0B);
                    C19340zH A002 = AnonymousClass5V0.A00(A0R);
                    A002.A0a(A0H);
                    A002.A0i(true);
                    C19340zH.A07(A002, this, 42, R.string.f11nameremoved);
                    C19340zH.A08(A002, this, 43, R.string.f11nameremoved);
                    return C18300x5.A0H(A002);
                }
                throw C18270x1.A0S("waContactNames");
            }
            throw C18270x1.A0S("waContactNames");
        }
        throw C18270x1.A0S("contactManager");
    }
}
