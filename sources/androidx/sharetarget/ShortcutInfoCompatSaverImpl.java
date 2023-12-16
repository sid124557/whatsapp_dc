package androidx.sharetarget;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass05C;
import X.AnonymousClass05G;
import X.AnonymousClass0U1;
import X.C03740Lj;
import X.C04560Ot;
import X.C05920Vm;
import X.C11960kk;
import X.C12650lt;
import X.C12670lv;
import X.C12680lw;
import X.C12690lx;
import X.C13240mr;
import X.C13270mu;
import X.C17900wQ;
import X.C188268yc;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ShortcutInfoCompatSaverImpl extends C04560Ot {
    public static final Object A07 = AnonymousClass002.A0D();
    public static volatile ShortcutInfoCompatSaverImpl A08;
    public final Context A00;
    public final File A01;
    public final File A02;
    public final Map A03 = new AnonymousClass05C();
    public final Map A04 = new AnonymousClass05C();
    public final ExecutorService A05;
    public final ExecutorService A06;

    public static ShortcutInfoCompatSaverImpl getInstance(Context context) {
        if (A08 == null) {
            synchronized (A07) {
                if (A08 == null) {
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    A08 = new ShortcutInfoCompatSaverImpl(context, new ThreadPoolExecutor(0, 1, 20, timeUnit, new LinkedBlockingQueue()), new ThreadPoolExecutor(0, 1, 20, timeUnit, new LinkedBlockingQueue()));
                }
            }
        }
        return A08;
    }

    public List A02() {
        return (List) this.A05.submit(new C17900wQ(this, 1)).get();
    }

    public C188268yc A03(Bitmap bitmap, String str) {
        C12680lw r3 = new C12680lw(bitmap, this, str);
        AnonymousClass05G A002 = AnonymousClass05G.A00();
        this.A06.submit(new C12690lx(A002, this, r3));
        return A002;
    }

    public void A04(AnonymousClass05G r5) {
        C13270mu r3 = new C13270mu(this, AnonymousClass002.A0J(this.A04.values()));
        AnonymousClass05G A002 = AnonymousClass05G.A00();
        this.A06.submit(new C12690lx(A002, this, r3));
        A002.AwV(new C12650lt(r5, this, A002), this.A05);
    }

    public ShortcutInfoCompatSaverImpl(Context context, ExecutorService executorService, ExecutorService executorService2) {
        this.A00 = context.getApplicationContext();
        this.A05 = executorService;
        this.A06 = executorService2;
        File A0A = AnonymousClass002.A0A(context.getFilesDir(), "ShortcutInfoCompatSaver_share_targets");
        this.A01 = AnonymousClass002.A0A(A0A, "ShortcutInfoCompatSaver_share_targets_bitmaps");
        this.A02 = AnonymousClass002.A0A(A0A, "targets.xml");
        executorService.submit(new C13240mr(this, A0A));
    }

    public /* bridge */ /* synthetic */ Object A00() {
        AnonymousClass05G A002 = AnonymousClass05G.A00();
        this.A05.submit(new C11960kk(A002, this));
        return A002;
    }

    public /* bridge */ /* synthetic */ Object A01(List list) {
        ArrayList A0p = AnonymousClass000.A0p(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0p.add(new C05920Vm((AnonymousClass0U1) it.next()).A00());
        }
        AnonymousClass05G A002 = AnonymousClass05G.A00();
        this.A05.submit(new C12670lv(A002, this, A0p));
        return A002;
    }

    public void A05(List list) {
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = ((C03740Lj) it.next()).A01;
            if (!TextUtils.isEmpty(str)) {
                A0s.add(str);
            }
        }
        for (File file : this.A01.listFiles()) {
            if (!A0s.contains(file.getAbsolutePath())) {
                file.delete();
            }
        }
    }
}
