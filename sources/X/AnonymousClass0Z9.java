package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.provider.Settings;
import android.util.Log;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.0Z9  reason: invalid class name */
public class AnonymousClass0Z9 implements ServiceConnection, Handler.Callback {
    public Set A00 = AnonymousClass002.A0K();
    public final Context A01;
    public final Handler A02;
    public final HandlerThread A03;
    public final Map A04 = AnonymousClass001.A0t();

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            AnonymousClass000.A19(componentName, "Connected to service ", "NotifManCompat", AnonymousClass001.A0o());
        }
        this.A02.obtainMessage(1, new AnonymousClass0L3(componentName, iBinder)).sendToTarget();
    }

    public void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            AnonymousClass000.A19(componentName, "Disconnected from service ", "NotifManCompat", AnonymousClass001.A0o());
        }
        this.A02.obtainMessage(2, componentName).sendToTarget();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0056, code lost:
        if (r11.A03 != false) goto L_0x0058;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(X.AnonymousClass0MJ r11) {
        /*
            r10 = this;
            java.lang.String r2 = "NotifManCompat"
            r7 = 3
            boolean r0 = android.util.Log.isLoggable(r2, r7)
            if (r0 == 0) goto L_0x002c
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Processing component "
            r1.append(r0)
            android.content.ComponentName r0 = r11.A04
            r1.append(r0)
            X.AnonymousClass001.A1M(r1)
            java.util.ArrayDeque r0 = r11.A02
            int r0 = r0.size()
            r1.append(r0)
            java.lang.String r0 = " queued tasks"
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)
            android.util.Log.d(r2, r0)
        L_0x002c:
            java.util.ArrayDeque r6 = r11.A02
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x009a
            boolean r0 = r11.A03
            if (r0 != 0) goto L_0x0058
            java.lang.String r1 = "android.support.BIND_NOTIFICATION_SIDE_CHANNEL"
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r1)
            android.content.ComponentName r4 = r11.A04
            android.content.Intent r1 = r0.setComponent(r4)
            android.content.Context r3 = r10.A01
            r0 = 33
            boolean r0 = r3.bindService(r1, r10, r0)
            r11.A03 = r0
            if (r0 == 0) goto L_0x0120
            r0 = 0
            r11.A00 = r0
        L_0x0054:
            boolean r0 = r11.A03
            if (r0 == 0) goto L_0x005c
        L_0x0058:
            X.0v8 r0 = r11.A01
            if (r0 != 0) goto L_0x009b
        L_0x005c:
            android.os.Handler r5 = r10.A02
            android.content.ComponentName r4 = r11.A04
            boolean r0 = r5.hasMessages(r7, r4)
            if (r0 != 0) goto L_0x009a
            int r0 = r11.A00
            r3 = 1
            int r1 = r0 + 1
            r11.A00 = r1
            r0 = 6
            if (r1 <= r0) goto L_0x0132
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Giving up on delivering "
            r1.append(r0)
            int r0 = r6.size()
            r1.append(r0)
            java.lang.String r0 = " tasks to "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = " after "
            r1.append(r0)
            int r0 = r11.A00
            r1.append(r0)
            java.lang.String r0 = " retries"
            X.AnonymousClass000.A1F(r0, r2, r1)
            r6.clear()
        L_0x009a:
            return
        L_0x009b:
            java.lang.Object r4 = r6.peek()
            X.0qR r4 = (X.C14890qR) r4
            if (r4 == 0) goto L_0x0118
            boolean r0 = android.util.Log.isLoggable(r2, r7)     // Catch:{ DeadObjectException -> 0x00ec, RemoteException -> 0x0105 }
            if (r0 == 0) goto L_0x00b2
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ DeadObjectException -> 0x00ec, RemoteException -> 0x0105 }
            java.lang.String r0 = "Sending task "
            X.AnonymousClass000.A19(r4, r0, r2, r1)     // Catch:{ DeadObjectException -> 0x00ec, RemoteException -> 0x0105 }
        L_0x00b2:
            X.0v8 r9 = r11.A01     // Catch:{ DeadObjectException -> 0x00ec, RemoteException -> 0x0105 }
            X.0cx r4 = (X.C07870cx) r4     // Catch:{ DeadObjectException -> 0x00ec, RemoteException -> 0x0105 }
            java.lang.String r8 = r4.A02     // Catch:{ DeadObjectException -> 0x00ec, RemoteException -> 0x0105 }
            int r5 = r4.A00     // Catch:{ DeadObjectException -> 0x00ec, RemoteException -> 0x0105 }
            java.lang.String r3 = r4.A03     // Catch:{ DeadObjectException -> 0x00ec, RemoteException -> 0x0105 }
            android.app.Notification r1 = r4.A01     // Catch:{ DeadObjectException -> 0x00ec, RemoteException -> 0x0105 }
            X.0Zn r9 = (X.AnonymousClass0Zn) r9     // Catch:{ DeadObjectException -> 0x00ec, RemoteException -> 0x0105 }
            android.os.Parcel r4 = android.os.Parcel.obtain()     // Catch:{ DeadObjectException -> 0x00ec, RemoteException -> 0x0105 }
            java.lang.String r0 = X.C17200v8.A00     // Catch:{ all -> 0x00e7 }
            r4.writeInterfaceToken(r0)     // Catch:{ all -> 0x00e7 }
            r4.writeString(r8)     // Catch:{ all -> 0x00e7 }
            r4.writeInt(r5)     // Catch:{ all -> 0x00e7 }
            r4.writeString(r3)     // Catch:{ all -> 0x00e7 }
            r0 = 0
            r3 = 1
            r4.writeInt(r3)     // Catch:{ all -> 0x00e7 }
            r1.writeToParcel(r4, r0)     // Catch:{ all -> 0x00e7 }
            android.os.IBinder r1 = r9.A00     // Catch:{ all -> 0x00e7 }
            r0 = 0
            r1.transact(r3, r4, r0, r3)     // Catch:{ all -> 0x00e7 }
            r4.recycle()     // Catch:{ DeadObjectException -> 0x00ec, RemoteException -> 0x0105 }
            r6.remove()     // Catch:{ DeadObjectException -> 0x00ec, RemoteException -> 0x0105 }
            goto L_0x009b
        L_0x00e7:
            r0 = move-exception
            r4.recycle()     // Catch:{ DeadObjectException -> 0x00ec, RemoteException -> 0x0105 }
            throw r0     // Catch:{ DeadObjectException -> 0x00ec, RemoteException -> 0x0105 }
        L_0x00ec:
            boolean r0 = android.util.Log.isLoggable(r2, r7)
            if (r0 == 0) goto L_0x0118
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Remote service has died: "
            r1.append(r0)
            android.content.ComponentName r0 = r11.A04
            java.lang.String r0 = X.AnonymousClass000.A0R(r0, r1)
            android.util.Log.d(r2, r0)
            goto L_0x0118
        L_0x0105:
            r3 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "RemoteException communicating with "
            r1.append(r0)
            android.content.ComponentName r0 = r11.A04
            java.lang.String r0 = X.AnonymousClass000.A0R(r0, r1)
            android.util.Log.w(r2, r0, r3)
        L_0x0118:
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x009a
            goto L_0x005c
        L_0x0120:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Unable to bind to listener "
            java.lang.String r0 = X.AnonymousClass000.A0P(r4, r0, r1)
            android.util.Log.w(r2, r0)
            r3.unbindService(r10)
            goto L_0x0054
        L_0x0132:
            int r1 = r1 - r3
            int r3 = r3 << r1
            int r3 = r3 * 1000
            boolean r0 = android.util.Log.isLoggable(r2, r7)
            if (r0 == 0) goto L_0x0151
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Scheduling retry for "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = " ms"
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)
            android.util.Log.d(r2, r0)
        L_0x0151:
            android.os.Message r2 = r5.obtainMessage(r7, r4)
            long r0 = (long) r3
            r5.sendMessageDelayed(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0Z9.A00(X.0MJ):void");
    }

    public boolean handleMessage(Message message) {
        Set set;
        C17200v8 r1;
        int i = message.what;
        if (i == 0) {
            Object obj = message.obj;
            Context context = this.A01;
            String string = Settings.Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
            synchronized (C05540Tx.A05) {
                if (string != null) {
                    if (!string.equals(C05540Tx.A03)) {
                        HashSet hashSet = new HashSet(r4);
                        for (String unflattenFromString : string.split(":", -1)) {
                            ComponentName unflattenFromString2 = ComponentName.unflattenFromString(unflattenFromString);
                            if (unflattenFromString2 != null) {
                                hashSet.add(unflattenFromString2.getPackageName());
                            }
                        }
                        C05540Tx.A04 = hashSet;
                        C05540Tx.A03 = string;
                    }
                }
                set = C05540Tx.A04;
            }
            if (!set.equals(this.A00)) {
                this.A00 = set;
                List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
                HashSet A0K = AnonymousClass002.A0K();
                for (ResolveInfo next : queryIntentServices) {
                    if (set.contains(next.serviceInfo.packageName)) {
                        ServiceInfo serviceInfo = next.serviceInfo;
                        ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                        if (next.serviceInfo.permission != null) {
                            StringBuilder A0o = AnonymousClass001.A0o();
                            A0o.append("Permission present on component ");
                            A0o.append(componentName);
                            AnonymousClass000.A1F(", not adding listener record.", "NotifManCompat", A0o);
                        } else {
                            A0K.add(componentName);
                        }
                    }
                }
                Iterator it = A0K.iterator();
                while (it.hasNext()) {
                    ComponentName componentName2 = (ComponentName) it.next();
                    Map map = this.A04;
                    if (!map.containsKey(componentName2)) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            AnonymousClass000.A19(componentName2, "Adding listener record for ", "NotifManCompat", AnonymousClass001.A0o());
                        }
                        map.put(componentName2, new AnonymousClass0MJ(componentName2));
                    }
                }
                Iterator A0q = AnonymousClass000.A0q(this.A04);
                while (A0q.hasNext()) {
                    Map.Entry A0w = AnonymousClass001.A0w(A0q);
                    if (!A0K.contains(A0w.getKey())) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            StringBuilder A0o2 = AnonymousClass001.A0o();
                            A0o2.append("Removing listener record for ");
                            Log.d("NotifManCompat", AnonymousClass000.A0R(A0w.getKey(), A0o2));
                        }
                        AnonymousClass0MJ r12 = (AnonymousClass0MJ) A0w.getValue();
                        if (r12.A03) {
                            context.unbindService(this);
                            r12.A03 = false;
                        }
                        r12.A01 = null;
                        A0q.remove();
                    }
                }
            }
            Iterator A0v = AnonymousClass001.A0v(this.A04);
            while (A0v.hasNext()) {
                AnonymousClass0MJ r13 = (AnonymousClass0MJ) A0v.next();
                r13.A02.add(obj);
                A00(r13);
            }
        } else if (i == 1) {
            AnonymousClass0L3 r0 = (AnonymousClass0L3) message.obj;
            ComponentName componentName3 = r0.A00;
            IBinder iBinder = r0.A01;
            AnonymousClass0MJ r2 = (AnonymousClass0MJ) this.A04.get(componentName3);
            if (r2 != null) {
                if (iBinder == null) {
                    r1 = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface(C17200v8.A00);
                    if (queryLocalInterface == null || !(queryLocalInterface instanceof C17200v8)) {
                        r1 = new AnonymousClass0Zn(iBinder);
                    } else {
                        r1 = (C17200v8) queryLocalInterface;
                    }
                }
                r2.A01 = r1;
                r2.A00 = 0;
                A00(r2);
                return true;
            }
        } else if (i == 2) {
            AnonymousClass0MJ r14 = (AnonymousClass0MJ) this.A04.get(message.obj);
            if (r14 != null) {
                if (r14.A03) {
                    this.A01.unbindService(this);
                    r14.A03 = false;
                }
                r14.A01 = null;
                return true;
            }
        } else if (i != 3) {
            return false;
        } else {
            AnonymousClass0MJ r02 = (AnonymousClass0MJ) this.A04.get(message.obj);
            if (r02 != null) {
                A00(r02);
            }
        }
        return true;
    }

    public AnonymousClass0Z9(Context context) {
        this.A01 = context;
        HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
        this.A03 = handlerThread;
        handlerThread.start();
        this.A02 = new Handler(handlerThread.getLooper(), this);
    }
}
