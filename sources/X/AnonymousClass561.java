package X;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import com.whatsapp.R;
import java.util.Formatter;
import java.util.Locale;

/* renamed from: X.561  reason: invalid class name */
public abstract class AnonymousClass561 extends AnonymousClass6FS {
    public AlphaAnimation A00;
    public C620733j A01;
    public AnonymousClass1VX A02;
    public C186478vP A03;
    public C183368pv A04;
    public C183378pw A05;
    public C183388px A06;
    public Long A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public final FrameLayout A0C;
    public final FrameLayout A0D;
    public final FrameLayout A0E;
    public final FrameLayout A0F;
    public final ImageButton A0G;
    public final ImageView A0H;
    public final LinearLayout A0I;
    public final SeekBar A0J;
    public final TextView A0K;
    public final TextView A0L;
    public final Runnable A0M;
    public final Runnable A0N;
    public final StringBuilder A0O;
    public final Formatter A0P;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass561(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C162457s7.A0J(context, 1);
        StringBuilder A0o = AnonymousClass001.A0o();
        this.A0O = A0o;
        this.A0P = new Formatter(A0o, Locale.getDefault());
        this.A0B = true;
        this.A09 = true;
        this.A08 = true;
        this.A0N = new C117105rO(this, 5);
        this.A0M = new C117105rO(this, 6);
        LayoutInflater.from(context).inflate(R.layout.f8nameremoved, this);
        this.A0E = (FrameLayout) C18290x4.A0M(this, R.id.main_controls);
        this.A0K = C18280x3.A0F(this, R.id.time);
        this.A0L = C18280x3.A0F(this, R.id.time_current);
        SeekBar seekBar = (SeekBar) C18290x4.A0M(this, R.id.mediacontroller_progress);
        this.A0J = seekBar;
        ImageView imageView = (ImageView) C18290x4.A0M(this, R.id.back);
        this.A0H = imageView;
        this.A0I = (LinearLayout) C18290x4.A0M(this, R.id.footer);
        seekBar.setMax(1000);
        this.A0C = (FrameLayout) C18290x4.A0M(this, R.id.control_frame);
        this.A0G = (ImageButton) C18290x4.A0M(this, R.id.play);
        this.A0F = (FrameLayout) C18290x4.A0M(this, R.id.left_panel);
        this.A0D = (FrameLayout) C18290x4.A0M(this, R.id.right_panel);
        boolean A0X = getAbProps().A0X(6082);
        FrameLayout frameLayout = this.A0D;
        if (!A0X) {
            frameLayout.setVisibility(4);
            this.A0F.setVisibility(4);
        } else {
            frameLayout.setVisibility(0);
            FrameLayout frameLayout2 = this.A0F;
            frameLayout2.setVisibility(0);
            frameLayout.setOnClickListener(new C138096pl(this, 0));
            frameLayout2.setOnClickListener(new C138096pl(this, 1));
        }
        A08();
        if (C102805Ki.A00(getWhatsAppLocale()) && !isInEditMode()) {
            imageView.setRotationY(180.0f);
        }
        Configuration A0E2 = C86634Kw.A0E(this);
        C162457s7.A0D(A0E2);
        onConfigurationChanged(A0E2);
    }

    public abstract void A0C();

    public abstract void A0D();

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean dispatchKeyEvent(android.view.KeyEvent r8) {
        /*
            r7 = this;
            r3 = 0
            X.C162457s7.A0J(r8, r3)
            X.8vP r0 = r7.A03
            if (r0 == 0) goto L_0x0084
            int r0 = r8.getAction()
            if (r0 != 0) goto L_0x0084
            int r1 = r8.getKeyCode()
            r0 = 21
            r6 = 1
            if (r1 == r0) goto L_0x004f
            r0 = 22
            if (r1 == r0) goto L_0x0064
            r0 = 85
            r2 = 0
            if (r1 == r0) goto L_0x0040
            r0 = 126(0x7e, float:1.77E-43)
            if (r1 == r0) goto L_0x0038
            r0 = 127(0x7f, float:1.78E-43)
            if (r1 == r0) goto L_0x0030
            switch(r1) {
                case 87: goto L_0x007d;
                case 88: goto L_0x002c;
                case 89: goto L_0x004f;
                case 90: goto L_0x0064;
                default: goto L_0x002b;
            }
        L_0x002b:
            return r3
        L_0x002c:
            r7.A0D()
            goto L_0x0080
        L_0x0030:
            X.8vP r0 = r7.A03
            if (r0 == 0) goto L_0x0080
            r0.Bmw(r3)
            goto L_0x0080
        L_0x0038:
            X.8vP r0 = r7.A03
            if (r0 == 0) goto L_0x0080
            r0.Bmw(r6)
            goto L_0x0080
        L_0x0040:
            X.8vP r1 = r7.A03
            if (r1 == 0) goto L_0x0080
            boolean r0 = r1.BBP()
            if (r0 != 0) goto L_0x004b
            r2 = 1
        L_0x004b:
            r1.Bmw(r2)
            goto L_0x0080
        L_0x004f:
            X.8vP r5 = r7.A03
            if (r5 == 0) goto L_0x0080
            long r3 = r5.B6W()
            r0 = 10000(0x2710, float:1.4013E-41)
            long r0 = (long) r0
            long r3 = r3 - r0
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0079
            r3 = 0
            goto L_0x0079
        L_0x0064:
            X.8vP r5 = r7.A03
            if (r5 == 0) goto L_0x0080
            long r3 = r5.B6W()
            r0 = 10000(0x2710, float:1.4013E-41)
            long r0 = (long) r0
            long r3 = r3 + r0
            long r1 = r5.B7A()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0079
            r3 = r1
        L_0x0079:
            r5.Bl2(r3)
            goto L_0x0080
        L_0x007d:
            r7.A0C()
        L_0x0080:
            r7.A05()
            return r6
        L_0x0084:
            boolean r0 = super.dispatchKeyEvent(r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass561.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    public final void onConfigurationChanged(Configuration configuration) {
        int A062;
        int i;
        C162457s7.A0J(configuration, 0);
        super.onConfigurationChanged(configuration);
        int i2 = C86634Kw.A0J().widthPixels;
        int i3 = configuration.orientation;
        Context context = getContext();
        if (i3 == 2) {
            A062 = AnonymousClass001.A06(20.0f, C86604Kt.A00(context));
            i = i2 / 10;
        } else {
            A062 = AnonymousClass001.A06(30.0f, C86604Kt.A00(context));
            i = i2 / 20;
        }
        if (getAbProps().A0X(6082)) {
            this.A0F.setPadding(i, 0, i, 0);
            this.A0D.setPadding(i, 0, i, 0);
        }
        TextView textView = this.A0L;
        textView.setPadding(textView.getPaddingLeft(), A062, textView.getPaddingRight(), A062);
        SeekBar seekBar = this.A0J;
        seekBar.setPadding(seekBar.getPaddingLeft(), A062, seekBar.getPaddingRight(), A062);
        TextView textView2 = this.A0K;
        textView2.setPadding(textView2.getPaddingLeft(), A062, textView2.getPaddingRight(), A062);
    }

    public final void setAbProps(AnonymousClass1VX r2) {
        C162457s7.A0J(r2, 0);
        this.A02 = r2;
    }

    public abstract void setPlayer(Object obj);

    public final void setWhatsAppLocale(C620733j r2) {
        C162457s7.A0J(r2, 0);
        this.A01 = r2;
    }

    public static final void A00(FrameLayout frameLayout) {
        DecelerateInterpolator decelerateInterpolator = new DecelerateInterpolator(1.5f);
        AccelerateInterpolator accelerateInterpolator = new AccelerateInterpolator(1.5f);
        AlphaAnimation A0C2 = AnonymousClass4L0.A0C(0.0f, 1.0f);
        long j = (long) 500;
        A0C2.setDuration(j);
        A0C2.setInterpolator(decelerateInterpolator);
        AlphaAnimation A0C3 = AnonymousClass4L0.A0C(1.0f, 0.0f);
        A0C3.setDuration(j);
        A0C3.setInterpolator(accelerateInterpolator);
        A0C3.setStartOffset(j);
        AnimationSet animationSet = new AnimationSet(false);
        animationSet.addAnimation(A0C2);
        animationSet.addAnimation(A0C3);
        C86624Kv.A19(animationSet, frameLayout, 11);
        frameLayout.startAnimation(animationSet);
    }

    public static void A01(AnonymousClass561 r2, Object obj) {
        C186478vP r0;
        if (r2.A0C == obj && (r0 = r2.A03) != null) {
            int BBT = r0.BBT();
            C186478vP r22 = r2.A03;
            if (BBT == 4) {
                r22.Bl2(0);
            } else {
                r22.Bmw(!r22.BBP());
            }
        }
    }

    public final void A04() {
        C186478vP r0;
        if (this.A08 && this.A00 == null) {
            AccelerateInterpolator accelerateInterpolator = new AccelerateInterpolator(1.5f);
            AlphaAnimation A0C2 = AnonymousClass4L0.A0C(getAlpha(), 0.0f);
            A0C2.setDuration(250);
            A0C2.setInterpolator(accelerateInterpolator);
            C86624Kv.A19(A0C2, this, 12);
            this.A00 = A0C2;
            Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), R.anim.f0nameremoved);
            loadAnimation.setDuration(250);
            loadAnimation.setInterpolator(accelerateInterpolator);
            FrameLayout frameLayout = this.A0E;
            if (C86604Kt.A1Y(frameLayout)) {
                frameLayout.setVisibility(4);
                C183388px r1 = this.A06;
                if (r1 != null) {
                    r1.BfZ(frameLayout.getVisibility());
                }
                Animation loadAnimation2 = AnimationUtils.loadAnimation(getContext(), R.anim.f0nameremoved);
                loadAnimation2.setDuration(250);
                loadAnimation2.setInterpolator(accelerateInterpolator);
                this.A0H.startAnimation(loadAnimation2);
                frameLayout.startAnimation(this.A00);
                this.A0I.startAnimation(loadAnimation);
            }
            if (this.A09) {
                FrameLayout frameLayout2 = this.A0C;
                if (frameLayout2.getVisibility() == 0 && (r0 = this.A03) != null && r0.BBP() && A0F()) {
                    frameLayout2.setVisibility(4);
                    frameLayout2.startAnimation(this.A00);
                }
            }
        }
    }

    public final void A05() {
        if (this.A08) {
            FrameLayout frameLayout = this.A0E;
            frameLayout.setVisibility(0);
            C183388px r1 = this.A06;
            if (r1 != null) {
                r1.BfZ(frameLayout.getVisibility());
            }
            DecelerateInterpolator decelerateInterpolator = new DecelerateInterpolator(1.5f);
            AlphaAnimation A0C2 = AnonymousClass4L0.A0C(0.0f, getAlpha());
            A0C2.setDuration(250);
            A0C2.setInterpolator(decelerateInterpolator);
            Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), R.anim.f0nameremoved);
            loadAnimation.setDuration(250);
            loadAnimation.setInterpolator(decelerateInterpolator);
            Animation loadAnimation2 = AnimationUtils.loadAnimation(getContext(), R.anim.f0nameremoved);
            loadAnimation2.setDuration(250);
            loadAnimation2.setInterpolator(decelerateInterpolator);
            FrameLayout frameLayout2 = this.A0C;
            if (frameLayout2.getVisibility() == 4 && this.A09) {
                frameLayout2.setVisibility(0);
                frameLayout2.startAnimation(A0C2);
                this.A0G.sendAccessibilityEvent(8);
            }
            frameLayout.startAnimation(A0C2);
            this.A0I.startAnimation(loadAnimation);
            this.A0H.startAnimation(loadAnimation2);
            A08();
        }
    }

    public final void A06() {
        if (this.A09) {
            this.A0C.setVisibility(0);
        }
        this.A0E.setVisibility(4);
        A08();
    }

    public final void A07() {
        this.A0E.setVisibility(0);
        if (this.A09) {
            this.A0C.setVisibility(0);
        }
        A08();
    }

    public final void A09() {
        FrameLayout frameLayout;
        if (C86604Kt.A1Y(this.A0E)) {
            Long l = this.A07;
            boolean z = true;
            int i = 0;
            if (l == null) {
                C186478vP r0 = this.A03;
                if (r0 == null || !r0.BIq()) {
                    z = false;
                }
            } else {
                if (l.longValue() <= 10000) {
                    frameLayout = this.A0D;
                    i = 4;
                } else if (getAbProps().A0X(6082)) {
                    frameLayout = this.A0D;
                }
                frameLayout.setVisibility(i);
                this.A0F.setVisibility(i);
            }
            this.A0J.setEnabled(z);
        }
    }

    public final void A0A() {
        if (this.A0C.getVisibility() != 4) {
            C186478vP r0 = this.A03;
            boolean z = false;
            if (r0 != null) {
                z = C18310x6.A1W(r0.BBP() ? 1 : 0);
            }
            ImageButton imageButton = this.A0G;
            int i = R.drawable.ic_video_play;
            if (z) {
                i = R.drawable.ic_video_pause;
            }
            imageButton.setImageResource(i);
            C620733j whatsAppLocale = getWhatsAppLocale();
            int i2 = R.string.f11nameremoved;
            if (z) {
                i2 = R.string.f11nameremoved;
            }
            String A0C2 = whatsAppLocale.A0C(i2);
            C162457s7.A0D(A0C2);
            imageButton.setContentDescription(A0C2);
        }
    }

    public final void A0B() {
        SeekBar seekBar;
        int i;
        int BBT;
        int i2;
        long j;
        long j2;
        if (C86604Kt.A1Y(this.A0E)) {
            long j3 = 0;
            if (this.A07 == null) {
                C186478vP r0 = this.A03;
                if (r0 != null) {
                    j2 = r0.B7A();
                } else {
                    j2 = 0;
                }
                String A012 = AnonymousClass5VT.A01(this.A0O, this.A0P, j2);
                C162457s7.A0D(A012);
                TextView textView = this.A0K;
                if (textView.getText() == null || !A012.equals(C86664Kz.A1K(textView))) {
                    textView.setText(A012);
                }
            }
            if (this.A0B) {
                C186478vP r02 = this.A03;
                if (r02 != null) {
                    j = r02.B4x();
                } else {
                    j = 0;
                }
                seekBar = this.A0J;
                long duration = getDuration();
                if (duration == -9223372036854775807L || duration == 0) {
                    i = 0;
                } else {
                    i = (int) ((j * ((long) 1000)) / duration);
                }
            } else {
                seekBar = this.A0J;
                i = 1000;
            }
            seekBar.setSecondaryProgress(i);
            C186478vP r03 = this.A03;
            if (r03 != null) {
                j3 = r03.B6W();
            }
            if (!this.A0A) {
                String A013 = AnonymousClass5VT.A01(this.A0O, this.A0P, j3);
                C162457s7.A0D(A013);
                TextView textView2 = this.A0L;
                if (textView2.getText() == null || !A013.equals(C86664Kz.A1K(textView2))) {
                    textView2.setText(A013);
                }
            }
            if (!this.A0A) {
                long duration2 = getDuration();
                if (duration2 == -9223372036854775807L || duration2 == 0) {
                    i2 = 0;
                } else {
                    i2 = (int) ((j3 * ((long) 1000)) / duration2);
                }
                seekBar.setProgress(i2);
            }
            Runnable runnable = this.A0N;
            removeCallbacks(runnable);
            C186478vP r04 = this.A03;
            boolean z = true;
            if (r04 != null && (BBT = r04.BBT()) != 1 && BBT != 4) {
                C186478vP r05 = this.A03;
                if (r05 == null || !r05.BBP()) {
                    z = false;
                }
                long j4 = 1000;
                if (z && BBT == 3) {
                    long j5 = 1000 - (j3 % 1000);
                    j4 = j5 < 200 ? 1000 + j5 : j5;
                }
                postDelayed(runnable, j4);
            }
        }
    }

    public final void A0E(int i) {
        Runnable runnable = this.A0M;
        removeCallbacks(runnable);
        C186478vP r0 = this.A03;
        if (r0 != null && r0.BBP()) {
            postDelayed(runnable, (long) i);
        }
        if (this.A00 != null) {
            clearAnimation();
            this.A00 = null;
        }
    }

    public boolean A0F() {
        C186478vP r0 = this.A03;
        if (r0 != null && r0.BBT() == 3) {
            return true;
        }
        C186478vP r02 = this.A03;
        if (r02 == null || r02.BBT() != 2) {
            return false;
        }
        return true;
    }

    public final boolean A0G() {
        return C86604Kt.A1Y(this.A0E);
    }

    public final AnonymousClass1VX getAbProps() {
        AnonymousClass1VX r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0R();
    }

    public final long getDuration() {
        Long l = this.A07;
        if (l != null) {
            return l.longValue();
        }
        C186478vP r0 = this.A03;
        if (r0 != null) {
            return r0.B7A();
        }
        return -9223372036854775807L;
    }

    public final C620733j getWhatsAppLocale() {
        C620733j r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("whatsAppLocale");
    }

    public final long A03(int i) {
        long duration = getDuration();
        if (duration == -9223372036854775807L) {
            return 0;
        }
        return (duration * ((long) i)) / ((long) 1000);
    }

    public final void A08() {
        A0A();
        A09();
        A0B();
    }

    public final void setAllowControlFrameVisibilityChanges(boolean z) {
        this.A08 = z;
    }

    public final void setDuration(long j) {
        Long valueOf = Long.valueOf(j);
        this.A07 = valueOf;
        TextView textView = this.A0K;
        StringBuilder sb = this.A0O;
        Formatter formatter = this.A0P;
        if (valueOf != null) {
            j = valueOf.longValue();
        }
        textView.setText(AnonymousClass5VT.A01(sb, formatter, j));
        A0B();
        A09();
    }

    public final void setPlayButtonClickListener(C183368pv r1) {
        this.A04 = r1;
    }

    public final void setPlayControlVisibility(int i) {
        this.A09 = AnonymousClass000.A1T(i);
        this.A0C.setVisibility(i);
    }

    public final void setSeekbarStartTrackingTouchListener(C183378pw r1) {
        this.A05 = r1;
    }

    public final void setStreaming(boolean z) {
        this.A0B = z;
    }

    public final void setVisibilityListener(C183388px r1) {
        this.A06 = r1;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AnonymousClass561(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C162457s7.A0J(context, 1);
    }
}
