package X;

import android.content.Context;
import java.io.OutputStream;
import java.util.Arrays;

/* renamed from: X.2rk  reason: invalid class name and case insensitive filesystem */
public abstract class C56292rk {
    public final byte[] A00;
    public final byte[] A01;

    public void A02(C54292oU r9) {
        C22251Iq r1 = (C22251Iq) this;
        C162457s7.A0J(r9, 0);
        Context context = r9.A00;
        C04260Nl r0 = r1.A00;
        String str = r0.A00;
        byte[] bArr = r0.A04;
        byte[] bArr2 = r1.A03;
        if (bArr2 != null) {
            byte[] bArr3 = r1.A01;
            if (bArr3 != null) {
                C06550Ye.A0E(context, str, bArr, bArr2, bArr3, r0.A02);
                AnonymousClass0NX A05 = C06550Ye.A05(context);
                if (A05 != null) {
                    A05.toString();
                    return;
                }
                return;
            }
            throw AnonymousClass001.A0c("backup-prefix/get-key/account hash is null");
        }
        throw AnonymousClass001.A0c("backup-prefix/get-key/key is null");
    }

    public void A03(OutputStream outputStream) {
        C04260Nl r6 = ((C22251Iq) this).A00;
        int i = 0;
        byte[][] bArr = {C06550Ye.A00, new byte[]{Byte.parseByte(r6.A00)}, r6.A04, r6.A02, r6.A01};
        do {
            byte[] bArr2 = bArr[i];
            Arrays.toString(bArr2);
            outputStream.write(bArr2);
            i++;
        } while (i < 5);
    }

    public byte[] A05() {
        return ((C22251Iq) this).A02;
    }

    public byte[] A06() {
        return ((C22251Iq) this).A03;
    }

    public boolean A04(String str) {
        return false;
    }

    public C56292rk(byte[] bArr, byte[] bArr2) {
        this.A00 = bArr;
        this.A01 = bArr2;
    }

    public C130766cV A00() {
        return null;
    }

    public String A01() {
        return null;
    }

    public final byte[] A07() {
        byte[] A06 = A06();
        if (A06 != null) {
            return A06;
        }
        throw AnonymousClass001.A0e("backup-prefix/get-key/key is null");
    }
}
