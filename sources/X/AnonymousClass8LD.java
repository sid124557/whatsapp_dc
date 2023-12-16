package X;

import java.io.Serializable;
import java.util.regex.Pattern;

/* renamed from: X.8LD  reason: invalid class name */
public final class AnonymousClass8LD implements Serializable {
    public static final long serialVersionUID = 0;
    public final int flags;
    public final String pattern;

    private final Object readResolve() {
        Pattern compile = Pattern.compile(this.pattern, this.flags);
        C162457s7.A0D(compile);
        return new C116975rB(compile);
    }

    public AnonymousClass8LD(String str, int i) {
        this.pattern = str;
        this.flags = i;
    }
}
