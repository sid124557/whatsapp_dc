package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.core.view.inputmethod.EditorInfoCompat;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* renamed from: X.0WJ  reason: invalid class name */
public class AnonymousClass0WJ {
    public int A00 = -1;
    public int A01 = 0;
    public Typeface A02;
    public C03900Lz A03;
    public C03900Lz A04;
    public C03900Lz A05;
    public C03900Lz A06;
    public C03900Lz A07;
    public C03900Lz A08;
    public C03900Lz A09;
    public boolean A0A;
    public final TextView A0B;
    public final AnonymousClass0XX A0C;

    public static Drawable A00(Context context, TypedArray typedArray, AnonymousClass0XJ r4, int i) {
        Drawable A062;
        int resourceId = typedArray.getResourceId(i, -1);
        if (resourceId == -1) {
            return null;
        }
        synchronized (r4) {
            A062 = r4.A00.A06(context, resourceId);
        }
        return A062;
    }

    public static C03900Lz A01(Context context, AnonymousClass0XJ r3, int i) {
        ColorStateList A052;
        synchronized (r3) {
            A052 = r3.A00.A05(context, i);
        }
        if (A052 == null) {
            return null;
        }
        C03900Lz r1 = new C03900Lz();
        r1.A02 = true;
        r1.A00 = A052;
        return r1;
    }

    public static void A02(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        if (Build.VERSION.SDK_INT < 30 && inputConnection != null) {
            EditorInfoCompat.setInitialSurroundingText(editorInfo, textView.getText());
        }
    }

    public void A03() {
        if (!(this.A05 == null && this.A09 == null && this.A06 == null && this.A03 == null)) {
            Drawable[] compoundDrawables = this.A0B.getCompoundDrawables();
            A0A(compoundDrawables[0], this.A05);
            A0A(compoundDrawables[1], this.A09);
            A0A(compoundDrawables[2], this.A06);
            A0A(compoundDrawables[3], this.A03);
        }
        if (this.A07 != null || this.A04 != null) {
            Drawable[] compoundDrawablesRelative = this.A0B.getCompoundDrawablesRelative();
            A0A(compoundDrawablesRelative[0], this.A07);
            A0A(compoundDrawablesRelative[2], this.A04);
        }
    }

    public void A04(int i) {
        AnonymousClass0XX r4 = this.A0C;
        if (!(!(r4.A09 instanceof AnonymousClass03A))) {
            return;
        }
        if (i == 0) {
            r4.A03 = 0;
            r4.A01 = -1.0f;
            r4.A00 = -1.0f;
            r4.A02 = -1.0f;
            r4.A07 = new int[0];
            r4.A06 = false;
        } else if (i == 1) {
            DisplayMetrics A0B2 = AnonymousClass000.A0B(r4.A08);
            r4.A05(TypedValue.applyDimension(2, 12.0f, A0B2), TypedValue.applyDimension(2, 112.0f, A0B2), 1.0f);
            if (r4.A07()) {
                r4.A04();
            }
        } else {
            throw AnonymousClass000.A0G("Unknown auto-size text type: ", AnonymousClass001.A0o(), i);
        }
    }

    public void A05(int i, int i2, int i3, int i4) {
        AnonymousClass0XX r4 = this.A0C;
        if (!(r4.A09 instanceof AnonymousClass03A)) {
            DisplayMetrics A0B2 = AnonymousClass000.A0B(r4.A08);
            r4.A05(TypedValue.applyDimension(i4, (float) i, A0B2), TypedValue.applyDimension(i4, (float) i2, A0B2), TypedValue.applyDimension(i4, (float) i3, A0B2));
            if (r4.A07()) {
                r4.A04();
            }
        }
    }

    public void A06(Context context, int i) {
        String string;
        ColorStateList A012;
        ColorStateList A013;
        ColorStateList A014;
        AnonymousClass0UD r5 = new AnonymousClass0UD(context, context.obtainStyledAttributes(i, AnonymousClass0KC.A0M));
        TypedArray typedArray = r5.A02;
        if (typedArray.hasValue(14)) {
            this.A0B.setAllCaps(typedArray.getBoolean(14, false));
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 23) {
            if (typedArray.hasValue(3) && (A014 = r5.A01(3)) != null) {
                this.A0B.setTextColor(A014);
            }
            if (typedArray.hasValue(5) && (A013 = r5.A01(5)) != null) {
                this.A0B.setLinkTextColor(A013);
            }
            if (typedArray.hasValue(4) && (A012 = r5.A01(4)) != null) {
                this.A0B.setHintTextColor(A012);
            }
        }
        if (typedArray.hasValue(0) && typedArray.getDimensionPixelSize(0, -1) == 0) {
            this.A0B.setTextSize(0, 0.0f);
        }
        A07(context, r5);
        if (i2 >= 26 && typedArray.hasValue(13) && (string = typedArray.getString(13)) != null) {
            this.A0B.setFontVariationSettings(string);
        }
        typedArray.recycle();
        Typeface typeface = this.A02;
        if (typeface != null) {
            this.A0B.setTypeface(typeface, this.A01);
        }
    }

    public final void A07(Context context, AnonymousClass0UD r17) {
        String string;
        Typeface create;
        Typeface A032;
        int i = this.A01;
        AnonymousClass0UD r8 = r17;
        TypedArray typedArray = r8.A02;
        this.A01 = typedArray.getInt(2, i);
        int i2 = Build.VERSION.SDK_INT;
        boolean z = false;
        if (i2 >= 28) {
            int i3 = typedArray.getInt(11, -1);
            this.A00 = i3;
            if (i3 != -1) {
                this.A01 &= 2;
            }
        }
        int i4 = 10;
        if (typedArray.hasValue(10) || typedArray.hasValue(12)) {
            this.A02 = null;
            if (typedArray.hasValue(12)) {
                i4 = 12;
            }
            int i5 = this.A00;
            int i6 = this.A01;
            if (!context.isRestricted()) {
                C005405p r10 = new C005405p(this, new WeakReference(this.A0B), i5, i6);
                try {
                    int i7 = this.A01;
                    int resourceId = typedArray.getResourceId(i4, 0);
                    if (resourceId != 0) {
                        TypedValue typedValue = r8.A00;
                        if (typedValue == null) {
                            typedValue = new TypedValue();
                            r8.A00 = typedValue;
                        }
                        Context context2 = r8.A01;
                        if (!context2.isRestricted() && (A032 = C06400Xn.A03(context2, typedValue, r10, resourceId, i7, true, false)) != null) {
                            if (i2 >= 28 && this.A00 != -1) {
                                A032 = Typeface.create(Typeface.create(A032, 0), this.A00, AnonymousClass000.A1S(this.A01 & 2));
                            }
                            this.A02 = A032;
                        }
                    }
                    this.A0A = AnonymousClass000.A1X(this.A02);
                } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
                }
            }
            if (this.A02 == null && (string = typedArray.getString(i4)) != null) {
                if (i2 < 28 || this.A00 == -1) {
                    create = Typeface.create(string, this.A01);
                } else {
                    Typeface create2 = Typeface.create(string, 0);
                    int i8 = this.A00;
                    if ((this.A01 & 2) != 0) {
                        z = true;
                    }
                    create = Typeface.create(create2, i8, z);
                }
            } else {
                return;
            }
        } else if (typedArray.hasValue(1)) {
            this.A0A = false;
            int i9 = typedArray.getInt(1, 1);
            if (i9 == 1) {
                create = Typeface.SANS_SERIF;
            } else if (i9 == 2) {
                create = Typeface.SERIF;
            } else if (i9 == 3) {
                create = Typeface.MONOSPACE;
            } else {
                return;
            }
        } else {
            return;
        }
        this.A02 = create;
    }

    public void A08(ColorStateList colorStateList) {
        C03900Lz r1 = this.A08;
        if (r1 == null) {
            r1 = new C03900Lz();
            this.A08 = r1;
        }
        r1.A00 = colorStateList;
        r1.A02 = AnonymousClass000.A1W(colorStateList);
        this.A05 = r1;
        this.A09 = r1;
        this.A06 = r1;
        this.A03 = r1;
        this.A07 = r1;
        this.A04 = r1;
    }

    public void A09(PorterDuff.Mode mode) {
        C03900Lz r1 = this.A08;
        if (r1 == null) {
            r1 = new C03900Lz();
            this.A08 = r1;
        }
        r1.A01 = mode;
        r1.A03 = AnonymousClass000.A1W(mode);
        this.A05 = r1;
        this.A09 = r1;
        this.A06 = r1;
        this.A03 = r1;
        this.A07 = r1;
        this.A04 = r1;
    }

    public final void A0A(Drawable drawable, C03900Lz r3) {
        if (drawable != null && r3 != null) {
            AnonymousClass0XW.A04(drawable, r3, this.A0B.getDrawableState());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x0210  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x021b  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0226  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0247  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x026a  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x02a5  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x032d  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x033c  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x0361  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x0366  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x036b  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x0395  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x0399  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x039d  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x03a1  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x03ad  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x03b1  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x03b5  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x03b9  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x03d9  */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x03dc  */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x03e5  */
    /* JADX WARNING: Removed duplicated region for block: B:214:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x016d  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0177  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01a2  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01a7  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01ac  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01bc  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01c8  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01cd  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0201  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0B(android.util.AttributeSet r25, int r26) {
        /*
            r24 = this;
            r12 = r24
            android.widget.TextView r11 = r12.A0B
            android.content.Context r10 = r11.getContext()
            X.0XJ r9 = X.AnonymousClass0XJ.A01()
            int[] r3 = X.AnonymousClass0KC.A07
            r13 = 0
            r20 = r25
            r23 = r26
            r1 = r20
            r0 = r23
            X.0UD r0 = X.AnonymousClass0UD.A00(r10, r1, r3, r0, r13)
            android.content.Context r18 = r11.getContext()
            android.content.res.TypedArray r2 = r0.A02
            r17 = 0
            r8 = 0
            r19 = r2
            r21 = r11
            r22 = r3
            X.C06560Yg.A0B(r18, r19, r20, r21, r22, r23)
            r3 = -1
            int r1 = r2.getResourceId(r13, r3)
            r0 = 3
            boolean r0 = r2.hasValue(r0)
            if (r0 == 0) goto L_0x0044
            r0 = 3
            int r0 = r2.getResourceId(r0, r13)
            X.0Lz r0 = A01(r10, r9, r0)
            r12.A05 = r0
        L_0x0044:
            r0 = 1
            boolean r0 = r2.hasValue(r0)
            if (r0 == 0) goto L_0x0056
            r0 = 1
            int r0 = r2.getResourceId(r0, r13)
            X.0Lz r0 = A01(r10, r9, r0)
            r12.A09 = r0
        L_0x0056:
            r0 = 4
            boolean r0 = r2.hasValue(r0)
            if (r0 == 0) goto L_0x0068
            r0 = 4
            int r0 = r2.getResourceId(r0, r13)
            X.0Lz r0 = A01(r10, r9, r0)
            r12.A06 = r0
        L_0x0068:
            r0 = 2
            boolean r0 = r2.hasValue(r0)
            if (r0 == 0) goto L_0x007a
            r0 = 2
            int r0 = r2.getResourceId(r0, r13)
            X.0Lz r0 = A01(r10, r9, r0)
            r12.A03 = r0
        L_0x007a:
            int r7 = android.os.Build.VERSION.SDK_INT
            r0 = 5
            boolean r0 = r2.hasValue(r0)
            if (r0 == 0) goto L_0x008e
            r0 = 5
            int r0 = r2.getResourceId(r0, r13)
            X.0Lz r0 = A01(r10, r9, r0)
            r12.A07 = r0
        L_0x008e:
            r0 = 6
            boolean r0 = r2.hasValue(r0)
            if (r0 == 0) goto L_0x00a0
            r0 = 6
            int r0 = r2.getResourceId(r0, r13)
            X.0Lz r0 = A01(r10, r9, r0)
            r12.A04 = r0
        L_0x00a0:
            r2.recycle()
            android.text.method.TransformationMethod r0 = r11.getTransformationMethod()
            boolean r14 = r0 instanceof android.text.method.PasswordTransformationMethod
            r2 = 26
            r4 = 23
            if (r1 == r3) goto L_0x03ee
            int[] r0 = X.AnonymousClass0KC.A0M
            android.content.res.TypedArray r0 = r10.obtainStyledAttributes(r1, r0)
            X.0UD r3 = new X.0UD
            r3.<init>(r10, r0)
            if (r14 != 0) goto L_0x03ea
            r0 = 14
            android.content.res.TypedArray r1 = r3.A02
            boolean r0 = r1.hasValue(r0)
            if (r0 == 0) goto L_0x03ea
            r0 = 14
            boolean r17 = r1.getBoolean(r0, r13)
            r16 = 1
        L_0x00ce:
            r12.A07(r10, r3)
            if (r7 >= r4) goto L_0x03e5
            r1 = 3
            android.content.res.TypedArray r4 = r3.A02
            boolean r0 = r4.hasValue(r1)
            if (r0 == 0) goto L_0x03e2
            android.content.res.ColorStateList r6 = r3.A01(r1)
        L_0x00e0:
            r1 = 4
            boolean r0 = r4.hasValue(r1)
            if (r0 == 0) goto L_0x03df
            android.content.res.ColorStateList r5 = r3.A01(r1)
        L_0x00eb:
            r1 = 5
            boolean r0 = r4.hasValue(r1)
            if (r0 == 0) goto L_0x03e7
            android.content.res.ColorStateList r4 = r3.A01(r1)
        L_0x00f6:
            r0 = 15
            android.content.res.TypedArray r1 = r3.A02
            boolean r0 = r1.hasValue(r0)
            if (r0 == 0) goto L_0x03dc
            r0 = 15
            java.lang.String r3 = r1.getString(r0)
        L_0x0106:
            if (r7 < r2) goto L_0x03d9
            r0 = 13
            boolean r0 = r1.hasValue(r0)
            if (r0 == 0) goto L_0x03d9
            r0 = 13
            java.lang.String r2 = r1.getString(r0)
        L_0x0116:
            r1.recycle()
        L_0x0119:
            int[] r0 = X.AnonymousClass0KC.A0M
            r15 = r20
            r1 = r23
            X.0UD r1 = X.AnonymousClass0UD.A00(r10, r15, r0, r1, r13)
            if (r14 != 0) goto L_0x03d5
            android.content.res.TypedArray r0 = r1.A02
            r18 = r0
            r0 = 14
            r15 = r0
            r0 = r18
            boolean r0 = r0.hasValue(r15)
            if (r0 == 0) goto L_0x03d5
            r0 = r18
            boolean r17 = r0.getBoolean(r15, r13)
            r0 = 23
            r16 = 1
        L_0x013e:
            if (r7 >= r0) goto L_0x0163
            r13 = 3
            android.content.res.TypedArray r15 = r1.A02
            boolean r0 = r15.hasValue(r13)
            if (r0 == 0) goto L_0x014d
            android.content.res.ColorStateList r6 = r1.A01(r13)
        L_0x014d:
            r13 = 4
            boolean r0 = r15.hasValue(r13)
            if (r0 == 0) goto L_0x0158
            android.content.res.ColorStateList r5 = r1.A01(r13)
        L_0x0158:
            r13 = 5
            boolean r0 = r15.hasValue(r13)
            if (r0 == 0) goto L_0x0163
            android.content.res.ColorStateList r4 = r1.A01(r13)
        L_0x0163:
            r0 = 15
            android.content.res.TypedArray r13 = r1.A02
            boolean r0 = r13.hasValue(r0)
            if (r0 == 0) goto L_0x0173
            r0 = 15
            java.lang.String r3 = r13.getString(r0)
        L_0x0173:
            r0 = 26
            if (r7 < r0) goto L_0x019a
            r0 = 13
            boolean r0 = r13.hasValue(r0)
            if (r0 == 0) goto L_0x0185
            r0 = 13
            java.lang.String r2 = r13.getString(r0)
        L_0x0185:
            r0 = 28
            if (r7 < r0) goto L_0x019a
            boolean r0 = r13.hasValue(r8)
            if (r0 == 0) goto L_0x019a
            r0 = -1
            int r0 = r13.getDimensionPixelSize(r8, r0)
            if (r0 != 0) goto L_0x019a
            r0 = 0
            r11.setTextSize(r8, r0)
        L_0x019a:
            r12.A07(r10, r1)
            r13.recycle()
            if (r6 == 0) goto L_0x01a5
            r11.setTextColor(r6)
        L_0x01a5:
            if (r5 == 0) goto L_0x01aa
            r11.setHintTextColor(r5)
        L_0x01aa:
            if (r4 == 0) goto L_0x01af
            r11.setLinkTextColor(r4)
        L_0x01af:
            if (r14 != 0) goto L_0x01b8
            if (r16 == 0) goto L_0x01b8
            r0 = r17
            r11.setAllCaps(r0)
        L_0x01b8:
            android.graphics.Typeface r4 = r12.A02
            if (r4 == 0) goto L_0x01c6
            int r1 = r12.A00
            r0 = -1
            if (r1 != r0) goto L_0x03d0
            int r0 = r12.A01
            r11.setTypeface(r4, r0)
        L_0x01c6:
            if (r2 == 0) goto L_0x01cb
            r11.setFontVariationSettings(r2)
        L_0x01cb:
            if (r3 == 0) goto L_0x01d8
            r0 = 24
            if (r7 < r0) goto L_0x03bd
            android.os.LocaleList r0 = android.os.LocaleList.forLanguageTags(r3)
            r11.setTextLocales(r0)
        L_0x01d8:
            X.0XX r4 = r12.A0C
            android.content.Context r0 = r4.A08
            r19 = r0
            int[] r3 = X.AnonymousClass0KC.A08
            r2 = r0
            r1 = r20
            r0 = r23
            android.content.res.TypedArray r12 = r2.obtainStyledAttributes(r1, r3, r0, r8)
            android.widget.TextView r0 = r4.A09
            r16 = r0
            android.content.Context r13 = r16.getContext()
            r14 = r12
            r15 = r1
            r17 = r3
            r18 = r23
            X.C06560Yg.A0B(r13, r14, r15, r16, r17, r18)
            r1 = 5
            boolean r0 = r12.hasValue(r1)
            if (r0 == 0) goto L_0x0207
            int r0 = r12.getInt(r1, r8)
            r4.A03 = r0
        L_0x0207:
            r1 = 4
            boolean r0 = r12.hasValue(r1)
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r0 == 0) goto L_0x03b9
            float r6 = r12.getDimension(r1, r2)
        L_0x0214:
            r1 = 2
            boolean r0 = r12.hasValue(r1)
            if (r0 == 0) goto L_0x03b5
            float r7 = r12.getDimension(r1, r2)
        L_0x021f:
            r1 = 1
            boolean r0 = r12.hasValue(r1)
            if (r0 == 0) goto L_0x03b1
            float r5 = r12.getDimension(r1, r2)
        L_0x022a:
            r1 = 3
            boolean r0 = r12.hasValue(r1)
            if (r0 == 0) goto L_0x025f
            int r1 = r12.getResourceId(r1, r8)
            if (r1 <= 0) goto L_0x025f
            android.content.res.Resources r0 = r12.getResources()
            android.content.res.TypedArray r14 = r0.obtainTypedArray(r1)
            int r15 = r14.length()
            int[] r13 = new int[r15]
            if (r15 <= 0) goto L_0x025c
            r1 = 0
        L_0x0248:
            r0 = -1
            int r0 = r14.getDimensionPixelSize(r1, r0)
            r13[r1] = r0
            int r1 = r1 + 1
            if (r1 < r15) goto L_0x0248
            int[] r0 = X.AnonymousClass0XX.A02(r13)
            r4.A07 = r0
            r4.A08()
        L_0x025c:
            r14.recycle()
        L_0x025f:
            r12.recycle()
            r0 = r16
            boolean r0 = r0 instanceof X.AnonymousClass03A
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x03ad
            int r1 = r4.A03
            r0 = 1
            if (r1 != r0) goto L_0x0298
            boolean r0 = r4.A05
            if (r0 != 0) goto L_0x0295
            android.util.DisplayMetrics r12 = X.AnonymousClass000.A0B(r19)
            r1 = 2
            int r0 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x0282
            r0 = 1094713344(0x41400000, float:12.0)
            float r7 = android.util.TypedValue.applyDimension(r1, r0, r12)
        L_0x0282:
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x028c
            r0 = 1121976320(0x42e00000, float:112.0)
            float r5 = android.util.TypedValue.applyDimension(r1, r0, r12)
        L_0x028c:
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x0292
            r6 = 1065353216(0x3f800000, float:1.0)
        L_0x0292:
            r4.A05(r7, r5, r6)
        L_0x0295:
            r4.A07()
        L_0x0298:
            boolean r0 = X.C17170ug.A00
            if (r0 == 0) goto L_0x02c3
            int r0 = r4.A03
            if (r0 == 0) goto L_0x02c3
            int[] r1 = r4.A07
            int r0 = r1.length
            if (r0 <= 0) goto L_0x02c3
            int r0 = r11.getAutoSizeStepGranularity()
            float r0 = (float) r0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x03a8
            float r0 = r4.A01
            int r2 = java.lang.Math.round(r0)
            float r0 = r4.A00
            int r1 = java.lang.Math.round(r0)
            float r0 = r4.A02
            int r0 = java.lang.Math.round(r0)
            r11.setAutoSizeTextTypeUniformWithConfiguration(r2, r1, r0, r8)
        L_0x02c3:
            r0 = r20
            android.content.res.TypedArray r0 = r10.obtainStyledAttributes(r0, r3)
            X.0UD r6 = new X.0UD
            r6.<init>(r10, r0)
            r0 = 8
            r5 = -1
            android.content.res.TypedArray r4 = r6.A02
            android.graphics.drawable.Drawable r14 = A00(r10, r4, r9, r0)
            r0 = 13
            android.graphics.drawable.Drawable r12 = A00(r10, r4, r9, r0)
            r0 = 9
            android.graphics.drawable.Drawable r13 = A00(r10, r4, r9, r0)
            r0 = 6
            android.graphics.drawable.Drawable r7 = A00(r10, r4, r9, r0)
            r0 = 10
            android.graphics.drawable.Drawable r1 = A00(r10, r4, r9, r0)
            r0 = 7
            android.graphics.drawable.Drawable r2 = A00(r10, r4, r9, r0)
            r10 = 3
            r9 = 1
            r3 = 2
            if (r1 != 0) goto L_0x038f
            if (r2 != 0) goto L_0x038f
            if (r14 != 0) goto L_0x0302
            if (r12 != 0) goto L_0x0302
            if (r13 != 0) goto L_0x0302
            if (r7 == 0) goto L_0x0325
        L_0x0302:
            android.graphics.drawable.Drawable[] r2 = r11.getCompoundDrawablesRelative()
            r1 = r2[r8]
            if (r1 != 0) goto L_0x0381
            r0 = r2[r3]
            if (r0 != 0) goto L_0x0381
            android.graphics.drawable.Drawable[] r0 = r11.getCompoundDrawables()
            if (r14 != 0) goto L_0x0316
            r14 = r0[r8]
        L_0x0316:
            if (r12 != 0) goto L_0x031a
            r12 = r0[r9]
        L_0x031a:
            if (r13 != 0) goto L_0x031e
            r13 = r0[r3]
        L_0x031e:
            if (r7 != 0) goto L_0x0322
            r7 = r0[r10]
        L_0x0322:
            r11.setCompoundDrawablesWithIntrinsicBounds(r14, r12, r13, r7)
        L_0x0325:
            r1 = 11
            boolean r0 = r4.hasValue(r1)
            if (r0 == 0) goto L_0x0334
            android.content.res.ColorStateList r0 = r6.A01(r1)
            X.AnonymousClass0Y9.A01(r0, r11)
        L_0x0334:
            r0 = 12
            boolean r0 = r4.hasValue(r0)
            if (r0 == 0) goto L_0x034a
            r0 = 12
            int r1 = r4.getInt(r0, r5)
            r0 = 0
            android.graphics.PorterDuff$Mode r0 = X.AnonymousClass0XA.A00(r0, r1)
            X.AnonymousClass0Y9.A02(r0, r11)
        L_0x034a:
            r0 = 14
            int r3 = r4.getDimensionPixelSize(r0, r5)
            r0 = 17
            int r1 = r4.getDimensionPixelSize(r0, r5)
            r0 = 18
            int r2 = r4.getDimensionPixelSize(r0, r5)
            r4.recycle()
            if (r3 == r5) goto L_0x0364
            X.AnonymousClass0Y9.A04(r11, r3)
        L_0x0364:
            if (r1 == r5) goto L_0x0369
            X.AnonymousClass0Y9.A05(r11, r1)
        L_0x0369:
            if (r2 == r5) goto L_0x0380
            X.C04890Rb.A00(r2)
            android.text.TextPaint r1 = r11.getPaint()
            r0 = 0
            int r0 = r1.getFontMetricsInt(r0)
            if (r2 == r0) goto L_0x0380
            int r2 = r2 - r0
            float r1 = (float) r2
            r0 = 1065353216(0x3f800000, float:1.0)
            r11.setLineSpacing(r1, r0)
        L_0x0380:
            return
        L_0x0381:
            if (r12 != 0) goto L_0x0385
            r12 = r2[r9]
        L_0x0385:
            r0 = r2[r3]
            if (r7 != 0) goto L_0x038b
            r7 = r2[r10]
        L_0x038b:
            r11.setCompoundDrawablesRelativeWithIntrinsicBounds(r1, r12, r0, r7)
            goto L_0x0325
        L_0x038f:
            android.graphics.drawable.Drawable[] r0 = r11.getCompoundDrawablesRelative()
            if (r1 != 0) goto L_0x0397
            r1 = r0[r8]
        L_0x0397:
            if (r12 != 0) goto L_0x039b
            r12 = r0[r9]
        L_0x039b:
            if (r2 != 0) goto L_0x039f
            r2 = r0[r3]
        L_0x039f:
            if (r7 != 0) goto L_0x03a3
            r7 = r0[r10]
        L_0x03a3:
            r11.setCompoundDrawablesRelativeWithIntrinsicBounds(r1, r12, r2, r7)
            goto L_0x0325
        L_0x03a8:
            r11.setAutoSizeTextTypeUniformWithPresetSizes(r1, r8)
            goto L_0x02c3
        L_0x03ad:
            r4.A03 = r8
            goto L_0x0298
        L_0x03b1:
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L_0x022a
        L_0x03b5:
            r7 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L_0x021f
        L_0x03b9:
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L_0x0214
        L_0x03bd:
            r0 = 44
            int r0 = r3.indexOf(r0)
            java.lang.String r0 = r3.substring(r8, r0)
            java.util.Locale r0 = java.util.Locale.forLanguageTag(r0)
            r11.setTextLocale(r0)
            goto L_0x01d8
        L_0x03d0:
            r11.setTypeface(r4)
            goto L_0x01c6
        L_0x03d5:
            r0 = 23
            goto L_0x013e
        L_0x03d9:
            r2 = 0
            goto L_0x0116
        L_0x03dc:
            r3 = 0
            goto L_0x0106
        L_0x03df:
            r5 = 0
            goto L_0x00eb
        L_0x03e2:
            r6 = 0
            goto L_0x00e0
        L_0x03e5:
            r6 = 0
            r5 = 0
        L_0x03e7:
            r4 = 0
            goto L_0x00f6
        L_0x03ea:
            r16 = 0
            goto L_0x00ce
        L_0x03ee:
            r2 = 0
            r6 = 0
            r3 = 0
            r5 = 0
            r4 = 0
            r16 = 0
            goto L_0x0119
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0WJ.A0B(android.util.AttributeSet, int):void");
    }

    public void A0C(int[] iArr, int i) {
        AnonymousClass0XX r5 = this.A0C;
        if (!(r5.A09 instanceof AnonymousClass03A)) {
            int length = iArr.length;
            int i2 = 0;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics A0B2 = AnonymousClass000.A0B(r5.A08);
                    do {
                        iArr2[i2] = Math.round(TypedValue.applyDimension(i, (float) iArr[i2], A0B2));
                        i2++;
                    } while (i2 < length);
                }
                r5.A07 = AnonymousClass0XX.A02(iArr2);
                if (!r5.A08()) {
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("None of the preset sizes is valid: ");
                    throw AnonymousClass000.A0F(Arrays.toString(iArr), A0o);
                }
            } else {
                r5.A05 = false;
            }
            if (r5.A07()) {
                r5.A04();
            }
        }
    }

    public AnonymousClass0WJ(TextView textView) {
        this.A0B = textView;
        this.A0C = new AnonymousClass0XX(textView);
    }
}
