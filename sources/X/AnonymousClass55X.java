package X;

import android.database.Cursor;
import android.database.sqlite.SQLiteDiskIOException;
import android.os.OperationCanceledException;
import android.os.SystemClock;
import com.whatsapp.gallery.GalleryFragmentBase;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: X.55X  reason: invalid class name */
public class AnonymousClass55X extends AnonymousClass5ZM {
    public int A00;
    public AnonymousClass0QU A01;
    public final C620733j A02;
    public final C28761hj A03;
    public final AnonymousClass7U5 A04;
    public final C95814uZ A05;
    public final C56532s8 A06;
    public final C55832qz A07;
    public final WeakReference A08;

    public void A0G() {
        A0D(true);
        synchronized (this) {
            AnonymousClass0QU r0 = this.A01;
            if (r0 != null) {
                r0.A01();
            }
        }
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        Cursor A1J;
        C624134x A042;
        GalleryFragmentBase galleryFragmentBase = (GalleryFragmentBase) this.A08.get();
        AnonymousClass4MC r11 = this.A02;
        if (r11.isCancelled() || galleryFragmentBase == null) {
            return null;
        }
        AnonymousClass0QU r1 = new AnonymousClass0QU();
        synchronized (this) {
            this.A01 = r1;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        ArrayList A0s = AnonymousClass001.A0s();
        try {
            C95814uZ r10 = this.A05;
            A1J = galleryFragmentBase.A1J(r1, r10, this.A06);
            C118305tK r7 = null;
            while (A1J != null) {
                if (!A1J.moveToNext() || r11.isCancelled()) {
                    break;
                }
                if (A1J instanceof C86684Lb) {
                    A042 = ((C86684Lb) A1J).A00();
                } else {
                    A042 = this.A07.A04(A1J, r10);
                }
                C626936e.A06(A042);
                C118305tK A002 = this.A04.A00(A042.A0K);
                if (r7 != null) {
                    if (!r7.equals(A002)) {
                        A0s.add(r7);
                    }
                    r7.count++;
                    if (!A0s.isEmpty() && 1000 + uptimeMillis < SystemClock.uptimeMillis()) {
                        uptimeMillis = SystemClock.uptimeMillis();
                        ArrayList A0J = AnonymousClass002.A0J(A0s);
                        A0s.clear();
                        A0F(A0J);
                    }
                }
                A002.count = 0;
                r7 = A002;
                r7.count++;
                uptimeMillis = SystemClock.uptimeMillis();
                ArrayList A0J2 = AnonymousClass002.A0J(A0s);
                A0s.clear();
                A0F(A0J2);
            }
            if (r7 != null && !r11.isCancelled()) {
                A0s.add(r7);
            }
            if (!A0s.isEmpty()) {
                A0F(A0s);
            }
            if (A1J != null) {
                A1J.close();
            }
            synchronized (this) {
                this.A01 = null;
            }
        } catch (OperationCanceledException unused) {
            Log.e("GalleryFragmentBase/doInBackground/OperationCanceledException");
            synchronized (this) {
                this.A01 = null;
            }
        } catch (SQLiteDiskIOException e) {
            try {
                this.A03.A08(1);
                throw e;
            } catch (Throwable th) {
                th = th;
                synchronized (this) {
                    try {
                        this.A01 = null;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    throw th;
                }
            }
        } catch (Throwable th3) {
            th.addSuppressed(th3);
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(galleryFragmentBase.A0J);
        C18260x0.A1L(A0o, "/all buckets assigned");
        return null;
        throw th;
    }

    public AnonymousClass55X(C620733j r3, C28761hj r4, GalleryFragmentBase galleryFragmentBase, C95814uZ r6, C56532s8 r7, C55832qz r8) {
        this.A02 = r3;
        this.A07 = r8;
        this.A03 = r4;
        this.A08 = AnonymousClass0x9.A14(galleryFragmentBase);
        this.A05 = r6;
        this.A06 = r7;
        this.A04 = new AnonymousClass7U5(galleryFragmentBase.A0G(), r3);
    }
}
