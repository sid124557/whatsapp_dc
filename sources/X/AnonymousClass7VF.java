package X;

import com.google.protobuf.CodedOutputStream;

/* renamed from: X.7VF  reason: invalid class name */
public final class AnonymousClass7VF {
    public final CodedOutputStream A00;

    public void A00(C186358vA r4, Object obj, int i) {
        CodedOutputStream codedOutputStream = this.A00;
        int i2 = i << 3;
        codedOutputStream.A07(i2 | 3);
        r4.Bsk(codedOutputStream.A00, obj);
        codedOutputStream.A07(i2 | 4);
    }

    public AnonymousClass7VF(CodedOutputStream codedOutputStream) {
        this.A00 = codedOutputStream;
        codedOutputStream.A00 = this;
    }
}
