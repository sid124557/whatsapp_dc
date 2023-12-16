package X;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.Log;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.UUID;

/* renamed from: X.0mZ  reason: invalid class name and case insensitive filesystem */
public class C13060mZ implements Runnable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AnonymousClass0PW A01;
    public final /* synthetic */ C08950fP A02;
    public final /* synthetic */ AnonymousClass0BT A03;
    public final /* synthetic */ UUID A04;

    public C13060mZ(Context context, AnonymousClass0PW r2, C08950fP r3, AnonymousClass0BT r4, UUID uuid) {
        this.A02 = r3;
        this.A03 = r4;
        this.A04 = uuid;
        this.A01 = r2;
        this.A00 = context;
    }

    public void run() {
        IllegalStateException th;
        try {
            AnonymousClass0BT r3 = this.A03;
            if (!r3.isCancelled()) {
                String obj = this.A04.toString();
                C08950fP r1 = this.A02;
                C06250Wv BEX = r1.A01.BEX(obj);
                if (BEX == null || BEX.A0E.A00()) {
                    th = AnonymousClass001.A0e("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                } else {
                    C15380rF r7 = r1.A00;
                    AnonymousClass0PW r6 = this.A01;
                    C09020fW r72 = (C09020fW) r7;
                    synchronized (r72.A0A) {
                        try {
                            C06240Wu.A00();
                            String str = C09020fW.A0C;
                            StringBuilder A0o = AnonymousClass001.A0o();
                            A0o.append("Moving WorkSpec (");
                            A0o.append(obj);
                            Log.i(str, AnonymousClass000.A0X(") to the foreground", A0o));
                            C13340n1 r2 = (C13340n1) r72.A06.remove(obj);
                            if (r2 != null) {
                                if (r72.A01 == null) {
                                    PowerManager.WakeLock A002 = AnonymousClass0SH.A00(r72.A00, "ProcessorForegroundLck");
                                    r72.A01 = A002;
                                    A002.acquire();
                                }
                                r72.A07.put(obj, r2);
                                Context context = r72.A00;
                                AnonymousClass0PL A003 = AnonymousClass0J0.A00(r2.A08);
                                Intent intent = new Intent(context, SystemForegroundService.class);
                                intent.setAction("ACTION_START_FOREGROUND");
                                intent.putExtra("KEY_WORKSPEC_ID", A003.A01);
                                intent.putExtra("KEY_GENERATION", A003.A00);
                                intent.putExtra("KEY_NOTIFICATION_ID", r6.A01);
                                intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", r6.A00);
                                intent.putExtra("KEY_NOTIFICATION", r6.A02);
                                AnonymousClass0Y8.A0A(context, intent);
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                    Context context2 = this.A00;
                    AnonymousClass0PL A004 = AnonymousClass0J0.A00(BEX);
                    Intent intent2 = new Intent(context2, SystemForegroundService.class);
                    intent2.setAction("ACTION_NOTIFY");
                    intent2.putExtra("KEY_NOTIFICATION_ID", r6.A01);
                    intent2.putExtra("KEY_FOREGROUND_SERVICE_TYPE", r6.A00);
                    intent2.putExtra("KEY_NOTIFICATION", r6.A02);
                    intent2.putExtra("KEY_WORKSPEC_ID", A004.A01);
                    intent2.putExtra("KEY_GENERATION", A004.A00);
                    context2.startService(intent2);
                }
                throw th;
            }
            r3.A09((Object) null);
        } catch (Throwable th3) {
            this.A03.A0A(th3);
        }
    }
}
