package X;

import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;

/* renamed from: X.3Vo  reason: invalid class name and case insensitive filesystem */
public final class C69063Vo implements AnonymousClass4GG {
    public final C183538qC A00;

    public C69063Vo(C183538qC r2) {
        C162457s7.A0J(r2, 1);
        this.A00 = r2;
    }

    public void BhW(C624134x r3, C378824k r4) {
        C162457s7.A0J(r3, 0);
        if (AnonymousClass000.A1U(r3.A0A & ZipDecompressor.UNZIP_BUFFER_SIZE, ZipDecompressor.UNZIP_BUFFER_SIZE)) {
            ((C55282q6) this.A00.get()).A03(r3);
            if (r4 != null) {
                throw C18260x0.A02(C69063Vo.class);
            }
        }
    }
}
