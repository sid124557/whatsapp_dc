package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.0XX  reason: invalid class name */
public class AnonymousClass0XX {
    public static ConcurrentHashMap A0B = new ConcurrentHashMap();
    public static ConcurrentHashMap A0C = new ConcurrentHashMap();
    public static final RectF A0D = AnonymousClass002.A07();
    public float A00 = -1.0f;
    public float A01 = -1.0f;
    public float A02 = -1.0f;
    public int A03 = 0;
    public TextPaint A04;
    public boolean A05 = false;
    public boolean A06 = false;
    public int[] A07 = new int[0];
    public final Context A08;
    public final TextView A09;
    public final AnonymousClass0O2 A0A;

    public static final int[] A02(int[] iArr) {
        int length = iArr.length;
        if (length != 0) {
            Arrays.sort(iArr);
            ArrayList A0s = AnonymousClass001.A0s();
            int i = 0;
            do {
                int i2 = iArr[i];
                if (i2 > 0 && Collections.binarySearch(A0s, Integer.valueOf(i2)) < 0) {
                    A0s.add(Integer.valueOf(i2));
                }
                i++;
            } while (i < length);
            if (length != A0s.size()) {
                int size = A0s.size();
                int[] iArr2 = new int[size];
                for (int i3 = 0; i3 < size; i3++) {
                    iArr2[i3] = AnonymousClass001.A0K(A0s.get(i3));
                }
                return iArr2;
            }
        }
        return iArr;
    }

    public static Method A01(String str) {
        try {
            ConcurrentHashMap concurrentHashMap = A0C;
            Method method = (Method) concurrentHashMap.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                method.setAccessible(true);
                concurrentHashMap.put(str, method);
            }
            return method;
        } catch (Exception e) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("Failed to retrieve TextView#");
            A0o.append(str);
            Log.w("ACTVAutoSizeHelper", AnonymousClass000.A0X("() method", A0o), e);
            return null;
        }
    }

    public void A04() {
        int measuredWidth;
        StaticLayout staticLayout;
        CharSequence transformation;
        TextView textView = this.A09;
        if ((!(textView instanceof AnonymousClass03A)) && this.A03 != 0) {
            if (this.A06) {
                if (textView.getMeasuredHeight() > 0 && textView.getMeasuredWidth() > 0) {
                    if (this.A0A.A01(textView)) {
                        measuredWidth = 1048576;
                    } else {
                        measuredWidth = (textView.getMeasuredWidth() - textView.getTotalPaddingLeft()) - textView.getTotalPaddingRight();
                    }
                    int height = (textView.getHeight() - textView.getCompoundPaddingBottom()) - textView.getCompoundPaddingTop();
                    if (measuredWidth > 0 && height > 0) {
                        RectF rectF = A0D;
                        synchronized (rectF) {
                            rectF.setEmpty();
                            rectF.right = (float) measuredWidth;
                            rectF.bottom = (float) height;
                            int length = this.A07.length;
                            if (length != 0) {
                                int i = 1;
                                int i2 = length - 1;
                                int i3 = 0;
                                while (i <= i2) {
                                    int i4 = (i + i2) / 2;
                                    int i5 = this.A07[i4];
                                    CharSequence text = textView.getText();
                                    TransformationMethod transformationMethod = textView.getTransformationMethod();
                                    if (!(transformationMethod == null || (transformation = transformationMethod.getTransformation(text, textView)) == null)) {
                                        text = transformation;
                                    }
                                    int maxLines = textView.getMaxLines();
                                    TextPaint textPaint = this.A04;
                                    if (textPaint == null) {
                                        this.A04 = new TextPaint();
                                    } else {
                                        textPaint.reset();
                                    }
                                    this.A04.set(textView.getPaint());
                                    this.A04.setTextSize((float) i5);
                                    Layout.Alignment alignment = (Layout.Alignment) A00(textView, Layout.Alignment.ALIGN_NORMAL, "getLayoutAlignment");
                                    int round = Math.round(rectF.right);
                                    if (Build.VERSION.SDK_INT >= 23) {
                                        staticLayout = A03(alignment, text, round, maxLines);
                                    } else {
                                        staticLayout = new StaticLayout(text, this.A04, round, alignment, textView.getLineSpacingMultiplier(), textView.getLineSpacingExtra(), textView.getIncludeFontPadding());
                                    }
                                    if (maxLines != -1) {
                                        if (staticLayout.getLineCount() <= maxLines) {
                                            if (staticLayout.getLineEnd(staticLayout.getLineCount() - 1) != text.length()) {
                                            }
                                        }
                                        i3 = i4 - 1;
                                        i2 = i3;
                                    }
                                    if (((float) staticLayout.getHeight()) <= rectF.bottom) {
                                        int i6 = i4 + 1;
                                        i3 = i;
                                        i = i6;
                                    }
                                    i3 = i4 - 1;
                                    i2 = i3;
                                }
                                float f = (float) this.A07[i3];
                                if (f != textView.getTextSize()) {
                                    A06(0, f);
                                }
                            } else {
                                throw AnonymousClass001.A0e("No available text sizes to choose from.");
                            }
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.A06 = true;
        }
    }

    public final void A05(float f, float f2, float f3) {
        if (f <= 0.0f) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("Minimum auto-size text size (");
            A0o.append(f);
            throw AnonymousClass000.A0F("px) is less or equal to (0px)", A0o);
        } else if (f2 <= f) {
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append("Maximum auto-size text size (");
            A0o2.append(f2);
            A0o2.append("px) is less or equal to minimum auto-size text size (");
            A0o2.append(f);
            throw AnonymousClass000.A0F("px)", A0o2);
        } else if (f3 > 0.0f) {
            this.A03 = 1;
            this.A01 = f;
            this.A00 = f2;
            this.A02 = f3;
            this.A05 = false;
        } else {
            StringBuilder A0o3 = AnonymousClass001.A0o();
            A0o3.append("The auto-size step granularity (");
            A0o3.append(f3);
            throw AnonymousClass000.A0F("px) is less or equal to (0px)", A0o3);
        }
    }

    public void A06(int i, float f) {
        Resources resources;
        Context context = this.A08;
        if (context == null) {
            resources = Resources.getSystem();
        } else {
            resources = context.getResources();
        }
        float applyDimension = TypedValue.applyDimension(i, f, resources.getDisplayMetrics());
        TextView textView = this.A09;
        if (applyDimension != textView.getPaint().getTextSize()) {
            textView.getPaint().setTextSize(applyDimension);
            boolean isInLayout = textView.isInLayout();
            if (textView.getLayout() != null) {
                this.A06 = false;
                try {
                    Method A012 = A01("nullLayouts");
                    if (A012 != null) {
                        A012.invoke(textView, new Object[0]);
                    }
                } catch (Exception e) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e);
                }
                if (!isInLayout) {
                    textView.requestLayout();
                } else {
                    textView.forceLayout();
                }
                textView.invalidate();
            }
        }
    }

    public final boolean A07() {
        if (!(!(this.A09 instanceof AnonymousClass03A)) || this.A03 != 1) {
            this.A06 = false;
            return false;
        }
        if (!this.A05 || this.A07.length == 0) {
            float f = this.A00;
            float f2 = this.A01;
            float f3 = this.A02;
            int floor = ((int) Math.floor((double) ((f - f2) / f3))) + 1;
            int[] iArr = new int[floor];
            for (int i = 0; i < floor; i++) {
                iArr[i] = Math.round((((float) i) * f3) + f2);
            }
            this.A07 = A02(iArr);
        }
        this.A06 = true;
        return true;
    }

    public final boolean A08() {
        int[] iArr = this.A07;
        int length = iArr.length;
        boolean A1W = AnonymousClass001.A1W(length);
        this.A05 = A1W;
        if (A1W) {
            this.A03 = 1;
            this.A01 = (float) iArr[0];
            this.A00 = (float) iArr[length - 1];
            this.A02 = -1.0f;
        }
        return A1W;
    }

    public AnonymousClass0XX(TextView textView) {
        AnonymousClass0O2 r0;
        this.A09 = textView;
        this.A08 = textView.getContext();
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            r0 = new AnonymousClass04W();
        } else if (i >= 23) {
            r0 = new AnonymousClass04X();
        } else {
            r0 = new AnonymousClass0O2();
        }
        this.A0A = r0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000e, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000f, code lost:
        r1 = X.AnonymousClass001.A0o();
        r1.append("Failed to invoke TextView#");
        r1.append(r5);
        android.util.Log.w("ACTVAutoSizeHelper", X.AnonymousClass000.A0X("() method", r1), r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0026, code lost:
        return r4;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object A00(java.lang.Object r3, java.lang.Object r4, java.lang.String r5) {
        /*
            java.lang.reflect.Method r1 = A01(r5)     // Catch:{ Exception -> 0x000e, all -> 0x000c }
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x000e, all -> 0x000c }
            java.lang.Object r4 = r1.invoke(r3, r0)     // Catch:{ Exception -> 0x000e, all -> 0x000c }
            return r4
        L_0x000c:
            r0 = move-exception
            throw r0
        L_0x000e:
            r3 = move-exception
            java.lang.String r2 = "ACTVAutoSizeHelper"
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Failed to invoke TextView#"
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = "() method"
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)
            android.util.Log.w(r2, r0, r3)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0XX.A00(java.lang.Object, java.lang.Object, java.lang.String):java.lang.Object");
    }

    public final StaticLayout A03(Layout.Alignment alignment, CharSequence charSequence, int i, int i2) {
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.A04, i);
        StaticLayout.Builder alignment2 = obtain.setAlignment(alignment);
        TextView textView = this.A09;
        StaticLayout.Builder hyphenationFrequency = alignment2.setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency());
        if (i2 == -1) {
            i2 = Integer.MAX_VALUE;
        }
        hyphenationFrequency.setMaxLines(i2);
        try {
            this.A0A.A00(obtain, textView);
        } catch (ClassCastException unused) {
            Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
        }
        return obtain.build();
    }
}
