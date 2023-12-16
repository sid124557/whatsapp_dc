package X;

import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.telecom.CallAudioState;
import android.telecom.Connection;
import android.telecom.ConnectionRequest;
import android.telecom.PhoneAccount;
import android.telecom.PhoneAccountHandle;
import android.telecom.TelecomManager;
import com.whatsapp.R;
import com.whatsapp.calling.telecom.SelfManagedConnectionService;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: X.4xj  reason: invalid class name and case insensitive filesystem */
public class C97164xj extends C29451iq {
    public PhoneAccountHandle A00;
    public boolean A01;
    public final ComponentName A02;
    public final C56972sr A03;
    public final C620633i A04;
    public final C54292oU A05;
    public final AnonymousClass1VX A06;
    public final C187958y5 A07;
    public final ConcurrentMap A08 = new ConcurrentHashMap(2);
    public volatile boolean A09;

    public int A08() {
        return ((C172068Jm) this.A07).A01.A0N(1658);
    }

    public C86914Mi A0A(String str) {
        return (C86914Mi) this.A08.get(str);
    }

    public void A0C() {
        C620633i r4 = this.A04;
        if (r4.A0L() == null) {
            Log.w("voip/SelfManagedConnectionsManager/unregisterPhoneAccount telecomManager is null");
            return;
        }
        Log.i("voip/SelfManagedConnectionsManager/unregisterPhoneAccounts");
        try {
            TelecomManager.class.getMethod("clearPhoneAccounts", new Class[0]).invoke(r4.A0L(), new Object[0]);
            this.A00 = null;
        } catch (Exception e) {
            C18260x0.A1Q(AnonymousClass001.A0o(), "voip/SelfManagedConnectionsManager/unregisterPhoneAccounts ", e);
        }
    }

    public boolean A0L() {
        return this.A06.A0X(2186);
    }

    public boolean A0M() {
        this.A09 = this.A06.A0X(1641);
        return this.A09;
    }

    public boolean A0N() {
        boolean A0X = this.A06.A0X(1642);
        this.A01 = A0X;
        return A0X;
    }

    public boolean A0O() {
        String str;
        if (this.A00 != null) {
            return true;
        }
        C620633i r4 = this.A04;
        if (r4.A0L() == null) {
            str = "voip/SelfManagedConnectionsManager/registerPhoneAccount telecomManager is null";
        } else {
            PhoneUserJid A042 = C56972sr.A04(this.A03);
            if (A042 == null) {
                str = "voip/SelfManagedConnectionsManager/registerPhoneAccount jid is null";
            } else {
                Uri A002 = A00(A042);
                if (A002 == null) {
                    str = "voip/SelfManagedConnectionsManager/registerPhoneAccount address is null";
                } else {
                    C18260x0.A1R(AnonymousClass001.A0o(), "voip/SelfManagedConnectionsManager/registerPhoneAccount ", A042);
                    PhoneAccountHandle phoneAccountHandle = new PhoneAccountHandle(this.A02, A042.getRawString());
                    this.A00 = phoneAccountHandle;
                    Context context = this.A05.A00;
                    PhoneAccount.Builder shortDescription = PhoneAccount.builder(phoneAccountHandle, context.getString(R.string.f11nameremoved)).addSupportedUriScheme("tel").setAddress(A002).setCapabilities(3080).setShortDescription(context.getString(R.string.f11nameremoved));
                    if (Build.VERSION.SDK_INT >= 28) {
                        Bundle A082 = AnonymousClass002.A08();
                        A082.putBoolean("android.telecom.extra.LOG_SELF_MANAGED_CALLS", false);
                        shortDescription.setExtras(A082);
                    }
                    try {
                        r4.A0L().registerPhoneAccount(shortDescription.build());
                        return true;
                    } catch (Exception e) {
                        Log.e((Throwable) e);
                        this.A00 = null;
                        return false;
                    }
                }
            }
        }
        Log.w(str);
        return false;
    }

    public C97164xj(C56972sr r4, C620633i r5, C54292oU r6, AnonymousClass1VX r7, C187958y5 r8) {
        this.A06 = r7;
        this.A03 = r4;
        this.A05 = r6;
        this.A07 = r8;
        this.A04 = r5;
        this.A02 = new ComponentName(r6.A00, SelfManagedConnectionService.class);
    }

    public static final Uri A00(UserJid userJid) {
        String A032 = C107195ar.A03(AnonymousClass36P.A06(userJid));
        if (A032 != null) {
            return Uri.fromParts("tel", A032, "");
        }
        Log.i("voip/SelfManagedConnectionsManager/getPhoneCallUri failed to get phone number");
        return null;
    }

    public Connection A09(ConnectionRequest connectionRequest, boolean z) {
        Bundle bundle;
        StringBuilder A0o;
        String str;
        C626936e.A01();
        Bundle extras = connectionRequest.getExtras();
        C86914Mi r4 = null;
        if (extras == null) {
            A0o = AnonymousClass001.A0o();
            str = "voip/SelfManagedConnectionsManager/createSelfManagedConnection extras is null for request ";
        } else {
            if (!z) {
                bundle = extras.getBundle("android.telecom.extra.INCOMING_CALL_EXTRAS");
                if (bundle == null) {
                    A0o = AnonymousClass001.A0o();
                    str = "voip/SelfManagedConnectionsManager/createSelfManagedConnection EXTRA_INCOMING_CALL_EXTRAS is null for request ";
                }
            } else {
                bundle = extras;
            }
            String string = bundle.getString("call_id");
            UserJid A0l = C86634Kw.A0l(bundle, "peer_jid");
            String string2 = bundle.getString("peer_display_name");
            boolean z2 = bundle.getBoolean("is_rejoin", false);
            if (string == null || A0l == null || string2 == null) {
                A0o = AnonymousClass001.A0o();
                str = "voip/SelfManagedConnectionsManager/createSelfManagedConnection invalid request ";
            } else {
                r4 = new C86914Mi(this, this.A07, string);
                r4.setConnectionProperties(128);
                r4.setAddress(connectionRequest.getAddress(), 1);
                r4.setCallerDisplayName(string2, 1);
                r4.setConnectionCapabilities(r4.getConnectionCapabilities() | 2);
                r4.setVideoState(connectionRequest.getVideoState());
                r4.setExtras(extras);
                StringBuilder A0o2 = AnonymousClass001.A0o();
                A0o2.append("voip/SelfManagedConnectionsManager/createSelfManagedConnection with ");
                A0o2.append(A0l);
                A0o2.append(", call id: ");
                A0o2.append(string);
                C18260x0.A1E(", isOutgoing ", A0o2, z);
                A0G(r4);
                Iterator A032 = C61102zi.A03(this);
                while (A032.hasNext()) {
                    C153457bL r0 = (C153457bL) A032.next();
                    if (z) {
                        r0.A06(string, z2);
                    } else {
                        r0.A01(string);
                    }
                }
                return r4;
            }
        }
        C18260x0.A1R(A0o, str, connectionRequest);
        return r4;
    }

    public void A0B() {
        C626936e.A01();
        ConcurrentMap concurrentMap = this.A08;
        if (!concurrentMap.isEmpty()) {
            Log.i("voip/SelfManagedConnectionsManager/removeAllConnections");
            Iterator it = C18300x5.A0v(concurrentMap).iterator();
            while (it.hasNext()) {
                ((C86914Mi) it.next()).A01(2);
            }
            C626936e.A0D(concurrentMap.isEmpty(), "all connection should have been removed");
        }
    }

    public void A0D(CallAudioState callAudioState, String str) {
        C626936e.A01();
        Iterator A032 = C61102zi.A03(this);
        while (A032.hasNext()) {
            ((C153457bL) A032.next()).A00(callAudioState, str);
        }
    }

    public void A0E(ConnectionRequest connectionRequest) {
        String string;
        C626936e.A01();
        Bundle extras = connectionRequest.getExtras();
        if (extras != null && (string = extras.getString("call_id")) != null) {
            Iterator A032 = C61102zi.A03(this);
            while (A032.hasNext()) {
                ((C153457bL) A032.next()).A02(string);
            }
        }
    }

    public void A0F(ConnectionRequest connectionRequest) {
        String string;
        C626936e.A01();
        Bundle extras = connectionRequest.getExtras();
        if (extras != null && (string = extras.getString("call_id")) != null) {
            Iterator A032 = C61102zi.A03(this);
            while (A032.hasNext()) {
                ((C153457bL) A032.next()).A03(string);
            }
        }
    }

    public void A0G(C86914Mi r4) {
        C626936e.A01();
        ConcurrentMap concurrentMap = this.A08;
        concurrentMap.put(r4.A00(), r4);
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("voip/SelfManagedConnectionsManager/addConnection");
        A0o.append(r4);
        A0o.append(", total connection count: ");
        C18260x0.A1G(A0o, concurrentMap.size());
    }

    public void A0H(C86914Mi r4) {
        C626936e.A01();
        ConcurrentMap concurrentMap = this.A08;
        concurrentMap.remove(r4.A00());
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("voip/SelfManagedConnectionsManager/removeConnection");
        A0o.append(r4);
        A0o.append(", total connection count: ");
        C18260x0.A1G(A0o, concurrentMap.size());
    }

    public void A0I(String str) {
        C18260x0.A0s("voip/SelfManagedConnectionsManager/disconnectConnectionIfExists", str, C86654Ky.A0o());
        C86914Mi A0A = A0A(str);
        if (A0A != null) {
            A0A.A01(2);
        }
    }

    public void A0J(String str, int i) {
        C626936e.A01();
        Iterator A032 = C61102zi.A03(this);
        while (A032.hasNext()) {
            ((C153457bL) A032.next()).A05(str, i);
        }
    }

    public void A0K(String str, String str2) {
        C86914Mi A0A = A0A(str);
        if (A0A != null) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("voip/SelfManagedConnectionsManager/onCallAutoConnected changing CallId from: ");
            A0o.append(str);
            C18260x0.A0s(" -> ", str2, A0o);
            A0H(A0A);
            A0A.A02(str2);
            A0G(A0A);
        }
    }

    public boolean A0P(UserJid userJid, String str, String str2, boolean z) {
        String str3;
        C18260x0.A1R(C86654Ky.A0o(), "voip/SelfManagedConnectionsManager/addNewIncomingCall ", userJid);
        if (!this.A09) {
            str3 = "voip/SelfManagedConnectionsManager/addNewIncomingCall incomingEnabled is false";
        } else {
            C620633i r4 = this.A04;
            if (r4.A0L() == null) {
                str3 = "voip/SelfManagedConnectionsManager/addNewIncomingCall telecomManager is null";
            } else if (this.A00 == null) {
                str3 = "voip/SelfManagedConnectionsManager/addNewIncomingCall phoneAccountHandle is null";
            } else {
                try {
                    if (!r4.A0L().isIncomingCallPermitted(this.A00)) {
                        Log.i("voip/SelfManagedConnectionsManager/addNewIncomingCall incoming call not permitted for the phone account handle");
                        return false;
                    }
                    Uri A002 = A00(userJid);
                    if (A002 != null) {
                        Bundle A082 = AnonymousClass002.A08();
                        if (z) {
                            A082.putInt("android.telecom.extra.START_CALL_WITH_VIDEO_STATE", 3);
                        }
                        Bundle A083 = AnonymousClass002.A08();
                        A083.putString("call_id", str);
                        AnonymousClass0x2.A0v(A083, userJid, "peer_jid");
                        A083.putString("peer_display_name", str2);
                        A083.putBoolean("is_rejoin", false);
                        A082.putParcelable("android.telecom.extra.INCOMING_CALL_EXTRAS", A083);
                        A082.putParcelable("android.telecom.extra.INCOMING_CALL_ADDRESS", A002);
                        StringBuilder A0o = AnonymousClass001.A0o();
                        A0o.append("voip/SelfManagedConnectionsManager/addNewIncomingCall callId=");
                        A0o.append(str);
                        A0o.append(", peerJid=");
                        A0o.append(userJid);
                        A0o.append(", videoCall=");
                        A0o.append(z);
                        C18260x0.A1L(A0o, ", isRejoin=false");
                        r4.A0L().addNewIncomingCall(this.A00, A082);
                        return true;
                    }
                    return false;
                } catch (Exception e) {
                    Log.e((Throwable) e);
                    return false;
                }
            }
        }
        Log.w(str3);
        return false;
    }

    public boolean A0Q(UserJid userJid, String str, String str2, boolean z, boolean z2) {
        String str3;
        C18260x0.A1R(C86654Ky.A0o(), "voip/SelfManagedConnectionsManager/placeOutgoingCall ", userJid);
        if (!this.A01) {
            str3 = "voip/SelfManagedConnectionsManager/placeOutgoingCall outgoingEnabled is false";
        } else {
            C620633i r4 = this.A04;
            if (r4.A0L() == null) {
                str3 = "voip/SelfManagedConnectionsManager/placeOutgoingCall telecomManager is null";
            } else if (this.A00 == null) {
                str3 = "voip/SelfManagedConnectionsManager/placeOutgoingCall phoneAccountHandle is null";
            } else {
                try {
                    if (!r4.A0L().isOutgoingCallPermitted(this.A00)) {
                        Log.w("voip/SelfManagedConnectionsManager/placeOutgoingCall outgoing call not permitted for the phone account handle");
                        return false;
                    }
                    Uri A002 = A00(userJid);
                    if (A002 != null) {
                        if (z) {
                            String str4 = Build.MANUFACTURER;
                            if (str4.equalsIgnoreCase("samsung") || str4.equalsIgnoreCase("oppo") || str4.equalsIgnoreCase("OnePlus")) {
                                z = false;
                            }
                        }
                        Bundle A082 = AnonymousClass002.A08();
                        if (z) {
                            A082.putInt("android.telecom.extra.START_CALL_WITH_VIDEO_STATE", 3);
                        }
                        Bundle A083 = AnonymousClass002.A08();
                        A083.putString("call_id", str);
                        AnonymousClass0x2.A0v(A083, userJid, "peer_jid");
                        A083.putString("peer_display_name", str2);
                        A083.putBoolean("is_rejoin", z2);
                        A082.putParcelable("android.telecom.extra.OUTGOING_CALL_EXTRAS", A083);
                        A082.putParcelable("android.telecom.extra.PHONE_ACCOUNT_HANDLE", this.A00);
                        StringBuilder A0o = AnonymousClass001.A0o();
                        A0o.append("voip/SelfManagedConnectionsManager/placeOutgoingCall callId=");
                        A0o.append(str);
                        A0o.append(", peerJid=");
                        A0o.append(userJid);
                        A0o.append(", videoCall=");
                        A0o.append(z);
                        C18260x0.A1E(", isRejoin=", A0o, z2);
                        r4.A0L().placeCall(A002, A082);
                        return true;
                    }
                    return false;
                } catch (Exception e) {
                    Log.e((Throwable) e);
                    return false;
                }
            }
        }
        Log.w(str3);
        return false;
    }
}
