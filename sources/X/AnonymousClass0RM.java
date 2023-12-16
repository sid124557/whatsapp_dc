package X;

import android.app.RemoteInput;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.0RM  reason: invalid class name */
public class AnonymousClass0RM {
    public static RemoteInput A00(C03950Me r4) {
        Set set;
        RemoteInput.Builder addExtras = new RemoteInput.Builder(r4.A02).setLabel(r4.A01).setChoices(r4.A05).setAllowFreeFormInput(true).addExtras(r4.A00);
        if (Build.VERSION.SDK_INT >= 26 && (set = r4.A03) != null) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                AnonymousClass0HX.A00(addExtras, AnonymousClass001.A0m(it), true);
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            AnonymousClass0HY.A00(addExtras, 0);
        }
        return addExtras.build();
    }

    public static Bundle A01(Intent intent) {
        return RemoteInput.getResultsFromIntent(intent);
    }
}
