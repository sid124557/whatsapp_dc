package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: X.0bK  reason: invalid class name and case insensitive filesystem */
public class C07620bK implements C15600rd {
    public Drawable B0g(Context context, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        String classAttribute = attributeSet.getClassAttribute();
        if (classAttribute != null) {
            try {
                Drawable drawable = (Drawable) AnonymousClass001.A0h(C07620bK.class.getClassLoader().loadClass(classAttribute).asSubclass(Drawable.class));
                drawable.inflate(context.getResources(), xmlPullParser, attributeSet, theme);
                return drawable;
            } catch (Exception e) {
                Log.e("DrawableDelegate", "Exception while inflating <drawable>", e);
            }
        }
        return null;
    }
}
