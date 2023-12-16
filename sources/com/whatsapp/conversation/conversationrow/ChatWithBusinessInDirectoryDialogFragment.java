package com.whatsapp.conversation.conversationrow;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0x9;
import X.AnonymousClass25D;
import X.C06560Yg;
import X.C111095hX;
import X.C116985rC;
import X.C18280x3;
import X.C18300x5;
import X.C19340zH;
import X.C42662Pa;
import X.C624134x;
import X.C66433Lk;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import java.util.Random;

public class ChatWithBusinessInDirectoryDialogFragment extends Hilt_ChatWithBusinessInDirectoryDialogFragment implements View.OnClickListener {
    public C116985rC A00;
    public C111095hX A01;
    public C42662Pa A02;
    public AnonymousClass25D A03;
    public C66433Lk A04;
    public boolean A05;

    public static ChatWithBusinessInDirectoryDialogFragment A00(boolean z) {
        ChatWithBusinessInDirectoryDialogFragment chatWithBusinessInDirectoryDialogFragment = new ChatWithBusinessInDirectoryDialogFragment();
        Bundle A08 = AnonymousClass002.A08();
        A08.putBoolean("arg_conversation_stared_by_me", z);
        chatWithBusinessInDirectoryDialogFragment.A0u(A08);
        return chatWithBusinessInDirectoryDialogFragment;
    }

    public Dialog A1J(Bundle bundle) {
        this.A05 = A0H().getBoolean("arg_conversation_stared_by_me");
        View inflate = View.inflate(A0G(), R.layout.f8nameremoved, (ViewGroup) null);
        boolean z = this.A05;
        int i = R.string.f11nameremoved;
        if (z) {
            i = R.string.f11nameremoved;
        }
        C18300x5.A0G(inflate, R.id.message).setText(i);
        View A022 = C06560Yg.A02(inflate, R.id.title);
        if (this.A05) {
            A022.setVisibility(8);
        }
        View A023 = C06560Yg.A02(inflate, R.id.btn_negative_vertical);
        View A024 = C06560Yg.A02(inflate, R.id.btn_negative_horizontal);
        View A025 = C06560Yg.A02(inflate, R.id.btn_positive);
        if (this.A05) {
            A023.setVisibility(8);
        } else {
            A024.setVisibility(4);
        }
        A025.setOnClickListener(this);
        A024.setOnClickListener(this);
        A023.setOnClickListener(this);
        C19340zH A0K = C18280x3.A0K(this);
        A0K.A0a(inflate);
        A0K.A0i(true);
        return A0K.create();
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.btn_negative_horizontal) {
            this.A01.BkW(A0G(), this.A04.A04("security-and-privacy", "how-to-select-a-location-when-looking-for-businesses-nearby"), (C624134x) null);
        } else if (id == R.id.btn_negative_vertical) {
            C42662Pa r1 = this.A02;
            r1.A00 = 9;
            Random random = r1.A01;
            if (random == null) {
                random = AnonymousClass0x9.A1C();
                r1.A01 = random;
            }
            random.nextLong();
            A0G();
            this.A00.A04();
            A0G();
            throw AnonymousClass001.A0g("businessDirectoryStatusActivity");
        }
        A1K();
    }
}
