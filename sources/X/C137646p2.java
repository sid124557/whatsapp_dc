package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;

/* renamed from: X.6p2  reason: invalid class name and case insensitive filesystem */
public abstract class C137646p2 extends AnonymousClass6FR {
    public ViewGroup A00 = ((ViewGroup) C06560Yg.A02(this, R.id.search_message_attachment_container_content));
    public ViewGroup A01 = ((ViewGroup) C06560Yg.A02(this, R.id.search_message_attachment_container_icon));

    public abstract View A01();

    public abstract View A02();

    public C137646p2(Context context) {
        super(context);
        View.inflate(getContext(), R.layout.f8nameremoved, this);
    }

    public void A03() {
        View A02 = A02();
        if (A02 != null) {
            this.A01.addView(A02);
        }
        View A012 = A01();
        if (A012 != null) {
            this.A00.addView(A012);
        }
    }
}
