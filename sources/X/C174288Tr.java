package X;

import java.util.LinkedList;

/* renamed from: X.8Tr  reason: invalid class name and case insensitive filesystem */
public class C174288Tr extends LinkedList<byte[]> {
    public int byteSize = 0;

    /* renamed from: A00 */
    public boolean add(byte[] bArr) {
        super.addFirst(bArr);
        int length = this.byteSize + bArr.length + 1;
        while (true) {
            this.byteSize = length;
            if (((long) length) <= 256) {
                return true;
            }
            length = this.byteSize - (((byte[]) super.removeLast()).length + 1);
        }
    }
}
