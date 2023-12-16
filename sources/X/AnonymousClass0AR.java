package X;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import android.view.animation.AnimationUtils;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: X.0AR  reason: invalid class name */
public class AnonymousClass0AR extends AnonymousClass01K implements Animatable {
    public Animator.AnimatorListener A00;
    public Context A01;
    public C001300y A02;
    public AnonymousClass00z A03;
    public ArrayList A04;
    public final Drawable.Callback A05;

    public AnonymousClass0AR(Context context) {
        this.A00 = null;
        this.A04 = null;
        this.A05 = new AnonymousClass0ZD(this);
        this.A01 = context;
        this.A02 = new C001300y();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:79:0x011d, code lost:
        if (r16 == 0) goto L_0x011f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x006f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.animation.PropertyValuesHolder A02(android.content.res.TypedArray r14, java.lang.String r15, int r16, int r17, int r18) {
        /*
            r3 = r16
            r10 = r17
            android.util.TypedValue r0 = r14.peekValue(r10)
            r5 = 1
            r4 = 0
            if (r0 == 0) goto L_0x0126
            r13 = 1
            int r11 = r0.type
        L_0x000f:
            r9 = r18
            android.util.TypedValue r0 = r14.peekValue(r9)
            if (r0 == 0) goto L_0x0122
            r12 = 1
            int r8 = r0.type
        L_0x001a:
            r0 = 4
            r1 = 3
            if (r3 != r0) goto L_0x011d
            if (r13 == 0) goto L_0x0026
            boolean r0 = A07(r11)
            if (r0 != 0) goto L_0x002e
        L_0x0026:
            if (r12 == 0) goto L_0x011b
            boolean r0 = A07(r8)
            if (r0 == 0) goto L_0x011b
        L_0x002e:
            r3 = 3
        L_0x002f:
            r2 = 0
        L_0x0030:
            r0 = 0
            r7 = 2
            if (r3 != r7) goto L_0x006f
            java.lang.String r8 = r14.getString(r10)
            java.lang.String r6 = r14.getString(r9)
            X.0Wm[] r3 = X.AnonymousClass0WW.A02(r8)
            X.0Wm[] r2 = X.AnonymousClass0WW.A02(r6)
            if (r3 != 0) goto L_0x0056
            if (r2 == 0) goto L_0x0055
            X.0Yn r1 = new X.0Yn
            r1.<init>()
            java.lang.Object[] r0 = new java.lang.Object[r5]
            r0[r4] = r2
        L_0x0051:
            android.animation.PropertyValuesHolder r0 = android.animation.PropertyValuesHolder.ofObject(r15, r1, r0)
        L_0x0055:
            return r0
        L_0x0056:
            X.0Yn r1 = new X.0Yn
            r1.<init>()
            if (r2 == 0) goto L_0x006a
            boolean r0 = X.AnonymousClass0WW.A01(r3, r2)
            if (r0 == 0) goto L_0x012a
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r4] = r3
            r0[r5] = r2
            goto L_0x0051
        L_0x006a:
            java.lang.Object[] r0 = new java.lang.Object[r5]
            r0[r4] = r3
            goto L_0x0051
        L_0x006f:
            if (r3 != r1) goto L_0x0118
            X.0Yo r3 = X.C06630Yo.A00
        L_0x0073:
            r6 = 5
            r1 = 0
            if (r2 == 0) goto L_0x00b8
            if (r13 == 0) goto L_0x00a8
            if (r11 != r6) goto L_0x00a3
            float r2 = r14.getDimension(r10, r1)
        L_0x007f:
            if (r12 == 0) goto L_0x009e
            if (r8 != r6) goto L_0x0099
            float r0 = r14.getDimension(r9, r1)
        L_0x0087:
            float[] r1 = new float[r7]
            r1[r4] = r2
            r1[r5] = r0
        L_0x008d:
            android.animation.PropertyValuesHolder r0 = android.animation.PropertyValuesHolder.ofFloat(r15, r1)
        L_0x0091:
            if (r0 == 0) goto L_0x0055
            if (r3 == 0) goto L_0x0055
            r0.setEvaluator(r3)
            return r0
        L_0x0099:
            float r0 = r14.getFloat(r9, r1)
            goto L_0x0087
        L_0x009e:
            float[] r1 = new float[r5]
            r1[r4] = r2
            goto L_0x008d
        L_0x00a3:
            float r2 = r14.getFloat(r10, r1)
            goto L_0x007f
        L_0x00a8:
            if (r8 != r6) goto L_0x00b3
            float r0 = r14.getDimension(r9, r1)
        L_0x00ae:
            float[] r1 = new float[r5]
            r1[r4] = r0
            goto L_0x008d
        L_0x00b3:
            float r0 = r14.getFloat(r9, r1)
            goto L_0x00ae
        L_0x00b8:
            if (r13 == 0) goto L_0x00fa
            if (r11 != r6) goto L_0x00ea
            float r0 = r14.getDimension(r10, r1)
            int r2 = (int) r0
        L_0x00c1:
            if (r12 == 0) goto L_0x00e5
            if (r8 != r6) goto L_0x00d5
            float r0 = r14.getDimension(r9, r1)
            int r0 = (int) r0
        L_0x00ca:
            int[] r1 = new int[r7]
            r1[r4] = r2
            r1[r5] = r0
        L_0x00d0:
            android.animation.PropertyValuesHolder r0 = android.animation.PropertyValuesHolder.ofInt(r15, r1)
            goto L_0x0091
        L_0x00d5:
            boolean r0 = A07(r8)
            if (r0 == 0) goto L_0x00e0
            int r0 = r14.getColor(r9, r4)
            goto L_0x00ca
        L_0x00e0:
            int r0 = r14.getInt(r9, r4)
            goto L_0x00ca
        L_0x00e5:
            int[] r1 = new int[r5]
            r1[r4] = r2
            goto L_0x00d0
        L_0x00ea:
            boolean r0 = A07(r11)
            if (r0 == 0) goto L_0x00f5
            int r2 = r14.getColor(r10, r4)
            goto L_0x00c1
        L_0x00f5:
            int r2 = r14.getInt(r10, r4)
            goto L_0x00c1
        L_0x00fa:
            if (r12 == 0) goto L_0x0055
            if (r8 != r6) goto L_0x0108
            float r0 = r14.getDimension(r9, r1)
            int r0 = (int) r0
        L_0x0103:
            int[] r1 = new int[r5]
            r1[r4] = r0
            goto L_0x00d0
        L_0x0108:
            boolean r0 = A07(r8)
            if (r0 == 0) goto L_0x0113
            int r0 = r14.getColor(r9, r4)
            goto L_0x0103
        L_0x0113:
            int r0 = r14.getInt(r9, r4)
            goto L_0x0103
        L_0x0118:
            r3 = r0
            goto L_0x0073
        L_0x011b:
            r3 = 0
            goto L_0x011f
        L_0x011d:
            if (r16 != 0) goto L_0x002f
        L_0x011f:
            r2 = 1
            goto L_0x0030
        L_0x0122:
            r12 = 0
            r8 = 0
            goto L_0x001a
        L_0x0126:
            r13 = 0
            r11 = 0
            goto L_0x000f
        L_0x012a:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = " Can't morph from "
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = " to "
            java.lang.String r1 = X.AnonymousClass000.A0V(r0, r6, r1)
            android.view.InflateException r0 = new android.view.InflateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0AR.A02(android.content.res.TypedArray, java.lang.String, int, int, int):android.animation.PropertyValuesHolder");
    }

    public static ValueAnimator A03(ValueAnimator valueAnimator, Context context, Resources.Theme theme, Resources resources, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int resourceId;
        String string;
        String string2;
        String string3;
        String string4;
        PropertyValuesHolder propertyValuesHolder;
        PropertyValuesHolder propertyValuesHolder2;
        boolean z;
        int i6;
        int i7;
        ValueAnimator valueAnimator2 = valueAnimator;
        Resources.Theme theme2 = theme;
        Resources resources2 = resources;
        AttributeSet attributeSet2 = attributeSet;
        TypedArray A012 = C05790Uy.A01(theme2, resources2, attributeSet2, AnonymousClass0KA.A02);
        TypedArray A013 = C05790Uy.A01(theme2, resources2, attributeSet2, AnonymousClass0KA.A05);
        if (valueAnimator == null) {
            valueAnimator2 = new ValueAnimator();
        }
        XmlPullParser xmlPullParser2 = xmlPullParser;
        if (!C05790Uy.A02("duration", xmlPullParser2)) {
            i = 300;
        } else {
            i = A012.getInt(1, 300);
        }
        long j = (long) i;
        if (!C05790Uy.A02("startOffset", xmlPullParser2)) {
            i2 = 0;
        } else {
            i2 = A012.getInt(2, 0);
        }
        long j2 = (long) i2;
        if (!C05790Uy.A02("valueType", xmlPullParser2)) {
            i3 = 4;
        } else {
            i3 = A012.getInt(7, 4);
        }
        if (C05790Uy.A02("valueFrom", xmlPullParser2) && C05790Uy.A02("valueTo", xmlPullParser2)) {
            if (i3 == 4) {
                TypedValue peekValue = A012.peekValue(5);
                boolean z2 = true;
                i3 = 0;
                if (peekValue != null) {
                    z = true;
                    i6 = peekValue.type;
                } else {
                    z = false;
                    i6 = 0;
                }
                TypedValue peekValue2 = A012.peekValue(6);
                if (peekValue2 != null) {
                    i7 = peekValue2.type;
                } else {
                    z2 = false;
                    i7 = 0;
                }
                if ((z && A07(i6)) || (z2 && A07(i7))) {
                    i3 = 3;
                }
            }
            PropertyValuesHolder A022 = A02(A012, "", i3, 5, 6);
            if (A022 != null) {
                valueAnimator2.setValues(new PropertyValuesHolder[]{A022});
            }
        }
        valueAnimator2.setDuration(j);
        valueAnimator2.setStartDelay(j2);
        if (!C05790Uy.A02("repeatCount", xmlPullParser2)) {
            i4 = 0;
        } else {
            i4 = A012.getInt(3, 0);
        }
        valueAnimator2.setRepeatCount(i4);
        if (!C05790Uy.A02("repeatMode", xmlPullParser2)) {
            i5 = 1;
        } else {
            i5 = A012.getInt(4, 1);
        }
        valueAnimator2.setRepeatMode(i5);
        if (A013 != null) {
            ObjectAnimator objectAnimator = (ObjectAnimator) valueAnimator2;
            if (!C05790Uy.A02("pathData", xmlPullParser2) || (string2 = A013.getString(1)) == null) {
                if (!C05790Uy.A02("propertyName", xmlPullParser2)) {
                    string = null;
                } else {
                    string = A013.getString(0);
                }
                objectAnimator.setPropertyName(string);
            } else {
                if (!C05790Uy.A02("propertyXName", xmlPullParser2)) {
                    string3 = null;
                } else {
                    string3 = A013.getString(2);
                }
                if (!C05790Uy.A02("propertyYName", xmlPullParser2)) {
                    string4 = null;
                } else {
                    string4 = A013.getString(3);
                }
                if (string3 == null && string4 == null) {
                    throw new InflateException(AnonymousClass000.A0X(" propertyXName or propertyYName is needed for PathData", AnonymousClass01K.A00(A013)));
                }
                Path A002 = AnonymousClass0WW.A00(string2);
                float f = 1.0f * 0.5f;
                PathMeasure pathMeasure = new PathMeasure(A002, false);
                ArrayList A0s = AnonymousClass001.A0s();
                float f2 = 0.0f;
                A0s.add(Float.valueOf(0.0f));
                float f3 = 0.0f;
                do {
                    f3 += pathMeasure.getLength();
                    A0s.add(Float.valueOf(f3));
                } while (pathMeasure.nextContour());
                PathMeasure pathMeasure2 = new PathMeasure(A002, false);
                int min = Math.min(100, ((int) (f3 / f)) + 1);
                float[] fArr = new float[min];
                float[] fArr2 = new float[min];
                float[] fArr3 = new float[2];
                float f4 = f3 / ((float) (min - 1));
                int i8 = 0;
                int i9 = 0;
                while (true) {
                    propertyValuesHolder = null;
                    if (i8 >= min) {
                        break;
                    }
                    pathMeasure2.getPosTan(f2 - AnonymousClass001.A05(A0s.get(i9)), fArr3, (float[]) null);
                    fArr[i8] = fArr3[0];
                    fArr2[i8] = fArr3[1];
                    f2 += f4;
                    int i10 = i9 + 1;
                    if (i10 < A0s.size() && f2 > AnonymousClass001.A05(A0s.get(i10))) {
                        pathMeasure2.nextContour();
                        i9 = i10;
                    }
                    i8++;
                }
                if (string3 != null) {
                    propertyValuesHolder2 = PropertyValuesHolder.ofFloat(string3, fArr);
                } else {
                    propertyValuesHolder2 = null;
                }
                if (string4 != null) {
                    propertyValuesHolder = PropertyValuesHolder.ofFloat(string4, fArr2);
                }
                objectAnimator.setValues(propertyValuesHolder2 == null ? new PropertyValuesHolder[]{propertyValuesHolder} : propertyValuesHolder == null ? new PropertyValuesHolder[]{propertyValuesHolder2} : new PropertyValuesHolder[]{propertyValuesHolder2, propertyValuesHolder});
            }
        }
        if (C05790Uy.A02("interpolator", xmlPullParser2) && (resourceId = A012.getResourceId(0, 0)) > 0) {
            valueAnimator2.setInterpolator(AnimationUtils.loadInterpolator(context, resourceId));
        }
        A012.recycle();
        if (A013 != null) {
            A013.recycle();
        }
        return valueAnimator2;
    }

    public static AnonymousClass0AR A04(Context context, int i) {
        int next;
        if (Build.VERSION.SDK_INT >= 24) {
            AnonymousClass0AR r2 = new AnonymousClass0AR(context);
            Drawable A002 = C02680He.A00(context.getTheme(), context.getResources(), i);
            r2.A00 = A002;
            A002.setCallback(r2.A05);
            r2.A03 = new AnonymousClass00z(r2.A00.getConstantState());
            return r2;
        }
        try {
            XmlResourceParser xml = context.getResources().getXml(i);
            AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
            do {
                next = xml.next();
                if (next == 2) {
                    Resources resources = context.getResources();
                    Resources.Theme theme = context.getTheme();
                    AnonymousClass0AR r0 = new AnonymousClass0AR(context);
                    r0.inflate(resources, xml, asAttributeSet, theme);
                    return r0;
                }
            } while (next != 1);
            throw new XmlPullParserException("No start tag found");
        } catch (IOException | XmlPullParserException e) {
            Log.e("AnimatedVDCompat", "parser error", e);
            return null;
        }
    }

    public static boolean A07(int i) {
        if (i < 28 || i > 31) {
            return false;
        }
        return true;
    }

    public void A08() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).clearAnimationCallbacks();
            return;
        }
        Animator.AnimatorListener animatorListener = this.A00;
        if (animatorListener != null) {
            this.A02.A00.removeListener(animatorListener);
            this.A00 = null;
        }
        ArrayList arrayList = this.A04;
        if (arrayList != null) {
            arrayList.clear();
        }
    }

    public void A09(AnonymousClass0P5 r3) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            A05((AnimatedVectorDrawable) drawable, r3);
        } else if (r3 != null) {
            ArrayList arrayList = this.A04;
            if (arrayList == null) {
                arrayList = AnonymousClass001.A0s();
                this.A04 = arrayList;
            }
            if (!arrayList.contains(r3)) {
                this.A04.add(r3);
                Animator.AnimatorListener animatorListener = this.A00;
                if (animatorListener == null) {
                    animatorListener = new C17440va(this, 2);
                    this.A00 = animatorListener;
                }
                this.A02.A00.addListener(animatorListener);
            }
        }
    }

    public void A0A(AnonymousClass0P5 r3) {
        Animator.AnimatorListener animatorListener;
        Drawable drawable = this.A00;
        if (drawable != null) {
            A06((AnimatedVectorDrawable) drawable, r3);
        }
        ArrayList arrayList = this.A04;
        if (arrayList != null && r3 != null) {
            arrayList.remove(r3);
            if (this.A04.size() == 0 && (animatorListener = this.A00) != null) {
                this.A02.A00.removeListener(animatorListener);
                this.A00 = null;
            }
        }
    }

    public boolean canApplyTheme() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            return AnonymousClass0YG.A08(drawable);
        }
        return false;
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        C001300y r1 = this.A02;
        r1.A02.draw(canvas);
        if (r1.A00.isStarted()) {
            invalidateSelf();
        }
    }

    public int getAlpha() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            return AnonymousClass0X1.A00(drawable);
        }
        return this.A02.A02.getAlpha();
    }

    public int getChangingConfigurations() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations();
    }

    public ColorFilter getColorFilter() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            return AnonymousClass0YG.A00(drawable);
        }
        return this.A02.A02.getColorFilter();
    }

    public Drawable.ConstantState getConstantState() {
        Drawable drawable = this.A00;
        if (drawable == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new AnonymousClass00z(drawable.getConstantState());
    }

    public int getIntrinsicHeight() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return this.A02.A02.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return this.A02.A02.getIntrinsicWidth();
    }

    public int getOpacity() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return this.A02.A02.getOpacity();
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray obtainAttributes;
        Resources.NotFoundException notFoundException;
        Animator A012;
        Drawable drawable = this.A00;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        AttributeSet attributeSet2 = attributeSet;
        Resources.Theme theme2 = theme;
        Resources resources2 = resources;
        if (drawable != null) {
            AnonymousClass0YG.A02(theme2, resources2, drawable, attributeSet2, xmlPullParser2);
            return;
        }
        int eventType = xmlPullParser2.getEventType();
        int depth = xmlPullParser2.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser2.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser2.getName();
                if ("animated-vector".equals(name)) {
                    obtainAttributes = C05790Uy.A01(theme2, resources2, attributeSet2, AnonymousClass0KA.A00);
                    int resourceId = obtainAttributes.getResourceId(0, 0);
                    if (resourceId != 0) {
                        AnonymousClass0AQ A032 = AnonymousClass0AQ.A03(theme2, resources2, resourceId);
                        A032.A04 = false;
                        A032.setCallback(this.A05);
                        C001300y r2 = this.A02;
                        AnonymousClass0AQ r1 = r2.A02;
                        if (r1 != null) {
                            r1.setCallback((Drawable.Callback) null);
                        }
                        r2.A02 = A032;
                    }
                } else if ("target".equals(name)) {
                    obtainAttributes = resources2.obtainAttributes(attributeSet2, AnonymousClass0KA.A01);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.A01;
                        if (context != null) {
                            if (Build.VERSION.SDK_INT >= 24) {
                                A012 = AnimatorInflater.loadAnimator(context, resourceId2);
                            } else {
                                Resources resources3 = context.getResources();
                                Resources.Theme theme3 = context.getTheme();
                                XmlResourceParser xmlResourceParser = null;
                                try {
                                    XmlResourceParser animation = resources3.getAnimation(resourceId2);
                                    A012 = A01((AnimatorSet) null, context, theme3, resources3, Xml.asAttributeSet(animation), animation, 0);
                                    if (animation != null) {
                                        animation.close();
                                    }
                                } catch (XmlPullParserException e) {
                                    e = e;
                                    StringBuilder A0o = AnonymousClass001.A0o();
                                    AnonymousClass000.A1G("Can't load animation resource ID #0x", A0o, resourceId2);
                                    notFoundException = new Resources.NotFoundException(A0o.toString());
                                } catch (IOException e2) {
                                    e = e2;
                                    StringBuilder A0o2 = AnonymousClass001.A0o();
                                    AnonymousClass000.A1G("Can't load animation resource ID #0x", A0o2, resourceId2);
                                    notFoundException = new Resources.NotFoundException(A0o2.toString());
                                } catch (Throwable th) {
                                    if (xmlResourceParser != null) {
                                        xmlResourceParser.close();
                                    }
                                    throw th;
                                }
                            }
                            C001300y r12 = this.A02;
                            A012.setTarget(r12.A02.A03.A08.A0E.get(string));
                            ArrayList arrayList = r12.A03;
                            if (arrayList == null) {
                                arrayList = AnonymousClass001.A0s();
                                r12.A03 = arrayList;
                                r12.A01 = new AnonymousClass05C();
                            }
                            arrayList.add(A012);
                            r12.A01.put(A012, string);
                        } else {
                            obtainAttributes.recycle();
                            throw AnonymousClass001.A0e("Context can't be null when inflating animators");
                        }
                    }
                } else {
                    continue;
                }
                obtainAttributes.recycle();
            }
            eventType = xmlPullParser2.next();
        }
        C001300y r0 = this.A02;
        AnimatorSet animatorSet = r0.A00;
        if (animatorSet == null) {
            animatorSet = new AnimatorSet();
            r0.A00 = animatorSet;
        }
        animatorSet.playTogether(r0.A03);
        return;
        notFoundException.initCause(e);
        throw notFoundException;
    }

    public boolean isAutoMirrored() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            return AnonymousClass0X1.A04(drawable);
        }
        return this.A02.A02.isAutoMirrored();
    }

    public boolean isRunning() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            return ((AnimatedVectorDrawable) drawable).isRunning();
        }
        return this.A02.A00.isRunning();
    }

    public boolean isStateful() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return this.A02.A02.isStateful();
    }

    public Drawable mutate() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.A00;
        if (drawable == null) {
            drawable = this.A02.A02;
        }
        drawable.setBounds(rect);
    }

    public boolean onLevelChange(int i) {
        Drawable drawable = this.A00;
        if (drawable == null) {
            drawable = this.A02.A02;
        }
        return drawable.setLevel(i);
    }

    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        return this.A02.A02.setState(iArr);
    }

    public void setAlpha(int i) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.A02.A02.setAlpha(i);
        }
    }

    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            AnonymousClass0X1.A03(drawable, z);
        } else {
            this.A02.A02.setAutoMirrored(z);
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.A02.A02.setColorFilter(colorFilter);
        }
    }

    public void setTint(int i) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            AnonymousClass0YG.A06(drawable, i);
        } else {
            this.A02.A02.setTint(i);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            AnonymousClass0YG.A01(colorStateList, drawable);
        } else {
            this.A02.A02.setTintList(colorStateList);
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            AnonymousClass0YG.A04(mode, drawable);
        } else {
            this.A02.A02.setTintMode(mode);
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.A02.A02.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    public void start() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        C001300y r1 = this.A02;
        if (!r1.A00.isStarted()) {
            r1.A00.start();
            invalidateSelf();
        }
    }

    public void stop() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.A02.A00.end();
        }
    }

    public static void A05(AnimatedVectorDrawable animatedVectorDrawable, AnonymousClass0P5 r2) {
        animatedVectorDrawable.registerAnimationCallback(r2.A00());
    }

    public static void A06(AnimatedVectorDrawable animatedVectorDrawable, AnonymousClass0P5 r2) {
        animatedVectorDrawable.unregisterAnimationCallback(r2.A00());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v0, resolved type: android.animation.Animator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: android.animation.Animator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v2, resolved type: android.animation.Animator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: android.animation.Animator[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: android.animation.PropertyValuesHolder[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: android.animation.Animator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v12, resolved type: android.animation.AnimatorSet} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: android.animation.Animator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v5, resolved type: android.animation.Animator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v6, resolved type: android.animation.Animator} */
    /* JADX WARNING: type inference failed for: r3v13, types: [android.animation.ValueAnimator] */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01c9, code lost:
        if (r6 == null) goto L_0x0154;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x02ec, code lost:
        if (r1 == null) goto L_0x02ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x02ee, code lost:
        r1 = A02(r19, r9, r18, 0, 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x02f6, code lost:
        if (r1 == null) goto L_0x02e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0160, code lost:
        if (A07(r6.type) != false) goto L_0x0162;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0202  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0213  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0221  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x02d6  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x02dd  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x02ec  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x02fb  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0189  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.animation.Animator A01(android.animation.AnimatorSet r26, android.content.Context r27, android.content.res.Resources.Theme r28, android.content.res.Resources r29, android.util.AttributeSet r30, org.xmlpull.v1.XmlPullParser r31, int r32) {
        /*
            r25 = 1065353216(0x3f800000, float:1.0)
            r12 = r31
            int r24 = r12.getDepth()
            r13 = 0
            r23 = r13
        L_0x000b:
            int r1 = r12.next()
            r0 = 3
            r11 = 0
            if (r1 != r0) goto L_0x001c
            int r1 = r12.getDepth()
            r0 = r24
            if (r1 <= r0) goto L_0x032f
            goto L_0x000b
        L_0x001c:
            r0 = 1
            if (r1 == r0) goto L_0x032f
            r0 = 2
            if (r1 != r0) goto L_0x000b
            java.lang.String r1 = r12.getName()
            java.lang.String r0 = "objectAnimator"
            boolean r0 = r1.equals(r0)
            r3 = r30
            if (r0 == 0) goto L_0x0051
            android.animation.ObjectAnimator r13 = new android.animation.ObjectAnimator
            r13.<init>()
            r4 = r27
            r5 = r28
            r6 = r29
            r7 = r3
            r3 = r13
            r8 = r12
            A03(r3, r4, r5, r6, r7, r8)
        L_0x0041:
            if (r26 == 0) goto L_0x000b
            if (r11 != 0) goto L_0x000b
            if (r23 != 0) goto L_0x004b
            java.util.ArrayList r23 = X.AnonymousClass001.A0s()
        L_0x004b:
            r0 = r23
            r0.add(r13)
            goto L_0x000b
        L_0x0051:
            java.lang.String r0 = "animator"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0067
            r4 = 0
            r5 = r27
            r6 = r28
            r7 = r29
            r8 = r3
            r9 = r12
            android.animation.ValueAnimator r13 = A03(r4, r5, r6, r7, r8, r9)
            goto L_0x0041
        L_0x0067:
            java.lang.String r0 = "set"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x009c
            android.animation.AnimatorSet r13 = new android.animation.AnimatorSet
            r13.<init>()
            int[] r2 = X.AnonymousClass0KA.A03
            r1 = r28
            r0 = r29
            android.content.res.TypedArray r1 = X.C05790Uy.A01(r1, r0, r3, r2)
            java.lang.String r0 = "ordering"
            boolean r0 = X.C05790Uy.A02(r0, r12)
            if (r0 != 0) goto L_0x0097
            r9 = 0
        L_0x0087:
            r4 = r27
            r5 = r28
            r6 = r29
            r7 = r3
            r3 = r13
            r8 = r12
            A01(r3, r4, r5, r6, r7, r8, r9)
            r1.recycle()
            goto L_0x0041
        L_0x0097:
            int r9 = r1.getInt(r11, r11)
            goto L_0x0087
        L_0x009c:
            java.lang.String r22 = "propertyValuesHolder"
            r0 = r22
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0319
            android.util.AttributeSet r21 = android.util.Xml.asAttributeSet(r12)
            r20 = 0
            r14 = r20
        L_0x00ae:
            int r0 = r12.getEventType()
            r3 = 0
            r4 = 3
            if (r0 == r4) goto L_0x02f9
            r10 = 1
            if (r0 == r10) goto L_0x02f9
            r2 = 2
            if (r0 == r2) goto L_0x00c0
            r12.next()
            goto L_0x00ae
        L_0x00c0:
            java.lang.String r1 = r12.getName()
            r0 = r22
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x02e7
            int[] r5 = X.AnonymousClass0KA.A06
            r3 = r28
            r1 = r29
            r0 = r21
            android.content.res.TypedArray r19 = X.C05790Uy.A01(r3, r1, r0, r5)
            java.lang.String r0 = "propertyName"
            boolean r0 = X.C05790Uy.A02(r0, r12)
            if (r0 != 0) goto L_0x01da
            r9 = 0
        L_0x00e1:
            java.lang.String r0 = "valueType"
            r1 = 4
            boolean r0 = X.C05790Uy.A02(r0, r12)
            if (r0 != 0) goto L_0x01d2
            r18 = 4
        L_0x00ec:
            r8 = r18
            r2 = r20
        L_0x00f0:
            int r0 = r12.next()
            r7 = 3
            if (r0 == r7) goto L_0x01e2
            if (r0 == r10) goto L_0x01e2
            java.lang.String r1 = r12.getName()
            java.lang.String r0 = "keyframe"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00f0
            r0 = 4
            if (r8 != r0) goto L_0x0131
            android.util.AttributeSet r4 = android.util.Xml.asAttributeSet(r12)
            int[] r3 = X.AnonymousClass0KA.A04
            r1 = r28
            r0 = r29
            android.content.res.TypedArray r1 = X.C05790Uy.A01(r1, r0, r4, r3)
            java.lang.String r0 = "value"
            r8 = 0
            boolean r0 = X.C05790Uy.A02(r0, r12)
            if (r0 == 0) goto L_0x012e
            android.util.TypedValue r0 = r1.peekValue(r11)
            if (r0 == 0) goto L_0x012e
            int r0 = r0.type
            boolean r0 = A07(r0)
            if (r0 == 0) goto L_0x012e
            r8 = 3
        L_0x012e:
            r1.recycle()
        L_0x0131:
            android.util.AttributeSet r4 = android.util.Xml.asAttributeSet(r12)
            int[] r3 = X.AnonymousClass0KA.A04
            r1 = r28
            r0 = r29
            android.content.res.TypedArray r3 = X.C05790Uy.A01(r1, r0, r4, r3)
            java.lang.String r0 = "fraction"
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            boolean r0 = X.C05790Uy.A02(r0, r12)
            if (r0 != 0) goto L_0x01cc
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x014b:
            java.lang.String r5 = "value"
            boolean r0 = X.C05790Uy.A02(r5, r12)
            if (r0 != 0) goto L_0x01c4
            r6 = 0
        L_0x0154:
            r1 = 0
        L_0x0155:
            r0 = 4
            if (r8 != r0) goto L_0x019c
            if (r1 == 0) goto L_0x01bf
            int r0 = r6.type
            boolean r0 = A07(r0)
            if (r0 == 0) goto L_0x01a6
        L_0x0162:
            boolean r0 = X.C05790Uy.A02(r5, r12)
            if (r0 != 0) goto L_0x0197
            r0 = 0
        L_0x0169:
            android.animation.Keyframe r4 = android.animation.Keyframe.ofInt(r4, r0)
        L_0x016d:
            java.lang.String r0 = "interpolator"
            boolean r0 = X.C05790Uy.A02(r0, r12)
            if (r0 == 0) goto L_0x0184
            int r1 = r3.getResourceId(r10, r11)
            if (r1 <= 0) goto L_0x0184
            r0 = r27
            android.view.animation.Interpolator r0 = android.view.animation.AnimationUtils.loadInterpolator(r0, r1)
            r4.setInterpolator(r0)
        L_0x0184:
            r3.recycle()
            if (r4 == 0) goto L_0x0192
            if (r2 != 0) goto L_0x018f
            java.util.ArrayList r2 = X.AnonymousClass001.A0s()
        L_0x018f:
            r2.add(r4)
        L_0x0192:
            r12.next()
            goto L_0x00f0
        L_0x0197:
            int r0 = r3.getInt(r11, r11)
            goto L_0x0169
        L_0x019c:
            if (r1 == 0) goto L_0x01b8
            if (r8 == 0) goto L_0x01a6
            if (r8 == r10) goto L_0x0162
            if (r8 == r7) goto L_0x0162
            r4 = 0
            goto L_0x016d
        L_0x01a6:
            r1 = 0
            boolean r0 = X.C05790Uy.A02(r5, r12)
            if (r0 != 0) goto L_0x01b3
            r0 = 0
        L_0x01ae:
            android.animation.Keyframe r4 = android.animation.Keyframe.ofFloat(r4, r0)
            goto L_0x016d
        L_0x01b3:
            float r0 = r3.getFloat(r11, r1)
            goto L_0x01ae
        L_0x01b8:
            if (r8 == 0) goto L_0x01bf
            android.animation.Keyframe r4 = android.animation.Keyframe.ofInt(r4)
            goto L_0x016d
        L_0x01bf:
            android.animation.Keyframe r4 = android.animation.Keyframe.ofFloat(r4)
            goto L_0x016d
        L_0x01c4:
            android.util.TypedValue r6 = r3.peekValue(r11)
            r1 = 1
            if (r6 != 0) goto L_0x0155
            goto L_0x0154
        L_0x01cc:
            float r4 = r3.getFloat(r7, r1)
            goto L_0x014b
        L_0x01d2:
            r0 = r19
            int r18 = r0.getInt(r2, r1)
            goto L_0x00ec
        L_0x01da:
            r0 = r19
            java.lang.String r9 = r0.getString(r4)
            goto L_0x00e1
        L_0x01e2:
            if (r2 == 0) goto L_0x02ee
            int r6 = r2.size()
            if (r6 <= 0) goto L_0x02ee
            r5 = 0
            java.lang.Object r3 = r2.get(r11)
            android.animation.Keyframe r3 = (android.animation.Keyframe) r3
            int r0 = r6 + -1
            java.lang.Object r1 = r2.get(r0)
            android.animation.Keyframe r1 = (android.animation.Keyframe) r1
            float r15 = r1.getFraction()
            r4 = 0
            int r0 = (r15 > r25 ? 1 : (r15 == r25 ? 0 : -1))
            if (r0 >= 0) goto L_0x020b
            int r0 = (r15 > r4 ? 1 : (r15 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x02a5
            r0 = r25
            r1.setFraction(r0)
        L_0x020b:
            float r1 = r3.getFraction()
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x021a
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x0281
            r3.setFraction(r4)
        L_0x021a:
            android.animation.Keyframe[] r3 = new android.animation.Keyframe[r6]
            r2.toArray(r3)
        L_0x021f:
            if (r5 >= r6) goto L_0x02d0
            r2 = r3[r5]
            float r0 = r2.getFraction()
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x0230
            if (r5 != 0) goto L_0x0233
            r2.setFraction(r4)
        L_0x0230:
            int r5 = r5 + 1
            goto L_0x021f
        L_0x0233:
            int r1 = r6 + -1
            if (r5 != r1) goto L_0x023d
            r0 = r25
            r2.setFraction(r0)
            goto L_0x0230
        L_0x023d:
            int r0 = r5 + 1
            r15 = r5
        L_0x0240:
            if (r0 >= r1) goto L_0x0251
            r2 = r3[r0]
            float r2 = r2.getFraction()
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 >= 0) goto L_0x0251
            int r2 = r0 + 1
            r15 = r0
            r0 = r2
            goto L_0x0240
        L_0x0251:
            int r0 = r15 + 1
            r0 = r3[r0]
            float r17 = r0.getFraction()
            int r0 = r5 + -1
            r0 = r3[r0]
            float r0 = r0.getFraction()
            float r17 = r17 - r0
            r2 = r5
            int r0 = r15 - r5
            int r0 = r0 + 2
            float r0 = (float) r0
            float r17 = r17 / r0
        L_0x026b:
            if (r2 > r15) goto L_0x0230
            r16 = r3[r2]
            int r0 = r2 + -1
            r0 = r3[r0]
            float r1 = r0.getFraction()
            float r1 = r1 + r17
            r0 = r16
            r0.setFraction(r1)
            int r2 = r2 + 1
            goto L_0x026b
        L_0x0281:
            java.lang.Class r1 = r3.getType()
            java.lang.Class r0 = java.lang.Float.TYPE
            if (r1 != r0) goto L_0x0293
            android.animation.Keyframe r0 = android.animation.Keyframe.ofFloat(r4)
        L_0x028d:
            r2.add(r11, r0)
            int r6 = r6 + 1
            goto L_0x021a
        L_0x0293:
            java.lang.Class r1 = r3.getType()
            java.lang.Class r0 = java.lang.Integer.TYPE
            if (r1 != r0) goto L_0x02a0
            android.animation.Keyframe r0 = android.animation.Keyframe.ofInt(r4)
            goto L_0x028d
        L_0x02a0:
            android.animation.Keyframe r0 = android.animation.Keyframe.ofObject(r4)
            goto L_0x028d
        L_0x02a5:
            int r16 = r2.size()
            java.lang.Class r0 = r1.getType()
            java.lang.Class r15 = java.lang.Float.TYPE
            if (r0 != r15) goto L_0x02be
            android.animation.Keyframe r1 = android.animation.Keyframe.ofFloat(r25)
        L_0x02b5:
            r0 = r16
            r2.add(r0, r1)
            int r6 = r6 + 1
            goto L_0x020b
        L_0x02be:
            java.lang.Class r1 = r1.getType()
            java.lang.Class r0 = java.lang.Integer.TYPE
            if (r1 != r0) goto L_0x02cb
            android.animation.Keyframe r1 = android.animation.Keyframe.ofInt(r25)
            goto L_0x02b5
        L_0x02cb:
            android.animation.Keyframe r1 = android.animation.Keyframe.ofObject(r25)
            goto L_0x02b5
        L_0x02d0:
            android.animation.PropertyValuesHolder r1 = android.animation.PropertyValuesHolder.ofKeyframe(r9, r3)
            if (r8 != r7) goto L_0x02ec
            X.0Yo r0 = X.C06630Yo.A00
            r1.setEvaluator(r0)
        L_0x02db:
            if (r14 != 0) goto L_0x02e1
            java.util.ArrayList r14 = X.AnonymousClass001.A0s()
        L_0x02e1:
            r14.add(r1)
        L_0x02e4:
            r19.recycle()
        L_0x02e7:
            r12.next()
            goto L_0x00ae
        L_0x02ec:
            if (r1 != 0) goto L_0x02db
        L_0x02ee:
            r1 = r18
            r0 = r19
            android.animation.PropertyValuesHolder r1 = A02(r0, r9, r1, r11, r10)
            if (r1 == 0) goto L_0x02e4
            goto L_0x02db
        L_0x02f9:
            if (r14 == 0) goto L_0x0316
            int r2 = r14.size()
            android.animation.PropertyValuesHolder[] r1 = new android.animation.PropertyValuesHolder[r2]
        L_0x0301:
            if (r3 >= r2) goto L_0x030c
            java.lang.Object r0 = r14.get(r3)
            r1[r3] = r0
            int r3 = r3 + 1
            goto L_0x0301
        L_0x030c:
            boolean r0 = r13 instanceof android.animation.ValueAnimator
            if (r0 == 0) goto L_0x0316
            r0 = r13
            android.animation.ValueAnimator r0 = (android.animation.ValueAnimator) r0
            r0.setValues(r1)
        L_0x0316:
            r11 = 1
            goto L_0x0041
        L_0x0319:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Unknown animator name: "
            r1.append(r0)
            java.lang.String r0 = r12.getName()
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)
            java.lang.RuntimeException r0 = X.AnonymousClass002.A0E(r0)
            throw r0
        L_0x032f:
            if (r26 == 0) goto L_0x0354
            if (r23 == 0) goto L_0x0354
            int r0 = r23.size()
            android.animation.Animator[] r3 = new android.animation.Animator[r0]
            java.util.Iterator r2 = r23.iterator()
        L_0x033d:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x034d
            java.lang.Object r1 = r2.next()
            int r0 = r11 + 1
            r3[r11] = r1
            r11 = r0
            goto L_0x033d
        L_0x034d:
            r0 = r26
            if (r32 != 0) goto L_0x0355
            r0.playTogether(r3)
        L_0x0354:
            return r13
        L_0x0355:
            r0.playSequentially(r3)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0AR.A01(android.animation.AnimatorSet, android.content.Context, android.content.res.Resources$Theme, android.content.res.Resources, android.util.AttributeSet, org.xmlpull.v1.XmlPullParser, int):android.animation.Animator");
    }

    public AnonymousClass0AR() {
        this.A00 = null;
        this.A04 = null;
        this.A05 = new AnonymousClass0ZD(this);
        this.A01 = null;
        this.A02 = new C001300y();
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, (Resources.Theme) null);
    }
}
