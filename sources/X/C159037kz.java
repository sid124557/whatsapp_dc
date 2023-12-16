package X;

import android.animation.Animator;
import android.content.Context;
import android.os.Handler;
import android.util.SparseArray;
import android.view.Choreographer;
import android.view.View;
import com.facebook.rendercore.RootHostView;
import com.whatsapp.R;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.7kz  reason: invalid class name and case insensitive filesystem */
public class C159037kz {
    public RootHostView A00;
    public final C158987ku A01;
    public final C153427bI A02;
    public final C147897Gd A03;
    public final C160817oM A04;
    public final Object A05;
    public final Object A06;
    public final List A07;
    public final Executor A08;
    public final AtomicBoolean A09 = new AtomicBoolean(false);
    public final AtomicReference A0A;
    public final AtomicReference A0B;

    public static C54852pO A00(Context context, AnonymousClass7r0 r2, C47382dA r3) {
        return new C54852pO(context, r2, r3);
    }

    public View A01() {
        return this.A00;
    }

    public C153427bI A02() {
        if (this.A09.get()) {
            C159737mN.A01("BloksHostingComponent", "Trying to access a BloksContext form a destroyed BloksHostingComponent");
        }
        return this.A02;
    }

    public void A05() {
        if (this.A09.get()) {
            C159737mN.A01("BloksHostingComponent", "Trying to detach a view from a destroyed BloksHostingComponent");
            return;
        }
        RootHostView rootHostView = this.A00;
        if (rootHostView != null) {
            rootHostView.setRenderState((C158987ku) null);
            this.A00 = null;
        }
    }

    public final void A06() {
        AnonymousClass7P6 r1;
        synchronized (this.A06) {
            if (!this.A09.get()) {
                C151617Vm r4 = (C151617Vm) this.A0B.get();
                Map map = (Map) this.A0A.get();
                if (r4 == null || map == null) {
                    throw AnonymousClass001.A0e("TreeState was null but it should have been initialised by the constructor");
                }
                C153427bI r2 = this.A02;
                C147907Ge r0 = this.A03.A00;
                if (r0 != null) {
                    r1 = r0.A01;
                } else {
                    r1 = null;
                }
                this.A01.A02(new C146727Bj(new AnonymousClass7K5(r2, r4, r1, map)), this.A08);
            }
        }
    }

    public void A07(RootHostView rootHostView) {
        if (this.A09.get()) {
            C159737mN.A01("BloksHostingComponent", "Trying to attach a view to a destroyed BloksHostingComponent");
            return;
        }
        RootHostView rootHostView2 = this.A00;
        if (!(rootHostView2 == null || rootHostView2 == rootHostView)) {
            A05();
        }
        this.A00 = rootHostView;
        rootHostView.setRenderState(this.A01);
        this.A00.requestLayout();
    }

    public C159037kz(Context context, SparseArray sparseArray, AnonymousClass7r0 r10, C47382dA r11, Map map, Map map2) {
        AtomicReference atomicReference = new AtomicReference();
        this.A0B = atomicReference;
        this.A06 = AnonymousClass002.A0D();
        this.A05 = AnonymousClass002.A0D();
        this.A08 = new C173148Om(this);
        List list = r10.A00.A02;
        this.A07 = list;
        AnonymousClass79U.A01.incrementAndGet();
        SparseArray clone = sparseArray.clone();
        clone.put(R.id.bk_context_key_render_callback_queue, new C156837hI(false));
        C153427bI A012 = C162377rs.A01(context, clone, new C160817oM(r10, new C155007e8(), AnonymousClass8DC.A00), r11, r10.A02);
        this.A02 = A012;
        C160817oM A022 = C162377rs.A02(A012);
        this.A04 = A022;
        this.A0A = new AtomicReference(AnonymousClass7r0.A04(list, map));
        C147897Gd r1 = new C147897Gd(A022);
        this.A03 = r1;
        AnonymousClass73A.A00(A012);
        this.A01 = new C158987ku(context, r1, A012);
        AnonymousClass0IR.A00((Object) null, A022.A02(A012, new C170308Cr(this), map2), atomicReference);
        A06();
    }

    public void A03() {
        A05();
        C153427bI A022 = A02();
        HashMap hashMap = (HashMap) A022.A02(R.id.bk_context_key_animations);
        Iterator A10 = C18290x4.A10((AbstractMap) hashMap.clone());
        while (A10.hasNext()) {
            ((Animator) A10.next()).cancel();
        }
        if (!hashMap.isEmpty()) {
            hashMap.clear();
        }
        HashMap hashMap2 = (HashMap) A022.A02(R.id.bk_context_key_timers);
        Iterator A102 = C18290x4.A10((AbstractMap) hashMap2.clone());
        while (A102.hasNext()) {
            ((C157637id) A102.next()).A00();
        }
        if (!hashMap2.isEmpty()) {
            C159737mN.A01("BloksTimer", "Timer map is non-empty after cleanup!");
            hashMap2.clear();
        }
        C160817oM A023 = C162377rs.A02(A022);
        A023.A0A = true;
        A023.A01.A00();
        C156837hI r2 = (C156837hI) A022.A01.get(R.id.bk_context_key_render_callback_queue);
        if (r2 != null) {
            r2.A00 = true;
            ((Handler) r2.A05.getValue()).removeCallbacksAndMessages(r2.A03);
            Choreographer.getInstance().removeFrameCallback(r2.A02);
        }
        this.A09.set(true);
        C161147p5.A00().removeCallbacksAndMessages(this.A05);
        AnonymousClass79U.A02.incrementAndGet();
    }

    public void A04() {
        A05();
    }
}
