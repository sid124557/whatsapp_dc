package X;

/* renamed from: X.6zy  reason: invalid class name and case insensitive filesystem */
public final class C144076zy extends IndexOutOfBoundsException {
    public static final long serialVersionUID = 160715609518896765L;
    public final String className;
    public final int constantPoolCount;

    public C144076zy(String str, int i) {
        super(AnonymousClass000.A0V("Class too large: ", str, AnonymousClass001.A0o()));
        this.className = str;
        this.constantPoolCount = i;
    }
}
