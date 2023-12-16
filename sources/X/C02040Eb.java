package X;

import java.util.Arrays;
import java.util.Locale;

/* renamed from: X.0Eb  reason: invalid class name and case insensitive filesystem */
public final class C02040Eb extends AnonymousClass0JM {
    public final int A00;

    public boolean equals(Object obj) {
        if (this != obj) {
            return obj != null && AnonymousClass001.A1a(obj, C02040Eb.class) && this.A00 == ((C02040Eb) obj).A00;
        }
        return true;
    }

    public String toString() {
        Locale locale = Locale.ENGLISH;
        Object[] objArr = new Object[1];
        AnonymousClass000.A1L(objArr, this.A00);
        String format = String.format(locale, "MediaRestorePreparationStatus/progress %d%%", Arrays.copyOf(objArr, 1));
        C162457s7.A0D(format);
        return format;
    }

    public C02040Eb(int i) {
        this.A00 = i;
    }

    public int hashCode() {
        Object[] A0L = AnonymousClass002.A0L();
        AnonymousClass000.A1L(A0L, this.A00);
        return Arrays.hashCode(A0L);
    }
}
