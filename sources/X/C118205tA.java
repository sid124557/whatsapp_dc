package X;

/* renamed from: X.5tA  reason: invalid class name and case insensitive filesystem */
public final class C118205tA extends RuntimeException {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C118205tA(String str) {
        super(str);
        C162457s7.A0J(str, 1);
    }

    public static C118205tA A00(String str, StringBuilder sb) {
        sb.append(str);
        return new C118205tA(sb.toString());
    }
}
