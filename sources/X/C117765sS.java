package X;

import java.text.Collator;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

/* renamed from: X.5sS  reason: invalid class name and case insensitive filesystem */
public class C117765sS implements Comparator {
    public final Collator A00;
    public final List A01 = Collections.emptyList();

    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        AnonymousClass7IS r6 = (AnonymousClass7IS) obj;
        AnonymousClass7IS r7 = (AnonymousClass7IS) obj2;
        List list = this.A01;
        int indexOf = list.indexOf(r6.A00);
        int indexOf2 = list.indexOf(r7.A00);
        if (indexOf == -1) {
            if (indexOf2 != -1) {
                return 1;
            }
            Collator collator = this.A00;
            String str = r6.A01;
            if (str.startsWith("ال")) {
                str = str.substring(2);
            }
            String str2 = r7.A01;
            if (str2.startsWith("ال")) {
                str2 = str2.substring(2);
            }
            return collator.compare(str, str2);
        } else if (indexOf2 != -1) {
            return indexOf - indexOf2;
        } else {
            return -1;
        }
    }

    public C117765sS(Locale locale) {
        this.A00 = Collator.getInstance(locale);
    }
}
