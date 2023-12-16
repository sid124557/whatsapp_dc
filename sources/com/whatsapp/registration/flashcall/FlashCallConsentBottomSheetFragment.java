package com.whatsapp.registration.flashcall;

import X.AnonymousClass002;
import X.AnonymousClass0x2;
import X.AnonymousClass1VW;
import X.AnonymousClass5NF;
import X.C003203q;
import X.C06560Yg;
import X.C162457s7;
import X.C18270x1;
import X.C18290x4;
import X.C58422vE;
import X.C89644eZ;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;

public final class FlashCallConsentBottomSheetFragment extends Hilt_FlashCallConsentBottomSheetFragment {
    public AnonymousClass1VW A00;
    public AnonymousClass5NF A01;

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C162457s7.A0J(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.f8nameremoved, viewGroup);
        C162457s7.A0H(inflate);
        AnonymousClass0x2.A10(inflate.findViewById(R.id.flash_call_consent_continue_button), this, 15);
        TextView A09 = AnonymousClass002.A09(inflate, R.id.flash_call_consent_not_now_button);
        AnonymousClass1VW r2 = this.A00;
        if (r2 != null) {
            if (r2.A0Y(C58422vE.A02, 6370)) {
                A09.setText(R.string.f11nameremoved);
            }
            AnonymousClass0x2.A10(A09, this, 16);
            AnonymousClass5NF r3 = this.A01;
            if (r3 != null) {
                C003203q A0R = A0R();
                C162457s7.A0K(A0R, "null cannot be cast to non-null type com.whatsapp.WaBaseActivity");
                r3.A00((TextEmojiLabel) C18290x4.A0M(inflate, R.id.flash_call_consent_code_bottom_sheet_description), (C89644eZ) A0R, R.string.f11nameremoved);
                return inflate;
            }
            throw C18270x1.A0S("primaryFlashCallUtils");
        }
        throw C18270x1.A0S("abPreChatdProps");
    }

    public void A0w(Bundle bundle, View view) {
        C162457s7.A0J(view, 0);
        super.A0w(bundle, view);
        AnonymousClass0x2.A10(C06560Yg.A02(view, R.id.flash_call_consent_bottom_sheet_close_button), this, 17);
    }
}
