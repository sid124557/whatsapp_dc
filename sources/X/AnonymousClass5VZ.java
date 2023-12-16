package X;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* renamed from: X.5VZ  reason: invalid class name */
public class AnonymousClass5VZ {
    public static final Comparator A00 = new AnonymousClass91S(18);

    public static List A00(Toolbar toolbar, CharSequence charSequence) {
        ArrayList A0s = AnonymousClass001.A0s();
        for (int i = 0; i < toolbar.getChildCount(); i++) {
            View childAt = toolbar.getChildAt(i);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (TextUtils.equals(textView.getText(), charSequence)) {
                    A0s.add(textView);
                }
            }
        }
        return A0s;
    }
}
