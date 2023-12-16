package X;

import com.facebook.cameracore.mediapipeline.featureconfig.ProductFeatureConfig;
import com.facebook.cameracore.mediapipeline.services.networking.interfaces.NetworkPolicyConfiguration;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.9VR  reason: invalid class name */
public class AnonymousClass9VR {
    public C193659Pm A00;
    public ProductFeatureConfig A01;
    public C193289Nx A02;
    public NetworkPolicyConfiguration A03;
    public Map A04;
    public final HashMap A05;

    public AnonymousClass9V9 A00() {
        return new AnonymousClass9V9(this);
    }

    public void A01(AnonymousClass9U7 r2, AnonymousClass9SF r3) {
        this.A05.put(r2, r3);
    }

    public AnonymousClass9VR(AnonymousClass9V9 r3) {
        HashMap A0t = AnonymousClass001.A0t();
        this.A05 = A0t;
        this.A04 = AnonymousClass001.A0t();
        A0t.putAll(r3.A05);
        this.A00 = r3.A01;
        this.A04 = r3.A00;
        this.A01 = r3.A02;
        this.A02 = r3.A03;
        this.A03 = r3.A04;
    }

    public void A02(ProductFeatureConfig productFeatureConfig) {
        this.A01 = productFeatureConfig;
    }

    public AnonymousClass9VR() {
        this.A05 = AnonymousClass001.A0t();
        this.A04 = AnonymousClass001.A0t();
    }
}
