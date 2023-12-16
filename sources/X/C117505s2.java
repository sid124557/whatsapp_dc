package X;

import android.appwidget.AppWidgetManager;
import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.5s2  reason: invalid class name and case insensitive filesystem */
public class C117505s2 implements Runnable {
    public final AppWidgetManager A00;
    public final Context A01;
    public final C69263Wi A02;
    public final C105275Ug A03;
    public final AnonymousClass314 A04;
    public final C620733j A05;
    public final C56982ss A06;
    public final C56152rV A07;
    public final AtomicBoolean A08 = new AtomicBoolean();
    public final int[] A09;

    public void run() {
        AtomicBoolean atomicBoolean = this.A08;
        if (!atomicBoolean.get()) {
            List A092 = this.A04.A09();
            ArrayList A0s = AnonymousClass001.A0s();
            Iterator it = A092.iterator();
            while (it.hasNext()) {
                C95814uZ A0P = C18300x5.A0P(it);
                if (!atomicBoolean.get()) {
                    int A032 = this.A06.A03(A0P);
                    if (A032 > 0) {
                        A0s.addAll(this.A07.A03(A0P, Math.min(A032, 100)));
                    }
                } else {
                    return;
                }
            }
            AnonymousClass6A6.A00(A0s, 7);
            this.A02.A0S(new C117165rU(this, 22, A0s));
        }
    }

    public C117505s2(AppWidgetManager appWidgetManager, Context context, C69263Wi r4, C105275Ug r5, AnonymousClass314 r6, C620733j r7, C56982ss r8, C56152rV r9, int[] iArr) {
        this.A01 = context;
        this.A02 = r4;
        this.A06 = r8;
        this.A03 = r5;
        this.A05 = r7;
        this.A00 = appWidgetManager;
        this.A07 = r9;
        this.A04 = r6;
        this.A09 = iArr;
    }
}
