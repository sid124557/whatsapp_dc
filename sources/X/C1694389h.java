package X;

import android.content.Context;
import android.os.Bundle;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.IGmsServiceBroker;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/* renamed from: X.89h  reason: invalid class name and case insensitive filesystem */
public final class C1694389h implements C186128un, C187698xf {
    public int A00;
    public C127866Tp A01 = null;
    public final Context A02;
    public final C158267jh A03;
    public final AnonymousClass6QU A04;
    public final C127086Qo A05;
    public final AnonymousClass6VU A06;
    public final C184938sn A07;
    public final AnonymousClass7P4 A08;
    public final Map A09;
    public final Map A0A = AnonymousClass001.A0t();
    public final Map A0B;
    public final Condition A0C;
    public final Lock A0D;
    public volatile C186118um A0E;

    public final void A00(C127866Tp r3) {
        Lock lock = this.A0D;
        lock.lock();
        try {
            this.A01 = r3;
            this.A0E = new C1693889c(this);
            this.A0E.Bsx();
            this.A0C.signalAll();
        } finally {
            lock.unlock();
        }
    }

    public final void Bt7() {
        this.A0E.Bt0();
    }

    public final void Bt8() {
        this.A0E.Bt6();
        this.A0A.clear();
    }

    public final void Bt9(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int i;
        IInterface iInterface;
        IGmsServiceBroker iGmsServiceBroker;
        String str2;
        String str3;
        String str4 = str;
        String concat = String.valueOf(str4).concat("  ");
        PrintWriter printWriter2 = printWriter;
        printWriter2.append(str4).append("mState=").println(this.A0E);
        Iterator A0i = C18280x3.A0i(this.A0B);
        while (A0i.hasNext()) {
            C148727Jm r2 = (C148727Jm) A0i.next();
            printWriter2.append(str4).append(r2.A02).println(":");
            Object obj = this.A09.get(r2.A01);
            C162177rO.A02(obj);
            C160847oP r7 = (C160847oP) ((C187688xe) obj);
            synchronized (r7.A0M) {
                i = r7.A02;
                iInterface = r7.A06;
            }
            synchronized (r7.A0N) {
                iGmsServiceBroker = r7.A09;
            }
            printWriter2.append(concat).append("mConnectState=");
            if (i == 1) {
                str2 = "DISCONNECTED";
            } else if (i == 2) {
                str2 = "REMOTE_CONNECTING";
            } else if (i == 3) {
                str2 = "LOCAL_CONNECTING";
            } else if (i != 4) {
                str2 = "DISCONNECTING";
            } else {
                str2 = "CONNECTED";
            }
            printWriter2.print(str2);
            printWriter2.append(" mService=");
            if (iInterface == null) {
                printWriter2.append("null");
            } else {
                printWriter2.append(r7.A03()).append("@").append(AnonymousClass6CA.A0S(iInterface.asBinder()));
            }
            printWriter2.append(" mServiceBroker=");
            if (iGmsServiceBroker == null) {
                printWriter2.println("null");
            } else {
                printWriter2.append("IGmsServiceBroker@").println(AnonymousClass6CA.A0S(iGmsServiceBroker.asBinder()));
            }
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
            if (r7.A04 > 0) {
                PrintWriter append = printWriter2.append(concat).append("lastConnectedTime=");
                long j = r7.A04;
                String format = simpleDateFormat.format(new Date(j));
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append(j);
                append.println(AnonymousClass000.A0V(" ", format, A0o));
            }
            if (r7.A03 > 0) {
                printWriter2.append(concat).append("lastSuspendedCause=");
                int i2 = r7.A00;
                if (i2 == 1) {
                    str3 = "CAUSE_SERVICE_DISCONNECTED";
                } else if (i2 == 2) {
                    str3 = "CAUSE_NETWORK_LOST";
                } else if (i2 != 3) {
                    str3 = String.valueOf(i2);
                } else {
                    str3 = "CAUSE_DEAD_OBJECT_EXCEPTION";
                }
                printWriter2.append(str3);
                PrintWriter append2 = printWriter2.append(" lastSuspendedTime=");
                long j2 = r7.A03;
                String format2 = simpleDateFormat.format(new Date(j2));
                StringBuilder A0o2 = AnonymousClass001.A0o();
                A0o2.append(j2);
                append2.println(AnonymousClass000.A0V(" ", format2, A0o2));
            }
            if (r7.A05 > 0) {
                printWriter2.append(concat).append("lastFailedStatus=").append(C1446072f.A00(r7.A01));
                PrintWriter append3 = printWriter2.append(" lastFailedTime=");
                long j3 = r7.A05;
                String format3 = simpleDateFormat.format(new Date(j3));
                StringBuilder A0o3 = AnonymousClass001.A0o();
                A0o3.append(j3);
                append3.println(AnonymousClass000.A0V(" ", format3, A0o3));
            }
        }
    }

    public final void BtA() {
    }

    public final boolean BtB() {
        return this.A0E instanceof C1693789b;
    }

    public final boolean BtC(C178378hR r2) {
        return false;
    }

    public final void onConnected(Bundle bundle) {
        Lock lock = this.A0D;
        lock.lock();
        try {
            this.A0E.Bt3(bundle);
        } finally {
            lock.unlock();
        }
    }

    public final void onConnectionSuspended(int i) {
        Lock lock = this.A0D;
        lock.lock();
        try {
            this.A0E.Bt5(i);
        } finally {
            lock.unlock();
        }
    }

    public C1694389h(Context context, Looper looper, C158267jh r6, AnonymousClass6QU r7, C127086Qo r8, C184938sn r9, AnonymousClass7P4 r10, ArrayList arrayList, Map map, Map map2, Lock lock) {
        this.A02 = context;
        this.A0D = lock;
        this.A03 = r6;
        this.A09 = map;
        this.A08 = r10;
        this.A0B = map2;
        this.A04 = r7;
        this.A05 = r8;
        this.A07 = r9;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((AnonymousClass899) arrayList.get(i)).A00 = this;
        }
        this.A06 = new AnonymousClass6VU(looper, this);
        this.A0C = lock.newCondition();
        this.A0E = new C1693889c(this);
    }

    public final C127186Qz Bsz(C127186Qz r2) {
        r2.A04();
        this.A0E.Bsq(r2);
        return r2;
    }

    public final C127186Qz Bt2(C127186Qz r2) {
        r2.A04();
        return this.A0E.Bss(r2);
    }
}
