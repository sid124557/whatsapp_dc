package X;

import java.io.File;
import java.util.List;

/* renamed from: X.1t9  reason: invalid class name */
public final class AnonymousClass1t9 extends AnonymousClass5ZM {
    public final C621033m A00;
    public final AnonymousClass3QO A01;
    public final C30721mu A02;
    public final File A03;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        C30721mu r5 = this.A02;
        File file = this.A03;
        if (!file.exists()) {
            return null;
        }
        List A022 = AnonymousClass31P.A02(file, 64);
        file.delete();
        int size = A022.size();
        if (size != 64) {
            return null;
        }
        byte[] bArr = new byte[size];
        int i = 0;
        do {
            bArr[i] = ((Number) A022.get(i)).byteValue();
            i++;
        } while (i < size);
        r5.A23(new C60072xx(bArr, 0));
        return null;
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        this.A00.A0N(this.A01, this.A02);
    }

    public AnonymousClass1t9(C621033m r1, AnonymousClass3QO r2, C30721mu r3, File file) {
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
        this.A03 = file;
    }
}
