package X;

import android.content.Context;
import android.location.Location;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;

/* renamed from: X.8B1  reason: invalid class name */
public final class AnonymousClass8B1 implements C181068m5 {
    public final Location B92(C159087l6 r6) {
        Context context;
        String str;
        boolean z = true;
        if (AnonymousClass000.A1W(r6)) {
            AnonymousClass72H r2 = AnonymousClass79F.A01;
            if (r6 instanceof C127086Qo) {
                C127086Qo r1 = (C127086Qo) r6;
                C187688xe r4 = (C187688xe) r1.A0G.get(r2);
                C162177rO.A03(r4, "Appropriate Api was not requested.");
                AnonymousClass6RX r42 = (AnonymousClass6RX) r4;
                if (r42 == null) {
                    z = false;
                }
                C162177rO.A04("GoogleApiClient is not configured to use the LocationServices.API Api. Pass thisinto GoogleApiClient.Builder#addApi() to use this feature.", z);
                if (r6 instanceof C127076Qn) {
                    context = ((C127076Qn) r6).A00.A01;
                } else {
                    context = r1.A05;
                }
                if (Build.VERSION.SDK_INT >= 30 && context != null) {
                    try {
                        str = (String) AnonymousClass000.A0K(Context.class, context, "getAttributionTag");
                    } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                    }
                    return r42.A08(str);
                }
                str = null;
                try {
                    return r42.A08(str);
                } catch (Exception unused2) {
                    return null;
                }
            } else {
                throw C18320x8.A0m();
            }
        } else {
            throw AnonymousClass6C7.A0U("GoogleApiClient parameter is required.");
        }
    }
}
