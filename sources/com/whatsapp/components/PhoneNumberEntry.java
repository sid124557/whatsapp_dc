package com.whatsapp.components;

import X.AnonymousClass0YH;
import X.AnonymousClass4GJ;
import X.AnonymousClass4NH;
import X.AnonymousClass68G;
import X.AnonymousClass68H;
import X.AnonymousClass8LC;
import X.C06560Yg;
import X.C100905Cs;
import X.C106175Xx;
import X.C107195ar;
import X.C116855qy;
import X.C124156Be;
import X.C143616zC;
import X.C151457Uw;
import X.C162167rN;
import X.C180038k7;
import X.C620633i;
import X.C626936e;
import X.C64333Db;
import X.C86604Kt;
import X.C88864av;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.whatsapp.R;
import com.whatsapp.WaEditText;
import com.whatsapp.util.Log;

public class PhoneNumberEntry extends LinearLayout implements C180038k7, AnonymousClass4GJ {
    public TextWatcher A00;
    public C106175Xx A01;
    public WaEditText A02;
    public WaEditText A03;
    public C151457Uw A04;
    public C620633i A05;
    public C116855qy A06;
    public String A07;
    public boolean A08;

    public final void A02(Context context, AttributeSet attributeSet) {
        setSaveEnabled(true);
        AnonymousClass0YH.A06(this, 0);
        View.inflate(context, R.layout.f8nameremoved, this);
        this.A02 = (WaEditText) findViewById(R.id.registration_cc);
        WaEditText waEditText = (WaEditText) findViewById(R.id.registration_phone);
        this.A03 = waEditText;
        waEditText.setSaveEnabled(false);
        this.A02.setSaveEnabled(false);
        this.A02.setFilters(new InputFilter[]{new InputFilter.LengthFilter(3)});
        this.A03.setFilters(new InputFilter[]{new InputFilter.LengthFilter(17)});
        this.A03.setTextDirection(3);
        C124156Be r2 = new C124156Be(this, 0);
        WaEditText waEditText2 = this.A02;
        waEditText2.A01 = r2;
        this.A03.A01 = r2;
        AnonymousClass68H.A00(waEditText2, this, 2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C100905Cs.A0F);
        ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(0);
        if (colorStateList != null) {
            C06560Yg.A0C(colorStateList, this.A03);
            C06560Yg.A0C(colorStateList, this.A02);
        }
        obtainStyledAttributes.recycle();
    }

    public void A01() {
        if (!this.A08) {
            this.A08 = true;
            C64333Db A002 = C88864av.A00(generatedComponent());
            this.A05 = C64333Db.A2o(A002);
            this.A01 = C86604Kt.A0N(A002);
        }
    }

    public void A03(String str) {
        this.A07 = str;
        TextWatcher textWatcher = this.A00;
        if (textWatcher != null) {
            this.A03.removeTextChangedListener(textWatcher);
        }
        try {
            AnonymousClass68G r1 = new AnonymousClass68G(0, str, this);
            this.A00 = r1;
            this.A03.addTextChangedListener(r1);
        } catch (NullPointerException unused) {
            Log.e("PhoneNumberEntry/formatter exception");
        }
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A06;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A06 = r0;
        }
        return r0.generatedComponent();
    }

    public WaEditText getCountryCodeField() {
        return this.A02;
    }

    public WaEditText getPhoneNumberField() {
        return this.A03;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        AnonymousClass4NH r3 = (AnonymousClass4NH) parcelable;
        super.onRestoreInstanceState(r3.getSuperState());
        this.A02.setText(r3.A00);
        this.A03.setText(r3.A01);
    }

    public PhoneNumberEntry(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A01();
        A02(context, attributeSet);
    }

    public static String[] A00(C106175Xx r6, C620633i r7, int i, boolean z) {
        ClipboardManager A0C;
        ClipData primaryClip;
        String str;
        int i2;
        if (!((i != 16908322 && i != 16908337) || (A0C = r7.A0C()) == null || (primaryClip = A0C.getPrimaryClip()) == null || primaryClip.getItemCount() == 0)) {
            ClipData.Item itemAt = primaryClip.getItemAt(0);
            if (itemAt == null || itemAt.getText() == null) {
                str = "";
            } else {
                str = itemAt.getText().toString();
            }
            if (!str.startsWith("+")) {
                return null;
            }
            try {
                AnonymousClass8LC A0F = C162167rN.A00().A0F(str, (String) null);
                String num = Integer.toString(A0F.countryCode_);
                String A012 = C162167rN.A01(A0F);
                if (z) {
                    i2 = C107195ar.A01(r6, num, A012);
                } else {
                    i2 = C107195ar.A00(r6, num, A012);
                }
                if (i2 != 1) {
                    return null;
                }
                return new String[]{num, A012};
            } catch (C143616zC unused) {
            }
        }
        return null;
    }

    public Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        Editable text = this.A02.getText();
        C626936e.A06(text);
        String obj = text.toString();
        Editable text2 = this.A03.getText();
        C626936e.A06(text2);
        return new AnonymousClass4NH(onSaveInstanceState, obj, text2.toString());
    }

    public void setOnPhoneNumberChangeListener(C151457Uw r1) {
        this.A04 = r1;
    }

    public PhoneNumberEntry(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A01();
        A02(context, attributeSet);
    }

    public PhoneNumberEntry(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        A01();
    }

    public PhoneNumberEntry(Context context) {
        super(context);
        A01();
        A02(context, (AttributeSet) null);
    }
}
