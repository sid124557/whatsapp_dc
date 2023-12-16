package com.whatsapp.productinfra.avatar.ui.stickers.upsell;

import X.AnonymousClass001;
import X.AnonymousClass0x2;
import X.AnonymousClass0x9;
import X.AnonymousClass20D;
import X.AnonymousClass218;
import X.AnonymousClass3YZ;
import X.AnonymousClass4C6;
import X.AnonymousClass4GJ;
import X.AnonymousClass4GR;
import X.AnonymousClass58H;
import X.AnonymousClass5ZD;
import X.AnonymousClass66R;
import X.AnonymousClass6AT;
import X.C001702c;
import X.C100505Be;
import X.C100755Cd;
import X.C111685iW;
import X.C116855qy;
import X.C120105y3;
import X.C120115y4;
import X.C120125y5;
import X.C120135y6;
import X.C120805zC;
import X.C154517dI;
import X.C162457s7;
import X.C18270x1;
import X.C18280x3;
import X.C18300x5;
import X.C29351ig;
import X.C378924l;
import X.C43222Rg;
import X.C49652gs;
import X.C51932kc;
import X.C55862r2;
import X.C57682u2;
import X.C59022wD;
import X.C616131n;
import X.C633939b;
import X.C64333Db;
import X.C69723Yd;
import X.C73853gB;
import X.C75003pT;
import X.C84814Du;
import X.C85494Gl;
import X.C86624Kv;
import X.C86634Kw;
import X.C86664Kz;
import X.C88864av;
import X.C97544yg;
import X.C97554yh;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import kotlin.coroutines.jvm.internal.DebugMetadata;

public final class AvatarStickerUpsellView extends ConstraintLayout implements AnonymousClass4GJ {
    public C49652gs A00;
    public C43222Rg A01;
    public C51932kc A02;
    public AnonymousClass5ZD A03;
    public C29351ig A04;
    public C55862r2 A05;
    public C100505Be A06;
    public C116855qy A07;
    public C73853gB A08;
    public AnonymousClass4C6 A09;
    public boolean A0A;
    public final AnonymousClass6AT A0B;
    public final WaImageView A0C;
    public final AnonymousClass66R A0D;
    public final AnonymousClass66R A0E;
    public final AnonymousClass66R A0F;
    public final AnonymousClass66R A0G;
    public final AnonymousClass66R A0H;

    @DebugMetadata(c = "com.whatsapp.productinfra.avatar.ui.stickers.upsell.AvatarStickerUpsellView$4", f = "AvatarStickerUpsellView.kt", i = {}, l = {128}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.productinfra.avatar.ui.stickers.upsell.AvatarStickerUpsellView$4  reason: invalid class name */
    public final class AnonymousClass4 extends C75003pT implements AnonymousClass4GR {
        public int label;

        public final Object A09(Object obj) {
            AnonymousClass218 r3 = AnonymousClass218.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                C57682u2.A01(obj);
                AvatarStickerUpsellViewController A00 = AvatarStickerUpsellView.this.getViewController();
                C100505Be r0 = AvatarStickerUpsellView.this.A06;
                if (r0 == null) {
                    throw C18270x1.A0S("entryPoint");
                }
                this.label = 1;
                if (A00.A00(r0, this) == r3) {
                    return r3;
                }
            } else if (i == 1) {
                C57682u2.A01(obj);
            } else {
                throw AnonymousClass001.A0d();
            }
            return C59022wD.A00;
        }

        public final C84814Du A0A(Object obj, C84814Du r4) {
            return new AnonymousClass4(r4);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return C59022wD.A01(new AnonymousClass4((C84814Du) obj2));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarStickerUpsellView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C100505Be r0;
        C162457s7.A0J(context, 1);
        if (!this.A0A) {
            this.A0A = true;
            C88864av r1 = (C88864av) ((C111685iW) generatedComponent());
            this.A03 = (AnonymousClass5ZD) r1.A0I.A04.get();
            C64333Db r12 = r1.A0K;
            this.A02 = (C51932kc) r12.A1Z.get();
            this.A00 = (C49652gs) r12.A1G.get();
            this.A01 = (C43222Rg) r12.A1Y.get();
            this.A04 = (C29351ig) r12.A1I.get();
            this.A05 = (C55862r2) r12.A1T.get();
            this.A08 = C69723Yd.A00();
            this.A09 = AnonymousClass3YZ.A00();
        }
        AnonymousClass58H r13 = AnonymousClass58H.NONE;
        this.A0G = C154517dI.A00(r13, new C120135y6(context));
        this.A0E = C154517dI.A00(r13, new C120115y4(context));
        this.A0F = C154517dI.A00(r13, new C120125y5(context));
        this.A0D = C154517dI.A00(r13, new C120105y3(context));
        this.A0H = C154517dI.A00(r13, new C120805zC(context, this));
        this.A0B = new AnonymousClass6AT(this, 2);
        LayoutInflater.from(context).inflate(R.layout.f8nameremoved, this, true);
        this.A0C = C18280x3.A0J(this, R.id.stickers_upsell_image);
        setBackgroundResource(R.drawable.stickers_upsell_background);
        C18300x5.A13(context, this, R.string.f11nameremoved);
        View A0E2 = C18280x3.A0E(this, R.id.stickers_upsell_close);
        if (attributeSet != null) {
            int i2 = 0;
            TypedArray A0X = C86664Kz.A0X(context, attributeSet, C100755Cd.A00);
            A0E2.setVisibility(C86634Kw.A01(A0X.getBoolean(0, true) ? 1 : 0));
            boolean z = A0X.getBoolean(2, true);
            TextView A0G2 = C18300x5.A0G(this, R.id.stickers_upsell_publisher);
            A0G2.setVisibility(!z ? 8 : i2);
            A0G2.setText("Meta");
            int i3 = A0X.getInt(1, -1);
            if (i3 == 0) {
                r0 = C97544yg.A00;
            } else if (i3 == 1) {
                r0 = C97554yh.A00;
            } else {
                throw AnonymousClass001.A0c("Avatar sticker upsell entry point must be set");
            }
            this.A06 = r0;
            A0X.recycle();
        }
        setOnClickListener(new C633939b(this, 27));
        C633939b.A00(A0E2, this, 28);
        C616131n.A02((C85494Gl) null, new AnonymousClass4((C84814Du) null), getApplicationScope(), (AnonymousClass20D) null, 3);
    }

    public final void setApplicationScope(AnonymousClass4C6 r2) {
        C162457s7.A0J(r2, 0);
        this.A09 = r2;
    }

    public final void setAvatarConfigRepository(C49652gs r2) {
        C162457s7.A0J(r2, 0);
        this.A00 = r2;
    }

    public final void setAvatarEditorLauncher(AnonymousClass5ZD r2) {
        C162457s7.A0J(r2, 0);
        this.A03 = r2;
    }

    public final void setAvatarEventObservers(C29351ig r2) {
        C162457s7.A0J(r2, 0);
        this.A04 = r2;
    }

    public final void setAvatarLogger(C55862r2 r2) {
        C162457s7.A0J(r2, 0);
        this.A05 = r2;
    }

    public final void setAvatarRepository(C43222Rg r2) {
        C162457s7.A0J(r2, 0);
        this.A01 = r2;
    }

    public final void setAvatarSharedPreferences(C51932kc r2) {
        C162457s7.A0J(r2, 0);
        this.A02 = r2;
    }

    public final void setMainDispatcher(C73853gB r2) {
        C162457s7.A0J(r2, 0);
        this.A08 = r2;
    }

    public static /* synthetic */ void getApplicationScope$annotations() {
    }

    private final int getImageHeightLandscape() {
        return AnonymousClass0x2.A09(this.A0D);
    }

    private final int getImageHeightPortrait() {
        return AnonymousClass0x2.A09(this.A0E);
    }

    private final int getImageWidthLandscape() {
        return AnonymousClass0x2.A09(this.A0F);
    }

    private final int getImageWidthPortrait() {
        return AnonymousClass0x2.A09(this.A0G);
    }

    public static /* synthetic */ void getMainDispatcher$annotations() {
    }

    /* access modifiers changed from: private */
    public final AvatarStickerUpsellViewController getViewController() {
        return (AvatarStickerUpsellViewController) this.A0H.getValue();
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A07;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A07 = r0;
        }
        return r0.generatedComponent();
    }

    public final AnonymousClass4C6 getApplicationScope() {
        AnonymousClass4C6 r0 = this.A09;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("applicationScope");
    }

    public final C49652gs getAvatarConfigRepository() {
        C49652gs r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("avatarConfigRepository");
    }

    public final AnonymousClass5ZD getAvatarEditorLauncher() {
        AnonymousClass5ZD r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("avatarEditorLauncher");
    }

    public final C29351ig getAvatarEventObservers() {
        C29351ig r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("avatarEventObservers");
    }

    public final C55862r2 getAvatarLogger() {
        C55862r2 r0 = this.A05;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("avatarLogger");
    }

    public final C43222Rg getAvatarRepository() {
        C43222Rg r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("avatarRepository");
    }

    public final C51932kc getAvatarSharedPreferences() {
        C51932kc r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("avatarSharedPreferences");
    }

    public final C73853gB getMainDispatcher() {
        C73853gB r0 = this.A08;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("mainDispatcher");
    }

    public static final void A01(AvatarStickerUpsellView avatarStickerUpsellView) {
        avatarStickerUpsellView.getAvatarLogger().A03((Boolean) null, 10);
        AvatarStickerUpsellViewController viewController = avatarStickerUpsellView.getViewController();
        AnonymousClass5ZD r2 = viewController.A04;
        Activity activity = viewController.A00;
        AnonymousClass0x9.A1L(activity);
        r2.A04("avatar_sticker_upsell", AnonymousClass0x9.A14(activity));
    }

    public static final void A02(AvatarStickerUpsellView avatarStickerUpsellView) {
        avatarStickerUpsellView.getAvatarLogger().A03((Boolean) null, 11);
        AvatarStickerUpsellViewController viewController = avatarStickerUpsellView.getViewController();
        C18270x1.A0l(C18270x1.A04(viewController.A03.A01), "pref_has_dismissed_sticker_upsell", true);
        viewController.A01.setVisibility(8);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAvatarEventObservers().A06(this.A0B);
    }

    public void onConfigurationChanged(Configuration configuration) {
        int A092;
        int A093;
        super.onConfigurationChanged(configuration);
        if (configuration != null) {
            if (configuration.orientation == 2) {
                A092 = AnonymousClass0x2.A09(this.A0F);
            } else {
                A092 = AnonymousClass0x2.A09(this.A0G);
            }
            if (configuration.orientation == 2) {
                A093 = AnonymousClass0x2.A09(this.A0D);
            } else {
                A093 = AnonymousClass0x2.A09(this.A0E);
            }
            this.A0C.setLayoutParams(new C001702c(A092, A093));
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getAvatarEventObservers().A07(this.A0B);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AvatarStickerUpsellView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C162457s7.A0J(context, 1);
    }

    public /* synthetic */ AvatarStickerUpsellView(Context context, AttributeSet attributeSet, int i, int i2, C378924l r7) {
        this(context, C86624Kv.A09(attributeSet, i2), C86634Kw.A02(i2, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AvatarStickerUpsellView(Context context) {
        this(context, (AttributeSet) null, 0);
        C162457s7.A0J(context, 1);
    }
}
