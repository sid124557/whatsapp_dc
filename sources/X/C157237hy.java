package X;

import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: X.7hy  reason: invalid class name and case insensitive filesystem */
public class C157237hy {
    public static final Pattern A01 = Pattern.compile("\\s*,\\s*");
    public final List A00;

    public C157237hy(List list) {
        this.A00 = Collections.unmodifiableList(list);
    }

    public String toString() {
        return AnonymousClass000.A0W(C160947oi.A00(this.A00, ",", ""), AnonymousClass001.A0p());
    }
}
