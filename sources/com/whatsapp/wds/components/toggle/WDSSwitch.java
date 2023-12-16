package com.whatsapp.wds.components.toggle;

import X.AnonymousClass0RP;
import X.AnonymousClass0Y8;
import X.AnonymousClass0YG;
import X.C000500m;
import X.C105515Vh;
import X.C148347Ia;
import X.C148357Ib;
import X.C162457s7;
import X.C18280x3;
import X.C378924l;
import X.C620733j;
import X.C86624Kv;
import X.C86634Kw;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.SwitchCompat;
import com.whatsapp.R;
import java.lang.reflect.Field;
import java.util.Arrays;

public final class WDSSwitch extends SwitchCompat {
    public ColorStateList A00;
    public ColorStateList A01;
    public ColorStateList A02;
    public PorterDuff.Mode A03;
    public Drawable A04;
    public Drawable A05;
    public Drawable A06;
    public C620733j A07;
    public int[] A08;
    public int[] A09;
    public final C148347Ia A0A;
    public final C148357Ib A0B;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WDSSwitch(Context context, AttributeSet attributeSet, int i) {
        super(C105515Vh.A00(new C000500m(context, (int) R.style.f12nameremoved), attributeSet, i, R.style.f12nameremoved), attributeSet, i);
        C162457s7.A0J(context, 1);
        this.A03 = PorterDuff.Mode.SRC_IN;
        Field field = null;
        try {
            Field declaredField = SwitchCompat.class.getDeclaredField("mSwitchWidth");
            C162457s7.A0D(declaredField);
            declaredField.setAccessible(true);
            field = declaredField;
        } catch (NoSuchFieldException | SecurityException unused) {
        }
        this.A0A = new C148347Ia(this, field);
        this.A0B = new C148357Ib(this);
        this.A04 = this.A0K;
        this.A00 = this.A0G;
        super.setThumbTintList((ColorStateList) null);
        this.A06 = this.A0L;
        this.A02 = this.A0H;
        super.setTrackTintList((ColorStateList) null);
        this.A05 = AnonymousClass0RP.A00(context, R.drawable.vec_wds_switch_track_decoration);
        this.A01 = AnonymousClass0Y8.A07(context, R.color.f5nameremoved);
        setMinHeight(0);
        setMinimumHeight(0);
        A03();
        A04();
    }

    public final void A03() {
        Drawable drawable = this.A04;
        ColorStateList colorStateList = this.A00;
        PorterDuff.Mode mode = this.A0I;
        if (drawable == null) {
            drawable = null;
        } else if (colorStateList != null) {
            drawable = C86634Kw.A0G(drawable);
            C162457s7.A0D(drawable);
            if (mode != null) {
                AnonymousClass0YG.A04(mode, drawable);
            }
        }
        this.A04 = drawable;
        A05();
        super.setThumbDrawable(this.A04);
        refreshDrawableState();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0039, code lost:
        if (r2 != null) goto L_0x002c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A04() {
        /*
            r3 = this;
            android.graphics.drawable.Drawable r2 = r3.A06
            android.content.res.ColorStateList r1 = r3.A02
            android.graphics.PorterDuff$Mode r0 = r3.A0J
            if (r2 != 0) goto L_0x004b
            r2 = 0
        L_0x0009:
            r3.A06 = r2
            android.graphics.drawable.Drawable r2 = r3.A05
            android.content.res.ColorStateList r1 = r3.A01
            android.graphics.PorterDuff$Mode r0 = r3.A03
            if (r2 != 0) goto L_0x003c
            r2 = 0
        L_0x0014:
            r3.A05 = r2
            r3.A05()
            android.graphics.drawable.Drawable r2 = r3.A06
            if (r2 == 0) goto L_0x0037
            android.graphics.drawable.Drawable r1 = r3.A05
            if (r1 == 0) goto L_0x002c
            r0 = 2
            android.graphics.drawable.Drawable[] r0 = new android.graphics.drawable.Drawable[r0]
            X.AnonymousClass000.A16(r2, r1, r0)
            android.graphics.drawable.LayerDrawable r2 = new android.graphics.drawable.LayerDrawable
            r2.<init>(r0)
        L_0x002c:
            int r0 = r2.getIntrinsicWidth()
            r3.setSwitchMinWidth(r0)
        L_0x0033:
            super.setTrackDrawable(r2)
            return
        L_0x0037:
            android.graphics.drawable.Drawable r2 = r3.A05
            if (r2 == 0) goto L_0x0033
            goto L_0x002c
        L_0x003c:
            if (r1 == 0) goto L_0x0014
            android.graphics.drawable.Drawable r2 = X.C86634Kw.A0G(r2)
            X.C162457s7.A0D(r2)
            if (r0 == 0) goto L_0x0014
            X.AnonymousClass0YG.A04(r0, r2)
            goto L_0x0014
        L_0x004b:
            if (r1 == 0) goto L_0x0009
            android.graphics.drawable.Drawable r2 = X.C86634Kw.A0G(r2)
            X.C162457s7.A0D(r2)
            if (r0 == 0) goto L_0x0009
            X.AnonymousClass0YG.A04(r0, r2)
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.wds.components.toggle.WDSSwitch.A04():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A05() {
        /*
            r7 = this;
            android.content.res.ColorStateList r0 = r7.A00
            if (r0 != 0) goto L_0x000d
            android.content.res.ColorStateList r0 = r7.A02
            if (r0 != 0) goto L_0x000d
            android.content.res.ColorStateList r0 = r7.A01
            if (r0 != 0) goto L_0x000d
        L_0x000c:
            return
        L_0x000d:
            X.7Ib r2 = r7.A0B
            java.lang.reflect.Field r1 = r2.A01     // Catch:{ IllegalAccessException -> 0x001a }
            if (r1 == 0) goto L_0x001a
            com.whatsapp.wds.components.toggle.WDSSwitch r0 = r2.A00     // Catch:{ IllegalAccessException -> 0x001a }
            float r6 = r1.getFloat(r0)     // Catch:{ IllegalAccessException -> 0x001a }
            goto L_0x0024
        L_0x001a:
            com.whatsapp.wds.components.toggle.WDSSwitch r0 = r2.A00
            boolean r0 = r0.isChecked()
            float r6 = X.C86634Kw.A00(r0)
        L_0x0024:
            android.content.res.ColorStateList r3 = r7.A00
            java.lang.String r5 = "currentStateChecked"
            java.lang.String r4 = "currentStateUnchecked"
            if (r3 == 0) goto L_0x0043
            android.graphics.drawable.Drawable r2 = r7.A04
            int[] r1 = r7.A09
            if (r1 != 0) goto L_0x0037
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r4)
            throw r0
        L_0x0037:
            int[] r0 = r7.A08
            if (r0 != 0) goto L_0x0040
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r5)
            throw r0
        L_0x0040:
            X.C86644Kx.A0o(r3, r2, r1, r0, r6)
        L_0x0043:
            android.content.res.ColorStateList r3 = r7.A02
            if (r3 == 0) goto L_0x005e
            android.graphics.drawable.Drawable r2 = r7.A06
            int[] r1 = r7.A09
            if (r1 != 0) goto L_0x0052
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r4)
            throw r0
        L_0x0052:
            int[] r0 = r7.A08
            if (r0 != 0) goto L_0x005b
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r5)
            throw r0
        L_0x005b:
            X.C86644Kx.A0o(r3, r2, r1, r0, r6)
        L_0x005e:
            android.content.res.ColorStateList r3 = r7.A01
            if (r3 == 0) goto L_0x000c
            android.graphics.drawable.Drawable r2 = r7.A05
            int[] r1 = r7.A09
            if (r1 != 0) goto L_0x006d
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r4)
            throw r0
        L_0x006d:
            int[] r0 = r7.A08
            if (r0 != 0) goto L_0x0076
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r5)
            throw r0
        L_0x0076:
            X.C86644Kx.A0o(r3, r2, r1, r0, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.wds.components.toggle.WDSSwitch.A05():void");
    }

    public Drawable getThumbDrawable() {
        return this.A04;
    }

    public ColorStateList getThumbTintList() {
        return this.A00;
    }

    public Drawable getTrackDrawable() {
        return this.A06;
    }

    public ColorStateList getTrackTintList() {
        return this.A02;
    }

    public final C620733j getWhatsAppLocale() {
        return this.A07;
    }

    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        C18280x3.A12(onCreateDrawableState);
        int[] iArr = new int[r5];
        int i2 = 0;
        for (int i3 : onCreateDrawableState) {
            if (i3 != 16842912) {
                iArr[i2] = i3;
                i2++;
            }
        }
        this.A09 = iArr;
        int[] iArr2 = onCreateDrawableState;
        int i4 = 0;
        while (true) {
            if (i4 >= r5) {
                iArr2 = Arrays.copyOf(onCreateDrawableState, r5 + 1);
                C162457s7.A0D(iArr2);
                iArr2[r5] = 16842912;
                break;
            }
            int i5 = onCreateDrawableState[i4];
            if (i5 == 16842912) {
                break;
            } else if (i5 == 0) {
                iArr2 = (int[]) onCreateDrawableState.clone();
                iArr2[i4] = 16842912;
                break;
            } else {
                i4++;
            }
        }
        this.A08 = iArr2;
        return onCreateDrawableState;
    }

    public void setThumbDrawable(Drawable drawable) {
        this.A04 = drawable;
        A03();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.A00 = colorStateList;
        A03();
    }

    public void setTrackDrawable(Drawable drawable) {
        this.A06 = drawable;
        A04();
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.A02 = colorStateList;
        A04();
    }

    public void invalidate() {
        A05();
        super.invalidate();
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        C148347Ia r0 = this.A0A;
        int i3 = this.A06;
        try {
            Field field = r0.A01;
            if (field != null) {
                field.setInt(r0.A00, i3);
            }
        } catch (IllegalAccessException unused) {
        }
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        super.setThumbTintMode(mode);
        A03();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        super.setTrackTintMode(mode);
        A04();
    }

    public final void setWhatsAppLocale(C620733j r1) {
        this.A07 = r1;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public WDSSwitch(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.f3nameremoved);
        C162457s7.A0J(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WDSSwitch(Context context, AttributeSet attributeSet, int i, int i2, C378924l r7) {
        this(context, C86624Kv.A09(attributeSet, i2), (i2 & 4) != 0 ? R.attr.f3nameremoved : i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public WDSSwitch(Context context) {
        this(context, (AttributeSet) null, R.attr.f3nameremoved);
        C162457s7.A0J(context, 1);
    }
}
