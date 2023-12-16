package com.whatsapp.ui.media;

import X.AnonymousClass0Y8;
import X.AnonymousClass0x9;
import X.AnonymousClass4N4;
import X.AnonymousClass5CC;
import X.AnonymousClass64E;
import X.C106685Zz;
import X.C106815aD;
import X.C107345b9;
import X.C107635bd;
import X.C109675f0;
import X.C162457s7;
import X.C171988Je;
import X.C18270x1;
import X.C18290x4;
import X.C18310x6;
import X.C18330xA;
import X.C378924l;
import X.C58422vE;
import X.C86604Kt;
import X.C86624Kv;
import X.C86634Kw;
import X.C86664Kz;
import X.C86954Mn;
import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.util.AttributeSet;
import android.util.Pair;
import com.whatsapp.R;
import com.whatsapp.text.ReadMoreTextView;

public final class MediaCaptionTextView extends ReadMoreTextView {
    public C106685Zz A00;
    public boolean A01;
    public final boolean A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MediaCaptionTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C162457s7.A0J(context, 1);
        A08();
        setOnClickListener(new C109675f0((Object) this, 46));
        this.A02 = new C171988Je();
        this.A02 = getAbProps().A0Y(C58422vE.A01, 4093);
    }

    public final void A0N(AnonymousClass64E r12, CharSequence charSequence, boolean z) {
        float A012;
        CharSequence A07;
        int length;
        CharSequence charSequence2 = charSequence;
        if (charSequence == null || charSequence.length() == 0) {
            setVisibility(8);
            return;
        }
        int A002 = C106815aD.A00(charSequence);
        if (1 <= A002) {
            float A013 = C86664Kz.A01(C18290x4.A0G(this), R.dimen.f6nameremoved);
            float A003 = (C86604Kt.A00(getContext()) * A013) / C18290x4.A0G(this).getDisplayMetrics().scaledDensity;
            float f = A013;
            if (A013 > A003) {
                f = A003;
            }
            float f2 = f * 1.5f;
            float f3 = A013;
            if (A013 < f2) {
                f3 = f2;
            }
            A012 = A013 + (((f3 - A013) * ((float) (4 - A002))) / ((float) 3));
        } else {
            Resources A0G = C18290x4.A0G(this);
            int length2 = charSequence.length();
            int i = R.dimen.f6nameremoved;
            if (length2 < 96) {
                i = R.dimen.f6nameremoved;
            }
            A012 = C86664Kz.A01(A0G, i);
        }
        int i2 = 8388611;
        if (charSequence.length() < 96) {
            i2 = 17;
        }
        setGravity(i2);
        setTextSize(0, A012);
        if (this.A02) {
            int A04 = AnonymousClass0Y8.A04(getContext(), R.color.f5nameremoved);
            int A042 = AnonymousClass0Y8.A04(getContext(), R.color.f5nameremoved);
            TextPaint paint = getPaint();
            C162457s7.A0D(paint);
            Pair A043 = C107635bd.A04(paint, this.A09, this.A0C, charSequence2, A04, A042, false);
            if (A043 != null) {
                if (AnonymousClass0x9.A1Q(A043.second)) {
                    getLayoutParams().width = -2;
                    setGravity(8388611);
                }
                A07 = (CharSequence) A043.first;
            }
            setVisibility(0);
            if (z && r12 != null) {
                SpannableStringBuilder A004 = C18330xA.A00(getText());
                getLinkifyWeb().A06(A004);
                URLSpan[] A1Z = C18310x6.A1Z(A004);
                if (A1Z != null && (length = A1Z.length) != 0) {
                    int i3 = 0;
                    do {
                        URLSpan uRLSpan = A1Z[i3];
                        String url = uRLSpan.getURL();
                        C162457s7.A0H(url);
                        String A005 = AnonymousClass5CC.A00(url);
                        int spanStart = A004.getSpanStart(uRLSpan);
                        A004.replace(spanStart, A004.getSpanEnd(uRLSpan), A005);
                        int A0L = C86664Kz.A0L(A005, spanStart);
                        A004.removeSpan(uRLSpan);
                        A004.setSpan(new AnonymousClass4N4(r12, this, url), spanStart, A0L, 0);
                        i3++;
                    } while (i3 < length);
                    setLinkTextColor(AnonymousClass0Y8.A04(getContext(), R.color.f5nameremoved));
                    setMovementMethod(new C86954Mn());
                    setText(A004);
                    requestLayout();
                    return;
                }
                return;
            }
        }
        A07 = C107635bd.A07(this.A09, this.A0C, charSequence);
        setText(C107345b9.A03(getContext(), getPaint(), this.A0B, A07));
        setVisibility(0);
        if (z) {
        }
    }

    public final void setCaptionText(CharSequence charSequence) {
        A0N((AnonymousClass64E) null, charSequence, false);
    }

    public final void setLinkifyWeb(C106685Zz r2) {
        C162457s7.A0J(r2, 0);
        this.A00 = r2;
    }

    public final C106685Zz getLinkifyWeb() {
        C106685Zz r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("linkifyWeb");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MediaCaptionTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C162457s7.A0J(context, 1);
    }

    public /* synthetic */ MediaCaptionTextView(Context context, AttributeSet attributeSet, int i, int i2, C378924l r7) {
        this(context, C86624Kv.A09(attributeSet, i2), C86634Kw.A02(i2, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MediaCaptionTextView(Context context) {
        this(context, (AttributeSet) null, 0);
        C162457s7.A0J(context, 1);
    }
}
