package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.1t6  reason: invalid class name */
public final class AnonymousClass1t6 extends AnonymousClass5ZM {
    public final C04840Qw A00;
    public final AnonymousClass4CQ A01;
    public final C54292oU A02;
    public final String A03;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        File A0A = AnonymousClass002.A0A(C54292oU.A03(this.A02), C59482wz.A03);
        if (A0A.exists() || A0A.mkdirs()) {
            return BitmapFactory.decodeFile(AnonymousClass002.A0A(A0A, this.A03).getAbsolutePath());
        }
        Log.e("BloksImageManager/getBitmap/unable to get images directory");
        return null;
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap != null) {
            this.A00.A08(this.A03, AnonymousClass0x9.A14(bitmap));
            this.A01.Bcz(bitmap);
            return;
        }
        this.A01.BRy();
    }

    public AnonymousClass1t6(C04840Qw r1, AnonymousClass4CQ r2, C54292oU r3, String str) {
        this.A02 = r3;
        this.A03 = str;
        this.A00 = r1;
        this.A01 = r2;
    }
}
