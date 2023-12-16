package X;

import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.util.Log;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.0yG  reason: invalid class name and case insensitive filesystem */
public final class C18790yG extends Handler {
    public final boolean A00 = AnonymousClass5XU.A00();
    public final /* synthetic */ C66523Lt A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C18790yG(Looper looper, C66523Lt r3) {
        super(looper);
        this.A01 = r3;
    }

    public void handleMessage(Message message) {
        String str;
        if (this.A00) {
            Log.w("MessageHandler/unsupported");
            return;
        }
        Message message2 = message;
        int i = message2.what;
        if (i == 0) {
            Log.d("MessageHandler/recv/start");
            if (hasMessages(1)) {
                Log.i("MessageHandler/not starting connection as will be imminently stopped");
                return;
            }
            C66523Lt r4 = this.A01;
            r4.A0B = false;
            boolean z = message2.getData().getBoolean("should_register", false);
            r4.A06 = (AnonymousClass2OU) message2.obj;
            if (r4.A11) {
                str = "MessageHandler/recv/start/exit due to shutdown";
            } else {
                C66523Lt.A01(r4);
                if (z) {
                    PhoneUserJid A04 = C56972sr.A04(r4.A0J);
                    Object obj = r4.A0t.get();
                    C626936e.A06(obj);
                    AnonymousClass30H r1 = (AnonymousClass30H) obj;
                    if (!r4.A10) {
                        Log.i("MessageHandler/handleRegistered registered");
                        r4.A05 = A04;
                        r4.A09 = r1;
                        r4.A0c.A00 = r1;
                        r4.A0H(true, false, false);
                        if (r4.A08 != null) {
                            r4.A09.A01();
                        }
                        r4.A10 = true;
                        return;
                    } else if (r4.A0M.A02()) {
                        r4.A0H(true, false, false);
                        if (r4.A08 != null) {
                            r4.A09.A01();
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
        } else if (i == 1) {
            Log.d("MessageHandler/recv/stop_no_restart");
            boolean z2 = message2.getData().getBoolean("should_unregister", false);
            int i2 = message2.getData().getInt("logoutReason", -1);
            if (z2) {
                this.A01.A10 = false;
            }
            C66523Lt r42 = this.A01;
            if (i2 == 12) {
                r42.A11 = true;
            }
            Log.i("MessageHandler/stop");
            if (!r42.A12) {
                AnonymousClass30H r0 = r42.A09;
                if (r0 != null) {
                    r0.A02();
                }
            } else {
                r42.A12 = false;
                synchronized (r42.A0u) {
                    C48692fJ r12 = r42.A0Z;
                    if (!r12.A00) {
                        r42.A09.A00();
                    }
                    r12.A00(true);
                }
                if (r42.A08 != null) {
                    r42.A0T.A00.unregisterReceiver(r42.A0D);
                    r42.A0g.BqC();
                    HandlerThread handlerThread = r42.A04;
                    C626936e.A06(handlerThread);
                    handlerThread.quit();
                    try {
                        r42.A04.join(120000);
                    } catch (InterruptedException e) {
                        Log.w("MessageHandler/stop/interrupted while waiting on connectivity handler thread to exit", e);
                        C18300x5.A11();
                    }
                    if (r42.A04.isAlive()) {
                        Log.e("MessageHandler/stop connectivity-handler-thread still alive");
                    }
                    r42.A04 = null;
                    C66523Lt.A13 = new CountDownLatch(1);
                    C66523Lt.A15.set(false);
                    Log.d("ConnectionThread/MessageServiceHandler/send/quit");
                    C18290x4.A1C((Handler) r42.A08, Integer.valueOf(i2), 3);
                    r42.A08 = null;
                    AnonymousClass31C r02 = r42.A0d;
                    r02.A0D = null;
                    r02.A00 = null;
                } else {
                    r42.A07.quit();
                }
            }
            r42.A0B = true;
            return;
        } else if (i == 2) {
            Bundle data = message2.getData();
            Log.d("MessageHandler/recv/reconnect");
            boolean z3 = data.getBoolean("reset", false);
            boolean z4 = data.getBoolean("force", false);
            boolean z5 = data.getBoolean("force_no_ongoing_backoff", false);
            boolean z6 = data.getBoolean("check_connection", false);
            boolean z7 = data.getBoolean("notify_on_failure", false);
            String string = data.getString("ip_address");
            String string2 = data.getString("cl_sess");
            boolean z8 = data.getBoolean("fgservice", false);
            int i3 = data.getInt("connect_reason", 0);
            C66523Lt r5 = this.A01;
            if (r5.A11) {
                str = "MessageHandler/recv/reconnect/exit due to shutdown";
            } else {
                if (z4) {
                    r5.A03 = 0;
                }
                if (z3) {
                    r5.A0p.A02();
                }
                long j = r5.A03;
                if (j <= 0 || SystemClock.elapsedRealtime() >= j) {
                    C66523Lt.A01(r5);
                    r5.A0C(r5.A06, string2, string, i3, z4, z5, z6, z7, z8);
                    return;
                }
                str = "MessageHandler/recv/reconnect wait for pending reconnect";
            }
        } else if (i != 3) {
            Log.d("MessageHandler/recv/unknown (start)");
            C66523Lt.A01(this.A01);
            return;
        } else {
            Bundle data2 = message2.getData();
            Log.d("MessageHandler/recv/setconnectiontype");
            C66523Lt r13 = this.A01;
            C66523Lt.A01(r13);
            if (data2.getBoolean("long_connect", false)) {
                Log.d("MessageHandler/onNoLogoutDueToLongConnect");
                r13.A07();
                return;
            }
            return;
        }
        Log.d(str);
    }
}
