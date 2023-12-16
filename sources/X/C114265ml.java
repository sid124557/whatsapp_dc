package X;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.audiopicker.AudioPickerActivity;

/* renamed from: X.5ml  reason: invalid class name and case insensitive filesystem */
public class C114265ml implements AnonymousClass4EM {
    public final /* synthetic */ AnonymousClass5UB A00;

    public C114265ml(AnonymousClass5UB r1) {
        this.A00 = r1;
    }

    public void Axi() {
        AnonymousClass5UB r0 = this.A00;
        ImageView imageView = r0.A05;
        imageView.setImageBitmap((Bitmap) null);
        r0.A03.setBackground((Drawable) null);
        imageView.setBackgroundResource(0);
    }

    public /* synthetic */ void BSk() {
    }

    public void Bd0(Bitmap bitmap, boolean z) {
        Resources resources;
        int i;
        AnonymousClass5UB r2 = this.A00;
        ImageView imageView = r2.A05;
        imageView.setImageBitmap(bitmap);
        if (bitmap == AnonymousClass30R.A07) {
            r2.A03.setBackground((Drawable) null);
            resources = r2.A0C.getResources();
            i = R.drawable.audio_picker_empty_thumb_background;
        } else {
            FrameLayout frameLayout = r2.A03;
            AudioPickerActivity audioPickerActivity = r2.A0C;
            frameLayout.setBackground(audioPickerActivity.getResources().getDrawable(R.drawable.audio_picker_thumb_frame_background));
            resources = audioPickerActivity.getResources();
            i = R.drawable.audio_picker_filled_thumb_background;
        }
        imageView.setBackground(resources.getDrawable(i));
    }
}
