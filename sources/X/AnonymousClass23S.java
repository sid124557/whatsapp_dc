package X;

/* renamed from: X.23S  reason: invalid class name */
public final class AnonymousClass23S extends Error {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass23S(String str) {
        super(str);
        C162457s7.A0J(str, 1);
    }

    public static AnonymousClass23S A00() {
        StringBuilder sb = new StringBuilder();
        sb.append("An operation is not implemented: ");
        sb.append("Not yet implemented");
        return new AnonymousClass23S(sb.toString());
    }

    public AnonymousClass23S() {
        this("An operation is not implemented.");
    }
}
