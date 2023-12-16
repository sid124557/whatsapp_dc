package X;

import com.whatsapp.wamsys.JniBridge;

/* renamed from: X.2ex  reason: invalid class name and case insensitive filesystem */
public class C48472ex {
    public final int A00;
    public final byte[] A01;

    public boolean A01() {
        int i = this.A00;
        if (i == -1008 || i == -1002 || i == -1003 || i == -1005 || i == -1203 || i == -1202 || i == -1204 || i == -1205 || i == -1206) {
            return true;
        }
        return false;
    }

    public C48472ex(byte[] bArr, int i) {
        this.A01 = bArr;
        this.A00 = i;
    }

    public static C48472ex A00(Object obj, byte[] bArr) {
        JniBridge.getInstance();
        return new C48472ex(bArr, (int) JniBridge.jvidispatchIIO(1, (long) 54, obj));
    }
}
