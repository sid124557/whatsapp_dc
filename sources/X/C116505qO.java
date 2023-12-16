package X;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.whatsapp.Mp4Ops;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import com.whatsapp.videoplayback.YoutubePlayerTouchOverlay;
import java.net.URL;

/* renamed from: X.5qO  reason: invalid class name and case insensitive filesystem */
public class C116505qO implements AnonymousClass66v {
    public double A00;
    public int A01 = 0;
    public int A02 = 3;
    public int A03 = 0;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public FrameLayout A08;
    public C147247Dj A09;
    public AnonymousClass2z0 A0A;
    public AnonymousClass560 A0B;
    public AnonymousClass4P1 A0C;
    public AnonymousClass5NI A0D;
    public AnonymousClass5YG A0E;
    public String A0F;
    public URL A0G;
    public URL A0H;
    public boolean A0I;
    public boolean A0J;
    public final Context A0K;
    public final Rect A0L = AnonymousClass001.A0N();
    public final C111095hX A0M;
    public final C55682qk A0N;
    public final AnonymousClass5DB A0O;
    public final C69263Wi A0P;
    public final Mp4Ops A0Q;
    public final C153407bG A0R;
    public final C620633i A0S;
    public final C54292oU A0T;
    public final C620733j A0U;
    public final AnonymousClass1VX A0V;
    public final C106685Zz A0W;
    public final C54882pR A0X;
    public final AnonymousClass4FS A0Y;
    public final C150197Pr A0Z;
    public final C183538qC A0a;

    public static void A00(Context context, Rect rect, Rect rect2, View view, AnonymousClass560 r13, AnonymousClass4P1 r14, boolean z) {
        float f;
        float width;
        view.setPivotX(0.0f);
        view.setPivotY(0.0f);
        r14.getFullscreenControls();
        r14.getInlineControls();
        context.getResources().getColor(R.color.f5nameremoved);
        context.getResources().getColor(R.color.f5nameremoved);
        float f2 = 1.0f;
        if (r13 == null || !z) {
            f = 1.0f;
        } else {
            f = r13.A00;
        }
        if (Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 0.0f) == 0.0f) {
            view.setX((float) rect.left);
            view.setY((float) rect.top);
            view.setScaleX(f);
            view.setScaleY(f);
            view.requestLayout();
            return;
        }
        float width2 = ((float) rect2.width()) / ((float) rect2.height());
        float width3 = ((float) rect.width()) / ((float) rect.height());
        if (z ? width2 >= width3 : width2 <= width3) {
            width = ((float) rect.width()) / ((float) rect2.width());
            float height = ((((float) rect2.height()) * width) - ((float) rect.height())) / 2.0f;
            rect.top = (int) (((float) rect.top) - height);
            rect.bottom = (int) (((float) rect.bottom) + height);
        } else {
            width = ((float) rect.height()) / ((float) rect2.height());
            float width4 = ((((float) rect2.width()) * width) - ((float) rect.width())) / 2.0f;
            rect.left = (int) (((float) rect.left) - width4);
            rect.right = (int) (((float) rect.right) + width4);
        }
        if (Float.isNaN(width) || Float.isInfinite(width)) {
            width = 1.0f;
        }
        if (!Float.isNaN(f) && !Float.isInfinite(f)) {
            f2 = f;
        }
        AnimatorSet A0O2 = C86664Kz.A0O();
        A0O2.play(ObjectAnimator.ofFloat(view, View.X, new float[]{(float) rect.left, (float) rect2.left})).with(ObjectAnimator.ofFloat(view, View.Y, new float[]{(float) rect.top, (float) rect2.top})).with(ObjectAnimator.ofFloat(view, View.SCALE_X, new float[]{width, f2})).with(ObjectAnimator.ofFloat(view, View.SCALE_Y, new float[]{width, f2}));
        A0O2.setDuration(250);
        C86614Ku.A0y(A0O2);
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("VideoPlaybackUtils/fullscreenAnimation scaleX error. startScale=");
        A0o.append(width);
        A0o.append(" currentScale=");
        A0o.append(f2);
        AnonymousClass0x2.A18(A0o);
        A0O2.start();
    }

    public final void A01() {
        String str = this.A0F;
        Context context = this.A0K;
        C150197Pr r3 = this.A0Z;
        C111095hX r2 = this.A0M;
        if (str != null) {
            r2.BkW(context, Uri.parse(str), (C624134x) null);
        }
        r3.A02 = true;
        r3.A00 = null;
        Az5();
    }

    public void Az5() {
        long j;
        AnonymousClass2z0 r0;
        long j2;
        int i;
        Integer valueOf;
        if (this.A0J) {
            boolean A0X2 = this.A0V.A0X(2431);
            C150197Pr r8 = this.A0Z;
            int i2 = this.A06;
            AnonymousClass5YG r02 = this.A0E;
            if (r02 != null) {
                j = (long) r02.A06();
            } else {
                j = 0;
            }
            C104965Ta r7 = r8.A09;
            if (r7.A02) {
                r7.A00();
            }
            C104965Ta r9 = r8.A07;
            r9.A00();
            C95014sT r6 = new C95014sT();
            if (!r8.A02 || A0X2) {
                boolean z = r8.A04;
                long j3 = 0;
                if (z) {
                    j2 = 0;
                } else {
                    j2 = r9.A00;
                }
                r6.A04 = Long.valueOf(j2);
                r6.A06 = Long.valueOf(Math.round(((double) j) / 10000.0d) * 10000);
                if (z) {
                    j3 = r8.A08.A00;
                }
                r6.A07 = Long.valueOf(j3);
                r6.A01 = Boolean.valueOf(z);
                r6.A08 = Long.valueOf(r8.A06.A00);
                long j4 = r7.A00;
                r6.A09 = Long.valueOf(Math.round(((double) j4) / 10000.0d) * 10000);
                switch (i2) {
                    case 1:
                        i = 5;
                        break;
                    case 2:
                        i = 1;
                        break;
                    case 3:
                        i = 3;
                        break;
                    case 4:
                        i = 4;
                        break;
                    case 5:
                        i = 2;
                        break;
                    case 6:
                        i = 7;
                        break;
                    case 7:
                        i = 6;
                        break;
                    case 8:
                        i = 8;
                        break;
                    default:
                        valueOf = null;
                        break;
                }
                valueOf = Integer.valueOf(i);
                r6.A03 = valueOf;
                if (A0X2) {
                    r6.A05 = Long.valueOf((long) ((((float) j4) * 100.0f) / ((float) j)));
                    r6.A00 = Boolean.valueOf(r8.A03);
                    r6.A0A = r8.A01;
                    r6.A02 = r8.A00;
                }
                r8.A05.BhD(r6);
            }
            r8.A02 = false;
            r8.A04 = false;
            r8.A03 = false;
            r8.A00 = null;
            r8.A01 = null;
            r8.A08.A01();
            r9.A01();
            r7.A01();
            r8.A06.A01();
            this.A02 = 3;
            AnonymousClass5NI r1 = this.A0D;
            if (!(r1 == null || (r0 = this.A0A) == null)) {
                r1.A00(r0, 3);
                this.A0D = null;
            }
            AnonymousClass4P1 r03 = this.A0C;
            if (r03 != null) {
                r03.A01();
            }
            AnonymousClass5YG r04 = this.A0E;
            if (r04 != null) {
                r04.A0G();
                this.A0E = null;
            }
            this.A0B.setSystemUiVisibility(0);
            AnonymousClass560 r12 = this.A0B;
            r12.A0V = false;
            r12.A0R = false;
            r12.A0P = true;
            r12.A0C = 0;
            r12.A0D = 0;
            r12.removeAllViews();
            this.A0J = false;
            this.A0I = false;
            this.A0A = null;
            this.A0F = null;
        }
    }

    public void B2a() {
        Context context = this.A0K;
        if (!C111095hX.A02(context).isFinishing()) {
            AnonymousClass5YG r0 = this.A0E;
            if (r0 != null) {
                View A092 = r0.A09();
                ViewGroup.LayoutParams layoutParams = A092.getLayoutParams();
                layoutParams.height = -1;
                layoutParams.width = -1;
                A092.setLayoutParams(layoutParams);
                if (this.A0E instanceof C34231uR) {
                    int A022 = C86604Kt.A02(context);
                    YoutubePlayerTouchOverlay youtubePlayerTouchOverlay = ((C34231uR) this.A0E).A0G;
                    if (A022 == 2) {
                        youtubePlayerTouchOverlay.setLayoutParams(new RelativeLayout.LayoutParams(-2, -1));
                    } else {
                        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, youtubePlayerTouchOverlay.A00);
                        layoutParams2.addRule(13);
                        youtubePlayerTouchOverlay.setLayoutParams(layoutParams2);
                    }
                    youtubePlayerTouchOverlay.requestLayout();
                }
            }
            C18300x5.A13(context, this.A08, R.string.f11nameremoved);
            AnonymousClass560 r1 = this.A0B;
            r1.A0P = false;
            r1.A0V = false;
            r1.A0R = true;
            r1.A0Q = false;
            r1.A08(1.0f);
            AnonymousClass560 r4 = this.A0B;
            FrameLayout frameLayout = this.A08;
            if (!(frameLayout.getX() == 0.0f || frameLayout.getY() == 0.0f)) {
                r4.A0C = r4.A02(r4.A05);
                r4.A0D = r4.A03(r4.A02);
            }
            AnonymousClass0V0.A02(AnonymousClass001.A0Q(C111095hX.A02(context)));
            this.A08.setScaleX(1.0f);
            this.A08.setScaleY(1.0f);
            C113245l7 r12 = this.A09.A00;
            if (C105895Wv.A01(r12)) {
                r12.A0e();
            } else {
                r12.A2T();
            }
            FrameLayout frameLayout2 = this.A08;
            AnonymousClass560 r02 = this.A0B;
            Rect A0N2 = AnonymousClass001.A0N();
            Rect A0N3 = AnonymousClass001.A0N();
            Point A072 = AnonymousClass4L0.A07();
            Point A073 = AnonymousClass4L0.A07();
            frameLayout2.getGlobalVisibleRect(A0N2, A073);
            r02.getGlobalVisibleRect(A0N3, A072);
            A0N2.offset(A073.x - A0N2.left, A073.y - A0N2.top);
            A0N3.offset(-A072.x, -A072.y);
            this.A0L.set(A0N2);
            C86624Kv.A0x(frameLayout2, -1);
            A00(context, A0N2, A0N3, frameLayout2, this.A0B, this.A0C, this.A0I);
            this.A0I = true;
            AnonymousClass563 r2 = (AnonymousClass563) this.A0C;
            r2.A0N = true;
            if (r2.A0I != null) {
                r2.A0A();
            }
            if (!r2.A0O) {
                r2.A0t.setVisibility(8);
            }
            r2.A0a.setVisibility(8);
            if (r2.A0F()) {
                r2.A11.setVisibility(0);
                if (!r2.A0O) {
                    r2.A0n.setVisibility(8);
                }
            }
            if (r2.A0r.getVisibility() == 0) {
                r2.A0B();
            }
            if (!TextUtils.isEmpty(r2.A0y.getText())) {
                r2.A0c.setVisibility(0);
            }
            r2.setVideoCaption(r2.A0z.getText());
            r2.A0C();
            r2.A0D();
            r2.A09();
            r2.A03();
            r2.A07();
            this.A0B.requestLayout();
            FrameLayout frameLayout3 = this.A08;
            if (frameLayout3 instanceof C138336qA) {
                ((C138336qA) frameLayout3).setIsFullscreen(this.A0I);
            }
        }
    }

    public void B2u(boolean z) {
        AnonymousClass5YG r0 = this.A0E;
        if (r0 != null) {
            View A092 = r0.A09();
            ViewGroup.LayoutParams layoutParams = A092.getLayoutParams();
            layoutParams.height = this.A05;
            layoutParams.width = -1;
            A092.setLayoutParams(layoutParams);
            AnonymousClass5YG r1 = this.A0E;
            if (r1 instanceof C34231uR) {
                YoutubePlayerTouchOverlay youtubePlayerTouchOverlay = ((C34231uR) r1).A0G;
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, youtubePlayerTouchOverlay.A00);
                layoutParams2.addRule(13);
                youtubePlayerTouchOverlay.setLayoutParams(layoutParams2);
                youtubePlayerTouchOverlay.requestLayout();
            }
        }
        FrameLayout frameLayout = this.A08;
        Context context = this.A0K;
        C18300x5.A13(context, frameLayout, R.string.f11nameremoved);
        AnonymousClass560 r12 = this.A0B;
        boolean z2 = true;
        r12.A0P = true;
        r12.A0V = false;
        r12.A08(r12.A00);
        if (z || this.A03 != this.A01) {
            C86624Kv.A10(this.A08, this.A07, this.A04);
        } else {
            FrameLayout frameLayout2 = this.A08;
            AnonymousClass560 r02 = this.A0B;
            Rect A0N2 = AnonymousClass001.A0N();
            Rect A0N3 = AnonymousClass001.A0N();
            Point A072 = AnonymousClass4L0.A07();
            r02.getGlobalVisibleRect(A0N2, A072);
            A0N2.offset(-A072.x, -A072.y);
            A0N3.set(this.A0L);
            C86624Kv.A10(frameLayout2, this.A07, this.A04);
            A00(context, A0N2, A0N3, frameLayout2, this.A0B, this.A0C, this.A0I);
        }
        this.A0I = false;
        AnonymousClass563 r2 = (AnonymousClass563) this.A0C;
        r2.A0N = false;
        r2.A0b.setVisibility(8);
        r2.A0p.setVisibility(8);
        r2.A0s.setVisibility(8);
        r2.A0t.setVisibility(0);
        if (!r2.A0O) {
            r2.A0a.setVisibility(0);
        }
        if (r2.A0F() && !r2.A0O) {
            r2.A11.setVisibility(8);
            r2.A0n.setVisibility(0);
        }
        if (r2.A0r.getVisibility() == 0) {
            r2.A0B();
        }
        r2.A0c.setVisibility(8);
        r2.A0z.setVisibility(8);
        r2.A0C();
        r2.A0D();
        r2.A09();
        r2.A07();
        this.A0C.setSystemUiVisibility(0);
        AnonymousClass560 r22 = this.A0B;
        r22.A0Q = true;
        if (this.A03 != this.A01) {
            z2 = false;
        }
        r22.A0A(z2);
        this.A0B.A0R = false;
        AnonymousClass0V0.A02(AnonymousClass001.A0Q(C111095hX.A02(context)));
        this.A03 = this.A01;
        FrameLayout frameLayout3 = this.A08;
        if (frameLayout3 instanceof C138336qA) {
            ((C138336qA) frameLayout3).setIsFullscreen(this.A0I);
        }
    }

    public void B36(C66513Ls r18, C624134x r19, AnonymousClass2z0 r20, AnonymousClass5NI r21, String str, String str2, Bitmap[] bitmapArr, int i) {
        AnonymousClass2z0 r4 = r20;
        String str3 = str2;
        int i2 = i;
        if (this.A0A != r4) {
            Az5();
            this.A0A = r4;
            this.A0F = str3;
            this.A0D = r21;
            this.A06 = i2;
        }
        if (i2 != 3) {
            str = str3;
        }
        String obj = C18290x4.A0H(Uri.parse(str).buildUpon(), "wa_logging_event", "video_play_open").toString();
        C69263Wi r9 = this.A0P;
        AnonymousClass4FS r14 = this.A0Y;
        C620733j r11 = this.A0U;
        AnonymousClass1VX r12 = this.A0V;
        C624134x r5 = r19;
        Bitmap[] bitmapArr2 = bitmapArr;
        if (i2 != 4) {
            C66513Ls A002 = C57782uC.A00(obj);
            if (A002 == null) {
                try {
                    AnonymousClass5NI r1 = this.A0D;
                    if (r1 != null) {
                        r1.A00(r4, 1);
                        this.A02 = 1;
                    }
                    C57772uB.A00(r9, r18, r11, r12, new AnonymousClass8HK(r5, r4, this, bitmapArr2), r14, obj, false);
                } catch (Exception unused) {
                    A03("InlineVideoPlaybackImplHandler/fetchPageInfo - loadPage failed", true);
                }
            } else if (r20 != null) {
                int i3 = i2;
                Bitmap[] bitmapArr3 = bitmapArr2;
                C66513Ls r3 = A002;
                A02(r3, A002.A0A, r5, r4, bitmapArr3, i3);
            }
        } else if (r20 != null && str2 != null) {
            A02((C66513Ls) null, new C135286kQ(str3, -1, -1), r5, r4, bitmapArr2, 4);
        }
    }

    public int B6P() {
        return this.A02;
    }

    public AnonymousClass2z0 B6Q() {
        return this.A0A;
    }

    public boolean B8M() {
        return this.A0I;
    }

    public boolean B8N() {
        return this.A0J;
    }

    public void BgY() {
        AnonymousClass5YG r0 = this.A0E;
        if (r0 != null && r0.A0a()) {
            this.A0C.A00();
        }
    }

    public void Bq3(C147247Dj r6, AnonymousClass560 r7, int i) {
        this.A0B = r7;
        this.A09 = r6;
        Context context = this.A0K;
        int dimensionPixelSize = i - (context.getResources().getDimensionPixelSize(R.dimen.f6nameremoved) * 2);
        this.A00 = (((double) (dimensionPixelSize * dimensionPixelSize)) * 9.0d) / 16.0d;
        AnonymousClass560 r3 = this.A0B;
        int[] viewIdsToIgnoreScaling = AnonymousClass4P1.getViewIdsToIgnoreScaling();
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
        r3.A0Y = viewIdsToIgnoreScaling;
        r3.A08 = dimensionPixelSize2;
    }

    public C116505qO(Context context, C111095hX r3, C55682qk r4, AnonymousClass5DB r5, C69263Wi r6, Mp4Ops mp4Ops, C153407bG r8, C620633i r9, C54292oU r10, C620733j r11, AnonymousClass1VX r12, AnonymousClass4FV r13, C106685Zz r14, C54882pR r15, AnonymousClass4FS r16, C183538qC r17) {
        this.A0T = r10;
        this.A0K = context;
        this.A0Q = mp4Ops;
        this.A0V = r12;
        this.A0P = r6;
        this.A0N = r4;
        this.A0Y = r16;
        this.A0W = r14;
        this.A0M = r3;
        this.A0S = r9;
        this.A0U = r11;
        this.A0R = r8;
        this.A0X = r15;
        this.A0Z = new C150197Pr(r13);
        this.A0O = r5;
        this.A0a = r17;
    }

    public void A03(String str, boolean z) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("InlineVideoPlaybackImplHandler/onPlaybackError=");
        A0o.append(str);
        Log.e(AnonymousClass000.A0b(" isTransient=", A0o, z));
        A01();
    }

    public void Bm5(int i) {
        this.A01 = i;
    }

    public void BmL(AnonymousClass5NI r1) {
        this.A0D = r1;
    }

    public void Bmk(int i) {
        this.A03 = i;
    }

    /* JADX WARNING: type inference failed for: r5v8, types: [X.5YG] */
    /* JADX WARNING: type inference failed for: r5v21 */
    /* JADX WARNING: type inference failed for: r16v6, types: [X.567] */
    /* JADX WARNING: type inference failed for: r14v9, types: [X.1uR] */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0008: MOVE  (r11v0 X.2z0) = (r30v0 X.2z0)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:122)
        	at jadx.core.dex.visitors.regions.TernaryMod.visitRegion(TernaryMod.java:34)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:73)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:31)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    public void A02(X.C66513Ls r27, X.C135286kQ r28, X.C624134x r29, X.AnonymousClass2z0 r30, android.graphics.Bitmap[] r31, int r32) {
        /*
            r26 = this;
            r4 = r26
            X.5YG r0 = r4.A0E
            if (r0 != 0) goto L_0x03c2
            X.2z0 r0 = r4.A0A
            r11 = r30
            if (r11 != r0) goto L_0x03c2
            r0 = 2
            r5 = r32
            if (r5 == r0) goto L_0x0018
            r0 = 5
            if (r5 == r0) goto L_0x0018
            r0 = 3
            r14 = 0
            if (r5 != r0) goto L_0x0019
        L_0x0018:
            r14 = 1
        L_0x0019:
            r9 = 0
            r8 = r27
            if (r27 == 0) goto L_0x0045
            if (r14 == 0) goto L_0x0045
            java.lang.String r6 = r8.A0H
            java.lang.String r3 = r8.A0I
            if (r6 == 0) goto L_0x003d
            if (r3 == 0) goto L_0x003d
            X.33j r0 = r4.A0U
            boolean r2 = X.C102805Ki.A00(r0)
            java.lang.String r1 = " - "
            java.lang.StringBuilder r0 = X.AnonymousClass001.A0o()
            if (r2 == 0) goto L_0x0056
            X.AnonymousClass001.A1K(r3, r1, r6, r0)
        L_0x0039:
            java.lang.String r9 = r0.toString()
        L_0x003d:
            java.net.URL r0 = r8.A0N
            r4.A0H = r0
            java.net.URL r0 = r8.A0L
            r4.A0G = r0
        L_0x0045:
            r6 = r28
            if (r28 != 0) goto L_0x0065
            java.lang.String r0 = "InlineVideoPlaybackImplHandler/startInlinePlayback - loadPage returned null.  Opening video externally"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r0 = r4.A0F
            X.8Tk r1 = X.C57782uC.A00
            monitor-enter(r1)
            if (r0 == 0) goto L_0x005d
            goto L_0x005a
        L_0x0056:
            X.AnonymousClass001.A1K(r6, r1, r3, r0)
            goto L_0x0039
        L_0x005a:
            r1.remove(r0)     // Catch:{ all -> 0x0062 }
        L_0x005d:
            monitor-exit(r1)     // Catch:{ all -> 0x0062 }
            r4.A01()
            return
        L_0x0062:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0062 }
            throw r0
        L_0x0065:
            X.7Pr r7 = r4.A0Z
            X.5Ta r0 = r7.A07
            r0.A02()
            X.5Ta r0 = r7.A08
            r0.A02()
            X.4FS r13 = r4.A0Y
            X.2pR r2 = r4.A0X
            java.util.Objects.requireNonNull(r2)
            r1 = 40
            X.5rN r0 = new X.5rN
            r0.<init>(r2, r1)
            r13.BkM(r0)
            X.5NI r1 = r4.A0D
            if (r1 == 0) goto L_0x008c
            r0 = 2
            r1.A00(r11, r0)
            r4.A02 = r0
        L_0x008c:
            int r1 = r6.A00
            r10 = -1
            if (r1 == r10) goto L_0x03a7
            int r0 = r6.A01
            if (r0 == r10) goto L_0x03a7
            double r2 = (double) r0
            double r0 = (double) r1
            double r2 = r2 / r0
        L_0x0098:
            double r0 = r4.A00
            double r0 = r0 / r2
            double r0 = java.lang.Math.sqrt(r0)
            int r12 = (int) r0
            r4.A05 = r12
            double r0 = (double) r12
            double r0 = r0 * r2
            int r2 = (int) r0
            r4.A07 = r2
            r4.A04 = r12
            android.content.Context r1 = r4.A0K
            android.content.res.Resources r2 = r1.getResources()
            r0 = 2131166768(0x7f070630, float:1.794779E38)
            int r2 = r2.getDimensionPixelSize(r0)
            int r0 = r4.A04
            int r0 = r0 + r2
            r4.A04 = r0
            android.content.res.Resources r2 = r1.getResources()
            r0 = 2131166769(0x7f070631, float:1.7947793E38)
            int r0 = X.AnonymousClass4L0.A01(r2, r0)
            X.6qA r2 = new X.6qA
            r2.<init>(r1, r0)
            r4.A08 = r2
            boolean r0 = r4.A0I
            r2.setIsFullscreen(r0)
            r0 = 2131890197(0x7f121015, float:1.941508E38)
            X.C18300x5.A13(r1, r2, r0)
            android.widget.FrameLayout r0 = r4.A08
            r3 = 1
            r0.setFocusable(r3)
            android.widget.FrameLayout r0 = r4.A08
            r0.setImportantForAccessibility(r3)
            android.widget.FrameLayout r0 = r4.A08
            r0.setFocusableInTouchMode(r3)
            X.560 r2 = r4.A0B
            X.8Jx r0 = new X.8Jx
            r0.<init>(r4)
            r2.A0K = r0
            r4.A0J = r3
            android.widget.FrameLayout r2 = r4.A08
            r0 = 1086324736(0x40c00000, float:6.0)
            X.AnonymousClass0YZ.A0B(r2, r0)
            android.widget.FrameLayout r0 = new android.widget.FrameLayout
            r0.<init>(r1)
            android.widget.FrameLayout r2 = r4.A08
            r2.addView(r0)
            X.563 r2 = new X.563
            r2.<init>(r1, r7, r5)
            r4.A0C = r2
            r2 = 0
            r3 = r31[r2]
            if (r3 == 0) goto L_0x0128
            X.1VX r7 = r4.A0V
            r3 = 1052(0x41c, float:1.474E-42)
            boolean r3 = r7.A0X(r3)
            if (r3 != 0) goto L_0x0128
            X.4P1 r7 = r4.A0C
            r3 = 2131427866(0x7f0b021a, float:1.847736E38)
            android.widget.ImageView r7 = X.AnonymousClass0x9.A0E(r7, r3)
            r3 = r31[r2]
            r7.setImageBitmap(r3)
        L_0x0128:
            if (r9 == 0) goto L_0x0146
            X.1VX r7 = r4.A0V
            r3 = 1912(0x778, float:2.679E-42)
            boolean r3 = r7.A0X(r3)
            if (r3 == 0) goto L_0x0146
            X.4P1 r3 = r4.A0C
            X.563 r3 = (X.AnonymousClass563) r3
            r3.setVideoAttribution(r9)
            X.4P1 r9 = r4.A0C
            r7 = 1
            X.69L r3 = new X.69L
            r3.<init>(r4, r7)
            r9.setMusicAttributionClickListener(r3)
        L_0x0146:
            if (r14 == 0) goto L_0x017b
            if (r27 == 0) goto L_0x017b
            java.lang.String r7 = r8.A0F
            java.lang.String r9 = r8.A0C
            boolean r3 = android.text.TextUtils.isEmpty(r7)
            if (r3 == 0) goto L_0x015a
            boolean r3 = android.text.TextUtils.isEmpty(r9)
            if (r3 != 0) goto L_0x017b
        L_0x015a:
            X.1VX r12 = r4.A0V
            r3 = 2299(0x8fb, float:3.222E-42)
            boolean r3 = r12.A0X(r3)
            if (r3 == 0) goto L_0x017b
            X.4P1 r3 = r4.A0C
            X.563 r3 = (X.AnonymousClass563) r3
            r3.setVideoCaption(r7)
            X.4P1 r7 = r4.A0C
            X.563 r7 = (X.AnonymousClass563) r7
            X.69L r3 = new X.69L
            r3.<init>(r4, r2)
            r7.setAuthorInformation(r9, r3)
            r3 = 3
            X.C86624Kv.A1N(r13, r4, r8, r3)
        L_0x017b:
            X.4P1 r7 = r4.A0C
            X.90u r3 = new X.90u
            r3.<init>(r4, r2)
            r7.setCloseButtonListener(r3)
            X.4P1 r14 = r4.A0C
            r3 = 1
            X.90u r7 = new X.90u
            r7.<init>(r4, r3)
            X.563 r14 = (X.AnonymousClass563) r14
            r14.A0G = r7
            boolean r7 = r14.A0F()
            r9 = 8
            if (r7 == 0) goto L_0x039b
            android.widget.ImageButton r12 = r14.A0n
            int r7 = X.AnonymousClass35G.A00(r5)
            r12.setImageResource(r7)
            r7 = 41
            X.C109395eY.A00(r12, r14, r7)
            com.whatsapp.wds.components.button.WDSButton r8 = r14.A11
            switch(r32) {
                case 1: goto L_0x0378;
                case 2: goto L_0x037d;
                case 3: goto L_0x0382;
                case 4: goto L_0x0387;
                case 5: goto L_0x037d;
                case 6: goto L_0x038c;
                case 7: goto L_0x0391;
                case 8: goto L_0x0396;
                default: goto L_0x01ac;
            }
        L_0x01ac:
            r7 = -1
        L_0x01ad:
            r8.setIcon((int) r7)
            r7 = 42
            X.C109395eY.A00(r8, r14, r7)
            boolean r7 = r14.A0N
            if (r7 == 0) goto L_0x0370
            r8.setVisibility(r2)
            r12.setVisibility(r9)
        L_0x01bf:
            X.4P1 r9 = r4.A0C
            r8 = 2
            X.90u r7 = new X.90u
            r7.<init>(r4, r8)
            r9.setFullscreenButtonClickListener(r7)
            X.4P1 r7 = r4.A0C
            r0.addView(r7)
            android.widget.FrameLayout r8 = r4.A08
            X.7zL r7 = new X.7zL
            r7.<init>(r4)
            r8.setOnHoverListener(r7)
            android.widget.FrameLayout r8 = r4.A08
            r7 = 43
            X.C109395eY.A00(r8, r4, r7)
            X.560 r14 = r4.A0B
            android.widget.FrameLayout r15 = r4.A08
            X.5NI r8 = r4.A0D
            X.34x r7 = r8.A00
            boolean r7 = X.C86664Kz.A1X(r7, r11)
            if (r7 == 0) goto L_0x036d
            X.8y4 r7 = r8.A01
            com.whatsapp.webpagepreview.WebPagePreviewView r7 = (com.whatsapp.webpagepreview.WebPagePreviewView) r7
            android.widget.FrameLayout r9 = r7.A09
        L_0x01f4:
            int r8 = r4.A07
            int r7 = r4.A04
            r17 = r8
            r18 = r7
            r16 = r9
            r19 = r8
            r20 = r7
            r14.A09(r15, r16, r17, r18, r19, r20)
            java.lang.String r15 = r6.A02
            r6 = 4
            if (r5 != r6) goto L_0x02e8
            r7 = r31[r2]
            int r6 = r4.A07
            int r5 = r4.A05
            if (r7 == 0) goto L_0x02d1
            android.graphics.Bitmap r16 = android.graphics.Bitmap.createScaledBitmap(r7, r6, r5, r2)
        L_0x0216:
            X.5DB r5 = r4.A0O
            X.4P1 r9 = r4.A0C
            X.563 r9 = (X.AnonymousClass563) r9
            int r12 = r4.A05
            X.5sx r6 = r5.A00
            X.4as r5 = r6.A01
            android.app.Activity r8 = r5.A4W
            X.3Db r5 = r6.A03
            X.3Wi r18 = X.C64333Db.A04(r5)
            X.5Zz r19 = X.C86634Kw.A0m(r5)
            X.5hX r17 = X.C64333Db.A00(r5)
            X.4C1 r6 = r5.A72
            java.lang.Object r7 = r6.get()
            X.2WW r7 = (X.AnonymousClass2WW) r7
            X.5bk r5 = r5.A00
            X.4C1 r5 = r5.A2v
            java.lang.Object r6 = r5.get()
            X.2y0 r6 = (X.C60102y0) r6
            X.1uR r5 = new X.1uR
            r22 = r29
            r21 = r6
            r23 = r9
            r24 = r15
            r25 = r12
            r20 = r7
            r14 = r5
            r15 = r8
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
        L_0x0257:
            r4.A0E = r5
            android.view.View r5 = r5.A09()
            r0.addView(r5, r2)
            r0.setClipChildren(r2)
            X.4P1 r5 = r4.A0C
            r5.setClipChildren(r2)
            X.5YG r2 = r4.A0E
            android.view.View r6 = r2.A09()
            android.view.ViewGroup$LayoutParams r5 = r6.getLayoutParams()
            int r2 = r4.A05
            r5.height = r2
            r5.width = r10
            r6.setLayoutParams(r5)
            android.content.res.Resources r5 = r1.getResources()
            r2 = 2131102847(0x7f060c7f, float:1.7818143E38)
            X.C86624Kv.A0l(r5, r0, r2)
            X.5YG r0 = r4.A0E
            android.view.View r2 = r0.A09()
            android.content.res.Resources r1 = r1.getResources()
            r0 = 2131099845(0x7f0600c5, float:1.7812055E38)
            X.C86624Kv.A0l(r1, r2, r0)
            X.5YG r1 = r4.A0E
            X.91i r0 = new X.91i
            r0.<init>(r4, r3)
            r1.A08 = r0
            X.5qT r0 = new X.5qT
            r0.<init>(r11, r4)
            r1.A09 = r0
            X.4P1 r0 = r4.A0C
            r0.setPlayer(r1)
            X.4P1 r2 = r4.A0C
            X.563 r2 = (X.AnonymousClass563) r2
            android.widget.ImageButton r1 = r2.A0o
            r0 = 4
            r1.setVisibility(r0)
            android.widget.ImageButton r1 = r2.A0p
            r0 = 8
            r1.setVisibility(r0)
            X.560 r1 = r4.A0B
            X.4P1 r0 = r4.A0C
            r1.setControlView(r0)
            X.5YG r0 = r4.A0E
            r0.A0F()
            X.560 r1 = r4.A0B
            X.8Jz r0 = new X.8Jz
            r0.<init>(r4)
            r1.A0M = r0
            return
        L_0x02d1:
            android.graphics.Bitmap r16 = X.C86664Kz.A0Y(r6, r5)
            android.graphics.Canvas r7 = X.AnonymousClass4L0.A06(r16)
            r6 = 2130970370(0x7f040702, float:1.7549448E38)
            r5 = 2131102224(0x7f060a10, float:1.781688E38)
            int r5 = X.C18300x5.A03(r1, r6, r5)
            r7.drawColor(r5)
            goto L_0x0216
        L_0x02e8:
            X.1VX r14 = r4.A0V
            r5 = 5516(0x158c, float:7.73E-42)
            boolean r5 = r14.A0X(r5)
            if (r5 == 0) goto L_0x0349
            X.3Wi r14 = r4.A0P
            X.33i r9 = r4.A0S
            android.app.Activity r17 = X.C111095hX.A02(r1)
            X.2oU r8 = r4.A0T
            com.whatsapp.Mp4Ops r12 = r4.A0Q
            X.2qk r7 = r4.A0N
            X.7bG r5 = r4.A0R
            r6 = 2131895665(0x7f122571, float:1.942617E38)
            java.lang.String r6 = r1.getString(r6)
            java.lang.String r23 = X.C162387ry.A07(r1, r6)
            X.6qP r6 = new X.6qP
            r18 = r6
            r19 = r7
            r20 = r12
            r21 = r5
            r22 = r8
            r18.<init>(r19, r20, r21, r22, r23)
            r12 = 0
            X.8qC r5 = r4.A0a
            java.lang.Object r7 = r5.get()
            X.5NV r7 = (X.AnonymousClass5NV) r7
            X.567 r5 = new X.567
            r25 = r2
            r16 = r5
            r18 = r14
            r19 = r9
            r20 = r8
            r21 = r7
            r22 = r13
            r23 = r12
            r24 = r2
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25)
            X.AnonymousClass567.A01(r5, r6)
            android.net.Uri r6 = android.net.Uri.parse(r15)
            r5.A03 = r6
            r5.A04 = r12
            goto L_0x0257
        L_0x0349:
            X.3Wi r12 = r4.A0P
            X.33i r9 = r4.A0S
            X.2oU r8 = r4.A0T
            com.whatsapp.Mp4Ops r7 = r4.A0Q
            X.2qk r6 = r4.A0N
            X.7bG r5 = r4.A0R
            r16 = r1
            r17 = r6
            r18 = r12
            r19 = r7
            r20 = r5
            r21 = r9
            r22 = r8
            r23 = r14
            r24 = r15
            X.5YG r5 = X.AnonymousClass5VT.A00(r16, r17, r18, r19, r20, r21, r22, r23, r24)
            goto L_0x0257
        L_0x036d:
            r9 = 0
            goto L_0x01f4
        L_0x0370:
            r8.setVisibility(r9)
            r12.setVisibility(r2)
            goto L_0x01bf
        L_0x0378:
            r7 = 2131232530(0x7f080712, float:1.8081172E38)
            goto L_0x01ad
        L_0x037d:
            r7 = 2131232514(0x7f080702, float:1.808114E38)
            goto L_0x01ad
        L_0x0382:
            r7 = 2131232519(0x7f080707, float:1.808115E38)
            goto L_0x01ad
        L_0x0387:
            r7 = 2131232531(0x7f080713, float:1.8081174E38)
            goto L_0x01ad
        L_0x038c:
            r7 = 2131232520(0x7f080708, float:1.8081152E38)
            goto L_0x01ad
        L_0x0391:
            r7 = 2131232521(0x7f080709, float:1.8081154E38)
            goto L_0x01ad
        L_0x0396:
            r7 = 2131232529(0x7f080711, float:1.808117E38)
            goto L_0x01ad
        L_0x039b:
            com.whatsapp.wds.components.button.WDSButton r7 = r14.A11
            r7.setVisibility(r9)
            android.widget.ImageButton r7 = r14.A0n
            r7.setVisibility(r9)
            goto L_0x01bf
        L_0x03a7:
            r0 = 4
            if (r5 != r0) goto L_0x03bb
            java.lang.String r1 = r6.A02
            java.lang.String r0 = "/shorts/"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x03bb
            r2 = 4603237813974170650(0x3fe1fc671e937c1a, double:0.5620608899297423)
            goto L_0x0098
        L_0x03bb:
            r2 = 4610685218510194460(0x3ffc71c71c71c71c, double:1.7777777777777777)
            goto L_0x0098
        L_0x03c2:
            java.lang.String r0 = "InlineVideoPlaybackImplHandler/startInlinePlayback squashed, incorrect rowKey"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C116505qO.A02(X.3Ls, X.6kQ, X.34x, X.2z0, android.graphics.Bitmap[], int):void");
    }
}
