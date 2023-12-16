package com.whatsapp.community.communityInfo;

import X.AnonymousClass00M;
import X.AnonymousClass08J;
import X.AnonymousClass48D;
import X.AnonymousClass4FS;
import X.AnonymousClass4FV;
import X.AnonymousClass58H;
import X.AnonymousClass66R;
import X.AnonymousClass6C6;
import X.C119255wg;
import X.C119265wh;
import X.C119275wi;
import X.C119285wj;
import X.C1214060k;
import X.C1214160l;
import X.C1223363z;
import X.C154517dI;
import X.C18270x1;
import X.C27991fJ;
import X.C56612sH;
import X.C56942so;
import X.C64773Ex;
import X.C69263Wi;
import X.C71313bu;
import X.C80223xt;
import X.C87994Wx;
import X.C95084sb;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public final class CAGInfoFragment extends Hilt_CAGInfoFragment {
    public C69263Wi A00;
    public C56942so A01;
    public C64773Ex A02;
    public C56612sH A03;
    public AnonymousClass4FV A04;
    public AnonymousClass48D A05;
    public C1223363z A06;
    public AnonymousClass4FS A07;
    public final C95084sb A08 = new C95084sb();
    public final AnonymousClass66R A09 = C154517dI.A01(new C119255wg(this));
    public final AnonymousClass66R A0A = C154517dI.A00(AnonymousClass58H.NONE, new C80223xt(this));
    public final AnonymousClass66R A0B = C154517dI.A01(new C119265wh(this));
    public final AnonymousClass66R A0C = C154517dI.A01(new C119275wi(this));
    public final AnonymousClass66R A0D = C154517dI.A01(new C119285wj(this));

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        RecyclerView recyclerView = new RecyclerView(A0G(), (AttributeSet) null);
        A1D();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1);
        linearLayoutManager.A1X(1);
        recyclerView.setLayoutManager(linearLayoutManager);
        if (bundle == null) {
            AnonymousClass4FS r2 = this.A07;
            if (r2 != null) {
                r2.BkM(new C71313bu((Object) this, 19));
            } else {
                throw C18270x1.A0S("waWorkers");
            }
        }
        AnonymousClass66R r0 = this.A0A;
        C27991fJ r22 = (C27991fJ) r0.getValue();
        C56942so r1 = this.A01;
        if (r1 != null) {
            C87994Wx r8 = new C87994Wx(this.A08, r22, r1.A01((C27991fJ) r0.getValue()));
            AnonymousClass66R r5 = this.A09;
            AnonymousClass08J r3 = ((CAGInfoViewModel) r5.getValue()).A08;
            AnonymousClass66R r4 = this.A0B;
            AnonymousClass6C6.A02((AnonymousClass00M) r4.getValue(), r3, new C1214060k(r8), 133);
            AnonymousClass6C6.A02((AnonymousClass00M) r4.getValue(), ((CAGInfoViewModel) r5.getValue()).A0K, new C1214160l(this), 134);
            r8.A0E(true);
            recyclerView.setAdapter(r8);
            return recyclerView;
        }
        throw C18270x1.A0S("communityChatManager");
    }

    public void A0a() {
        super.A0a();
        AnonymousClass4FV r1 = this.A04;
        if (r1 != null) {
            r1.BhD(this.A08);
            return;
        }
        throw C18270x1.A0S("wamRuntime");
    }
}
