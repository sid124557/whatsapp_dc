package X;

/* renamed from: X.7hm  reason: invalid class name and case insensitive filesystem */
public abstract class C157127hm {
    public static final C157127hm A00 = new C130016bF(new C152607Zn("base16()", "0123456789ABCDEF".toCharArray()));
    public static final C157127hm A01 = new C130026bG(new C152607Zn("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567".toCharArray()), '=');
    public static final C157127hm A02 = new C130026bG(new C152607Zn("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV".toCharArray()), '=');
    public static final C157127hm A03 = new C130006bE(new C152607Zn("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".toCharArray()), '=');
    public static final C157127hm A04 = new C130006bE(new C152607Zn("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_".toCharArray()), '=');
}
