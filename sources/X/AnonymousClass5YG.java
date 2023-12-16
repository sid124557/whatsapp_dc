package X;

import android.app.Activity;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.whatsapp.mediacomposer.VideoComposerFragment;
import com.whatsapp.util.Log;
import com.whatsapp.videoplayback.HeroPlaybackControlView;
import java.io.File;

/* renamed from: X.5YG  reason: invalid class name */
public abstract class AnonymousClass5YG {
    public int A00 = Integer.MAX_VALUE;
    public int A01 = 5;
    public Activity A02;
    public AudioManager.OnAudioFocusChangeListener A03;
    public Pair A04 = null;
    public C620633i A05;
    public C183308pp A06;
    public C183318pq A07;
    public C183328pr A08;
    public C183338ps A09;
    public C183348pt A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: X.6qG} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: X.567} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v2, resolved type: X.6qG} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: X.6qG} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass5YG A02(android.content.Context r12, X.C69263Wi r13, X.C620633i r14, X.C54292oU r15, X.AnonymousClass1VX r16, X.AnonymousClass5NV r17, X.AnonymousClass4FS r18, X.C153387bE r19, java.io.File r20, boolean r21, boolean r22, boolean r23, boolean r24) {
        /*
            r3 = r12
            r2 = r21
            r12 = r23
            if (r22 == 0) goto L_0x005d
            r11 = 0
            r1 = r16
            X.C162457s7.A0J(r1, r11)
            r0 = 2917(0xb65, float:4.088E-42)
            java.lang.String r0 = r1.A0Q(r0)
            boolean r0 = X.C107535bT.A0C(r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x005d
            r5 = r13
            r6 = r14
            r10 = r19
            if (r24 == 0) goto L_0x0041
            r8 = r17
            X.C626936e.A06(r8)
            android.app.Activity r4 = X.C111095hX.A02(r3)
            X.567 r3 = new X.567
            r7 = r15
            r9 = r18
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            android.net.Uri r0 = android.net.Uri.fromFile(r20)
            r3.A03 = r0
        L_0x0038:
            r3.A0C = r2
            r3.A0J()
            r0 = 1
            r3.A0B = r0
            return r3
        L_0x0041:
            android.app.Activity r14 = X.C111095hX.A02(r3)
            android.net.Uri r0 = android.net.Uri.fromFile(r20)
            r18 = 0
            r20 = 0
            X.6qG r3 = new X.6qG
            r13 = r3
            r15 = r5
            r16 = r6
            r21 = r12
            r17 = r1
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21)
            r3.A04 = r0
            goto L_0x0038
        L_0x005d:
            java.lang.String r0 = "VideoPlayer/createSystemVideoPlayer"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            java.lang.String r1 = r20.getAbsolutePath()
            if (r23 != 0) goto L_0x006e
            X.6qF r0 = new X.6qF
            r0.<init>(r3, r1, r2)
            return r0
        L_0x006e:
            X.6qE r0 = new X.6qE
            r0.<init>(r3, r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5YG.A02(android.content.Context, X.3Wi, X.33i, X.2oU, X.1VX, X.5NV, X.4FS, X.7bE, java.io.File, boolean, boolean, boolean, boolean):X.5YG");
    }

    public static void A04(VideoComposerFragment videoComposerFragment) {
        if (videoComposerFragment.A0W.A0a()) {
            videoComposerFragment.A1T();
        }
    }

    public int A05() {
        long A002;
        if (this instanceof AnonymousClass567) {
            C162997t6 r0 = ((AnonymousClass567) this).A05;
            if (r0 == null) {
                return 0;
            }
            A002 = r0.A02();
        } else if (this instanceof AnonymousClass565) {
            throw AnonymousClass002.A0G("not implemented yet");
        } else if (this instanceof AnonymousClass564) {
            C104835Sn r02 = ((AnonymousClass564) this).A00;
            if (r02 == null) {
                throw C18270x1.A0S("staticContentPlayer");
            }
            A002 = r02.A00();
        } else {
            AnonymousClass7ND r03 = ((AnonymousClass566) this).A00.A05;
            if (r03 != null) {
                return r03.A03.A05();
            }
            return 0;
        }
        return (int) A002;
    }

    public int A06() {
        long j;
        if (this instanceof AnonymousClass567) {
            C162997t6 r0 = ((AnonymousClass567) this).A05;
            if (r0 == null) {
                return 0;
            }
            j = r0.A03();
        } else if (this instanceof AnonymousClass565) {
            return ((AnonymousClass565) this).A03.A01.getDuration();
        } else {
            if (this instanceof AnonymousClass564) {
                C104835Sn r02 = ((AnonymousClass564) this).A00;
                if (r02 == null) {
                    throw C18270x1.A0S("staticContentPlayer");
                }
                j = r02.A00;
            } else {
                AnonymousClass7ND r03 = ((AnonymousClass566) this).A00.A05;
                if (r03 != null) {
                    return r03.A03.A06();
                }
                return 0;
            }
        }
        return (int) j;
    }

    public /* synthetic */ int A07() {
        if (this instanceof AnonymousClass567) {
            C162997t6 r0 = ((AnonymousClass567) this).A05;
            C626936e.A06(r0);
            return r0.A01();
        } else if (this instanceof AnonymousClass566) {
            return ((AnonymousClass566) this).A00.A01();
        } else {
            return 0;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005b, code lost:
        if (r0 != null) goto L_0x005d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Bitmap A08() {
        /*
            r6 = this;
            boolean r0 = r6 instanceof X.AnonymousClass567
            if (r0 == 0) goto L_0x001a
            r1 = r6
            X.567 r1 = (X.AnonymousClass567) r1
            boolean r0 = r1.A0P
            if (r0 != 0) goto L_0x0088
            X.7t6 r0 = r1.A05
            if (r0 == 0) goto L_0x0088
            boolean r0 = r1.A0O
            if (r0 == 0) goto L_0x0088
            X.6qM r0 = r1.A0U
            android.graphics.Bitmap r0 = r0.getCurrentFrame()
            return r0
        L_0x001a:
            boolean r0 = r6 instanceof X.AnonymousClass565
            if (r0 == 0) goto L_0x0074
            r5 = r6
            X.565 r5 = (X.AnonymousClass565) r5
            X.6D4 r0 = r5.A01
            android.graphics.drawable.Drawable r4 = r0.getCurrent()
            X.C162457s7.A0D(r4)
            boolean r0 = r4 instanceof android.graphics.drawable.BitmapDrawable
            if (r0 == 0) goto L_0x0035
            android.graphics.drawable.BitmapDrawable r4 = (android.graphics.drawable.BitmapDrawable) r4
            android.graphics.Bitmap r0 = r4.getBitmap()
            return r0
        L_0x0035:
            android.graphics.Bitmap r0 = r5.A00
            r3 = 0
            if (r0 == 0) goto L_0x0072
            boolean r1 = r0.isRecycled()
        L_0x003e:
            android.graphics.Bitmap r0 = r5.A00
            if (r0 == 0) goto L_0x0044
            if (r1 == 0) goto L_0x005d
        L_0x0044:
            int r0 = r4.getIntrinsicWidth()
            r2 = 1
            int r1 = java.lang.Math.max(r0, r2)
            int r0 = r4.getIntrinsicHeight()
            int r0 = java.lang.Math.max(r0, r2)
            android.graphics.Bitmap r0 = X.C86664Kz.A0Y(r1, r0)
            r5.A00 = r0
            if (r0 == 0) goto L_0x006f
        L_0x005d:
            android.graphics.Canvas r0 = X.AnonymousClass4L0.A06(r0)
            r4.draw(r0)
            int r1 = r0.getWidth()
            int r0 = r0.getHeight()
            r4.setBounds(r3, r3, r1, r0)
        L_0x006f:
            android.graphics.Bitmap r0 = r5.A00
            return r0
        L_0x0072:
            r1 = 0
            goto L_0x003e
        L_0x0074:
            boolean r0 = r6 instanceof X.AnonymousClass564
            if (r0 != 0) goto L_0x0088
            r0 = r6
            X.566 r0 = (X.AnonymousClass566) r0
            X.5Xh r0 = r0.A00
            X.7ND r0 = r0.A05
            if (r0 == 0) goto L_0x0088
            X.5YG r0 = r0.A03
            android.graphics.Bitmap r0 = r0.A08()
            return r0
        L_0x0088:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5YG.A08():android.graphics.Bitmap");
    }

    public View A09() {
        if (this instanceof AnonymousClass567) {
            return ((AnonymousClass567) this).A0U;
        }
        if (this instanceof AnonymousClass565) {
            return ((AnonymousClass565) this).A02;
        }
        if (this instanceof AnonymousClass564) {
            return ((AnonymousClass564) this).A02;
        }
        return ((AnonymousClass566) this).A03;
    }

    public /* synthetic */ AnonymousClass561 A0A() {
        if (this instanceof AnonymousClass567) {
            return ((AnonymousClass567) this).A0D;
        }
        return null;
    }

    public void A0B() {
        if (!this.A0B) {
            C620633i r0 = this.A05;
            C626936e.A06(r0);
            AudioManager A0G = r0.A0G();
            if (A0G != null) {
                AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = this.A03;
                if (onAudioFocusChangeListener == null) {
                    onAudioFocusChangeListener = new AnonymousClass91A(1);
                    this.A03 = onAudioFocusChangeListener;
                }
                A0G.abandonAudioFocus(onAudioFocusChangeListener);
            }
        }
    }

    public void A0C() {
        if (this instanceof AnonymousClass567) {
            AnonymousClass567 r1 = (AnonymousClass567) this;
            C162997t6 r0 = r1.A05;
            if (r0 != null) {
                r0.A06();
                r1.A0I = false;
            }
        } else if (this instanceof AnonymousClass565) {
            ((AnonymousClass565) this).A01.stop();
        } else if (this instanceof AnonymousClass564) {
            AnonymousClass564 r12 = (AnonymousClass564) this;
            C104835Sn r02 = r12.A00;
            if (r02 == null) {
                throw C18270x1.A0S("staticContentPlayer");
            }
            r02.A02();
            r12.A01.removeMessages(0);
        } else {
            AnonymousClass566 r4 = (AnonymousClass566) this;
            C106015Xh r2 = r4.A00;
            AnonymousClass566.A00(r4, r2.A03, r2, r2.A02, false);
        }
    }

    public void A0D() {
        if (this instanceof AnonymousClass567) {
            AnonymousClass567 r2 = (AnonymousClass567) this;
            try {
                C153387bE r1 = r2.A0B;
                if (r1 != null) {
                    r1.A00 = r2.A01;
                    r1.A03(r2.A01);
                }
            } catch (Exception unused) {
                Log.d("Failed to post field stats from wa hero");
            }
        }
    }

    public void A0E() {
        if (!this.A0B) {
            C620633i r0 = this.A05;
            C626936e.A06(r0);
            AudioManager A0G = r0.A0G();
            if (A0G != null) {
                AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = this.A03;
                if (onAudioFocusChangeListener == null) {
                    onAudioFocusChangeListener = new AnonymousClass91A(1);
                    this.A03 = onAudioFocusChangeListener;
                }
                A0G.requestAudioFocus(onAudioFocusChangeListener, 3, 2);
            }
        }
    }

    public void A0F() {
        if (this instanceof AnonymousClass567) {
            AnonymousClass567 r3 = (AnonymousClass567) this;
            r3.A0I = true;
            if (r3.A05 != null) {
                r3.A0E();
                r3.A05.A07();
                C162997t6 r2 = r3.A05;
                float f = 1.0f;
                if (r3.A0M) {
                    f = 0.0f;
                }
                r2.A0B(f);
                return;
            }
            r3.A0Q = true;
            r3.A0J();
        } else if (this instanceof AnonymousClass565) {
            ((AnonymousClass565) this).A01.start();
        } else if (this instanceof AnonymousClass564) {
            AnonymousClass564 r4 = (AnonymousClass564) this;
            C104835Sn r0 = r4.A00;
            if (r0 == null) {
                throw C18270x1.A0S("staticContentPlayer");
            }
            r0.A01();
            Handler handler = r4.A01;
            handler.removeMessages(0);
            handler.sendEmptyMessageDelayed(0, (long) (r4.A06() - r4.A05()));
        } else {
            AnonymousClass566 r42 = (AnonymousClass566) this;
            if (r42.A00.A01() == 4) {
                r42.A0P(0);
            }
            r42.A0f();
            C106015Xh r22 = r42.A00;
            AnonymousClass566.A00(r42, r22.A03, r22, r22.A02, true);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001d, code lost:
        if (r2.A0D.A08 != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0G() {
        /*
            r5 = this;
            boolean r0 = r5 instanceof X.AnonymousClass567
            if (r0 == 0) goto L_0x0094
            r3 = r5
            X.567 r3 = (X.AnonymousClass567) r3
            r4 = 0
            r3.A0D = r4
            r3.A0H = r4
            r3.A0G = r4
            r3.A0I = r4
            X.7t6 r2 = r3.A05
            if (r2 == 0) goto L_0x0093
            boolean r0 = r2.A0A
            if (r0 != 0) goto L_0x001f
            X.7ks r0 = r2.A0D
            boolean r1 = r0.A08
            r0 = 0
            if (r1 == 0) goto L_0x0020
        L_0x001f:
            r0 = 1
        L_0x0020:
            r3.A0Q = r0
            r2.A06()
            r3.A0E = r4
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r3.A02 = r0
            X.7t6 r0 = r3.A05
            java.util.concurrent.atomic.AtomicReference r1 = r0.A08
            java.lang.Object r0 = r1.get()
            if (r0 == 0) goto L_0x005b
            java.lang.Object r0 = r1.get()
            X.7yr r0 = (X.C166537yr) r0
            boolean r0 = r0.A0T
            if (r0 == 0) goto L_0x005b
            r0 = 1
            r3.A0E = r0
            X.7t6 r0 = r3.A05
            long r0 = r0.A02()
            r3.A02 = r0
            X.7t6 r0 = r3.A05
            java.util.concurrent.atomic.AtomicReference r0 = r0.A08
            java.lang.Object r0 = r0.get()
            X.7yr r0 = (X.C166537yr) r0
            int r0 = r0.A0W
            r3.A00 = r0
        L_0x005b:
            X.7t6 r0 = r3.A05
            r0.A0A()
            X.6qM r1 = r3.A0U
            r1.A02()
            r0 = 0
            r1.A03(r0, r4)
            X.7t6 r0 = r3.A05
            X.8ub r2 = r3.A0S
            android.os.Handler r1 = r0.A0C
            r0 = 45
            android.os.Message r0 = r1.obtainMessage(r0, r2)
            r1.sendMessage(r0)
            X.7t6 r0 = r3.A05
            r0.A08()
            r0 = 0
            r3.A05 = r0
            r3.A0L = r4
            r3.A0J = r4
            X.3Wi r2 = r3.A0T
            r1 = 46
            X.5rN r0 = new X.5rN
            r0.<init>(r3, r1)
            r2.A0S(r0)
            r3.A0B()
        L_0x0093:
            return
        L_0x0094:
            boolean r0 = r5 instanceof X.AnonymousClass565
            if (r0 == 0) goto L_0x00a6
            r1 = r5
            X.565 r1 = (X.AnonymousClass565) r1
            X.8Kd r0 = r1.A03
            r0.close()
            X.6D4 r0 = r1.A01
            r0.stop()
            return
        L_0x00a6:
            boolean r0 = r5 instanceof X.AnonymousClass564
            if (r0 == 0) goto L_0x00b8
            r1 = r5
            X.564 r1 = (X.AnonymousClass564) r1
            X.5Sn r0 = r1.A00
            if (r0 != 0) goto L_0x00d8
            java.lang.String r0 = "staticContentPlayer"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x00b8:
            r2 = r5
            X.566 r2 = (X.AnonymousClass566) r2
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "conversation/row/ConversationRowInlineVideoPlayer/stop state="
            r1.append(r0)
            X.5Xh r0 = r2.A00
            X.C18260x0.A0m(r0, r1)
            X.5Xh r0 = r2.A00
            X.7ND r1 = r0.A05
            r2.A0g()
            if (r1 == 0) goto L_0x0093
            X.5RW r0 = r2.A05
            r0.A02(r1)
            return
        L_0x00d8:
            r0.A02()
            android.os.Handler r1 = r1.A01
            r0 = 0
            r1.removeMessages(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5YG.A0G():void");
    }

    public final void A0H() {
        C183318pq r0 = this.A07;
        if (r0 != null) {
            r0.BPX(this);
        }
    }

    public /* synthetic */ void A0I() {
        if (this instanceof AnonymousClass567) {
            ((AnonymousClass567) this).A0F = true;
        }
    }

    public /* synthetic */ void A0J() {
        if (this instanceof AnonymousClass567) {
            AnonymousClass567 r3 = (AnonymousClass567) this;
            C86604Kt.A1V(AnonymousClass001.A0o(), "Heroplayer/initialize  playerid=", r3);
            if (r3.A05 == null) {
                AnonymousClass561 r1 = r3.A0D;
                if (r1 != null) {
                    Activity activity = r3.A02;
                    C626936e.A06(activity);
                    if ((AnonymousClass001.A0Q(activity).getSystemUiVisibility() & 4) == 0) {
                        r1.A07();
                    } else {
                        r1.A06();
                    }
                }
                r3.A0f();
                r3.A0H = true;
                if (r3.A0Q) {
                    if (r3.A05 != null) {
                        AnonymousClass561 r2 = r3.A0D;
                        if (r2 != null) {
                            r2.A04 = null;
                            r2.A05 = new C159447lq(r3, 2);
                        }
                        r3.A0T.A0S(new C117095rN(r3, 45));
                    }
                } else if (r3.A0D == null) {
                    C153387bE r0 = r3.A0B;
                    if (r0 != null) {
                        r0.A00();
                    }
                    if (!r3.A0R) {
                        r3.A05.A0K(r3.A0C);
                    }
                } else {
                    C162997t6 r02 = r3.A05;
                    if (r02 != null) {
                        r02.A06();
                    }
                    AnonymousClass561 r22 = r3.A0D;
                    if (r22 != null) {
                        r22.A04 = new AnonymousClass915(r3, 1);
                        r22.A05 = new C159447lq(r3, 3);
                    }
                }
            }
        }
    }

    public /* synthetic */ void A0K() {
        C153387bE r0;
        if ((this instanceof AnonymousClass567) && (r0 = ((AnonymousClass567) this).A0B) != null) {
            r0.A02();
        }
    }

    public /* synthetic */ void A0L() {
        C153387bE r0;
        if ((this instanceof AnonymousClass567) && (r0 = ((AnonymousClass567) this).A0B) != null) {
            r0.A01();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0054, code lost:
        if (r3.A0R == false) goto L_0x0056;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void A0M() {
        /*
            r11 = this;
            boolean r0 = r11 instanceof X.AnonymousClass567
            if (r0 == 0) goto L_0x0074
            r3 = r11
            X.567 r3 = (X.AnonymousClass567) r3
            X.7t6 r0 = r3.A05
            if (r0 == 0) goto L_0x0074
            java.lang.String r0 = "ExoPlayerVideoPlayer/reinitializeWithNewVideo="
            com.whatsapp.util.Log.d((java.lang.String) r0)
            r3.A0O()
            X.7t6 r1 = r3.A05
            X.7ks r0 = r1.A0D
            r0.A07()
            android.os.Handler r1 = r1.A0C
            r0 = 50
            android.os.Message r0 = r1.obtainMessage(r0)
            r1.sendMessage(r0)
            r0 = 0
            r3.A0D = r0
            r3.A0E = r0
            r3.A0G = r0
            r3.A0O = r0
            r3.A0N = r0
            X.7bE r0 = r3.A0B
            if (r0 == 0) goto L_0x0037
            r0.A00()
        L_0x0037:
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            X.7Rn r0 = r3.A0A
            if (r0 == 0) goto L_0x0075
            boolean r0 = r0.A00()
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
            r0 = 1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
        L_0x004a:
            android.net.Uri r5 = r3.A03
            boolean r0 = r3.A0C
            r2 = 1
            if (r0 == 0) goto L_0x0056
            boolean r0 = r3.A0R
            r7 = 1
            if (r0 != 0) goto L_0x0057
        L_0x0056:
            r7 = 0
        L_0x0057:
            int r6 = r3.A00
            boolean r8 = r3.A0F
            boolean r9 = r4.booleanValue()
            boolean r10 = r1.booleanValue()
            X.7a6 r1 = X.C155157eN.A00(r5, r6, r7, r8, r9, r10)
            X.8kg r0 = r3.A04
            if (r0 == 0) goto L_0x006d
            r1.A03 = r0
        L_0x006d:
            X.7t6 r0 = r3.A05
            r0.A0H(r1)
            r3.A0H = r2
        L_0x0074:
            return
        L_0x0075:
            r1 = r4
            goto L_0x004a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5YG.A0M():void");
    }

    public /* synthetic */ void A0N() {
        C162997t6 r0;
        if ((this instanceof AnonymousClass567) && (r0 = ((AnonymousClass567) this).A05) != null) {
            r0.A07();
        }
    }

    public /* synthetic */ void A0O() {
        if (this instanceof AnonymousClass567) {
            AnonymousClass567 r2 = (AnonymousClass567) this;
            C162997t6 r0 = r2.A05;
            if (r0 == null || r0.A01() == 1) {
                r2.A0P = false;
                return;
            }
            r2.A0P = true;
            Handler handler = r2.A05.A0C;
            handler.sendMessage(handler.obtainMessage(49));
        }
    }

    public void A0P(int i) {
        int i2 = i;
        if (this instanceof AnonymousClass567) {
            AnonymousClass567 r1 = (AnonymousClass567) this;
            C162997t6 r2 = r1.A05;
            if (r2 != null) {
                C146527Ap r12 = new C146527Ap();
                r12.A00 = i;
                r2.A0E(new AnonymousClass7RE(r12));
                return;
            }
            r1.A04 = C86604Kt.A0C(-1, i);
        } else if (this instanceof AnonymousClass565) {
            throw AnonymousClass002.A0G("not implemented yet");
        } else if (this instanceof AnonymousClass564) {
            AnonymousClass564 r4 = (AnonymousClass564) this;
            C104835Sn r22 = r4.A00;
            if (r22 == null) {
                throw C18270x1.A0S("staticContentPlayer");
            }
            r22.A01 = (long) i;
            r22.A02 = SystemClock.elapsedRealtime();
            Handler handler = r4.A01;
            handler.removeMessages(0);
            handler.sendEmptyMessageDelayed(0, (long) (r4.A06() - r4.A05()));
        } else {
            AnonymousClass566 r13 = (AnonymousClass566) this;
            C106015Xh r0 = r13.A00;
            AnonymousClass7ND r5 = r0.A05;
            if (r5 != null) {
                r5.A03.A0P(i);
                return;
            }
            C104515Rg r3 = r0.A03;
            boolean z = r0.A07;
            r13.A0h(new C106015Xh(r3, r0.A04, r5, r0.A02, i2, r0.A00, z, r0.A06));
        }
    }

    public /* synthetic */ void A0Q(int i) {
        int i2 = i;
        if (this instanceof AnonymousClass567) {
            ((AnonymousClass567) this).A0U.setLayoutResizeMode(i);
        } else if (this instanceof AnonymousClass566) {
            AnonymousClass566 r1 = (AnonymousClass566) this;
            C106015Xh r0 = r1.A00;
            C104515Rg r3 = r0.A03;
            boolean z = r0.A07;
            r1.A0h(new C106015Xh(r3, r0.A04, r0.A05, r0.A02, r0.A01, i2, z, r0.A06));
        }
    }

    public /* synthetic */ void A0R(int i) {
        if (this instanceof AnonymousClass567) {
            this.A00 = i;
        }
    }

    public /* synthetic */ void A0S(int i) {
        if (this instanceof AnonymousClass567) {
            this.A01 = i;
        }
    }

    public /* synthetic */ void A0T(int i, int i2) {
        if (this instanceof AnonymousClass567) {
            AnonymousClass567 r1 = (AnonymousClass567) this;
            C162997t6 r2 = r1.A05;
            if (r2 != null) {
                r2.A0C(0, (long) i2);
            } else {
                r1.A04 = C86604Kt.A0C(0, i2);
            }
        }
    }

    public /* synthetic */ void A0U(C53302ms r2) {
        if (this instanceof AnonymousClass567) {
            ((AnonymousClass567) this).A0U.A01 = r2;
        }
    }

    public void A0V(C183348pt r2) {
        if (this instanceof AnonymousClass566) {
            AnonymousClass566 r0 = (AnonymousClass566) this;
            r0.A0A = r2;
            r0.A01 = r2;
            return;
        }
        this.A0A = r2;
    }

    public /* synthetic */ void A0W(AnonymousClass561 r4) {
        if (this instanceof AnonymousClass567) {
            AnonymousClass567 r2 = (AnonymousClass567) this;
            if (!(r4 instanceof HeroPlaybackControlView)) {
                ViewGroup A0l = C86664Kz.A0l(r4);
                int indexOfChild = A0l.indexOfChild(r4);
                if (indexOfChild > 0) {
                    A0l.removeViewAt(indexOfChild);
                }
                r4 = new HeroPlaybackControlView(r2.A0U.getContext());
                A0l.addView(r4);
            }
            r2.A0D = r4;
            r2.A0U.A01(r4, false);
        }
    }

    public /* synthetic */ void A0X(File file) {
        if (this instanceof AnonymousClass567) {
            AnonymousClass567 r1 = (AnonymousClass567) this;
            r1.A03 = Uri.fromFile(file);
            r1.A04 = null;
        }
    }

    public final void A0Y(String str, boolean z, String str2) {
        C183328pr r0 = this.A08;
        if (r0 != null) {
            r0.BSK(str, z, str2);
        }
    }

    public void A0Z(boolean z) {
        boolean z2 = z;
        if (this instanceof AnonymousClass567) {
            AnonymousClass567 r0 = (AnonymousClass567) this;
            r0.A0M = z;
            C162997t6 r1 = r0.A05;
            if (r1 != null) {
                float f = 1.0f;
                if (z) {
                    f = 0.0f;
                }
                r1.A0B(f);
            }
        } else if (!(this instanceof AnonymousClass565) && !(this instanceof AnonymousClass564)) {
            AnonymousClass566 r12 = (AnonymousClass566) this;
            C106015Xh r02 = r12.A00;
            C104515Rg r3 = r02.A03;
            boolean z3 = r02.A07;
            r12.A0h(new C106015Xh(r3, r02.A04, r02.A05, r02.A02, r02.A01, r02.A00, z3, z2));
        }
    }

    public boolean A0a() {
        if (this instanceof AnonymousClass567) {
            AnonymousClass567 r3 = (AnonymousClass567) this;
            C162997t6 r2 = r3.A05;
            if (r2 == null || r3.A0P) {
                return false;
            }
            if (r3.A0I || r2.A0L()) {
                return true;
            }
            return false;
        } else if (this instanceof AnonymousClass565) {
            return ((AnonymousClass565) this).A01.isRunning();
        } else {
            if (this instanceof AnonymousClass564) {
                C104835Sn r0 = ((AnonymousClass564) this).A00;
                if (r0 != null) {
                    return r0.A03;
                }
                throw C18270x1.A0S("staticContentPlayer");
            }
            C106015Xh r1 = ((AnonymousClass566) this).A00;
            if (!r1.A07 || r1.A01() != 3) {
                return false;
            }
            return true;
        }
    }

    public boolean A0b() {
        if (this instanceof AnonymousClass567) {
            AnonymousClass567 r1 = (AnonymousClass567) this;
            if (!r1.A0D || !r1.A0G || !r1.A0L) {
                return false;
            }
            return true;
        } else if (this instanceof AnonymousClass565) {
            throw AnonymousClass002.A0G("not implemented yet");
        } else if (this instanceof AnonymousClass564) {
            return true;
        } else {
            AnonymousClass7ND r0 = ((AnonymousClass566) this).A00.A05;
            if (r0 != null) {
                return r0.A03.A0b();
            }
        }
        return false;
    }

    public boolean A0c() {
        if (this instanceof AnonymousClass567) {
            return ((AnonymousClass567) this).A0K;
        }
        return false;
    }

    public /* synthetic */ boolean A0d() {
        if (this instanceof AnonymousClass567) {
            C162997t6 r1 = ((AnonymousClass567) this).A05;
            C626936e.A06(r1);
            if (r1.A0A || r1.A0D.A08) {
                return true;
            }
            return false;
        } else if (this instanceof AnonymousClass566) {
            return ((AnonymousClass566) this).A00.A07;
        } else {
            return false;
        }
    }

    public /* synthetic */ boolean A0e() {
        if (this instanceof AnonymousClass567) {
            return ((AnonymousClass567) this).A0H;
        }
        return false;
    }

    public static void A03(ViewGroup viewGroup, AnonymousClass5YG r5) {
        viewGroup.addView(r5.A09(), new FrameLayout.LayoutParams(-1, -1, 17));
    }
}
