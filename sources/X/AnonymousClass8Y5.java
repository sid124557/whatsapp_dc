package X;

import android.graphics.Bitmap;
import android.widget.ImageView;

/* renamed from: X.8Y5  reason: invalid class name */
public final class AnonymousClass8Y5 extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ C132956gQ this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8Y5(C132956gQ r2) {
        super(1);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        C162457s7.A0J(bitmap, 0);
        ((ImageView) this.this$0.A01.getValue()).setImageBitmap(bitmap);
        return C59022wD.A00;
    }
}
