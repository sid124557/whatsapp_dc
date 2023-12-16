package X;

import java.util.Collections;
import java.util.List;

/* renamed from: X.7M6  reason: invalid class name */
public final class AnonymousClass7M6 {
    public final int A00;
    public final String A01;
    public final List A02;
    public final byte[] A03;

    public AnonymousClass7M6(String str, List list, byte[] bArr, int i) {
        List unmodifiableList;
        this.A00 = i;
        this.A01 = str;
        if (list == null) {
            unmodifiableList = Collections.emptyList();
        } else {
            unmodifiableList = Collections.unmodifiableList(list);
        }
        this.A02 = unmodifiableList;
        this.A03 = bArr;
    }
}
