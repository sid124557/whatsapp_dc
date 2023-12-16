package com.whatsapp.companiondevice;

import X.AnonymousClass0x2;
import X.AnonymousClass2R8;
import X.AnonymousClass41Y;
import X.AnonymousClass487;
import X.AnonymousClass4K2;
import X.AnonymousClass52T;
import X.AnonymousClass5Y0;
import X.AnonymousClass66R;
import X.C109095e4;
import X.C109725f5;
import X.C154517dI;
import X.C162457s7;
import X.C18270x1;
import X.C18280x3;
import X.C18310x6;
import X.C60152y5;
import X.C620633i;
import X.C620733j;
import X.C77483tT;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.WaEditText;
import com.whatsapp.jid.DeviceJid;

public final class SetDeviceNicknameFragment extends Hilt_SetDeviceNicknameFragment {
    public C620633i A00;
    public C620733j A01;
    public AnonymousClass2R8 A02;
    public AnonymousClass487 A03;
    public AnonymousClass5Y0 A04;
    public C60152y5 A05;
    public final AnonymousClass66R A06 = C154517dI.A01(new C77483tT(this));

    public void A0w(Bundle bundle, View view) {
        View view2 = view;
        C162457s7.A0J(view2, 0);
        super.A0w(bundle, view2);
        Bundle A0H = A0H();
        DeviceJid A022 = DeviceJid.Companion.A02(A0H.getString("device_jid_raw_string"));
        String string = A0H.getString("existing_display_name");
        String string2 = A0H.getString("device_string");
        AnonymousClass4K2.A00(this, ((LinkedDeviceEnterNicknameViewModel) this.A06.getValue()).A01, new AnonymousClass41Y(this), 71);
        WaEditText waEditText = (WaEditText) C18280x3.A0E(view2, R.id.nickname_edit_text);
        TextView A0I = AnonymousClass0x2.A0I(view2, R.id.counter_tv);
        int i = 0;
        waEditText.setFilters(new C109095e4[]{new C109095e4(50)});
        waEditText.A06();
        AnonymousClass5Y0 r14 = this.A04;
        if (r14 != null) {
            C620633i r11 = this.A00;
            if (r11 != null) {
                C620733j r12 = this.A01;
                if (r12 != null) {
                    C60152y5 r15 = this.A05;
                    if (r15 != null) {
                        AnonymousClass487 r13 = this.A03;
                        if (r13 != null) {
                            waEditText.addTextChangedListener(new AnonymousClass52T(waEditText, A0I, r11, r12, r13, r14, r15, 50, 50, false));
                            waEditText.setText(string);
                            if (string != null) {
                                i = string.length();
                            }
                            waEditText.setSelection(i);
                            waEditText.setHint(string2);
                            C18280x3.A0E(view2, R.id.save_btn).setOnClickListener(new C109725f5((Object) this, (Object) A022, (Object) waEditText, 25));
                            C18310x6.A17(C18280x3.A0E(view2, R.id.cancel_btn), this, 11);
                            return;
                        }
                        throw C18270x1.A0S("emojiRichFormatterStaticCaller");
                    }
                    throw C18270x1.A0S("sharedPreferencesFactory");
                }
                throw C18270x1.A0S("whatsAppLocale");
            }
            throw C18270x1.A0S("systemServices");
        }
        throw C18270x1.A0S("emojiLoader");
    }

    public int A1H() {
        return R.style.f12nameremoved;
    }

    public int A1S() {
        return R.layout.f8nameremoved;
    }
}
