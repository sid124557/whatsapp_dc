package com.whatsapp.privacy.usernotice;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0HG;
import X.AnonymousClass0YY;
import X.AnonymousClass0YZ;
import X.AnonymousClass0x2;
import X.AnonymousClass0x7;
import X.AnonymousClass0x9;
import X.AnonymousClass1VX;
import X.AnonymousClass1kU;
import X.AnonymousClass33X;
import X.AnonymousClass3AR;
import X.AnonymousClass5RT;
import X.AnonymousClass5SH;
import X.AnonymousClass64B;
import X.AnonymousClass6BG;
import X.AnonymousClass752;
import X.AnonymousClass753;
import X.AnonymousClass92L;
import X.C001702c;
import X.C06560Yg;
import X.C08310eF;
import X.C104635Rt;
import X.C106225Yc;
import X.C107235av;
import X.C142396x8;
import X.C142406x9;
import X.C154177cj;
import X.C15870s6;
import X.C18270x1;
import X.C18290x4;
import X.C18300x5;
import X.C18310x6;
import X.C18320x8;
import X.C183268pl;
import X.C188648zG;
import X.C188888ze;
import X.C49182g7;
import X.C51922kb;
import X.C61202zs;
import X.C620633i;
import X.C626936e;
import X.C633939b;
import X.C69263Wi;
import X.C69413Wx;
import X.C989653x;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.BulletSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.ArrayList;

public class UserNoticeBottomSheetDialogFragment extends Hilt_UserNoticeBottomSheetDialogFragment implements AnonymousClass64B {
    public int A00;
    public ValueAnimator A01;
    public View A02;
    public View A03;
    public ImageView A04;
    public LinearLayout A05;
    public TextView A06;
    public TextView A07;
    public NestedScrollView A08;
    public C69263Wi A09;
    public C620633i A0A;
    public AnonymousClass1VX A0B;
    public C49182g7 A0C;
    public C51922kb A0D;
    public AnonymousClass33X A0E;
    public AnonymousClass1kU A0F;
    public UserNoticeModalIconView A0G;
    public Runnable A0H;
    public final View.OnClickListener A0I = new C989653x(this, 21);
    public final C15870s6 A0J = new AnonymousClass3AR(this);
    public final C183268pl A0K = new C69413Wx(this);

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass5RT r5;
        C142396x8 r9;
        C142406x9 r10;
        File A0B2;
        File A0B3;
        Log.i("UserNoticeBottomSheetDialogFragment/onCreateView");
        Bundle A0H2 = A0H();
        String A0k = C18310x6.A0k(A0H2, "icon_light_url");
        String A0k2 = C18310x6.A0k(A0H2, "icon_dark_url");
        String A0k3 = C18310x6.A0k(A0H2, "icon_description");
        String A0k4 = C18310x6.A0k(A0H2, "title");
        int i = A0H2.getInt("bullets_size", 0);
        ArrayList A0I2 = AnonymousClass002.A0I(i);
        for (int i2 = 0; i2 < i; i2++) {
            String string = A0H2.getString(AnonymousClass000.A0Y("bullet_text_", AnonymousClass001.A0o(), i2));
            A0I2.add(new AnonymousClass5SH(string, A0H2.getString(AnonymousClass000.A0Y("bullet_icon_light_url_", C18290x4.A0u(string), i2)), A0H2.getString(AnonymousClass000.A0Y("bullet_icon_dark_url_", AnonymousClass001.A0o(), i2))));
        }
        String A0k5 = C18310x6.A0k(A0H2, "agree_button_text");
        long j = A0H2.getLong("start_time_millis");
        AnonymousClass5RT r4 = null;
        if (j != 0) {
            r5 = new AnonymousClass5RT(j);
        } else {
            r5 = null;
        }
        C104635Rt r7 = new C104635Rt(A0H2.getLongArray("duration_repeat"), A0H2.getLong("duration_static", -1));
        long j2 = A0H2.getLong("end_time_millis");
        if (j2 != 0) {
            r4 = new AnonymousClass5RT(j2);
        }
        C61202zs r8 = new C61202zs(r7, r5, r4, "onDemand");
        String string2 = A0H2.getString("body");
        String string3 = A0H2.getString("footer");
        String string4 = A0H2.getString("dismiss_button_text");
        String string5 = A0H2.getString("icon_role");
        if (string5 != null) {
            r9 = AnonymousClass752.A00(string5);
        } else {
            r9 = null;
        }
        String string6 = A0H2.getString("icon_style");
        if (string6 != null) {
            r10 = AnonymousClass753.A00(string6);
        } else {
            r10 = null;
        }
        AnonymousClass1kU r72 = new AnonymousClass1kU(r8, r9, r10, A0k, A0k2, A0k3, A0k4, A0k5, string2, string3, string4, A0I2);
        String string7 = A0H2.getString("light_icon_path");
        if (string7 == null) {
            A0B2 = null;
        } else {
            A0B2 = AnonymousClass002.A0B(string7);
        }
        r72.A01 = A0B2;
        String string8 = A0H2.getString("dark_icon_path");
        if (string8 == null) {
            A0B3 = null;
        } else {
            A0B3 = AnonymousClass002.A0B(string8);
        }
        r72.A00 = A0B3;
        this.A0F = r72;
        View inflate = layoutInflater.inflate(R.layout.f8nameremoved, viewGroup, true);
        inflate.getViewTreeObserver().addOnGlobalLayoutListener(new AnonymousClass92L(inflate, 4, this));
        this.A08 = (NestedScrollView) C06560Yg.A02(inflate, R.id.user_notice_modal_scrollview);
        this.A03 = C06560Yg.A02(inflate, R.id.user_notice_modal_scroll_decoration_group);
        C06560Yg.A02(inflate, R.id.user_notice_modal_scroll_button).setOnClickListener(this.A0I);
        this.A08.setNestedScrollingEnabled(false);
        NestedScrollView nestedScrollView = this.A08;
        nestedScrollView.A0E = this.A0J;
        nestedScrollView.getViewTreeObserver().addOnGlobalLayoutListener(new AnonymousClass6BG((Object) this, 27));
        this.A02 = C06560Yg.A02(inflate, R.id.user_notice_modal_button_divider);
        ImageView A0E2 = AnonymousClass0x9.A0E(inflate, R.id.user_notice_modal_default_icon);
        this.A04 = A0E2;
        A0E2.setContentDescription(this.A0F.A04);
        UserNoticeModalIconView userNoticeModalIconView = (UserNoticeModalIconView) C06560Yg.A02(inflate, R.id.user_notice_modal_server_icon);
        this.A0G = userNoticeModalIconView;
        userNoticeModalIconView.A00 = this.A04;
        userNoticeModalIconView.A07(this.A0F);
        TextEmojiLabel A0K2 = AnonymousClass0x7.A0K(inflate, R.id.user_notice_modal_body);
        A0K2.setMovementMethod(LinkMovementMethod.getInstance());
        A1b(A0K2, this.A0F.A02);
        A1b(AnonymousClass0x7.A0K(inflate, R.id.user_notice_modal_footer), this.A0F.A04);
        TextView A0G2 = C18300x5.A0G(inflate, R.id.user_notice_modal_title);
        this.A07 = A0G2;
        A0G2.setText(this.A0F.A07);
        C06560Yg.A0T(this.A07, true);
        this.A06 = C18300x5.A0G(inflate, R.id.user_notice_modal_sticky_title);
        int dimensionPixelSize = C08310eF.A09(this).getDimensionPixelSize(R.dimen.f6nameremoved);
        int dimensionPixelSize2 = C08310eF.A09(this).getDimensionPixelSize(R.dimen.f6nameremoved);
        this.A00 = dimensionPixelSize2;
        this.A06.setPadding(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2);
        this.A06.setMaxLines(5);
        this.A06.setEllipsize(TextUtils.TruncateAt.END);
        if (!A1Y()) {
            AnonymousClass0YY.A04(C18310x6.A0G(A0G(), R.drawable.bottom_sheet_background), this.A06);
        }
        this.A06.setText(this.A0F.A07);
        AnonymousClass0YZ.A0B(this.A06, C08310eF.A09(this).getDimension(R.dimen.f6nameremoved));
        C06560Yg.A0T(this.A06, true);
        LinearLayout linearLayout = (LinearLayout) C06560Yg.A02(inflate, R.id.user_notice_modal_bullets);
        this.A05 = linearLayout;
        LayoutInflater from = LayoutInflater.from(A0G());
        int dimensionPixelSize3 = C08310eF.A09(this).getDimensionPixelSize(R.dimen.f6nameremoved);
        for (int i3 = 0; i3 < this.A0F.A08.size(); i3++) {
            TextEmojiLabel textEmojiLabel = (TextEmojiLabel) from.inflate(R.layout.f8nameremoved, linearLayout, false);
            textEmojiLabel.setTag(Integer.valueOf(i3));
            linearLayout.addView(textEmojiLabel);
            C18270x1.A0q(textEmojiLabel, this.A0B);
            AnonymousClass0x2.A12(textEmojiLabel, this.A0A);
            SpannableString A002 = C106225Yc.A00(A0G(), this.A0K, ((AnonymousClass5SH) this.A0F.A08.get(i3)).A02);
            SpannableString spannableString = new SpannableString(A002.toString());
            spannableString.setSpan(new BulletSpan(dimensionPixelSize3), 0, A002.length(), 17);
            for (Object obj : A002.getSpans(0, A002.length(), Object.class)) {
                spannableString.setSpan(obj, A002.getSpanStart(obj), A002.getSpanEnd(obj), 17);
            }
            textEmojiLabel.setText(spannableString);
        }
        TextView A0G3 = C18300x5.A0G(inflate, R.id.user_notice_modal_agree_button);
        A0G3.setText(this.A0F.A01);
        C633939b.A00(A0G3, this, 18);
        TextView A0G4 = C18300x5.A0G(inflate, R.id.user_notice_modal_dismiss_button);
        if (C18320x8.A1U(this.A0F.A03)) {
            A0G4.setText(this.A0F.A03);
            C633939b.A00(A0G4, this, 19);
        } else {
            A0G4.setVisibility(8);
            C001702c r0 = (C001702c) A0G3.getLayoutParams();
            r0.A0T = 0;
            A0G3.setLayoutParams(r0);
        }
        A1P(C18320x8.A1U(this.A0F.A03));
        C51922kb r2 = this.A0D;
        int i4 = 7;
        if (C18320x8.A1U(this.A0F.A03)) {
            i4 = 3;
        }
        r2.A01(Integer.valueOf(i4));
        return inflate;
    }

    public final void A1a() {
        int i = 0;
        boolean A1W = AnonymousClass001.A1W((((float) this.A08.getScrollY()) > (this.A07.getY() - ((float) this.A00)) ? 1 : (((float) this.A08.getScrollY()) == (this.A07.getY() - ((float) this.A00)) ? 0 : -1)));
        TextView textView = this.A07;
        int i2 = 0;
        if (A1W) {
            i2 = 4;
        }
        textView.setVisibility(i2);
        TextView textView2 = this.A06;
        if (!A1W) {
            i = 8;
        }
        textView2.setVisibility(i);
    }

    public final void A1c(boolean z, boolean z2) {
        long j;
        ValueAnimator valueAnimator = this.A01;
        if (valueAnimator == null) {
            ValueAnimator valueAnimator2 = new ValueAnimator();
            this.A01 = valueAnimator2;
            valueAnimator2.setInterpolator(new AccelerateDecelerateInterpolator());
            this.A01.addUpdateListener(new C154177cj(this, 29));
        } else {
            valueAnimator.cancel();
            this.A01.removeAllListeners();
        }
        this.A01.addListener(new C188648zG(3, this, z));
        float alpha = this.A03.getAlpha();
        float f = 0.0f;
        if (z) {
            f = 1.0f;
        }
        this.A01.setFloatValues(new float[]{alpha, f});
        ValueAnimator valueAnimator3 = this.A01;
        if (z2) {
            j = 400;
        } else {
            j = 0;
        }
        valueAnimator3.setDuration(j);
        this.A01.start();
    }

    public void A0c() {
        super.A0c();
        this.A08.A0E = null;
    }

    public void A1X(View view) {
        super.A1X(view);
        BottomSheetBehavior A012 = BottomSheetBehavior.A01(view);
        C620633i.A04(view, this);
        A012.A0a(new C188888ze(A012, 0, this));
        A012.A0S(3);
    }

    public final void A1b(TextEmojiLabel textEmojiLabel, String str) {
        if (TextUtils.isEmpty(str)) {
            textEmojiLabel.setVisibility(8);
            return;
        }
        C18270x1.A0q(textEmojiLabel, this.A0B);
        AnonymousClass0x2.A12(textEmojiLabel, this.A0A);
        Context A0G2 = A0G();
        C626936e.A06(str);
        textEmojiLabel.setText(C106225Yc.A00(A0G2, this.A0K, str));
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        A1X(AnonymousClass0HG.A00(A1I(), R.id.design_bottom_sheet));
        int dimensionPixelSize = C08310eF.A09(this).getDimensionPixelSize(R.dimen.f6nameremoved);
        C107235av.A04(this.A04, dimensionPixelSize, dimensionPixelSize);
        int dimensionPixelSize2 = C08310eF.A09(this).getDimensionPixelSize(R.dimen.f6nameremoved);
        C107235av.A04(this.A0G, dimensionPixelSize2, dimensionPixelSize2);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.A05.getLayoutParams();
        int dimensionPixelSize3 = C08310eF.A09(this).getDimensionPixelSize(R.dimen.f6nameremoved);
        marginLayoutParams.leftMargin = dimensionPixelSize3;
        marginLayoutParams.rightMargin = dimensionPixelSize3;
        this.A05.setLayoutParams(marginLayoutParams);
        int dimensionPixelSize4 = C08310eF.A09(this).getDimensionPixelSize(R.dimen.f6nameremoved);
        NestedScrollView nestedScrollView = this.A08;
        nestedScrollView.setPadding(dimensionPixelSize4, nestedScrollView.getPaddingTop(), dimensionPixelSize4, this.A08.getPaddingBottom());
        TextView textView = this.A06;
        textView.setPadding(dimensionPixelSize4, textView.getPaddingTop(), dimensionPixelSize4, this.A06.getPaddingBottom());
        this.A08.getViewTreeObserver().addOnGlobalLayoutListener(new AnonymousClass6BG((Object) this, 27));
    }
}
