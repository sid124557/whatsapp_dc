package com.whatsapp.calling.callgrid.viewmodel;

import X.AnonymousClass001;
import X.AnonymousClass08M;
import X.AnonymousClass0x2;
import X.AnonymousClass0x9;
import X.AnonymousClass107;
import X.AnonymousClass1VX;
import X.AnonymousClass3ZH;
import X.AnonymousClass4C1;
import X.AnonymousClass4FS;
import X.AnonymousClass4L0;
import X.AnonymousClass4UC;
import X.AnonymousClass4VK;
import X.AnonymousClass5NO;
import X.AnonymousClass5QX;
import X.AnonymousClass5TU;
import X.AnonymousClass5XK;
import X.AnonymousClass5ZU;
import X.AnonymousClass7DG;
import X.AnonymousClass7HG;
import X.AnonymousClass7Pi;
import X.AnonymousClass7SG;
import X.AnonymousClass7WK;
import X.AnonymousClass7Y7;
import X.AnonymousClass8GN;
import X.AnonymousClass8KF;
import X.C06270Wx;
import X.C102545Jg;
import X.C102995Lb;
import X.C105175Tw;
import X.C111095hX;
import X.C116655qe;
import X.C117125rQ;
import X.C118405tU;
import X.C158507k5;
import X.C15930sC;
import X.C162457s7;
import X.C18260x0;
import X.C18270x1;
import X.C18300x5;
import X.C18320x8;
import X.C18330xA;
import X.C187958y5;
import X.C1897692o;
import X.C52412lR;
import X.C54292oU;
import X.C56572sD;
import X.C56892sj;
import X.C56972sr;
import X.C620733j;
import X.C626936e;
import X.C627736r;
import X.C64773Ex;
import X.C66493Lq;
import X.C72173dI;
import X.C86604Kt;
import X.C86614Ku;
import X.C86624Kv;
import X.C86634Kw;
import X.C86664Kz;
import X.C91444jd;
import X.C97174xk;
import X.C998058g;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.util.Pair;
import android.util.Rational;
import com.whatsapp.R;
import com.whatsapp.calling.lightweightcalling.view.AudioChatBottomSheetDialog;
import com.whatsapp.filter.FilterUtils;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.camera.VoipCameraManager;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

public class CallGridViewModel extends AnonymousClass4VK {
    public int A00;
    public Rect A01;
    public Handler A02;
    public Rational A03;
    public C15930sC A04;
    public AnonymousClass3ZH A05;
    public UserJid A06;
    public UserJid A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public final AnonymousClass08M A0F;
    public final AnonymousClass08M A0G = C18330xA.A01(new AnonymousClass7HG());
    public final AnonymousClass08M A0H = C18330xA.A01((Object) null);
    public final AnonymousClass08M A0I;
    public final AnonymousClass08M A0J;
    public final AnonymousClass08M A0K;
    public final AnonymousClass08M A0L;
    public final AnonymousClass08M A0M;
    public final AnonymousClass08M A0N = C18330xA.A01(new AnonymousClass7Pi());
    public final C111095hX A0O;
    public final C56972sr A0P;
    public final AnonymousClass5NO A0Q;
    public final C97174xk A0R;
    public final AnonymousClass8GN A0S;
    public final C102545Jg A0T;
    public final AnonymousClass5QX A0U;
    public final AnonymousClass5TU A0V;
    public final C118405tU A0W;
    public final C91444jd A0X;
    public final AnonymousClass7SG A0Y;
    public final C116655qe A0Z;
    public final C64773Ex A0a;
    public final AnonymousClass5ZU A0b;
    public final C54292oU A0c;
    public final C56892sj A0d;
    public final C52412lR A0e;
    public final AnonymousClass1VX A0f;
    public final C66493Lq A0g;
    public final C56572sD A0h;
    public final AnonymousClass107 A0i;
    public final AnonymousClass107 A0j;
    public final AnonymousClass107 A0k;
    public final AnonymousClass107 A0l;
    public final AnonymousClass107 A0m;
    public final AnonymousClass107 A0n = AnonymousClass4L0.A0O(Boolean.TRUE);
    public final AnonymousClass107 A0o;
    public final AnonymousClass107 A0p;
    public final AnonymousClass107 A0q;
    public final AnonymousClass107 A0r;
    public final AnonymousClass107 A0s;
    public final AnonymousClass107 A0t;
    public final AnonymousClass107 A0u;
    public final AnonymousClass107 A0v;
    public final AnonymousClass4UC A0w;
    public final AnonymousClass4UC A0x;
    public final AnonymousClass4UC A0y;
    public final C187958y5 A0z;
    public final AnonymousClass4FS A10;
    public final VoipCameraManager A11;
    public final LinkedHashMap A12;
    public final AnonymousClass4C1 A13;
    public final AnonymousClass4C1 A14;
    public final AnonymousClass4C1 A15;
    public final boolean A16;

    public static int A05(C102995Lb r2) {
        if (r2.A0C) {
            return 2;
        }
        if (r2.A0G) {
            return 3;
        }
        int i = r2.A06;
        if (i == 2) {
            return 9;
        }
        if (r2.A0F) {
            return 5;
        }
        if (i == 6) {
            return 7;
        }
        return 0;
    }

    public static final void A0A(Bitmap bitmap) {
        if (bitmap != null) {
            int width = bitmap.getWidth() / 40;
            int i = 8;
            if (width >= 8) {
                i = Math.min(width, 16);
            }
            FilterUtils.blurNative(bitmap, i, 2);
            return;
        }
        Log.i("voip/CallGridViewModel/cacheLastFrame no bitmap");
    }

    public void A0C() {
        C15930sC r1;
        this.A0R.A07(this);
        C116655qe r0 = this.A0Z;
        r0.A02 = null;
        r0.A01();
        if (this.A0z.BIo() && (r1 = this.A04) != null) {
            this.A0U.A00.A0F(r1);
            this.A04 = null;
        }
    }

    public void A0E(UserJid userJid) {
        C102995Lb r2 = (C102995Lb) this.A0R.A08().A02.get(userJid);
        if (r2 != null) {
            if (userJid.equals(this.A06) && Build.VERSION.SDK_INT >= 26) {
                this.A0L.A0H(A0I(r2));
            }
            if (userJid.equals(this.A07)) {
                A0Q(r2);
            } else {
                A0R(r2);
            }
            if (C86614Ku.A1W(this.A0H, userJid)) {
                A0P(r2);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0033, code lost:
        if (r7 == false) goto L_0x0035;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0F(com.whatsapp.jid.UserJid r6, boolean r7, boolean r8) {
        /*
            r5 = this;
            r5.A0D = r7
            r5.A08 = r8
            com.whatsapp.jid.UserJid r0 = r5.A06
            X.2sr r2 = r5.A0P
            boolean r4 = r2.A0a(r0)
            boolean r3 = r2.A0a(r6)
            boolean r0 = r5.A0B
            if (r0 == 0) goto L_0x0026
            X.5TU r1 = r5.A0V
            if (r4 == 0) goto L_0x00af
            X.5Ta r0 = r1.A0N
        L_0x001a:
            r0.A00()
            if (r7 == 0) goto L_0x0026
            if (r3 == 0) goto L_0x00ab
            X.5Ta r0 = r1.A0N
        L_0x0023:
            r0.A02()
        L_0x0026:
            int r1 = r5.A00
            r0 = 1
            if (r1 == r0) goto L_0x002e
            r0 = 3
            if (r1 != r0) goto L_0x0041
        L_0x002e:
            X.5TU r1 = r5.A0V
            if (r3 != 0) goto L_0x0035
            r0 = 1
            if (r7 != 0) goto L_0x0036
        L_0x0035:
            r0 = 0
        L_0x0036:
            X.5Ta r1 = r1.A0J
            if (r0 == 0) goto L_0x00a7
            boolean r0 = r1.A02
            if (r0 != 0) goto L_0x0041
            r1.A02()
        L_0x0041:
            if (r7 == 0) goto L_0x004c
            com.whatsapp.jid.UserJid r1 = r5.A06
            if (r1 == 0) goto L_0x004c
            X.5QX r0 = r5.A0U
            r0.A00(r1)
        L_0x004c:
            boolean r0 = r2.A0a(r6)
            if (r0 != 0) goto L_0x0057
            X.5QX r0 = r5.A0U
            r0.A00(r6)
        L_0x0057:
            if (r7 == 0) goto L_0x00a5
            X.4xk r0 = r5.A0R
            X.5XK r0 = r0.A08()
            X.8OQ r0 = r0.A02
            java.lang.Object r2 = r0.get(r6)
            X.5Lb r2 = (X.C102995Lb) r2
        L_0x0067:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r1 < r0) goto L_0x0076
            X.08M r1 = r5.A0L
            android.util.Rational r0 = r5.A0I(r2)
            r1.A0H(r0)
        L_0x0076:
            X.4xk r0 = r5.A0R
            X.5XK r1 = r0.A08()
            r0 = 0
            r5.A0T(r1, r0)
            X.08M r1 = r5.A0I
            java.lang.Object r0 = r1.A07()
            if (r0 == 0) goto L_0x00a4
            boolean r0 = X.C86634Kw.A1Y(r1)
            if (r0 == 0) goto L_0x00a4
            java.util.LinkedHashMap r0 = r5.A12
            java.util.Set r0 = r0.keySet()
            java.util.ArrayList r1 = X.AnonymousClass002.A0J(r0)
            X.4jd r0 = r5.A0X
            com.whatsapp.jid.UserJid r0 = r0.A0G()
            r1.remove(r0)
            r5.A0V(r1)
        L_0x00a4:
            return
        L_0x00a5:
            r2 = 0
            goto L_0x0067
        L_0x00a7:
            r1.A00()
            goto L_0x0041
        L_0x00ab:
            X.5Ta r0 = r1.A0K
            goto L_0x0023
        L_0x00af:
            X.5Ta r0 = r1.A0K
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel.A0F(com.whatsapp.jid.UserJid, boolean, boolean):void");
    }

    public final Bitmap A0G(UserJid userJid, boolean z) {
        Bitmap bitmap;
        if (z && this.A09 && (bitmap = this.A0T.A00) != null) {
            return bitmap;
        }
        C102545Jg r1 = this.A0T;
        C162457s7.A0J(userJid, 0);
        if (((Set) C18300x5.A0d(r1.A03)).contains(userJid)) {
            return (Bitmap) r1.A01.get(userJid);
        }
        return null;
    }

    public final Point A0H(C102995Lb r5) {
        int i;
        int i2;
        int i3;
        if (r5.A0J) {
            VoipCameraManager voipCameraManager = this.A11;
            Point adjustedCameraPreviewSize = voipCameraManager.getAdjustedCameraPreviewSize(new AnonymousClass8KF());
            if (adjustedCameraPreviewSize == null && r5.A06 == 6) {
                return voipCameraManager.lastAdjustedCameraPreviewSize;
            }
            return adjustedCameraPreviewSize;
        }
        int i4 = 0;
        if (r5.A0K && (i3 = this.A00) >= 0) {
            i4 = i3 * 90;
        }
        if (((((r5.A05 * 90) - i4) + 360) % 360) % 180 != 0) {
            i = r5.A04;
            i2 = r5.A07;
        } else {
            i = r5.A07;
            i2 = r5.A04;
        }
        return new Point(i, i2);
    }

    public final Rational A0I(C102995Lb r6) {
        Rational rational;
        Point A0H2;
        if (r6 == null || (A0H2 = A0H(r6)) == null) {
            rational = null;
        } else {
            rational = new Rational(A0H2.x, A0H2.y);
        }
        C626936e.A07(this.A03, "CallGridViewModel/getPictureInPictureTargetSize defaultPipSize cannot be null");
        if (rational == null) {
            rational = this.A03;
        }
        Rational rational2 = new Rational(100, 239);
        Rational rational3 = new Rational(239, 100);
        if (rational.compareTo(rational2) < 0) {
            C18260x0.A1S(AnonymousClass001.A0o(), "CallGridViewModel/getPictureInPictureTargetSize aspect ratio too small ", rational);
            rational = rational2;
        }
        if (rational.compareTo(rational3) <= 0) {
            return rational;
        }
        C18260x0.A1S(AnonymousClass001.A0o(), "CallGridViewModel/getPictureInPictureTargetSize aspect ratio too large ", rational);
        return rational3;
    }

    public C998058g A0J(AnonymousClass5XK r3) {
        if (this.A0B || !r3.A0H) {
            return C998058g.NONE;
        }
        if (this.A0C) {
            return C998058g.RINGING;
        }
        if (!r3.A0B || !this.A0f.A0X(3551)) {
            return C998058g.GO_TO_CHAT;
        }
        return C998058g.RING_ALL;
    }

    public final void A0K() {
        int i;
        AnonymousClass107 r4 = this.A0j;
        if (this.A0B) {
            i = R.dimen.f6nameremoved;
        } else {
            boolean A1Z = C86604Kt.A1Z(this.A0p);
            i = R.dimen.f6nameremoved;
            if (A1Z) {
                i = R.dimen.f6nameremoved;
            }
        }
        boolean A1Z2 = C86604Kt.A1Z(this.A0l);
        int i2 = 0;
        if (!C86604Kt.A1Z(this.A0p)) {
            i2 = 14;
        }
        r4.A0H(new AnonymousClass7WK(i, i2, A1Z2));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00f4, code lost:
        if (r2 > r3.size()) goto L_0x00f6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0L() {
        /*
            r8 = this;
            java.util.LinkedHashMap r5 = r8.A12
            java.util.Collection r0 = r5.values()
            java.util.ArrayList r3 = X.AnonymousClass002.A0J(r0)
            com.whatsapp.jid.UserJid r1 = r8.A06
            if (r1 == 0) goto L_0x003a
            boolean r0 = r8.A0B
            r6 = 0
            r4 = 1
            if (r0 == 0) goto L_0x0064
            X.2sr r0 = r8.A0P
            boolean r0 = r0.A0a(r1)
            if (r0 == 0) goto L_0x0064
            com.whatsapp.jid.UserJid r0 = r8.A06
            android.util.Pair r0 = A08(r0, r3)
            if (r0 == 0) goto L_0x003a
            int r2 = X.C18280x3.A03(r0)
            java.lang.Object r1 = r0.second
            X.5Tw r1 = (X.C105175Tw) r1
            X.5Ws r0 = new X.5Ws
            r0.<init>(r1)
            r0.A0A = r4
            X.5Tw r0 = r0.A00()
            r3.add(r2, r0)
        L_0x003a:
            X.107 r0 = r8.A0p
            boolean r0 = X.C86604Kt.A1Z(r0)
            if (r0 == 0) goto L_0x00af
            int r1 = r5.size()
            r0 = 8
            if (r1 <= r0) goto L_0x00af
            X.08M r4 = r8.A0K
            r1 = 6
            r2 = 6
            r0 = 0
            java.util.List r0 = r3.subList(r0, r1)
            r4.A0H(r0)
            X.08M r1 = r8.A0I
            int r0 = r3.size()
            java.util.List r0 = r3.subList(r2, r0)
        L_0x0060:
            r1.A0H(r0)
            return
        L_0x0064:
            com.whatsapp.jid.UserJid r0 = r8.A06
            android.util.Pair r7 = A08(r0, r3)
            if (r7 == 0) goto L_0x00bb
            java.lang.Object r0 = r7.second
            X.5Tw r0 = (X.C105175Tw) r0
            if (r0 == 0) goto L_0x00bb
            X.5Ws r2 = new X.5Ws
            r2.<init>(r0)
            X.2sr r1 = r8.A0P
            com.whatsapp.jid.UserJid r0 = r8.A06
            boolean r0 = r1.A0a(r0)
            if (r0 == 0) goto L_0x00ac
            r2.A0I = r4
        L_0x0083:
            X.5Tw r5 = r2.A00()
            boolean r0 = r8.A0B
            if (r0 == 0) goto L_0x00c2
            java.util.ArrayList r4 = X.C18300x5.A0s(r5)
            java.util.Iterator r2 = r3.iterator()
        L_0x0093:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00a6
            java.lang.Object r1 = r2.next()
            X.5Tw r1 = (X.C105175Tw) r1
            boolean r0 = r1.A0J
            if (r0 == 0) goto L_0x0093
            r4.add(r1)
        L_0x00a6:
            X.08M r0 = r8.A0K
            r0.A0H(r4)
            goto L_0x00b4
        L_0x00ac:
            r2.A0H = r4
            goto L_0x0083
        L_0x00af:
            X.08M r0 = r8.A0K
            r0.A0H(r3)
        L_0x00b4:
            X.08M r1 = r8.A0I
            java.util.ArrayList r0 = X.AnonymousClass001.A0s()
            goto L_0x0060
        L_0x00bb:
            java.lang.String r0 = "voip/CallGridViewModel/updateParticipantsList screen share user not found"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            goto L_0x003a
        L_0x00c2:
            X.5Ws r0 = new X.5Ws
            r0.<init>(r5)
            r0.A0A = r4
            r0.A0X = r6
            X.5Tw r4 = r0.A00()
            com.whatsapp.jid.UserJid r0 = r8.A06
            boolean r0 = r1.A0a(r0)
            if (r0 == 0) goto L_0x00e9
            r3.add(r6, r4)
        L_0x00da:
            X.08M r1 = r8.A0K
            java.util.List r0 = java.util.Collections.singletonList(r5)
            r1.A0H(r0)
            X.08M r0 = r8.A0I
            r0.A0H(r3)
            return
        L_0x00e9:
            int r2 = X.C18280x3.A03(r7)
            if (r2 < 0) goto L_0x00f6
            int r0 = r3.size()
            r1 = 1
            if (r2 <= r0) goto L_0x00f7
        L_0x00f6:
            r1 = 0
        L_0x00f7:
            java.lang.String r0 = "updateParticipantsList: Invalid position for view state"
            X.C626936e.A0D(r1, r0)
            int r0 = X.C18280x3.A03(r7)
            r3.add(r0, r4)
            X.4jd r0 = r8.A0X
            com.whatsapp.jid.UserJid r0 = r0.A0G()
            java.util.Objects.requireNonNull(r0)
            android.util.Pair r0 = A08(r0, r3)
            if (r0 == 0) goto L_0x00da
            java.lang.Object r0 = r0.second
            r3.add(r6, r0)
            goto L_0x00da
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel.A0L():void");
    }

    public final void A0M() {
        int i;
        if (this.A0B) {
            i = R.style.f12nameremoved;
        } else {
            boolean A1Z = C86604Kt.A1Z(this.A0p);
            i = R.style.f12nameremoved;
            if (A1Z) {
                i = R.style.f12nameremoved;
            }
        }
        C06270Wx.A03(this.A0v, i);
    }

    public void A0N(Context context) {
        AnonymousClass7DG r2;
        Context A1D;
        if (this instanceof VoiceChatGridViewModel) {
            VoiceChatGridViewModel voiceChatGridViewModel = (VoiceChatGridViewModel) this;
            AnonymousClass3ZH r5 = voiceChatGridViewModel.A05;
            if (r5 != null && (r2 = voiceChatGridViewModel.A00) != null) {
                boolean A012 = voiceChatGridViewModel.A01.A00().A01(r5.A0H);
                AudioChatBottomSheetDialog audioChatBottomSheetDialog = r2.A00;
                audioChatBottomSheetDialog.A1Y().A00(14, 35);
                if (!A012 && (A1D = audioChatBottomSheetDialog.A1D()) != null) {
                    C111095hX r22 = audioChatBottomSheetDialog.A02;
                    if (r22 != null) {
                        r22.A0C(A1D, C86634Kw.A0D(A1D, C86664Kz.A1B(), r5.A0H), "AudioChatBottomSheetDialog/onGoToChatButtonClicked");
                    } else {
                        throw C18270x1.A0S("activityUtils");
                    }
                }
                audioChatBottomSheetDialog.A1L();
                return;
            }
            return;
        }
        AnonymousClass3ZH r0 = this.A05;
        if (r0 != null) {
            this.A0O.A0C(context, C627736r.A0N(context, r0), "CallGridViewModel/onGoToChatButtonClicked");
        }
    }

    public void A0O(Rational rational) {
        C102995Lb r2;
        this.A03 = rational;
        if (this.A06 != null) {
            r2 = (C102995Lb) this.A0R.A08().A02.get(this.A06);
        } else {
            r2 = null;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            this.A0L.A0H(A0I(r2));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0010, code lost:
        if (r8.A06 == 6) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0P(X.C102995Lb r8) {
        /*
            r7 = this;
            X.7HG r5 = new X.7HG
            r5.<init>()
            boolean r0 = r8.A0J
            if (r0 == 0) goto L_0x0012
            int r3 = r8.A06
            r2 = 6
            r1 = 9
            r0 = 16
            if (r3 != r2) goto L_0x0014
        L_0x0012:
            r1 = 5
            r0 = 7
        L_0x0014:
            android.graphics.Point r6 = new android.graphics.Point
            r6.<init>(r1, r0)
            int r1 = r8.A06
            r0 = 6
            if (r1 == r0) goto L_0x003e
            boolean r0 = r8.A0I
            if (r0 != 0) goto L_0x003e
            android.graphics.Point r0 = r7.A0H(r8)
            if (r0 == 0) goto L_0x003e
            int r4 = r0.x
            float r3 = (float) r4
            int r2 = r0.y
            float r0 = (float) r2
            float r3 = r3 / r0
            int r0 = r6.x
            float r1 = (float) r0
            int r0 = r6.y
            float r0 = (float) r0
            float r1 = r1 / r0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x003e
            r6.x = r4
            r6.y = r2
        L_0x003e:
            int r0 = r6.x
            r5.A01 = r0
            int r0 = r6.y
            r5.A00 = r0
            X.08M r0 = r7.A0G
            r0.A0H(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel.A0P(X.5Lb):void");
    }

    public final void A0Q(C102995Lb r5) {
        AnonymousClass08M r3 = this.A0N;
        Object A072 = r3.A07();
        C626936e.A06(A072);
        AnonymousClass7Pi r2 = (AnonymousClass7Pi) A072;
        Point A0H2 = A0H(r5);
        if (A0H2 != null) {
            r2.A05 = A0H2.x;
            r2.A03 = A0H2.y;
            r3.A0H(r2);
        }
    }

    public final void A0R(C102995Lb r4) {
        if (C86604Kt.A1Z(this.A0q) && A09(this.A0R.A08()).size() <= 2) {
            if (r4.A0J) {
                this.A0o.A0H(this.A0m.A07());
                return;
            }
            Point A0H2 = A0H(r4);
            if (A0H2 != null) {
                C18320x8.A18(this.A0o, C86624Kv.A1W(A0H2.x, A0H2.y));
            }
        }
    }

    public final void A0S(AnonymousClass5XK r8) {
        AnonymousClass107 r6 = this.A0s;
        Object A072 = r6.A07();
        C998058g A0J2 = A0J(r8);
        C998058g r1 = C998058g.NONE;
        boolean A1W = C18300x5.A1W(A072, r1);
        boolean A1W2 = C18300x5.A1W(A0J2, r1);
        if (A1W != A1W2) {
            AnonymousClass08M r2 = this.A0N;
            Object A073 = r2.A07();
            C626936e.A06(A073);
            AnonymousClass7Pi r12 = (AnonymousClass7Pi) A073;
            int i = R.dimen.f6nameremoved;
            if (A1W2) {
                i = R.dimen.f6nameremoved;
            }
            r12.A01 = i;
            r2.A0H(r12);
        }
        if (A0J2 != A072) {
            r6.A0H(A0J2);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v61, resolved type: X.5Lb[][]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v2, resolved type: java.util.HashMap} */
    /* JADX WARNING: type inference failed for: r0v342, types: [java.util.AbstractMap] */
    /* JADX WARNING: type inference failed for: r0v352, types: [java.util.AbstractMap] */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x02c3, code lost:
        if (r9.equals(r13.A07) == false) goto L_0x02c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x02e3, code lost:
        if (X.C86614Ku.A1W(r2, r9) == false) goto L_0x02e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x0386, code lost:
        if (r1 >= -1) goto L_0x0388;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x03b9, code lost:
        if (r5 == 2) goto L_0x03bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x03c3, code lost:
        if (r3 != null) goto L_0x03c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x03d5, code lost:
        if (r10.A0B != false) goto L_0x03d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x03eb, code lost:
        if (r6 > 1) goto L_0x03ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x03ed, code lost:
        if (r7 != false) goto L_0x03ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x0424, code lost:
        if (r6 >= r0) goto L_0x0426;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x043b, code lost:
        if (r0 == false) goto L_0x043d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x044a, code lost:
        if (r3 == null) goto L_0x044c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x0458, code lost:
        if (r13.A09 != false) goto L_0x045b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x046a, code lost:
        if (r29 == 1) goto L_0x046c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x04a5, code lost:
        if (r7 == false) goto L_0x04a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x04f3, code lost:
        if (r10.A01 == 2) goto L_0x04f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:313:0x050c, code lost:
        if (r0 != 4) goto L_0x04a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:354:0x0593, code lost:
        if (r20 == false) goto L_0x0595;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:370:0x05db, code lost:
        if (r12 == false) goto L_0x05dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:525:0x08ed, code lost:
        if (r2 <= X.C18280x3.A03(r17)) goto L_0x08ef;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0210  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0234 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0279  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x0344  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x0399  */
    /* JADX WARNING: Removed duplicated region for block: B:238:0x042f  */
    /* JADX WARNING: Removed duplicated region for block: B:245:0x0449  */
    /* JADX WARNING: Removed duplicated region for block: B:285:0x04ac  */
    /* JADX WARNING: Removed duplicated region for block: B:294:0x04d2  */
    /* JADX WARNING: Removed duplicated region for block: B:296:0x04d9  */
    /* JADX WARNING: Removed duplicated region for block: B:297:0x04de  */
    /* JADX WARNING: Removed duplicated region for block: B:301:0x04eb  */
    /* JADX WARNING: Removed duplicated region for block: B:328:0x0549  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:362:0x05ba  */
    /* JADX WARNING: Removed duplicated region for block: B:365:0x05c3  */
    /* JADX WARNING: Removed duplicated region for block: B:376:0x0604 A[LOOP:6: B:374:0x05fe->B:376:0x0604, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:386:0x0627 A[LOOP:7: B:384:0x0621->B:386:0x0627, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:388:0x0637  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:445:0x07b5  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:486:0x0843  */
    /* JADX WARNING: Removed duplicated region for block: B:510:0x08b2  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:555:0x0948  */
    /* JADX WARNING: Removed duplicated region for block: B:564:0x0966  */
    /* JADX WARNING: Removed duplicated region for block: B:578:0x09ab  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x013f  */
    /* JADX WARNING: Removed duplicated region for block: B:581:0x09b8  */
    /* JADX WARNING: Removed duplicated region for block: B:584:0x09bf  */
    /* JADX WARNING: Removed duplicated region for block: B:585:0x09ce  */
    /* JADX WARNING: Removed duplicated region for block: B:597:0x00e4 A[EDGE_INSN: B:597:0x00e4->B:44:0x00e4 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:640:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0162  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0175  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x01be  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0T(X.AnonymousClass5XK r34, boolean r35) {
        /*
            r33 = this;
            r13 = r33
            X.107 r1 = r13.A0r
            r14 = r34
            boolean r0 = r14.A0C
            r21 = r0
            X.C18320x8.A18(r1, r0)
            if (r0 == 0) goto L_0x0013
            boolean r0 = r13 instanceof com.whatsapp.calling.callgrid.viewmodel.VoiceChatGridViewModel
            if (r0 == 0) goto L_0x09cd
        L_0x0013:
            boolean r0 = r13 instanceof com.whatsapp.calling.callgrid.viewmodel.VoiceChatGridViewModel
            r27 = r0
            if (r0 == 0) goto L_0x00a8
            r1 = r13
            com.whatsapp.calling.callgrid.viewmodel.VoiceChatGridViewModel r1 = (com.whatsapp.calling.callgrid.viewmodel.VoiceChatGridViewModel) r1
            com.whatsapp.voipcalling.CallState r2 = r14.A07
            X.C162457s7.A0C(r2)
            X.8VS r0 = new X.8VS
            r0.<init>(r1)
            X.66R r1 = X.C154517dI.A01(r0)
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.REJOINING
            if (r2 == r0) goto L_0x0072
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.RECEIVED_CALL
            if (r2 == r0) goto L_0x0072
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACCEPT_SENT
            if (r2 != r0) goto L_0x00a8
            boolean r0 = X.C18270x1.A1V(r1)
            if (r0 == 0) goto L_0x00a8
            X.8OQ r0 = r14.A02
            X.C162457s7.A0C(r0)
            java.util.LinkedHashMap r26 = X.C18320x8.A0r()
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r3 = r0.iterator()
        L_0x004d:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00ac
            java.util.Map$Entry r2 = X.AnonymousClass001.A0w(r3)
            java.lang.Object r0 = r2.getValue()
            X.5Lb r0 = (X.C102995Lb) r0
            boolean r0 = r0.A0J
            if (r0 != 0) goto L_0x006c
            java.lang.Object r0 = r2.getValue()
            X.5Lb r0 = (X.C102995Lb) r0
            int r1 = r0.A02
            r0 = 1
            if (r1 != r0) goto L_0x004d
        L_0x006c:
            r0 = r26
            X.C18270x1.A1N(r0, r2)
            goto L_0x004d
        L_0x0072:
            X.8OQ r0 = r14.A02
            X.C162457s7.A0C(r0)
            java.util.LinkedHashMap r26 = X.C18320x8.A0r()
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r3 = r0.iterator()
        L_0x0083:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00ac
            java.util.Map$Entry r2 = X.AnonymousClass001.A0w(r3)
            java.lang.Object r0 = r2.getValue()
            X.5Lb r0 = (X.C102995Lb) r0
            boolean r0 = r0.A0J
            if (r0 != 0) goto L_0x0083
            java.lang.Object r0 = r2.getValue()
            X.5Lb r0 = (X.C102995Lb) r0
            int r1 = r0.A02
            r0 = 1
            if (r1 != r0) goto L_0x0083
            r0 = r26
            X.C18270x1.A1N(r0, r2)
            goto L_0x0083
        L_0x00a8:
            java.util.Map r26 = A09(r14)
        L_0x00ac:
            int r2 = r26.size()
            X.1VX r0 = r13.A0f
            r32 = r0
            r1 = 5055(0x13bf, float:7.084E-42)
            boolean r1 = r0.A0X(r1)
            r0 = 2
            if (r1 == 0) goto L_0x00be
            r0 = 3
        L_0x00be:
            boolean r12 = r14.A0K
            if (r12 != 0) goto L_0x00e6
            if (r2 > r0) goto L_0x00e6
            if (r21 != 0) goto L_0x00e6
            java.util.HashMap r3 = new java.util.HashMap
            r0 = r26
            r3.<init>(r0)
            java.util.Iterator r2 = X.AnonymousClass001.A0v(r26)
        L_0x00d1:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00e4
            X.5Lb r1 = X.C86664Kz.A13(r2)
            boolean r0 = r1.A0J
            if (r0 == 0) goto L_0x00d1
            com.whatsapp.jid.UserJid r0 = r1.A08
            r3.remove(r0)
        L_0x00e4:
            r26 = r3
        L_0x00e6:
            com.whatsapp.voipcalling.CallState r0 = r14.A07
            r31 = r0
            com.whatsapp.voipcalling.CallState r1 = com.whatsapp.voipcalling.CallState.NONE
            r28 = 0
            if (r0 == r1) goto L_0x0112
            X.107 r3 = r13.A0i
            java.lang.Object r0 = r3.A07()
            X.7Y7 r0 = (X.AnonymousClass7Y7) r0
            int r0 = r0.A00
            r2 = 8
            if (r0 != r2) goto L_0x0108
            java.lang.Object r0 = r3.A07()
            X.7Y7 r0 = (X.AnonymousClass7Y7) r0
            android.graphics.Bitmap r0 = r0.A01
            if (r0 == 0) goto L_0x0112
        L_0x0108:
            X.7Y7 r1 = new X.7Y7
            r0 = r28
            r1.<init>(r2, r0)
            r3.A0H(r1)
        L_0x0112:
            X.107 r0 = r13.A0p
            r30 = r0
            boolean r0 = X.C86604Kt.A1Z(r30)
            if (r12 == r0) goto L_0x0133
            X.5Jg r1 = r13.A0T
            java.util.Map r0 = r1.A01
            r0.clear()
            java.util.Set r0 = r1.A02
            r0.clear()
            X.66R r0 = r1.A03
            java.lang.Object r0 = X.C18300x5.A0d(r0)
            java.util.Set r0 = (java.util.Set) r0
            r0.clear()
        L_0x0133:
            r0 = r28
            r13.A06 = r0
            X.8y5 r0 = r13.A0z
            boolean r0 = r0.BIo()
            if (r0 == 0) goto L_0x0155
            java.util.Iterator r2 = X.AnonymousClass001.A0v(r26)
        L_0x0143:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0155
            X.5Lb r1 = X.C86664Kz.A13(r2)
            boolean r0 = r1.A0I
            if (r0 == 0) goto L_0x0143
            com.whatsapp.jid.UserJid r0 = r1.A08
            r13.A06 = r0
        L_0x0155:
            int r2 = r26.size()
            boolean r0 = r14.A0H
            r25 = r0
            com.whatsapp.jid.UserJid r0 = r13.A06
            r1 = 0
            if (r0 == 0) goto L_0x0234
            boolean r0 = r13.A0B
            if (r0 == 0) goto L_0x016c
            X.4jd r0 = r13.A0X
            com.whatsapp.jid.UserJid r1 = r0.A0G()
        L_0x016c:
            r13.A07 = r1
        L_0x016e:
            r13.A0S(r14)
            r11 = 1
            r4 = 0
            if (r12 == 0) goto L_0x0267
            java.util.ArrayList r5 = X.AnonymousClass001.A0s()
            java.util.Iterator r7 = X.AnonymousClass001.A0v(r26)
        L_0x017d:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x024d
            X.5Lb r1 = X.C86664Kz.A13(r7)
            boolean r3 = r1.A0J
            if (r3 == 0) goto L_0x022c
            com.whatsapp.voipcalling.camera.VoipCameraManager r0 = r13.A11
            X.7Oo r0 = r0.getLastCachedFrame()
            if (r0 == 0) goto L_0x0232
        L_0x0193:
            boolean r0 = r13.A0B
            if (r0 != 0) goto L_0x0232
            int r2 = r1.A06
            r0 = 6
            if (r2 == r0) goto L_0x01b9
            r0 = 2
            if (r2 == r0) goto L_0x01b9
            if (r3 == 0) goto L_0x01b1
            boolean r0 = r1.A0C
            if (r0 != 0) goto L_0x01b9
            com.whatsapp.voipcalling.camera.VoipCameraManager r0 = r13.A11
            boolean r0 = r0.isCameraOpen()
            if (r0 == 0) goto L_0x01b9
            boolean r0 = r13.A09
            if (r0 != 0) goto L_0x01b9
        L_0x01b1:
            boolean r0 = r1.A0M
            if (r0 != 0) goto L_0x01b9
            boolean r0 = r1.A0B
            if (r0 == 0) goto L_0x0232
        L_0x01b9:
            r0 = 1
        L_0x01ba:
            X.5Jg r2 = r13.A0T
            if (r0 == 0) goto L_0x0210
            com.whatsapp.jid.UserJid r3 = r1.A08
            X.C162457s7.A0J(r3, r4)
            X.66R r6 = r2.A03
            java.lang.Object r0 = X.C18300x5.A0d(r6)
            java.util.Set r0 = (java.util.Set) r0
            boolean r0 = r0.contains(r3)
            if (r0 != 0) goto L_0x01ed
            java.util.Map r0 = r2.A01
            r0.remove(r3)
            java.util.Set r0 = r2.A02
            r0.remove(r3)
            java.lang.Object r0 = X.C18300x5.A0d(r6)
            java.util.Set r0 = (java.util.Set) r0
            r0.remove(r3)
            java.lang.Object r0 = X.C18300x5.A0d(r6)
            java.util.Set r0 = (java.util.Set) r0
            r0.add(r3)
        L_0x01ed:
            java.lang.Object r0 = X.C18300x5.A0d(r6)
            java.util.Set r0 = (java.util.Set) r0
            boolean r0 = r0.contains(r3)
            if (r0 == 0) goto L_0x020b
            java.util.Map r0 = r2.A01
            boolean r0 = r0.containsKey(r3)
            if (r0 != 0) goto L_0x017d
            java.util.Set r0 = r2.A02
            boolean r0 = r0.contains(r3)
            if (r0 == 0) goto L_0x020b
            goto L_0x017d
        L_0x020b:
            r5.add(r1)
            goto L_0x017d
        L_0x0210:
            com.whatsapp.jid.UserJid r1 = r1.A08
            X.C162457s7.A0J(r1, r4)
            java.util.Map r0 = r2.A01
            r0.remove(r1)
            java.util.Set r0 = r2.A02
            r0.remove(r1)
            X.66R r0 = r2.A03
            java.lang.Object r0 = X.C18300x5.A0d(r0)
            java.util.Set r0 = (java.util.Set) r0
            r0.remove(r1)
            goto L_0x017d
        L_0x022c:
            boolean r0 = r1.A0O
            if (r0 == 0) goto L_0x0232
            goto L_0x0193
        L_0x0232:
            r0 = 0
            goto L_0x01ba
        L_0x0234:
            if (r25 == 0) goto L_0x023c
            boolean r0 = r13.A0B
            if (r0 == 0) goto L_0x023c
            goto L_0x016c
        L_0x023c:
            com.whatsapp.jid.UserJid r0 = r13.A07
            if (r0 == 0) goto L_0x0243
            r0 = 2
            if (r2 <= r0) goto L_0x016e
        L_0x0243:
            X.4jd r0 = r13.A0X
            com.whatsapp.jid.UserJid r0 = r0.A0G()
            r13.A07 = r0
            goto L_0x016e
        L_0x024d:
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L_0x0267
            X.4FS r3 = r13.A10
            X.54N r2 = new X.54N
            r2.<init>(r13)
            X.5Lb[][] r1 = new X.C102995Lb[r11][]
            X.5Lb[] r0 = new X.C102995Lb[r4]
            java.lang.Object[] r0 = r5.toArray(r0)
            r1[r4] = r0
            r3.BkO(r2, r1)
        L_0x0267:
            java.util.ArrayList r23 = X.AnonymousClass001.A0s()
            java.util.ArrayList r22 = X.AnonymousClass001.A0s()
            java.util.Iterator r24 = X.AnonymousClass001.A0v(r26)
        L_0x0273:
            boolean r0 = r24.hasNext()
            if (r0 == 0) goto L_0x05b0
            X.5Lb r10 = X.C86664Kz.A13(r24)
            java.util.LinkedHashMap r2 = r13.A12
            com.whatsapp.jid.UserJid r9 = r10.A08
            boolean r0 = r2.containsKey(r9)
            if (r0 == 0) goto L_0x059d
            java.lang.Object r0 = r2.get(r9)
            X.C626936e.A06(r0)
            X.5Tw r0 = (X.C105175Tw) r0
            android.util.Pair r1 = r0.A08
        L_0x0292:
            boolean r0 = r2.containsKey(r9)
            if (r0 != 0) goto L_0x029d
            r0 = r22
            r0.add(r9)
        L_0x029d:
            int r2 = r26.size()
            if (r12 == 0) goto L_0x02c5
            if (r25 == 0) goto L_0x02a9
            boolean r0 = r13.A0B
            if (r0 == 0) goto L_0x02ab
        L_0x02a9:
            if (r2 <= r11) goto L_0x02c5
        L_0x02ab:
            r0 = 4
            if (r2 < r0) goto L_0x02bc
            boolean r0 = r13.A0D
            if (r0 == 0) goto L_0x02c5
            X.2sr r2 = r13.A0P
            com.whatsapp.jid.UserJid r0 = r13.A06
            boolean r0 = r2.A0a(r0)
            if (r0 != 0) goto L_0x02c5
        L_0x02bc:
            com.whatsapp.jid.UserJid r0 = r13.A07
            boolean r0 = r9.equals(r0)
            r8 = 1
            if (r0 != 0) goto L_0x02c6
        L_0x02c5:
            r8 = 0
        L_0x02c6:
            int r0 = r26.size()
            boolean r0 = r13.A0W(r0)
            if (r0 != 0) goto L_0x02d2
            if (r25 == 0) goto L_0x02e5
        L_0x02d2:
            boolean r0 = r13.A0B
            if (r0 != 0) goto L_0x02e5
            X.08M r2 = r13.A0H
            java.lang.Object r0 = r2.A07()
            if (r0 == 0) goto L_0x02e5
            boolean r0 = X.C86614Ku.A1W(r2, r9)
            r7 = 1
            if (r0 != 0) goto L_0x02e6
        L_0x02e5:
            r7 = 0
        L_0x02e6:
            boolean r0 = r14.A0G
            r20 = r0
            int r6 = r26.size()
            X.1fJ r0 = r14.A04
            r19 = r0
            X.3Ex r0 = r13.A0a
            X.3ZH r16 = r0.A0A(r9)
            int r5 = A05(r10)
            int r0 = r10.A06
            r29 = r0
            r2 = 6
            boolean r18 = X.AnonymousClass000.A1U(r0, r2)
            boolean r4 = r10.A0J
            r3 = 0
            r2 = 2
            r0 = 2131895395(0x7f122463, float:1.9425622E38)
            if (r5 == r2) goto L_0x0319
            r0 = 3
            if (r5 != r0) goto L_0x055e
            r0 = 2131895234(0x7f1223c2, float:1.9425295E38)
            if (r12 == 0) goto L_0x0319
            r0 = 2131895409(0x7f122471, float:1.942565E38)
        L_0x0319:
            java.lang.Object[] r2 = new java.lang.Object[r3]
            X.6pW r3 = X.AnonymousClass4L0.A0N(r2, r0)
        L_0x031f:
            r17 = 1
            if (r12 == 0) goto L_0x054c
            boolean r0 = r13.A0B
            if (r0 != 0) goto L_0x055a
            boolean r0 = r10.A0F
            if (r0 == 0) goto L_0x055a
            if (r3 != 0) goto L_0x055a
        L_0x032d:
            X.5Ws r2 = new X.5Ws
            r0 = r16
            r2.<init>(r0, r9)
            r2.A0J = r4
            r2.A08 = r1
            r2.A0F = r8
            r2.A0B = r7
            r2.A0K = r12
            boolean r0 = r10.A0K
            r2.A0G = r0
            if (r12 != 0) goto L_0x0549
            X.5tU r15 = r13.A0W
            boolean r0 = r15.A01(r9)
            if (r0 != 0) goto L_0x037c
            r16 = 0
            if (r19 == 0) goto L_0x0360
            X.2sj r0 = r13.A0d
            r1 = r19
            X.2zG r0 = X.C86624Kv.A0J(r0, r1, r9)
            if (r0 == 0) goto L_0x0360
            int r0 = r0.A00
            java.lang.Integer r16 = java.lang.Integer.valueOf(r0)
        L_0x0360:
            r1 = 0
            X.C162457s7.A0J(r9, r1)
            if (r16 == 0) goto L_0x0535
            int r0 = r16.intValue()
        L_0x036a:
            java.util.List r1 = X.C118405tU.A00
            int r1 = r1.size()
            if (r1 != 0) goto L_0x0379
            java.util.LinkedList r1 = X.AnonymousClass0x9.A18()
            X.C86644Kx.A1W(r1)
        L_0x0379:
            X.AnonymousClass0x2.A1I(r9, r15, r0)
        L_0x037c:
            java.lang.Integer r0 = r15.A00(r9)
            int r1 = X.C86664Kz.A0K(r0)
            r15 = 0
            r0 = -1
            if (r1 < r0) goto L_0x0389
        L_0x0388:
            r15 = 1
        L_0x0389:
            java.lang.String r0 = "colorIndex should be no less than -1"
            X.C626936e.A0D(r15, r0)
            r2.A02 = r1
            r0 = r20
            r2.A0C = r0
            r1 = 2131103208(0x7f060de8, float:1.7818876E38)
            if (r17 != 0) goto L_0x03a6
            r0 = 2
            r1 = 2131103189(0x7f060dd5, float:1.7818837E38)
            if (r5 == r0) goto L_0x03a6
            r0 = 3
            r1 = -1
            if (r5 != r0) goto L_0x03a6
            r1 = 2131103185(0x7f060dd1, float:1.781883E38)
        L_0x03a6:
            r2.A01 = r1
            r0 = r17
            r2.A0U = r0
            r1 = 3
            boolean r0 = X.AnonymousClass000.A1U(r5, r1)
            r2.A0O = r0
            if (r17 != 0) goto L_0x03bb
            if (r5 == r1) goto L_0x03bb
            r15 = 2
            r0 = 0
            if (r5 != r15) goto L_0x03bc
        L_0x03bb:
            r0 = 1
        L_0x03bc:
            r2.A0N = r0
            r2.A09 = r3
            if (r20 != 0) goto L_0x03c5
            r0 = 1
            if (r3 == 0) goto L_0x03c6
        L_0x03c5:
            r0 = 0
        L_0x03c6:
            r2.A0R = r0
            r16 = 1
            boolean r0 = X.AnonymousClass000.A1T(r7)
            r2.A0V = r0
            if (r18 != 0) goto L_0x03d7
            boolean r5 = r10.A0B
            r0 = 0
            if (r5 == 0) goto L_0x03d8
        L_0x03d7:
            r0 = 1
        L_0x03d8:
            r2.A0A = r0
            int r0 = r13.A00
            int r0 = r0 * -90
            r2.A03 = r0
            android.graphics.Bitmap r0 = r13.A0G(r9, r4)
            r2.A07 = r0
            if (r12 == 0) goto L_0x0532
            r0 = 1
            if (r8 == 0) goto L_0x03ed
            if (r6 > r11) goto L_0x03ef
        L_0x03ed:
            if (r7 == 0) goto L_0x0532
        L_0x03ef:
            r2.A0P = r0
            r15 = 1
            if (r12 == 0) goto L_0x051f
            boolean r0 = r13.A0W(r6)
            if (r0 != 0) goto L_0x0404
            X.107 r0 = r13.A0s
            java.lang.Object r0 = r0.A07()
            X.58g r5 = X.C998058g.NONE
            if (r0 == r5) goto L_0x052f
        L_0x0404:
            r2.A0Q = r15
            boolean r0 = r10.A0E
            r2.A0E = r0
            if (r12 == 0) goto L_0x040e
            if (r18 != 0) goto L_0x0410
        L_0x040e:
            r16 = 0
        L_0x0410:
            r0 = r16
            r2.A0Y = r0
            r5 = 2388(0x954, float:3.346E-42)
            r0 = r32
            int r0 = r0.A0N(r5)
            r5 = 1
            if (r12 == 0) goto L_0x051c
            if (r6 < r0) goto L_0x0519
            if (r7 != 0) goto L_0x0426
            r0 = 4
        L_0x0424:
            if (r6 < r0) goto L_0x0519
        L_0x0426:
            r2.A0M = r5
            int r0 = r10.A00
            r2.A05 = r0
            r5 = 1
            if (r6 <= r11) goto L_0x0516
            if (r4 == 0) goto L_0x0512
            com.whatsapp.voipcalling.camera.VoipCameraManager r0 = r13.A11
            X.7Oo r0 = r0.getLastCachedFrame()
            if (r0 != 0) goto L_0x0516
            boolean r0 = r13.A09
        L_0x043b:
            if (r0 != 0) goto L_0x0516
        L_0x043d:
            r2.A0Z = r5
            boolean r5 = r13.A0B
            r2.A0D = r5
            boolean r0 = r13.A16
            r2.A0L = r0
            if (r5 == 0) goto L_0x044c
            r0 = 1
            if (r3 != 0) goto L_0x044d
        L_0x044c:
            r0 = 0
        L_0x044d:
            r2.A0W = r0
            if (r5 != 0) goto L_0x045a
            if (r12 == 0) goto L_0x045a
            if (r4 == 0) goto L_0x045a
            boolean r3 = r13.A09
            r0 = 1
            if (r3 != 0) goto L_0x045b
        L_0x045a:
            r0 = 0
        L_0x045b:
            r2.A0T = r0
            if (r5 != 0) goto L_0x050f
            if (r12 == 0) goto L_0x050f
            if (r4 != 0) goto L_0x050f
            boolean r0 = r10.A0B
            if (r0 == 0) goto L_0x050f
            r3 = 1
            r0 = r29
            if (r0 != r11) goto L_0x050f
        L_0x046c:
            r2.A0S = r3
            r5 = 0
            if (r12 == 0) goto L_0x0484
            X.4C1 r0 = r13.A14
            boolean r0 = X.C86614Ku.A1a(r0)
            if (r0 == 0) goto L_0x0484
            int r3 = X.C86664Kz.A0J(r32)
            r0 = 2
            if (r3 >= r0) goto L_0x0482
            if (r18 != 0) goto L_0x0484
        L_0x0482:
            int r5 = r13.A00
        L_0x0484:
            r2.A06 = r5
            X.5QX r3 = r13.A0U
            r0 = 0
            X.C162457s7.A0J(r9, r0)
            java.util.Set r0 = r3.A03
            boolean r0 = r0.contains(r9)
            r2.A0X = r0
            if (r4 == 0) goto L_0x04a7
            r0 = 2
            if (r6 != r0) goto L_0x049d
            if (r8 != 0) goto L_0x049d
            if (r7 == 0) goto L_0x04a7
        L_0x049d:
            boolean r0 = r13.A0B
            if (r0 != 0) goto L_0x04a7
            boolean r0 = r13.A0E
            if (r0 != 0) goto L_0x04ee
            if (r7 != 0) goto L_0x04f9
        L_0x04a7:
            r3 = 0
        L_0x04a8:
            r2.A04 = r3
            if (r27 == 0) goto L_0x04eb
            r1 = 0
            r0 = r31
            X.C162457s7.A0J(r0, r1)
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r4 != 0) goto L_0x04c5
            boolean r0 = X.C627436k.A0J(r32)
            if (r0 == 0) goto L_0x04c5
            com.whatsapp.voipcalling.CallState r3 = com.whatsapp.voipcalling.CallState.REJOINING
            r0 = r31
            if (r0 != r3) goto L_0x04e3
            r1 = 1060320051(0x3f333333, float:0.7)
        L_0x04c5:
            r2.A00 = r1
            X.5Tw r1 = r2.A00()
            r0 = r23
            r0.add(r1)
            if (r7 == 0) goto L_0x04d7
            r13.A0P(r10)
            r28 = r9
        L_0x04d7:
            if (r8 == 0) goto L_0x04de
            r13.A0Q(r10)
            goto L_0x0273
        L_0x04de:
            r13.A0R(r10)
            goto L_0x0273
        L_0x04e3:
            com.whatsapp.voipcalling.CallState r3 = com.whatsapp.voipcalling.CallState.ACCEPT_SENT
            if (r0 != r3) goto L_0x04c5
            r1 = 1050253722(0x3e99999a, float:0.3)
            goto L_0x04c5
        L_0x04eb:
            r1 = 1065353216(0x3f800000, float:1.0)
            goto L_0x04c5
        L_0x04ee:
            if (r7 != 0) goto L_0x04f9
            int r1 = r10.A01
            r0 = 2
            if (r1 != r0) goto L_0x04a7
        L_0x04f5:
            r3 = 2131234087(0x7f080d27, float:1.808433E38)
            goto L_0x04a8
        L_0x04f9:
            int r0 = r10.A01
            r3 = 2131234084(0x7f080d24, float:1.8084324E38)
            if (r0 == r11) goto L_0x04a8
            r3 = 2
            if (r0 == r3) goto L_0x04f5
            r3 = 2131234080(0x7f080d20, float:1.8084316E38)
            if (r0 == r1) goto L_0x04a8
            r1 = 4
            r3 = 2131234082(0x7f080d22, float:1.808432E38)
            if (r0 == r1) goto L_0x04a8
            goto L_0x04a7
        L_0x050f:
            r3 = 0
            goto L_0x046c
        L_0x0512:
            boolean r0 = r10.A0O
            goto L_0x043b
        L_0x0516:
            r5 = 0
            goto L_0x043d
        L_0x0519:
            r5 = 0
            goto L_0x0426
        L_0x051c:
            r0 = 3
            goto L_0x0424
        L_0x051f:
            r0 = 1111(0x457, float:1.557E-42)
            r5 = r32
            boolean r0 = r5.A0X(r0)
            if (r0 == 0) goto L_0x052f
            if (r4 != 0) goto L_0x052f
            if (r21 != 0) goto L_0x052f
            goto L_0x0404
        L_0x052f:
            r15 = 0
            goto L_0x0404
        L_0x0532:
            r0 = 0
            goto L_0x03ef
        L_0x0535:
            java.util.List r16 = X.C118405tU.A00
            boolean r0 = r16.isEmpty()
            if (r0 != 0) goto L_0x05a8
            r0 = r16
            java.lang.Object r0 = r0.remove(r1)
            int r0 = X.AnonymousClass001.A0K(r0)
            goto L_0x036a
        L_0x0549:
            r1 = -1
            goto L_0x0388
        L_0x054c:
            boolean r0 = r10.A0F
            if (r0 == 0) goto L_0x055a
            r2 = 2
            if (r6 <= r2) goto L_0x032d
            r0 = 3
            if (r5 == r0) goto L_0x055a
            if (r5 == r2) goto L_0x055a
            goto L_0x032d
        L_0x055a:
            r17 = 0
            goto L_0x032d
        L_0x055e:
            r15 = 9
            r0 = 2131895407(0x7f12246f, float:1.9425646E38)
            if (r5 == r15) goto L_0x0319
            r0 = 5
            if (r5 != r0) goto L_0x059a
            if (r8 != 0) goto L_0x059a
            boolean r0 = r13.A0B
            if (r0 != 0) goto L_0x0591
            if (r18 != 0) goto L_0x0591
            if (r6 != r2) goto L_0x0591
            if (r7 != 0) goto L_0x0591
            com.whatsapp.jid.UserJid r0 = r13.A06
            if (r0 != 0) goto L_0x0591
            X.5ZU r2 = r13.A0b
            r0 = r16
            java.lang.String r2 = X.C18300x5.A0h(r2, r0)
            if (r2 == 0) goto L_0x0595
            if (r4 != 0) goto L_0x0595
            java.lang.Object[] r0 = new java.lang.Object[r11]
            r0[r3] = r2
            r2 = 2131895397(0x7f122465, float:1.9425626E38)
            X.6pW r3 = X.AnonymousClass4L0.A0N(r0, r2)
            goto L_0x031f
        L_0x0591:
            if (r12 != 0) goto L_0x059a
            if (r20 != 0) goto L_0x059a
        L_0x0595:
            r0 = 2131895405(0x7f12246d, float:1.9425642E38)
            goto L_0x0319
        L_0x059a:
            r3 = 0
            goto L_0x031f
        L_0x059d:
            java.lang.Integer r0 = X.AnonymousClass0x7.A0f()
            android.util.Pair r1 = new android.util.Pair
            r1.<init>(r0, r0)
            goto L_0x0292
        L_0x05a8:
            java.lang.String r1 = "List is empty."
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>(r1)
            throw r0
        L_0x05b0:
            X.08M r2 = r13.A0H
            java.lang.Object r1 = r2.A07()
            r0 = r28
            if (r1 == r0) goto L_0x05bd
            r2.A0H(r0)
        L_0x05bd:
            boolean r0 = X.C86604Kt.A1Z(r30)
            if (r0 == r12) goto L_0x05e7
            r0 = r30
            X.C18320x8.A18(r0, r12)
            X.107 r1 = r13.A0q
            X.2lR r0 = r13.A0e
            boolean r0 = r0.A00()
            if (r0 != 0) goto L_0x05dd
            X.4C1 r0 = r13.A15
            boolean r0 = X.C86614Ku.A1a(r0)
            if (r0 == 0) goto L_0x05dd
            r0 = 1
            if (r12 != 0) goto L_0x05de
        L_0x05dd:
            r0 = 0
        L_0x05de:
            X.C18320x8.A18(r1, r0)
            r13.A0K()
            r13.A0M()
        L_0x05e7:
            java.util.LinkedHashMap r0 = r13.A12
            r24 = r0
            java.util.Set r0 = r24.keySet()
            java.util.HashSet r3 = X.AnonymousClass0x9.A15(r0)
            java.util.Set r0 = r26.keySet()
            r3.removeAll(r0)
            java.util.Iterator r2 = r3.iterator()
        L_0x05fe:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x060e
            com.whatsapp.jid.UserJid r1 = X.C18310x6.A0T(r2)
            X.5qe r0 = r13.A0Z
            r0.A04(r1)
            goto L_0x05fe
        L_0x060e:
            boolean r0 = r22.isEmpty()
            if (r0 == 0) goto L_0x0635
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x0635
            if (r35 != 0) goto L_0x0635
            r11 = 0
        L_0x061d:
            java.util.Iterator r3 = r23.iterator()
        L_0x0621:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0944
            java.lang.Object r2 = r3.next()
            X.5Tw r2 = (X.C105175Tw) r2
            com.whatsapp.jid.UserJid r1 = r2.A0b
            r0 = r24
            r0.put(r1, r2)
            goto L_0x0621
        L_0x0635:
            if (r21 != 0) goto L_0x092d
            X.8GN r2 = r13.A0S
            X.107 r0 = r13.A0l
            boolean r1 = X.C86604Kt.A1Z(r0)
            if (r12 == 0) goto L_0x0769
            int r3 = r23.size()
            r0 = 8
            if (r3 <= r0) goto L_0x0769
            r3 = 0
            r4 = 0
        L_0x064b:
            int r0 = r23.size()
            if (r4 >= r0) goto L_0x06f1
            r0 = r23
            java.lang.Object r0 = r0.get(r4)
            X.5Tw r0 = (X.C105175Tw) r0
            boolean r0 = r0.A0J
            if (r0 == 0) goto L_0x06ed
            r0 = r23
            java.lang.Object r9 = r0.get(r4)
            X.5Tw r9 = (X.C105175Tw) r9
            r0.remove(r4)
        L_0x0668:
            X.C626936e.A06(r9)
            r4 = 31
            r0 = r23
            X.C86614Ku.A1U(r0, r4)
            r6 = 5
            java.util.List r0 = r0.subList(r3, r6)
            java.util.ArrayList r8 = X.AnonymousClass002.A0J(r0)
            int r0 = r8.size()
            int r7 = r0 + 1
            int r5 = r2.A01(r7, r1)
            int r15 = r2.A02(r7, r1)
            X.5Tw[] r10 = new X.C105175Tw[r7]
            android.util.Pair r1 = r9.A08
            int r4 = r7 + -1
            int r0 = X.C18280x3.A03(r1)
            int r2 = r15 + -1
            if (r0 != r2) goto L_0x06d7
            int r1 = X.C18290x4.A03(r1)
            int r0 = r5 + -1
            if (r1 != r0) goto L_0x06d7
        L_0x069f:
            r10[r4] = r9
            r9 = 0
        L_0x06a2:
            int r0 = r8.size()
            if (r9 >= r0) goto L_0x06f4
            java.lang.Object r2 = r8.get(r9)
            X.5Tw r2 = (X.C105175Tw) r2
            android.util.Pair r1 = r2.A08
            int r0 = X.C18280x3.A03(r1)
            if (r0 >= r15) goto L_0x06d4
            int r0 = X.C18290x4.A03(r1)
            if (r0 >= r5) goto L_0x06d4
            int r0 = X.C18280x3.A03(r1)
            int r0 = r0 * r5
            int r1 = X.C18290x4.A03(r1)
            int r0 = r0 + r1
            if (r0 < 0) goto L_0x06d4
            if (r0 >= r4) goto L_0x06d4
            r1 = r10[r0]
            if (r1 != 0) goto L_0x06d4
            r10[r0] = r2
            r8.remove(r9)
            goto L_0x06a2
        L_0x06d4:
            int r9 = r9 + 1
            goto L_0x06a2
        L_0x06d7:
            X.5Ws r0 = new X.5Ws
            r0.<init>(r9)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            int r1 = r5 + -1
            android.util.Pair r1 = X.C18290x4.A0K(r2, r1)
            r0.A08 = r1
            X.5Tw r9 = r0.A00()
            goto L_0x069f
        L_0x06ed:
            int r4 = r4 + 1
            goto L_0x064b
        L_0x06f1:
            r9 = 0
            goto L_0x0668
        L_0x06f4:
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L_0x0729
            r1 = 0
        L_0x06fb:
            if (r1 >= r7) goto L_0x0729
            r0 = r10[r1]
            if (r0 != 0) goto L_0x0766
            java.lang.Object r0 = r8.get(r3)
            X.5Tw r0 = (X.C105175Tw) r0
            X.5Ws r4 = new X.5Ws
            r4.<init>(r0)
            int r0 = r1 / r5
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            int r0 = r1 % r5
            android.util.Pair r0 = X.C18290x4.A0K(r2, r0)
            r4.A08 = r0
            X.5Tw r0 = r4.A00()
            r10[r1] = r0
            r8.remove(r3)
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L_0x0766
        L_0x0729:
            java.util.ArrayList r1 = X.AnonymousClass0x2.A0i(r10)
            int r2 = r23.size()
            r0 = r23
            java.util.List r0 = r0.subList(r6, r2)
            java.util.ArrayList r2 = X.AnonymousClass002.A0J(r0)
            r0 = 32
            X.C86614Ku.A1U(r2, r0)
            java.util.Iterator r4 = r2.iterator()
        L_0x0744:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x092b
            java.lang.Object r0 = r4.next()
            X.5Tw r0 = (X.C105175Tw) r0
            X.5Ws r2 = new X.5Ws
            r2.<init>(r0)
            r0 = -1
            android.util.Pair r0 = X.C86604Kt.A0C(r0, r3)
            r2.A08 = r0
            X.5Tw r0 = r2.A00()
            r1.add(r0)
            int r3 = r3 + 1
            goto L_0x0744
        L_0x0766:
            int r1 = r1 + 1
            goto L_0x06fb
        L_0x0769:
            int r0 = r23.size()
            if (r0 == 0) goto L_0x0917
            int r0 = r23.size()
            if (r0 == r11) goto L_0x0917
            int r0 = r23.size()
            int r20 = r2.A01(r0, r1)
            int r0 = r23.size()
            int r19 = r2.A02(r0, r1)
            java.util.HashMap r4 = X.AnonymousClass001.A0t()
            java.util.ArrayList r18 = X.AnonymousClass001.A0s()
            int r8 = r23.size()
            java.lang.Integer r5 = X.C18290x4.A0Z()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)
            if (r8 == r11) goto L_0x07a2
            r3 = 2
            if (r8 != r3) goto L_0x07f2
            java.lang.Integer r5 = X.AnonymousClass0x7.A0f()
        L_0x07a2:
            android.util.Pair r17 = new android.util.Pair
            r0 = r17
            r0.<init>(r5, r5)
        L_0x07a9:
            java.util.Iterator r10 = r23.iterator()
            r3 = 0
        L_0x07ae:
            boolean r0 = r10.hasNext()
            r5 = -1
            if (r0 == 0) goto L_0x083e
            java.lang.Object r6 = r10.next()
            X.5Tw r6 = (X.C105175Tw) r6
            boolean r0 = r6.A0J
            if (r0 == 0) goto L_0x07c1
            r3 = r6
            goto L_0x07ae
        L_0x07c1:
            android.util.Pair r9 = r6.A08
            int r0 = X.C18280x3.A03(r9)
            if (r0 == r5) goto L_0x07ec
            java.lang.Object r8 = r9.second
            int r7 = X.AnonymousClass001.A0K(r8)
            if (r7 == r5) goto L_0x07ec
            r0 = r20
            if (r7 >= r0) goto L_0x07ec
            boolean r0 = r4.containsKey(r8)
            if (r0 != 0) goto L_0x07e0
            java.lang.Object r0 = r9.second
            X.C86624Kv.A1R(r0, r4)
        L_0x07e0:
            java.lang.Object r0 = r9.second
            java.lang.Object r0 = r4.get(r0)
            java.util.List r0 = (java.util.List) r0
            r0.add(r6)
            goto L_0x07ae
        L_0x07ec:
            r0 = r18
            r0.add(r6)
            goto L_0x07ae
        L_0x07f2:
            r7 = 3
            if (r8 != r7) goto L_0x07fc
            if (r1 != 0) goto L_0x081a
            android.util.Pair r17 = X.AnonymousClass0x9.A0C(r0, r5)
            goto L_0x07a9
        L_0x07fc:
            r0 = 12
            if (r8 >= r0) goto L_0x082e
            int r6 = r2.A01(r8, r1)
            int r7 = r6 - r11
            int r5 = r2.A02(r8, r1)
            if (r8 == r11) goto L_0x082c
            if (r7 >= r6) goto L_0x082c
            r0 = 3
            if (r8 > r0) goto L_0x081f
            r5 = 1
        L_0x0812:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
        L_0x0816:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
        L_0x081a:
            android.util.Pair r17 = X.AnonymousClass0x9.A0C(r5, r0)
            goto L_0x07a9
        L_0x081f:
            int r3 = r5 + -1
            int r0 = r3 * r6
            int r8 = r8 - r0
            if (r8 > r7) goto L_0x0827
            r5 = r3
        L_0x0827:
            if (r7 != r7) goto L_0x0812
            int r5 = r5 + -1
            goto L_0x0812
        L_0x082c:
            r5 = 0
            goto L_0x0812
        L_0x082e:
            if (r1 == 0) goto L_0x0835
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            goto L_0x0816
        L_0x0835:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r7)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            goto L_0x081a
        L_0x083e:
            int r10 = r20 + -1
        L_0x0840:
            r6 = 0
            if (r10 < 0) goto L_0x08a9
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)
            boolean r0 = r4.containsKey(r0)
            if (r0 != 0) goto L_0x0854
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)
            X.C86624Kv.A1R(r0, r4)
        L_0x0854:
            java.lang.Object r9 = X.C18290x4.A0j(r4, r10)
            java.util.List r9 = (java.util.List) r9
            r0 = 33
            X.C86614Ku.A1U(r9, r0)
            int r15 = r23.size()
            int r8 = r2.A02(r15, r1)
            int r7 = r2.A01(r15, r1)
            if (r15 == r11) goto L_0x08a7
            if (r10 >= r7) goto L_0x08a7
            r0 = 3
            if (r15 > r0) goto L_0x0898
            r8 = 1
        L_0x0873:
            int r0 = r9.size()
            if (r8 > r0) goto L_0x0894
            int r0 = r9.size()
            java.util.List r7 = r9.subList(r8, r0)
            r0 = r18
            r0.addAll(r6, r7)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r10)
            java.util.List r0 = r9.subList(r6, r8)
            r4.put(r7, r0)
        L_0x0891:
            int r10 = r10 + -1
            goto L_0x0840
        L_0x0894:
            X.AnonymousClass0x2.A1H(r9, r4, r10)
            goto L_0x0891
        L_0x0898:
            int r16 = r8 + -1
            int r0 = r16 * r7
            int r15 = r15 - r0
            if (r15 > r10) goto L_0x08a1
            r8 = r16
        L_0x08a1:
            int r7 = r7 - r11
            if (r10 != r7) goto L_0x0873
            int r8 = r8 + -1
            goto L_0x0873
        L_0x08a7:
            r8 = 0
            goto L_0x0873
        L_0x08a9:
            java.util.ArrayList r1 = X.AnonymousClass001.A0s()
            r2 = 0
        L_0x08ae:
            r0 = r19
            if (r2 >= r0) goto L_0x091a
            r7 = 0
        L_0x08b3:
            r0 = r20
            if (r7 >= r0) goto L_0x0914
            java.lang.Object r9 = X.C18290x4.A0j(r4, r7)
            java.util.List r9 = (java.util.List) r9
            if (r3 == 0) goto L_0x08e1
            int r0 = X.C18280x3.A03(r17)
            if (r2 != r0) goto L_0x08e1
            int r0 = X.C18290x4.A03(r17)
            if (r7 != r0) goto L_0x08e1
            r0 = r3
        L_0x08cc:
            X.5Ws r8 = new X.5Ws
            r8.<init>(r0)
            android.util.Pair r0 = X.C86604Kt.A0C(r2, r7)
            r8.A08 = r0
            X.5Tw r0 = r8.A00()
            r1.add(r0)
        L_0x08de:
            int r7 = r7 + 1
            goto L_0x08b3
        L_0x08e1:
            int r0 = X.C18290x4.A03(r17)
            if (r7 != r0) goto L_0x08ef
            int r0 = X.C18280x3.A03(r17)
            int r8 = r2 + -1
            if (r2 > r0) goto L_0x08f0
        L_0x08ef:
            r8 = r2
        L_0x08f0:
            if (r9 == 0) goto L_0x0907
            int r0 = r9.size()
            if (r8 >= r0) goto L_0x0907
            java.lang.Object r0 = r9.get(r8)
            if (r0 == 0) goto L_0x0907
            java.lang.Object r0 = r9.get(r8)
        L_0x0902:
            X.5Tw r0 = (X.C105175Tw) r0
            if (r0 == 0) goto L_0x08de
            goto L_0x08cc
        L_0x0907:
            boolean r0 = r18.isEmpty()
            if (r0 != 0) goto L_0x08de
            r0 = r18
            java.lang.Object r0 = r0.remove(r6)
            goto L_0x0902
        L_0x0914:
            int r2 = r2 + 1
            goto L_0x08ae
        L_0x0917:
            r1 = r23
            goto L_0x092b
        L_0x091a:
            if (r3 == 0) goto L_0x092b
            int r0 = X.C18280x3.A03(r17)
            if (r0 != r5) goto L_0x092b
            int r0 = X.C18290x4.A03(r17)
            if (r0 != r5) goto L_0x092b
            r1.add(r3)
        L_0x092b:
            r23 = r1
        L_0x092d:
            int r0 = r24.size()
            if (r12 == 0) goto L_0x093f
            if (r0 != r11) goto L_0x0942
        L_0x0935:
            r24.clear()
            X.107 r0 = r13.A0u
            X.C86654Ky.A1H(r0)
            goto L_0x061d
        L_0x093f:
            if (r0 != 0) goto L_0x0942
            goto L_0x0935
        L_0x0942:
            r11 = 0
            goto L_0x0935
        L_0x0944:
            r1 = 12
            if (r12 == 0) goto L_0x094a
            r1 = 9
        L_0x094a:
            boolean r0 = r22.isEmpty()
            if (r0 != 0) goto L_0x095f
            if (r11 != 0) goto L_0x095f
            int r0 = r24.size()
            if (r0 <= r1) goto L_0x095f
            X.4UC r1 = r13.A0y
            r0 = r22
            r1.A0H(r0)
        L_0x095f:
            r13.A0L()
            boolean r0 = r13.A0B
            if (r0 == 0) goto L_0x09d5
            X.2sr r5 = r13.A0P
            com.whatsapp.jid.UserJid r0 = r13.A06
            boolean r2 = r5.A0a(r0)
            int r1 = r24.size()
            r0 = 8
            if (r1 > r0) goto L_0x0989
            boolean r0 = r13.A0D
            if (r0 == 0) goto L_0x09d3
            com.whatsapp.jid.UserJid r0 = r13.A06
            boolean r0 = r5.A0a(r0)
            if (r0 != 0) goto L_0x09d3
            int r1 = r24.size()
            r0 = 2
            if (r1 <= r0) goto L_0x09d3
        L_0x0989:
            r4 = 1
        L_0x098a:
            if (r2 != 0) goto L_0x098e
            if (r4 == 0) goto L_0x09d5
        L_0x098e:
            int r3 = r13.A00
            int r1 = r24.size()
            com.whatsapp.jid.UserJid r0 = r13.A06
            boolean r0 = r5.A0a(r0)
            X.7ZE r2 = new X.7ZE
            r2.<init>(r3, r1, r0, r4)
        L_0x099f:
            X.08M r1 = r13.A0M
            java.lang.Object r0 = r1.A07()
            boolean r0 = X.AnonymousClass75J.A00(r0, r2)
            if (r0 != 0) goto L_0x09ae
            r1.A0H(r2)
        L_0x09ae:
            boolean r0 = r14.A0G
            r13.A0A = r0
            X.1fJ r4 = r14.A04
            X.3ZH r0 = r13.A05
            if (r0 != 0) goto L_0x09ce
            r0 = 0
        L_0x09b9:
            boolean r0 = X.AnonymousClass75J.A00(r0, r4)
            if (r0 != 0) goto L_0x09cd
            X.3Ex r3 = r13.A0a
            X.2sD r2 = r13.A0h
            X.3Lq r1 = r13.A0g
            r0 = r21
            X.3ZH r0 = X.AnonymousClass36T.A01(r3, r1, r4, r2, r0)
            r13.A05 = r0
        L_0x09cd:
            return
        L_0x09ce:
            com.whatsapp.jid.Jid r0 = X.AnonymousClass3ZH.A04(r0)
            goto L_0x09b9
        L_0x09d3:
            r4 = 0
            goto L_0x098a
        L_0x09d5:
            r2 = 0
            goto L_0x099f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel.A0T(X.5XK, boolean):void");
    }

    public final void A0U(UserJid userJid) {
        AnonymousClass08M r3 = this.A0H;
        Object A072 = r3.A07();
        if (A072 == null || userJid.equals(A072)) {
            C105175Tw r0 = (C105175Tw) this.A12.get(userJid);
            if (r0 == null) {
                Log.w("voip/CallGridViewModel//toggleFocusedView participant not found");
                if (A072 != null) {
                    r3.A0H((Object) null);
                } else {
                    return;
                }
            } else {
                if (r0.A0B) {
                    userJid = null;
                }
                r3.A0H(userJid);
            }
            AnonymousClass4VK.A03(this);
            return;
        }
        Log.e("voip/CallGridViewModel//toggleFocusedView previous focused participant must be cleared before switching");
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0027 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0W(int r7) {
        /*
            r6 = this;
            X.1VX r1 = r6.A0f
            r0 = 2331(0x91b, float:3.266E-42)
            int r5 = r1.A0N(r0)
            r0 = 3807(0xedf, float:5.335E-42)
            int r1 = r1.A0N(r0)
            r0 = 2
            r4 = 0
            r3 = 1
            boolean r2 = X.C18280x3.A1U(r1, r0)
            if (r5 == 0) goto L_0x0029
            X.5NO r0 = r6.A0Q
            X.1VX r1 = r0.A02
            r0 = 1756(0x6dc, float:2.46E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 != 0) goto L_0x0029
            if (r2 != 0) goto L_0x0029
            if (r7 < r5) goto L_0x0028
        L_0x0027:
            r4 = 1
        L_0x0028:
            return r4
        L_0x0029:
            if (r7 <= r3) goto L_0x0028
            goto L_0x0027
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel.A0W(int):boolean");
    }

    public static final Pair A08(UserJid userJid, List list) {
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            C105175Tw r1 = (C105175Tw) it.next();
            if (userJid.equals(r1.A0b)) {
                it.remove();
                return AnonymousClass0x9.A0C(Integer.valueOf(i), r1);
            }
            i++;
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        if (r6.A0F != false) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.Map A09(X.AnonymousClass5XK r6) {
        /*
            java.util.LinkedHashMap r5 = X.C18320x8.A0r()
            com.whatsapp.voipcalling.CallState r1 = r6.A07
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACTIVE
            if (r1 != r0) goto L_0x000f
            boolean r0 = r6.A0F
            r4 = 1
            if (r0 == 0) goto L_0x0010
        L_0x000f:
            r4 = 0
        L_0x0010:
            X.8OQ r0 = r6.A02
            X.6aS r0 = r0.entrySet()
            X.8Nf r3 = r0.iterator()
        L_0x001a:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x003f
            java.util.Map$Entry r2 = X.AnonymousClass001.A0w(r3)
            java.lang.Object r0 = r2.getValue()
            X.5Lb r0 = (X.C102995Lb) r0
            boolean r0 = r0.A0J
            if (r0 != 0) goto L_0x003b
            java.lang.Object r0 = r2.getValue()
            X.5Lb r0 = (X.C102995Lb) r0
            int r1 = r0.A02
            r0 = 1
            if (r1 != r0) goto L_0x001a
            if (r4 == 0) goto L_0x001a
        L_0x003b:
            X.C18270x1.A1N(r5, r2)
            goto L_0x001a
        L_0x003f:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel.A09(X.5XK):java.util.Map");
    }

    public void A0V(List list) {
        if (list.size() > 1) {
            C97174xk r3 = this.A0R;
            Set set = r3.A0F;
            if (!set.containsAll(list) || set.size() != list.size()) {
                set.clear();
                set.addAll(list);
                C72173dI r2 = r3.A0B;
                r2.A02();
                r2.execute(new C117125rQ(r3, 49));
            }
        }
    }

    public CallGridViewModel(C111095hX r8, C56972sr r9, AnonymousClass5NO r10, C97174xk r11, AnonymousClass8GN r12, AnonymousClass5QX r13, AnonymousClass5TU r14, C118405tU r15, C91444jd r16, C116655qe r17, C64773Ex r18, AnonymousClass5ZU r19, C54292oU r20, C620733j r21, C56892sj r22, C52412lR r23, AnonymousClass1VX r24, C66493Lq r25, C56572sD r26, C187958y5 r27, AnonymousClass4FS r28, VoipCameraManager voipCameraManager, AnonymousClass4C1 r30, AnonymousClass4C1 r31, AnonymousClass4C1 r32) {
        Boolean bool = Boolean.FALSE;
        this.A0p = AnonymousClass4L0.A0O(bool);
        this.A0q = AnonymousClass4L0.A0O(bool);
        this.A0Y = new AnonymousClass7SG();
        this.A0F = C18330xA.A01(AnonymousClass0x2.A0T());
        this.A0J = C18330xA.A01((Object) null);
        AnonymousClass4UC A0b2 = AnonymousClass0x9.A0b();
        this.A0y = A0b2;
        this.A0m = AnonymousClass4L0.A0O(bool);
        AnonymousClass107 A0O2 = AnonymousClass4L0.A0O(bool);
        this.A0l = A0O2;
        this.A0o = AnonymousClass4L0.A0O(bool);
        this.A0k = AnonymousClass4L0.A0O(C158507k5.A04);
        this.A0M = C18330xA.A01((Object) null);
        this.A0u = AnonymousClass4L0.A0O(bool);
        this.A0v = AnonymousClass4L0.A0O(Integer.valueOf(R.style.f12nameremoved));
        this.A0L = AnonymousClass08M.A01();
        this.A0j = AnonymousClass4L0.A0O(new AnonymousClass7WK(R.dimen.f6nameremoved, !C86604Kt.A1Z(this.A0p) ? 14 : 0, C86604Kt.A1Z(A0O2)));
        this.A0t = AnonymousClass4L0.A0O(AnonymousClass001.A0N());
        this.A0s = AnonymousClass4L0.A0O(C998058g.NONE);
        this.A0i = AnonymousClass4L0.A0O(new AnonymousClass7Y7(8, (Bitmap) null));
        this.A0w = AnonymousClass0x9.A0b();
        this.A0r = AnonymousClass4L0.A0O(bool);
        this.A0x = AnonymousClass0x9.A0b();
        this.A0C = false;
        this.A0E = true;
        AnonymousClass1VX r4 = r24;
        this.A0f = r4;
        this.A0P = r9;
        this.A0c = r20;
        this.A10 = r28;
        this.A0h = r26;
        this.A0e = r23;
        this.A0O = r8;
        this.A0S = r12;
        C187958y5 r6 = r27;
        this.A0z = r6;
        this.A0a = r18;
        this.A0X = r16;
        this.A11 = voipCameraManager;
        this.A0b = r19;
        this.A0g = r25;
        this.A0Q = r10;
        this.A0d = r22;
        this.A0V = r14;
        this.A13 = r30;
        this.A14 = r31;
        this.A15 = r32;
        C116655qe r2 = r17;
        this.A0Z = r2;
        this.A0W = r15;
        this.A0U = r13;
        this.A16 = r4.A0X(2594);
        this.A0T = new C102545Jg();
        this.A12 = C18320x8.A0r();
        this.A0K = AnonymousClass08M.A01();
        this.A0I = AnonymousClass08M.A01();
        A0b2.A0H(AnonymousClass001.A0s());
        this.A0R = r11;
        r11.A06(this);
        A0T(r11.A08(), false);
        r2.A02 = this;
        boolean A042 = C620733j.A04(r21);
        AnonymousClass08M r29 = this.A0N;
        Object A072 = r29.A07();
        C626936e.A06(A072);
        AnonymousClass7Pi r1 = (AnonymousClass7Pi) A072;
        r1.A01 = R.dimen.f6nameremoved;
        if (!(r1.A08 == A042 && r1.A07)) {
            r1.A08 = A042;
            r1.A07 = true;
            r29.A0H(r1);
        }
        if (r6.BIo()) {
            C1897692o r110 = new C1897692o(r11, 1, this);
            this.A04 = r110;
            r13.A00.A0E(r110);
        }
    }
}
