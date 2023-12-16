package com.google.firebase.iid;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0x9;
import X.AnonymousClass2ZF;
import X.AnonymousClass6C7;
import X.AnonymousClass6CA;
import X.AnonymousClass6YV;
import X.AnonymousClass7GV;
import X.AnonymousClass7U4;
import X.AnonymousClass8BG;
import X.AnonymousClass8CS;
import X.C143676zI;
import X.C146677Be;
import X.C151127Tn;
import X.C151587Vj;
import X.C156047fw;
import X.C156537gn;
import X.C160237nI;
import X.C160637o2;
import X.C161757qO;
import X.C162137rK;
import X.C172668Mf;
import X.C173208Os;
import X.C173248Ow;
import X.C18280x3;
import X.C625635p;
import X.C71513cE;
import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

public class FirebaseInstanceId {
    public static C160237nI A08;
    public static ScheduledExecutorService A09;
    public static final long A0A = TimeUnit.HOURS.toSeconds(8);
    public boolean A00 = false;
    public final C161757qO A01;
    public final AnonymousClass7U4 A02;
    public final C160637o2 A03;
    public final AnonymousClass7GV A04;
    public final AnonymousClass2ZF A05;
    public final C151127Tn A06;
    public final Executor A07;

    public final synchronized void A07() {
        A08.A02();
        if (this.A02.A00()) {
            A08();
        }
    }

    public final synchronized void A08() {
        if (!this.A00) {
            A09(0);
        }
    }

    public final synchronized void A09(long j) {
        synchronized (this) {
            A02(new C71513cE(this, this.A05, Math.min(Math.max(30, j << 1), A0A)), j);
            this.A00 = true;
        }
    }

    public final synchronized void A0A(boolean z) {
        this.A00 = z;
    }

    public FirebaseInstanceId(C161757qO r23, AnonymousClass8CS r24, C156047fw r25) {
        C161757qO r3 = r23;
        r3.A02();
        Context context = r3.A00;
        C160637o2 r1 = new C160637o2(context);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        ThreadFactory threadFactory = C173248Ow.A00;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30, timeUnit, linkedBlockingQueue, threadFactory);
        ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(0, 1, 30, timeUnit, new LinkedBlockingQueue(), threadFactory);
        if (C160637o2.A00(r3) != null) {
            synchronized (FirebaseInstanceId.class) {
                if (A08 == null) {
                    r3.A02();
                    A08 = new C160237nI(context);
                }
            }
            this.A01 = r3;
            this.A03 = r1;
            this.A06 = new C151127Tn(r3, r1, r25, threadPoolExecutor);
            this.A07 = threadPoolExecutor2;
            this.A05 = new AnonymousClass2ZF(A08);
            this.A02 = new AnonymousClass7U4(r24, this);
            this.A04 = new AnonymousClass7GV(threadPoolExecutor);
            threadPoolExecutor2.execute(new C172668Mf(this, 46));
            return;
        }
        throw AnonymousClass001.A0e("FirebaseInstanceId failed to initialize, FirebaseApp is missing project ID");
    }

    public static C156537gn A00(String str, String str2) {
        C156537gn r4;
        C156537gn r2;
        C160237nI r3 = A08;
        synchronized (r3) {
            String A0Z = C18280x3.A0Z(r3.A01, C160237nI.A01(str, str2));
            r4 = null;
            if (!TextUtils.isEmpty(A0Z)) {
                if (A0Z.startsWith("{")) {
                    try {
                        JSONObject A1H = AnonymousClass0x9.A1H(A0Z);
                        r2 = new C156537gn(A1H.getLong("timestamp"), A1H.getString("token"), A1H.getString("appVersion"));
                    } catch (JSONException e) {
                        String valueOf = String.valueOf(e);
                        Log.w("FirebaseInstanceId", AnonymousClass000.A0V("Failed to parse token: ", valueOf, AnonymousClass6CA.A0Y(valueOf.length() + 23)));
                    }
                } else {
                    r2 = new C156537gn(0, A0Z, (String) null);
                }
                r4 = r2;
            }
        }
        return r4;
    }

    public static String A01() {
        C151587Vj r0;
        C160237nI r3 = A08;
        synchronized (r3) {
            Map map = r3.A03;
            r0 = (C151587Vj) map.get("");
            if (r0 == null) {
                try {
                    C162137rK r8 = r3.A02;
                    Context context = r3.A00;
                    C143676zI e = null;
                    File A042 = C162137rK.A04(context);
                    if (A042.exists()) {
                        try {
                            r0 = C162137rK.A02(A042);
                        } catch (C143676zI | IOException e2) {
                            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                                String valueOf = String.valueOf(e2);
                                AnonymousClass6C7.A1G("Failed to read ID from file, retrying: ", valueOf, "FirebaseInstanceId", AnonymousClass6CA.A0Y(valueOf.length() + 39));
                            }
                            try {
                                r0 = C162137rK.A02(A042);
                            } catch (IOException e3) {
                                String valueOf2 = String.valueOf(e3);
                                AnonymousClass6C7.A1F("IID file exists, but failed to read from it: ", valueOf2, "FirebaseInstanceId", AnonymousClass6CA.A0Y(valueOf2.length() + 45));
                                throw new C143676zI(e3);
                            } catch (C143676zI e4) {
                                e = e4;
                            }
                        }
                        C162137rK.A06(context, r0);
                        map.put("", r0);
                    }
                    try {
                        r0 = C162137rK.A01(context.getSharedPreferences("com.google.android.gms.appid", 0));
                        if (r0 != null) {
                            C162137rK.A00(context, r0, false);
                        } else {
                            if (e == null) {
                                r0 = r8.A07(context);
                            }
                            throw e;
                        }
                        map.put("", r0);
                    } catch (C143676zI e5) {
                        e = e5;
                    }
                } catch (C143676zI unused) {
                    Log.w("FirebaseInstanceId", "Stored data is corrupt, generating new identity");
                    getInstance(C161757qO.A00()).A07();
                    r0 = r3.A02.A07(r3.A00);
                }
            }
        }
        return r0.A01;
    }

    public static void A02(Runnable runnable, long j) {
        synchronized (FirebaseInstanceId.class) {
            ScheduledExecutorService scheduledExecutorService = A09;
            if (scheduledExecutorService == null) {
                scheduledExecutorService = new ScheduledThreadPoolExecutor(1, new C173208Os("FirebaseInstanceId"));
                A09 = scheduledExecutorService;
            }
            scheduledExecutorService.schedule(runnable, j, TimeUnit.SECONDS);
        }
    }

    public static boolean A03() {
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            return true;
        }
        if (Build.VERSION.SDK_INT != 23 || !Log.isLoggable("FirebaseInstanceId", 3)) {
            return false;
        }
        return true;
    }

    public static FirebaseInstanceId getInstance(C161757qO r2) {
        r2.A02();
        return (FirebaseInstanceId) r2.A02.A02(FirebaseInstanceId.class);
    }

    public final Object A04(Task task) {
        try {
            return Tasks.await(task, C625635p.A0L, TimeUnit.MILLISECONDS);
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof IOException) {
                if ("INSTANCE_ID_RESET".equals(cause.getMessage())) {
                    A07();
                }
            } else if (!(cause instanceof RuntimeException)) {
                throw new IOException(e);
            }
            throw cause;
        } catch (InterruptedException | TimeoutException unused) {
            throw AnonymousClass002.A0C("SERVICE_NOT_AVAILABLE");
        }
    }

    public final void A06() {
        String A002;
        if (!A0B(A00(C160637o2.A00(this.A01), "*"))) {
            AnonymousClass2ZF r1 = this.A05;
            synchronized (r1) {
                A002 = r1.A00();
            }
            if (A002 == null) {
                return;
            }
        }
        A08();
    }

    public final boolean A0B(C156537gn r8) {
        if (r8 != null) {
            String A052 = this.A03.A05();
            if (System.currentTimeMillis() > r8.A00 + C156537gn.A03 || !A052.equals(r8.A02)) {
                return true;
            }
            return false;
        }
        return true;
    }

    public String A05(String str, String str2) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            if (str2.isEmpty() || str2.equalsIgnoreCase("fcm") || str2.equalsIgnoreCase("gcm")) {
                str2 = "*";
            }
            AnonymousClass6YV r2 = new AnonymousClass6YV();
            r2.A04((Object) null);
            return ((C146677Be) A04(r2.continueWithTask(this.A07, new AnonymousClass8BG(this, str, str2)))).A00;
        }
        throw AnonymousClass002.A0C("MAIN_THREAD");
    }
}
