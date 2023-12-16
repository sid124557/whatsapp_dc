package X;

import android.graphics.Bitmap;
import android.util.TypedValue;
import java.io.File;

/* renamed from: X.2hL  reason: invalid class name and case insensitive filesystem */
public final class C49942hL {
    public final C56352rq A00;
    public final C54292oU A01;
    public final AnonymousClass1VX A02;
    public final C48282ee A03;
    public final C50262ht A04;

    public final Bitmap A00(File file, String str) {
        if (file == null || !file.exists()) {
            return null;
        }
        int applyDimension = (int) TypedValue.applyDimension(1, 28.0f, AnonymousClass000.A0B(this.A01.A00));
        Bitmap bitmap = C107245ax.A06(new AnonymousClass5WB(applyDimension, applyDimension), file).A02;
        boolean A0Y = this.A02.A0Y(C58422vE.A02, 575);
        if (bitmap != null && A0Y) {
            this.A03.A01(bitmap, str);
        }
        return bitmap;
    }

    public final File A01(String str) {
        File A012 = C64393Dh.A01(C54292oU.A01(this.A00.A00), "Stickers");
        if (A012.exists() || A012.mkdirs()) {
            return C18270x1.A0A(A012, ".png", AnonymousClass000.A0l(str));
        }
        return null;
    }

    public C49942hL(C56352rq r1, C54292oU r2, AnonymousClass1VX r3, C48282ee r4, C50262ht r5) {
        C18260x0.A0f(r3, r2, r4, r5, r1);
        this.A02 = r3;
        this.A01 = r2;
        this.A03 = r4;
        this.A04 = r5;
        this.A00 = r1;
    }
}
