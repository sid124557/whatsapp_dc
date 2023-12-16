package com.whatsapp.home.ui;

import X.AnonymousClass0GH;
import X.AnonymousClass0XY;
import X.AnonymousClass0Y8;
import X.AnonymousClass0YZ;
import X.AnonymousClass0x9;
import X.AnonymousClass1VX;
import X.AnonymousClass34K;
import X.AnonymousClass4FS;
import X.AnonymousClass4GJ;
import X.AnonymousClass4GQ;
import X.AnonymousClass5AQ;
import X.AnonymousClass5Yj;
import X.AnonymousClass67C;
import X.AnonymousClass902;
import X.AnonymousClass92C;
import X.C009707r;
import X.C06560Yg;
import X.C1001359q;
import X.C106715a2;
import X.C106895aL;
import X.C107405bG;
import X.C111685iW;
import X.C112715kB;
import X.C116855qy;
import X.C1225264s;
import X.C15110qn;
import X.C162457s7;
import X.C18260x0;
import X.C18270x1;
import X.C18290x4;
import X.C18300x5;
import X.C18310x6;
import X.C185668u3;
import X.C187958y5;
import X.C1891490e;
import X.C56972sr;
import X.C70003Zm;
import X.C73723fy;
import X.C86614Ku;
import X.C86624Kv;
import X.C86634Kw;
import X.C86644Kx;
import X.C88864av;
import X.C89654ea;
import X.C95814uZ;
import X.C97154xi;
import X.C990854j;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.OnLifecycleEvent;
import com.whatsapp.R;
import com.whatsapp.conversation.conversationrow.E2EEDescriptionBottomSheet;
import com.whatsapp.settings.chat.wallpaper.WallPaperView;

public final class HomePlaceholderActivity extends C89654ea {
    public int A00;
    public View A01;
    public ViewTreeObserver.OnGlobalLayoutListener A02;

    public class HomePlaceholderView extends LinearLayout implements C15110qn, AnonymousClass4GJ {
        public int A00;
        public View A01;
        public View A02;
        public View A03;
        public ImageView A04;
        public TextView A05;
        public TextView A06;
        public C56972sr A07;
        public AnonymousClass67C A08;
        public AnonymousClass1VX A09;
        public C97154xi A0A;
        public WallPaperView A0B;
        public C106715a2 A0C;
        public C187958y5 A0D;
        public AnonymousClass4FS A0E;
        public C116855qy A0F;
        public Integer A0G;
        public AnonymousClass4GQ A0H;
        public boolean A0I;
        public boolean A0J;
        public final AnonymousClass902 A0K;

        public static final void A01(C009707r r3, HomePlaceholderView homePlaceholderView, int i) {
            int A002;
            if (Build.VERSION.SDK_INT > 21) {
                Window window = r3.getWindow();
                if (i == 0) {
                    if (window != null) {
                        A002 = homePlaceholderView.getVoipReturnToCallBannerBridge().getBackgroundColorRes();
                    }
                    homePlaceholderView.A03();
                }
                if (window != null) {
                    if (homePlaceholderView.A0I) {
                        A002 = R.color.f5nameremoved;
                    } else {
                        A002 = AnonymousClass34K.A00(r3);
                    }
                }
                homePlaceholderView.A03();
                C86634Kw.A13(r3, window, A002);
                homePlaceholderView.A03();
            }
        }

        public static final void setPlaceholderE2EText$lambda$7(HomePlaceholderView homePlaceholderView) {
            C89654ea r1;
            C162457s7.A0J(homePlaceholderView, 0);
            E2EEDescriptionBottomSheet A002 = E2EEDescriptionBottomSheet.A00(12);
            Context context = homePlaceholderView.getContext();
            if ((context instanceof C89654ea) && (r1 = (C89654ea) context) != null) {
                r1.Boo(A002);
            }
        }

        public final void setAbProps(AnonymousClass1VX r2) {
            C162457s7.A0J(r2, 0);
            this.A09 = r2;
        }

        public final void setLinkifier(C106715a2 r2) {
            C162457s7.A0J(r2, 0);
            this.A0C = r2;
        }

        public final void setMeManager(C56972sr r2) {
            C162457s7.A0J(r2, 0);
            this.A07 = r2;
        }

        public final void setSplitWindowManager(C97154xi r2) {
            C162457s7.A0J(r2, 0);
            this.A0A = r2;
        }

        public final void setSystemFeatures(C187958y5 r2) {
            C162457s7.A0J(r2, 0);
            this.A0D = r2;
        }

        public final void setVoipReturnToCallBannerBridge(AnonymousClass67C r2) {
            C162457s7.A0J(r2, 0);
            this.A08 = r2;
        }

        public final void setWaWorkers(AnonymousClass4FS r2) {
            C162457s7.A0J(r2, 0);
            this.A0E = r2;
        }

        private final void setPlaceholderE2EText(int i) {
            TextView textView = this.A05;
            if (textView != null) {
                textView.setText(getLinkifier().A06(textView.getContext(), new C70003Zm(this, 22), C86624Kv.A0b(this, i), "%s", AnonymousClass5Yj.A02(textView.getContext(), R.attr.f3nameremoved, R.color.f5nameremoved)));
                C18270x1.A0q(textView, getAbProps());
            }
        }

        public final void A03() {
            Context context;
            int i;
            View view = this.A03;
            if (view == null || view.getVisibility() != 0) {
                context = getContext();
                i = R.color.f5nameremoved;
            } else {
                context = getContext();
                i = AnonymousClass5Yj.A02(getContext(), R.attr.f3nameremoved, R.color.f5nameremoved);
            }
            int A042 = AnonymousClass0Y8.A04(context, i);
            View view2 = this.A02;
            if (view2 != null) {
                view2.setBackgroundColor(A042);
            }
        }

        public final void A04(int i, boolean z) {
            int i2;
            if (i != 200) {
                if (i == 300) {
                    ImageView imageView = this.A04;
                    if (imageView != null) {
                        imageView.setImageResource(R.drawable.vec_ic_status_placeholder);
                    }
                    TextView textView = this.A06;
                    if (textView != null) {
                        textView.setText(R.string.f11nameremoved);
                    }
                    i2 = R.string.f11nameremoved;
                } else if (i == 400) {
                    ImageView imageView2 = this.A04;
                    if (imageView2 != null) {
                        imageView2.setImageResource(R.drawable.vec_ic_calls_placeholder);
                    }
                    TextView textView2 = this.A06;
                    if (textView2 != null) {
                        textView2.setText(R.string.f11nameremoved);
                    }
                    i2 = R.string.f11nameremoved;
                } else if (i == 600) {
                    ImageView imageView3 = this.A04;
                    if (imageView3 != null) {
                        imageView3.setImageResource(R.drawable.vec_ic_communities_placeholder);
                    }
                    TextView textView3 = this.A06;
                    if (textView3 != null) {
                        textView3.setText(R.string.f11nameremoved);
                    }
                    i2 = R.string.f11nameremoved;
                }
                setPlaceholderE2EText(i2);
            } else {
                ImageView imageView4 = this.A04;
                if (imageView4 != null) {
                    imageView4.setImageResource(R.drawable.vec_ic_chat_placeholder);
                }
                getSystemFeatures();
                TextView textView4 = this.A06;
                if (textView4 != null) {
                    textView4.setText(R.string.f11nameremoved);
                }
                setPlaceholderE2EText(R.string.f11nameremoved);
                getSplitWindowManager().A0D(false);
            }
            A05(z);
        }

        public final void A05(boolean z) {
            ImageView imageView = this.A04;
            int i = 8;
            if (imageView != null) {
                imageView.setVisibility(C86614Ku.A01(z ? 1 : 0));
            }
            TextView textView = this.A06;
            if (textView != null) {
                if (!z) {
                    i = 0;
                }
                textView.setVisibility(i);
            }
        }

        public final Object generatedComponent() {
            C116855qy r0 = this.A0F;
            if (r0 == null) {
                r0 = C116855qy.A00(this);
                this.A0F = r0;
            }
            return r0.generatedComponent();
        }

        public final AnonymousClass1VX getAbProps() {
            AnonymousClass1VX r0 = this.A09;
            if (r0 != null) {
                return r0;
            }
            throw C18270x1.A0R();
        }

        public final AnonymousClass4GQ getActionBarSizeListener() {
            return this.A0H;
        }

        public final boolean getContentDrawnBehindStatusBar() {
            return this.A0I;
        }

        public final C106715a2 getLinkifier() {
            C106715a2 r0 = this.A0C;
            if (r0 != null) {
                return r0;
            }
            throw C18270x1.A0S("linkifier");
        }

        public final C56972sr getMeManager() {
            C56972sr r0 = this.A07;
            if (r0 != null) {
                return r0;
            }
            throw C18270x1.A0S("meManager");
        }

        public final C97154xi getSplitWindowManager() {
            C97154xi r0 = this.A0A;
            if (r0 != null) {
                return r0;
            }
            throw C18270x1.A0S("splitWindowManager");
        }

        public final C187958y5 getSystemFeatures() {
            C187958y5 r0 = this.A0D;
            if (r0 != null) {
                return r0;
            }
            throw C18270x1.A0S("systemFeatures");
        }

        public final AnonymousClass67C getVoipReturnToCallBannerBridge() {
            AnonymousClass67C r0 = this.A08;
            if (r0 != null) {
                return r0;
            }
            throw C18270x1.A0S("voipReturnToCallBannerBridge");
        }

        public final AnonymousClass4FS getWaWorkers() {
            AnonymousClass4FS r0 = this.A0E;
            if (r0 != null) {
                return r0;
            }
            throw C18270x1.A0S("waWorkers");
        }

        public HomePlaceholderView(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet);
            if (!this.A0J) {
                this.A0J = true;
                ((C88864av) ((C111685iW) generatedComponent())).A4k(this);
            }
        }

        public static final void A00(View view, ViewGroup viewGroup, AnonymousClass0XY r6, HomePlaceholderView homePlaceholderView) {
            int i;
            WindowInsets rootWindowInsets;
            C18260x0.A0S(view, r6);
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 30) {
                i = view.getRootWindowInsets().getInsetsIgnoringVisibility(WindowInsets.Type.systemBars()).top;
            } else if (i2 < 23 || (rootWindowInsets = view.getRootWindowInsets()) == null) {
                i = 0;
            } else {
                i = rootWindowInsets.getStableInsetTop();
            }
            AnonymousClass4GQ r1 = homePlaceholderView.A0H;
            if (r1 != null) {
                r1.invoke(Integer.valueOf(i));
            }
            Integer num = homePlaceholderView.A0G;
            if (num == null || i != num.intValue()) {
                homePlaceholderView.A0G = Integer.valueOf(i);
                if (homePlaceholderView.A0I) {
                    View view2 = homePlaceholderView.A02;
                    if (!(view2 == null || viewGroup == null)) {
                        viewGroup.removeView(view2);
                    }
                    View view3 = new View(homePlaceholderView.getContext());
                    homePlaceholderView.A02 = view3;
                    if (viewGroup != null) {
                        viewGroup.addView(view3, 0, new ViewGroup.LayoutParams(-1, C18310x6.A06(homePlaceholderView.A0G)));
                    }
                    View view4 = homePlaceholderView.A02;
                    if (view4 != null) {
                        C106895aL.A03(new AnonymousClass5AQ(homePlaceholderView, 4), view4);
                    }
                }
            }
        }

        private final C009707r getActivity() {
            Context context = getContext();
            if (context instanceof C009707r) {
                return (C009707r) context;
            }
            return null;
        }

        public final void A02() {
            if (getSplitWindowManager().A0I()) {
                Iterable A052 = getSplitWindowManager().A05();
                AnonymousClass902 r1 = this.A0K;
                if (!C73723fy.A0U(A052, r1)) {
                    getSplitWindowManager().A06(r1);
                }
            }
        }

        @OnLifecycleEvent(AnonymousClass0GH.ON_START)
        public final void onActivityStarted() {
            AnonymousClass4FS waWorkers = getWaWorkers();
            Context A0F2 = C18290x4.A0F(this);
            Resources resources = getResources();
            C162457s7.A0D(resources);
            C18270x1.A0w(new C990854j(A0F2, resources, this.A0B), waWorkers);
            A02();
        }

        @OnLifecycleEvent(AnonymousClass0GH.ON_STOP)
        public final void onActivityStopped() {
            if (getSplitWindowManager().A0I()) {
                getSplitWindowManager().A07(this.A0K);
            }
        }

        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            A02();
            AnonymousClass4FS waWorkers = getWaWorkers();
            Context A0F2 = C18290x4.A0F(this);
            Resources resources = getResources();
            C162457s7.A0D(resources);
            C18270x1.A0w(new C990854j(A0F2, resources, this.A0B), waWorkers);
            getSystemFeatures();
            ViewGroup A0J2 = C86644Kx.A0J(this, R.id.call_notification_holder);
            C009707r activity = getActivity();
            if (activity != null && this.A03 == null) {
                this.A03 = getVoipReturnToCallBannerBridge().B0k(activity, getMeManager(), getAbProps(), (C95814uZ) null);
                C185668u3 r0 = ((C112715kB) getVoipReturnToCallBannerBridge()).A00;
                if (r0 != null) {
                    r0.setShouldShowGenericContactOrGroupName(true);
                }
                if (A0J2 != null) {
                    A0J2.addView(this.A03);
                    C112715kB.A00(new C1891490e(activity, 1, this), getVoipReturnToCallBannerBridge());
                }
            }
            AnonymousClass0YZ.A0E(this, new AnonymousClass92C(A0J2, 1, this));
        }

        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            WallPaperView wallPaperView = this.A0B;
            if (wallPaperView != null) {
                C86644Kx.A1N(wallPaperView);
            }
            ViewGroup A0J2 = C86644Kx.A0J(this, R.id.call_notification_holder);
            View view = this.A02;
            if (view != null) {
                if (A0J2 != null) {
                    A0J2.removeView(view);
                }
                this.A02 = null;
            }
            View view2 = this.A03;
            if (view2 != null) {
                if (A0J2 != null) {
                    A0J2.removeView(view2);
                }
                C112715kB.A00((C1225264s) null, getVoipReturnToCallBannerBridge());
                this.A03 = null;
            }
            if (getSplitWindowManager().A0I()) {
                getSplitWindowManager().A07(this.A0K);
            }
        }

        public final void setActionBarSizeListener(AnonymousClass4GQ r1) {
            this.A0H = r1;
        }

        public final void setContentDrawnBehindStatusBar(boolean z) {
            this.A0I = z;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public HomePlaceholderView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            C162457s7.A0J(context, 1);
            if (!this.A0J) {
                this.A0J = true;
                ((C88864av) ((C111685iW) generatedComponent())).A4k(this);
            }
            this.A00 = 200;
            View.inflate(context, R.layout.f8nameremoved, this);
            this.A04 = AnonymousClass0x9.A0E(this, R.id.image_placeholder);
            this.A06 = C18300x5.A0G(this, R.id.txt_home_placeholder_title);
            this.A05 = C18300x5.A0G(this, R.id.txt_home_placeholder_sub_title);
            this.A0B = (WallPaperView) C06560Yg.A02(this, R.id.placeholder_background);
            this.A01 = C06560Yg.A02(this, R.id.divider);
            A04(getSplitWindowManager().A01, false);
            this.A0K = new AnonymousClass902(this, 1);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.f8nameremoved);
        C107405bG.A08(this, R.color.f5nameremoved);
        C107405bG.A06(this);
        HomePlaceholderView homePlaceholderView = (HomePlaceholderView) findViewById(R.id.home_placeholder);
        if (homePlaceholderView != null) {
            this.A06.A00(homePlaceholderView);
            homePlaceholderView.A0I = true;
            homePlaceholderView.A0H = C1001359q.A00(this, 30);
        }
        if (Build.VERSION.SDK_INT == 33) {
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            layoutParams.format = -2;
            layoutParams.flags = 131096;
            this.A01 = new View(this);
            WindowManager windowManager = getWindowManager();
            if (windowManager != null) {
                windowManager.addView(this.A01, layoutParams);
            }
        }
    }

    public void onDestroy() {
        WindowManager windowManager;
        super.onDestroy();
        HomePlaceholderView homePlaceholderView = (HomePlaceholderView) findViewById(R.id.home_placeholder);
        if (homePlaceholderView != null) {
            homePlaceholderView.A0H = null;
            ViewTreeObserver viewTreeObserver = homePlaceholderView.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this.A02);
            }
        }
        View view = this.A01;
        if (view != null && (windowManager = getWindowManager()) != null) {
            windowManager.removeView(view);
        }
    }
}
