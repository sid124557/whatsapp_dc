package com.whatsapp.authentication;

import X.AnonymousClass002;
import X.AnonymousClass0AR;
import X.AnonymousClass0x2;
import X.AnonymousClass0x9;
import X.AnonymousClass4GJ;
import X.C103055Lj;
import X.C116855qy;
import X.C1231967m;
import X.C620633i;
import X.C626936e;
import X.C70043Zq;
import X.C86634Kw;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.R;

public class FingerprintView extends LinearLayout implements AnonymousClass4GJ {
    public C103055Lj A00;
    public C116855qy A01;
    public boolean A02;
    public final ImageView A03;
    public final TextView A04;
    public final AnonymousClass0AR A05;
    public final AnonymousClass0AR A06;
    public final AnonymousClass0AR A07;
    public final AnonymousClass0AR A08;
    public final Runnable A09;

    public void A00() {
        C86634Kw.A1I(this.A04);
        ImageView imageView = this.A03;
        imageView.removeCallbacks(this.A09);
        AnonymousClass0AR r2 = this.A08;
        imageView.setImageDrawable(r2);
        r2.start();
        r2.A09(new C1231967m(this, 0));
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A01;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A01 = r0;
        }
        return r0.generatedComponent();
    }

    public FingerprintView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, R.style.f12nameremoved);
    }

    private void setError(String str) {
        if (getContext() != null) {
            TextView textView = this.A04;
            textView.setText(str);
            AnonymousClass0x2.A0q(getContext(), textView, R.color.f5nameremoved);
            textView.announceForAccessibility(str);
        }
    }

    public final void A01(AnonymousClass0AR r5) {
        String string = getContext().getString(R.string.f11nameremoved);
        if (getContext() != null) {
            TextView textView = this.A04;
            textView.setText(string);
            AnonymousClass0x2.A0q(getContext(), textView, R.color.f5nameremoved);
            textView.announceForAccessibility(string);
        }
        this.A03.setImageDrawable(r5);
        r5.start();
    }

    public void A02(CharSequence charSequence) {
        setError(charSequence.toString());
        ImageView imageView = this.A03;
        imageView.removeCallbacks(this.A09);
        Drawable drawable = imageView.getDrawable();
        AnonymousClass0AR r2 = this.A07;
        if (!drawable.equals(r2)) {
            imageView.setImageDrawable(r2);
            r2.start();
            r2.A09(new C1231967m(this, 1));
        }
    }

    public void A03(String str) {
        setError(str);
        ImageView imageView = this.A03;
        Drawable drawable = imageView.getDrawable();
        AnonymousClass0AR r1 = this.A07;
        if (!drawable.equals(r1)) {
            imageView.setImageDrawable(r1);
            r1.start();
        }
        Runnable runnable = this.A09;
        imageView.removeCallbacks(runnable);
        imageView.postDelayed(runnable, 1000);
    }

    public void setListener(C103055Lj r1) {
        this.A00 = r1;
    }

    public FingerprintView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, R.style.f12nameremoved);
    }

    public FingerprintView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i2);
        setOrientation(1);
        LayoutInflater A002 = C620633i.A00(context);
        C626936e.A06(A002);
        A002.inflate(R.layout.f8nameremoved, this, true);
        this.A04 = AnonymousClass002.A09(this, R.id.fingerprint_prompt);
        ImageView A0F = AnonymousClass0x9.A0F(this, R.id.fingerprint_icon);
        this.A03 = A0F;
        AnonymousClass0AR A042 = AnonymousClass0AR.A04(contextThemeWrapper, R.drawable.vec_fingerprint_icon);
        C626936e.A06(A042);
        this.A06 = A042;
        A0F.setImageDrawable(A042);
        A042.start();
        AnonymousClass0AR A043 = AnonymousClass0AR.A04(contextThemeWrapper, R.drawable.vec_fingerprint_icon_to_success);
        C626936e.A06(A043);
        this.A08 = A043;
        AnonymousClass0AR A044 = AnonymousClass0AR.A04(contextThemeWrapper, R.drawable.vec_fingerprint_icon_to_error);
        C626936e.A06(A044);
        this.A07 = A044;
        AnonymousClass0AR A045 = AnonymousClass0AR.A04(contextThemeWrapper, R.drawable.vec_error_to_fingerprint_icon);
        C626936e.A06(A045);
        this.A05 = A045;
        this.A09 = new C70043Zq(this, 43);
    }

    public FingerprintView(Context context) {
        this(context, (AttributeSet) null, 0, R.style.f12nameremoved);
    }
}
