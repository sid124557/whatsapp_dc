package X;

import android.content.Context;
import android.widget.RelativeLayout;
import com.whatsapp.R;
import com.whatsapp.WaTextView;

/* renamed from: X.6Fr  reason: invalid class name and case insensitive filesystem */
public class C125136Fr extends RelativeLayout {
    public WaTextView A00 = AnonymousClass0x7.A0L(this, R.id.category_thumbnail_text);

    public void setText(String str) {
        this.A00.setText(str);
    }

    public C125136Fr(Context context) {
        super(context);
        C18280x3.A0D(this).inflate(R.layout.f8nameremoved, this, true);
    }
}
