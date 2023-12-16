package X;

import android.content.Context;
import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import java.util.Locale;

/* renamed from: X.0Zu  reason: invalid class name */
public class AnonymousClass0Zu implements TransformationMethod {
    public Locale A00;

    public CharSequence getTransformation(CharSequence charSequence, View view) {
        if (charSequence != null) {
            return charSequence.toString().toUpperCase(this.A00);
        }
        return null;
    }

    public AnonymousClass0Zu(Context context) {
        this.A00 = AnonymousClass001.A0M(context).locale;
    }

    public void onFocusChanged(View view, CharSequence charSequence, boolean z, int i, Rect rect) {
    }
}
