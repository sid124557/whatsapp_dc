package X;

import android.content.Context;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.search.views.MessageThumbView;

/* renamed from: X.4zy  reason: invalid class name and case insensitive filesystem */
public class C98194zy extends C98034zi {
    public C620733j A00;
    public boolean A01;
    public final WaTextView A02 = AnonymousClass0x7.A0L(this, R.id.media_time);
    public final MessageThumbView A03;

    public void A01() {
        if (!this.A01) {
            this.A01 = true;
            this.A00 = C88864av.A02((C111685iW) generatedComponent());
        }
    }

    public float getRatio() {
        return 1.0f;
    }

    public C98194zy(Context context) {
        super(context);
        A01();
        MessageThumbView messageThumbView = (MessageThumbView) C06560Yg.A02(this, R.id.thumb_view);
        this.A03 = messageThumbView;
        C18300x5.A13(context, messageThumbView, R.string.f11nameremoved);
    }

    public void setMessage(C31961pA r3) {
        super.setMessage(r3);
        MessageThumbView messageThumbView = this.A03;
        messageThumbView.setVisibility(0);
        messageThumbView.A00 = this.A00;
        messageThumbView.setMessage(r3);
        WaTextView waTextView = this.A02;
        C86634Kw.A1I(waTextView);
        waTextView.setVisibility(8);
    }

    public int getMark() {
        return R.drawable.msg_status_gif;
    }
}
