package X;

import android.content.Context;
import android.widget.LinearLayout;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.search.views.MessageThumbView;

/* renamed from: X.500  reason: invalid class name */
public class AnonymousClass500 extends C98034zi {
    public C69263Wi A00;
    public C620733j A01;
    public AnonymousClass1VX A02;
    public AnonymousClass4FS A03;
    public boolean A04;
    public final LinearLayout A05;
    public final WaTextView A06 = AnonymousClass0x7.A0L(this, R.id.media_time);
    public final MessageThumbView A07;

    public void setMessage(C31971pB r8) {
        super.setMessage(r8);
        MessageThumbView messageThumbView = this.A07;
        messageThumbView.setVisibility(0);
        messageThumbView.A00 = this.A00;
        messageThumbView.setMessage(r8);
        C620733j r4 = this.A01;
        AnonymousClass4FS r6 = this.A03;
        C69263Wi r2 = this.A00;
        AnonymousClass25Y.A00(this.A06, r2, new C107475bN(this, 1), r4, r8, r6);
    }

    public void A01() {
        if (!this.A04) {
            this.A04 = true;
            C64333Db A002 = C88864av.A00(generatedComponent());
            this.A02 = C64333Db.A4B(A002);
            this.A01 = C64333Db.A2t(A002);
            this.A00 = C64333Db.A04(A002);
            this.A03 = C64333Db.A8y(A002);
        }
    }

    public float getRatio() {
        return 1.0f;
    }

    public AnonymousClass500(Context context) {
        super(context);
        A01();
        MessageThumbView messageThumbView = (MessageThumbView) C06560Yg.A02(this, R.id.thumb_view);
        this.A07 = messageThumbView;
        this.A05 = C86654Ky.A0N(this, R.id.button_frame);
        C18300x5.A13(context, messageThumbView, R.string.f11nameremoved);
    }

    public int getMark() {
        return R.drawable.mark_video;
    }
}
