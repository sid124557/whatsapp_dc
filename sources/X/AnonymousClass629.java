package X;

import android.graphics.Bitmap;
import android.widget.ImageView;

/* renamed from: X.629  reason: invalid class name */
public final class AnonymousClass629 extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ C125586Ip $this_apply;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass629(C125586Ip r2) {
        super(1);
        this.$this_apply = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        C125586Ip r0 = this.$this_apply;
        if (bitmap != null) {
            r0.A00.setImageBitmap(bitmap);
        } else {
            ImageView imageView = r0.A00;
            C86604Kt.A10(imageView.getContext(), imageView);
        }
        return C59022wD.A00;
    }
}
