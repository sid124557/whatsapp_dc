package X;

import android.graphics.Bitmap;
import android.net.Uri;
import com.whatsapp.R;
import com.whatsapp.mediacomposer.ImageComposerFragment;
import com.whatsapp.util.Log;
import java.io.IOException;

/* renamed from: X.68h  reason: invalid class name and case insensitive filesystem */
public class C1234068h implements C84584Cx {
    public Object A00;
    public Object A01;
    public final int A02;

    public C1234068h(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public static Bitmap A00(C1234068h r2) {
        C134366iu r1 = ((AnonymousClass4ZA) r2.A00).A04;
        if (r1.getTag() != r2) {
            return null;
        }
        Bitmap Bqg = ((C186058ug) r2.A01).Bqg(r1.getResources().getDimensionPixelSize(R.dimen.f6nameremoved));
        if (Bqg == null) {
            return C1457877h.A00;
        }
        return Bqg;
    }

    public String BDW() {
        String str;
        if (this.A02 == 0) {
            return AnonymousClass31W.A02((C186058ug) this.A01);
        }
        ImageComposerFragment imageComposerFragment = (ImageComposerFragment) this.A00;
        Uri uri = imageComposerFragment.A00;
        if (uri != null) {
            str = uri.toString();
        } else {
            str = "";
        }
        StringBuilder A0l = AnonymousClass000.A0l(str);
        A0l.append(":");
        return C18300x5.A0m(A0l, imageComposerFragment.A0A);
    }

    public Bitmap BJk() {
        if (this.A02 == 0) {
            return A00(this);
        }
        try {
            Uri uri = (Uri) this.A01;
            ImageComposerFragment imageComposerFragment = (ImageComposerFragment) this.A00;
            AnonymousClass1VX r3 = imageComposerFragment.A0A;
            C989053r r2 = imageComposerFragment.A0O;
            int i = 1576;
            if (imageComposerFragment.A0A) {
                i = 2654;
            }
            int A0N = r3.A0N(i);
            Bitmap A0B = r2.A0B(uri, A0N, A0N);
            AnonymousClass5Y7 r1 = imageComposerFragment.A07;
            r1.A04 = A0B;
            r1.A09 = false;
            r1.A02();
            return A0B;
        } catch (C1000259c | IOException | OutOfMemoryError e) {
            Log.e("ImageComposerFragment/loadBitmap", e);
            return null;
        }
    }
}
