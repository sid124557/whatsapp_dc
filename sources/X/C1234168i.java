package X;

import android.graphics.Bitmap;
import android.net.Uri;
import com.whatsapp.mediacomposer.ImageComposerFragment;
import com.whatsapp.mediacomposer.MediaComposerFragment;
import com.whatsapp.mediacomposer.VideoComposerFragment;
import com.whatsapp.util.Log;
import java.io.IOException;

/* renamed from: X.68i  reason: invalid class name and case insensitive filesystem */
public class C1234168i implements C84584Cx {
    public Object A00;
    public final int A01;

    public C1234168i(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public String BDW() {
        String str;
        int i = this.A01;
        Object obj = this.A00;
        if (i != 0) {
            return ((VideoComposerFragment) obj).A0X.getAbsolutePath();
        }
        Uri uri = ((MediaComposerFragment) obj).A00;
        if (uri != null) {
            str = uri.toString();
        } else {
            str = "";
        }
        return AnonymousClass000.A0X("-original", AnonymousClass000.A0l(str));
    }

    public Bitmap BJk() {
        Uri build;
        AnonymousClass6DM r2;
        if (this.A01 != 0) {
            try {
                r2 = new AnonymousClass6DM();
                r2.setDataSource(((VideoComposerFragment) this.A00).A0X.getAbsolutePath());
                Bitmap frameAtTime = r2.getFrameAtTime(1);
                r2.close();
                return frameAtTime;
            } catch (Exception | NoSuchMethodError e) {
                Log.e("VideoComposerFragment/getvideothumb", e);
                return C107085af.A01(((VideoComposerFragment) this.A00).A0X);
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        } else {
            try {
                ImageComposerFragment imageComposerFragment = (ImageComposerFragment) this.A00;
                Uri uri = imageComposerFragment.A00;
                if (uri == null) {
                    build = Uri.EMPTY;
                } else {
                    Uri.Builder buildUpon = Uri.fromFile(AnonymousClass4SG.A2l(uri, C86644Kx.A0Y(imageComposerFragment)).A07()).buildUpon();
                    if (imageComposerFragment.A00.getQueryParameter("flip-h") != null) {
                        buildUpon.appendQueryParameter("flip-h", imageComposerFragment.A00.getQueryParameter("flip-h"));
                    }
                    build = buildUpon.build();
                }
                AnonymousClass1VX r3 = imageComposerFragment.A0A;
                C989053r r22 = imageComposerFragment.A0O;
                int i = 1576;
                if (imageComposerFragment.A0A) {
                    i = 2654;
                }
                int A0N = r3.A0N(i);
                return r22.A0B(build, A0N, A0N);
            } catch (C1000259c | IOException e2) {
                Log.e("ImageComposerFragment/loadOriginalBitmap", e2);
                return null;
            }
        }
        throw th;
    }
}
