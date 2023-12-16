package X;

import com.google.protobuf.CodedOutputStream;

/* renamed from: X.730  reason: invalid class name */
public abstract class AnonymousClass730 {
    public static int A04(int i) {
        return CodedOutputStream.A01(i << 3);
    }

    public static int A05(int i) {
        return CodedOutputStream.A01((i >> 31) ^ (i << 1));
    }

    public static void A06(CodedOutputStream codedOutputStream, int i) {
        codedOutputStream.A07((i << 3) | 2);
    }
}
