package X;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.components.AutoScrollView;
import com.whatsapp.text.ReadMoreTextView;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;
import java.util.Locale;

/* renamed from: X.563  reason: invalid class name */
public class AnonymousClass563 extends AnonymousClass4P1 implements AnonymousClass4GJ {
    public AccelerateInterpolator A00;
    public Animation A01;
    public Animation A02;
    public Animation A03;
    public Animation A04;
    public Animation A05;
    public Animation A06;
    public Animation A07;
    public Animation A08;
    public Animation A09;
    public Animation A0A;
    public DecelerateInterpolator A0B;
    public AnonymousClass1VX A0C;
    public AnonymousClass7IV A0D;
    public C1227165l A0E;
    public C1227165l A0F;
    public C1227165l A0G;
    public AnonymousClass64A A0H;
    public AnonymousClass5YG A0I;
    public C116855qy A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public final int A0U;
    public final int A0V;
    public final Handler A0W;
    public final View A0X;
    public final View A0Y;
    public final ViewGroup A0Z;
    public final ViewGroup A0a;
    public final ViewGroup A0b;
    public final ViewGroup A0c;
    public final ViewGroup A0d;
    public final ViewGroup A0e;
    public final Animation.AnimationListener A0f;
    public final HorizontalScrollView A0g;
    public final ImageButton A0h;
    public final ImageButton A0i;
    public final ImageButton A0j;
    public final ImageButton A0k;
    public final ImageButton A0l;
    public final ImageButton A0m;
    public final ImageButton A0n;
    public final ImageButton A0o;
    public final ImageButton A0p;
    public final ImageView A0q;
    public final LinearLayout A0r;
    public final LinearLayout A0s;
    public final ProgressBar A0t;
    public final SeekBar A0u;
    public final TextView A0v;
    public final TextView A0w;
    public final TextView A0x;
    public final AutoScrollView A0y;
    public final ReadMoreTextView A0z;
    public final C150197Pr A10;
    public final WDSButton A11;
    public final WDSButton A12;
    public final WDSButton A13;
    public final Runnable A14;
    public final StringBuilder A15;
    public final Formatter A16;

    private int getBottomContainerHorizontalPadding() {
        if (this.A0N && AnonymousClass000.A1U(C86634Kw.A0E(this).orientation, 2)) {
            return R.dimen.f6nameremoved;
        }
        return R.dimen.f6nameremoved;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02() {
        /*
            r2 = this;
            boolean r0 = r2.A0M
            if (r0 != 0) goto L_0x0051
            boolean r0 = r2.A06()
            if (r0 == 0) goto L_0x0051
            X.5YG r0 = r2.A0I
            if (r0 == 0) goto L_0x0051
            r0 = 1
            r2.A0M = r0
            boolean r0 = r2.A0N
            if (r0 == 0) goto L_0x0052
            android.widget.LinearLayout r0 = r2.A0s
            android.view.animation.Animation r1 = r2.A02
            r0.startAnimation(r1)
            android.view.ViewGroup r0 = r2.A0e
            int r0 = r0.getVisibility()
            if (r0 == 0) goto L_0x0029
            android.widget.ImageButton r0 = r2.A0p
            r0.startAnimation(r1)
        L_0x0029:
            android.view.animation.Animation r1 = r2.getFullscreenBottomControlsSlideOutAnimation()
            if (r1 == 0) goto L_0x0034
            android.view.ViewGroup r0 = r2.A0Z
            r0.startAnimation(r1)
        L_0x0034:
            android.content.res.Configuration r0 = X.C86634Kw.A0E(r2)
            int r1 = r0.orientation
            r0 = 2
            boolean r0 = X.AnonymousClass000.A1U(r1, r0)
            if (r0 != 0) goto L_0x0048
            android.view.ViewGroup r1 = r2.A0b
            android.view.animation.Animation r0 = r2.A08
        L_0x0045:
            r1.startAnimation(r0)
        L_0x0048:
            boolean r0 = r2.A0N
            if (r0 == 0) goto L_0x0051
            r0 = 4358(0x1106, float:6.107E-42)
            r2.setSystemUiVisibility(r0)
        L_0x0051:
            return
        L_0x0052:
            android.view.ViewGroup r1 = r2.A0Z
            android.view.animation.Animation r0 = r2.A0A
            r1.startAnimation(r0)
            android.widget.ProgressBar r1 = r2.A0t
            android.view.animation.Animation r0 = r2.A02
            goto L_0x0045
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass563.A02():void");
    }

    public void A07() {
        Runnable runnable = this.A14;
        removeCallbacks(runnable);
        AnonymousClass5YG r0 = this.A0I;
        if (r0 != null && r0.A0a()) {
            if (!this.A0O || this.A0N) {
                postDelayed(runnable, 3000);
            }
        }
    }

    public void A08() {
        AnonymousClass5YG r0 = this.A0I;
        if (r0 != null) {
            if (!r0.A0a()) {
                this.A0I.A0F();
                C150197Pr r02 = this.A10;
                if (r02 != null) {
                    r02.A09.A02();
                }
            }
            A07();
            A0E();
            A04(100);
        }
    }

    public final void A0B() {
        if (this.A0r.getVisibility() != 8) {
            ImageView imageView = this.A0q;
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            Resources resources = getResources();
            boolean z = this.A0N;
            int i = R.dimen.f6nameremoved;
            if (z) {
                i = R.dimen.f6nameremoved;
            }
            int dimensionPixelSize = resources.getDimensionPixelSize(i);
            layoutParams.width = dimensionPixelSize;
            layoutParams.height = dimensionPixelSize;
            imageView.requestLayout();
        }
    }

    public final void A0C() {
        boolean z;
        if (!this.A0N || !(this.A0r.getVisibility() == 0 || this.A0z.getVisibility() == 0)) {
            z = false;
        } else {
            z = true;
        }
        Resources resources = getResources();
        int i = R.dimen.f6nameremoved;
        if (z) {
            i = R.dimen.f6nameremoved;
        }
        int dimensionPixelSize = resources.getDimensionPixelSize(i);
        LinearLayout linearLayout = this.A0r;
        C86604Kt.A1D(linearLayout, linearLayout.getPaddingLeft(), dimensionPixelSize);
    }

    public final void A0D() {
        int i;
        if (this.A0c.getVisibility() != 8) {
            AutoScrollView autoScrollView = this.A0y;
            if (autoScrollView.A02) {
                HorizontalScrollView horizontalScrollView = this.A0g;
                FrameLayout.LayoutParams A0r2 = C86664Kz.A0r(horizontalScrollView);
                if (this.A0N) {
                    i = autoScrollView.A05;
                } else {
                    i = -1;
                }
                A0r2.width = i;
                horizontalScrollView.requestLayout();
            }
            autoScrollView.A00.post(new C69963Zi(autoScrollView, 43));
        }
    }

    public final void A0E() {
        AnonymousClass5YG r0 = this.A0I;
        if (r0 != null) {
            boolean A0a2 = r0.A0a();
            ImageButton imageButton = this.A0o;
            int i = R.drawable.ic_pip_play;
            if (A0a2) {
                i = R.drawable.ic_pip_pause;
            }
            imageButton.setImageResource(i);
            Context context = getContext();
            int i2 = R.string.f11nameremoved;
            if (A0a2) {
                i2 = R.string.f11nameremoved;
            }
            String string = context.getString(i2);
            imageButton.setContentDescription(string);
            ImageButton imageButton2 = this.A0p;
            int i3 = R.drawable.ic_video_play_conv;
            if (A0a2) {
                i3 = R.drawable.ic_video_pause_conv;
            }
            imageButton2.setImageResource(i3);
            imageButton2.setContentDescription(string);
        }
    }

    public final boolean A0F() {
        int i = this.A0V;
        if (i == 1 || i == 7 || i == 4) {
            return false;
        }
        return true;
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A0J;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A0J = r0;
        }
        return r0.generatedComponent();
    }

    public void setAuthorImage(Bitmap bitmap) {
        if (bitmap != null) {
            ImageView imageView = this.A0q;
            imageView.setImageBitmap(bitmap);
            imageView.setVisibility(0);
        }
    }

    public void setCloseButtonListener(C1227165l r3) {
        this.A0E = r3;
        C109395eY.A00(this.A0h, this, 33);
        C109395eY.A00(this.A0j, this, 34);
        C109395eY.A00(this.A0l, this, 35);
    }

    public void setFullscreenButtonClickListener(C1227165l r3) {
        this.A0F = r3;
        C109395eY.A00(this.A0i, this, 36);
        C109395eY.A00(this.A0k, this, 37);
        C109395eY.A00(this.A0m, this, 38);
    }

    public void setMusicAttributionClickListener(C1227165l r3) {
        C109395eY.A00(this.A0c, r3, 39);
        C109395eY.A00(this.A0y, r3, 40);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x003f, code lost:
        if (r5.A0N == false) goto L_0x0041;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setPlayer(X.AnonymousClass5YG r6) {
        /*
            r5 = this;
            r5.A0I = r6
            X.7Pr r0 = r5.A10
            if (r0 == 0) goto L_0x000e
            r1 = 0
            X.91i r0 = new X.91i
            r0.<init>(r5, r1)
            r6.A08 = r0
        L_0x000e:
            android.widget.ImageButton r3 = r5.A0o
            android.content.Context r0 = r5.getContext()
            r4 = 2131891685(0x7f1215e5, float:1.9418097E38)
            X.C18300x5.A13(r0, r3, r4)
            r0 = 25
            X.5ei r2 = new X.5ei
            r2.<init>(r5, r0, r6)
            r3.setOnClickListener(r2)
            android.widget.ImageButton r1 = r5.A0p
            android.content.Context r0 = r5.getContext()
            X.C18300x5.A13(r0, r1, r4)
            r1.setOnClickListener(r2)
            r2 = 1
            r1.setClickable(r2)
            com.whatsapp.wds.components.button.WDSButton r4 = r5.A11
            boolean r0 = r5.A0F()
            if (r0 == 0) goto L_0x0041
            boolean r1 = r5.A0N
            r0 = 0
            if (r1 != 0) goto L_0x0043
        L_0x0041:
            r0 = 8
        L_0x0043:
            r4.setVisibility(r0)
            android.widget.ProgressBar r1 = r5.A0t
            r0 = 1000(0x3e8, float:1.401E-42)
            r1.setMax(r0)
            r1.setSecondaryProgress(r0)
            android.widget.SeekBar r1 = r5.A0u
            r1.setMax(r0)
            X.5fz r0 = new X.5fz
            r0.<init>(r5, r6)
            r1.setOnSeekBarChangeListener(r0)
            r1 = 3
            X.68r r0 = new X.68r
            r0.<init>(r5, r1, r6)
            r6.A0V(r0)
            r1 = 2
            X.69R r0 = new X.69R
            r0.<init>(r5, r1)
            r6.A07 = r0
            X.8K0 r0 = new X.8K0
            r0.<init>(r5, r6)
            r6.A06 = r0
            java.lang.String r0 = "InlineVideoPlaybackControlView startControlsSync()"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            r5.A0S = r2
            android.os.Handler r1 = r5.A0W
            r0 = 0
            r1.sendEmptyMessage(r0)
            r3.setClickable(r2)
            android.widget.ImageButton r0 = r5.A0i
            r0.setClickable(r2)
            android.widget.ImageButton r0 = r5.A0k
            r0.setClickable(r2)
            android.widget.ImageButton r0 = r5.A0m
            r0.setClickable(r2)
            boolean r0 = r5.A0N
            if (r0 == 0) goto L_0x009b
            r5.A0A()
        L_0x009b:
            r5.A0E()
            r5.A0B()
            r5.A07()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass563.setPlayer(X.5YG):void");
    }

    public void setPlayerElevation(int i) {
        AnonymousClass5YG r0 = this.A0I;
        if (r0 != null && r0.A09() != null && this.A0I.A09().getParent() != null) {
            AnonymousClass0YZ.A0B((View) this.A0I.A09().getParent().getParent(), (float) i);
        }
    }

    public void setVideoAttribution(String str) {
        String str2 = str;
        if (str != null) {
            this.A0c.setVisibility(0);
            AutoScrollView autoScrollView = this.A0y;
            autoScrollView.setText(str2);
            C1896792f r7 = new C1896792f(this, 15);
            if (!autoScrollView.A01) {
                autoScrollView.A01 = true;
                WaTextView waTextView = autoScrollView.A0B;
                boolean z = false;
                waTextView.setVisibility(0);
                WaTextView waTextView2 = autoScrollView.A0A;
                if (!C06360Xi.A05(waTextView2) || waTextView2.isLayoutRequested()) {
                    waTextView2.addOnLayoutChangeListener(new C1237469p(autoScrollView, 1, r7));
                    return;
                }
                if (AnonymousClass0YH.A01(autoScrollView.getRootView()) == 0) {
                    z = true;
                }
                autoScrollView.A03 = z;
                HorizontalScrollView horizontalScrollView = autoScrollView.A00;
                AnonymousClass0YH.A06(horizontalScrollView, z ^ true ? 1 : 0);
                int width = waTextView2.getWidth() + autoScrollView.A06;
                int i = 1;
                if (autoScrollView.A03) {
                    i = -1;
                }
                int i2 = -i;
                int i3 = autoScrollView.A04;
                int i4 = autoScrollView.A07;
                int i5 = i3 + width + i4;
                int i6 = autoScrollView.A05;
                if (i5 < i6) {
                    ViewGroup.LayoutParams layoutParams = waTextView2.getLayoutParams();
                    if (layoutParams != null) {
                        layoutParams.width = i5;
                        waTextView2.setLayoutParams(layoutParams);
                        ViewGroup.LayoutParams layoutParams2 = horizontalScrollView.getLayoutParams();
                        if (layoutParams2 != null) {
                            layoutParams2.width = -2;
                            horizontalScrollView.setLayoutParams(layoutParams2);
                            waTextView2.setTranslationX((float) (i4 * i2));
                            waTextView.setVisibility(8);
                        } else {
                            throw AnonymousClass001.A0g("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                        }
                    } else {
                        throw AnonymousClass001.A0g("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    }
                } else {
                    autoScrollView.A02 = true;
                    ViewGroup.LayoutParams layoutParams3 = horizontalScrollView.getLayoutParams();
                    if (layoutParams3 != null) {
                        layoutParams3.width = i6;
                        horizontalScrollView.setLayoutParams(layoutParams3);
                        float f = (float) ((i3 + i4) * i2);
                        long j = autoScrollView.A08 * ((long) (width / i6));
                        waTextView2.setTranslationX(f);
                        waTextView.setTranslationX(waTextView2.getTranslationX() + ((float) (width * i2)));
                        autoScrollView.A00(f, width, i, i2, j);
                        if (i3 > 0) {
                            horizontalScrollView.setHorizontalFadingEdgeEnabled(true);
                            horizontalScrollView.setFadingEdgeLength(i3);
                            horizontalScrollView.requestLayout();
                        }
                    } else {
                        throw AnonymousClass001.A0g("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    }
                }
                horizontalScrollView.post(new C69963Zi(autoScrollView, 43));
                r7.invoke();
                return;
            }
            return;
        }
        this.A0c.setVisibility(8);
    }

    public void setWatchMoreVideosText(String str) {
        if (str != null) {
            this.A13.setText(str);
        }
    }

    public AnonymousClass563(Context context, C150197Pr r8, int i) {
        super(context);
        if (!this.A0P) {
            this.A0P = true;
            this.A0C = C64333Db.A4B(C88864av.A00(generatedComponent()));
        }
        int i2 = 0;
        this.A0O = false;
        this.A0T = false;
        this.A0N = false;
        this.A0S = false;
        this.A0L = false;
        this.A0K = false;
        this.A0M = false;
        this.A0Q = false;
        this.A0R = false;
        this.A14 = new C117095rN(this, 39);
        this.A0f = new C1232467r(this, 10);
        this.A0W = new Handler(Looper.myLooper(), new C1238169w(this, 7));
        LayoutInflater.from(context).inflate(R.layout.f8nameremoved, this);
        this.A0U = this.A0C.A0N(820);
        this.A0V = i;
        StringBuilder A0o2 = AnonymousClass001.A0o();
        this.A15 = A0o2;
        this.A16 = new Formatter(A0o2, Locale.getDefault());
        this.A0h = C86664Kz.A0t(this, R.id.close);
        this.A0j = C86664Kz.A0t(this, R.id.fullscreen_close);
        this.A0k = C86664Kz.A0t(this, R.id.fullscreen_minimize);
        this.A0l = C86664Kz.A0t(this, R.id.landscape_close);
        this.A0m = C86664Kz.A0t(this, R.id.landscape_minimize);
        this.A0i = C86664Kz.A0t(this, R.id.chat_fullscreen);
        this.A0o = C86664Kz.A0t(this, R.id.play_pause);
        this.A0p = C86664Kz.A0t(this, R.id.play_pause_fullscreen);
        this.A0t = (ProgressBar) C06560Yg.A02(this, R.id.minimized_progress_bar);
        this.A0u = (SeekBar) C06560Yg.A02(this, R.id.mediacontroller_progress);
        this.A0x = C18300x5.A0G(this, R.id.time);
        this.A0w = C18300x5.A0G(this, R.id.time_current);
        AutoScrollView autoScrollView = (AutoScrollView) C06560Yg.A02(this, R.id.music_attribution_view);
        this.A0y = autoScrollView;
        this.A0g = autoScrollView.A00;
        ImageButton A0t2 = C86664Kz.A0t(this, R.id.logo_button);
        this.A0n = A0t2;
        WDSButton A0f2 = C86654Ky.A0f(this, R.id.logo_box_button);
        this.A11 = A0f2;
        this.A0Y = C06560Yg.A02(this, R.id.loading);
        this.A0X = C06560Yg.A02(this, R.id.background);
        this.A0s = C86654Ky.A0N(this, R.id.media_controller_container);
        this.A0c = C86644Kx.A0I(this, R.id.video_attribution_container);
        this.A0d = C86644Kx.A0I(this, R.id.video_information_container);
        this.A0a = C86644Kx.A0I(this, R.id.pip_container);
        this.A0b = C86644Kx.A0I(this, R.id.portrait_fullscreen_container);
        this.A0Z = C86644Kx.A0I(this, R.id.bottom_control_container);
        this.A0e = C86644Kx.A0I(this, R.id.watch_play_container);
        this.A13 = C86654Ky.A0f(this, R.id.watch_more_videos_button);
        this.A12 = C86654Ky.A0f(this, R.id.play_again_button);
        A0t2.setVisibility(8);
        A0f2.setVisibility(!A0F() ? 8 : i2);
        this.A0r = C86654Ky.A0N(this, R.id.authorship_container);
        this.A0v = C18300x5.A0G(this, R.id.author_name);
        this.A0z = (ReadMoreTextView) C06560Yg.A02(this, R.id.video_caption);
        this.A0q = AnonymousClass0x9.A0E(this, R.id.author_image);
        ImageButton imageButton = this.A0n;
        imageButton.setPaddingRelative(imageButton.getPaddingStart(), imageButton.getPaddingTop(), 0, imageButton.getPaddingBottom());
        ImageButton imageButton2 = this.A0h;
        imageButton2.setPaddingRelative(imageButton2.getPaddingStart(), imageButton2.getPaddingTop(), 0, imageButton2.getPaddingBottom());
        ImageButton imageButton3 = this.A0o;
        imageButton3.setPaddingRelative(0, imageButton3.getPaddingTop(), imageButton3.getPaddingEnd(), imageButton3.getPaddingBottom());
        this.A00 = new AccelerateInterpolator();
        this.A0B = new DecelerateInterpolator();
        Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), R.anim.f0nameremoved);
        loadAnimation.setDuration(200);
        loadAnimation.setInterpolator(this.A00);
        this.A08 = loadAnimation;
        Animation loadAnimation2 = AnimationUtils.loadAnimation(getContext(), R.anim.f0nameremoved);
        loadAnimation2.setDuration(200);
        loadAnimation2.setInterpolator(this.A0B);
        this.A07 = loadAnimation2;
        Animation loadAnimation3 = AnimationUtils.loadAnimation(getContext(), R.anim.f0nameremoved);
        loadAnimation3.setDuration(200);
        loadAnimation3.setInterpolator(this.A00);
        this.A0A = loadAnimation3;
        Animation loadAnimation4 = AnimationUtils.loadAnimation(getContext(), R.anim.f0nameremoved);
        loadAnimation4.setDuration(200);
        loadAnimation4.setInterpolator(this.A0B);
        this.A09 = loadAnimation4;
        AlphaAnimation A0C2 = AnonymousClass4L0.A0C(1.0f, 0.0f);
        A0C2.setDuration(200);
        A0C2.setInterpolator(this.A00);
        this.A02 = A0C2;
        A0C2.setAnimationListener(this.A0f);
        AlphaAnimation A0C3 = AnonymousClass4L0.A0C(0.0f, 1.0f);
        A0C3.setDuration(200);
        A0C3.setInterpolator(this.A0B);
        this.A01 = A0C3;
        this.A10 = r8;
        onConfigurationChanged(C86634Kw.A0E(this));
    }

    private Animation getFullscreenBottomControlsSlideInAnimation() {
        if (AnonymousClass000.A1U(C86634Kw.A0E(this).orientation, 2)) {
            return this.A04;
        }
        return this.A03;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0027, code lost:
        if (r6.A06 == null) goto L_0x0029;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0029, code lost:
        r2 = new android.view.animation.TranslateAnimation(0.0f, 0.0f, 0.0f, X.C86664Kz.A02(r6.A0s));
        r2.setDuration(200);
        r2.setInterpolator(r6.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003e, code lost:
        if (r5 == false) goto L_0x0063;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0040, code lost:
        r6.A06 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0044, code lost:
        if (r6.A04 != null) goto L_0x0016;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0046, code lost:
        r2 = new android.view.animation.TranslateAnimation(0.0f, 0.0f, X.C86664Kz.A02(r6.A0s), 0.0f);
        r2.setDuration(200);
        r2.setInterpolator(r6.A0B);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005b, code lost:
        if (r5 == false) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005d, code lost:
        r6.A04 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0060, code lost:
        r6.A03 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0063, code lost:
        r6.A05 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0068, code lost:
        return r6.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0010, code lost:
        if (r6.A05 != null) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0014, code lost:
        if (r6.A03 != null) goto L_0x0016;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0020, code lost:
        if (X.AnonymousClass000.A1U(X.C86634Kw.A0E(r6).orientation, 2) == false) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0024, code lost:
        return r6.A06;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.view.animation.Animation getFullscreenBottomControlsSlideOutAnimation() {
        /*
            r6 = this;
            android.content.res.Configuration r0 = X.C86634Kw.A0E(r6)
            int r0 = r0.orientation
            r3 = 2
            boolean r5 = X.AnonymousClass000.A1U(r0, r3)
            r4 = 0
            if (r5 != 0) goto L_0x0025
            android.view.animation.Animation r0 = r6.A05
            if (r0 == 0) goto L_0x0029
        L_0x0012:
            android.view.animation.Animation r0 = r6.A03
            if (r0 == 0) goto L_0x0046
        L_0x0016:
            android.content.res.Configuration r0 = X.C86634Kw.A0E(r6)
            int r0 = r0.orientation
            boolean r0 = X.AnonymousClass000.A1U(r0, r3)
            if (r0 == 0) goto L_0x0066
            android.view.animation.Animation r0 = r6.A06
            return r0
        L_0x0025:
            android.view.animation.Animation r0 = r6.A06
            if (r0 != 0) goto L_0x0042
        L_0x0029:
            android.widget.LinearLayout r0 = r6.A0s
            float r0 = X.C86664Kz.A02(r0)
            android.view.animation.TranslateAnimation r2 = new android.view.animation.TranslateAnimation
            r2.<init>(r4, r4, r4, r0)
            r0 = 200(0xc8, double:9.9E-322)
            r2.setDuration(r0)
            android.view.animation.AccelerateInterpolator r0 = r6.A00
            r2.setInterpolator(r0)
            if (r5 == 0) goto L_0x0063
            r6.A06 = r2
        L_0x0042:
            android.view.animation.Animation r0 = r6.A04
            if (r0 != 0) goto L_0x0016
        L_0x0046:
            android.widget.LinearLayout r0 = r6.A0s
            float r0 = X.C86664Kz.A02(r0)
            android.view.animation.TranslateAnimation r2 = new android.view.animation.TranslateAnimation
            r2.<init>(r4, r4, r0, r4)
            r0 = 200(0xc8, double:9.9E-322)
            r2.setDuration(r0)
            android.view.animation.DecelerateInterpolator r0 = r6.A0B
            r2.setInterpolator(r0)
            if (r5 == 0) goto L_0x0060
            r6.A04 = r2
            goto L_0x0016
        L_0x0060:
            r6.A03 = r2
            goto L_0x0016
        L_0x0063:
            r6.A05 = r2
            goto L_0x0012
        L_0x0066:
            android.view.animation.Animation r0 = r6.A05
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass563.getFullscreenBottomControlsSlideOutAnimation():android.view.animation.Animation");
    }

    public void A03() {
        View view;
        Animation animation;
        A0E();
        setSystemUiVisibility(0);
        A07();
        if (!A06()) {
            if (this.A0N) {
                A0A();
                Animation fullscreenBottomControlsSlideInAnimation = getFullscreenBottomControlsSlideInAnimation();
                if (fullscreenBottomControlsSlideInAnimation != null) {
                    this.A0Z.startAnimation(fullscreenBottomControlsSlideInAnimation);
                }
                LinearLayout linearLayout = this.A0s;
                Animation animation2 = this.A01;
                linearLayout.startAnimation(animation2);
                linearLayout.setVisibility(0);
                if (this.A0e.getVisibility() != 0) {
                    ImageButton imageButton = this.A0p;
                    imageButton.startAnimation(animation2);
                    imageButton.setVisibility(0);
                }
                if (!AnonymousClass000.A1U(C86634Kw.A0E(this).orientation, 2)) {
                    view = this.A0b;
                    animation = this.A07;
                } else {
                    return;
                }
            } else {
                this.A0Z.startAnimation(this.A09);
                view = this.A0t;
                animation = this.A01;
            }
            view.startAnimation(animation);
            view.setVisibility(0);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0022, code lost:
        if (r1 != false) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A09() {
        /*
            r5 = this;
            android.content.res.Resources r1 = r5.getResources()
            int r0 = r5.getBottomContainerHorizontalPadding()
            int r3 = r1.getDimensionPixelSize(r0)
            android.content.res.Resources r2 = r5.getResources()
            boolean r0 = r5.A0N
            if (r0 == 0) goto L_0x0024
            android.content.res.Configuration r0 = X.C86634Kw.A0E(r5)
            int r1 = r0.orientation
            r0 = 2
            boolean r1 = X.AnonymousClass000.A1U(r1, r0)
            r0 = 2131166801(0x7f070651, float:1.7947858E38)
            if (r1 == 0) goto L_0x0027
        L_0x0024:
            r0 = 2131168272(0x7f070c10, float:1.7950841E38)
        L_0x0027:
            int r2 = r2.getDimensionPixelSize(r0)
            android.view.ViewGroup r1 = r5.A0Z
            int r0 = r1.getPaddingTop()
            r1.setPadding(r3, r0, r3, r2)
            boolean r0 = r5.A0N
            if (r0 == 0) goto L_0x0055
            android.content.res.Resources r1 = r5.getResources()
            r0 = 2131168275(0x7f070c13, float:1.7950847E38)
            int r4 = r1.getDimensionPixelSize(r0)
        L_0x0043:
            android.view.ViewGroup r3 = r5.A0d
            int r2 = r5.getPaddingLeft()
            int r1 = r5.getPaddingTop()
            int r0 = r5.getPaddingRight()
            r3.setPadding(r2, r1, r0, r4)
            return
        L_0x0055:
            r4 = 0
            goto L_0x0043
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass563.A09():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0015, code lost:
        if (r6.A0O != false) goto L_0x0017;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002c, code lost:
        if (r6.A0O != false) goto L_0x002e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0A() {
        /*
            r6 = this;
            android.content.res.Configuration r0 = X.C86634Kw.A0E(r6)
            int r1 = r0.orientation
            r0 = 2
            boolean r5 = X.AnonymousClass000.A1U(r1, r0)
            android.widget.ImageButton r2 = r6.A0k
            r4 = 0
            r3 = 8
            if (r5 != 0) goto L_0x0017
            boolean r1 = r6.A0O
            r0 = 0
            if (r1 == 0) goto L_0x0019
        L_0x0017:
            r0 = 8
        L_0x0019:
            r2.setVisibility(r0)
            android.widget.ImageButton r1 = r6.A0j
            int r0 = X.C86614Ku.A01(r5)
            r1.setVisibility(r0)
            android.widget.ImageButton r2 = r6.A0m
            if (r5 == 0) goto L_0x002e
            boolean r1 = r6.A0O
            r0 = 0
            if (r1 == 0) goto L_0x0030
        L_0x002e:
            r0 = 8
        L_0x0030:
            r2.setVisibility(r0)
            android.widget.ImageButton r1 = r6.A0l
            int r0 = X.AnonymousClass001.A08(r5)
            r1.setVisibility(r0)
            boolean r1 = r6.A0N
            android.view.ViewGroup r0 = r6.A0b
            if (r1 == 0) goto L_0x004a
            if (r5 == 0) goto L_0x0046
            r4 = 8
        L_0x0046:
            r0.setVisibility(r4)
            return
        L_0x004a:
            r0.setVisibility(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass563.A0A():void");
    }

    public List getFullscreenControls() {
        ArrayList A0s2 = AnonymousClass001.A0s();
        A0s2.add(this.A11);
        A0s2.add(this.A0h);
        A0s2.add(this.A0o);
        A0s2.add(this.A0s);
        return A0s2;
    }

    public List getInlineControls() {
        ArrayList A0s2 = AnonymousClass001.A0s();
        A0s2.add(this.A0n);
        A0s2.add(this.A0i);
        A0s2.add(this.A0t);
        return A0s2;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        A0A();
        A09();
        A0D();
    }

    public void setAuthorInformation(String str, C1227165l r4) {
        if (!TextUtils.isEmpty(str)) {
            this.A0v.setText(str);
            LinearLayout linearLayout = this.A0r;
            linearLayout.setVisibility(0);
            C109395eY.A00(linearLayout, r4, 32);
        }
    }

    public void setBlockPlayButtonInput(boolean z) {
        this.A0K = z;
    }

    public void setInStatus(boolean z) {
        this.A0O = z;
    }

    public void setPlayPauseListener(AnonymousClass64A r1) {
        this.A0H = r1;
    }

    public void setVideoCaption(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            ReadMoreTextView readMoreTextView = this.A0z;
            readMoreTextView.setText(charSequence);
            readMoreTextView.setVisibility(0);
            AnonymousClass5CS.A00(readMoreTextView, this, 11);
        }
    }
}
