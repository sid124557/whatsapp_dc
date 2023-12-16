package com.whatsapp.calling;

import X.AnonymousClass3Ey;
import X.AnonymousClass4GJ;
import X.AnonymousClass5UX;
import X.C105365Uq;
import X.C114015mM;
import X.C116855qy;
import X.C184288rY;
import X.C620733j;
import X.C64333Db;
import X.C86614Ku;
import X.C86644Kx;
import X.C88014Wz;
import X.C88864av;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import java.util.List;

public class PeerAvatarLayout extends RecyclerView implements AnonymousClass4GJ {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public C88014Wz A05;
    public AnonymousClass5UX A06;
    public C184288rY A07;
    public C105365Uq A08;
    public C114015mM A09;
    public C620733j A0A;
    public C116855qy A0B;
    public boolean A0C;

    public class NonScrollingLinearLayoutManager extends LinearLayoutManager {
        public NonScrollingLinearLayoutManager() {
            super(1);
        }

        public boolean A17() {
            return false;
        }

        public boolean A18() {
            return false;
        }
    }

    public void A14(List list) {
        C88014Wz r2 = this.A05;
        List list2 = r2.A00;
        if (!list.equals(list2)) {
            C86644Kx.A1F(r2, list, list2);
        }
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A0B;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A0B = r0;
        }
        return r0.generatedComponent();
    }

    public PeerAvatarLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!this.A0C) {
            this.A0C = true;
            C64333Db A002 = C88864av.A00(generatedComponent());
            this.A06 = C86614Ku.A0R(A002);
            this.A09 = C64333Db.A29(A002);
            this.A0A = C64333Db.A2t(A002);
        }
        this.A05 = new C88014Wz(this);
        NonScrollingLinearLayoutManager nonScrollingLinearLayoutManager = new NonScrollingLinearLayoutManager();
        nonScrollingLinearLayoutManager.A1X(0);
        setLayoutManager(nonScrollingLinearLayoutManager);
        setAdapter(this.A05);
        this.A02 = getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
        this.A03 = getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
        this.A07 = new AnonymousClass3Ey(this.A06);
        C114015mM r3 = this.A09;
        Resources resources = getResources();
        int i2 = this.A04;
        this.A08 = r3.A07("peer-avatar-photo", 0.0f, resources.getDimensionPixelSize(i2 == 0 ? R.dimen.f6nameremoved : i2));
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C105365Uq r0 = this.A08;
        if (r0 != null) {
            r0.A00();
        }
    }

    public void setFixedContactPhotoSizeRes(int i) {
        this.A04 = i;
    }

    public PeerAvatarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PeerAvatarLayout(Context context) {
        this(context, (AttributeSet) null);
    }
}
