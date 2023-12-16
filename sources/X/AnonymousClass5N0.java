package X;

import android.text.TextUtils;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.util.Log;
import java.lang.reflect.Field;

/* renamed from: X.5N0  reason: invalid class name */
public class AnonymousClass5N0 {
    public Runnable A00;
    public boolean A01 = false;

    public void A00(Toolbar toolbar) {
        if (!this.A01) {
            try {
                Field declaredField = Toolbar.class.getDeclaredField("mTitleTextView");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(toolbar);
                if (obj == null) {
                    return;
                }
                if (!(obj instanceof TextView)) {
                    this.A01 = true;
                    return;
                }
                TextView textView = (TextView) obj;
                textView.setEllipsize(TextUtils.TruncateAt.MARQUEE);
                textView.setMarqueeRepeatLimit(1);
                textView.setOnClickListener(new C109355eU(textView, 34));
                C86614Ku.A1H(textView, this, 10);
                if (this.A00 == null) {
                    C117155rT r2 = new C117155rT(this, 38, textView);
                    this.A00 = r2;
                    toolbar.postDelayed(r2, 1000);
                }
            } catch (IllegalAccessException | NoSuchFieldException e) {
                Log.e("util/marqueetoolbar", e);
                this.A01 = true;
            }
        }
    }
}
