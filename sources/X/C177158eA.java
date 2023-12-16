package X;

/* renamed from: X.8eA  reason: invalid class name and case insensitive filesystem */
public class C177158eA extends C158947kq {
    public C177158eA(C185768uD r2) {
        if (!(r2 instanceof AnonymousClass8QG)) {
            this.A01 = r2;
            this.A05 = new byte[(r2.B4g() * 2)];
            this.A00 = 0;
            return;
        }
        throw AnonymousClass001.A0c("CTSBlockCipher can only accept ECB, or CBC ciphers");
    }
}
