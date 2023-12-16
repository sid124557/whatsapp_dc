package com.whatsapp;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass4NG;
import X.AnonymousClass5Yj;
import X.C107335b8;
import X.C1460578k;
import X.C181638n5;
import X.C18290x4;
import X.C18320x8;
import X.C86614Ku;
import X.C86624Kv;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.List;

public class StarRatingBar extends LinearLayout implements View.OnClickListener {
    public int A00;
    public C181638n5 A01;
    public final int A02;
    public final Drawable A03;
    public final Drawable A04;

    public void setRating(int i) {
        this.A00 = i;
        A00();
        sendAccessibilityEvent(16384);
        C181638n5 r0 = this.A01;
        if (r0 != null) {
            r0.BZN(i, false);
        }
    }

    public int getRating() {
        return this.A00;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        AnonymousClass4NG r2 = (AnonymousClass4NG) parcelable;
        super.onRestoreInstanceState(r2.getSuperState());
        this.A00 = r2.A00;
        A00();
    }

    /* JADX INFO: finally extract failed */
    public StarRatingBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A00 = 0;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C1460578k.A01, 0, 0);
        try {
            this.A02 = obtainStyledAttributes.getInt(1, 5);
            Drawable drawable = obtainStyledAttributes.getDrawable(0);
            this.A03 = drawable == null ? C107335b8.A04(context, R.drawable.message_rating_star, AnonymousClass5Yj.A02(context, R.attr.f3nameremoved, R.color.f5nameremoved)) : drawable;
            Drawable drawable2 = obtainStyledAttributes.getDrawable(2);
            this.A04 = drawable2 == null ? C107335b8.A04(context, R.drawable.message_rating_star_border, R.color.f5nameremoved) : drawable2;
            obtainStyledAttributes.recycle();
            setSaveEnabled(true);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void A00() {
        Drawable drawable;
        Drawable drawable2;
        if (getChildCount() == 0) {
            int i = 0;
            while (i < this.A02) {
                ImageView A0H = C86614Ku.A0H(this);
                C86624Kv.A0v(A0H, -2);
                i++;
                Integer valueOf = Integer.valueOf(i);
                A0H.setTag(valueOf);
                Resources resources = getResources();
                Object[] A0L = AnonymousClass002.A0L();
                A0L[0] = valueOf;
                A0H.setContentDescription(resources.getQuantityString(R.plurals.f9nameremoved, i, A0L));
                if (i <= this.A00) {
                    drawable2 = this.A03;
                } else {
                    drawable2 = this.A04;
                }
                A0H.setImageDrawable(drawable2);
                A0H.setOnClickListener(this);
                addView(A0H);
            }
            return;
        }
        int i2 = 0;
        while (i2 < this.A02) {
            ImageView imageView = (ImageView) getChildAt(i2);
            i2++;
            if (i2 <= this.A00) {
                drawable = this.A03;
            } else {
                drawable = this.A04;
            }
            imageView.setImageDrawable(drawable);
        }
    }

    public void onClick(View view) {
        int A0K = AnonymousClass001.A0K(view.getTag());
        this.A00 = A0K;
        A00();
        sendAccessibilityEvent(16384);
        C181638n5 r0 = this.A01;
        if (r0 != null) {
            r0.BZN(A0K, true);
        }
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        A00();
    }

    public Parcelable onSaveInstanceState() {
        AnonymousClass4NG r1 = new AnonymousClass4NG(super.onSaveInstanceState());
        r1.A00 = this.A00;
        return r1;
    }

    public void sendAccessibilityEvent(int i) {
        if (((AccessibilityManager) getContext().getSystemService("accessibility")).isTouchExplorationEnabled()) {
            super.sendAccessibilityEvent(i);
            AccessibilityEvent obtain = AccessibilityEvent.obtain(i);
            List<CharSequence> text = obtain.getText();
            Resources A0G = C18290x4.A0G(this);
            Object[] A0M = AnonymousClass002.A0M();
            AnonymousClass000.A1L(A0M, this.A00);
            text.add(C18320x8.A0b(A0G, Integer.valueOf(this.A02), A0M, 1, R.string.f11nameremoved));
            obtain.setEnabled(true);
            ((AccessibilityManager) getContext().getSystemService("accessibility")).sendAccessibilityEvent(obtain);
        }
    }

    public void setOnRatingChangeListener(C181638n5 r1) {
        this.A01 = r1;
    }

    public StarRatingBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public StarRatingBar(Context context) {
        this(context, (AttributeSet) null, 0);
    }
}
