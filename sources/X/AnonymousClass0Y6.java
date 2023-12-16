package X;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.appcompat.widget.AppCompatSpinner;
import java.lang.reflect.Constructor;

/* renamed from: X.0Y6  reason: invalid class name */
public class AnonymousClass0Y6 {
    public static final String LOG_TAG = "AppCompatViewInflater";
    public static final String[] sClassPrefixList = {"android.widget.", "android.view.", "android.webkit."};
    public static final C06290Wz sConstructorMap = new C06290Wz();
    public static final Class[] sConstructorSignature = {Context.class, AttributeSet.class};
    public static final int[] sOnClickAttrs = {16843375};
    public final Object[] mConstructorArgs = AnonymousClass002.A0M();

    private View createViewByPrefix(Context context, String str, String str2) {
        String str3;
        C06290Wz r3 = sConstructorMap;
        Constructor<? extends U> constructor = (Constructor) r3.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    str3 = AnonymousClass000.A0T(str2, str);
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            constructor = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(sConstructorSignature);
            r3.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.mConstructorArgs);
    }

    private View createViewFromTag(Context context, String str, AttributeSet attributeSet) {
        if (str.equals("view")) {
            str = attributeSet.getAttributeValue((String) null, "class");
        }
        try {
            Object[] objArr = this.mConstructorArgs;
            objArr[0] = context;
            objArr[1] = attributeSet;
            if (-1 == str.indexOf(46)) {
                int i = 0;
                while (true) {
                    String[] strArr = sClassPrefixList;
                    if (i < strArr.length) {
                        View createViewByPrefix = createViewByPrefix(context, str, strArr[i]);
                        if (createViewByPrefix != null) {
                            return createViewByPrefix;
                        }
                        i++;
                    } else {
                        Object[] objArr2 = this.mConstructorArgs;
                        objArr2[0] = null;
                        objArr2[1] = null;
                        return null;
                    }
                }
            } else {
                View createViewByPrefix2 = createViewByPrefix(context, str, (String) null);
                Object[] objArr3 = this.mConstructorArgs;
                objArr3[0] = null;
                objArr3[1] = null;
                return createViewByPrefix2;
            }
        } catch (Exception unused) {
            return null;
        } finally {
            Object[] objArr4 = this.mConstructorArgs;
            objArr4[0] = null;
            objArr4[1] = null;
        }
    }

    public static Context themifyContext(Context context, AttributeSet attributeSet, boolean z, boolean z2) {
        int i;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass0KC.A0O, 0, 0);
        if (z) {
            i = obtainStyledAttributes.getResourceId(0, 0);
        } else {
            i = 0;
        }
        if (z2 && i == 0 && (i = obtainStyledAttributes.getResourceId(4, 0)) != 0) {
            Log.i(LOG_TAG, "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        obtainStyledAttributes.recycle();
        if (i == 0 || ((context instanceof C000500m) && ((C000500m) context).A00 == i)) {
            return context;
        }
        return new C000500m(context, i);
    }

    private void verifyNotNull(View view, String str) {
        if (view == null) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append(AnonymousClass000.A0O(this));
            A0o.append(" asked to inflate view for <");
            A0o.append(str);
            throw AnonymousClass000.A0I(">, but returned null", A0o);
        }
    }

    public AnonymousClass031 createAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        return new AnonymousClass031(context, attributeSet);
    }

    public AnonymousClass035 createButton(Context context, AttributeSet attributeSet) {
        return new AnonymousClass035(context, attributeSet);
    }

    public AppCompatCheckBox createCheckBox(Context context, AttributeSet attributeSet) {
        return new AppCompatCheckBox(context, attributeSet);
    }

    public AnonymousClass037 createCheckedTextView(Context context, AttributeSet attributeSet) {
        return new AnonymousClass037(context, attributeSet);
    }

    public AnonymousClass03A createEditText(Context context, AttributeSet attributeSet) {
        return new AnonymousClass03A(context, attributeSet);
    }

    public AnonymousClass03Q createImageButton(Context context, AttributeSet attributeSet) {
        return new AnonymousClass03Q(context, attributeSet);
    }

    public AppCompatImageView createImageView(Context context, AttributeSet attributeSet) {
        return new AppCompatImageView(context, attributeSet);
    }

    public C002903g createMultiAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        return new C002903g(context, attributeSet);
    }

    public AppCompatRadioButton createRadioButton(Context context, AttributeSet attributeSet) {
        return new AppCompatRadioButton(context, attributeSet);
    }

    public AnonymousClass03j createRatingBar(Context context, AttributeSet attributeSet) {
        return new AnonymousClass03j(context, attributeSet);
    }

    public AppCompatSeekBar createSeekBar(Context context, AttributeSet attributeSet) {
        return new AppCompatSeekBar(context, attributeSet);
    }

    public AppCompatSpinner createSpinner(Context context, AttributeSet attributeSet) {
        return new AppCompatSpinner(context, attributeSet);
    }

    public AnonymousClass03n createTextView(Context context, AttributeSet attributeSet) {
        return new AnonymousClass03n(context, attributeSet);
    }

    public C003103o createToggleButton(Context context, AttributeSet attributeSet) {
        return new C003103o(context, attributeSet);
    }

    private void checkOnClickListener(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if ((context instanceof ContextWrapper) && AnonymousClass0I8.A00(view)) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, sOnClickAttrs);
            String string = obtainStyledAttributes.getString(0);
            if (string != null) {
                view.setOnClickListener(new C07050aF(view, string));
            }
            obtainStyledAttributes.recycle();
        }
    }

    public View createView(Context context, String str, AttributeSet attributeSet) {
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001f, code lost:
        r0 = createView(r1, r4, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0023, code lost:
        if (r0 != null) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        if (r5 == r1) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0027, code lost:
        r0 = createViewFromTag(r1, r4, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002b, code lost:
        if (r0 == null) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002d, code lost:
        checkOnClickListener(r0, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0030, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00f3, code lost:
        verifyNotNull(r0, r4);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View createView(android.view.View r3, java.lang.String r4, android.content.Context r5, android.util.AttributeSet r6, boolean r7, boolean r8, boolean r9, boolean r10) {
        /*
            r2 = this;
            if (r7 == 0) goto L_0x00f8
            if (r3 == 0) goto L_0x00f8
            android.content.Context r1 = r3.getContext()
        L_0x0008:
            if (r8 != 0) goto L_0x000c
            if (r9 == 0) goto L_0x0010
        L_0x000c:
            android.content.Context r1 = themifyContext(r1, r6, r8, r9)
        L_0x0010:
            if (r10 == 0) goto L_0x0018
            r1.getResources()
            r1.getResources()
        L_0x0018:
            int r0 = r4.hashCode()
            switch(r0) {
                case -1946472170: goto L_0x00e6;
                case -1455429095: goto L_0x00d8;
                case -1346021293: goto L_0x00ca;
                case -938935918: goto L_0x00bd;
                case -937446323: goto L_0x00af;
                case -658531749: goto L_0x00a1;
                case -339785223: goto L_0x0093;
                case 776382189: goto L_0x0086;
                case 799298502: goto L_0x0078;
                case 1125864064: goto L_0x006a;
                case 1413872058: goto L_0x005c;
                case 1601505219: goto L_0x004e;
                case 1666676343: goto L_0x003f;
                case 2001146706: goto L_0x0031;
                default: goto L_0x001f;
            }
        L_0x001f:
            android.view.View r0 = r2.createView(r1, r4, r6)
        L_0x0023:
            if (r0 != 0) goto L_0x002d
            if (r5 == r1) goto L_0x0030
            android.view.View r0 = r2.createViewFromTag(r1, r4, r6)
            if (r0 == 0) goto L_0x0030
        L_0x002d:
            r2.checkOnClickListener(r0, r6)
        L_0x0030:
            return r0
        L_0x0031:
            java.lang.String r0 = "Button"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x001f
            X.035 r0 = r2.createButton(r1, r6)
            goto L_0x00f3
        L_0x003f:
            java.lang.String r0 = "EditText"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x001f
            X.03A r0 = new X.03A
            r0.<init>(r1, r6)
            goto L_0x00f3
        L_0x004e:
            java.lang.String r0 = "CheckBox"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x001f
            androidx.appcompat.widget.AppCompatCheckBox r0 = r2.createCheckBox(r1, r6)
            goto L_0x00f3
        L_0x005c:
            java.lang.String r0 = "AutoCompleteTextView"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x001f
            X.031 r0 = r2.createAutoCompleteTextView(r1, r6)
            goto L_0x00f3
        L_0x006a:
            java.lang.String r0 = "ImageView"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x001f
            androidx.appcompat.widget.AppCompatImageView r0 = new androidx.appcompat.widget.AppCompatImageView
            r0.<init>(r1, r6)
            goto L_0x00f3
        L_0x0078:
            java.lang.String r0 = "ToggleButton"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x001f
            X.03o r0 = new X.03o
            r0.<init>(r1, r6)
            goto L_0x00f3
        L_0x0086:
            java.lang.String r0 = "RadioButton"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x001f
            androidx.appcompat.widget.AppCompatRadioButton r0 = r2.createRadioButton(r1, r6)
            goto L_0x00f3
        L_0x0093:
            java.lang.String r0 = "Spinner"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x001f
            androidx.appcompat.widget.AppCompatSpinner r0 = new androidx.appcompat.widget.AppCompatSpinner
            r0.<init>((android.content.Context) r1, (android.util.AttributeSet) r6)
            goto L_0x00f3
        L_0x00a1:
            java.lang.String r0 = "SeekBar"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x001f
            androidx.appcompat.widget.AppCompatSeekBar r0 = new androidx.appcompat.widget.AppCompatSeekBar
            r0.<init>(r1, r6)
            goto L_0x00f3
        L_0x00af:
            java.lang.String r0 = "ImageButton"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x001f
            X.03Q r0 = new X.03Q
            r0.<init>(r1, r6)
            goto L_0x00f3
        L_0x00bd:
            java.lang.String r0 = "TextView"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x001f
            X.03n r0 = r2.createTextView(r1, r6)
            goto L_0x00f3
        L_0x00ca:
            java.lang.String r0 = "MultiAutoCompleteTextView"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x001f
            X.03g r0 = new X.03g
            r0.<init>(r1, r6)
            goto L_0x00f3
        L_0x00d8:
            java.lang.String r0 = "CheckedTextView"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x001f
            X.037 r0 = new X.037
            r0.<init>(r1, r6)
            goto L_0x00f3
        L_0x00e6:
            java.lang.String r0 = "RatingBar"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x001f
            X.03j r0 = new X.03j
            r0.<init>(r1, r6)
        L_0x00f3:
            r2.verifyNotNull(r0, r4)
            goto L_0x0023
        L_0x00f8:
            r1 = r5
            goto L_0x0008
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0Y6.createView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet, boolean, boolean, boolean, boolean):android.view.View");
    }
}
