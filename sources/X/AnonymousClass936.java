package X;

import android.view.View;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.936  reason: invalid class name */
public class AnonymousClass936 implements AnonymousClass4C1 {
    public int A00;
    public Object A01;
    public final int A02;

    public AnonymousClass936(View view, int i, int i2) {
        this.A02 = i2;
        if (i2 != 0) {
            this.A00 = i;
            this.A01 = view;
            return;
        }
        this.A01 = view;
        this.A00 = i;
    }

    public final Object get() {
        if (this.A02 != 0) {
            return Float.valueOf(((float) this.A00) - ((float) ((View) this.A01).getTop()));
        }
        return Float.valueOf(C86664Kz.A02((View) this.A01) - (((float) this.A00) * 2.0f));
    }

    public AnonymousClass936(TextEmojiLabel textEmojiLabel, int i) {
        this.A02 = 2;
        this.A00 = i;
        this.A01 = textEmojiLabel;
    }
}
