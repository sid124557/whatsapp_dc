package X;

import android.app.Person;
import android.graphics.drawable.Icon;
import androidx.core.graphics.drawable.IconCompat;

/* renamed from: X.0HW  reason: invalid class name */
public class AnonymousClass0HW {
    public static Person A00(C04440Of r2) {
        Icon icon;
        Person.Builder name = new Person.Builder().setName(r2.A01);
        IconCompat iconCompat = r2.A00;
        if (iconCompat != null) {
            icon = iconCompat.A08();
        } else {
            icon = null;
        }
        return name.setIcon(icon).setUri(r2.A03).setKey(r2.A02).setBot(r2.A04).setImportant(r2.A05).build();
    }
}
