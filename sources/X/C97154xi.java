package X;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.4xi  reason: invalid class name and case insensitive filesystem */
public final class C97154xi extends C29451iq {
    public float A00;
    public int A01 = 200;
    public AtomicBoolean A02 = C18280x3.A0l();
    public final Context A03;
    public final C54412og A04;
    public final AnonymousClass1VX A05;
    public final C187958y5 A06;
    public final AnonymousClass66R A07 = C154517dI.A01(new C119765xV(this));
    public final AnonymousClass66R A08 = C154517dI.A01(new C119775xW(this));
    public final AnonymousClass66R A09 = C154517dI.A01(new C119785xX(this));
    public final AnonymousClass66R A0A;

    public final void A0A(Activity activity) {
        C162457s7.A0J(activity, 0);
        float A012 = C107065ad.A01(activity) / C86604Kt.A00(activity);
        float A002 = C107065ad.A00(activity) / C86604Kt.A00(activity);
        if (A012 > A002) {
            A012 = A002;
        }
        this.A00 = A012;
    }

    public final void A0C(C15790rw r6) {
        C162457s7.A0J(r6, 0);
        if (A0E()) {
            C08820fA r0 = (C08820fA) ((C05850Vf) this.A0A.getValue()).A01;
            ReentrantLock reentrantLock = C08820fA.A04;
            reentrantLock.lock();
            try {
                CopyOnWriteArrayList copyOnWriteArrayList = r0.A02;
                Iterator it = copyOnWriteArrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C04180Nd r1 = (C04180Nd) it.next();
                    if (C162457s7.A0P(r1.A02, r6)) {
                        copyOnWriteArrayList.remove(r1);
                        break;
                    }
                }
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public final boolean A0H() {
        return C107385bE.A03() && Float.compare(this.A00, (float) 600) > 0 && !A0E() && C18270x1.A1V(this.A08);
    }

    public final boolean A0J() {
        String str = Build.MANUFACTURER;
        if (str == null || !str.equalsIgnoreCase("samsung")) {
            return true;
        }
        return C107535bT.A06();
    }

    public C97154xi(Context context, C54412og r3, AnonymousClass1VX r4, C187958y5 r5, AnonymousClass66R r6) {
        C18260x0.A0R(r4, r3);
        C162457s7.A0J(r5, 5);
        this.A05 = r4;
        this.A0A = r6;
        this.A04 = r3;
        this.A03 = context;
        this.A06 = r5;
    }

    public static final C01370Ai A00(Intent intent, String str, List list, int i, int i2) {
        ArrayList A0c = C73783g4.A0c(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0c.add(new AnonymousClass0P7(new ComponentName(str, AnonymousClass001.A0m(it))));
        }
        AnonymousClass0M9 r0 = new AnonymousClass0M9(intent, C73723fy.A0P(A0c), i, i2);
        return new C01370Ai(r0.A02, r0.A03, r0.A01, r0.A00);
    }

    public final Intent A08(Activity activity, Intent intent) {
        C18260x0.A0O(activity, intent);
        if (!A0I() || intent.getStringExtra("primary_container_class") != null) {
            return intent;
        }
        Intent A022 = C627736r.A02(activity);
        A022.setData(intent.getData());
        A022.putExtras(intent);
        A022.putExtra("primary_container_class", "com.whatsapp.HomeActivity");
        A022.putExtra("secondary_container_class", "com.whatsapp.Conversation");
        return A022;
    }

    public final void A09(int i, boolean z) {
        if (A0I()) {
            Iterator A032 = C61102zi.A03(this);
            while (A032.hasNext()) {
                ((AnonymousClass5UN) A032.next()).A02(i, z);
            }
        }
    }

    public final void A0B(Activity activity, C15790rw r7) {
        C18260x0.A0O(activity, r7);
        if (A0E()) {
            Executor A092 = AnonymousClass0Y8.A09(activity);
            C162457s7.A0D(A092);
            C08820fA r3 = (C08820fA) ((C05850Vf) this.A0A.getValue()).A01;
            ReentrantLock reentrantLock = C08820fA.A04;
            reentrantLock.lock();
            try {
                if (r3.A00 == null) {
                    Log.v("EmbeddingBackend", "Extension not loaded, skipping callback registration.");
                    r7.AwB(C72023d3.A00);
                } else {
                    C04180Nd r1 = new C04180Nd(activity, r7, A092);
                    r3.A02.add(r1);
                    List list = r3.A01.A00;
                    if (list != null) {
                        C162457s7.A0H(list);
                    } else {
                        list = C72023d3.A00;
                    }
                    r1.A00(list);
                }
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public final void A0D(boolean z) {
        if (A0I() || z) {
            Iterator A032 = C61102zi.A03(this);
            while (A032.hasNext()) {
                ((AnonymousClass5UN) A032.next()).A00();
            }
        }
    }

    public final boolean A0E() {
        if (!A0G() || !C86654Ky.A1T(this.A04.A01, "otp_split_mode_user_choice")) {
            return false;
        }
        return true;
    }

    public final boolean A0F() {
        if (!A0H() || !C86654Ky.A1T(this.A04.A01, "otp_split_mode_user_choice")) {
            return false;
        }
        return true;
    }

    public final boolean A0G() {
        if (!C107385bE.A0A() || !A0J() || ((C08820fA) ((C05850Vf) this.A0A.getValue()).A01).A00 == null) {
            return false;
        }
        return true;
    }

    public final boolean A0I() {
        if (A0E() || A0F()) {
            return true;
        }
        return false;
    }
}
