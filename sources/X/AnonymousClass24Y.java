package X;

import java.util.AbstractCollection;

/* renamed from: X.24Y  reason: invalid class name */
public class AnonymousClass24Y extends Exception {
    public static final long serialVersionUID = 1;
    public String bufString;

    public static AnonymousClass24Y A01(String str) {
        return new AnonymousClass24Y(str);
    }

    public static AnonymousClass24Y A00(AnonymousClass36K r0, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(r0.A00);
        return new AnonymousClass24Y(sb.toString());
    }

    public static AnonymousClass24Y A02(String str, String str2, StringBuilder sb) {
        sb.append(str);
        sb.append(str2);
        return new AnonymousClass24Y(sb.toString());
    }

    public static AnonymousClass24Y A03(String str, StringBuilder sb, Throwable th, AbstractCollection abstractCollection) {
        sb.append(str);
        sb.append(th.getMessage());
        abstractCollection.add(sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Could not parse stanza into valid response class, encountered the following errors for each possible response:\n");
        sb2.append(C107575bX.A08("\n", abstractCollection));
        return new AnonymousClass24Y(sb2.toString());
    }

    public AnonymousClass24Y(String str) {
        super(str);
    }

    public AnonymousClass24Y(String str, String str2) {
        super(str);
        this.bufString = str2;
    }

    public AnonymousClass24Y(Throwable th) {
        super(th);
    }

    public AnonymousClass24Y() {
    }
}
