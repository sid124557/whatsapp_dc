package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.whatsapp.util.Log;

/* renamed from: X.0xn  reason: invalid class name and case insensitive filesystem */
public class C18510xn extends BroadcastReceiver {
    public final Context A00;
    public final C29441ip A01;
    public final C54392oe A02;
    public final C620633i A03;
    public final C56612sH A04;
    public final AnonymousClass3LP A05;

    public static C50092hc A00(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return null;
        }
        boolean z = true;
        boolean A1U = AnonymousClass000.A1U(networkInfo.getType(), 1);
        if (networkInfo.getType() != 0) {
            z = false;
        }
        return new C50092hc(networkInfo.getTypeName(), networkInfo.getSubtypeName(), networkInfo.getSubtype(), A1U, z, networkInfo.isConnected(), networkInfo.isRoaming());
    }

    public static /* synthetic */ void A01(C18510xn r6) {
        boolean z;
        if (Build.VERSION.SDK_INT < 29 || !r6.A05.A00.A0Y(C58422vE.A02, 614)) {
            z = false;
        } else {
            Log.d("ConnectivityReceiver/registering as callback");
            z = r6.A02();
        }
        C50092hc A002 = A00(r6.A02.A01());
        long A0H = r6.A04.A0H();
        if (Build.VERSION.SDK_INT < 29 || !z) {
            IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
            Log.d("ConnectivityReceiver/registerAsReceiver CONNECTIVITY_ACTION & ACTION_RESTRICT_BACKGROUND_CHANGED");
            C154317cy.A01(r6, r6.A00, intentFilter, true);
        } else {
            r6.A01.A0D(A002);
        }
        C59622xD A003 = C59622xD.A00(A002, A0H);
        Log.d("ConnectivityReceiver/post registration notifyConnectivityChanged");
        r6.A01.A0E(A003);
    }

    public final boolean A02() {
        C620633i r1 = this.A03;
        C620633i.A0P = true;
        ConnectivityManager A0H = r1.A0H();
        TelephonyManager A0N = r1.A0N();
        C620633i.A0P = false;
        return this.A01.A0I(A0H, A0N);
    }

    public void onReceive(Context context, Intent intent) {
        Log.d("ConnectivityReceiver/onReceive CONNECTIVITY_ACTION");
        C29441ip r3 = this.A01;
        r3.A0E(C59622xD.A00(r3.A0A(), this.A04.A0H()));
    }

    public C18510xn(Context context, C29441ip r2, C54392oe r3, C620633i r4, C56612sH r5, AnonymousClass3LP r6) {
        this.A04 = r5;
        this.A00 = context;
        this.A05 = r6;
        this.A03 = r4;
        this.A02 = r3;
        this.A01 = r2;
    }
}
