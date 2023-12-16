package X;

/* renamed from: X.8db  reason: invalid class name and case insensitive filesystem */
public class C176808db extends C177088e3 implements C183628qM {
    public final char[] A00;

    public String BDM() {
        return new String(this.A00);
    }

    public int hashCode() {
        char[] cArr = this.A00;
        int length = cArr.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            i = (i * 257) ^ cArr[length];
        }
    }

    public String toString() {
        return new String(this.A00);
    }

    public C176808db(char[] cArr) {
        this.A00 = cArr;
    }
}
