package com.whatsapp.util;

import X.AnonymousClass043;
import X.AnonymousClass4FS;
import X.C08310eF;
import X.C109395eY;
import X.C111095hX;
import X.C162457s7;
import X.C18280x3;
import X.C18300x5;
import X.C18310x6;
import X.C19340zH;
import X.C48042eF;
import X.C55682qk;
import X.C55832qz;
import X.C634539h;
import X.C66543Lv;
import X.C69263Wi;
import android.app.Dialog;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import com.whatsapp.R;

public final class DocumentWarningDialogFragment extends Hilt_DocumentWarningDialogFragment {
    public AnonymousClass043 A00;
    public C111095hX A01;
    public C55682qk A02;
    public C69263Wi A03;
    public C66543Lv A04;
    public C48042eF A05;
    public C55832qz A06;
    public AnonymousClass4FS A07;

    public Dialog A1J(Bundle bundle) {
        Window window;
        View A0H = C18310x6.A0H(A0I(), R.layout.f8nameremoved);
        C162457s7.A0H(A0H);
        C18300x5.A0G(A0H, R.id.dialog_message).setText(A0H().getInt("warning_id", R.string.f11nameremoved));
        boolean z = A0H().getBoolean("allowed_to_open");
        Resources A09 = C08310eF.A09(this);
        int i = R.string.f11nameremoved;
        if (z) {
            i = R.string.f11nameremoved;
        }
        CharSequence text = A09.getText(i);
        C162457s7.A0H(text);
        TextView A0G = C18300x5.A0G(A0H, R.id.open_button);
        A0G.setText(text);
        A0G.setOnClickListener(new C634539h(this, A0G, 3, z));
        boolean z2 = A0H().getBoolean("allowed_to_open");
        View A0E = C18280x3.A0E(A0H, R.id.cancel_button);
        if (z2) {
            A0E.setOnClickListener(new C109395eY(this, 31));
        } else {
            A0E.setVisibility(8);
        }
        C19340zH A0K = C18280x3.A0K(this);
        A0K.A0a(A0H);
        AnonymousClass043 create = A0K.create();
        this.A00 = create;
        if (!(create == null || (window = create.getWindow()) == null)) {
            C18310x6.A0x(A0G(), window, R.color.f5nameremoved);
        }
        AnonymousClass043 r0 = this.A00;
        C162457s7.A0H(r0);
        return r0;
    }
}
