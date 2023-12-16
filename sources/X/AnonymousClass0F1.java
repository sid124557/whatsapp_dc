package X;

import android.os.Bundle;
import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: X.0F1  reason: invalid class name */
public class AnonymousClass0F1 extends C61102zi {
    public volatile int A00 = -1;
    public volatile int A01 = -1;

    public void A09() {
        this.A00 = 0;
        Iterator it = A05().iterator();
        while (it.hasNext()) {
            A00(it).BNQ();
        }
    }

    public void A0E() {
        this.A01 = 0;
        Iterator it = A05().iterator();
        while (it.hasNext()) {
            A00(it).BWJ();
        }
    }

    public void A0H() {
        this.A00 = -1;
        this.A01 = -1;
    }

    public void A08() {
        Log.i("GoogleBackupRestoreObservable/backup cancelled");
        this.A00 = 0;
        Iterator it = A05().iterator();
        while (it.hasNext()) {
            A00(it).BNI();
        }
    }

    public void A0D() {
        Log.i("restore>GoogleBackupRestoreObservable/notify-media-restore-cancelled");
        this.A01 = -1;
        Iterator it = A05().iterator();
        while (it.hasNext()) {
            A00(it).BWB();
        }
    }

    public void A0Q(long j, long j2) {
        int i;
        if (j2 > 0) {
            i = Math.min(100, AnonymousClass001.A0F(j, j2));
        } else {
            i = -1;
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("GoogleBackupRestoreObservable/backup-preparation-progress ");
            A0o.append(j);
            Log.i(AnonymousClass000.A0Z("/", A0o, j2));
        }
        if (i != this.A00) {
            this.A00 = i;
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append("GoogleBackupRestoreObservable/backup-preparation-progress/");
            A0o2.append(i);
            Log.i(AnonymousClass000.A0X("%", A0o2));
            Iterator it = A05().iterator();
            while (it.hasNext()) {
                A00(it).BNP(this.A00);
            }
        }
    }

    public void A0X(long j, long j2) {
        int i = this.A01;
        if (j2 > 0) {
            i = AnonymousClass001.A0F(j, j2);
        }
        if (i != this.A01) {
            Locale locale = Locale.ENGLISH;
            Object[] objArr = new Object[3];
            AnonymousClass000.A1Q(objArr, 0, j);
            AnonymousClass000.A1Q(objArr, 1, j2);
            AnonymousClass000.A1P(objArr, i, 2);
            Log.i(String.format(locale, "restore>GoogleBackupRestoreObservable/media-restore-preparation-progress %d/%d (%d%%)", objArr));
            this.A01 = i;
            Iterator it = A05().iterator();
            while (it.hasNext()) {
                A00(it).BWI(this.A01);
            }
        }
    }

    public void A0a(long j, boolean z) {
        String str;
        Locale locale = Locale.ENGLISH;
        Object[] A0M = AnonymousClass002.A0M();
        if (z) {
            str = "successful";
        } else {
            str = "failed";
        }
        A0M[0] = str;
        AnonymousClass000.A1Q(A0M, 1, j);
        String.format(locale, "restore>GoogleBackupRestoreObservable/notify-media-restore-end result:%s restored:%d", A0M);
        this.A01 = -1;
        Iterator it = A05().iterator();
        while (it.hasNext()) {
            A00(it).BWC(j, z);
        }
    }

    public static C17110ua A00(Iterator it) {
        return (C17110ua) it.next();
    }

    public void A0A() {
        Iterator it = A05().iterator();
        while (it.hasNext()) {
            A00(it).BNS();
        }
    }

    public void A0B() {
        Iterator it = A05().iterator();
        while (it.hasNext()) {
            A00(it).BRt();
        }
    }

    public void A0C() {
        Iterator it = A05().iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public void A0F() {
        Iterator it = A05().iterator();
        while (it.hasNext()) {
            A00(it).BWd();
        }
    }

    public void A0G() {
        Iterator it = A05().iterator();
        while (it.hasNext()) {
            A00(it).Bew();
        }
    }

    public void A0I(int i, Bundle bundle) {
        Iterator it = A05().iterator();
        while (it.hasNext()) {
            A00(it).BSQ(i, bundle);
        }
    }

    public void A0J(int i, Bundle bundle) {
        Iterator it = A05().iterator();
        while (it.hasNext()) {
            A00(it).BSR(i, bundle);
        }
    }

    public void A0K(int i, Bundle bundle) {
        Iterator it = A05().iterator();
        while (it.hasNext()) {
            A00(it).BSS(i, bundle);
        }
    }

    public void A0L(long j, long j2) {
        Iterator it = A05().iterator();
        while (it.hasNext()) {
            A00(it).BNK(j, j2);
        }
    }

    public void A0M(long j, long j2) {
        Iterator it = A05().iterator();
        while (it.hasNext()) {
            A00(it).BNL(j, j2);
        }
    }

    public void A0N(long j, long j2) {
        Iterator it = A05().iterator();
        while (it.hasNext()) {
            A00(it).BNM(j, j2);
        }
    }

    public void A0O(long j, long j2) {
        Iterator it = A05().iterator();
        while (it.hasNext()) {
            A00(it).BNN(j, j2);
        }
    }

    public void A0P(long j, long j2) {
        Iterator it = A05().iterator();
        while (it.hasNext()) {
            A00(it).BNO(j, j2);
        }
    }

    public void A0R(long j, long j2) {
        Iterator it = A05().iterator();
        while (it.hasNext()) {
            A00(it).BNR(j, j2);
        }
    }

    public void A0S(long j, long j2) {
        Iterator it = A05().iterator();
        while (it.hasNext()) {
            A00(it).BWD(j, j2);
        }
    }

    public void A0T(long j, long j2) {
        Iterator it = A05().iterator();
        while (it.hasNext()) {
            A00(it).BWE(j, j2);
        }
    }

    public void A0U(long j, long j2) {
        Iterator it = A05().iterator();
        while (it.hasNext()) {
            A00(it).BWF(j, j2);
        }
    }

    public void A0V(long j, long j2) {
        Iterator it = A05().iterator();
        while (it.hasNext()) {
            A00(it).BWG(j, j2);
        }
    }

    public void A0W(long j, long j2) {
        Iterator it = A05().iterator();
        while (it.hasNext()) {
            A00(it).BWH(j, j2);
        }
    }

    public void A0Y(long j, long j2) {
        Iterator it = A05().iterator();
        while (it.hasNext()) {
            A00(it).BWK(j, j2);
        }
    }

    public void A0Z(long j, long j2) {
        Iterator it = A05().iterator();
        while (it.hasNext()) {
            A00(it).BWc(j, j2);
        }
    }

    public void A0b(boolean z) {
        Iterator it = A05().iterator();
        while (it.hasNext()) {
            A00(it).BLu(z);
        }
    }

    public void A0c(boolean z) {
        Log.i(AnonymousClass000.A0b("GoogleBackupRestoreObservable/backup-end/success: ", AnonymousClass001.A0o(), z));
        this.A00 = 0;
        Iterator it = A05().iterator();
        while (it.hasNext()) {
            A00(it).BNJ(z);
        }
    }

    public void A0d(boolean z) {
        Iterator it = A05().iterator();
        while (it.hasNext()) {
            A00(it).BWb(z);
        }
    }
}
