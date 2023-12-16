package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

/* renamed from: X.550  reason: invalid class name */
public class AnonymousClass550 extends AnonymousClass5ZM {
    public final AnonymousClass5UX A00;
    public final AnonymousClass7DY A01;
    public final C613330g A02;
    public final AnonymousClass3ZH A03;
    public final WeakReference A04;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        View A0j = C86664Kz.A0j(this.A04);
        if (A0j == null) {
            return null;
        }
        C613330g r1 = this.A02;
        Context context = A0j.getContext();
        AnonymousClass3ZH r3 = this.A03;
        Bitmap A032 = r1.A03(context, r3, -1.0f, 96, true);
        if (A032 == null) {
            AnonymousClass5UX r2 = this.A00;
            A032 = r2.A02(A0j.getContext(), -1.0f, r2.A00(r3), 96);
        }
        AnonymousClass7DY r0 = this.A01;
        if (r0 == null) {
            return A032;
        }
        r0.A00 = A032;
        return A032;
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        ImageView imageView = (ImageView) this.A04.get();
        if (imageView != null && bitmap != null) {
            imageView.setImageBitmap(bitmap);
            imageView.setVisibility(0);
        }
    }

    public AnonymousClass550(ImageView imageView, AnonymousClass5UX r3, AnonymousClass7DY r4, C613330g r5, AnonymousClass3ZH r6) {
        this.A00 = r3;
        this.A02 = r5;
        this.A03 = r6;
        this.A04 = AnonymousClass0x9.A14(imageView);
        this.A01 = r4;
    }
}
