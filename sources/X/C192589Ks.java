package X;

import android.content.Context;
import android.view.TextureView;

/* renamed from: X.9Ks  reason: invalid class name and case insensitive filesystem */
public final class C192589Ks {
    public static C203699oA A00(Context context, TextureView textureView) {
        AnonymousClass9JW r0;
        C194559Tk r6 = new C194559Tk(false);
        boolean A00 = AnonymousClass9M2.A00(context);
        Context applicationContext = context.getApplicationContext();
        if (A00) {
            r0 = AnonymousClass9JW.CAMERA2;
        } else {
            r0 = AnonymousClass9JW.CAMERA1;
        }
        TextureView textureView2 = textureView;
        C195579Yl r2 = new C195579Yl(applicationContext, textureView2, new AnonymousClass9XR(), r6, AnonymousClass9LJ.A00(context, r0), A00);
        r2.A0F = false;
        return r2;
    }
}
