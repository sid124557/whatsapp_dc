package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.components.button.ThumbnailButton;

/* renamed from: X.4YP  reason: invalid class name */
public final class AnonymousClass4YP extends C05570Ua {
    public final View A00;
    public final TextView A01;
    public final ThumbnailButton A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4YP(View view) {
        super(view);
        C162457s7.A0J(view, 1);
        this.A00 = view;
        View findViewById = view.findViewById(R.id.contact_row_photo);
        C162457s7.A0K(findViewById, "null cannot be cast to non-null type com.whatsapp.components.button.ThumbnailButton");
        this.A02 = (ThumbnailButton) findViewById;
        View findViewById2 = view.findViewById(R.id.contact_name);
        C162457s7.A0K(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById2;
        this.A01 = textView;
        AnonymousClass0YY.A06(textView, 2);
        View findViewById3 = view.findViewById(R.id.iv_close);
        if ((findViewById3 instanceof ImageView) && C1001059l.A04) {
            ImageView imageView = (ImageView) findViewById3;
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            C86614Ku.A15(C18290x4.A0G(imageView), findViewById3, R.dimen.f6nameremoved);
        }
    }
}
