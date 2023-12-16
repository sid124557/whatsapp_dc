package X;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.24L  reason: invalid class name */
public final class AnonymousClass24L extends Exception {
    public static final long serialVersionUID = 3026362227162912146L;
    public final String message;
    public final List throwables;

    public AnonymousClass24L(List list) {
        this.throwables = Collections.unmodifiableList(AnonymousClass002.A0J(list));
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(list.size());
        A0o.append(" exceptions occurred: ");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C18320x8.A1N(A0o, (Throwable) it.next());
            A0o.append(";");
        }
        this.message = A0o.toString();
    }

    public String getMessage() {
        return this.message;
    }
}
