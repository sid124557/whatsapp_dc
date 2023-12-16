package X;

import android.media.ImageReader;

/* renamed from: X.96b  reason: invalid class name and case insensitive filesystem */
public final class C1904096b extends C1904596i implements C187538xN {
    public ImageReader A00;
    public C1680483x A01;
    public C194949Ve A02;
    public boolean A03;

    public void BnH(int i) {
        C194949Ve r1 = this.A02;
        if (r1 != null) {
            r1.A06 = -i;
        }
    }

    public void Bnw(int i, int i2, boolean z) {
        if (!this.A03) {
            ImageReader imageReader = this.A00;
            if (imageReader == null) {
                imageReader = ImageReader.newInstance(i, i2, 1, 3);
                this.A00 = imageReader;
            }
            C194949Ve r2 = new C194949Ve(imageReader.getSurface(), false);
            r2.A09 = 2;
            r2.A07 = 1;
            C1680483x r0 = new C1680483x(new C157207hv(), r2);
            r0.A04 = z;
            this.A01 = r0;
            this.A02 = r2;
            AnonymousClass71V r22 = C203659o6.A00;
            if (this.A03) {
                ((C1903895p) ((C203659o6) this.A00.B5j(r22))).A09.A02.AwS(this.A01, 0);
                this.A03 = true;
                return;
            }
            throw AnonymousClass001.A0e("Component not initialized.");
        }
    }

    public ImageReader B8G() {
        return this.A00;
    }

    public C1904096b(C203449ni r1) {
        super(r1);
    }
}
