package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: X.7jW  reason: invalid class name and case insensitive filesystem */
public class C158157jW {
    public C162727se A00;
    public C187088wU A01;
    public boolean A02;
    public final Context A03;
    public final Object A04 = AnonymousClass002.A0D();

    public static AnonymousClass2XM A00(Context context) {
        Throwable th;
        Throwable th2;
        C187088wU r1;
        IOException th3;
        AnonymousClass2XM r4;
        C158157jW r3 = new C158157jW(context);
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            C162177rO.A06("Calling this from your main thread can lead to deadlock");
            synchronized (r3) {
                try {
                    if (r3.A02) {
                        r3.A01();
                    }
                    Context context2 = r3.A03;
                    try {
                        context2.getPackageManager().getPackageInfo("com.android.vending", 0);
                        int A042 = C158267jh.A00.A04(context2, 12451000);
                        if (A042 == 0 || A042 == 2) {
                            C162727se r5 = new C162727se();
                            Intent A09 = AnonymousClass0x9.A09("com.google.android.gms.ads.identifier.service.START");
                            A09.setPackage("com.google.android.gms");
                            try {
                                if (C160517nn.A00().A02(context2, A09, r5, AnonymousClass000.A0O(context2), 1)) {
                                    r3.A00 = r5;
                                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                                    C162177rO.A06("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
                                    if (!r5.A00) {
                                        r5.A00 = true;
                                        IBinder iBinder = (IBinder) r5.A01.poll(10000, timeUnit);
                                        if (iBinder != null) {
                                            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                                            if (queryLocalInterface instanceof C187088wU) {
                                                r1 = (C187088wU) queryLocalInterface;
                                            } else {
                                                r1 = new C163197tQ(iBinder);
                                            }
                                            r3.A01 = r1;
                                            r3.A02 = true;
                                        } else {
                                            th2 = new TimeoutException("Timed out waiting for the service connection");
                                        }
                                    } else {
                                        th2 = AnonymousClass001.A0e("Cannot call get on this connection more than once");
                                    }
                                    throw th2;
                                }
                                th = AnonymousClass002.A0C("Connection failure");
                                throw th;
                            } catch (Throwable th4) {
                                th = new IOException(th4);
                            }
                        } else {
                            th = AnonymousClass002.A0C("Google Play services not available");
                            throw th;
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                        th = new C143476yw(9);
                    }
                } catch (InterruptedException unused2) {
                    th = AnonymousClass002.A0C("Interrupted exception");
                } catch (Throwable th5) {
                    th = th5;
                    throw th;
                }
            }
            C162177rO.A06("Calling this from your main thread can lead to deadlock");
            synchronized (r3) {
                try {
                    if (!r3.A02) {
                        synchronized (r3.A04) {
                            try {
                                throw AnonymousClass002.A0C("AdvertisingIdClient is not connected.");
                            } catch (Throwable th6) {
                                th3 = th6;
                                throw th3;
                            }
                        }
                    } else {
                        C162177rO.A02(r3.A00);
                        C187088wU r12 = r3.A01;
                        C162177rO.A02(r12);
                        Parcel obtain = Parcel.obtain();
                        obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                        Parcel A002 = ((C163197tQ) r12).A00(1, obtain);
                        String readString = A002.readString();
                        A002.recycle();
                        Parcel obtain2 = Parcel.obtain();
                        obtain2.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                        obtain2.writeInt(1);
                        Parcel A003 = ((C163197tQ) r3.A01).A00(2, obtain2);
                        boolean A1S = AnonymousClass000.A1S(A003.readInt());
                        A003.recycle();
                        r4 = new AnonymousClass2XM(readString, A1S);
                    }
                } catch (RemoteException e) {
                    Log.i("AdvertisingIdClient", "GMS remote exception ", e);
                    th3 = AnonymousClass002.A0C("Remote exception");
                } catch (Throwable th7) {
                    th = th7;
                    throw th;
                }
            }
            synchronized (r3.A04) {
                try {
                } catch (Throwable th8) {
                    while (true) {
                        th = th8;
                        break;
                    }
                }
            }
            long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
            if (Math.random() <= 0.0d) {
                HashMap A0t = AnonymousClass001.A0t();
                String str = "1";
                A0t.put("app_context", str);
                if (true != r4.A01) {
                    str = "0";
                }
                A0t.put("limit_ad_tracking", str);
                String str2 = r4.A00;
                if (str2 != null) {
                    A0t.put("ad_id_size", Integer.toString(str2.length()));
                }
                A0t.put("tag", "AdvertisingIdClient");
                A0t.put("time_spent", Long.toString(elapsedRealtime2));
                new C173738Rm(A0t).start();
            }
            r3.A01();
            return r4;
        } catch (Throwable th9) {
            r3.A01();
            throw th9;
        }
    }

    public final void A01() {
        C162177rO.A06("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            Context context = this.A03;
            if (this.A00 != null) {
                try {
                    if (this.A02) {
                        C160517nn.A00().A01(context, this.A00);
                    }
                } catch (Throwable th) {
                    Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", th);
                }
                this.A02 = false;
                this.A01 = null;
                this.A00 = null;
            }
        }
    }

    public C158157jW(Context context) {
        C162177rO.A02(context);
        Context applicationContext = context.getApplicationContext();
        this.A03 = applicationContext != null ? applicationContext : context;
        this.A02 = false;
    }

    public final void finalize() {
        A01();
        super.finalize();
    }
}
