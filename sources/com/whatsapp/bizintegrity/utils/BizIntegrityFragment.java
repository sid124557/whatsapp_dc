package com.whatsapp.bizintegrity.utils;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0VX;
import X.AnonymousClass0x2;
import X.AnonymousClass0x9;
import X.AnonymousClass1VX;
import X.AnonymousClass5Yj;
import X.AnonymousClass7PT;
import X.C08310eF;
import X.C107635bd;
import X.C111095hX;
import X.C181588n0;
import X.C18290x4;
import X.C18320x8;
import X.C620633i;
import X.C69263Wi;
import X.C86644Kx;
import X.C86654Ky;
import X.C86664Kz;
import X.C88944b3;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaImageView;
import com.whatsapp.wds.components.bottomsheet.WDSBottomSheetDialogFragment;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public abstract class BizIntegrityFragment extends WDSBottomSheetDialogFragment {
    public View A00;
    public FrameLayout A01;
    public LinearLayout A02;
    public C111095hX A03;
    public C69263Wi A04;
    public WaImageView A05;
    public AnonymousClass7PT A06;
    public C620633i A07;
    public AnonymousClass1VX A08;
    public WDSButton A09;
    public WDSButton A0A;
    public Map A0B;

    public abstract void A1Y();

    public abstract void A1Z();

    public abstract void A1a(LayoutInflater layoutInflater);

    public Map A1X() {
        return null;
    }

    public void A1b(View view, int i, int i2) {
        TextEmojiLabel A0M = C86644Kx.A0M(view, i);
        Context A1D = A1D();
        AnonymousClass1VX r3 = this.A08;
        C69263Wi r12 = this.A04;
        C111095hX r11 = this.A03;
        C620633i r13 = this.A07;
        String string = C08310eF.A09(this).getString(i2);
        Map map = this.A0B;
        HashMap A0t = AnonymousClass001.A0t();
        if (map != null) {
            Iterator A0q = AnonymousClass000.A0q(map);
            while (A0q.hasNext()) {
                Map.Entry A0w = AnonymousClass001.A0w(A0q);
                Object key = A0w.getKey();
                C88944b3 r9 = new C88944b3(A1D, r11, r12, r13, A0w.getValue().toString());
                r9.A05 = false;
                r9.A02 = (C181588n0) map.get(key);
                A0t.put(A0w.getKey(), r9);
            }
        }
        SpannableStringBuilder A022 = C107635bd.A02(string, A0t);
        AnonymousClass0x2.A14(r3, A0M);
        AnonymousClass0x2.A12(A0M, r13);
        A0M.setText(A022);
    }

    public BizIntegrityFragment(C111095hX r1, C69263Wi r2, AnonymousClass7PT r3, C620633i r4, AnonymousClass1VX r5) {
        this.A06 = r3;
        this.A08 = r5;
        this.A04 = r2;
        this.A03 = r1;
        this.A07 = r4;
    }

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Integer num;
        View inflate = layoutInflater.inflate(R.layout.f8nameremoved, viewGroup, false);
        this.A00 = inflate;
        this.A05 = AnonymousClass0x9.A0L(inflate, R.id.biz_integrity_icon);
        this.A09 = C86654Ky.A0f(this.A00, R.id.biz_integrity_accept_button);
        WDSButton A0f = C86654Ky.A0f(this.A00, R.id.biz_integrity_reject_button);
        this.A0A = A0f;
        AnonymousClass7PT r4 = this.A06;
        Integer num2 = r4.A07;
        A0f.setVisibility(C86644Kx.A08(num2));
        FrameLayout A0s = C86664Kz.A0s(this.A00, R.id.biz_integrity_body_container);
        this.A01 = A0s;
        this.A02 = (LinearLayout) layoutInflater.inflate(r4.A01, A0s, false);
        this.A0B = A1X();
        Integer num3 = r4.A06;
        if (num3 == null || (num = r4.A04) == null) {
            this.A05.setVisibility(8);
        } else {
            this.A05.setBackground(AnonymousClass0VX.A01(A1D(), num.intValue()));
            Drawable mutate = AnonymousClass0VX.A01(A1D(), num3.intValue()).mutate();
            mutate.setColorFilter(C08310eF.A09(this).getColor(r4.A05.intValue()), PorterDuff.Mode.SRC_ATOP);
            this.A05.setImageDrawable(mutate);
        }
        this.A09.setText(r4.A00);
        if (num2 != null) {
            this.A0A.setText(num2.intValue());
            this.A0A.setBackground((Drawable) null);
            C18290x4.A1H(this.A0A, this, 5);
        }
        C18290x4.A1H(this.A09, this, 6);
        View view = this.A00;
        int i = r4.A02;
        int A072 = AnonymousClass5Yj.A07(view);
        TextView A092 = AnonymousClass002.A09(view, R.id.biz_integrity_title);
        A092.setText(C08310eF.A09(this).getString(i), TextView.BufferType.NORMAL);
        C18320x8.A11(C08310eF.A09(this), A092, A072);
        View findViewById = this.A00.findViewById(R.id.biz_integrity_intro);
        Integer num4 = r4.A03;
        findViewById.setVisibility(C86644Kx.A08(num4));
        if (num4 != null) {
            View view2 = this.A00;
            int intValue = num4.intValue();
            TextView A093 = AnonymousClass002.A09(view2, R.id.biz_integrity_intro);
            A093.setText(C08310eF.A09(this).getString(intValue), TextView.BufferType.NORMAL);
            C18320x8.A11(C08310eF.A09(this), A093, R.color.f5nameremoved);
        }
        this.A01.addView(this.A02);
        A1a(layoutInflater);
        return this.A00;
    }
}
