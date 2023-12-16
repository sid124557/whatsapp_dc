package com.whatsapp.conversation.conversationrow;

import X.AnonymousClass0Y8;
import X.AnonymousClass0x7;
import X.AnonymousClass0x9;
import X.AnonymousClass5JA;
import X.AnonymousClass5Jn;
import X.AnonymousClass5ST;
import X.AnonymousClass90Q;
import X.C109345eT;
import X.C149407Mi;
import X.C162457s7;
import X.C18270x1;
import X.C86624Kv;
import X.C86654Ky;
import X.C86664Kz;
import X.C93314oJ;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaImageButton;
import java.util.LinkedHashSet;
import java.util.List;
import org.json.JSONArray;

public final class NativeFlowMessageButtonBottomSheet extends Hilt_NativeFlowMessageButtonBottomSheet {
    public LinearLayout A00;
    public TextEmojiLabel A01;
    public WaImageButton A02;
    public AnonymousClass5ST A03;
    public AnonymousClass5Jn A04;

    public void A0w(Bundle bundle, View view) {
        View view2 = view;
        C162457s7.A0J(view2, 0);
        super.A0w(bundle, view2);
        WaImageButton A10 = C86664Kz.A10(view2, R.id.button_bottom_sheet_close_button);
        this.A02 = A10;
        if (A10 != null) {
            C109345eT.A00(A10, this, 41);
        }
        this.A01 = AnonymousClass0x7.A0K(view2, R.id.nfm_button_bottom_sheet_title);
        this.A00 = C86654Ky.A0N(view2, R.id.nfm_button_bottom_sheet_container);
        TextEmojiLabel textEmojiLabel = this.A01;
        if (textEmojiLabel != null) {
            AnonymousClass5ST r1 = this.A03;
            if (r1 != null) {
                AnonymousClass5ST.A00(A0G(), textEmojiLabel, r1);
            } else {
                throw C18270x1.A0S("conversationFont");
            }
        }
        AnonymousClass5Jn r0 = this.A04;
        if (r0 != null) {
            LinearLayout linearLayout = this.A00;
            TextEmojiLabel textEmojiLabel2 = this.A01;
            InteractiveButtonsRowContentLayout interactiveButtonsRowContentLayout = r0.A01;
            NativeFlowMessageButtonBottomSheet nativeFlowMessageButtonBottomSheet = r0.A02;
            List list = r0.A04;
            C93314oJ r13 = r0.A00;
            AnonymousClass5JA r12 = r0.A03;
            String str = r12.A02;
            if (!(textEmojiLabel2 == null || str == null)) {
                textEmojiLabel2.setText(str);
            }
            LinkedHashSet A17 = AnonymousClass0x9.A17();
            JSONArray jSONArray = r12.A03;
            if (jSONArray != null) {
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    Object obj = jSONArray.get(i);
                    if (obj instanceof Integer) {
                        A17.add(obj);
                    }
                }
            }
            if (linearLayout != null) {
                for (int i2 = 0; i2 < list.size(); i2++) {
                    boolean A1a = C86624Kv.A1a(A17, i2);
                    C149407Mi r9 = (C149407Mi) list.get(i2);
                    linearLayout.addView(interactiveButtonsRowContentLayout.A00(AnonymousClass0Y8.A07(interactiveButtonsRowContentLayout.getContext(), R.color.f5nameremoved), AnonymousClass0Y8.A07(interactiveButtonsRowContentLayout.getContext(), R.color.f5nameremoved), r13, new C149407Mi(new AnonymousClass90Q(nativeFlowMessageButtonBottomSheet, 0, r9), r9.A02, r9.A00, r9.A03), i2, true, A1a, true));
                }
            }
        }
    }

    public void A0c() {
        super.A0c();
        this.A02 = null;
        this.A01 = null;
        LinearLayout linearLayout = this.A00;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
        }
        this.A00 = null;
    }

    public int A1S() {
        return R.layout.f8nameremoved;
    }
}
