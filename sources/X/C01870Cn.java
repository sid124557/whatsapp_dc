package X;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;

/* renamed from: X.0Cn  reason: invalid class name and case insensitive filesystem */
public class C01870Cn extends AnonymousClass0OD {
    public float A00;
    public float A01;
    public RectF A02 = AnonymousClass002.A07();
    public final /* synthetic */ AnonymousClass0YF A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C01870Cn(AnonymousClass0YF r2, float f, float f2) {
        super(r2);
        this.A03 = r2;
        this.A00 = f;
        this.A01 = f2;
    }

    public void A00(String str) {
        AnonymousClass0YF r4 = this.A03;
        if (r4.A0p()) {
            Rect A0N = AnonymousClass001.A0N();
            r4.A02.A00.getTextBounds(str, 0, str.length(), A0N);
            RectF rectF = new RectF(A0N);
            rectF.offset(this.A00, this.A01);
            this.A02.union(rectF);
        }
        this.A00 += r4.A02.A00.measureText(str);
    }

    public boolean A01(AnonymousClass0CP r7) {
        if (!(r7 instanceof AnonymousClass0CW)) {
            return true;
        }
        AnonymousClass0CW r2 = (AnonymousClass0CW) r7;
        AnonymousClass0NJ A04 = r7.A01.A04(r2.A02);
        if (A04 == null) {
            AnonymousClass0YF.A0D("TextPath path reference '%s' not found", r2.A02);
            return false;
        }
        AnonymousClass0C6 r4 = (AnonymousClass0C6) A04;
        Path path = new C09770gj(r4.A00, this.A03).A02;
        Matrix matrix = r4.A00;
        if (matrix != null) {
            path.transform(matrix);
        }
        RectF A07 = AnonymousClass002.A07();
        path.computeBounds(A07, true);
        this.A02.union(A07);
        return false;
    }
}
