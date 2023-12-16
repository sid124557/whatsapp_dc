package X;

import com.whatsapp.storage.StorageUsageActivity;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.29a  reason: invalid class name */
public class AnonymousClass29a implements AnonymousClass4EC {
    public Object A00;
    public final int A01;

    public AnonymousClass29a(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void BOj(C40462Fx r5) {
        C69263Wi r2;
        Runnable r1;
        if (this.A01 != 0) {
            ArrayList arrayList = r5.A00;
            r2 = ((C89654ea) this.A00).A05;
            r1 = new C71573cK(this, 32, arrayList);
        } else {
            Log.i("storage-usage-activity/fetch chats/completed");
            StorageUsageActivity storageUsageActivity = (StorageUsageActivity) this.A00;
            ArrayList arrayList2 = r5.A00;
            storageUsageActivity.A0Q = arrayList2;
            StorageUsageActivity.A0C(storageUsageActivity, arrayList2, (List) null, true);
            r2 = storageUsageActivity.A05;
            r1 = new C117635sF(this, 33);
        }
        r2.A0S(r1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005d, code lost:
        r2.add(r5);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BOk(X.C40472Fy r12) {
        /*
            r11 = this;
            int r0 = r11.A01
            if (r0 == 0) goto L_0x0017
            java.util.List r3 = r12.A00
            java.lang.Object r0 = r11.A00
            X.4ea r0 = (X.C89654ea) r0
            X.3Wi r2 = r0.A05
            r1 = 32
            X.3cK r0 = new X.3cK
            r0.<init>(r11, r1, r3)
            r2.A0S(r0)
        L_0x0016:
            return
        L_0x0017:
            java.lang.Object r6 = r11.A00
            com.whatsapp.storage.StorageUsageActivity r6 = (com.whatsapp.storage.StorageUsageActivity) r6
            X.4X8 r0 = r6.A0H
            if (r0 == 0) goto L_0x0016
            java.util.ArrayList r2 = X.AnonymousClass001.A0s()
            java.util.ArrayList r0 = r6.A0Q
            java.util.Iterator r7 = r0.iterator()
        L_0x0029:
            boolean r0 = r7.hasNext()
            r5 = 1
            if (r0 == 0) goto L_0x0061
            java.lang.Object r5 = r7.next()
            X.3ZS r5 = (X.AnonymousClass3ZS) r5
            java.util.List r0 = r12.A00
            java.util.Iterator r4 = r0.iterator()
        L_0x003c:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x005d
            java.lang.Object r3 = r4.next()
            X.3ZS r3 = (X.AnonymousClass3ZS) r3
            X.4uZ r1 = r3.A01()
            X.4uZ r0 = r5.A01()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x003c
            int r0 = r5.compareTo(r3)
            if (r0 == 0) goto L_0x005d
            goto L_0x0029
        L_0x005d:
            r2.add(r5)
            goto L_0x0029
        L_0x0061:
            java.util.ArrayList r0 = r6.A0Q
            int r1 = r0.size()
            int r0 = r2.size()
            if (r1 != r0) goto L_0x006e
            r5 = 0
        L_0x006e:
            r6.A0Q = r2
            java.util.List r7 = r12.A00
            java.util.Collections.sort(r7)
            r9 = 0
            java.lang.Object r1 = r7.get(r9)
            X.3ZS r1 = (X.AnonymousClass3ZS) r1
            boolean r0 = X.C60302yK.A00(r1)
            if (r0 != 0) goto L_0x0016
            java.util.ArrayList r2 = X.AnonymousClass002.A0J(r2)
            java.util.ArrayList r0 = X.AnonymousClass001.A0s()
            X.0PJ r4 = X.AnonymousClass0x9.A0G(r2, r0)
            r3 = 0
        L_0x008f:
            java.lang.Object r2 = r4.A00
            r8 = r2
            java.util.List r8 = (java.util.List) r8
            int r0 = r8.size()
            if (r9 >= r0) goto L_0x0105
            java.lang.Object r0 = r8.get(r9)
            X.3ZS r0 = (X.AnonymousClass3ZS) r0
            X.4uZ r10 = r0.A01()
            X.4uZ r0 = r1.A01()
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x00d2
            int r3 = r3 + 1
            int r0 = r7.size()
            if (r3 >= r0) goto L_0x00c2
            java.lang.Object r1 = r7.get(r3)
            X.3ZS r1 = (X.AnonymousClass3ZS) r1
            boolean r0 = X.C60302yK.A00(r1)
            if (r0 == 0) goto L_0x00d2
        L_0x00c2:
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            r6.A0Q = r2
            if (r5 == 0) goto L_0x00cd
            r0 = 0
        L_0x00c9:
            com.whatsapp.storage.StorageUsageActivity.A0C(r6, r2, r0, r5)
            return
        L_0x00cd:
            java.lang.Object r0 = r4.A01
            java.util.List r0 = (java.util.List) r0
            goto L_0x00c9
        L_0x00d2:
            java.lang.Object r0 = r8.get(r9)
            X.3ZS r0 = (X.AnonymousClass3ZS) r0
            int r0 = r1.compareTo(r0)
            if (r0 >= 0) goto L_0x0102
            r8.add(r9, r1)
            java.lang.Object r1 = r4.A01
            java.util.List r1 = (java.util.List) r1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            r1.add(r0)
            int r3 = r3 + 1
            int r0 = r7.size()
            if (r3 >= r0) goto L_0x00c2
            java.lang.Object r1 = r7.get(r3)
            X.3ZS r1 = (X.AnonymousClass3ZS) r1
            boolean r0 = X.C60302yK.A00(r1)
            if (r0 != 0) goto L_0x00c2
            int r9 = r9 + -1
        L_0x0102:
            int r9 = r9 + 1
            goto L_0x008f
        L_0x0105:
            int r0 = r7.size()
            if (r3 >= r0) goto L_0x00c2
            java.lang.Object r1 = r7.get(r3)
            X.3ZS r1 = (X.AnonymousClass3ZS) r1
            boolean r0 = X.C60302yK.A00(r1)
            if (r0 != 0) goto L_0x00c2
            r8.add(r1)
            java.lang.Object r1 = r4.A01
            java.util.List r1 = (java.util.List) r1
            int r0 = X.AnonymousClass002.A03(r8)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.add(r0)
            int r3 = r3 + 1
            goto L_0x0105
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass29a.BOk(X.2Fy):void");
    }

    public void BQm(AnonymousClass39K r4, C95814uZ r5) {
        if (this.A01 == 0) {
            ((C89654ea) this.A00).A05.A0S(new C70363aN(this, r5, r4, 18));
        }
    }
}
