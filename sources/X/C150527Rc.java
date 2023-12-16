package X;

import java.util.List;

/* renamed from: X.7Rc  reason: invalid class name and case insensitive filesystem */
public class C150527Rc {
    public final /* synthetic */ C140346ta A00;

    public C150527Rc(C140346ta r1) {
        this.A00 = r1;
    }

    public byte[] A00() {
        C140346ta r2 = this.A00;
        C626936e.A0C(r2.A02);
        List<Object> list = r2.A07;
        if (list.size() == 0) {
            return null;
        }
        int size = list.size();
        int i = r2.A03;
        byte[] bArr = new byte[(size * i)];
        int i2 = 0;
        for (Object arraycopy : list) {
            System.arraycopy(arraycopy, 0, bArr, i2, i);
            i2 += i;
        }
        return bArr;
    }
}
