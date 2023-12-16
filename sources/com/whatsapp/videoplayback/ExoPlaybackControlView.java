package com.whatsapp.videoplayback;

import X.AnonymousClass561;
import X.AnonymousClass6C7;
import X.AnonymousClass6C8;
import X.AnonymousClass74M;
import X.C109775fA;
import X.C111685iW;
import X.C158647kK;
import X.C162997t6;
import X.C186478vP;
import X.C186498vS;
import X.C626936e;
import X.C64333Db;
import X.C86604Kt;
import X.C88864av;
import android.content.Context;
import android.util.AttributeSet;
import com.google.android.exoplayer2.Timeline;

public class ExoPlaybackControlView extends AnonymousClass561 {
    public boolean A00;
    public final C158647kK A01;
    public final C109775fA A02;

    public void A02() {
        if (!this.A00) {
            this.A00 = true;
            C64333Db r1 = ((C88864av) ((C111685iW) generatedComponent())).A0K;
            this.A02 = C86604Kt.A0Y(r1);
            this.A01 = C64333Db.A2t(r1);
        }
    }

    public void A0C() {
        C186478vP r0 = this.A03;
        C626936e.A06(r0);
        Timeline timeline = (Timeline) r0.B6c();
        if (timeline != null) {
            int B6d = this.A03.B6d();
            if (B6d < timeline.A01() - 1) {
                this.A03.Bl4(B6d + 1);
            } else if (AnonymousClass6C8.A0X(this.A01, timeline, B6d).A0A) {
                this.A03.Bl3();
            }
        }
    }

    public void A0D() {
        C186478vP r0 = this.A03;
        C626936e.A06(r0);
        Timeline timeline = (Timeline) r0.B6c();
        if (timeline != null) {
            int B6d = this.A03.B6d();
            C158647kK r7 = this.A01;
            timeline.A0B(r7, B6d, 0);
            if (B6d <= 0 || (this.A03.B6W() > 3000 && (!r7.A0A || r7.A0D))) {
                this.A03.Bl2(0);
            } else {
                this.A03.Bl4(B6d - 1);
            }
        }
    }

    public void setPlayer(Object obj) {
        C186478vP r0 = this.A03;
        if (r0 != null) {
            C109775fA r2 = this.A02;
            AnonymousClass74M r02 = (AnonymousClass74M) r0;
            int i = r02.A02;
            Object obj2 = r02.A01;
            if (i != 0) {
                AnonymousClass6C7.A10(((C162997t6) obj2).A0C, r2, 45);
            } else {
                ((C186498vS) obj2).BjC(r2);
            }
        }
        if (obj != null) {
            AnonymousClass74M r03 = new AnonymousClass74M(obj, 0, this);
            this.A03 = r03;
            ((C186498vS) r03.A01).AwU(this.A02);
        }
        A08();
    }

    public ExoPlaybackControlView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A02();
        this.A01 = new C158647kK();
        C109775fA r1 = new C109775fA(this);
        this.A02 = r1;
        this.A0J.setOnSeekBarChangeListener(r1);
        this.A0C.setOnClickListener(r1);
    }

    public ExoPlaybackControlView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ExoPlaybackControlView(Context context) {
        this(context, (AttributeSet) null);
    }
}
