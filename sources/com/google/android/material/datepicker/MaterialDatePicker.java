package com.google.android.material.datepicker;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0VX;
import X.AnonymousClass0WH;
import X.AnonymousClass0YZ;
import X.AnonymousClass0x9;
import X.AnonymousClass6D7;
import X.C06360Xi;
import X.C06560Yg;
import X.C08310eF;
import X.C106385Yt;
import X.C108625dI;
import X.C117045rI;
import X.C160907oe;
import X.C161097oz;
import X.C161877ql;
import X.C18280x3;
import X.C187358x4;
import X.C86654Ky;
import X.C86664Kz;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import com.google.android.material.internal.CheckableImageButton;
import com.whatsapp.R;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;

public final class MaterialDatePicker extends DialogFragment {
    public static final Object A0O = "CANCEL_BUTTON_TAG";
    public static final Object A0P = "CONFIRM_BUTTON_TAG";
    public static final Object A0Q = "TOGGLE_BUTTON_TAG";
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public Button A05;
    public TextView A06;
    public TextView A07;
    public C108625dI A08;
    public MaterialCalendar A09;
    public PickerFragment A0A;
    public CheckableImageButton A0B;
    public AnonymousClass6D7 A0C;
    public CharSequence A0D;
    public CharSequence A0E;
    public CharSequence A0F;
    public CharSequence A0G;
    public CharSequence A0H;
    public boolean A0I;
    public boolean A0J;
    public final LinkedHashSet A0K = AnonymousClass0x9.A17();
    public final LinkedHashSet A0L = AnonymousClass0x9.A17();
    public final LinkedHashSet A0M = AnonymousClass0x9.A17();
    public final LinkedHashSet A0N = AnonymousClass0x9.A17();

    public static boolean A01(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(C160907oe.A02(context, MaterialCalendar.class.getCanonicalName(), R.attr.f3nameremoved).data, new int[]{i});
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z;
    }

    public final View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View findViewById;
        int A002;
        int i;
        boolean z = this.A0J;
        int i2 = R.layout.f8nameremoved;
        if (z) {
            i2 = R.layout.f8nameremoved;
        }
        View inflate = layoutInflater.inflate(i2, viewGroup);
        Context context = inflate.getContext();
        if (this.A0J) {
            findViewById = inflate.findViewById(R.id.mtrl_calendar_frame);
            A002 = A00(context);
            i = -2;
        } else {
            findViewById = inflate.findViewById(R.id.mtrl_calendar_main_pane);
            A002 = A00(context);
            i = -1;
        }
        C86654Ky.A14(findViewById, A002, i);
        TextView A092 = AnonymousClass002.A09(inflate, R.id.mtrl_picker_header_selection_text);
        this.A06 = A092;
        C06360Xi.A01(A092, 1);
        this.A0B = (CheckableImageButton) inflate.findViewById(R.id.mtrl_picker_header_toggle);
        this.A07 = AnonymousClass002.A09(inflate, R.id.mtrl_picker_title_text);
        this.A0B.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.A0B;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842912}, AnonymousClass0VX.A01(context, R.drawable.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], AnonymousClass0VX.A01(context, R.drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        this.A0B.setChecked(AnonymousClass000.A1S(this.A00));
        C06560Yg.A0O(this.A0B, (AnonymousClass0WH) null);
        CheckableImageButton checkableImageButton2 = this.A0B;
        boolean isChecked = checkableImageButton2.isChecked();
        Context context2 = checkableImageButton2.getContext();
        int i3 = R.string.f11nameremoved;
        if (isChecked) {
            i3 = R.string.f11nameremoved;
        }
        this.A0B.setContentDescription(context2.getString(i3));
        C18280x3.A0p(this.A0B, this, 3);
        this.A05 = (Button) inflate.findViewById(R.id.confirm_button);
        this.A06.getParcelable("DATE_SELECTOR_KEY");
        throw AnonymousClass001.A0g("isSelectionComplete");
    }

    public void A0h() {
        this.A0A.A00.clear();
        super.A0h();
    }

    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.A0K.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.A0L.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) this.A0B;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    public static int A00(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.f6nameremoved);
        int i = new C117045rI(C161097oz.A00()).A02;
        return (dimensionPixelOffset * 2) + (resources.getDimensionPixelSize(R.dimen.f6nameremoved) * i) + ((i - 1) * resources.getDimensionPixelOffset(R.dimen.f6nameremoved));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0045, code lost:
        if (r10.intValue() == 0) goto L_0x0047;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0g() {
        /*
            r11 = this;
            super.A0g()
            android.app.Dialog r0 = r11.A1I()
            android.view.Window r4 = r0.getWindow()
            boolean r0 = r11.A0J
            if (r0 == 0) goto L_0x016d
            r0 = -1
            r4.setLayout(r0, r0)
            X.6D7 r0 = r11.A0C
            r4.setBackgroundDrawable(r0)
            boolean r0 = r11.A0I
            if (r0 != 0) goto L_0x00da
            android.view.View r1 = r11.A0J()
            r0 = 2131430272(0x7f0b0b80, float:1.848224E38)
            android.view.View r5 = r1.findViewById(r0)
            android.graphics.drawable.Drawable r0 = r5.getBackground()
            boolean r0 = r0 instanceof android.graphics.drawable.ColorDrawable
            if (r0 == 0) goto L_0x016a
            android.graphics.drawable.Drawable r0 = r5.getBackground()
            android.graphics.drawable.ColorDrawable r0 = (android.graphics.drawable.ColorDrawable) r0
            int r0 = r0.getColor()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)
        L_0x003d:
            r3 = 1
            if (r10 == 0) goto L_0x0047
            int r0 = r10.intValue()
            r6 = 0
            if (r0 != 0) goto L_0x0048
        L_0x0047:
            r6 = 1
        L_0x0048:
            android.content.Context r2 = r4.getContext()
            r1 = 16842801(0x1010031, float:2.3693695E-38)
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            int r9 = X.AnonymousClass5ZV.A01(r2, r1, r0)
            if (r6 == 0) goto L_0x005b
            java.lang.Integer r10 = java.lang.Integer.valueOf(r9)
        L_0x005b:
            r0 = 0
            X.AnonymousClass0ID.A00(r4, r0)
            android.content.Context r2 = r4.getContext()
            r8 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r1 = 16843857(0x1010451, float:2.3696655E-38)
            int r7 = android.os.Build.VERSION.SDK_INT
            r0 = 23
            if (r7 >= r0) goto L_0x0167
            int r1 = X.AnonymousClass5ZV.A01(r2, r1, r8)
            r0 = 128(0x80, float:1.794E-43)
            int r6 = X.AnonymousClass0YI.A06(r1, r0)
        L_0x0078:
            android.content.Context r2 = r4.getContext()
            r1 = 16843858(0x1010452, float:2.3696658E-38)
            r0 = 27
            if (r7 >= r0) goto L_0x0164
            int r1 = X.AnonymousClass5ZV.A01(r2, r1, r8)
            r0 = 128(0x80, float:1.794E-43)
            int r2 = X.AnonymousClass0YI.A06(r1, r0)
        L_0x008d:
            r4.setStatusBarColor(r6)
            r4.setNavigationBarColor(r2)
            int r0 = r10.intValue()
            boolean r1 = X.AnonymousClass5ZV.A03(r0)
            boolean r0 = X.AnonymousClass5ZV.A03(r6)
            if (r0 != 0) goto L_0x00a5
            if (r6 != 0) goto L_0x0161
            if (r1 == 0) goto L_0x0161
        L_0x00a5:
            r0 = 1
        L_0x00a6:
            X.C1446472j.A00(r4, r0)
            boolean r1 = X.AnonymousClass5ZV.A03(r9)
            boolean r0 = X.AnonymousClass5ZV.A03(r2)
            if (r0 != 0) goto L_0x00b7
            if (r2 != 0) goto L_0x015e
            if (r1 == 0) goto L_0x015e
        L_0x00b7:
            r2 = 1
        L_0x00b8:
            android.view.View r1 = r4.getDecorView()
            X.0KN r0 = new X.0KN
            r0.<init>(r1, r4)
            X.0QN r0 = r0.A00
            r0.A03(r2)
            int r2 = r5.getPaddingTop()
            android.view.ViewGroup$LayoutParams r0 = r5.getLayoutParams()
            int r1 = r0.height
            X.804 r0 = new X.804
            r0.<init>(r5, r11, r1, r2)
            X.AnonymousClass0YZ.A0E(r5, r0)
            r11.A0I = r3
        L_0x00da:
            r11.A0G()
            int r7 = r11.A02
            if (r7 == 0) goto L_0x01a0
            android.os.Bundle r0 = r11.A06
            java.lang.String r4 = "DATE_SELECTOR_KEY"
            r0.getParcelable(r4)
            r6 = 0
            X.5dI r9 = r11.A08
            com.google.android.material.datepicker.MaterialCalendar r8 = new com.google.android.material.datepicker.MaterialCalendar
            r8.<init>()
            android.os.Bundle r3 = X.AnonymousClass002.A08()
            java.lang.String r5 = "THEME_RES_ID_KEY"
            r3.putInt(r5, r7)
            java.lang.String r0 = "GRID_SELECTOR_KEY"
            r3.putParcelable(r0, r6)
            java.lang.String r2 = "CALENDAR_CONSTRAINTS_KEY"
            r3.putParcelable(r2, r9)
            java.lang.String r0 = "DAY_VIEW_DECORATOR_KEY"
            r3.putParcelable(r0, r6)
            java.lang.String r1 = "CURRENT_MONTH_KEY"
            X.5rI r0 = r9.A00
            r3.putParcelable(r1, r0)
            r8.A0u(r3)
            r11.A09 = r8
            com.google.android.material.internal.CheckableImageButton r0 = r11.A0B
            boolean r3 = r0.isChecked()
            if (r3 == 0) goto L_0x0138
            android.os.Bundle r0 = r11.A06
            r0.getParcelable(r4)
            X.5dI r1 = r11.A08
            com.google.android.material.datepicker.MaterialTextInputPicker r8 = new com.google.android.material.datepicker.MaterialTextInputPicker
            r8.<init>()
            android.os.Bundle r0 = X.AnonymousClass002.A08()
            r0.putInt(r5, r7)
            r0.putParcelable(r4, r6)
            r0.putParcelable(r2, r1)
            r8.A0u(r0)
        L_0x0138:
            r11.A0A = r8
            android.widget.TextView r2 = r11.A07
            if (r3 == 0) goto L_0x015b
            android.content.res.Configuration r0 = X.C86604Kt.A0A(r11)
            int r1 = r0.orientation
            r0 = 2
            if (r1 != r0) goto L_0x015b
            java.lang.CharSequence r0 = r11.A0G
        L_0x0149:
            r2.setText(r0)
            android.os.Bundle r0 = r11.A06
            r0.getParcelable(r4)
            r11.A1D()
            java.lang.String r0 = "getSelectionDisplayString"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)
            throw r0
        L_0x015b:
            java.lang.CharSequence r0 = r11.A0D
            goto L_0x0149
        L_0x015e:
            r2 = 0
            goto L_0x00b8
        L_0x0161:
            r0 = 0
            goto L_0x00a6
        L_0x0164:
            r2 = 0
            goto L_0x008d
        L_0x0167:
            r6 = 0
            goto L_0x0078
        L_0x016a:
            r10 = 0
            goto L_0x003d
        L_0x016d:
            r0 = -2
            r4.setLayout(r0, r0)
            android.content.res.Resources r1 = X.C08310eF.A09(r11)
            r0 = 2131167403(0x7f0708ab, float:1.7949079E38)
            int r7 = r1.getDimensionPixelOffset(r0)
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>(r7, r7, r7, r7)
            X.6D7 r6 = r11.A0C
            android.graphics.drawable.InsetDrawable r5 = new android.graphics.drawable.InsetDrawable
            r9 = r7
            r10 = r7
            r8 = r7
            r5.<init>(r6, r7, r8, r9, r10)
            r4.setBackgroundDrawable(r5)
            android.view.View r2 = r4.getDecorView()
            android.app.Dialog r1 = r11.A1I()
            X.5fK r0 = new X.5fK
            r0.<init>(r1, r3)
            r2.setOnTouchListener(r0)
            goto L_0x00da
        L_0x01a0:
            android.os.Bundle r1 = r11.A06
            java.lang.String r0 = "DATE_SELECTOR_KEY"
            r1.getParcelable(r0)
            java.lang.String r0 = "getDefaultThemeResId"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.MaterialDatePicker.A0g():void");
    }

    public final void A0p(Bundle bundle) {
        super.A0p(bundle);
        if (bundle == null) {
            bundle = this.A06;
        }
        this.A02 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        bundle.getParcelable("DATE_SELECTOR_KEY");
        this.A08 = (C108625dI) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        bundle.getParcelable("DAY_VIEW_DECORATOR_KEY");
        this.A04 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.A0H = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.A00 = bundle.getInt("INPUT_MODE_KEY");
        this.A03 = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.A0F = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.A01 = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.A0E = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        CharSequence charSequence = this.A0H;
        if (charSequence == null) {
            charSequence = C08310eF.A09(this).getText(this.A04);
        }
        this.A0D = charSequence;
        if (charSequence != null) {
            CharSequence[] split = TextUtils.split(String.valueOf(charSequence), "\n");
            if (split.length > 1) {
                charSequence = split[0];
            }
        } else {
            charSequence = null;
        }
        this.A0G = charSequence;
    }

    public final void A0q(Bundle bundle) {
        C117045rI r9;
        super.A0q(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.A02);
        bundle.putParcelable("DATE_SELECTOR_KEY", (Parcelable) null);
        C106385Yt r4 = new C106385Yt(this.A08);
        C117045rI r0 = this.A09.A0A;
        if (r0 != null) {
            r4.A04 = Long.valueOf(r0.A05);
        }
        Bundle A082 = AnonymousClass002.A08();
        A082.putParcelable("DEEP_COPY_VALIDATOR_KEY", r4.A03);
        long j = r4.A02;
        Calendar A1O = C86664Kz.A1O();
        A1O.setTimeInMillis(j);
        C117045rI r7 = new C117045rI(A1O);
        long j2 = r4.A01;
        Calendar A1O2 = C86664Kz.A1O();
        A1O2.setTimeInMillis(j2);
        C117045rI r8 = new C117045rI(A1O2);
        C187358x4 r6 = (C187358x4) A082.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l = r4.A04;
        if (l == null) {
            r9 = null;
        } else {
            long longValue = l.longValue();
            Calendar A1O3 = C86664Kz.A1O();
            A1O3.setTimeInMillis(longValue);
            r9 = new C117045rI(A1O3);
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new C108625dI(r6, r7, r8, r9, r4.A00));
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", (Parcelable) null);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.A04);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.A0H);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.A03);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.A0F);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.A01);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.A0E);
    }

    public final Dialog A1J(Bundle bundle) {
        Context A0G2 = A0G();
        A0G();
        int i = this.A02;
        if (i != 0) {
            Dialog dialog = new Dialog(A0G2, i);
            Context context = dialog.getContext();
            this.A0J = A01(context, 16843277);
            int i2 = C160907oe.A02(context, MaterialDatePicker.class.getCanonicalName(), R.attr.f3nameremoved).data;
            AnonymousClass6D7 r0 = new AnonymousClass6D7(new C161877ql(C161877ql.A01(context, (AttributeSet) null, R.attr.f3nameremoved, R.style.f12nameremoved)));
            this.A0C = r0;
            r0.A05(context);
            this.A0C.A06(ColorStateList.valueOf(i2));
            this.A0C.A04(AnonymousClass0YZ.A00(dialog.getWindow().getDecorView()));
            return dialog;
        }
        this.A06.getParcelable("DATE_SELECTOR_KEY");
        throw AnonymousClass001.A0g("getDefaultThemeResId");
    }
}
