package X;

import android.content.Context;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.search.views.MessageThumbView;

/* renamed from: X.4zh  reason: invalid class name and case insensitive filesystem */
public class C98024zh extends C132256ex {
    public boolean A00;
    public final WaImageView A01 = AnonymousClass0x9.A0L(this, R.id.kept_status);
    public final WaImageView A02 = AnonymousClass0x9.A0L(this, R.id.starred_status);
    public final MessageThumbView A03;

    public void A01() {
        if (!this.A00) {
            this.A00 = true;
            generatedComponent();
        }
    }

    public void setMessage(AnonymousClass1n2 r3) {
        this.A01 = r3;
        A04(this.A02, this.A01);
        MessageThumbView messageThumbView = this.A03;
        messageThumbView.A00 = this.A00;
        messageThumbView.setMessage(r3);
    }

    public C98024zh(Context context) {
        super(context);
        A01();
        this.A00 = 1.0f;
        View.inflate(context, R.layout.f8nameremoved, this);
        MessageThumbView messageThumbView = (MessageThumbView) C06560Yg.A02(this, R.id.thumb_view);
        this.A03 = messageThumbView;
        C18300x5.A13(context, messageThumbView, R.string.f11nameremoved);
    }
}
