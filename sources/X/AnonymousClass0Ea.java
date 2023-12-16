package X;

import java.util.Arrays;
import java.util.Locale;

/* renamed from: X.0Ea  reason: invalid class name */
public final class AnonymousClass0Ea extends AnonymousClass0JM {
    public final int A00;

    public boolean equals(Object obj) {
        if (this != obj) {
            return obj != null && AnonymousClass001.A1a(obj, AnonymousClass0Ea.class) && this.A00 == ((AnonymousClass0Ea) obj).A00;
        }
        return true;
    }

    public String toString() {
        Locale locale = Locale.ENGLISH;
        Object[] objArr = new Object[1];
        AnonymousClass000.A1L(objArr, this.A00);
        String format = String.format(locale, "BackupPreparationStatus/progress %d%%", Arrays.copyOf(objArr, 1));
        C162457s7.A0D(format);
        return format;
    }

    public AnonymousClass0Ea(int i) {
        this.A00 = i;
    }

    public int hashCode() {
        Object[] A0L = AnonymousClass002.A0L();
        AnonymousClass000.A1L(A0L, this.A00);
        return Arrays.hashCode(A0L);
    }
}
