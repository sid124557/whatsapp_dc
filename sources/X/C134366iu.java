package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import com.whatsapp.R;

/* renamed from: X.6iu  reason: invalid class name and case insensitive filesystem */
public class C134366iu extends C134376iv {
    public Drawable A00;

    public void A01(Canvas canvas) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            int intrinsicHeight = drawable.getIntrinsicHeight() / 4;
            this.A00.setBounds(intrinsicHeight, (getHeight() - this.A00.getIntrinsicHeight()) - intrinsicHeight, this.A00.getIntrinsicWidth() + intrinsicHeight, getHeight() - intrinsicHeight);
            this.A00.draw(canvas);
        }
    }

    public void setMediaItem(C186058ug r4) {
        Context context;
        int i;
        super.setMediaItem(r4);
        if (r4 != null) {
            int type = r4.getType();
            if (type == 1) {
                context = getContext();
                i = R.drawable.mark_video;
            } else if (type == 2) {
                context = getContext();
                i = R.drawable.mark_gif;
            }
            this.A00 = AnonymousClass0RP.A00(context, i);
            return;
        }
        this.A00 = null;
    }

    public C134366iu(Context context) {
        super(context);
    }
}
