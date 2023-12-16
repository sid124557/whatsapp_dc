package X;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: X.0y2  reason: invalid class name and case insensitive filesystem */
public class C18650y2 extends ConnectivityManager.NetworkCallback {
    public volatile Network A00;
    public final /* synthetic */ C67783Qq A01;

    public C18650y2(C67783Qq r1) {
        this.A01 = r1;
    }

    public final void A00(Network network, boolean z) {
        List asList;
        if (this.A00 == null) {
            return;
        }
        if (network == null || network.equals(this.A00)) {
            this.A00 = null;
            C67783Qq r4 = this.A01;
            r4.A03.A00();
            C66523Lt r0 = r4.A04;
            r0.A0A(-1, false, z);
            r0.A0G(false, false);
            if (z) {
                C67823Qu r3 = r4.A05;
                String A0q = AnonymousClass0x7.A0q(r3.A07);
                AnonymousClass33p r5 = r3.A0C;
                String A0v = AnonymousClass0x9.A0v(AnonymousClass0x2.A0F(r5), "network:last_blocked_session_ids");
                if (A0v.isEmpty()) {
                    asList = Collections.emptyList();
                } else {
                    asList = Arrays.asList(A0v.split(",", 0));
                }
                C162457s7.A0D(asList);
                if (A0q != null && !asList.contains(A0q)) {
                    ArrayList A0J = AnonymousClass002.A0J(asList);
                    A0J.add(A0q);
                    if (A0J.size() > 10) {
                        if (!A0J.isEmpty()) {
                            A0J.remove(0);
                        } else {
                            throw new NoSuchElementException("List is empty.");
                        }
                    }
                    C18270x1.A0j(C18270x1.A03(r5), "network:last_blocked_session_ids", C107575bX.A08(",", C73723fy.A0N(A0J, 10)));
                }
                if (!r3.A09 && r3.A09("xmpp-bg-to-blocked")) {
                    r3.A09 = true;
                }
            }
        }
    }

    public void onAvailable(Network network) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("xmpp/handler/network/network-callback onAvailable:");
        A0o.append(network);
        A0o.append(" handle:");
        C18260x0.A1I(A0o, network.getNetworkHandle());
    }

    public void onBlockedStatusChanged(Network network, boolean z) {
        NetworkCapabilities networkCapabilities;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("xmpp/handler/network/network-callback onBlockedStatusChanged network:");
        A0o.append(network);
        A0o.append(" blocked:");
        A0o.append(z);
        A0o.append(" handle:");
        C18260x0.A1I(A0o, network.getNetworkHandle());
        if (z) {
            A00(network, true);
            return;
        }
        this.A00 = network;
        C67783Qq r6 = this.A01;
        ConnectivityManager A0H = r6.A02.A0H();
        boolean z2 = false;
        if (A0H != null && (networkCapabilities = A0H.getNetworkCapabilities(network)) != null && networkCapabilities.hasTransport(1) && networkCapabilities.hasCapability(17)) {
            z2 = true;
        }
        long networkHandle = network.getNetworkHandle();
        r6.A03.A00();
        C66523Lt r1 = r6.A04;
        boolean z3 = false;
        if (!z2) {
            z3 = true;
        }
        r1.A0A(networkHandle, z3, false);
        r1.A0G(z2, false);
    }

    public void onLost(Network network) {
        C18260x0.A1R(AnonymousClass001.A0o(), "xmpp/handler/network/network-callback onLost:", network);
        A00(network, false);
    }

    public void onUnavailable() {
        Log.i("xmpp/handler/network/network-callback onUnavailable");
        A00((Network) null, false);
    }
}
