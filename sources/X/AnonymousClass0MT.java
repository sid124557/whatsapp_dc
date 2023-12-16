package X;

import android.content.res.AssetManager;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.Map;

/* renamed from: X.0MT  reason: invalid class name */
public class AnonymousClass0MT {
    public AnonymousClass0GZ A00 = null;
    public final AssetManager A01;
    public final AnonymousClass0PN A02 = new AnonymousClass0PN();
    public final Map A03 = AnonymousClass001.A0t();
    public final Map A04 = AnonymousClass001.A0t();

    public AnonymousClass0MT(Drawable.Callback callback) {
        AssetManager assets;
        if (!(callback instanceof View)) {
            AnonymousClass0S3.A00("LottieDrawable must be inside of a view for images to work.");
            assets = null;
        } else {
            assets = ((View) callback).getContext().getAssets();
        }
        this.A01 = assets;
    }
}
