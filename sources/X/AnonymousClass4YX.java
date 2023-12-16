package X;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.WaMediaThumbnailView;

/* renamed from: X.4YX  reason: invalid class name */
public class AnonymousClass4YX extends C05570Ua {
    public final int A00;
    public final int A01;
    public final ColorDrawable A02;
    public final WaMediaThumbnailView A03;
    public final C53492nB A04;

    public AnonymousClass4YX(View view, C53492nB r4) {
        super(view);
        this.A04 = r4;
        this.A00 = view.getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
        int A042 = AnonymousClass0Y8.A04(view.getContext(), R.color.f5nameremoved);
        this.A01 = A042;
        this.A02 = new ColorDrawable(A042);
        this.A03 = (WaMediaThumbnailView) C18290x4.A0M(view, R.id.selected_media_item_thumbnail);
    }
}
