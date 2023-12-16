package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;

/* renamed from: X.04S  reason: invalid class name */
public class AnonymousClass04S extends C05520Tv {
    public ColorStateList A00 = null;
    public PorterDuff.Mode A01 = null;
    public Drawable A02;
    public boolean A03 = false;
    public boolean A04 = false;
    public final SeekBar A05;

    public void A01(AttributeSet attributeSet, int i) {
        super.A01(attributeSet, i);
        SeekBar seekBar = this.A05;
        Context context = seekBar.getContext();
        int[] iArr = AnonymousClass0KC.A06;
        AnonymousClass0UD A002 = AnonymousClass0UD.A00(context, attributeSet, iArr, i, 0);
        Context context2 = seekBar.getContext();
        TypedArray typedArray = A002.A02;
        C06560Yg.A0B(context2, typedArray, attributeSet, seekBar, iArr, i);
        Drawable A032 = A002.A03(0);
        if (A032 != null) {
            seekBar.setThumb(A032);
        }
        Drawable A022 = A002.A02(1);
        Drawable drawable = this.A02;
        if (drawable != null) {
            drawable.setCallback((Drawable.Callback) null);
        }
        this.A02 = A022;
        if (A022 != null) {
            A022.setCallback(seekBar);
            C06130Wj.A03(AnonymousClass0YH.A01(seekBar), A022);
            AnonymousClass000.A0t(A022, seekBar);
            A02();
        }
        seekBar.invalidate();
        if (typedArray.hasValue(3)) {
            this.A01 = AnonymousClass0XA.A00(this.A01, typedArray.getInt(3, -1));
            this.A04 = true;
        }
        if (typedArray.hasValue(2)) {
            this.A00 = A002.A01(2);
            this.A03 = true;
        }
        typedArray.recycle();
        A02();
    }

    public final void A02() {
        Drawable drawable = this.A02;
        if (drawable == null) {
            return;
        }
        if (this.A03 || this.A04) {
            Drawable A012 = C06130Wj.A01(drawable.mutate());
            this.A02 = A012;
            if (this.A03) {
                AnonymousClass0YG.A01(this.A00, A012);
            }
            if (this.A04) {
                AnonymousClass0YG.A04(this.A01, this.A02);
            }
            if (this.A02.isStateful()) {
                AnonymousClass001.A13(this.A02, this.A05);
            }
        }
    }

    public AnonymousClass04S(SeekBar seekBar) {
        super(seekBar);
        this.A05 = seekBar;
    }
}
