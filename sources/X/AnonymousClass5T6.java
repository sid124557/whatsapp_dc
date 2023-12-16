package X;

import android.content.ContentValues;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

/* renamed from: X.5T6  reason: invalid class name */
public class AnonymousClass5T6 {
    public ContentValues A00 = AnonymousClass0x9.A06();
    public String A01 = "";
    public String A02 = "";
    public List A03 = AnonymousClass001.A0s();
    public Set A04 = AnonymousClass002.A0K();
    public Set A05 = AnonymousClass002.A0K();
    public byte[] A06;

    public boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass5T6)) {
            return false;
        }
        AnonymousClass5T6 r6 = (AnonymousClass5T6) obj;
        String str = this.A01;
        if (str == null || !str.equals(r6.A01) || !this.A00.equals(r6.A00) || !this.A04.equals(r6.A04) || !this.A05.equals(r6.A05)) {
            return false;
        }
        byte[] bArr = this.A06;
        if (bArr != null && Arrays.equals(bArr, r6.A06)) {
            return true;
        }
        if (!this.A02.equals(r6.A02)) {
            return false;
        }
        List list = this.A03;
        List list2 = r6.A03;
        if (list.equals(list2) || list.size() == 1 || list2.size() == 1) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        Object obj = this.A06;
        Object[] objArr = new Object[5];
        objArr[0] = this.A01;
        objArr[1] = this.A00;
        objArr[2] = this.A04;
        objArr[3] = this.A05;
        if (obj == null) {
            return C18310x6.A08(this.A02, objArr, 4);
        }
        objArr[4] = obj;
        return Arrays.deepHashCode(objArr);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("propName: ");
        A0o.append(this.A01);
        A0o.append(", paramMap: ");
        AnonymousClass000.A1B(this.A00, A0o);
        A0o.append(", propmMap_TYPE: ");
        AnonymousClass000.A1B(this.A04, A0o);
        A0o.append(", propGroupSet: ");
        AnonymousClass000.A1B(this.A05, A0o);
        List list = this.A03;
        if (list.size() > 1) {
            AnonymousClass000.A1H(", propValue_vector size: ", A0o, list);
        }
        byte[] bArr = this.A06;
        if (bArr != null) {
            A0o.append(", propValue_bytes size: ");
            A0o.append(bArr.length);
        }
        A0o.append(", propValue: ");
        return AnonymousClass000.A0X(this.A02, A0o);
    }
}
