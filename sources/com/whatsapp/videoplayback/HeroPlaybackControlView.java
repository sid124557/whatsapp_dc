package com.whatsapp.videoplayback;

import X.AnonymousClass000;
import X.AnonymousClass6C7;
import X.AnonymousClass74M;
import X.C109765f9;
import X.C109775fA;
import X.C138416qJ;
import X.C162997t6;
import X.C1672580j;
import X.C186478vP;
import X.C186498vS;
import X.C626936e;
import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import com.facebook.android.exoplayer2.Timeline;

public class HeroPlaybackControlView extends C138416qJ {
    public final Handler A00;
    public final C1672580j A01;
    public final C109765f9 A02;

    public void A0C() {
        C186478vP r0 = this.A03;
        C626936e.A06(r0);
        Timeline timeline = (Timeline) r0.B6c();
        if (timeline != null) {
            int B6d = this.A03.B6d();
            if (B6d < timeline.A01() - 1) {
                this.A03.Bl4(B6d + 1);
            } else if (timeline.A09(this.A01, B6d, 0).A09) {
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
            C1672580j r7 = this.A01;
            timeline.A09(r7, B6d, 0);
            if (B6d <= 0 || (this.A03.B6W() > 3000 && (!r7.A09 || r7.A0A))) {
                this.A03.Bl2(0);
            } else {
                this.A03.Bl4(B6d - 1);
            }
        }
    }

    public boolean A0F() {
        C186478vP r1 = this.A03;
        if (r1 != null) {
            AnonymousClass74M r12 = (AnonymousClass74M) r1;
            if (r12.A02 == 0 || !((C162997t6) r12.A01).A0L()) {
                return false;
            }
            return true;
        }
        return false;
    }

    public void setPlayer(Object obj) {
        C186478vP r0;
        if (!this.A02.A0X(6576) && (r0 = this.A03) != null) {
            C109765f9 r2 = this.A02;
            AnonymousClass74M r02 = (AnonymousClass74M) r0;
            int i = r02.A02;
            Object obj2 = r02.A01;
            if (i != 0) {
                AnonymousClass6C7.A10(((C162997t6) obj2).A0C, r2, 45);
            } else {
                ((C186498vS) obj2).BjC((C109775fA) r2);
            }
        }
        if (obj != null) {
            AnonymousClass74M r03 = new AnonymousClass74M(obj, 1, this);
            this.A03 = r03;
            AnonymousClass6C7.A10(((C162997t6) r03.A01).A0C, this.A02, 44);
        } else {
            this.A03 = null;
        }
        A08();
    }

    public HeroPlaybackControlView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A00 = AnonymousClass000.A0A();
        this.A01 = new C1672580j();
        C109765f9 r1 = new C109765f9(this);
        this.A02 = r1;
        this.A0J.setOnSeekBarChangeListener(r1);
        this.A0C.setOnClickListener(r1);
    }

    public HeroPlaybackControlView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public HeroPlaybackControlView(Context context) {
        this(context, (AttributeSet) null);
    }
}
