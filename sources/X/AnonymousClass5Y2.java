package X;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import com.google.android.material.button.MaterialButton;
import com.whatsapp.R;

/* renamed from: X.5Y2  reason: invalid class name */
public class AnonymousClass5Y2 {
    public static final boolean A0K;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public ColorStateList A07;
    public ColorStateList A08;
    public ColorStateList A09;
    public PorterDuff.Mode A0A;
    public Drawable A0B;
    public LayerDrawable A0C;
    public C161877ql A0D;
    public boolean A0E = false;
    public boolean A0F;
    public boolean A0G = false;
    public boolean A0H = false;
    public boolean A0I = true;
    public final MaterialButton A0J;

    public static AnonymousClass6D7 A00(AnonymousClass5Y2 r1) {
        return r1.A01(false);
    }

    static {
        boolean z = true;
        if (Build.VERSION.SDK_INT > 22) {
            z = false;
        }
        A0K = z;
    }

    public final AnonymousClass6D7 A01(boolean z) {
        LayerDrawable layerDrawable = this.A0C;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (AnonymousClass6D7) ((LayerDrawable) ((InsetDrawable) this.A0C.getDrawable(0)).getDrawable()).getDrawable(z ^ true ? 1 : 0);
    }

    public C181238mQ A02() {
        Drawable drawable;
        LayerDrawable layerDrawable = this.A0C;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        int numberOfLayers = this.A0C.getNumberOfLayers();
        LayerDrawable layerDrawable2 = this.A0C;
        if (numberOfLayers > 2) {
            drawable = layerDrawable2.getDrawable(2);
        } else {
            drawable = layerDrawable2.getDrawable(1);
        }
        return (C181238mQ) drawable;
    }

    public final void A03() {
        int i;
        MaterialButton materialButton = this.A0J;
        AnonymousClass6D7 r8 = new AnonymousClass6D7(this.A0D);
        r8.A05(materialButton.getContext());
        AnonymousClass0YG.A01(this.A07, r8);
        PorterDuff.Mode mode = this.A0A;
        if (mode != null) {
            AnonymousClass0YG.A04(mode, r8);
        }
        ColorStateList colorStateList = this.A09;
        r8.A03.A04 = (float) this.A06;
        r8.invalidateSelf();
        r8.A07(colorStateList);
        AnonymousClass6D7 r7 = new AnonymousClass6D7(this.A0D);
        r7.setTint(0);
        float f = (float) this.A06;
        if (this.A0H) {
            i = AnonymousClass5ZV.A02(materialButton, R.attr.f3nameremoved);
        } else {
            i = 0;
        }
        r7.A03.A04 = f;
        r7.invalidateSelf();
        r7.A07(ColorStateList.valueOf(i));
        AnonymousClass6D7 r1 = new AnonymousClass6D7(this.A0D);
        this.A0B = r1;
        AnonymousClass0YG.A06(r1, -1);
        RippleDrawable rippleDrawable = new RippleDrawable(C106925aO.A02(this.A08), new InsetDrawable(new LayerDrawable(new Drawable[]{r7, r8}), this.A03, this.A05, this.A04, this.A02), this.A0B);
        this.A0C = rippleDrawable;
        materialButton.setInternalBackground(rippleDrawable);
        AnonymousClass6D7 A002 = A00(this);
        if (A002 != null) {
            A002.A04((float) this.A01);
            A002.setState(materialButton.getDrawableState());
        }
    }

    public final void A05(int i, int i2) {
        MaterialButton materialButton = this.A0J;
        int A032 = AnonymousClass0YH.A03(materialButton);
        int paddingTop = materialButton.getPaddingTop();
        int A022 = AnonymousClass0YH.A02(materialButton);
        int paddingBottom = materialButton.getPaddingBottom();
        int i3 = this.A05;
        int i4 = this.A02;
        this.A02 = i2;
        this.A05 = i;
        if (!this.A0E) {
            A03();
        }
        AnonymousClass0YH.A07(materialButton, A032, (paddingTop + i) - i3, A022, (paddingBottom + i2) - i4);
    }

    public void A06(C161877ql r6) {
        this.A0D = r6;
        if (!A0K || this.A0E) {
            if (A00(this) != null) {
                A00(this).setShapeAppearanceModel(r6);
            }
            if (A01(true) != null) {
                A01(true).setShapeAppearanceModel(r6);
            }
            if (A02() != null) {
                A02().setShapeAppearanceModel(r6);
                return;
            }
            return;
        }
        MaterialButton materialButton = this.A0J;
        int A032 = AnonymousClass0YH.A03(materialButton);
        int paddingTop = materialButton.getPaddingTop();
        int A022 = AnonymousClass0YH.A02(materialButton);
        int paddingBottom = materialButton.getPaddingBottom();
        A03();
        AnonymousClass0YH.A07(materialButton, A032, paddingTop, A022, paddingBottom);
    }

    public AnonymousClass5Y2(MaterialButton materialButton, C161877ql r3) {
        this.A0J = materialButton;
        this.A0D = r3;
    }

    public final void A04() {
        int i;
        AnonymousClass6D7 A002 = A00(this);
        AnonymousClass6D7 A012 = A01(true);
        if (A002 != null) {
            ColorStateList colorStateList = this.A09;
            A002.A03.A04 = (float) this.A06;
            A002.invalidateSelf();
            A002.A07(colorStateList);
            if (A012 != null) {
                float f = (float) this.A06;
                if (this.A0H) {
                    i = AnonymousClass5ZV.A02(this.A0J, R.attr.f3nameremoved);
                } else {
                    i = 0;
                }
                A012.A03.A04 = f;
                A012.invalidateSelf();
                A012.A07(ColorStateList.valueOf(i));
            }
        }
    }
}
