package X;

import java.util.Collections;
import java.util.List;

/* renamed from: X.26G  reason: invalid class name */
public final class AnonymousClass26G {
    public static final String A00(int i, int i2) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("status_message_row_id IN  (");
        List nCopies = Collections.nCopies(i, "?");
        C162457s7.A0D(nCopies);
        CharSequence charSequence = "";
        A0o.append(C73723fy.A07(",", "", charSequence, "...", nCopies, (AnonymousClass4GQ) null, -1));
        A0o.append(") AND destination IN (");
        List nCopies2 = Collections.nCopies(i2, "?");
        C162457s7.A0D(nCopies2);
        return C18260x0.A07(C73723fy.A07(",", "", charSequence, "...", nCopies2, (AnonymousClass4GQ) null, -1), A0o);
    }
}
