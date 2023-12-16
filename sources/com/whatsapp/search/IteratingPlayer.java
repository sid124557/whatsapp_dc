package com.whatsapp.search;

import X.AnonymousClass0GH;
import X.AnonymousClass0O5;
import X.AnonymousClass4Z6;
import X.C1231767k;
import X.C15110qn;
import X.C16670tm;
import X.C69263Wi;
import X.C71283br;
import android.view.View;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class IteratingPlayer implements C16670tm, C15110qn {
    public int A00 = 0;
    public int A01 = 0;
    public int A02 = 0;
    public boolean A03;
    public final AnonymousClass0O5 A04 = new C1231767k(this, 14);
    public final RecyclerView A05;
    public final C69263Wi A06;
    public final Runnable A07 = new C71283br((Object) this, 21);

    public final void A01() {
        this.A03 = false;
        AnonymousClass4Z6 r0 = (AnonymousClass4Z6) this.A05.A0G(this.A00, false);
        if (r0 != null) {
            r0.A0B(false);
        }
        this.A06.A0R(this.A07);
    }

    public final void A00() {
        if (!this.A03) {
            this.A03 = true;
            this.A06.A0T(this.A07, 2000);
        }
    }

    public final void A02() {
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.A05.getLayoutManager();
        if (linearLayoutManager == null) {
            A00();
            return;
        }
        this.A01 = linearLayoutManager.A1G();
        this.A02 = linearLayoutManager.A1I();
    }

    public final void A03(int i) {
        if (this.A01 > 0 || this.A02 > 0) {
            int i2 = this.A00;
            RecyclerView recyclerView = this.A05;
            AnonymousClass4Z6 r0 = (AnonymousClass4Z6) recyclerView.A0G(i2, false);
            if (r0 != null) {
                r0.A0B(false);
            }
            int min = Math.min(Math.max(i, this.A01), this.A02);
            int i3 = min;
            do {
                AnonymousClass4Z6 r02 = (AnonymousClass4Z6) recyclerView.A0G(i3, false);
                if (r02 == null || !r02.A0C()) {
                    i3++;
                    int i4 = this.A02;
                    if (i3 > i4) {
                        i3 = this.A01;
                    }
                    if (min == i3) {
                        break;
                    } else if (i3 > i4) {
                        break;
                    }
                } else {
                    AnonymousClass4Z6 r03 = (AnonymousClass4Z6) recyclerView.A0G(i3, false);
                    if (r03 != null) {
                        r03.A0B(true);
                    }
                    this.A00 = i3;
                    return;
                }
            } while (i3 < this.A01);
        }
        A01();
    }

    public IteratingPlayer(RecyclerView recyclerView, C69263Wi r4) {
        this.A06 = r4;
        this.A05 = recyclerView;
    }

    public void BOt(View view) {
        A02();
        A00();
    }

    public void BOu(View view) {
        A02();
    }

    @OnLifecycleEvent(AnonymousClass0GH.ON_START)
    public void onStart() {
        A00();
    }

    @OnLifecycleEvent(AnonymousClass0GH.ON_STOP)
    public void onStop() {
        A01();
    }
}
