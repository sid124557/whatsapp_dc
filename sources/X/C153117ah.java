package X;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.Pair;
import android.widget.ImageView;
import com.whatsapp.R;
import java.io.File;
import java.lang.Thread;
import java.util.List;
import java.util.Map;
import java.util.Stack;

/* renamed from: X.7ah  reason: invalid class name and case insensitive filesystem */
public abstract class C153117ah {
    public boolean A00;
    public boolean A01;
    public final C69263Wi A02;
    public final AnonymousClass30R A03;
    public final C185398ta A04;
    public final Object A05 = AnonymousClass002.A0D();
    public final String A06;
    public final List A07;
    public final List A08;
    public final Map A09 = AnonymousClass001.A0t();
    public final Stack A0A = new Stack();
    public final Stack A0B = new Stack();

    public abstract Pair A00(AnonymousClass7PR r1);

    public void A01(C186038ue r5) {
        synchronized (this.A05) {
            AnonymousClass7PR r2 = (AnonymousClass7PR) this.A09.get(r5.getId());
            if (r2 != null && r5.getId().equals(r2.A03)) {
                r2.A05.remove(r5);
            }
        }
    }

    public void A02(C186038ue r9, boolean z) {
        String str;
        C185398ta r5 = this.A04;
        r5.BVY(r9);
        AnonymousClass30R r2 = this.A03;
        Bitmap A002 = r2.A00(r9.getId());
        ImageView B8H = r9.B8H();
        if (!(B8H == null || B8H.getTag(R.id.optin_for_bitmapool_caching) == null || !AnonymousClass001.A1Z(B8H.getTag(R.id.optin_for_bitmapool_caching)))) {
            ImageView B8H2 = r9.B8H();
            if (B8H2 != null) {
                str = (String) B8H2.getTag(R.id.previous_loaded_image_url);
            } else {
                str = null;
            }
            String id = r9.getId();
            if (str != null) {
                if (id == null || !TextUtils.equals(str, id)) {
                    synchronized (r2.A03) {
                        Bitmap A003 = r2.A00(str);
                        if (A003 != null) {
                            r2.A04.A00(A003.getWidth(), A003.getHeight(), str);
                        }
                    }
                }
            }
            if (r9.B8H() != null) {
                r9.B8H().setTag(R.id.previous_loaded_image_url, id);
            }
        }
        if (A002 != null) {
            if (A002 != AnonymousClass30R.A07) {
                r5.BVd(A002, r9, true);
                return;
            } else if (!z) {
                r5.BVP(r9);
                return;
            }
        }
        r5.BMf(r9);
        C626936e.A01();
        synchronized (this.A05) {
            Map map = this.A09;
            AnonymousClass7PR r22 = (AnonymousClass7PR) map.get(r9.getId());
            if (r22 == null) {
                r22 = new AnonymousClass7PR(r9);
                map.put(r22.A03, r22);
            } else {
                r22.A05.put(r9, r9);
            }
            Stack stack = this.A0A;
            stack.remove(r22);
            this.A0B.remove(r22);
            stack.push(r22);
            synchronized (stack) {
                stack.notify();
            }
        }
        if (!this.A00) {
            for (Thread thread : this.A07) {
                if (thread.getState() == Thread.State.NEW) {
                    thread.start();
                }
            }
            this.A00 = true;
        }
        if (!this.A01) {
            for (Thread thread2 : this.A08) {
                if (thread2.getState() == Thread.State.NEW) {
                    thread2.start();
                }
            }
            this.A01 = true;
        }
    }

    public void A03(boolean z) {
        for (Thread interrupt : this.A08) {
            interrupt.interrupt();
        }
        for (Thread interrupt2 : this.A07) {
            interrupt2.interrupt();
        }
        this.A03.A05(z);
        this.A01 = false;
        this.A00 = false;
    }

    public C153117ah(C69263Wi r5, C185398ta r6, File file, String str, int i, long j) {
        this.A02 = r5;
        this.A06 = str;
        this.A03 = new AnonymousClass30R(file, j);
        this.A04 = r6;
        this.A07 = AnonymousClass002.A0I(i);
        this.A08 = AnonymousClass002.A0I(i);
        for (int i2 = 0; i2 < i; i2++) {
            this.A08.add(new C138266q2(this, this.A06));
            this.A07.add(new C138256q1(this, this.A06));
        }
    }
}
