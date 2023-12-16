package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import java.util.Map;

/* renamed from: X.3XT  reason: invalid class name */
public final class AnonymousClass3XT implements C84184Bj {
    public final C69263Wi A00;
    public final C59502x1 A01;
    public final AnonymousClass2XW A02;

    public void Bgk(Activity activity, C41182Jg r6, Map map) {
        Object obj;
        String str;
        Intent intent;
        Bundle extras;
        Map map2;
        if (map == null) {
            map = C72043d5.A00();
        }
        Object obj2 = map.get("values");
        String str2 = null;
        if (!(obj2 instanceof Map) || (map2 = (Map) obj2) == null) {
            obj = null;
        } else {
            obj = map2.get("in_pin_code");
        }
        if (obj instanceof String) {
            str = (String) obj;
        } else {
            str = null;
        }
        if (!(activity == null || (intent = activity.getIntent()) == null || (extras = intent.getExtras()) == null)) {
            str2 = extras.getString("chat_id");
        }
        this.A01.A01(new AnonymousClass3D0(r6, this), str, str2);
    }

    public AnonymousClass3XT(C69263Wi r1, C59502x1 r2, AnonymousClass2XW r3) {
        C18260x0.A0R(r3, r1);
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r1;
    }
}
