package X;

import android.os.Handler;
import android.os.SystemClock;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jobqueue.job.BulkGetPreKeyJob;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.2qR  reason: invalid class name and case insensitive filesystem */
public class C55492qR {
    public boolean A00;
    public boolean A01;
    public final Handler A02;
    public final C49712gy A03;
    public final C56612sH A04;
    public final AnonymousClass1VX A05;
    public final AnonymousClass4FV A06;
    public final C54832pM A07 = new C54832pM(10, 610);
    public final Map A08 = AnonymousClass001.A0t();
    public final Map A09 = AnonymousClass001.A0t();

    public synchronized void A00() {
        if (this.A01) {
            this.A01 = false;
            this.A00 = false;
            this.A07.A02();
            A01();
        }
    }

    public synchronized void A01() {
        Map map = this.A09;
        if (!map.isEmpty()) {
            long uptimeMillis = SystemClock.uptimeMillis();
            ArrayList A0z = C18290x4.A0z(map);
            ArrayList A0s = AnonymousClass001.A0s();
            Iterator A0q = AnonymousClass000.A0q(map);
            while (A0q.hasNext()) {
                Map.Entry A0w = AnonymousClass001.A0w(A0q);
                DeviceJid A0Q = AnonymousClass0x9.A0Q(A0w);
                C43042Qn r2 = (C43042Qn) A0w.getValue();
                Map map2 = this.A08;
                if (!map2.containsKey(A0Q)) {
                    A0z.add(A0Q);
                    boolean z = r2.A04;
                    if (z) {
                        A0s.add(A0Q);
                    }
                    map2.put(A0Q, new C43042Qn(r2.A00, r2.A02, r2.A01, uptimeMillis, z));
                }
            }
            A02(A0z, A0s, 9);
            map.clear();
            this.A00 = false;
        }
    }

    public synchronized void A04(DeviceJid[] deviceJidArr, int i, boolean z) {
        synchronized (this) {
            A03(deviceJidArr, i, 0, 0, z);
        }
    }

    public synchronized void A03(DeviceJid[] deviceJidArr, int i, int i2, int i3, boolean z) {
        synchronized (this) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("prekeysmanager/getprekeys request for jids:");
            DeviceJid[] deviceJidArr2 = deviceJidArr;
            C18260x0.A1L(A0o, Arrays.toString(deviceJidArr2));
            long uptimeMillis = SystemClock.uptimeMillis();
            Map map = this.A08;
            Iterator A0q = AnonymousClass000.A0q(map);
            while (A0q.hasNext()) {
                if (((C43042Qn) AnonymousClass0x2.A0W(A0q)).A03 + 60000 < uptimeMillis) {
                    A0q.remove();
                }
            }
            ArrayList A0s = AnonymousClass001.A0s();
            ArrayList A0s2 = AnonymousClass001.A0s();
            long uptimeMillis2 = SystemClock.uptimeMillis();
            int length = deviceJidArr2.length;
            int i4 = 0;
            while (true) {
                int i5 = i;
                if (i4 < length) {
                    DeviceJid deviceJid = deviceJidArr[i4];
                    if (!map.containsKey(deviceJid)) {
                        A0s.add(deviceJid);
                        map.put(deviceJid, new C43042Qn(i5, i2, i3, uptimeMillis2, z));
                        if (z) {
                            A0s2.add(deviceJid);
                        }
                    }
                    i4++;
                } else {
                    A02(A0s, A0s2, i5);
                    StringBuilder A0o2 = AnonymousClass001.A0o();
                    A0o2.append("prekeysmanager/sending getprekeys for jids:");
                    C18260x0.A1L(A0o2, Arrays.toString(deviceJidArr2));
                    A00();
                }
            }
        }
    }

    public C55492qR(C49712gy r7, C56612sH r8, AnonymousClass1VX r9, AnonymousClass4FV r10) {
        Handler A0A = AnonymousClass000.A0A();
        this.A04 = r8;
        this.A05 = r9;
        this.A02 = A0A;
        this.A06 = r10;
        this.A03 = r7;
    }

    public void A02(List list, List list2, int i) {
        DeviceJid[] deviceJidArr;
        AnonymousClass1VX r3;
        int A0O;
        int A0O2;
        if (list.isEmpty()) {
            Log.i("prekeysmanager/startPrekeyFetchJobs jids list is empty");
            return;
        }
        Log.i("prekeysmanager/startPrekeyFetchJobs creating BulkGetPreKeyJob");
        if (list2.isEmpty()) {
            deviceJidArr = null;
        } else {
            deviceJidArr = (DeviceJid[]) list2.toArray(new DeviceJid[0]);
        }
        synchronized (this) {
            r3 = this.A05;
            A0O = r3.A0O(C58422vE.A01, 767);
        }
        int size = list.size();
        if (A0O <= 0 || size < A0O || (A0O2 = r3.A0O(C58422vE.A02, 921)) <= 0 || size <= A0O2) {
            this.A03.A02(new BulkGetPreKeyJob((DeviceJid[]) list.toArray(new DeviceJid[0]), deviceJidArr, i));
            return;
        }
        C71923ct r32 = new C71923ct(list.toArray(new DeviceJid[0]), A0O2);
        while (r32.hasNext()) {
            this.A03.A02(new BulkGetPreKeyJob((DeviceJid[]) r32.next(), deviceJidArr, i));
        }
    }
}
