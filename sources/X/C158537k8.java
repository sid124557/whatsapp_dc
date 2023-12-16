package X;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: X.7k8  reason: invalid class name and case insensitive filesystem */
public class C158537k8 {
    public int A00;
    public int A01;
    public ArrayList A02;
    public Map A03;

    public AnonymousClass7SO A00(short s) {
        int intValue;
        Number number = (Number) this.A03.get(Short.valueOf(s));
        if (number == null || (intValue = number.intValue()) >= this.A00) {
            return null;
        }
        return (AnonymousClass7SO) this.A02.get(intValue);
    }

    public C158537k8(byte[] bArr) {
        int length = bArr.length;
        this.A03 = AnonymousClass001.A0t();
        int i = 0;
        this.A01 = 0;
        this.A00 = 0;
        ArrayList A0s = AnonymousClass001.A0s();
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        while (i < length) {
            short s = wrap.getShort();
            int A002 = C162257rX.A00(wrap);
            byte[] bArr2 = new byte[A002];
            wrap.get(bArr2);
            A0s.add(new AnonymousClass7SO(bArr2, s));
            C18280x3.A1D(Short.valueOf(s), this.A03, this.A00);
            this.A00++;
            i += A002 + 4;
        }
        if (i == length) {
            this.A01 = i;
            this.A02 = AnonymousClass001.A0s();
            this.A02 = AnonymousClass002.A0J(A0s);
            return;
        }
        throw C143806zV.A00("Error while parsing extension");
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("extensions{extensions=");
        C18320x8.A1P(A0o, this.A02.toArray());
        A0o.append(", idx=");
        A0o.append(this.A00);
        A0o.append(", totalNetworkBytes=");
        A0o.append(this.A01);
        return AnonymousClass000.A0d(A0o);
    }

    public C158537k8() {
        this.A00 = 0;
        this.A01 = 0;
        this.A02 = AnonymousClass001.A0s();
    }
}
