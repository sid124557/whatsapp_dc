package X;

import android.graphics.Path;

/* renamed from: X.0gj  reason: invalid class name and case insensitive filesystem */
public class C09770gj implements C17010uP {
    public float A00;
    public float A01;
    public Path A02 = AnonymousClass002.A06();
    public final /* synthetic */ AnonymousClass0YF A03;

    public void AxI(float f, float f2, float f3, float f4, float f5, boolean z, boolean z2) {
        AnonymousClass0YF.A09(this, this.A00, this.A01, f, f2, f3, f4, f5, z, z2);
        this.A00 = f4;
        this.A01 = f5;
    }

    public C09770gj(C09790gl r2, AnonymousClass0YF r3) {
        this.A03 = r3;
        if (r2 != null) {
            r2.A02(this);
        }
    }

    public void B1B(float f, float f2, float f3, float f4, float f5, float f6) {
        this.A02.cubicTo(f, f2, f3, f4, f5, f6);
        this.A00 = f5;
        this.A01 = f6;
    }

    public void BJh(float f, float f2) {
        this.A02.lineTo(f, f2);
        this.A00 = f;
        this.A01 = f2;
    }

    public void BLL(float f, float f2) {
        this.A02.moveTo(f, f2);
        this.A00 = f;
        this.A01 = f2;
    }

    public void Bhz(float f, float f2, float f3, float f4) {
        this.A02.quadTo(f, f2, f3, f4);
        this.A00 = f3;
        this.A01 = f4;
    }

    public void close() {
        this.A02.close();
    }
}
