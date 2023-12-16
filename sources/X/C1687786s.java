package X;

import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;

/* renamed from: X.86s  reason: invalid class name and case insensitive filesystem */
public final class C1687786s implements C185598tw {
    public final byte[] A00 = new byte[ZipDecompressor.UNZIP_BUFFER_SIZE];

    public void B3T(C166527yp r1) {
    }

    public int Bkf(C180768lb r4, int i, int i2, boolean z) {
        byte[] bArr = this.A00;
        int read = r4.read(bArr, 0, Math.min(bArr.length, i));
        if (read != -1) {
            return read;
        }
        if (z) {
            return -1;
        }
        throw AnonymousClass6CA.A0M();
    }

    public /* synthetic */ void Bkc(C161467pi r1, int i) {
        r1.A0T(i);
    }

    public void Bkd(C161467pi r1, int i, int i2) {
        r1.A0T(i);
    }

    public void Bkh(AnonymousClass7WZ r1, int i, int i2, int i3, long j) {
    }
}
