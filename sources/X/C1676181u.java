package X;

import androidx.core.view.inputmethod.EditorInfoCompat;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: X.81u  reason: invalid class name and case insensitive filesystem */
public final class C1676181u implements C183688qS {
    public int A00;
    public byte[] A01;
    public final C185788uF A02;
    public final C161387pX A03;

    /* JADX INFO: finally extract failed */
    public void BJl() {
        int i = 0;
        this.A00 = 0;
        try {
            C185788uF r3 = this.A02;
            r3.Bfw(this.A03);
            do {
                int i2 = this.A00 + i;
                this.A00 = i2;
                byte[] bArr = this.A01;
                if (bArr == null) {
                    bArr = new byte[EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH];
                } else {
                    int length = bArr.length;
                    if (i2 == length) {
                        bArr = Arrays.copyOf(bArr, length * 2);
                    }
                    int i3 = this.A00;
                    i = r3.read(bArr, i3, bArr.length - i3);
                }
                this.A01 = bArr;
                int i32 = this.A00;
                i = r3.read(bArr, i32, bArr.length - i32);
            } while (i != -1);
            try {
                r3.close();
            } catch (IOException unused) {
            }
        } catch (Throwable th) {
            C185788uF r0 = this.A02;
            if (r0 != null) {
                try {
                    r0.close();
                } catch (IOException unused2) {
                }
            }
            throw th;
        }
    }

    public void Ayc() {
    }

    public C1676181u(C185788uF r1, C161387pX r2) {
        this.A03 = r2;
        this.A02 = r1;
    }
}
