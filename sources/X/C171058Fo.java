package X;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.calling.callhistory.group.GroupCallLogActivity;

/* renamed from: X.8Fo  reason: invalid class name and case insensitive filesystem */
public class C171058Fo implements C184288rY {
    public final /* synthetic */ GroupCallLogActivity A00;

    public C171058Fo(GroupCallLogActivity groupCallLogActivity) {
        this.A00 = groupCallLogActivity;
    }

    public void Bog(Bitmap bitmap, ImageView imageView, boolean z) {
        if (bitmap != null) {
            imageView.setImageBitmap(bitmap);
        } else {
            Bp2(imageView);
        }
    }

    public void Bp2(ImageView imageView) {
        imageView.setImageResource(R.drawable.avatar_contact);
    }
}
