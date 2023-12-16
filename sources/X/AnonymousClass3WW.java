package X;

import android.graphics.Bitmap;
import java.util.List;

/* renamed from: X.3WW  reason: invalid class name */
public class AnonymousClass3WW implements C185158tB {
    public final /* synthetic */ AnonymousClass121 A00;
    public final /* synthetic */ AnonymousClass12V A01;

    public AnonymousClass3WW(AnonymousClass121 r1, AnonymousClass12V r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public void Be2(Bitmap bitmap) {
        AnonymousClass121 r1 = this.A00;
        int A012 = this.A01.A01();
        List A002 = AnonymousClass121.A00(r1);
        if (A012 >= 0 && A012 < A002.size()) {
            ((C53082mW) A002.get(A012)).A01 = true;
        }
    }

    public void BVO() {
    }

    public void Be1() {
    }
}
