package X;

import androidx.core.view.inputmethod.EditorInfoCompat;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: X.88i  reason: invalid class name and case insensitive filesystem */
public final class C1691888i implements C183898qq {
    public byte[] A00;
    public final long A01 = C156527gm.A03.getAndIncrement();
    public final C157677ih A02;
    public final C1691188b A03;

    public void Ayc() {
    }

    public void BJl() {
        int i;
        byte[] bArr;
        C1691188b r3 = this.A03;
        r3.A00 = 0;
        try {
            r3.Bfx(this.A02);
            do {
                i = (int) r3.A00;
                bArr = this.A00;
                if (bArr == null) {
                    bArr = new byte[EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH];
                } else {
                    int length = bArr.length;
                    if (i == length) {
                        bArr = Arrays.copyOf(bArr, length * 2);
                    }
                }
                this.A00 = bArr;
            } while (r3.read(bArr, i, bArr.length - i) != -1);
        } finally {
            try {
                r3.close();
            } catch (IOException unused) {
            }
        }
    }

    public C1691888i(C187668xc r3, C157677ih r4) {
        this.A02 = r4;
        this.A03 = new C1691188b(r3);
    }
}
