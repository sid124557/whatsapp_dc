package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import java.util.Map;

/* renamed from: X.3XU  reason: invalid class name */
public final class AnonymousClass3XU implements C84184Bj {
    public final AnonymousClass1Uc A00;
    public final AnonymousClass1VX A01;
    public final C60482yd A02;

    public void Bgk(Activity activity, C41182Jg r8, Map map) {
        Intent intent;
        Bundle extras;
        String str;
        String str2;
        int i;
        Intent intent2;
        Bundle extras2;
        String string;
        if (!(activity == null || (intent2 = activity.getIntent()) == null || (extras2 = intent2.getExtras()) == null || (string = extras2.getString("fds_observer_id")) == null)) {
            this.A02.A02(string).A01(new C69293Wl());
        }
        if (this.A01.A0Y(C58422vE.A02, 4510) && activity != null && (intent = activity.getIntent()) != null && (extras = intent.getExtras()) != null) {
            String string2 = extras.getString("flow_id");
            int i2 = 0;
            if (map == null || !map.containsKey("is_valid") || AnonymousClass0x2.A1Z(map, "is_valid")) {
                AnonymousClass1Uc r0 = this.A00;
                if (string2 != null) {
                    i2 = string2.hashCode();
                }
                r0.A0D(i2, 2);
                return;
            }
            if (map.containsKey("error_type")) {
                str = C18290x4.A0p("error_type", map);
            } else {
                str = "UNKNOWN";
            }
            if (map.containsKey("error_message")) {
                str2 = C18290x4.A0p("error_message", map);
            } else {
                str2 = null;
            }
            AnonymousClass1Uc r1 = this.A00;
            if (string2 != null) {
                i = string2.hashCode();
            } else {
                i = 0;
            }
            r1.A0C(i, str, str2);
            if (string2 != null) {
                i2 = string2.hashCode();
            }
            r1.A0D(i2, 3);
        }
    }

    public AnonymousClass3XU(AnonymousClass1Uc r1, AnonymousClass1VX r2, C60482yd r3) {
        C18260x0.A0Q(r2, r3);
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
    }
}
