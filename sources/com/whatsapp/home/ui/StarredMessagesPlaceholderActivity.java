package com.whatsapp.home.ui;

import X.AnonymousClass0x9;
import X.AnonymousClass1VX;
import X.AnonymousClass4FS;
import X.AnonymousClass4GJ;
import X.AnonymousClass5Yj;
import X.AnonymousClass6B8;
import X.C06560Yg;
import X.C106715a2;
import X.C107405bG;
import X.C111685iW;
import X.C116855qy;
import X.C15110qn;
import X.C162457s7;
import X.C18270x1;
import X.C18290x4;
import X.C18300x5;
import X.C70003Zm;
import X.C86624Kv;
import X.C86644Kx;
import X.C86664Kz;
import X.C88864av;
import X.C89654ea;
import X.C990954k;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.conversation.conversationrow.E2EEDescriptionBottomSheet;
import com.whatsapp.settings.chat.wallpaper.WallPaperView;

public final class StarredMessagesPlaceholderActivity extends C89654ea {
    public int A00;
    public int A01;
    public View A02;
    public ViewGroup.LayoutParams A03;
    public ViewGroup A04;

    public class StarredMessagePlaceholderView extends LinearLayout implements C15110qn, AnonymousClass4GJ {
        public ImageView A00;
        public TextView A01;
        public TextView A02;
        public AnonymousClass1VX A03;
        public WallPaperView A04;
        public C106715a2 A05;
        public AnonymousClass4FS A06;
        public C116855qy A07;
        public boolean A08;

        public static final void setPlaceholderE2EText$lambda$0(StarredMessagePlaceholderView starredMessagePlaceholderView) {
            C89654ea r1;
            C162457s7.A0J(starredMessagePlaceholderView, 0);
            E2EEDescriptionBottomSheet A002 = E2EEDescriptionBottomSheet.A00(12);
            Context context = starredMessagePlaceholderView.getContext();
            if ((context instanceof C89654ea) && (r1 = (C89654ea) context) != null) {
                r1.Boo(A002);
            }
        }

        public final void setAbProps(AnonymousClass1VX r2) {
            C162457s7.A0J(r2, 0);
            this.A03 = r2;
        }

        public final void setLinkifier(C106715a2 r2) {
            C162457s7.A0J(r2, 0);
            this.A05 = r2;
        }

        public final void setWaWorkers(AnonymousClass4FS r2) {
            C162457s7.A0J(r2, 0);
            this.A06 = r2;
        }

        private final void setPlaceholderE2EText(int i) {
            TextView textView = this.A01;
            if (textView != null) {
                textView.setText(getLinkifier().A06(textView.getContext(), new C70003Zm(this, 23), C86624Kv.A0b(this, i), "%s", AnonymousClass5Yj.A02(textView.getContext(), R.attr.f3nameremoved, R.color.f5nameremoved)));
                C18270x1.A0q(textView, getAbProps());
            }
        }

        public final Object generatedComponent() {
            C116855qy r0 = this.A07;
            if (r0 == null) {
                r0 = C116855qy.A00(this);
                this.A07 = r0;
            }
            return r0.generatedComponent();
        }

        public final AnonymousClass1VX getAbProps() {
            AnonymousClass1VX r0 = this.A03;
            if (r0 != null) {
                return r0;
            }
            throw C18270x1.A0R();
        }

        public final C106715a2 getLinkifier() {
            C106715a2 r0 = this.A05;
            if (r0 != null) {
                return r0;
            }
            throw C18270x1.A0S("linkifier");
        }

        public final AnonymousClass4FS getWaWorkers() {
            AnonymousClass4FS r0 = this.A06;
            if (r0 != null) {
                return r0;
            }
            throw C18270x1.A0S("waWorkers");
        }

        public StarredMessagePlaceholderView(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet);
            if (!this.A08) {
                this.A08 = true;
                ((C88864av) ((C111685iW) generatedComponent())).A4l(this);
            }
        }

        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            AnonymousClass4FS waWorkers = getWaWorkers();
            Context A0F = C18290x4.A0F(this);
            Resources resources = getResources();
            C162457s7.A0D(resources);
            C18270x1.A0w(new C990954k(A0F, resources, this.A04), waWorkers);
        }

        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            WallPaperView wallPaperView = this.A04;
            if (wallPaperView != null) {
                C86644Kx.A1N(wallPaperView);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public StarredMessagePlaceholderView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            C162457s7.A0J(context, 1);
            if (!this.A08) {
                this.A08 = true;
                ((C88864av) ((C111685iW) generatedComponent())).A4l(this);
            }
            View.inflate(context, R.layout.f8nameremoved, this);
            this.A00 = AnonymousClass0x9.A0E(this, R.id.image_placeholder);
            this.A02 = C18300x5.A0G(this, R.id.txt_placeholder_title);
            this.A01 = C18300x5.A0G(this, R.id.txt_home_placeholder_sub_title);
            this.A04 = (WallPaperView) C06560Yg.A02(this, R.id.placeholder_background);
            ImageView imageView = this.A00;
            if (imageView != null) {
                imageView.setImageResource(R.drawable.vec_ic_starred_placeholder);
            }
            TextView textView = this.A02;
            if (textView != null) {
                textView.setText(R.string.f11nameremoved);
            }
            setPlaceholderE2EText(R.string.f11nameremoved);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.f8nameremoved);
        C107405bG.A08(this, R.color.f5nameremoved);
        C107405bG.A06(this);
        ViewGroup A0m = C86664Kz.A0m(this, 16908290);
        this.A04 = A0m;
        if (A0m != null) {
            AnonymousClass6B8.A00(A0m, this, 4);
        }
    }
}
