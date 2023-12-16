package com.whatsapp.mediacomposer.doodle.textentry;

import X.AnonymousClass4vO;
import X.AnonymousClass5BF;
import X.AnonymousClass5X6;
import X.C109185eD;
import X.C114835ng;
import X.C171448Hc;
import X.C179488jE;
import X.C18290x4;
import X.C18330xA;
import X.C86664Kz;
import android.content.Context;
import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.view.KeyEvent;
import com.whatsapp.WaEditText;

public class DoodleEditText extends WaEditText {
    public int A00;
    public int A01;
    public C109185eD A02;
    public C179488jE A03;
    public boolean A04;
    public final AnonymousClass5X6 A05;

    public void A09(int i) {
        int i2;
        if (this.A00 != i) {
            this.A00 = i;
            if (i == 0) {
                i2 = 17;
            } else {
                i2 = 8388627;
                if (i != 1) {
                    if (i == 2) {
                        i2 = 8388629;
                    }
                    setTextAlignment(1);
                    setTextDirection(5);
                    clearFocus();
                }
            }
            setGravity(i2);
            setTextAlignment(1);
            setTextDirection(5);
            clearFocus();
        }
    }

    public void A0A(int i) {
        AnonymousClass5X6 r2 = this.A05;
        r2.A03 = i;
        r2.A01(i, r2.A02);
        C109185eD r1 = this.A02;
        if (r1 != null) {
            r1.A00 = r2.A00;
            r1.A01 = r2.A01;
        }
        setTextColor(r2.A04);
    }

    public int getBackgroundStyle() {
        return this.A05.A02;
    }

    public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        C179488jE r0 = this.A03;
        if (r0 != null) {
            C171448Hc r02 = (C171448Hc) r0;
            AnonymousClass4vO r3 = r02.A00;
            C114835ng r2 = r02.A01;
            if (i == 4 && keyEvent.getAction() == 1) {
                if (r3 instanceof TextEntryView) {
                    TextEntryView textEntryView = (TextEntryView) r3;
                    textEntryView.A04.A04(textEntryView.A06);
                }
                r2.A04.A04 = C18290x4.A0m(r3.A01);
                r2.dismiss();
            }
        }
        return super.onKeyPreIme(i, keyEvent);
    }

    public void setBackgroundStyle(int i) {
        AnonymousClass5X6 r1 = this.A05;
        r1.A02 = i;
        r1.A01(r1.A03, i);
        A0A(r1.A03);
    }

    public void setFontStyle(int i) {
        if (this.A01 != i) {
            this.A01 = i;
            setTypeface(AnonymousClass5BF.A00(getContext(), i));
            setAllCaps(false);
        }
    }

    public DoodleEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A04();
        this.A01 = 0;
        this.A00 = 0;
        this.A05 = new AnonymousClass5X6();
        setLayerType(1, (Paint) null);
    }

    public void setOnKeyPreImeListener(C179488jE r1) {
        this.A03 = r1;
    }

    public void setupBackgroundSpan(String str) {
        Context context = getContext();
        AnonymousClass5X6 r0 = this.A05;
        this.A02 = new C109185eD(context, this, r0.A00, r0.A01);
        SpannableStringBuilder A002 = C18330xA.A00(str);
        A002.setSpan(this.A02, 0, A002.length(), 18);
        setShadowLayer(getTextSize() / 2.0f, 0.0f, 0.0f, 0);
        C86664Kz.A1T(this, A002);
    }

    public DoodleEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A04();
        this.A01 = 0;
        this.A00 = 0;
        this.A05 = new AnonymousClass5X6();
        setLayerType(1, (Paint) null);
    }

    public DoodleEditText(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        A04();
    }

    public DoodleEditText(Context context) {
        super(context);
        A04();
        this.A01 = 0;
        this.A00 = 0;
        this.A05 = new AnonymousClass5X6();
        setLayerType(1, (Paint) null);
    }
}
