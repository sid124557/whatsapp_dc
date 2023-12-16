package X;

import java.text.Collator;
import java.util.Locale;

/* renamed from: X.5tE  reason: invalid class name and case insensitive filesystem */
public class C118245tE extends ThreadLocal {
    public final /* synthetic */ Locale A00;

    public C118245tE(Locale locale) {
        this.A00 = locale;
    }

    public /* bridge */ /* synthetic */ Object initialValue() {
        Collator instance = Collator.getInstance(this.A00);
        instance.setDecomposition(1);
        instance.setStrength(0);
        return instance;
    }
}
