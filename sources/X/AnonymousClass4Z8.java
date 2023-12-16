package X;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.gallerypicker.GalleryPickerFragment;

/* renamed from: X.4Z8  reason: invalid class name */
public final class AnonymousClass4Z8 extends C05570Ua implements View.OnClickListener {
    public C104245Qf A00;
    public final ImageView A01;
    public final ImageView A02;
    public final TextView A03;
    public final TextEmojiLabel A04;
    public final /* synthetic */ GalleryPickerFragment A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4Z8(View view, GalleryPickerFragment galleryPickerFragment) {
        super(view);
        this.A05 = galleryPickerFragment;
        this.A04 = (TextEmojiLabel) C18290x4.A0M(view, R.id.title);
        this.A01 = (ImageView) C18290x4.A0M(view, R.id.icon);
        this.A03 = C18280x3.A0F(view, R.id.count);
        this.A02 = (ImageView) C18290x4.A0M(view, R.id.thumbnail);
        view.setOnClickListener(this);
    }

    public void onClick(View view) {
        C104245Qf r3 = this.A00;
        if (r3 != null) {
            GalleryPickerFragment galleryPickerFragment = this.A05;
            C003203q A0R = galleryPickerFragment.A0R();
            Bundle bundle = galleryPickerFragment.A06;
            AnonymousClass1VX r0 = galleryPickerFragment.A0F;
            if (r0 != null) {
                r3.A01(A0R, bundle, C86664Kz.A0I(r0));
                return;
            }
            throw C18270x1.A0R();
        }
    }
}
