package X;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.SystemClock;
import com.whatsapp.util.Log;

/* renamed from: X.2zb  reason: invalid class name and case insensitive filesystem */
public class C61032zb {
    public C66523Lt A00;
    public final BroadcastReceiver A01 = new C85604Gx(this, 5);
    public final Handler A02;
    public final C29171iO A03;
    public final C55682qk A04;
    public final C50862it A05;
    public final C620633i A06;
    public final C56612sH A07;
    public final C54292oU A08;
    public final AnonymousClass1VX A09;
    public final C56732sT A0A;
    public final C52992mN A0B;
    public final C67823Qu A0C;

    public static void A00(C61032zb r1, int i) {
        Handler handler = r1.A02;
        handler.sendMessage(handler.obtainMessage(i, "com.whatsapp.MessageHandler.LOGOUT_ACTION"));
    }

    public final boolean A03(String str) {
        boolean A1W = AnonymousClass000.A1W(C624735e.A01(this.A08.A00, 0, C18280x3.A0B(str), 536870912));
        C18260x0.A1E("xmpp/handler/logout-timer/has=", AnonymousClass001.A0o(), A1W);
        return A1W;
    }

    public C61032zb(C29171iO r4, C55682qk r5, C50862it r6, C620633i r7, C56612sH r8, C54292oU r9, AnonymousClass1VX r10, C56732sT r11, C52992mN r12, AnonymousClass2X6 r13, C67823Qu r14) {
        this.A07 = r8;
        this.A09 = r10;
        this.A05 = r6;
        this.A04 = r5;
        this.A08 = r9;
        this.A06 = r7;
        this.A0A = r11;
        this.A0B = r12;
        this.A0C = r14;
        this.A03 = r4;
        this.A02 = new Handler(r13.A00(), new AnonymousClass37Z(this));
    }

    public static /* synthetic */ void A01(C61032zb r4, String str) {
        Log.i("xmpp/handler/logout-timer/cancel");
        try {
            PendingIntent A012 = C624735e.A01(r4.A08.A00, 0, C18280x3.A0B(str), 536870912);
            if (A012 != null) {
                AlarmManager A072 = r4.A06.A07();
                if (A072 != null) {
                    A072.cancel(A012);
                } else {
                    Log.w("MessageHandler/cancelLogoutTimer AlarmManager is null");
                }
                A012.cancel();
            }
        } catch (RuntimeException e) {
            if (e.getCause() instanceof DeadObjectException) {
                r4.A04.A0A("messagehandler/deadOS", false, (String) null);
                return;
            }
            throw e;
        }
    }

    public final void A02(String str) {
        Log.i("xmpp/handler/logout-timer/start");
        PendingIntent A012 = C624735e.A01(this.A08.A00, 0, C18280x3.A0B(str), 134217728);
        C626936e.A06(A012);
        if (!this.A05.A02(A012, 2, SystemClock.elapsedRealtime() + (C56952sp.A06(this.A09, 431) * 60 * 1000))) {
            Log.w("MessageHandler/startLogoutTimer AlarmManager is null");
        }
    }
}
