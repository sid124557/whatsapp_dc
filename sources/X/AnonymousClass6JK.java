package X;

import android.os.Bundle;
import com.whatsapp.bonsai.discovery.BonsaiDiscoveryActivity;
import com.whatsapp.bonsai.discovery.BonsaiDiscoveryFragment;

/* renamed from: X.6JK  reason: invalid class name */
public final class AnonymousClass6JK extends AnonymousClass09I {
    public C51222jT A00;

    public int A0G() {
        C51222jT r0 = this.A00;
        if (r0 != null) {
            return r0.A00.size();
        }
        return 0;
    }

    public C08310eF A0K(int i) {
        BonsaiDiscoveryFragment bonsaiDiscoveryFragment = new BonsaiDiscoveryFragment();
        Bundle A08 = AnonymousClass002.A08();
        A08.putInt("position", i);
        bonsaiDiscoveryFragment.A0u(A08);
        return bonsaiDiscoveryFragment;
    }

    public AnonymousClass6JK(BonsaiDiscoveryActivity bonsaiDiscoveryActivity) {
        super(bonsaiDiscoveryActivity);
    }
}
