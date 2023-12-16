package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: X.0bL  reason: invalid class name and case insensitive filesystem */
public class C07630bL implements C15600rd {
    public Drawable B0g(Context context, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        try {
            Resources resources = context.getResources();
            AnonymousClass0AQ r0 = new AnonymousClass0AQ();
            r0.inflate(resources, xmlPullParser, attributeSet, theme);
            return r0;
        } catch (Exception e) {
            Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e);
            return null;
        }
    }
}
