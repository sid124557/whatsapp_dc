package com.whatsapp.biz.catalog.view;

import X.AnonymousClass001;
import X.AnonymousClass0x2;
import X.AnonymousClass0x7;
import X.AnonymousClass1VX;
import X.AnonymousClass4L0;
import X.AnonymousClass4VN;
import X.AnonymousClass64B;
import X.AnonymousClass6C1;
import X.AnonymousClass6C6;
import X.AnonymousClass7CM;
import X.C06560Yg;
import X.C08310eF;
import X.C105895Wv;
import X.C107575bX;
import X.C110545gd;
import X.C18320x8;
import X.C18330xA;
import X.C184078rD;
import X.C55502qS;
import X.C620633i;
import X.C69263Wi;
import X.C85244Fm;
import X.C86604Kt;
import X.C86654Ky;
import X.C88944b3;
import android.app.Dialog;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaEditText;
import com.whatsapp.WaTextView;
import com.whatsapp.jid.UserJid;

public class PostcodeChangeBottomSheet extends Hilt_PostcodeChangeBottomSheet implements AnonymousClass64B {
    public LinearLayout A00;
    public AnonymousClass7CM A01;
    public C69263Wi A02;
    public C85244Fm A03;
    public TextEmojiLabel A04;
    public WaEditText A05;
    public WaTextView A06;
    public WaTextView A07;
    public WaTextView A08;
    public AnonymousClass4VN A09;
    public C620633i A0A;
    public AnonymousClass1VX A0B;
    public UserJid A0C = null;
    public C105895Wv A0D;
    public String A0E = "";
    public String A0F = "pincode";
    public final C184078rD A0G;
    public final boolean A0H;

    public void A0a() {
        this.A0G.BYX();
        super.A0a();
    }

    public final SpannableStringBuilder A1a(Context context) {
        String string = C08310eF.A09(this).getString(R.string.f11nameremoved);
        SpannableStringBuilder A002 = C18330xA.A00(string);
        Context context2 = context;
        A002.setSpan(new C88944b3(context2, this.A03, this.A02, this.A0A, "https://faq.whatsapp.com/general/security-and-privacy/about-sharing-your-information-with-businesses-on-whatsapp"), 0, string.length(), 33);
        return A002;
    }

    public void A1b() {
        WaEditText waEditText = this.A05;
        if (waEditText != null) {
            waEditText.clearFocus();
        }
        LinearLayout linearLayout = this.A00;
        if (linearLayout != null && C105895Wv.A00(linearLayout)) {
            this.A0D.A02(this.A00);
        }
        A1K();
    }

    public void A1c() {
        this.A04.setVisibility(8);
        this.A06.setVisibility(0);
        this.A05.getBackground().setColorFilter(C08310eF.A09(this).getColor(R.color.f5nameremoved), PorterDuff.Mode.SRC_ATOP);
    }

    public final void A1d() {
        AnonymousClass4VN r3 = this.A09;
        if (r3 != null) {
            String str = this.A0E;
            String str2 = this.A0F;
            UserJid userJid = this.A0C;
            r3.A02 = AnonymousClass4VN.A00(str);
            if (str2 == null) {
                str2 = "pincode";
            }
            r3.A03 = str2;
            r3.A00 = userJid;
            String str3 = null;
            if (userJid != null) {
                C55502qS A002 = r3.A09.A00(userJid);
                if (A002 != null) {
                    str3 = A002.A08;
                }
                if (C107575bX.A0F(str3)) {
                    str3 = r3.A0A.A0H(r3.A08.A0A(userJid));
                }
            }
            r3.A01 = str3;
            r3.A0E();
        }
    }

    public PostcodeChangeBottomSheet(C184078rD r2, boolean z) {
        this.A0G = r2;
        this.A0H = z;
    }

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return AnonymousClass001.A0R(layoutInflater, viewGroup, R.layout.f8nameremoved);
    }

    public void A0w(Bundle bundle, View view) {
        super.A0w(bundle, view);
        Dialog dialog = this.A03;
        if (!(!this.A0H || dialog == null || dialog.getWindow() == null)) {
            dialog.getWindow().setSoftInputMode(21);
        }
        this.A00 = C86654Ky.A0N(view, R.id.dc_postcode_bottom_sheet);
        this.A07 = AnonymousClass0x7.A0L(view, R.id.change_postcode_header);
        this.A08 = AnonymousClass0x7.A0L(view, R.id.change_postcode_message);
        this.A05 = (WaEditText) C06560Yg.A02(view, R.id.change_postcode_edit_text);
        this.A04 = AnonymousClass0x7.A0K(view, R.id.change_postcode_privacy_message);
        this.A06 = AnonymousClass0x7.A0L(view, R.id.change_postcode_invalid_message);
        AnonymousClass0x2.A14(this.A0B, this.A04);
        AnonymousClass0x2.A12(this.A04, this.A0A);
        this.A04.setLinksClickable(true);
        this.A04.setFocusable(false);
        AnonymousClass4VN r0 = (AnonymousClass4VN) AnonymousClass4L0.A0F(new C110545gd(this.A01), this).A01(AnonymousClass4VN.class);
        this.A09 = r0;
        AnonymousClass6C6.A01(this, r0.A04, 11);
        C86604Kt.A1M(this, this.A09.A0C, 18);
        A1d();
        this.A05.addTextChangedListener(new AnonymousClass6C1(this, 0));
        C18320x8.A15(C06560Yg.A02(view, R.id.postcode_button_cancel), this, 32);
        C18320x8.A15(C06560Yg.A02(view, R.id.postcode_button_enter), this, 33);
        if (A1Y()) {
            view.setBackground((Drawable) null);
        }
    }
}
