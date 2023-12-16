package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.3EA  reason: invalid class name */
public final class AnonymousClass3EA implements AnonymousClass4E0 {
    public final C60482yd A00;

    public AnonymousClass3EA(C60482yd r2) {
        C162457s7.A0J(r2, 1);
        this.A00 = r2;
    }

    public void BlQ(Activity activity, AnonymousClass2ZN r8, Map map) {
        Intent intent;
        Bundle extras;
        String string;
        if (activity != null && (intent = activity.getIntent()) != null && (extras = intent.getExtras()) != null && (string = extras.getString("fds_observer_id")) != null && map != null) {
            LinkedHashMap A0r = C18320x8.A0r();
            Iterator A0q = AnonymousClass000.A0q(map);
            while (A0q.hasNext()) {
                Map.Entry A0w = AnonymousClass001.A0w(A0q);
                if (!(A0w.getKey() == null || A0w.getValue() == null)) {
                    C18270x1.A1N(A0r, A0w);
                }
            }
            LinkedHashMap A03 = C57692u3.A03(A0r);
            Iterator A16 = AnonymousClass0x9.A16(A0r);
            while (A16.hasNext()) {
                Map.Entry A0w2 = AnonymousClass001.A0w(A16);
                A03.put(String.valueOf(A0w2.getKey()), A0w2.getValue());
            }
            this.A00.A02(string).A01(new C69403Ww(A03));
        }
    }

    public String B5N(Activity activity) {
        throw AnonymousClass23S.A00();
    }

    public String B9r(Activity activity) {
        throw AnonymousClass23S.A00();
    }
}
