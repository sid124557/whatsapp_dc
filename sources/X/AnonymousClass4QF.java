package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.TextureView;
import android.widget.FrameLayout;
import com.whatsapp.R;
import com.whatsapp.bonsai.embodiment.BotEmbodimentViewModel;
import com.whatsapp.util.Log;

/* renamed from: X.4QF  reason: invalid class name */
public final class AnonymousClass4QF extends FrameLayout implements AnonymousClass4GJ {
    public C69263Wi A00;
    public BotEmbodimentViewModel A01;
    public C158617kH A02;
    public C147087Ct A03;
    public C57162tC A04;
    public AnonymousClass5NV A05;
    public AnonymousClass4FS A06;
    public C116855qy A07;
    public boolean A08;
    public final AnonymousClass66R A09;
    public final AnonymousClass66R A0A;

    public AnonymousClass4QF(Context context) {
        super(context, (AttributeSet) null, 0);
        if (!this.A08) {
            this.A08 = true;
            C64333Db A002 = C88864av.A00(generatedComponent());
            this.A06 = C64333Db.A8y(A002);
            this.A04 = C86624Kv.A0R(A002);
            this.A05 = (AnonymousClass5NV) A002.A00.A5r.get();
            this.A03 = new C147087Ct(C86604Kt.A0Z(A002));
            this.A00 = C64333Db.A04(A002);
        }
        this.A09 = C154517dI.A01(new C175038Wv(context, this));
        this.A0A = C154517dI.A01(new AnonymousClass8VP(this));
        setClipToOutline(true);
        setBackgroundResource(R.drawable.bonsai_hero_player_background);
        setId(R.id.bot_embodiment_view);
        setElevation(C86664Kz.A01(context.getResources(), R.dimen.f6nameremoved));
    }

    public final void setEmbodimentVideoLogger(C147087Ct r2) {
        C162457s7.A0J(r2, 0);
        this.A03 = r2;
    }

    public final void setGlobalUI(C69263Wi r2) {
        C162457s7.A0J(r2, 0);
        this.A00 = r2;
    }

    public final void setHeroSettingProvider(AnonymousClass5NV r2) {
        C162457s7.A0J(r2, 0);
        this.A05 = r2;
    }

    public final void setWaDebugBuildSharedPreferences(C57162tC r2) {
        C162457s7.A0J(r2, 0);
        this.A04 = r2;
    }

    public final void setWaWorkers(AnonymousClass4FS r2) {
        C162457s7.A0J(r2, 0);
        this.A06 = r2;
    }

    /* access modifiers changed from: private */
    public final AnonymousClass5KS getQueuePlayer() {
        return (AnonymousClass5KS) this.A09.getValue();
    }

    private final AnonymousClass5KS getWaAIBotVideoPlayer() {
        return (AnonymousClass5KS) this.A0A.getValue();
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A07;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A07 = r0;
        }
        return r0.generatedComponent();
    }

    public final C147087Ct getEmbodimentVideoLogger() {
        C147087Ct r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("embodimentVideoLogger");
    }

    public final C69263Wi getGlobalUI() {
        C69263Wi r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("globalUI");
    }

    public final AnonymousClass5NV getHeroSettingProvider() {
        AnonymousClass5NV r0 = this.A05;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("heroSettingProvider");
    }

    public final C57162tC getWaDebugBuildSharedPreferences() {
        C57162tC r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("waDebugBuildSharedPreferences");
    }

    public final AnonymousClass4FS getWaWorkers() {
        AnonymousClass4FS r0 = this.A06;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("waWorkers");
    }

    public final void A01() {
        AnonymousClass5KS waAIBotVideoPlayer = getWaAIBotVideoPlayer();
        C106075Xn r2 = waAIBotVideoPlayer.A06;
        AnonymousClass7RZ r1 = waAIBotVideoPlayer.A02;
        C162457s7.A0J(r1, 0);
        r2.A0D.remove(r1);
        Log.d("CompositeHeroPlayer - release()");
        for (AnonymousClass5TM r3 : r2.A0G) {
            r3.A05 = null;
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("TransitionHeroPlayer - release() - playerId: ");
            C18260x0.A1F(A0o, r3.A09);
            r3.A0A.setSurfaceTextureListener((TextureView.SurfaceTextureListener) null);
            C162997t6 r0 = r3.A02;
            if (r0 != null) {
                r0.A08();
            }
        }
    }

    public final void A02() {
        C106075Xn r2 = getWaAIBotVideoPlayer().A06;
        Log.d("CompositeHeroPlayer - pause()");
        AnonymousClass5TM r22 = r2.A0G[r2.A00 % 2];
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("TransitionHeroPlayer - pause() - playerId: ");
        C18260x0.A1F(A0o, r22.A09);
        C162997t6 r0 = r22.A02;
        if (r0 != null) {
            r0.A06();
        }
    }

    public final void A03() {
        C106075Xn r2 = getWaAIBotVideoPlayer().A06;
        Log.d("CompositeHeroPlayer - play()");
        r2.A0G[r2.A00 % 2].A00();
    }

    public final void A04(C009707r r5, C95814uZ r6) {
        BotEmbodimentViewModel botEmbodimentViewModel = (BotEmbodimentViewModel) AnonymousClass0x9.A0H(r5).A01(BotEmbodimentViewModel.class);
        this.A01 = botEmbodimentViewModel;
        if (botEmbodimentViewModel == null) {
            throw C18270x1.A0S("botEmbodimentViewModel");
        }
        botEmbodimentViewModel.A0D(r6);
        C158617kH r0 = new C158617kH(getQueuePlayer());
        getWaDebugBuildSharedPreferences();
        this.A02 = r0;
        BotEmbodimentViewModel botEmbodimentViewModel2 = this.A01;
        if (botEmbodimentViewModel2 == null) {
            throw C18270x1.A0S("botEmbodimentViewModel");
        }
        C86604Kt.A1N(r5, botEmbodimentViewModel2.A02, new AnonymousClass746(this, 4), 60);
        BotEmbodimentViewModel botEmbodimentViewModel3 = this.A01;
        if (botEmbodimentViewModel3 == null) {
            throw C18270x1.A0S("botEmbodimentViewModel");
        }
        C86604Kt.A1N(r5, botEmbodimentViewModel3.A01, C1001359q.A00(this, 7), 61);
        BotEmbodimentViewModel botEmbodimentViewModel4 = this.A01;
        if (botEmbodimentViewModel4 == null) {
            throw C18270x1.A0S("botEmbodimentViewModel");
        }
        C86604Kt.A1N(r5, botEmbodimentViewModel4.A07, C1001359q.A00(this, 8), 62);
        addView(getWaAIBotVideoPlayer().A03);
        C158617kH r02 = this.A02;
        if (r02 == null) {
            throw C18270x1.A0S("clientOrchestrator");
        }
        r02.A01();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r1 = getWaAIBotVideoPlayer().A03;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r3, int r4, int r5, int r6, int r7) {
        /*
            r2 = this;
            super.onLayout(r3, r4, r5, r6, r7)
            if (r3 == 0) goto L_0x001a
            X.5KS r0 = r2.getWaAIBotVideoPlayer()
            android.view.View r1 = r0.A03
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            if (r0 == 0) goto L_0x001a
            int r6 = r6 - r4
            r0.width = r6
            int r7 = r7 - r5
            r0.height = r7
            r1.setLayoutParams(r0)
        L_0x001a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4QF.onLayout(boolean, int, int, int, int):void");
    }
}
