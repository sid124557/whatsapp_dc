package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: X.0bJ  reason: invalid class name and case insensitive filesystem */
public class C07610bJ implements C15600rd {
    public Drawable B0g(Context context, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        try {
            Resources resources = context.getResources();
            AnonymousClass0AR r0 = new AnonymousClass0AR(context);
            r0.inflate(resources, xmlPullParser, attributeSet, theme);
            return r0;
        } catch (Exception e) {
            Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e);
            return null;
        }
    }
}
