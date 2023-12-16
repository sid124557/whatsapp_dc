package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.File;

/* renamed from: X.1tb  reason: invalid class name and case insensitive filesystem */
public class C33731tb extends AnonymousClass5ZM {
    public final C56932sn A00;
    public final C84934Eh A01;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        String str;
        File A012;
        C50612iT[] r7 = (C50612iT[]) objArr;
        C626936e.A06(r7);
        C56932sn r5 = this.A00;
        C50612iT r1 = r7[0];
        C626936e.A00();
        if (!r1.A0T) {
            str = r1.A0G;
            C626936e.A00();
            A012 = r5.A05(str);
        } else {
            C50262ht r0 = r5.A0W;
            str = r1.A0G;
            A012 = r0.A01(str);
        }
        if (A012 == null || !A012.exists()) {
            return null;
        }
        Bitmap decodeFile = BitmapFactory.decodeFile(A012.getAbsolutePath());
        boolean A0Y = r5.A0B.A0Y(C58422vE.A02, 575);
        if (decodeFile != null && A0Y) {
            r5.A0O.A01(decodeFile, str);
        }
        return decodeFile;
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        C84934Eh r0 = this.A01;
        if (bitmap == null) {
            r0.BVV();
        } else {
            r0.BVb(bitmap);
        }
    }

    public /* bridge */ /* synthetic */ void A0E(Object[] objArr) {
        this.A01.BVF(((Bitmap[]) objArr)[0]);
    }

    public C33731tb(C56932sn r1, C84934Eh r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
