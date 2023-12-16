package com.whatsapp.emoji;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass1VX;
import X.AnonymousClass33p;
import X.AnonymousClass487;
import X.AnonymousClass4CE;
import X.AnonymousClass4EF;
import X.AnonymousClass52T;
import X.AnonymousClass5IY;
import X.AnonymousClass5S9;
import X.AnonymousClass5Y0;
import X.AnonymousClass68H;
import X.AnonymousClass694;
import X.C003203q;
import X.C06560Yg;
import X.C105895Wv;
import X.C107055ac;
import X.C107345b9;
import X.C107555bV;
import X.C109095e4;
import X.C18300x5;
import X.C27821ej;
import X.C55682qk;
import X.C60152y5;
import X.C620633i;
import X.C620733j;
import X.C633839a;
import X.C69263Wi;
import X.C69983Zk;
import X.C86634Kw;
import X.C86644Kx;
import X.C86664Kz;
import X.C89224c7;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.TextView;
import com.whatsapp.KeyboardPopupLayout;
import com.whatsapp.R;
import com.whatsapp.WaEditText;
import com.whatsapp.emoji.search.EmojiSearchContainer;
import com.whatsapp.emoji.search.EmojiSearchProvider;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.ArrayList;

public class EmojiEditTextBottomSheetDialogFragment extends Hilt_EmojiEditTextBottomSheetDialogFragment {
    public int A00;
    public int A01;
    public int A02 = 0;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public ImageButton A07;
    public C55682qk A08;
    public C69263Wi A09;
    public WaEditText A0A;
    public C620633i A0B;
    public AnonymousClass33p A0C;
    public C620733j A0D;
    public AnonymousClass4EF A0E;
    public AnonymousClass487 A0F;
    public AnonymousClass5IY A0G;
    public C27821ej A0H;
    public AnonymousClass5Y0 A0I;
    public EmojiSearchProvider A0J;
    public AnonymousClass1VX A0K;
    public C60152y5 A0L;
    public C105895Wv A0M;
    public WDSButton A0N;
    public WDSButton A0O;
    public String A0P;
    public String A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public String[] A0U;
    public final AnonymousClass4CE A0V = new AnonymousClass694(this, 5);

    public static EmojiEditTextBottomSheetDialogFragment A00(String str, String[] strArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z) {
        EmojiEditTextBottomSheetDialogFragment emojiEditTextBottomSheetDialogFragment = new EmojiEditTextBottomSheetDialogFragment();
        Bundle A082 = AnonymousClass002.A08();
        A082.putInt("dialogId", i);
        A082.putInt("hintResId", i2);
        A082.putInt("titleResId", i3);
        A082.putInt("messageResId", i4);
        A082.putInt("emptyErrorResId", i5);
        A082.putString("defaultStr", str);
        A082.putInt("maxLength", i6);
        A082.putInt("inputType", i7);
        A082.putStringArray("codepointBlacklist", strArr);
        A082.putBoolean("shouldHideEmojiBtn", false);
        A082.putString("supportedDigits", (String) null);
        A082.putBoolean("allowBlank", z);
        emojiEditTextBottomSheetDialogFragment.A0u(A082);
        return emojiEditTextBottomSheetDialogFragment;
    }

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        boolean z;
        View inflate = C86634Kw.A0K(this).inflate(R.layout.f8nameremoved, (ViewGroup) null, false);
        TextView A0G2 = C18300x5.A0G(inflate, R.id.dialog_title_tv);
        int i = this.A06;
        if (i != 0) {
            A0G2.setText(i);
        }
        if (this.A05 != 0) {
            TextView textView = (TextView) C86634Kw.A0M(C86664Kz.A0n(inflate, R.id.message_text_view_stub), R.layout.f8nameremoved);
            textView.setText(this.A05);
            textView.setVisibility(0);
        }
        WaEditText waEditText = (WaEditText) C06560Yg.A02(inflate, R.id.edit_text);
        this.A0A = waEditText;
        int i2 = this.A02;
        if (i2 != 0) {
            waEditText.setHint(i2);
        }
        this.A0O = (WDSButton) inflate.findViewById(R.id.save_button);
        if (!this.A0R) {
            AnonymousClass68H.A00(this.A0A, this, 7);
            this.A0O.setEnabled(false);
        }
        TextView A0G3 = C18300x5.A0G(inflate, R.id.counter_tv);
        C107555bV.A09(this.A0A, this.A0D);
        if (this.A04 > 0) {
            A0G3.setVisibility(0);
        }
        ArrayList A0s = AnonymousClass001.A0s();
        int i3 = this.A04;
        if (i3 > 0) {
            A0s.add(new C109095e4(i3));
        }
        if (!A0s.isEmpty()) {
            this.A0A.setFilters((InputFilter[]) A0s.toArray(new InputFilter[0]));
        }
        WaEditText waEditText2 = this.A0A;
        AnonymousClass5Y0 r9 = this.A0I;
        waEditText2.addTextChangedListener(new AnonymousClass52T(waEditText2, A0G3, this.A0B, this.A0D, this.A0F, r9, this.A0L, this.A04, 0, false));
        this.A0A.setInputType(this.A03);
        if (!TextUtils.isEmpty(this.A0Q)) {
            this.A0A.setKeyFilter(this.A0Q);
        }
        this.A0A.A07(true);
        Window window = this.A03.getWindow();
        window.getDecorView().setSystemUiVisibility(1280);
        window.setStatusBarColor(0);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.gravity = 48;
        this.A03.getWindow().setAttributes(attributes);
        C633839a.A00(this.A0O, this, 10);
        WDSButton wDSButton = (WDSButton) inflate.findViewById(R.id.cancel_button);
        this.A0N = wDSButton;
        if (wDSButton != null) {
            C633839a.A00(wDSButton, this, 11);
        }
        KeyboardPopupLayout keyboardPopupLayout = (KeyboardPopupLayout) inflate.findViewById(R.id.emoji_edit_text_layout);
        keyboardPopupLayout.A08 = true;
        ImageButton imageButton = (ImageButton) inflate.findViewById(R.id.emoji_btn);
        this.A07 = imageButton;
        C003203q A0Q2 = A0Q();
        C105895Wv r15 = this.A0M;
        C55682qk r12 = this.A08;
        AnonymousClass5Y0 r11 = this.A0I;
        C27821ej r10 = this.A0H;
        C620633i r92 = this.A0B;
        C620733j r8 = this.A0D;
        AnonymousClass5IY r7 = this.A0G;
        EmojiSearchProvider emojiSearchProvider = this.A0J;
        AnonymousClass33p r5 = this.A0C;
        C60152y5 r4 = this.A0L;
        C620733j r23 = r8;
        AnonymousClass5IY r24 = r7;
        C620633i r21 = r92;
        AnonymousClass33p r22 = r5;
        KeyboardPopupLayout keyboardPopupLayout2 = keyboardPopupLayout;
        WaEditText waEditText3 = this.A0A;
        ImageButton imageButton2 = imageButton;
        C55682qk r18 = r12;
        C89224c7 r152 = new C89224c7(A0Q2, imageButton2, r18, keyboardPopupLayout2, waEditText3, r21, r22, r23, r24, r10, r11, emojiSearchProvider, this.A0K, r4, r15);
        C003203q A0Q3 = A0Q();
        AnonymousClass5Y0 r52 = this.A0I;
        AnonymousClass5S9.A00(new AnonymousClass5S9(A0Q3, this.A0D, r152, this.A0H, r52, (EmojiSearchContainer) inflate.findViewById(R.id.emoji_search_container), this.A0L), this, 3);
        r152.A0C(this.A0V);
        r152.A0E = new C69983Zk(this, 49);
        this.A0A.setText(C107345b9.A05(A0Q(), this.A0I, this.A0P));
        if (!TextUtils.isEmpty(this.A0P)) {
            this.A0A.selectAll();
        }
        this.A03.setOnShowListener(new C107055ac(this, 1));
        Bundle bundle2 = bundle;
        if (bundle == null) {
            z = true;
        } else {
            z = bundle2.getBoolean("is_keyboard_showing");
        }
        this.A0S = z;
        if (this.A0T) {
            C86644Kx.A0w(this.A07);
        }
        return inflate;
    }

    public void A0d() {
        super.A0d();
        this.A0E = null;
    }

    public void A0f() {
        super.A0f();
        this.A0A.requestFocus();
        if (this.A0S) {
            this.A0A.A07(false);
        }
    }

    public void A0p(Bundle bundle) {
        super.A0p(bundle);
        A1M(0, R.style.f12nameremoved);
        Bundle A0H2 = A0H();
        this.A00 = A0H2.getInt("dialogId");
        this.A06 = A0H2.getInt("titleResId");
        this.A05 = A0H2.getInt("messageResId");
        this.A01 = A0H2.getInt("emptyErrorResId");
        this.A02 = A0H2.getInt("hintResId");
        this.A0P = A0H2.getString("defaultStr");
        this.A04 = A0H2.getInt("maxLength");
        this.A03 = A0H2.getInt("inputType");
        this.A0U = A0H2.getStringArray("codepointBlacklist");
        this.A0T = A0H2.getBoolean("shouldHideEmojiBtn");
        this.A0Q = A0H2.getString("supportedDigits");
        this.A0R = A0H2.getBoolean("allowBlank");
    }

    public void A0q(Bundle bundle) {
        super.A0q(bundle);
        boolean A002 = C105895Wv.A00(this.A0A);
        this.A0S = A002;
        bundle.putBoolean("is_keyboard_showing", A002);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.0eF] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1G(android.content.Context r3) {
        /*
            r2 = this;
            super.A1G(r3)
            X.0eF r1 = r2.A0E
            boolean r0 = r1 instanceof X.AnonymousClass4EF
            if (r0 == 0) goto L_0x000f
            r3 = r1
        L_0x000a:
            X.4EF r3 = (X.AnonymousClass4EF) r3
            r2.A0E = r3
            return
        L_0x000f:
            boolean r0 = r3 instanceof X.AnonymousClass4EF
            if (r0 != 0) goto L_0x000a
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Activity/Fragment must implement "
            r1.append(r0)
            java.lang.Class<X.4EF> r0 = X.AnonymousClass4EF.class
            java.lang.String r0 = r0.getSimpleName()
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0I(r0, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.emoji.EmojiEditTextBottomSheetDialogFragment.A1G(android.content.Context):void");
    }
}
