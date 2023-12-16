package X;

import android.graphics.Path;
import android.util.Log;

/* renamed from: X.0Cm  reason: invalid class name and case insensitive filesystem */
public class C01860Cm extends AnonymousClass0OD {
    public float A00;
    public float A01;
    public Path A02;
    public final /* synthetic */ AnonymousClass0YF A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C01860Cm(Path path, AnonymousClass0YF r2, float f, float f2) {
        super(r2);
        this.A03 = r2;
        this.A00 = f;
        this.A01 = f2;
        this.A02 = path;
    }

    public void A00(String str) {
        AnonymousClass0YF r2 = this.A03;
        String str2 = str;
        if (r2.A0p()) {
            Path A06 = AnonymousClass002.A06();
            r2.A02.A00.getTextPath(str2, 0, str.length(), this.A00, this.A01, A06);
            this.A02.addPath(A06);
        }
        this.A00 += r2.A02.A00.measureText(str);
    }

    public boolean A01(AnonymousClass0CP r5) {
        if (!(r5 instanceof AnonymousClass0CW)) {
            return true;
        }
        Log.w("SVGAndroidRenderer", String.format("Using <textPath> elements in a clip path is not supported.", new Object[0]));
        return false;
    }
}
