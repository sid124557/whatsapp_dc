package X;

import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.6CV  reason: invalid class name */
public abstract class AnonymousClass6CV extends Service {
    public int A00;
    public int A01 = 0;
    public Binder A02;
    public final Object A03 = AnonymousClass002.A0D();
    public final ExecutorService A04;

    public final synchronized IBinder onBind(Intent intent) {
        Binder binder;
        if (AnonymousClass6C9.A1Q("EnhancedIntentService")) {
            Log.d("EnhancedIntentService", "Service received bind request");
        }
        binder = this.A02;
        if (binder == null) {
            binder = new AnonymousClass6DO(new C146687Bf(this));
            this.A02 = binder;
        }
        return binder;
    }

    public final void A01(Intent intent) {
        if (intent != null) {
            synchronized (AnonymousClass796.A02) {
                if (AnonymousClass796.A00 != null && intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false)) {
                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                    C158237je r5 = AnonymousClass796.A00;
                    if (r5.A07.decrementAndGet() < 0) {
                        AnonymousClass6C9.A14(String.valueOf(r5.A0B), " release without a matched acquire!", "WakeLock");
                    }
                    synchronized (r5.A0A) {
                        TextUtils.isEmpty((CharSequence) null);
                        Map map = r5.A0C;
                        if (map.containsKey((Object) null)) {
                            C155757fS r1 = (C155757fS) map.get((Object) null);
                            if (r1 != null) {
                                int i = r1.A00 - 1;
                                r1.A00 = i;
                                if (i == 0) {
                                    map.remove((Object) null);
                                }
                            }
                        } else {
                            AnonymousClass6C9.A13(String.valueOf(r5.A0B), " counter does not exist", "WakeLock");
                        }
                        r5.A00();
                    }
                }
            }
        }
        synchronized (this.A03) {
            int i2 = this.A01 - 1;
            this.A01 = i2;
            if (i2 == 0) {
                stopSelfResult(this.A00);
            }
        }
    }

    public void onDestroy() {
        this.A04.shutdown();
        super.onDestroy();
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        synchronized (this.A03) {
            this.A00 = i2;
            this.A01++;
        }
        Intent intent2 = (Intent) C59592xA.A00().A03.poll();
        if (intent2 != null) {
            Task A002 = A00(intent2);
            if (!A002.isComplete()) {
                A002.addOnCompleteListener(C173178Op.A00, new AnonymousClass8BO(intent, this));
                return 3;
            }
        }
        A01(intent);
        return 2;
    }

    public AnonymousClass6CV() {
        String A0n = C18310x6.A0n(this);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new C173208Os(AnonymousClass6C7.A0k("Firebase-", A0n, A0n.length())));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.A04 = Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    public final Task A00(Intent intent) {
        if ("com.google.firebase.messaging.NOTIFICATION_OPEN".equals(intent.getAction())) {
            PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("pending_intent");
            if (pendingIntent != null) {
                try {
                    pendingIntent.send();
                } catch (PendingIntent.CanceledException unused) {
                    Log.e("FirebaseMessaging", "Notification pending intent canceled");
                }
            }
            if (C154077cZ.A01(intent)) {
                if ("1".equals(intent.getStringExtra("google.c.a.tc"))) {
                    C161757qO A002 = C161757qO.A00();
                    A002.A02();
                    A002.A02.A02(C178958iN.class);
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Received event with track-conversion=true. Setting user property and reengagement event");
                    }
                    Log.w("FirebaseMessaging", "Unable to set user property for conversion tracking:  analytics library is missing");
                } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Received event with track-conversion=false. Do not set user property");
                }
                C154077cZ.A00(intent, "_no");
            }
            AnonymousClass6YV r1 = new AnonymousClass6YV();
            r1.A04((Object) null);
            return r1;
        }
        C152017Xf r3 = new C152017Xf();
        this.A04.execute(new C172708Mj(this, intent, r3, 13));
        return r3.A00;
    }
}
