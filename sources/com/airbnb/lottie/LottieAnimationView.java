package com.airbnb.lottie;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass00H;
import X.AnonymousClass00v;
import X.AnonymousClass01G;
import X.AnonymousClass02S;
import X.AnonymousClass0FP;
import X.AnonymousClass0GZ;
import X.AnonymousClass0K1;
import X.AnonymousClass0MB;
import X.AnonymousClass0MT;
import X.AnonymousClass0QL;
import X.AnonymousClass0TI;
import X.AnonymousClass0UA;
import X.AnonymousClass0VX;
import X.AnonymousClass0WB;
import X.AnonymousClass0YR;
import X.C01680Bu;
import X.C02400Ga;
import X.C03250Jk;
import X.C05560Tz;
import X.C06360Xi;
import X.C09190fn;
import X.C13590nQ;
import X.C15430rK;
import X.C16200sd;
import X.C16210se;
import X.C17150ue;
import X.C17880wO;
import X.C17890wP;
import X.C17910wR;
import X.C18210wv;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import com.whatsapp.R;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.Set;

public class LottieAnimationView extends AppCompatImageView {
    public static final C16200sd A0J = new C09190fn();
    public int A00;
    public int A01 = 0;
    public int A02 = 0;
    public AnonymousClass0QL A03;
    public C16200sd A04;
    public AnonymousClass0UA A05;
    public AnonymousClass0FP A06;
    public String A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public final AnonymousClass01G A0F = new AnonymousClass01G();
    public final C16200sd A0G = new C18210wv(this, 0);
    public final C16200sd A0H = new C18210wv(this, 1);
    public final Set A0I = AnonymousClass0FP.A00(this);

    private void setCompositionTask(AnonymousClass0UA r2) {
        this.A03 = null;
        this.A0F.A00();
        A02();
        r2.A01(this.A0G);
        r2.A00(this.A0H);
        this.A05 = r2;
    }

    public void A00() {
        this.A08 = false;
        this.A0D = false;
        this.A0E = false;
        this.A0C = false;
        AnonymousClass01G r1 = this.A0F;
        r1.A0L.clear();
        AnonymousClass00H.A00(r1.A0K);
        A03();
    }

    public void setAnimation(InputStream inputStream, String str) {
        setCompositionTask(AnonymousClass0YR.A06(str, new C17890wP(2, str, inputStream)));
    }

    public final void A02() {
        AnonymousClass0UA r2 = this.A05;
        if (r2 != null) {
            C16200sd r1 = this.A0G;
            synchronized (r2) {
                r2.A02.remove(r1);
            }
            AnonymousClass0UA r22 = this.A05;
            C16200sd r12 = this.A0H;
            synchronized (r22) {
                r22.A01.remove(r12);
            }
        }
    }

    public final void A03() {
        AnonymousClass0QL r2;
        int i;
        int ordinal = this.A06.ordinal();
        int i2 = 2;
        if (ordinal != 1 && (ordinal == 2 || ordinal != 0 || (((r2 = this.A03) != null && ((r2.A0C && Build.VERSION.SDK_INT < 28) || r2.A03 > 4)) || (i = Build.VERSION.SDK_INT) == 24 || i == 25))) {
            i2 = 1;
        }
        if (i2 != getLayerType()) {
            setLayerType(i2, (Paint) null);
        }
    }

    public void buildDrawingCache(boolean z) {
        this.A01++;
        super.buildDrawingCache(z);
        if (this.A01 == 1 && getWidth() > 0 && getHeight() > 0 && getLayerType() == 1 && getDrawingCache(z) == null) {
            setRenderMode(AnonymousClass0FP.HARDWARE);
        }
        this.A01--;
        AnonymousClass0K1.A01();
    }

    public AnonymousClass0QL getComposition() {
        return this.A03;
    }

    public long getDuration() {
        AnonymousClass0QL r0 = this.A03;
        if (r0 != null) {
            return (long) AnonymousClass0QL.A00(r0);
        }
        return 0;
    }

    public int getFrame() {
        return (int) this.A0F.A0K.A00;
    }

    public String getImageAssetsFolder() {
        return this.A0F.A09;
    }

    public float getMaxFrame() {
        return this.A0F.A0K.A02();
    }

    public float getMinFrame() {
        return this.A0F.A0K.A03();
    }

    public AnonymousClass0MB getPerformanceTracker() {
        AnonymousClass0QL r0 = this.A0F.A04;
        if (r0 != null) {
            return r0.A0D;
        }
        return null;
    }

    public float getProgress() {
        return this.A0F.A0K.A01();
    }

    public int getRepeatCount() {
        return this.A0F.A0K.getRepeatCount();
    }

    public int getRepeatMode() {
        return this.A0F.A0K.getRepeatMode();
    }

    public float getScale() {
        return this.A0F.A00;
    }

    public float getSpeed() {
        return this.A0F.A0K.A03;
    }

    public void onDetachedFromWindow() {
        AnonymousClass01G r2 = this.A0F;
        AnonymousClass00H r1 = r2.A0K;
        if (r1 != null && r1.A07) {
            this.A0D = false;
            this.A0E = false;
            this.A0C = false;
            r2.A0L.clear();
            r1.cancel();
            A03();
            this.A0D = true;
        }
        super.onDetachedFromWindow();
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof AnonymousClass02S)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        AnonymousClass02S r3 = (AnonymousClass02S) parcelable;
        super.onRestoreInstanceState(r3.getSuperState());
        String str = r3.A04;
        this.A07 = str;
        if (!TextUtils.isEmpty(str)) {
            setAnimation(this.A07);
        }
        int i = r3.A01;
        this.A00 = i;
        if (i != 0) {
            setAnimation(i);
        }
        setProgress(r3.A00);
        if (r3.A06) {
            A01();
        }
        this.A0F.A09 = r3.A05;
        setRepeatMode(r3.A03);
        setRepeatCount(r3.A02);
    }

    public void onVisibilityChanged(View view, int i) {
        if (!this.A0B) {
            return;
        }
        if (isShown()) {
            if (this.A0E) {
                if (isShown()) {
                    this.A0F.A02();
                    A03();
                } else {
                    this.A0C = false;
                    this.A0E = true;
                }
            } else if (this.A0C) {
                A01();
            }
            this.A0E = false;
            this.A0C = false;
            return;
        }
        AnonymousClass00H r0 = this.A0F.A0K;
        if (r0 != null && r0.A07) {
            A00();
            this.A0E = true;
        }
    }

    public void setApplyingOpacityToLayersEnabled(boolean z) {
        this.A0F.A0C = z;
    }

    public void setComposition(AnonymousClass0QL r4) {
        boolean z;
        AnonymousClass01G r2 = this.A0F;
        r2.setCallback(this);
        this.A03 = r4;
        this.A0A = true;
        boolean A0G2 = r2.A0G(r4);
        this.A0A = false;
        A03();
        if (getDrawable() == r2) {
            if (!A0G2) {
                return;
            }
        } else if (!A0G2) {
            AnonymousClass00H r0 = r2.A0K;
            if (r0 == null) {
                z = false;
            } else {
                z = r0.A07;
            }
            setImageDrawable((Drawable) null);
            setImageDrawable(r2);
            if (z) {
                r2.A02();
            }
        }
        onVisibilityChanged(this, getVisibility());
        requestLayout();
        for (C16210se BPb : this.A0I) {
            BPb.BPb(r4);
        }
    }

    public void setFontAssetDelegate(AnonymousClass0GZ r2) {
        AnonymousClass01G r0 = this.A0F;
        r0.A02 = r2;
        AnonymousClass0MT r02 = r0.A06;
        if (r02 != null) {
            r02.A00 = r2;
        }
    }

    public void setFrame(int i) {
        this.A0F.A07(i);
    }

    public void setIgnoreDisabledSystemAnimations(boolean z) {
        this.A0F.A0B = z;
    }

    public void setImageAssetDelegate(C15430rK r2) {
        AnonymousClass01G r0 = this.A0F;
        r0.A03 = r2;
        AnonymousClass0TI r02 = r0.A07;
        if (r02 != null) {
            r02.A00 = r2;
        }
    }

    public void setImageAssetsFolder(String str) {
        this.A0F.A09 = str;
    }

    public void setMaxFrame(int i) {
        this.A0F.A08(i);
    }

    public void setMaxProgress(float f) {
        this.A0F.A04(f);
    }

    public void setMinAndMaxFrame(String str) {
        this.A0F.A0E(str);
    }

    public void setMinFrame(int i) {
        this.A0F.A09(i);
    }

    public void setMinProgress(float f) {
        this.A0F.A05(f);
    }

    public void setOutlineMasksAndMattes(boolean z) {
        AnonymousClass01G r1 = this.A0F;
        if (r1.A0E != z) {
            r1.A0E = z;
            C01680Bu r0 = r1.A08;
            if (r0 != null) {
                r0.A0A(z);
            }
        }
    }

    public void setPerformanceTrackingEnabled(boolean z) {
        AnonymousClass01G r0 = this.A0F;
        r0.A0F = z;
        AnonymousClass0QL r02 = r0.A04;
        if (r02 != null) {
            r02.A0D.A00 = z;
        }
    }

    public void setProgress(float f) {
        this.A0F.A06(f);
    }

    public void setRenderMode(AnonymousClass0FP r1) {
        this.A06 = r1;
        A03();
    }

    public void setRepeatCount(int i) {
        this.A0F.A0K.setRepeatCount(i);
    }

    public void setRepeatMode(int i) {
        this.A0F.A0K.setRepeatMode(i);
    }

    public void setSafeMode(boolean z) {
        this.A0F.A0G = z;
    }

    public void setScale(float f) {
        boolean z;
        AnonymousClass01G r2 = this.A0F;
        r2.A00 = f;
        if (getDrawable() == r2) {
            AnonymousClass00H r0 = r2.A0K;
            if (r0 == null) {
                z = false;
            } else {
                z = r0.A07;
            }
            setImageDrawable((Drawable) null);
            setImageDrawable(r2);
            if (z) {
                r2.A02();
            }
        }
    }

    public void setSpeed(float f) {
        this.A0F.A0K.A03 = f;
    }

    public void setTextDelegate(C02400Ga r2) {
        this.A0F.A05 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001b, code lost:
        r2 = (X.AnonymousClass01G) r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void unscheduleDrawable(android.graphics.drawable.Drawable r4) {
        /*
            r3 = this;
            boolean r0 = r3.A0A
            if (r0 != 0) goto L_0x0013
            X.01G r0 = r3.A0F
            if (r4 != r0) goto L_0x0017
            X.00H r0 = r0.A0K
            if (r0 == 0) goto L_0x0017
            boolean r0 = r0.A07
            if (r0 == 0) goto L_0x0017
            r3.A00()
        L_0x0013:
            super.unscheduleDrawable(r4)
            return
        L_0x0017:
            boolean r0 = r4 instanceof X.AnonymousClass01G
            if (r0 == 0) goto L_0x0013
            r2 = r4
            X.01G r2 = (X.AnonymousClass01G) r2
            X.00H r1 = r2.A0K
            if (r1 == 0) goto L_0x0013
            boolean r0 = r1.A07
            if (r0 == 0) goto L_0x0013
            java.util.ArrayList r0 = r2.A0L
            r0.clear()
            X.AnonymousClass00H.A00(r1)
            goto L_0x0013
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.LottieAnimationView.unscheduleDrawable(android.graphics.drawable.Drawable):void");
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A04(attributeSet, i);
    }

    public void A01() {
        if (isShown()) {
            this.A0F.A01();
            A03();
            return;
        }
        this.A0C = true;
    }

    public final void A04(AttributeSet attributeSet, int i) {
        String string;
        boolean z = false;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C03250Jk.A00, i, 0);
        this.A09 = obtainStyledAttributes.getBoolean(1, true);
        boolean hasValue = obtainStyledAttributes.hasValue(10);
        boolean hasValue2 = obtainStyledAttributes.hasValue(5);
        boolean hasValue3 = obtainStyledAttributes.hasValue(16);
        if (hasValue) {
            if (!hasValue2) {
                int resourceId = obtainStyledAttributes.getResourceId(10, 0);
                if (resourceId != 0) {
                    setAnimation(resourceId);
                }
            } else {
                throw AnonymousClass001.A0c("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
            }
        } else if (hasValue2) {
            String string2 = obtainStyledAttributes.getString(5);
            if (string2 != null) {
                setAnimation(string2);
            }
        } else if (hasValue3 && (string = obtainStyledAttributes.getString(16)) != null) {
            setAnimationFromUrl(string);
        }
        this.A02 = obtainStyledAttributes.getResourceId(4, 0);
        if (obtainStyledAttributes.getBoolean(0, false)) {
            this.A0D = true;
            this.A08 = true;
        }
        if (obtainStyledAttributes.getBoolean(8, false)) {
            this.A0F.A0K.setRepeatCount(-1);
        }
        if (obtainStyledAttributes.hasValue(13)) {
            setRepeatMode(obtainStyledAttributes.getInt(13, 1));
        }
        if (obtainStyledAttributes.hasValue(12)) {
            setRepeatCount(obtainStyledAttributes.getInt(12, -1));
        }
        if (obtainStyledAttributes.hasValue(15)) {
            setSpeed(obtainStyledAttributes.getFloat(15, 1.0f));
        }
        setImageAssetsFolder(obtainStyledAttributes.getString(7));
        setProgress(obtainStyledAttributes.getFloat(9, 0.0f));
        boolean z2 = obtainStyledAttributes.getBoolean(3, false);
        AnonymousClass01G r4 = this.A0F;
        if (r4.A0A != z2) {
            r4.A0A = z2;
            if (r4.A04 != null) {
                r4.A03();
            }
        }
        if (obtainStyledAttributes.hasValue(2)) {
            r4.A0C(new AnonymousClass0WB("**"), new C05560Tz(new AnonymousClass00v(AnonymousClass0VX.A00(getContext(), obtainStyledAttributes.getResourceId(2, -1)).getDefaultColor())), C17150ue.A00);
        }
        if (obtainStyledAttributes.hasValue(14)) {
            r4.A00 = obtainStyledAttributes.getFloat(14, 1.0f);
        }
        if (obtainStyledAttributes.hasValue(11)) {
            int i2 = obtainStyledAttributes.getInt(11, 0);
            if (i2 >= AnonymousClass0FP.values().length) {
                i2 = 0;
            }
            setRenderMode(AnonymousClass0FP.values()[i2]);
        }
        setIgnoreDisabledSystemAnimations(obtainStyledAttributes.getBoolean(6, false));
        obtainStyledAttributes.recycle();
        if (Settings.Global.getFloat(getContext().getContentResolver(), "animator_duration_scale", 1.0f) != 0.0f) {
            z = true;
        }
        r4.A0H = Boolean.valueOf(z).booleanValue();
        A03();
        this.A0B = true;
    }

    public void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        AnonymousClass01G r0 = this.A0F;
        if (drawable2 == r0) {
            super.invalidateDrawable(r0);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!isInEditMode() && (this.A08 || this.A0D)) {
            A01();
            this.A08 = false;
            this.A0D = false;
        }
        if (Build.VERSION.SDK_INT < 23) {
            onVisibilityChanged(this, getVisibility());
        }
    }

    public Parcelable onSaveInstanceState() {
        boolean z;
        AnonymousClass02S r3 = new AnonymousClass02S(super.onSaveInstanceState());
        r3.A04 = this.A07;
        r3.A01 = this.A00;
        AnonymousClass01G r2 = this.A0F;
        AnonymousClass00H r1 = r2.A0K;
        r3.A00 = r1.A01();
        if (r1.A07 || (!C06360Xi.A04(this) && this.A0D)) {
            z = true;
        } else {
            z = false;
        }
        r3.A06 = z;
        r3.A05 = r2.A09;
        r3.A03 = r1.getRepeatMode();
        r3.A02 = r1.getRepeatCount();
        return r3;
    }

    public void setAnimationFromJson(String str, String str2) {
        setAnimation(new ByteArrayInputStream(str.getBytes()), str2);
    }

    public void setAnimationFromUrl(String str, String str2) {
        setCompositionTask(AnonymousClass0YR.A06(str2, new C17910wR(getContext(), str, str2, 0)));
    }

    public void setImageBitmap(Bitmap bitmap) {
        A02();
        super.setImageBitmap(bitmap);
    }

    public void setImageDrawable(Drawable drawable) {
        A02();
        super.setImageDrawable(drawable);
    }

    public void setImageResource(int i) {
        A02();
        super.setImageResource(i);
    }

    public void setCacheComposition(boolean z) {
        this.A09 = z;
    }

    public void setFailureListener(C16200sd r1) {
        this.A04 = r1;
    }

    public void setFallbackResource(int i) {
        this.A02 = i;
    }

    public LottieAnimationView(Context context) {
        super(context, (AttributeSet) null);
        A04((AttributeSet) null, R.attr.f3nameremoved);
    }

    public void setAnimation(int i) {
        String str;
        AnonymousClass0UA A062;
        String str2;
        int i2 = i;
        this.A00 = i;
        this.A07 = null;
        if (isInEditMode()) {
            A062 = new AnonymousClass0UA(new C13590nQ(this, i), true);
        } else {
            boolean z = this.A09;
            Context context = getContext();
            if (z) {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("rawRes");
                if ((AnonymousClass001.A0M(context).uiMode & 48) == 32) {
                    str2 = "_night_";
                } else {
                    str2 = "_day_";
                }
                str = AnonymousClass000.A0Y(str2, A0o, i);
            } else {
                str = null;
            }
            A062 = AnonymousClass0YR.A06(str, new C17880wO(context.getApplicationContext(), new WeakReference(context), str, i2, 2));
        }
        setCompositionTask(A062);
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        setAnimationFromJson(str, (String) null);
    }

    public void setAnimationFromUrl(String str) {
        String str2;
        boolean z = this.A09;
        Context context = getContext();
        if (z) {
            str2 = AnonymousClass000.A0V("url_", str, AnonymousClass001.A0o());
        } else {
            str2 = null;
        }
        setCompositionTask(AnonymousClass0YR.A06(str2, new C17910wR(context, str, str2, 0)));
    }

    public void setMaxFrame(String str) {
        this.A0F.A0D(str);
    }

    public void setMinFrame(String str) {
        this.A0F.A0F(str);
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A04(attributeSet, R.attr.f3nameremoved);
    }

    public void setAnimation(String str) {
        String str2;
        AnonymousClass0UA A062;
        this.A07 = str;
        this.A00 = 0;
        if (isInEditMode()) {
            A062 = new AnonymousClass0UA(new C17890wP(1, str, this), true);
        } else {
            boolean z = this.A09;
            Context context = getContext();
            if (z) {
                str2 = AnonymousClass000.A0V("asset_", str, AnonymousClass001.A0o());
            } else {
                str2 = null;
            }
            A062 = AnonymousClass0YR.A06(str2, new C17910wR(context.getApplicationContext(), str, str2, 1));
        }
        setCompositionTask(A062);
    }
}
