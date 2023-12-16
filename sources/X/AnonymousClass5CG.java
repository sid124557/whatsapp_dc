package X;

import android.view.View;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.util.Log;
import java.lang.reflect.Field;

/* renamed from: X.5CG  reason: invalid class name */
public class AnonymousClass5CG {
    public static void A00(Toolbar toolbar) {
        String str;
        if (toolbar == null) {
            Log.e("ToolbarUtils/toolbar is null");
            return;
        }
        try {
            Field declaredField = Toolbar.class.getDeclaredField("mTitleTextView");
            declaredField.setAccessible(true);
            C06560Yg.A0T((View) declaredField.get(toolbar), true);
        } catch (NoSuchFieldException e) {
            e = e;
            str = "ToolbarUtils/NoSuchFieldException";
            Log.e(str, e);
        } catch (IllegalAccessException e2) {
            e = e2;
            str = "ToolbarUtils/IllegalAccessException";
            Log.e(str, e);
        } catch (NullPointerException e3) {
            e = e3;
            str = "ToolbarUtils/NullPointerException";
            Log.e(str, e);
        }
    }
}
