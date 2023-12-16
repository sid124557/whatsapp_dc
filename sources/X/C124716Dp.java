package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.whatsapp.mediacomposer.doodle.shapepicker.ShapeItemView;

/* renamed from: X.6Dp  reason: invalid class name and case insensitive filesystem */
public final class C124716Dp extends Handler {
    public final /* synthetic */ C158927km A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C124716Dp(Looper looper, C158927km r2) {
        super(looper);
        this.A00 = r2;
        C626936e.A06(looper);
    }

    public void handleMessage(Message message) {
        if (message.obj != null) {
            String string = message.getData().getString("tag_bundle_key");
            C626936e.A06(string);
            ShapeItemView shapeItemView = (ShapeItemView) message.obj;
            if (string.equals(shapeItemView.A01)) {
                C148297Hv r1 = (C148297Hv) shapeItemView.getTag();
                shapeItemView.setImageDrawable(r1.A00);
                shapeItemView.setContentDescription(r1.A01);
            }
        }
    }
}
