package X;

import android.content.Context;
import com.facebook.cameracore.mediapipeline.featureconfig.ProductFeatureConfig;
import com.facebook.cameracore.mediapipeline.services.networking.interfaces.NetworkPolicyConfiguration;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.9V9  reason: invalid class name */
public class AnonymousClass9V9 {
    public Map A00;
    public final C193659Pm A01;
    public final ProductFeatureConfig A02;
    public final C193289Nx A03;
    public final NetworkPolicyConfiguration A04;
    public final HashMap A05;

    public static AnonymousClass9VR A00(Context context) {
        AnonymousClass9VR r1 = new AnonymousClass9VR();
        r1.A02 = new C193289Nx(context);
        return r1;
    }

    public AnonymousClass9SF A01(AnonymousClass9U7 r3) {
        AnonymousClass9SF r0 = (AnonymousClass9SF) this.A05.get(r3);
        if (r0 != null) {
            return r0;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Invalid configuration key: ");
        A0o.append(r3);
        throw AnonymousClass000.A0F(" Please use hasConfiguration() to check if the configuration is available.", A0o);
    }

    public AnonymousClass9V9(AnonymousClass9VR r3) {
        HashMap A0t = AnonymousClass001.A0t();
        this.A05 = A0t;
        A0t.putAll(r3.A05);
        this.A01 = r3.A00;
        this.A00 = r3.A04;
        this.A02 = r3.A01;
        this.A03 = r3.A02;
        this.A04 = r3.A03;
    }
}
