package X;

import android.os.Build;
import android.telecom.Connection;
import android.telecom.ConnectionRequest;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.5iU  reason: invalid class name and case insensitive filesystem */
public class C111665iU implements AnonymousClass66U {
    public final C97164xj A00;

    public int A01() {
        C97164xj r0;
        if (Build.VERSION.SDK_INT < 28 || (r0 = this.A00) == null) {
            return 0;
        }
        return r0.A08();
    }

    public final C97164xj A04() {
        if (Build.VERSION.SDK_INT >= 28) {
            C97164xj r0 = this.A00;
            C626936e.A06(r0);
            return r0;
        }
        throw new RuntimeException("Requires API level 28");
    }

    public boolean A0B() {
        C97164xj r0;
        if (Build.VERSION.SDK_INT < 28 || (r0 = this.A00) == null || !r0.A0L()) {
            return false;
        }
        return true;
    }

    public boolean A0C() {
        C97164xj r0;
        if (Build.VERSION.SDK_INT < 28 || (r0 = this.A00) == null || !r0.A0M()) {
            return false;
        }
        return true;
    }

    public boolean A0D() {
        C97164xj r0;
        if (Build.VERSION.SDK_INT < 28 || (r0 = this.A00) == null || !r0.A0N()) {
            return false;
        }
        return true;
    }

    public boolean A0E() {
        C97164xj r0;
        if (Build.VERSION.SDK_INT < 28 || (r0 = this.A00) == null || !r0.A0O()) {
            return false;
        }
        return true;
    }

    public String BDW() {
        return "SelfManagedConnectionsManager";
    }

    public void BMd() {
        C97164xj r0;
        Log.i("voip/SelfManagedConnectionsManager/onAsyncInit");
        if (A0D() || A0C()) {
            A0E();
        } else if (Build.VERSION.SDK_INT >= 30 && (r0 = this.A00) != null) {
            r0.A0C();
        }
    }

    public /* synthetic */ void BMe() {
    }

    public C111665iU(C56972sr r7, C620633i r8, C54292oU r9, AnonymousClass1VX r10, C187958y5 r11) {
        C97164xj r0;
        if (Build.VERSION.SDK_INT >= 28) {
            r0 = new C97164xj(r7, r8, r9, r10, r11);
        } else {
            r0 = null;
        }
        this.A00 = r0;
    }

    public int A00() {
        C97164xj A04 = A04();
        C626936e.A01();
        return A04.A08.size();
    }

    public Connection A02(ConnectionRequest connectionRequest, boolean z) {
        return A04().A09(connectionRequest, z);
    }

    public C86914Mi A03(String str) {
        return A04().A0A(str);
    }

    public void A05() {
        A04().A0B();
    }

    public void A06(ConnectionRequest connectionRequest) {
        A04().A0E(connectionRequest);
    }

    public void A07(ConnectionRequest connectionRequest) {
        A04().A0F(connectionRequest);
    }

    public void A08(C153457bL r2) {
        A04().A06(r2);
    }

    public void A09(C153457bL r2) {
        A04().A07(r2);
    }

    public void A0A(String str, String str2) {
        A04().A0K(str, str2);
    }

    public boolean A0F(UserJid userJid, String str, String str2, boolean z) {
        return A04().A0P(userJid, str, str2, z);
    }

    public boolean A0G(UserJid userJid, String str, String str2, boolean z, boolean z2) {
        return A04().A0Q(userJid, str, str2, z, z2);
    }
}
