package X;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: X.0Uy  reason: invalid class name and case insensitive filesystem */
public class C05790Uy {
    public static int A00(Context context, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        if (typedValue.resourceId != 0) {
            return i;
        }
        return i2;
    }

    public static TypedArray A01(Resources.Theme theme, Resources resources, AttributeSet attributeSet, int[] iArr) {
        if (theme == null) {
            return resources.obtainAttributes(attributeSet, iArr);
        }
        return theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    public static boolean A02(String str, XmlPullParser xmlPullParser) {
        return AnonymousClass000.A1W(xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str));
    }
}
