package com.whatsapp.mediacomposer;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass08M;
import X.AnonymousClass0X0;
import X.AnonymousClass0x7;
import X.AnonymousClass0x9;
import X.AnonymousClass1VX;
import X.AnonymousClass30B;
import X.AnonymousClass30V;
import X.AnonymousClass314;
import X.AnonymousClass31C;
import X.AnonymousClass33D;
import X.AnonymousClass33I;
import X.AnonymousClass33O;
import X.AnonymousClass3QO;
import X.AnonymousClass4FV;
import X.AnonymousClass4L0;
import X.AnonymousClass4LD;
import X.AnonymousClass4SG;
import X.AnonymousClass5BG;
import X.AnonymousClass5GW;
import X.AnonymousClass5IY;
import X.AnonymousClass5LQ;
import X.AnonymousClass5M1;
import X.AnonymousClass5Oa;
import X.AnonymousClass5PF;
import X.AnonymousClass5PH;
import X.AnonymousClass5TZ;
import X.AnonymousClass5U6;
import X.AnonymousClass5US;
import X.AnonymousClass5Ul;
import X.AnonymousClass5VI;
import X.AnonymousClass5Y7;
import X.AnonymousClass5YF;
import X.AnonymousClass5ZC;
import X.AnonymousClass5ZR;
import X.AnonymousClass5ZU;
import X.AnonymousClass65N;
import X.AnonymousClass9Th;
import X.AnonymousClass9U4;
import X.C002002f;
import X.C06270Wx;
import X.C08310eF;
import X.C103215Lz;
import X.C104315Qm;
import X.C104435Qy;
import X.C104745Se;
import X.C105025Tg;
import X.C105305Uj;
import X.C105355Up;
import X.C105385Us;
import X.C106105Xq;
import X.C106175Xx;
import X.C106195Xz;
import X.C106985aV;
import X.C107275b2;
import X.C107355bB;
import X.C107695bk;
import X.C108845de;
import X.C113985mJ;
import X.C113995mK;
import X.C114255mk;
import X.C114755nY;
import X.C114825nf;
import X.C117615sD;
import X.C117705sM;
import X.C1226365d;
import X.C1226565f;
import X.C1232167o;
import X.C133846i2;
import X.C135166kE;
import X.C138236pz;
import X.C148287Hu;
import X.C152347Yn;
import X.C154367d3;
import X.C162287rd;
import X.C162457s7;
import X.C179418j7;
import X.C179438j9;
import X.C182598og;
import X.C18260x0;
import X.C182648ol;
import X.C18270x1;
import X.C18290x4;
import X.C182958pG;
import X.C18300x5;
import X.C18310x6;
import X.C18320x8;
import X.C18330xA;
import X.C183538qC;
import X.C186068uh;
import X.C187388x8;
import X.C1907099n;
import X.C27821ej;
import X.C27991fJ;
import X.C33131sU;
import X.C385328b;
import X.C42182Nc;
import X.C42662Pa;
import X.C44132Uu;
import X.C47122ck;
import X.C47882dz;
import X.C47912e2;
import X.C48352el;
import X.C48682fI;
import X.C48952fk;
import X.C50022hV;
import X.C50112he;
import X.C52532ld;
import X.C53412n3;
import X.C53492nB;
import X.C54292oU;
import X.C55122pp;
import X.C55832qz;
import X.C55852r1;
import X.C55972rD;
import X.C56042rK;
import X.C56422rx;
import X.C56982ss;
import X.C57012sv;
import X.C57162tC;
import X.C58152un;
import X.C58422vE;
import X.C60152y5;
import X.C620033c;
import X.C620233e;
import X.C620733j;
import X.C621033m;
import X.C624134x;
import X.C626936e;
import X.C627336j;
import X.C633138t;
import X.C64333Db;
import X.C64773Ex;
import X.C66413Li;
import X.C66543Lv;
import X.C67513Po;
import X.C69263Wi;
import X.C71353by;
import X.C71533cG;
import X.C72173dI;
import X.C72343dZ;
import X.C85244Fm;
import X.C86604Kt;
import X.C86614Ku;
import X.C86624Kv;
import X.C86634Kw;
import X.C86644Kx;
import X.C86654Ky;
import X.C86664Kz;
import X.C87984Ww;
import X.C88834as;
import X.C89644eZ;
import X.C89654ea;
import X.C91654kd;
import X.C95204sn;
import X.C95814uZ;
import X.C988953q;
import X.C989053r;
import X.C997357z;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.util.Pair;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.bridge.wfal.WfalManager;
import com.whatsapp.emoji.search.EmojiSearchProvider;
import com.whatsapp.gallerypicker.PhotoViewPager;
import com.whatsapp.mediacomposer.bottombar.BottomBarView;
import com.whatsapp.mediacomposer.bottombar.caption.CaptionView;
import com.whatsapp.mediacomposer.bottombar.filterswipe.FilterSwipeView;
import com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView;
import com.whatsapp.mediacomposer.filter.FilterSelectorController$4;
import com.whatsapp.mediaview.PhotoView;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;

public class MediaComposerActivity extends C89644eZ implements C186068uh, C182598og, C182648ol, C1226565f, C187388x8, C1226365d, C179418j7, C179438j9 {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public Bitmap A04;
    public View A05;
    public View A06;
    public FrameLayout A07;
    public Toast A08;
    public CoordinatorLayout A09;
    public C06270Wx A0A;
    public C57012sv A0B;
    public C106175Xx A0C;
    public C103215Lz A0D;
    public AnonymousClass5M1 A0E;
    public C44132Uu A0F;
    public C48352el A0G;
    public C85244Fm A0H;
    public AnonymousClass5Ul A0I;
    public C621033m A0J;
    public WfalManager A0K;
    public C42662Pa A0L;
    public AnonymousClass30B A0M;
    public C64773Ex A0N;
    public C47882dz A0O;
    public C56422rx A0P;
    public AnonymousClass5ZU A0Q;
    public C48952fk A0R;
    public C66413Li A0S;
    public AnonymousClass5U6 A0T;
    public AnonymousClass314 A0U;
    public C47912e2 A0V;
    public C54292oU A0W;
    public C57162tC A0X;
    public AnonymousClass5ZR A0Y;
    public C620733j A0Z;
    public C53412n3 A0a;
    public C42182Nc A0b;
    public C56982ss A0c;
    public C66543Lv A0d;
    public C620233e A0e;
    public C133846i2 A0f;
    public AnonymousClass5IY A0g;
    public C27821ej A0h;
    public EmojiSearchProvider A0i;
    public AnonymousClass4FV A0j;
    public C53492nB A0k;
    public PhotoViewPager A0l;
    public C113985mJ A0m;
    public C55972rD A0n;
    public C988953q A0o;
    public C620033c A0p;
    public C55852r1 A0q;
    public C162287rd A0r;
    public C52532ld A0s;
    public C105385Us A0t;
    public AnonymousClass5LQ A0u;
    public C91654kd A0v;
    public C114755nY A0w;
    public AnonymousClass4LD A0x;
    public AnonymousClass5Oa A0y;
    public C67513Po A0z;
    public C105305Uj A10;
    public AnonymousClass5GW A11;
    public C48682fI A12;
    public C106195Xz A13;
    public C50022hV A14;
    public AnonymousClass31C A15;
    public C105355Up A16;
    public C1907099n A17;
    public AnonymousClass9U4 A18;
    public AnonymousClass9Th A19;
    public C60152y5 A1A;
    public C138236pz A1B;
    public AnonymousClass33I A1C;
    public AnonymousClass5PF A1D;
    public AnonymousClass5TZ A1E;
    public C113995mK A1F;
    public AnonymousClass33O A1G;
    public C55832qz A1H;
    public AnonymousClass30V A1I;
    public C105025Tg A1J;
    public C989053r A1K;
    public C72173dI A1L;
    public C56042rK A1M;
    public C104745Se A1N;
    public C183538qC A1O;
    public C183538qC A1P;
    public Integer A1Q;
    public Long A1R;
    public Runnable A1S;
    public Runnable A1T;
    public boolean A1U;
    public boolean A1V;
    public boolean A1W;
    public boolean A1X;
    public boolean A1Y;
    public boolean A1Z;
    public boolean A1a;
    public boolean A1b;
    public boolean A1c;
    public boolean A1d;
    public boolean A1e;
    public boolean A1f;
    public boolean A1g;
    public boolean A1h;
    public boolean A1i;
    public final PointF A1j;
    public final Rect A1k;
    public final Handler A1l;
    public final Handler A1m;
    public final C106105Xq A1n;
    public final C182958pG A1o;
    public final Runnable A1p;
    public final Collection A1q;
    public final HashMap A1r;
    public final HashSet A1s;
    public final HashSet A1t;
    public final HashSet A1u;
    public final HashSet A1v;
    public final Map A1w;

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0068, code lost:
        if (r2.A07().isEmpty() != false) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00e6, code lost:
        if ((!r1.A0B.equals(r1.A01.A07())) == false) goto L_0x00e8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A7D() {
        /*
            r41 = this;
            r3 = 0
            r0 = r41
            r0.A1f = r3
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "MediaComposerActivity/sendmedia uris size = "
            r2.append(r1)
            int r1 = X.AnonymousClass4SG.A2L(r0)
            X.C18260x0.A1G(r2, r1)
            boolean r6 = r0.A7R()
            android.content.Intent r2 = r0.getIntent()
            java.lang.String r1 = "send"
            r5 = 1
            boolean r36 = r2.getBooleanExtra(r1, r5)
            X.5Us r1 = r0.A0t
            boolean r1 = r1.A0G
            if (r1 == 0) goto L_0x0046
            if (r36 == 0) goto L_0x0046
            java.util.List r1 = r0.B8s()
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x0046
            if (r6 == 0) goto L_0x0042
            X.1VX r2 = r0.A0D
            r1 = 6132(0x17f4, float:8.593E-42)
            boolean r1 = r2.A0X(r1)
            if (r1 != 0) goto L_0x0046
        L_0x0042:
            r0.A7P(r3)
            return
        L_0x0046:
            X.8qC r1 = r0.A1P
            java.lang.Object r4 = r1.get()
            androidx.fragment.app.DialogFragment r4 = (androidx.fragment.app.DialogFragment) r4
            if (r6 == 0) goto L_0x0070
            X.33e r1 = r0.A0e
            boolean r1 = r1.A0F()
            if (r1 == 0) goto L_0x006a
            X.33e r2 = r0.A0e
            int r1 = r2.A02()
            if (r1 != r5) goto L_0x0070
            java.util.List r1 = r2.A07()
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x0070
        L_0x006a:
            if (r4 == 0) goto L_0x0070
            r0.Boo(r4)
            return
        L_0x0070:
            X.5nY r1 = r0.A0w
            X.5Q1 r1 = r1.A07
            com.whatsapp.WaImageButton r1 = r1.A01
            r1.setEnabled(r3)
            r0.A79()
            r0.A7A()
            X.5Us r1 = r0.A0t
            boolean r1 = r1.A0G
            if (r1 == 0) goto L_0x0162
            X.34x r19 = r0.A77()
            android.content.Intent r6 = r0.getIntent()
            java.lang.String r4 = "picker_open_time"
            r1 = 0
            long r31 = r6.getLongExtra(r4, r1)
            android.content.Intent r2 = r0.getIntent()
            java.lang.String r1 = "number_from_url"
            boolean r35 = r2.getBooleanExtra(r1, r3)
            android.content.Intent r2 = r0.getIntent()
            java.lang.String r1 = "origin"
            int r30 = r2.getIntExtra(r1, r5)
            android.content.Intent r2 = r0.getIntent()
            java.lang.String r1 = "is_new_content"
            boolean r38 = r2.getBooleanExtra(r1, r3)
            android.content.Intent r4 = r0.getIntent()
            java.lang.String r3 = "gallery_duration_ms"
            r1 = -1
            long r33 = r4.getLongExtra(r3, r1)
            r0.A1i = r5
            X.3Wi r4 = r0.A05
            java.lang.Runnable r3 = r0.A1p
            r1 = 300(0x12c, double:1.48E-321)
            r4.A0T(r3, r1)
            X.5Us r1 = r0.A0t
            java.util.List r1 = r1.A0B
            int r1 = r1.size()
            if (r1 <= 0) goto L_0x00e8
            X.5Us r1 = r0.A0t
            java.util.List r2 = r1.A0B
            X.08M r1 = r1.A01
            java.lang.Object r1 = r1.A07()
            boolean r1 = r2.equals(r1)
            r1 = r1 ^ 1
            r40 = 1
            if (r1 != 0) goto L_0x00ea
        L_0x00e8:
            r40 = 0
        L_0x00ea:
            X.4FS r4 = r0.A04
            X.5M1 r13 = r0.A0E
            java.util.List r27 = r0.B8s()
            java.util.List r28 = X.AnonymousClass4SG.A31(r0)
            java.util.Collection r12 = r0.A1q
            X.5Xq r11 = r0.A1n
            java.util.Map r10 = r0.A1w
            java.util.HashSet r9 = r0.A1s
            X.5Us r1 = r0.A0t
            X.08M r1 = r1.A06
            int r2 = X.C86604Kt.A05(r1)
            r1 = 3
            boolean r37 = X.AnonymousClass000.A1U(r2, r1)
            X.5Us r1 = r0.A0t
            X.08M r1 = r1.A04
            java.lang.Object r1 = r1.A07()
            X.5de r1 = (X.C108845de) r1
            boolean r8 = r0.A1c
            java.lang.Integer r7 = r0.A1Q
            java.util.HashSet r6 = r0.A1v
            java.lang.Long r5 = r0.A1R
            java.util.HashSet r3 = r0.A1t
            java.lang.Long r22 = X.C86644Kx.A0f(r3)
            java.util.HashSet r2 = r0.A1u
            java.util.Iterator r18 = r2.iterator()
            r16 = 0
        L_0x012b:
            boolean r2 = r18.hasNext()
            if (r2 == 0) goto L_0x0140
            java.lang.Object r2 = r18.next()
            boolean r2 = r3.contains(r2)
            if (r2 == 0) goto L_0x012b
            r14 = 1
            long r16 = r16 + r14
            goto L_0x012b
        L_0x0140:
            java.lang.Long r23 = java.lang.Long.valueOf(r16)
            r15 = 0
            r24 = r12
            r25 = r9
            r26 = r6
            r29 = r10
            r39 = r8
            r17 = r11
            r18 = r0
            r20 = r7
            r21 = r5
            r14 = r13
            r16 = r1
            X.55i r0 = r14.A00(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r33, r35, r36, r37, r38, r39, r40)
            X.C18270x1.A0w(r0, r4)
            return
        L_0x0162:
            android.content.Intent r3 = X.C18320x8.A07()
            X.5Xq r1 = r0.A1n
            android.os.Bundle r2 = X.AnonymousClass002.A08()
            r1.A03(r2)
            java.lang.String r1 = "media_preview_params"
            r3.putExtra(r1, r2)
            X.5Us r1 = r0.A0t
            X.08M r1 = r1.A03
            java.util.Collection r1 = X.C86664Kz.A1P(r1)
            java.util.ArrayList r2 = X.AnonymousClass002.A0J(r1)
            java.lang.String r1 = "android.intent.extra.STREAM"
            r3.putParcelableArrayListExtra(r1, r2)
            r1 = -1
            r0.A02 = r1
            r0.setResult(r1, r3)
            r0.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.mediacomposer.MediaComposerActivity.A7D():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0021, code lost:
        if (r8.A0q.A04(A7R()) == false) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A7H() {
        /*
            r8 = this;
            r3 = r8
            com.whatsapp.mediacomposer.MediaComposerFragment r2 = r8.A76()
            if (r2 == 0) goto L_0x0034
            java.util.List r0 = r8.B8s()
            boolean r0 = X.C627336j.A0N(r0)
            if (r0 != 0) goto L_0x0034
            boolean r0 = r2 instanceof com.whatsapp.mediacomposer.ImageComposerFragment
            r7 = 1
            if (r0 == 0) goto L_0x0023
            X.2r1 r1 = r8.A0q
            boolean r0 = r8.A7R()
            boolean r0 = r1.A04(r0)
            r6 = 1
            if (r0 != 0) goto L_0x0024
        L_0x0023:
            r6 = 0
        L_0x0024:
            boolean r0 = r2 instanceof com.whatsapp.mediacomposer.VideoComposerFragment
            if (r0 == 0) goto L_0x0035
            X.2ld r0 = r8.A0s
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x0035
        L_0x0030:
            if (r6 != 0) goto L_0x0037
            if (r7 != 0) goto L_0x0037
        L_0x0034:
            return
        L_0x0035:
            r7 = 0
            goto L_0x0030
        L_0x0037:
            android.net.Uri r4 = r2.A00
            X.4FS r0 = r8.A04
            r5 = 3
            X.3c5 r2 = new X.3c5
            r2.<init>(r3, r4, r5, r6, r7)
            r0.BkM(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.mediacomposer.MediaComposerActivity.A7H():void");
    }

    public void BcV(C108845de r15) {
        List list;
        ArrayList A0J2;
        this.A0t.A04.A0H(r15);
        C105385Us r0 = this.A0t;
        C626936e.A06(r15);
        r0.A04.A0H(r15);
        boolean z = this.A1c;
        ArrayList A0s2 = AnonymousClass001.A0s();
        A0s2.add(C135166kE.A00);
        this.A0t.A01.A0H(Collections.unmodifiableList(A0s2));
        if (!z) {
            A7D();
        }
        this.A1c = false;
        int i = r15.A00;
        if (i == 0) {
            A0J2 = null;
        } else {
            if (i == 1) {
                list = r15.A01;
            } else {
                list = r15.A02;
            }
            A0J2 = AnonymousClass002.A0J(list);
        }
        AnonymousClass0x7.A1B(this.A0F.A00(this, A0J2, i, 0, 0, false, false, false, false), this.A04);
        A7J(C86604Kt.A05(this.A0t.A02));
    }

    public void A5r() {
        if (!this.A1b) {
            this.A1b = true;
            C88834as A2X = AnonymousClass4SG.A2X(this);
            C64333Db r2 = A2X.A4Z;
            AnonymousClass4SG.A3X(r2, this, AnonymousClass4SG.A32(r2, this));
            AnonymousClass4SG.A3Y(r2, this, C86604Kt.A0V(r2));
            this.A1J = C86614Ku.A0j(r2);
            this.A0M = (AnonymousClass30B) r2.A2K.get();
            this.A13 = (C106195Xz) r2.AKJ.get();
            this.A0I = (AnonymousClass5Ul) r2.AUW.get();
            this.A0W = C86614Ku.A0U(r2);
            this.A0c = C86614Ku.A0X(r2);
            this.A0j = C86604Kt.A0Z(r2);
            this.A0B = C86614Ku.A0J(r2);
            this.A14 = (C50022hV) r2.AFU.get();
            this.A0e = (C620233e) r2.AWq.get();
            this.A0J = (C621033m) r2.AZL.get();
            this.A0q = (C55852r1) r2.AHM.get();
            this.A0s = (C52532ld) r2.AZr.get();
            this.A0H = (C85244Fm) r2.AJ2.get();
            this.A0n = (C55972rD) r2.AJk.get();
            this.A12 = (C48682fI) r2.AKH.get();
            this.A0h = C86604Kt.A0X(r2);
            this.A0g = AnonymousClass4SG.A2j(r2);
            this.A0f = (C133846i2) r2.A00.A5A.get();
            this.A15 = C86614Ku.A0c(r2);
            this.A1N = (C104745Se) r2.Abv.get();
            this.A0N = C86604Kt.A0P(r2);
            this.A1K = C86614Ku.A0m(r2);
            this.A0r = (C162287rd) r2.AZ1.get();
            this.A0Q = C86604Kt.A0R(r2);
            this.A0Z = C86604Kt.A0W(r2);
            this.A0G = (C48352el) r2.A7i.get();
            this.A0p = (C620033c) r2.AJr.get();
            this.A18 = C86614Ku.A0f(r2);
            this.A0S = (C66413Li) r2.A6U.get();
            this.A0C = C86604Kt.A0N(r2);
            this.A0d = C86614Ku.A0Z(r2);
            this.A1M = (C56042rK) r2.AEv.get();
            this.A1H = (C55832qz) r2.AAY.get();
            this.A0R = (C48952fk) r2.A3e.get();
            this.A0V = (C47912e2) r2.AYH.get();
            this.A0K = (WfalManager) r2.AbR.get();
            this.A0o = r2.Ao7();
            this.A0i = AnonymousClass4SG.A2k(r2);
            this.A0b = (C42182Nc) r2.A7X.get();
            this.A0P = C86644Kx.A0S(r2);
            this.A0Y = C86614Ku.A0V(r2);
            this.A0m = (C113985mJ) r2.A00.A7D.get();
            this.A0U = C86634Kw.A0c(r2);
            this.A0z = (C67513Po) r2.A00.AAq.get();
            this.A1F = (C113995mK) r2.AWt.get();
            this.A17 = C86614Ku.A0e(r2);
            this.A11 = (AnonymousClass5GW) r2.A00.A7C.get();
            this.A1G = (AnonymousClass33O) r2.AX1.get();
            this.A16 = C107695bk.A2k(r2);
            this.A19 = (AnonymousClass9Th) r2.APb.get();
            this.A1A = C86614Ku.A0g(r2);
            this.A1E = (AnonymousClass5TZ) r2.A00.AB9.get();
            this.A0O = C86644Kx.A0R(r2);
            this.A1I = C86604Kt.A0f(r2);
            this.A0a = C86634Kw.A0d(r2);
            this.A0D = (C103215Lz) A2X.A11.get();
            this.A1P = C72343dZ.A00(r2.A00.A5D);
            this.A0X = (C57162tC) r2.AaV.get();
            this.A0F = (C44132Uu) A2X.A1U.get();
            this.A1O = C72343dZ.A00(r2.A7Q);
            this.A0L = C107695bk.A0c(r2);
            this.A0T = (AnonymousClass5U6) r2.A00.A2h.get();
            this.A0E = (AnonymousClass5M1) A2X.A48.get();
            this.A1D = A2X.AD1();
        }
    }

    public boolean A6C() {
        return true;
    }

    public Pair A74(C152347Yn r10, C104315Qm r11, long j, boolean z, boolean z2) {
        Runnable r1;
        long j2 = r11.A04;
        long j3 = (long) r10.A00;
        if (j > j3 * 1048576) {
            j2 = ((j2 * j3) * 1048576) / j;
        }
        int B9Q = B9Q();
        boolean z3 = false;
        if (B9Q > 0) {
            long A0A2 = C18290x4.A0A(B9Q);
            if (j2 > A0A2) {
                if (z2) {
                    C69263Wi r2 = this.A05;
                    if (z) {
                        r1 = new C71533cG(this, 41);
                    } else {
                        r1 = new C117705sM((Object) this, B9Q, 39);
                    }
                    r2.A0S(r1);
                    z3 = true;
                }
                j2 = A0A2;
            }
        }
        return AnonymousClass0x9.A0C(Long.valueOf(j2), Boolean.valueOf(z3));
    }

    public final C95204sn A75(byte b) {
        boolean contains = B8s().contains(C135166kE.A00);
        int size = B8s().size();
        int intExtra = getIntent().getIntExtra("origin", 1);
        long longExtra = getIntent().getLongExtra("picker_open_time", 0);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = this.A1c;
        C105385Us r1 = this.A0t;
        boolean z2 = !r1.A0B.equals(r1.A01.A07());
        return AnonymousClass5BG.A00(this.A09, this.A0D, this.A1Q, this.A1R, C86644Kx.A0f(this.A1t), C86644Kx.A0f(this.A1u), b, size, intExtra, longExtra, elapsedRealtime, getIntent().getLongExtra("gallery_duration_ms", -1), contains, false, z, z2);
    }

    public final MediaComposerFragment A76() {
        Uri A022 = this.A0t.A02();
        if (A022 != null) {
            Iterator A4M = C89654ea.A4M(this);
            while (A4M.hasNext()) {
                C08310eF A0D2 = AnonymousClass4L0.A0D(A4M);
                if (A0D2 instanceof MediaComposerFragment) {
                    MediaComposerFragment mediaComposerFragment = (MediaComposerFragment) A0D2;
                    if (A022.equals(mediaComposerFragment.A00)) {
                        return mediaComposerFragment;
                    }
                }
            }
        }
        return null;
    }

    public final void A78() {
        Map map = this.A1w;
        Iterator A0v2 = AnonymousClass001.A0v(map);
        while (A0v2.hasNext()) {
            AnonymousClass65N r2 = (AnonymousClass65N) A0v2.next();
            C620033c r5 = this.A0p;
            AnonymousClass3QO r3 = (AnonymousClass3QO) r2;
            C18260x0.A1P(AnonymousClass001.A0o(), "app/mediajobmanager/cancelOptimistic mediaJob=", r3);
            if (!r3.A06()) {
                C18260x0.A1S(AnonymousClass001.A0o(), "app/mediajobmanager/attempting to cancel non-optimistic job, skipped, job=", r2);
            } else {
                r3.A03 = true;
                r3.A0M.A06();
                C50112he r22 = r5.A0D;
                C633138t r1 = r3.A01().A05;
                C162457s7.A0D(r1);
                r22.A05.A00(r1).A06(r3);
                r22.A03.A06(r3);
                r22.A04.A06(r3);
                r5.A0H.A06(r3);
                C71353by.A01(r5.A0N, r5, r3, 22);
                C18260x0.A1P(AnonymousClass001.A0o(), "app/mediajobmanager/cancelled optimistic mediaJob=", r3);
            }
        }
        map.clear();
    }

    public final void A7B() {
        View A092;
        int intExtra;
        if (!this.A1i) {
            MediaComposerFragment A76 = A76();
            if (A76 == null || !A76.A1S()) {
                this.A1X = true;
                boolean z = false;
                if (AnonymousClass4SG.A2L(this) == 1 && ((intExtra = getIntent().getIntExtra("origin", 1)) == 2 || intExtra == 7 || intExtra == 12 || intExtra == 15 || intExtra == 18 || intExtra == 35 || intExtra == 38)) {
                    z = true;
                }
                if (z) {
                    finish();
                    overridePendingTransition(17432576, 17432577);
                } else if (getIntent().getIntExtra("origin", 1) == 29) {
                    finish();
                    overridePendingTransition(0, 17432577);
                } else if (this.A04 == null || A76 == null) {
                    finish();
                } else {
                    this.A06.setVisibility(0);
                    if (A76 instanceof VideoComposerFragment) {
                        VideoComposerFragment videoComposerFragment = (VideoComposerFragment) A76;
                        videoComposerFragment.A0W.A0G();
                        videoComposerFragment.A0W.A09().setAlpha(0.0f);
                        C86644Kx.A0x(videoComposerFragment.A0J(), R.id.content);
                    } else {
                        if (A76 instanceof ImageComposerFragment) {
                            A092 = ((ImageComposerFragment) A76).A08;
                        } else if (A76 instanceof GifComposerFragment) {
                            GifComposerFragment gifComposerFragment = (GifComposerFragment) A76;
                            gifComposerFragment.A00.A0G();
                            A092 = gifComposerFragment.A00.A09();
                        }
                        A092.setVisibility(4);
                    }
                    AnonymousClass0X0.A00(this);
                }
            }
        }
    }

    public final void A7C() {
        ViewGroup.MarginLayoutParams A0T2 = AnonymousClass001.A0T(this.A07);
        boolean A1U2 = AnonymousClass000.A1U(C86604Kt.A02(this), 2);
        int i = this.A03;
        if (i == -1 || A1U2) {
            i = 0;
        }
        int i2 = this.A00;
        if (i2 == -1 || A1U2) {
            i2 = 0;
        }
        A0T2.setMargins(0, i, 0, i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0056, code lost:
        if (X.AnonymousClass4SG.A45(r3) == false) goto L_0x0058;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A7E() {
        /*
            r21 = this;
            r3 = r21
            X.1VX r12 = r3.A0D
            X.5Wv r15 = r3.A0B
            X.2qk r1 = r3.A03
            X.2ss r7 = r3.A0c
            X.5Y0 r10 = r3.A0C
            X.1ej r9 = r3.A0h
            X.33i r4 = r3.A08
            X.33j r6 = r3.A0Z
            X.5IY r8 = r3.A0g
            com.whatsapp.emoji.search.EmojiSearchProvider r11 = r3.A0i
            X.33p r5 = r3.A09
            X.5Us r13 = r3.A0t
            X.2y5 r14 = r3.A1A
            java.util.List r17 = r3.B8s()
            X.5nY r0 = r3.A0w
            X.5OO r0 = r0.A04
            com.whatsapp.mediacomposer.bottombar.caption.CaptionView r0 = r0.A04
            java.lang.CharSequence r16 = r0.getCaptionText()
            if (r16 != 0) goto L_0x002e
            java.lang.String r16 = ""
        L_0x002e:
            X.5Us r0 = r3.A0t
            int r18 = r0.A00()
            X.34x r0 = r3.A77()
            r19 = 1
            if (r0 != 0) goto L_0x008b
            java.util.Collection r0 = X.AnonymousClass4SG.A30(r3)
            boolean r0 = X.C627336j.A0N(r0)
            if (r0 != 0) goto L_0x008b
        L_0x0046:
            X.5Lz r2 = r3.A0D
            X.5Us r0 = r3.A0t
            boolean r0 = r0.A06()
            if (r0 != 0) goto L_0x0058
            boolean r0 = X.AnonymousClass4SG.A45(r3)
            r20 = 1
            if (r0 != 0) goto L_0x005a
        L_0x0058:
            r20 = 0
        L_0x005a:
            X.4LD r0 = new X.4LD
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r3.A0x = r0
            r0.show()
            X.5nY r1 = r3.A0w
            X.5Us r0 = r3.A0t
            boolean r0 = r0.A06()
            r1.A02(r0)
            X.5nY r0 = r3.A0w
            X.7Hu r0 = r0.A05
            com.whatsapp.mediacomposer.bottombar.filterswipe.FilterSwipeView r1 = r0.A01
            android.widget.TextView r0 = r1.A00
            r0.clearAnimation()
            r0 = 8
            r1.setFilterSwipeTextVisibility(r0)
            X.4LD r2 = r3.A0x
            r1 = 1
            X.6AD r0 = new X.6AD
            r0.<init>(r3, r1)
            r2.setOnDismissListener(r0)
            return
        L_0x008b:
            r19 = 0
            goto L_0x0046
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.mediacomposer.MediaComposerActivity.A7E():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        if (r0.intValue() != 3) goto L_0x000c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A7F() {
        /*
            r5 = this;
            java.lang.Integer r0 = r5.A1Q
            r4 = 3
            if (r0 == 0) goto L_0x000c
            int r0 = r0.intValue()
            r3 = 1
            if (r0 == r4) goto L_0x000d
        L_0x000c:
            r3 = 0
        L_0x000d:
            X.5Xq r0 = r5.A1n
            java.util.Map r0 = r0.A00
            java.util.ArrayList r0 = X.C18300x5.A0v(r0)
            java.util.Iterator r2 = r0.iterator()
        L_0x0019:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0039
            java.lang.Object r1 = r2.next()
            X.5YF r1 = (X.AnonymousClass5YF) r1
            X.53q r0 = r5.A0o
            byte r0 = r0.A02(r1)
            if (r0 != r4) goto L_0x0019
            X.4FS r2 = r5.A04
            r1 = 41
            X.3cX r0 = new X.3cX
            r0.<init>((int) r1, (java.lang.Object) r5, (boolean) r3)
            r2.BkM(r0)
        L_0x0039:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.mediacomposer.MediaComposerActivity.A7F():void");
    }

    public final void A7I() {
        byte b;
        this.A0w.A04.A00((Integer) this.A0t.A06.A07());
        MediaComposerFragment A76 = A76();
        if (A76 != null) {
            C105385Us r0 = this.A0t;
            Uri A022 = r0.A02();
            if (A022 != null) {
                b = r0.A0A.A02(r0.A09.A00(A022));
            } else {
                b = -1;
            }
            byte byteValue = Byte.valueOf(b).byteValue();
            if (byteValue != 13 && byteValue != 29) {
                A76.A1R(AnonymousClass000.A1U(C86604Kt.A05(this.A0t.A06), 3));
                A76.A1N();
            }
        }
    }

    public final void A7K(Uri uri) {
        C105385Us r1 = this.A0t;
        r1.A0C.remove(uri);
        r1.A03();
        this.A1v.remove(uri);
        Map map = this.A1n.A00;
        Object remove = map.remove(uri);
        if (remove != null) {
            this.A1s.add(remove);
            int size = C18300x5.A0v(map).size();
            int i = this.A01;
            if (size >= i) {
                i = this.A0D.A0N(2693);
                this.A01 = i;
            }
            boolean A1W2 = C86624Kv.A1W(i, C18300x5.A0v(map).size());
            this.A1W = A1W2;
            this.A0w.A04.A04.setAddButtonActivated(A1W2);
        }
        this.A0v.A05();
        this.A0w.A08.A02.A05();
        boolean isEmpty = AnonymousClass4SG.A31(this).isEmpty();
        C105385Us r0 = this.A0t;
        if (isEmpty) {
            if (r0.A0H) {
                Intent A072 = C18320x8.A07();
                A072.putExtra("last_media_deleted", true);
                setResult(-1, A072);
            }
            finish();
            return;
        }
        if (C86604Kt.A05(r0.A02) >= 0) {
            BRS();
            BTU(0.0f);
            this.A0l.setCurrentItem(C86604Kt.A05(this.A0t.A02));
            A7J(C86604Kt.A05(this.A0t.A02));
        }
        this.A0w.A04(this.A0t.A06());
    }

    public final void A7L(Uri uri) {
        if (uri != null) {
            this.A0M.A02().A08(uri.toString());
            C33131sU A022 = this.A0M.A02();
            StringBuilder A0o2 = AnonymousClass001.A0o();
            AnonymousClass000.A1B(uri, A0o2);
            A022.A08(AnonymousClass000.A0X("-thumb", A0o2));
            C33131sU A023 = this.A0M.A02();
            StringBuilder A0o3 = AnonymousClass001.A0o();
            AnonymousClass000.A1B(uri, A0o3);
            A023.A08(AnonymousClass000.A0X("-filter", A0o3));
            this.A0M.A00().A08(AnonymousClass000.A0V(uri.toString(), "-thumb", AnonymousClass001.A0o()));
        }
    }

    public final void A7M(C108845de r5, List list) {
        this.A0y.A00(r5, list, true);
        C114755nY r3 = this.A0w;
        boolean z = !C86634Kw.A1Y(this.A0t.A01);
        CaptionView captionView = r3.A04.A04;
        captionView.getContext();
        C620733j r0 = captionView.A00;
        if (z) {
            C154367d3.A00(captionView, r0);
        } else {
            C154367d3.A01(captionView, r0);
        }
        r3.A07.A01(z);
    }

    public final void A7N(MediaComposerFragment mediaComposerFragment) {
        String str;
        String str2;
        Uri uri = mediaComposerFragment.A00;
        C106105Xq r6 = this.A1n;
        AnonymousClass5YF A002 = r6.A00(uri);
        if (!mediaComposerFragment.A0E.A0T.A04.isEmpty()) {
            C114825nf r1 = mediaComposerFragment.A0E;
            C104435Qy r0 = r1.A0N;
            str = new C106985aV(r0.A06, r0.A07, r1.A0T.A05, r0.A02).A04();
        } else {
            str = null;
        }
        A002.A0H(str);
        AnonymousClass5YF A003 = r6.A00(uri);
        if (!mediaComposerFragment.A0E.A0T.A04.isEmpty()) {
            AnonymousClass5US r02 = mediaComposerFragment.A0E.A0T;
            try {
                str2 = r02.A03.A01(r02.A04);
            } catch (JSONException e) {
                Log.e("ShapeRepository/saveEditState", e);
                str2 = null;
            }
        } else {
            str2 = null;
        }
        synchronized (A003) {
            A003.A0B = str2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x006e, code lost:
        if (A7Q() != false) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        if (r0.intValue() != 3) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0017, code lost:
        if (r2.A0I.A0U == false) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A7O(boolean r15) {
        /*
            r14 = this;
            java.lang.Integer r0 = r14.A1Q
            r4 = 1
            if (r0 == 0) goto L_0x000d
            int r1 = r0.intValue()
            r0 = 3
            r5 = 1
            if (r1 == r0) goto L_0x000e
        L_0x000d:
            r5 = 0
        L_0x000e:
            X.5Uj r2 = r14.A10
            if (r5 == 0) goto L_0x0019
            com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView r0 = r2.A0I
            boolean r0 = r0.A0U
            r1 = 1
            if (r0 != 0) goto L_0x001a
        L_0x0019:
            r1 = 0
        L_0x001a:
            com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView r3 = r2.A0I
            r0 = 2131233100(0x7f08094c, float:1.8082328E38)
            if (r1 == 0) goto L_0x0024
            r0 = 2131233101(0x7f08094d, float:1.808233E38)
        L_0x0024:
            android.graphics.drawable.Drawable r1 = X.C86644Kx.A0C(r3, r0)
            java.lang.String r2 = "mediaQualityButtonDrawable"
            if (r1 == 0) goto L_0x003a
            X.4Lt r0 = r3.A0J
            if (r0 != 0) goto L_0x0035
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r2)
            throw r0
        L_0x0035:
            r0.A04 = r1
            r0.invalidateSelf()
        L_0x003a:
            X.4Lt r1 = r3.A0J
            if (r1 != 0) goto L_0x0043
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r2)
            throw r0
        L_0x0043:
            int r0 = r3.A00
            r1.A01(r0)
            com.whatsapp.mediacomposer.MediaComposerFragment r1 = r14.A76()
            boolean r0 = r1 instanceof com.whatsapp.mediacomposer.ImageComposerFragment
            if (r0 == 0) goto L_0x0092
            if (r15 == 0) goto L_0x005b
            com.whatsapp.mediacomposer.MediaComposerFragment r0 = r14.A76()
            if (r0 == 0) goto L_0x005b
            r14.A7N(r0)
        L_0x005b:
            r3 = r1
            com.whatsapp.mediacomposer.ImageComposerFragment r3 = (com.whatsapp.mediacomposer.ImageComposerFragment) r3
            if (r5 == 0) goto L_0x012d
            android.net.Uri r1 = r1.A00
            java.util.HashSet r0 = r14.A1v
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x012d
            boolean r0 = r14.A7Q()
            if (r0 == 0) goto L_0x012d
        L_0x0070:
            boolean r0 = r3.A0A
            if (r0 == r4) goto L_0x0092
            r3.A0A = r4
            r0 = 0
            r3.A1W(r0)
            r0 = 0
            X.68i r2 = new X.68i
            r2.<init>(r3, r0)
            r3.A05 = r2
            X.8Gi r1 = new X.8Gi
            r1.<init>(r3)
            com.whatsapp.mediacomposer.MediaComposerActivity r0 = X.C86644Kx.A0Y(r3)
            X.2nB r0 = r0.A0k
            if (r0 == 0) goto L_0x0092
            r0.A02(r2, r1)
        L_0x0092:
            X.2ld r0 = r14.A0s
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x0130
            java.util.Iterator r13 = X.C89654ea.A4M(r14)
        L_0x009e:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x0130
            X.0eF r4 = X.AnonymousClass4L0.A0D(r13)
            boolean r0 = r4 instanceof com.whatsapp.mediacomposer.VideoComposerFragment
            if (r0 == 0) goto L_0x009e
            com.whatsapp.mediacomposer.VideoComposerFragment r4 = (com.whatsapp.mediacomposer.VideoComposerFragment) r4
            java.lang.Integer r0 = r14.A1Q
            int r1 = r0.intValue()
            int r0 = r4.A00
            if (r0 == r1) goto L_0x009e
            r0 = 3
            boolean r12 = X.AnonymousClass000.A1U(r1, r0)
            r4.A00 = r1
            long r0 = r4.A02
            if (r12 == 0) goto L_0x012a
            long r2 = r4.A03
        L_0x00c5:
            r4.A02 = r2
            long r7 = r4.A08
            long r5 = r4.A07
            long r10 = r7 - r5
            int r9 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r9 > 0) goto L_0x00d9
            int r9 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r9 != 0) goto L_0x00eb
            int r9 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r9 <= 0) goto L_0x00eb
        L_0x00d9:
            r0 = 1000(0x3e8, double:4.94E-321)
            long r0 = java.lang.Math.max(r2, r0)
            long r2 = r5 + r0
            X.5Qm r0 = r4.A0V
            long r0 = r0.A04
            long r7 = java.lang.Math.min(r2, r0)
            r4.A08 = r7
        L_0x00eb:
            com.whatsapp.mediacomposer.VideoTimelineView r0 = r4.A0R
            r0.A0F = r5
            r0.A0G = r7
            r0.invalidate()
            com.whatsapp.mediacomposer.VideoTimelineView r5 = r4.A0R
            boolean r0 = r4.A0d
            long r2 = r4.A02
            if (r0 == 0) goto L_0x0102
            r0 = 7000(0x1b58, double:3.4585E-320)
            long r2 = java.lang.Math.min(r2, r0)
        L_0x0102:
            r5.A0E = r2
            X.8uh r5 = X.C86664Kz.A1E(r4)
            android.net.Uri r6 = r4.A00
            long r7 = r4.A07
            long r9 = r4.A08
            r5.Bng(r6, r7, r9)
            X.5YG r3 = r4.A0W
            long r1 = r4.A07
            int r0 = (int) r1
            int r0 = r0 + 1
            r3.A0P(r0)
            r4.A1W()
            if (r12 == 0) goto L_0x0125
            r4.A1U()
            goto L_0x009e
        L_0x0125:
            r4.A1V()
            goto L_0x009e
        L_0x012a:
            long r2 = r4.A04
            goto L_0x00c5
        L_0x012d:
            r4 = 0
            goto L_0x0070
        L_0x0130:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.mediacomposer.MediaComposerActivity.A7O(boolean):void");
    }

    public Uri B4X() {
        if (C107275b2.A00) {
            return (Uri) getIntent().getParcelableExtra("animate_uri");
        }
        return null;
    }

    public List B8s() {
        return C86644Kx.A0h(this.A0t.A01);
    }

    public AnonymousClass5ZC BCP() {
        return C58152un.A02;
    }

    public void BRS() {
        A7L(this.A0t.A02());
        A79();
        C114755nY r2 = this.A0w;
        boolean A062 = this.A0t.A06();
        r2.A08.A02.A05();
        r2.A01(A062);
    }

    public void BTU(float f) {
        int i;
        float f2 = 1.0f - f;
        int i2 = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
        BottomBarView bottomBarView = this.A0w.A03;
        if (i2 == 0) {
            i = 4;
        } else {
            if (bottomBarView.getVisibility() != 0) {
                i = 0;
            }
            bottomBarView.setAlpha(f2);
        }
        bottomBarView.setVisibility(i);
        bottomBarView.setAlpha(f2);
    }

    public void BWL(ArrayList arrayList) {
        Intent A1O2;
        Intent A072;
        String str;
        this.A05.A0R(this.A1p);
        if (getIntent().getBooleanExtra("send", true) && (B8s().size() > 1 || B8s().contains(C135166kE.A00))) {
            Bqv(B8s());
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.A1w.remove(C989053r.A02(C86664Kz.A0c(it)));
        }
        A78();
        Intent A073 = C18320x8.A07();
        A073.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList);
        C86654Ky.A0x(A073, B8s());
        this.A02 = -1;
        setResult(-1, A073);
        int intExtra = getIntent().getIntExtra("product_origin", -1);
        if (getIntent().getBooleanExtra("smb_send_product", false) && intExtra == 3) {
            this.A05.A0H(R.string.f11nameremoved, 0);
        }
        if (getIntent().getBooleanExtra("start_home", false)) {
            A6T(C18300x5.A07(this).setAction("com.whatsapp.intent.action.CHATS"), true);
            return;
        }
        C105385Us r0 = this.A0t;
        if (!r0.A0B.equals(r0.A01.A07())) {
            int size = B8s().size();
            if (size == 1) {
                if (AnonymousClass000.A1W(C627336j.A03(B8s()))) {
                    A072 = C18300x5.A07(this);
                    str = "com.whatsapp.intent.action.STATUSES";
                }
                A1O2 = C86664Kz.A1B().A1O(this, (C95814uZ) B8s().get(0), 0);
                AnonymousClass5VI.A00(A1O2, "MediaComposerActivity:onMediaSent");
                startActivity(A1O2);
            } else {
                if (size != 1) {
                    if (size > 1) {
                        A072 = C18300x5.A07(this);
                        str = "com.whatsapp.intent.action.CHATS";
                    }
                }
                A1O2 = C86664Kz.A1B().A1O(this, (C95814uZ) B8s().get(0), 0);
                AnonymousClass5VI.A00(A1O2, "MediaComposerActivity:onMediaSent");
                startActivity(A1O2);
            }
            A1O2 = A072.setAction(str);
            startActivity(A1O2);
        }
        finish();
    }

    public void BcW() {
        Log.d("MediaComposerActivity/sendMedia/onStatusSendConfirmed");
        A7D();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00a5, code lost:
        if (r9 != 100) goto L_0x00a7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean dispatchTouchEvent(android.view.MotionEvent r17) {
        /*
            r16 = this;
            r4 = r16
            boolean r0 = r4.A1i
            if (r0 != 0) goto L_0x00f0
            X.5LQ r2 = r4.A0u
            com.whatsapp.gallerypicker.PhotoViewPager r9 = r4.A0l
            android.view.View r0 = r2.A06
            r7 = 0
            r5 = r17
            if (r0 == 0) goto L_0x0155
            int r1 = r5.getAction()
            r6 = 16777215(0xffffff, float:2.3509886E-38)
            r0 = 2
            r8 = 255(0xff, float:3.57E-43)
            r12 = 1
            r3 = 0
            if (r1 != r0) goto L_0x011e
            android.view.ViewGroup r11 = r2.A08
            r11.setVisibility(r7)
            android.view.ViewGroup r8 = r2.A07
            int[] r1 = r2.A0E
            r8.getLocationOnScreen(r1)
            float r0 = r5.getX()
            int r10 = (int) r0
            r0 = r1[r7]
            int r10 = r10 - r0
            float r0 = r2.A00
            int r0 = (int) r0
            int r10 = r10 - r0
            float r0 = r5.getY()
            int r4 = (int) r0
            r0 = r1[r12]
            int r4 = r4 - r0
            float r0 = r2.A01
            int r0 = (int) r0
            int r4 = r4 - r0
            r8.setPadding(r10, r4, r7, r7)
            android.view.View r10 = r2.A05
            int r0 = r11.getHeight()
            int r0 = X.C86664Kz.A0D(r9, r0)
            r10.setPadding(r7, r7, r7, r0)
            android.widget.TextView r4 = r2.A0A
            r4.getLocationOnScreen(r1)
            int r11 = X.C86634Kw.A09(r4, r1)
            int r0 = r8.getHeight()
            int r0 = r0 - r11
            if (r0 <= 0) goto L_0x00a7
            float r9 = (float) r0
            float r1 = r5.getY()
            float r0 = (float) r11
            float r1 = r1 - r0
            float r1 = r9 - r1
            r0 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 * r0
            float r0 = X.C86664Kz.A00(r1, r9, r0)
            int r9 = (int) r0
            if (r9 < 0) goto L_0x00a7
            r0 = 70
            r5 = 100
            if (r9 <= r0) goto L_0x00a7
            int r0 = r9 * 2
            int r0 = r0 / 3
            int r0 = r0 * 255
            int r0 = r0 / r5
            int r0 = r0 << 24
            r10.setBackgroundColor(r0)
            boolean r0 = r2.A0B
            if (r0 != 0) goto L_0x009a
            int r1 = r9 * 255
            int r1 = r1 / r5
            int r0 = r1 << 24
            r6 = r6 | r0
            r4.setTextColor(r6)
            android.graphics.drawable.Drawable r0 = r2.A03
            r0.setAlpha(r1)
        L_0x009a:
            r10.clearAnimation()
            android.os.Handler r1 = r2.A0C
            java.lang.Runnable r0 = r2.A0D
            r1.removeCallbacks(r0)
            r1 = 1
            if (r9 == r5) goto L_0x00a8
        L_0x00a7:
            r1 = 0
        L_0x00a8:
            r13 = 1056964608(0x3f000000, float:0.5)
            boolean r0 = r2.A0B
            if (r1 == 0) goto L_0x00f2
            if (r0 != 0) goto L_0x00eb
            r2.A0B = r12
            r0 = -65536(0xffffffffffff0000, float:NaN)
            r4.setTextColor(r0)
            android.graphics.drawable.Drawable r0 = r2.A02
            r4.setCompoundDrawablesWithIntrinsicBounds(r0, r3, r3, r3)
            float r0 = X.AnonymousClass4L0.A00(r8)
            float r0 = r0 * r13
            float r9 = X.AnonymousClass001.A04(r4, r0)
            r8 = 1065353216(0x3f800000, float:1.0)
            android.view.animation.ScaleAnimation r7 = new android.view.animation.ScaleAnimation
            r10 = r8
            r11 = r9
            r14 = r12
            r15 = r13
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15)
            android.view.animation.BounceInterpolator r0 = new android.view.animation.BounceInterpolator
            r0.<init>()
            r7.setInterpolator(r0)
            r0 = 800(0x320, double:3.953E-321)
        L_0x00da:
            r7.setDuration(r0)
            r7.setFillAfter(r12)
            r4.clearAnimation()
            r4.startAnimation(r7)
            android.widget.ImageView r0 = r2.A09
            r0.invalidate()
        L_0x00eb:
            android.view.View r0 = r2.A06
            r0.invalidate()
        L_0x00f0:
            r1 = 1
        L_0x00f1:
            return r1
        L_0x00f2:
            if (r0 == 0) goto L_0x00eb
            r2.A0B = r7
            r0 = -1
            r4.setTextColor(r0)
            android.graphics.drawable.Drawable r0 = r2.A03
            r4.setCompoundDrawablesWithIntrinsicBounds(r0, r3, r3, r3)
            float r0 = X.AnonymousClass4L0.A00(r8)
            float r0 = r0 * r13
            float r8 = X.AnonymousClass001.A04(r4, r0)
            r9 = 1065353216(0x3f800000, float:1.0)
            android.view.animation.ScaleAnimation r7 = new android.view.animation.ScaleAnimation
            r10 = r8
            r11 = r9
            r14 = r12
            r15 = r13
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15)
            android.view.animation.LinearInterpolator r0 = new android.view.animation.LinearInterpolator
            r0.<init>()
            r7.setInterpolator(r0)
            r0 = 500(0x1f4, double:2.47E-321)
            goto L_0x00da
        L_0x011e:
            int r0 = r5.getAction()
            if (r0 != r12) goto L_0x015d
            boolean r0 = r2.A0B
            if (r0 == 0) goto L_0x015d
            android.net.Uri r1 = r2.A04
            if (r1 == 0) goto L_0x0131
            com.whatsapp.mediacomposer.MediaComposerActivity r0 = r2.A0F
            r0.A7K(r1)
        L_0x0131:
            r2.A0B = r7
            r2.A04 = r3
            r2.A06 = r3
            android.view.ViewGroup r1 = r2.A08
            r0 = 8
            r1.setVisibility(r0)
            android.graphics.drawable.Drawable r1 = r2.A03
            r1.setAlpha(r8)
            android.widget.TextView r0 = r2.A0A
            r0.clearAnimation()
            r0.setTextColor(r6)
            r0.setCompoundDrawablesWithIntrinsicBounds(r1, r3, r3, r3)
            android.os.Handler r1 = r2.A0C
            java.lang.Runnable r0 = r2.A0D
            r1.removeCallbacks(r0)
        L_0x0155:
            boolean r0 = super.dispatchTouchEvent(r5)
            r1 = 0
            if (r0 == 0) goto L_0x00f1
            goto L_0x00f0
        L_0x015d:
            android.view.View r0 = r2.A06
            r0.invalidate()
            goto L_0x0131
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.mediacomposer.MediaComposerActivity.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:111:0x062d, code lost:
        if (r3 != null) goto L_0x062f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x072f, code lost:
        if (r12 != 0) goto L_0x0731;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x020a, code lost:
        if (X.C627336j.A0N(X.AnonymousClass4SG.A30(r0)) != false) goto L_0x020c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x043d, code lost:
        r15 = r6.A00((android.net.Uri) X.AnonymousClass4SG.A31(r0).get(0));
     */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x05dc  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0615  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x063d  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0671  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x06d6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r41) {
        /*
            r40 = this;
            r0 = r40
            android.view.Window r1 = r0.getWindow()
            boolean r2 = X.C107535bT.A01()
            if (r2 != 0) goto L_0x0011
            r2 = 16777216(0x1000000, float:2.3509887E-38)
            r1.addFlags(r2)
        L_0x0011:
            boolean r16 = X.C107275b2.A00
            r7 = 1
            if (r16 == 0) goto L_0x00b0
            X.C86634Kw.A1F(r1)
            r1.setAllowEnterTransitionOverlap(r7)
            r1.setAllowReturnTransitionOverlap(r7)
            android.view.animation.AccelerateDecelerateInterpolator r2 = new android.view.animation.AccelerateDecelerateInterpolator
            r2.<init>()
            android.transition.ChangeBounds r8 = new android.transition.ChangeBounds
            r8.<init>()
            r8.setInterpolator(r2)
            android.transition.ChangeTransform r6 = new android.transition.ChangeTransform
            r6.<init>()
            r6.setInterpolator(r2)
            android.transition.ChangeImageTransform r5 = new android.transition.ChangeImageTransform
            r5.<init>()
            r5.setInterpolator(r2)
            android.transition.TransitionSet r4 = new android.transition.TransitionSet
            r4.<init>()
            r4.setInterpolator(r2)
            r2 = 300(0x12c, double:1.48E-321)
            r4.setDuration(r2)
            r4.addTransition(r8)
            r4.addTransition(r6)
            r4.addTransition(r5)
            r2 = 2131428538(0x7f0b04ba, float:1.8478723E38)
            r4.excludeTarget(r2, r7)
            r2 = 2131427551(0x7f0b00df, float:1.8476721E38)
            r4.excludeTarget(r2, r7)
            r2 = 2131427552(0x7f0b00e0, float:1.8476723E38)
            r4.excludeTarget(r2, r7)
            r2 = 2131428535(0x7f0b04b7, float:1.8478717E38)
            r4.excludeTarget(r2, r7)
            r2 = 2131434713(0x7f0b1cd9, float:1.8491248E38)
            r4.excludeTarget(r2, r7)
            r2 = 2131433496(0x7f0b1818, float:1.848878E38)
            r4.excludeTarget(r2, r7)
            r1.setSharedElementEnterTransition(r4)
            android.transition.TransitionSet r2 = r4.clone()
            r1.setSharedElementReturnTransition(r2)
            X.67w r2 = new X.67w
            r2.<init>(r0, r7)
            r4.addListener(r2)
            android.transition.Fade r6 = new android.transition.Fade
            r6.<init>()
            android.transition.Fade r5 = new android.transition.Fade
            r5.<init>()
            r4 = 16908335(0x102002f, float:2.387736E-38)
            r6.excludeTarget(r4, r7)
            r3 = 16908336(0x1020030, float:2.3877364E-38)
            r6.excludeTarget(r3, r7)
            r2 = 2131430135(0x7f0b0af7, float:1.8481962E38)
            r6.excludeTarget(r2, r7)
            r5.excludeTarget(r4, r7)
            r5.excludeTarget(r3, r7)
            r1.setEnterTransition(r6)
            r1.setReturnTransition(r5)
        L_0x00b0:
            r2 = r41
            super.onCreate(r2)
            X.1VX r4 = r0.A0D
            X.5ZR r3 = r0.A0Y
            boolean r3 = com.whatsapp.RequestPermissionActivity.A0q(r0, r3, r4)
            if (r3 == 0) goto L_0x074e
            X.1VX r4 = r0.A0D
            r3 = 4908(0x132c, float:6.878E-42)
            boolean r3 = r4.A0X(r3)
            if (r3 == 0) goto L_0x00d3
            long r3 = java.lang.System.nanoTime()
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r0.A1R = r3
        L_0x00d3:
            r3 = 2131890639(0x7f1211cf, float:1.9415975E38)
            r0.setTitle(r3)
            X.4FS r4 = r0.A04
            X.2e2 r3 = r0.A0V
            X.C117615sD.A01(r4, r3)
            java.lang.String r6 = "media_quality_selection"
            r8 = 0
            if (r41 != 0) goto L_0x029c
            android.content.Intent r4 = r0.getIntent()
            java.lang.String r3 = "android.intent.extra.STREAM"
            java.util.ArrayList r24 = r4.getParcelableArrayListExtra(r3)
            android.os.Bundle r5 = X.C86614Ku.A0D(r0)
            if (r5 == 0) goto L_0x00ff
            int r3 = r5.getInt(r6, r8)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.A1Q = r3
        L_0x00ff:
            r3 = 0
            r26 = -1
            r27 = -1
        L_0x0104:
            if (r24 == 0) goto L_0x074e
            boolean r4 = r24.isEmpty()
            if (r4 != 0) goto L_0x074e
            java.util.ArrayList r8 = X.AnonymousClass001.A0s()
            X.4uZ r4 = X.C106405Yw.A00(r0)
            if (r4 == 0) goto L_0x028b
            r8.add(r4)
        L_0x0119:
            android.content.Intent r6 = r0.getIntent()
            java.lang.String r4 = "status_distribution"
            android.os.Parcelable r4 = r6.getParcelableExtra(r4)
            X.5de r4 = (X.C108845de) r4
            if (r4 != 0) goto L_0x0160
            X.5Se r4 = r0.A1N
            boolean r4 = r4.A00()
            if (r4 == 0) goto L_0x0274
            com.whatsapp.bridge.wfal.WfalManager r4 = r0.A0K
            boolean r4 = r4.A02()
            if (r4 != 0) goto L_0x0274
            java.lang.Boolean r9 = java.lang.Boolean.TRUE
            X.2rK r6 = r0.A1M
            X.21S r4 = X.AnonymousClass21S.A0N
            java.lang.Boolean r4 = r6.A01(r4)
            boolean r9 = r9.equals(r4)
        L_0x0145:
            r6 = 0
        L_0x0146:
            X.33e r4 = r0.A0e
            java.util.List r11 = r4.A07()
            X.33e r4 = r0.A0e
            java.util.List r12 = r4.A08()
            X.33e r4 = r0.A0e
            int r13 = r4.A02()
            X.5de r4 = new X.5de
            r10 = r4
            r14 = r9
            r15 = r6
            r10.<init>(r11, r12, r13, r14, r15)
        L_0x0160:
            android.content.Intent r9 = r0.getIntent()
            java.lang.String r6 = "origin"
            r11 = 1
            int r17 = r9.getIntExtra(r6, r7)
            X.53q r13 = r0.A0o
            X.5Xq r6 = r0.A1n
            X.2rx r12 = r0.A0P
            android.content.Intent r10 = r0.getIntent()
            java.lang.String r9 = "send"
            boolean r29 = r10.getBooleanExtra(r9, r7)
            android.content.Intent r10 = r0.getIntent()
            java.lang.String r9 = "smb_quick_reply"
            r7 = 0
            r10.getBooleanExtra(r9, r7)
            android.content.Intent r9 = r0.getIntent()
            java.lang.String r7 = "should_send_media"
            boolean r30 = r9.getBooleanExtra(r7, r11)
            android.content.Intent r10 = r0.getIntent()
            java.lang.String r9 = "should_hide_caption_view"
            r7 = 0
            boolean r31 = r10.getBooleanExtra(r9, r7)
            X.2fk r11 = r0.A0R
            android.content.Intent r10 = r0.getIntent()
            java.lang.String r9 = "show_delete_thumbnail_for_single_media"
            boolean r32 = r10.getBooleanExtra(r9, r7)
            android.content.Intent r10 = r0.getIntent()
            java.lang.String r9 = "set_result_when_last_media_deleted"
            boolean r33 = r10.getBooleanExtra(r9, r7)
            android.content.Intent r10 = r0.getIntent()
            java.lang.String r9 = "disable_converting_video_to_gif_option"
            boolean r34 = r10.getBooleanExtra(r9, r7)
            X.5Us r7 = new X.5Us
            r21 = r4
            r22 = r6
            r23 = r13
            r25 = r8
            r28 = r17
            r18 = r7
            r19 = r12
            r20 = r11
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            r0.A0t = r7
            r4 = 267(0x10b, float:3.74E-43)
            X.92m r9 = X.AnonymousClass4L0.A0G(r0, r4)
            X.08M r4 = r7.A06
            r4.A0B(r0, r9)
            X.5Us r9 = r0.A0t
            r4 = 253(0xfd, float:3.55E-43)
            X.6C6 r7 = X.AnonymousClass6C6.A00(r0, r4)
            X.08M r4 = r9.A05
            r4.A0B(r0, r7)
            X.2y5 r7 = r0.A1A
            X.33i r4 = r0.A08
            int r7 = X.AnonymousClass34G.A01(r4, r7)
            r4 = 2013(0x7dd, float:2.821E-42)
            if (r7 < r4) goto L_0x020c
            android.content.Intent r7 = r0.getIntent()
            java.lang.String r4 = "smb_send_product"
            boolean r4 = X.AnonymousClass0x9.A1N(r7, r4)
            if (r4 != 0) goto L_0x020c
            java.util.Collection r4 = X.AnonymousClass4SG.A30(r0)
            boolean r7 = X.C627336j.A0N(r4)
            r4 = 1
            if (r7 == 0) goto L_0x020d
        L_0x020c:
            r4 = 0
        L_0x020d:
            r0.A1f = r4
            if (r5 == 0) goto L_0x0214
            r6.A02(r5)
        L_0x0214:
            android.content.Intent r5 = r0.getIntent()
            java.lang.String r4 = "first_caption"
            java.lang.String r11 = r5.getStringExtra(r4)
            android.content.Intent r5 = r0.getIntent()
            java.lang.String r4 = "android.intent.extra.TEXT"
            java.lang.String r10 = r5.getStringExtra(r4)
            r9 = 0
        L_0x0229:
            int r4 = X.AnonymousClass4SG.A2L(r0)
            if (r9 >= r4) goto L_0x02cb
            java.util.List r4 = X.AnonymousClass4SG.A31(r0)
            java.lang.Object r7 = r4.get(r9)
            android.net.Uri r7 = (android.net.Uri) r7
            X.5YF r12 = r6.A00(r7)
            boolean r4 = android.text.TextUtils.isEmpty(r10)
            if (r4 != 0) goto L_0x0246
            r12.A0G(r10)
        L_0x0246:
            java.lang.String r4 = "caption"
            java.lang.String r5 = r7.getQueryParameter(r4)
            boolean r4 = android.text.TextUtils.isEmpty(r5)
            if (r4 != 0) goto L_0x0255
            r12.A0G(r5)
        L_0x0255:
            if (r9 != 0) goto L_0x025c
            if (r11 == 0) goto L_0x025c
            r12.A0G(r11)
        L_0x025c:
            if (r3 != 0) goto L_0x026b
            long r4 = (long) r9
        L_0x025f:
            java.lang.Long r5 = java.lang.Long.valueOf(r4)
            java.util.HashMap r4 = r0.A1r
            r4.put(r7, r5)
            int r9 = r9 + 1
            goto L_0x0229
        L_0x026b:
            java.lang.Object r4 = r3.get(r9)
            long r4 = X.C18310x6.A0B(r4)
            goto L_0x025f
        L_0x0274:
            com.whatsapp.bridge.wfal.WfalManager r4 = r0.A0K
            boolean r4 = r4.A02()
            if (r4 == 0) goto L_0x0288
            com.whatsapp.bridge.wfal.WfalManager r4 = r0.A0K
            X.2ye r4 = r4.A00()
            boolean r9 = r4.A00
            boolean r6 = r4.A01
            goto L_0x0146
        L_0x0288:
            r9 = 0
            goto L_0x0145
        L_0x028b:
            java.lang.Class<X.4uZ> r9 = X.C95814uZ.class
            android.content.Intent r6 = r0.getIntent()
            java.lang.String r4 = "jids"
            java.util.List r4 = X.C86634Kw.A12(r6, r9, r4)
            r8.addAll(r4)
            goto L_0x0119
        L_0x029c:
            java.lang.String r3 = "uris"
            java.util.ArrayList r24 = r2.getParcelableArrayList(r3)
            java.lang.String r3 = "ids"
            java.io.Serializable r3 = r2.getSerializable(r3)
            java.util.AbstractList r3 = (java.util.AbstractList) r3
            java.lang.String r4 = "position"
            int r26 = r2.getInt(r4)
            java.lang.String r4 = "optimistic_started"
            boolean r4 = r2.getBoolean(r4)
            r0.A1g = r4
            java.lang.String r4 = "view_once"
            int r27 = r2.getInt(r4)
            int r4 = r2.getInt(r6)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0.A1Q = r4
            r5 = r2
            goto L_0x0104
        L_0x02cb:
            X.1VX r4 = r0.A0D
            r3 = 5976(0x1758, float:8.374E-42)
            boolean r3 = r4.A0X(r3)
            if (r3 == 0) goto L_0x0746
            r3 = 2131625388(0x7f0e05ac, float:1.8877983E38)
            r0.setContentView((int) r3)
            r3 = 2131430047(0x7f0b0a9f, float:1.8481784E38)
            android.view.View r3 = r0.findViewById(r3)
            androidx.coordinatorlayout.widget.CoordinatorLayout r3 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r3
            r0.A09 = r3
        L_0x02e6:
            android.view.View r4 = r0.A00
            r3 = 2131428108(0x7f0b030c, float:1.8477851E38)
            android.view.View r12 = X.C06560Yg.A02(r4, r3)
            com.whatsapp.mediacomposer.bottombar.BottomBarView r12 = (com.whatsapp.mediacomposer.bottombar.BottomBarView) r12
            X.5Us r5 = r0.A0t
            r3 = 265(0x109, float:3.71E-43)
            X.92m r4 = X.AnonymousClass4L0.A0G(r0, r3)
            X.08M r3 = r5.A01
            r3.A0B(r0, r4)
            X.5Us r5 = r0.A0t
            r3 = 266(0x10a, float:3.73E-43)
            X.92m r4 = X.AnonymousClass4L0.A0G(r0, r3)
            X.08M r3 = r5.A04
            r3.A0B(r0, r4)
            android.view.LayoutInflater r5 = android.view.LayoutInflater.from(r0)
            r4 = 2131626188(0x7f0e08cc, float:1.8879605E38)
            r3 = 2131432604(0x7f0b149c, float:1.848697E38)
            android.view.ViewGroup r3 = X.C86664Kz.A0m(r0, r3)
            android.view.View r4 = X.C86664Kz.A0h(r5, r3, r4)
            r3 = 2131434298(0x7f0b1b3a, float:1.8490406E38)
            android.view.View r9 = r4.findViewById(r3)
            com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView r9 = (com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView) r9
            androidx.coordinatorlayout.widget.CoordinatorLayout r7 = r0.A09
            X.7E6 r5 = new X.7E6
            r5.<init>(r0)
            X.5Us r4 = r0.A0t
            X.5Uj r3 = new X.5Uj
            r3.<init>(r7, r4, r5, r9)
            r0.A10 = r3
            X.5Us r5 = r0.A0t
            int r4 = r5.A00
            r3 = 35
            if (r4 != r3) goto L_0x0363
            X.53q r4 = r0.A0o
            X.08M r3 = r5.A03
            java.util.List r3 = X.C86644Kx.A0h(r3)
            java.lang.Object r3 = X.C18290x4.A0k(r3)
            android.net.Uri r3 = (android.net.Uri) r3
            X.5YF r3 = r6.A00(r3)
            byte r4 = r4.A01(r3)
            r3 = 13
            if (r4 == r3) goto L_0x035b
            r3 = 3
            if (r4 != r3) goto L_0x0363
        L_0x035b:
            X.5Uj r3 = r0.A10
            r4 = 4
            com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView r3 = r3.A0I
            r3.setMediaToolsVisibility(r4)
        L_0x0363:
            X.1VX r3 = r0.A0D
            int r3 = X.C86664Kz.A0I(r3)
            r0.A01 = r3
            X.30B r9 = r0.A0M
            X.33i r5 = r0.A08
            android.os.Handler r7 = r0.A1l
            java.lang.String r4 = "media-composer"
            X.2nB r3 = new X.2nB
            r3.<init>(r7, r9, r5, r4)
            r0.A0k = r3
            X.5LQ r3 = new X.5LQ
            r3.<init>(r0, r0)
            r0.A0u = r3
            r3 = 1024(0x400, float:1.435E-42)
            r1.addFlags(r3)
            X.33i r4 = r0.A08
            r3 = 2131431279(0x7f0b0f6f, float:1.8484283E38)
            android.view.View r3 = r0.findViewById(r3)
            X.C107535bT.A00(r3, r1, r4)
            r4 = 1284(0x504, float:1.799E-42)
            android.view.View r3 = r1.getDecorView()
            r3.setSystemUiVisibility(r4)
            r3 = 2131432604(0x7f0b149c, float:1.848697E38)
            android.view.View r5 = r0.findViewById(r3)
            r0.A05 = r5
            int r4 = r5.getPaddingBottom()
            r3 = 0
            r5.setPadding(r3, r3, r3, r4)
            r3 = 67108864(0x4000000, float:1.5046328E-36)
            r1.addFlags(r3)
            X.C111095hX.A08(r1)
            r3 = 2131432606(0x7f0b149e, float:1.8486974E38)
            android.view.View r3 = r0.findViewById(r3)
            android.widget.FrameLayout r3 = (android.widget.FrameLayout) r3
            r0.A07 = r3
            android.content.Intent r4 = r0.getIntent()
            java.lang.String r3 = "preview_top_margin"
            r11 = -1
            int r3 = r4.getIntExtra(r3, r11)
            r0.A03 = r3
            android.content.Intent r4 = r0.getIntent()
            java.lang.String r3 = "preview_bottom_margin"
            int r3 = r4.getIntExtra(r3, r11)
            r0.A00 = r3
            android.view.View r4 = r0.A05
            r3 = 0
            r4.setFitsSystemWindows(r3)
            android.view.View r3 = r0.A05
            r3.invalidate()
            r0.A7C()
            r3 = 2131432045(0x7f0b126d, float:1.8485836E38)
            android.view.View r5 = r0.findViewById(r3)
            com.whatsapp.gallerypicker.PhotoViewPager r5 = (com.whatsapp.gallerypicker.PhotoViewPager) r5
            r0.A0l = r5
            float r4 = X.C86604Kt.A00(r0)
            r3 = 1094713344(0x41400000, float:12.0)
            float r4 = r4 * r3
            int r3 = (int) r4
            r5.setPageMargin(r3)
            com.whatsapp.gallerypicker.PhotoViewPager r4 = r0.A0l
            r3 = 0
            r9 = 0
            r4.A0H(r3, r9)
            com.whatsapp.gallerypicker.PhotoViewPager r4 = r0.A0l
            X.5mn r3 = new X.5mn
            r3.<init>(r0)
            r4.A04 = r3
            r5 = 0
            X.90q r3 = new X.90q
            r3.<init>(r0, r9)
            r4.A0W = r3
            r4.setFocusable(r9)
            r3 = 2131432608(0x7f0b14a0, float:1.8486978E38)
            android.widget.ImageView r10 = X.C86654Ky.A0M(r0, r3)
            r3 = 2131432609(0x7f0b14a1, float:1.848698E38)
            android.view.View r3 = r0.findViewById(r3)
            r0.A06 = r3
            android.content.Intent r4 = r0.getIntent()
            java.lang.String r3 = "product_origin"
            int r11 = r4.getIntExtra(r3, r11)
            android.content.Intent r4 = r0.getIntent()
            java.lang.String r3 = "smb_send_product"
            boolean r3 = r4.getBooleanExtra(r3, r9)
            if (r3 == 0) goto L_0x0471
            java.util.List r3 = X.AnonymousClass4SG.A31(r0)
            java.lang.Object r3 = r3.get(r9)
            android.net.Uri r3 = (android.net.Uri) r3
            X.5YF r15 = r6.A00(r3)
            java.lang.String r3 = r15.A09()
            if (r3 == 0) goto L_0x0471
            android.text.SpannableStringBuilder r13 = X.C18330xA.A00(r3)
            X.5Xz r14 = r0.A13
            r9 = 0
            X.2fI r4 = r0.A12
            java.lang.String r3 = r15.A0B()
            java.util.List r3 = r4.A00(r3)
            r4 = 1
            r14.A05(r0, r13, r9, r3)
            X.5nY r3 = r0.A0w
            r3.A00(r13, r4)
            r3 = 2
            if (r11 != r3) goto L_0x0471
            r0.A7E()
        L_0x0471:
            r3 = 2131428538(0x7f0b04ba, float:1.8478723E38)
            android.view.View r13 = X.C06560Yg.A02(r12, r3)
            com.whatsapp.mediacomposer.bottombar.caption.CaptionView r13 = (com.whatsapp.mediacomposer.bottombar.caption.CaptionView) r13
            X.2ss r11 = r0.A0c
            X.5Y0 r9 = r0.A0C
            X.33i r4 = r0.A08
            X.2y5 r3 = r0.A1A
            X.5OO r34 = new X.5OO
            r35 = r4
            r36 = r11
            r37 = r9
            r38 = r13
            r39 = r3
            r34.<init>(r35, r36, r37, r38, r39)
            X.5Lz r4 = r0.A0D
            r3 = 2131431317(0x7f0b0f95, float:1.848436E38)
            android.view.View r3 = X.C06560Yg.A02(r12, r3)
            com.whatsapp.mediacomposer.bottombar.recipients.RecipientsView r3 = (com.whatsapp.mediacomposer.bottombar.recipients.RecipientsView) r3
            X.5Oa r3 = r4.A00(r3)
            r0.A0y = r3
            r3 = 2131430134(0x7f0b0af6, float:1.848196E38)
            android.view.View r3 = X.C06560Yg.A02(r12, r3)
            com.whatsapp.mediacomposer.bottombar.filterswipe.FilterSwipeView r3 = (com.whatsapp.mediacomposer.bottombar.filterswipe.FilterSwipeView) r3
            X.7Hu r11 = new X.7Hu
            r11.<init>(r3)
            r3 = 2131434269(0x7f0b1b1d, float:1.8490347E38)
            androidx.recyclerview.widget.RecyclerView r19 = X.C86654Ky.A0P(r12, r3)
            com.whatsapp.gallerypicker.PhotoViewPager r3 = r0.A0l
            r27 = r3
            X.5Y0 r3 = r0.A0C
            r23 = r3
            X.53r r3 = r0.A1K
            r32 = r3
            X.53q r3 = r0.A0o
            r28 = r3
            X.5LQ r3 = r0.A0u
            r30 = r3
            X.2nB r3 = r0.A0k
            r26 = r3
            X.33j r3 = r0.A0Z
            r18 = r3
            X.5Us r15 = r0.A0t
            java.util.HashSet r14 = r0.A1s
            X.30B r3 = r0.A0M
            X.1sU r20 = r3.A00()
            X.33O r13 = r0.A1G
            X.6i2 r4 = r0.A0f
            X.1VX r3 = r0.A0D
            X.5nZ r9 = new X.5nZ
            r21 = r18
            r22 = r4
            r24 = r3
            r25 = r6
            r29 = r15
            r31 = r13
            r33 = r14
            r18 = r9
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            X.4Ww r4 = r9.A02
            r3 = 1
            r4.A00 = r3
            r4.A05()
            r3 = 2131433496(0x7f0b1818, float:1.848878E38)
            com.whatsapp.WaImageButton r4 = X.C86664Kz.A10(r12, r3)
            X.33j r3 = r0.A0Z
            X.5Q1 r14 = new X.5Q1
            r14.<init>(r4, r3)
            X.5Us r15 = r0.A0t
            X.5Oa r13 = r0.A0y
            r4 = 2614(0xa36, float:3.663E-42)
            X.5nY r3 = new X.5nY
            r33 = r12
            r35 = r11
            r36 = r13
            r37 = r14
            r38 = r9
            r31 = r3
            r32 = r15
            r31.<init>(r32, r33, r34, r35, r36, r37, r38)
            r0.A0w = r3
            X.34x r9 = r0.A77()
            r13 = 1
            if (r9 != 0) goto L_0x0743
            java.util.Collection r9 = X.AnonymousClass4SG.A30(r0)
            boolean r9 = X.C627336j.A0N(r9)
            if (r9 != 0) goto L_0x0743
        L_0x053a:
            r3.A00 = r0
            r3.A01 = r0
            X.5OO r9 = r3.A04
            com.whatsapp.mediacomposer.bottombar.caption.CaptionView r12 = r9.A04
            r12.setCaptionButtonsListener(r3)
            com.whatsapp.mentions.MentionableEntry r11 = r12.A0E
            r9 = 16
            X.AnonymousClass54E.A00(r11, r3, r12, r9)
            X.5nZ r9 = r3.A08
            r9.A03 = r3
            r9.A04 = r0
            X.5Q1 r12 = r3.A07
            com.whatsapp.WaImageButton r11 = r12.A01
            r9 = 17
            X.AnonymousClass54E.A00(r11, r3, r12, r9)
            com.whatsapp.mediacomposer.bottombar.BottomBarView r12 = r3.A03
            r11 = 14
            X.54E r9 = new X.54E
            r9.<init>(r0, r11, r3)
            r12.setAddStandaloneButtonClick(r9)
            if (r13 == 0) goto L_0x0570
            X.5Oa r9 = r3.A06
            com.whatsapp.mediacomposer.bottombar.recipients.RecipientsView r9 = r9.A04
            r9.setRecipientsListener(r3)
        L_0x0570:
            X.34x r3 = r0.A77()
            if (r3 != 0) goto L_0x0734
            java.util.Collection r3 = X.AnonymousClass4SG.A30(r0)
            boolean r3 = X.C627336j.A0N(r3)
            if (r3 != 0) goto L_0x0734
        L_0x0580:
            r0.A7I()
            X.5Us r3 = r0.A0t
            java.util.List r3 = r3.A0B
            boolean r3 = X.C627336j.A0N(r3)
            if (r3 == 0) goto L_0x06f6
            X.1VX r9 = r0.A0D
            r3 = 5643(0x160b, float:7.908E-42)
            boolean r3 = r9.A0X(r3)
            if (r3 != 0) goto L_0x06f6
        L_0x0597:
            r4 = 0
        L_0x0598:
            r0.A1W = r4
            X.5nY r3 = r0.A0w
            X.5OO r3 = r3.A04
            com.whatsapp.mediacomposer.bottombar.caption.CaptionView r3 = r3.A04
            r3.setAddButtonActivated(r4)
            android.content.Intent r11 = r0.getIntent()
            java.lang.String r9 = "quoted_message_row_id"
            r3 = 0
            long r11 = r11.getLongExtra(r9, r3)
            int r9 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r9 != 0) goto L_0x05b9
            boolean r3 = r0.A7S()
            if (r3 == 0) goto L_0x05cb
        L_0x05b9:
            X.5nY r3 = r0.A0w
            X.5OO r3 = r3.A04
            com.whatsapp.mediacomposer.bottombar.caption.CaptionView r9 = r3.A04
            com.whatsapp.WaImageButton r4 = r9.A0C
            r3 = 8
            r4.setVisibility(r3)
            android.view.View r3 = r9.A07
            r3.setVisibility(r5)
        L_0x05cb:
            X.5nY r4 = r0.A0w
            X.5Us r3 = r0.A0t
            boolean r3 = r3.A06()
            r4.A04(r3)
            r4 = 37
            r3 = r17
            if (r3 != r4) goto L_0x06d6
            X.5nY r3 = r0.A0w
            X.5OO r3 = r3.A04
            com.whatsapp.mediacomposer.bottombar.caption.CaptionView r4 = r3.A04
            r3 = 4
            r4.setVisibility(r3)
            X.5nY r3 = r0.A0w
            com.whatsapp.mediacomposer.bottombar.BottomBarView r3 = r3.A03
            r3.setAddStandaloneButtonVisibility(r5)
        L_0x05ed:
            com.whatsapp.gallerypicker.PhotoViewPager r4 = r0.A0l
            r3 = 6
            X.AnonymousClass6B8.A00(r4, r0, r3)
            android.net.Uri r11 = r0.B4X()
            if (r16 == 0) goto L_0x0651
            if (r11 == 0) goto L_0x0651
            X.30B r3 = r0.A0M
            X.1sU r9 = r3.A02()
            java.lang.StringBuilder r4 = X.C18290x4.A0v(r11)
            java.lang.String r3 = "-media_view"
            java.lang.String r3 = X.AnonymousClass000.A0X(r3, r4)
            java.lang.Object r3 = r9.A06(r3)
            android.graphics.Bitmap r3 = (android.graphics.Bitmap) r3
            r0.A04 = r3
            if (r3 != 0) goto L_0x062f
            X.30B r3 = r0.A0M
            X.1sU r9 = r3.A02()
            java.lang.StringBuilder r4 = X.C18290x4.A0v(r11)
            java.lang.String r3 = "-gallery_thumb"
            java.lang.String r3 = X.AnonymousClass000.A0X(r3, r4)
            java.lang.Object r3 = r9.A06(r3)
            android.graphics.Bitmap r3 = (android.graphics.Bitmap) r3
            r0.A04 = r3
            if (r3 == 0) goto L_0x0651
        L_0x062f:
            java.lang.String r3 = r11.toString()
            X.AnonymousClass0YZ.A0F(r10, r3)
            android.graphics.Bitmap r3 = r0.A04
            r10.setImageBitmap(r3)
            if (r41 != 0) goto L_0x0642
            android.view.View r2 = r0.A06
            r2.setVisibility(r5)
        L_0x0642:
            r0.A5U()
            r2 = 34
            X.3by r3 = new X.3by
            r3.<init>(r0, r2, r1)
            r1 = 2000(0x7d0, double:9.88E-321)
            r7.postDelayed(r3, r1)
        L_0x0651:
            android.content.Intent r2 = r0.getIntent()
            java.lang.String r1 = "scan_for_qr"
            boolean r1 = r2.getBooleanExtra(r1, r5)
            r0.A1h = r1
            X.5nY r4 = r0.A0w
            X.5Us r1 = r0.A0t
            boolean r3 = r1.A06()
            com.whatsapp.mediacomposer.bottombar.BottomBarView r2 = r4.A03
            r1 = 4
            r2.setVisibility(r1)
            X.5nZ r1 = r4.A08
            r2 = 8
            if (r3 == 0) goto L_0x0672
            r2 = 4
        L_0x0672:
            androidx.recyclerview.widget.RecyclerView r1 = r1.A06
            r1.setVisibility(r2)
            r1 = 2131432721(0x7f0b1511, float:1.8487207E38)
            X.C18280x3.A0r(r0, r1, r5)
            X.4FS r4 = r0.A04
            X.1VX r11 = r0.A0D
            X.53r r3 = r0.A1K
            X.53q r2 = r0.A0o
            X.2y5 r1 = r0.A1A
            X.33i r10 = r0.A08
            X.2Sy r9 = new X.2Sy
            r12 = r6
            r13 = r2
            r14 = r1
            r15 = r3
            r16 = r4
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            X.5Us r1 = r0.A0t
            X.08M r1 = r1.A03
            java.lang.Object r4 = r1.A07()
            X.4UC r3 = X.AnonymousClass0x9.A0b()
            X.4FS r2 = r9.A06
            r1 = 49
            X.C70343aL.A01(r2, r9, r4, r3, r1)
            r0.A0A = r3
            r1 = 252(0xfc, float:3.53E-43)
            X.AnonymousClass6C6.A01(r0, r3, r1)
            X.5Us r1 = r0.A0t
            X.08M r1 = r1.A06
            r1.A07()
            r0.A7I()
            int r1 = r8.size()
            r2 = 1
            if (r1 > r2) goto L_0x06cd
            int r1 = r8.size()
            if (r1 != r2) goto L_0x06d2
            java.lang.Object r1 = r8.get(r5)
            boolean r1 = r1 instanceof com.whatsapp.jid.UserJid
            if (r1 != 0) goto L_0x06d2
        L_0x06cd:
            X.2hV r1 = r0.A14
            r1.A01(r8)
        L_0x06d2:
            X.AnonymousClass4SG.A3d(r0)
            return
        L_0x06d6:
            r4 = 35
            if (r3 != r4) goto L_0x06e4
            X.5nY r3 = r0.A0w
            X.5OO r3 = r3.A04
            com.whatsapp.mediacomposer.bottombar.caption.CaptionView r4 = r3.A04
            r3 = 4
            r4.setVisibility(r3)
        L_0x06e4:
            X.5Us r3 = r0.A0t
            boolean r3 = r3.A0F
            if (r3 == 0) goto L_0x05ed
            X.5nY r3 = r0.A0w
            X.5OO r3 = r3.A04
            com.whatsapp.mediacomposer.bottombar.caption.CaptionView r4 = r3.A04
            r3 = 4
            r4.setVisibility(r3)
            goto L_0x05ed
        L_0x06f6:
            android.content.Intent r11 = r0.getIntent()
            java.lang.String r9 = "max_items"
            int r3 = r0.A01
            int r12 = r11.getIntExtra(r9, r3)
            android.content.Intent r9 = r0.getIntent()
            java.lang.String r3 = "skip_max_items_new_limit"
            boolean r3 = r9.getBooleanExtra(r3, r5)
            if (r3 != 0) goto L_0x072f
            if (r12 != 0) goto L_0x0731
            boolean r3 = r0.A1e
            if (r3 != 0) goto L_0x0597
            X.1VX r3 = r0.A0D
            r11 = 2693(0xa85, float:3.774E-42)
            int r9 = r3.A0N(r11)
            X.1VX r3 = r0.A0D
            int r3 = r3.A0N(r4)
            int r9 = r9 - r3
            int r12 = r12 + r9
            X.1VX r3 = r0.A0D
            int r3 = r3.A0N(r11)
            r0.A01 = r3
            r3 = 1
            r0.A1e = r3
        L_0x072f:
            if (r12 == 0) goto L_0x0597
        L_0x0731:
            r4 = 1
            goto L_0x0598
        L_0x0734:
            X.5nY r3 = r0.A0w
            X.5Oa r3 = r3.A06
            com.whatsapp.mediacomposer.bottombar.recipients.RecipientsView r9 = r3.A04
            r9.A05 = r5
            r3 = 2131099757(0x7f06006d, float:1.7811876E38)
            r9.A00 = r3
            goto L_0x0580
        L_0x0743:
            r13 = 0
            goto L_0x053a
        L_0x0746:
            r3 = 2131625385(0x7f0e05a9, float:1.8877976E38)
            r0.setContentView((int) r3)
            goto L_0x02e6
        L_0x074e:
            r0.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.mediacomposer.MediaComposerActivity.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        C72173dI r0 = this.A1L;
        if (r0 != null) {
            r0.A02();
        }
        this.A1m.removeCallbacksAndMessages((Object) null);
        C105305Uj r02 = this.A10;
        if (r02 != null) {
            TitleBarView titleBarView = r02.A0I;
            Runnable runnable = titleBarView.A0S;
            if (runnable != null) {
                titleBarView.getWaWorkers().BjN(runnable);
            }
            titleBarView.A0S = null;
        }
        if (this.A0l != null) {
            for (int i = 0; i < this.A0l.getChildCount(); i++) {
                View childAt = this.A0l.getChildAt(i);
                if (childAt instanceof FrameLayout) {
                    int i2 = 0;
                    while (true) {
                        ViewGroup viewGroup = (ViewGroup) childAt;
                        if (i2 >= viewGroup.getChildCount()) {
                            break;
                        }
                        View childAt2 = viewGroup.getChildAt(i2);
                        if (childAt2 instanceof PhotoView) {
                            ((PhotoView) childAt2).A02();
                        }
                        i2++;
                    }
                }
            }
        }
        if (this.A02 == -1 || A7S()) {
            this.A0M.A02().A02.A07(-1);
        }
        C117615sD.A01(this.A04, this.A0V);
        super.onDestroy();
        C138236pz r1 = this.A1B;
        if (r1 != null) {
            r1.A0D(true);
            this.A1B = null;
        }
        C114755nY r03 = this.A0w;
        if (r03 != null) {
            C87984Ww r4 = r03.A08.A02;
            Set<C114255mk> set = r4.A0H;
            for (C114255mk r12 : set) {
                r4.A09.A01(r12);
                r12.A0C.set(true);
            }
            set.clear();
            this.A0w = null;
        }
        C53492nB r04 = this.A0k;
        if (r04 != null) {
            r04.A00();
            this.A0k = null;
        }
        C67513Po r13 = this.A0z;
        synchronized (r13) {
            r13.A04.clear();
        }
        this.A05.A0R(this.A1p);
    }

    public MediaComposerActivity(int i) {
        this.A1b = false;
        C86604Kt.A1K(this, 61);
    }

    public static final long A0C(AnonymousClass5YF r4) {
        if (r4.A08() == null || r4.A08().byteValue() != 3) {
            return -1;
        }
        Point A022 = r4.A02();
        if (A022 != null) {
            return (long) (A022.y - A022.x);
        }
        C104315Qm A042 = r4.A04();
        if (A042 != null) {
            return A042.A04;
        }
        return -1;
    }

    public C47122ck A5u() {
        C47122ck A5u = super.A5u();
        A5u.A05 = true;
        String A0n2 = C18310x6.A0n(this);
        A5u.A00 = 18;
        A5u.A01 = A0n2;
        A5u.A06 = true;
        return A5u;
    }

    public void A66() {
        if (!isDestroyed()) {
            if (C627336j.A0N(this.A0t.A0B)) {
                this.A1I.A03((C95814uZ) C18290x4.A0k(this.A0t.A0B), 30);
            } else if (AnonymousClass000.A1W(C627336j.A03(AnonymousClass4SG.A30(this)))) {
                this.A1I.A03((C95814uZ) null, 18);
            }
            super.A66();
        }
    }

    public final C624134x A77() {
        long longExtra = getIntent().getLongExtra("quoted_message_row_id", 0);
        C27991fJ A0c2 = C86604Kt.A0c(this);
        if (longExtra > 0) {
            return C55122pp.A00(this.A1H, longExtra);
        }
        if (A0c2 != null) {
            return C385328b.A00(A0c2, (String) null, (String) null, this.A06.A0H());
        }
        return null;
    }

    public final void A79() {
        Iterator A4M = C89654ea.A4M(this);
        while (A4M.hasNext()) {
            C08310eF A0D2 = AnonymousClass4L0.A0D(A4M);
            if (A0D2 instanceof MediaComposerFragment) {
                A7N((MediaComposerFragment) A0D2);
            }
        }
    }

    public final void A7A() {
        Iterator A4M = C89654ea.A4M(this);
        while (A4M.hasNext()) {
            C08310eF A0D2 = AnonymousClass4L0.A0D(A4M);
            if (A0D2 instanceof ImageComposerFragment) {
                ImageComposerFragment imageComposerFragment = (ImageComposerFragment) A0D2;
                AnonymousClass4SG.A2l(imageComposerFragment.A00, this).A0D(imageComposerFragment.A07.A01);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003c, code lost:
        if (A7Q() != false) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0029, code lost:
        if (X.C627336j.A0N(X.AnonymousClass4SG.A30(r8)) != false) goto L_0x002b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A7G() {
        /*
            r8 = this;
            com.whatsapp.mediacomposer.MediaComposerFragment r7 = r8.A76()
            X.2r1 r1 = r8.A0q
            boolean r0 = r8.A7R()
            boolean r0 = r1.A04(r0)
            r2 = 1
            r3 = 0
            if (r0 != 0) goto L_0x001a
            X.2ld r0 = r8.A0s
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x002b
        L_0x001a:
            boolean r0 = r8.A7Q()
            if (r0 == 0) goto L_0x002b
            java.util.Collection r0 = X.AnonymousClass4SG.A30(r8)
            boolean r0 = X.C627336j.A0N(r0)
            r6 = 1
            if (r0 == 0) goto L_0x002c
        L_0x002b:
            r6 = 0
        L_0x002c:
            if (r7 == 0) goto L_0x00ae
            android.net.Uri r1 = r7.A00
            java.util.HashSet r0 = r8.A1v
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x00ae
            boolean r0 = r8.A7Q()
            if (r0 == 0) goto L_0x00ae
        L_0x003e:
            X.5Uj r0 = r8.A10
            if (r6 != 0) goto L_0x0044
            r3 = 8
        L_0x0044:
            com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView r0 = r0.A0I
            r0.setMediaQualityVisibility(r3)
            X.5Uj r0 = r8.A10
            com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView r5 = r0.A0I
            r5.A0U = r2
            android.widget.ImageView r1 = r5.A05
            if (r1 == 0) goto L_0x005d
            r0 = 1053609165(0x3ecccccd, float:0.4)
            if (r2 == 0) goto L_0x005a
            r0 = 1065353216(0x3f800000, float:1.0)
        L_0x005a:
            r1.setAlpha(r0)
        L_0x005d:
            X.1VX r1 = r5.getAbProps()
            r0 = 6378(0x18ea, float:8.937E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 != 0) goto L_0x009d
            java.lang.Runnable r1 = r5.A0S
            if (r1 == 0) goto L_0x0074
            X.4FS r0 = r5.getWaWorkers()
            r0.BjN(r1)
        L_0x0074:
            r0 = 0
            r5.A0S = r0
            if (r2 == 0) goto L_0x00a6
            X.33p r0 = r5.getWaSharedPreferences()
            android.content.SharedPreferences r1 = X.AnonymousClass0x2.A0F(r0)
            java.lang.String r0 = "media_quality_tooltip_shown"
            boolean r0 = X.C18280x3.A1W(r1, r0)
            if (r0 != 0) goto L_0x00a6
            X.4FS r4 = r5.getWaWorkers()
            r0 = 5
            X.3Zn r3 = new X.3Zn
            r3.<init>(r5, r0)
            r1 = 1000(0x3e8, double:4.94E-321)
            java.lang.String r0 = "TitleBarView/updateMediaQualityEnabledState"
            java.lang.Runnable r0 = r4.Bkn(r3, r0, r1)
            r5.A0S = r0
        L_0x009d:
            boolean r0 = r7 instanceof com.whatsapp.mediacomposer.ImageComposerFragment
            if (r0 == 0) goto L_0x00a5
            com.whatsapp.mediacomposer.ImageComposerFragment r7 = (com.whatsapp.mediacomposer.ImageComposerFragment) r7
            r7.A0B = r6
        L_0x00a5:
            return
        L_0x00a6:
            boolean r0 = r5.A0V
            if (r0 == 0) goto L_0x009d
            r5.A00()
            goto L_0x009d
        L_0x00ae:
            r2 = 0
            goto L_0x003e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.mediacomposer.MediaComposerActivity.A7G():void");
    }

    public final void A7J(int i) {
        SpannableStringBuilder spannableStringBuilder;
        C18260x0.A0w("MediaComposerActivity/select ", AnonymousClass001.A0o(), i);
        if (i >= 0 && i < AnonymousClass4SG.A2L(this)) {
            C105385Us r2 = this.A0t;
            AnonymousClass08M r1 = r2.A02;
            if (C86604Kt.A05(r1) != i) {
                C06270Wx.A03(r1, i);
                r2.A04(0);
            }
            this.A0w.A08.A02.A05();
            C114755nY r22 = this.A0w;
            r22.A08.A06.A0a(C86604Kt.A05(this.A0t.A02));
            MediaComposerFragment A76 = A76();
            Iterator A4M = C89654ea.A4M(this);
            while (A4M.hasNext()) {
                C08310eF A0D2 = AnonymousClass4L0.A0D(A4M);
                if ((A0D2 instanceof MediaComposerFragment) && A0D2 != A76) {
                    MediaComposerFragment mediaComposerFragment = (MediaComposerFragment) A0D2;
                    if (!(mediaComposerFragment instanceof VideoComposerFragment)) {
                        if (mediaComposerFragment instanceof ImageComposerFragment) {
                            ImageComposerFragment imageComposerFragment = (ImageComposerFragment) mediaComposerFragment;
                            imageComposerFragment.A0T = false;
                            AnonymousClass5Y7 r23 = imageComposerFragment.A07;
                            r23.A0I.removeCallbacks(r23.A0X);
                            r23.A02 = null;
                            r23.A09 = false;
                            r23.A03();
                        } else if (!(mediaComposerFragment instanceof GifComposerFragment)) {
                            mediaComposerFragment.A0T = false;
                        }
                    }
                    mediaComposerFragment.A0T = false;
                    mediaComposerFragment.A1T();
                }
            }
            if (A76 != null && !getIntent().getBooleanExtra("smb_send_product", false)) {
                if (!(C86604Kt.A05(this.A0t.A05) == 5 || C86604Kt.A05(this.A0t.A05) == 1 || C86604Kt.A05(this.A0t.A05) == 3)) {
                    this.A0t.A04(0);
                }
                if (this.A0t.A0E && (A76 instanceof VideoComposerFragment)) {
                    VideoComposerFragment videoComposerFragment = (VideoComposerFragment) A76;
                    videoComposerFragment.A0U = new AnonymousClass33D(false);
                    videoComposerFragment.A0G.setVisibility(AnonymousClass001.A08(0));
                }
                if (this.A0t.A00 == 35 && (A76 instanceof VideoComposerFragment)) {
                    VideoComposerFragment videoComposerFragment2 = (VideoComposerFragment) A76;
                    videoComposerFragment2.A0U = new AnonymousClass33D(true);
                    videoComposerFragment2.A0G.setVisibility(AnonymousClass001.A08(1));
                }
                A76.A1O();
                A7G();
                if (this.A1a && !this.A0D.A0X(4361)) {
                    A7F();
                    this.A1a = false;
                }
                boolean z = A76 instanceof ImageComposerFragment;
                if (z || (A76 instanceof VideoComposerFragment)) {
                    if (this.A1Z) {
                        A7H();
                        this.A1Z = false;
                    } else {
                        A7G();
                    }
                    A7O(false);
                    if (z) {
                        ImageComposerFragment imageComposerFragment2 = (ImageComposerFragment) A76;
                        TitleBarView titleBarView = this.A10.A0I;
                        ImageView imageView = titleBarView.A06;
                        if (imageView == null) {
                            throw C18270x1.A0S("penTool");
                        }
                        if (!imageView.isSelected()) {
                            ImageView imageView2 = titleBarView.A07;
                            if (imageView2 == null) {
                                throw C18270x1.A0S("shapeTool");
                            } else if (!imageView2.isSelected()) {
                                WaTextView waTextView = titleBarView.A0C;
                                if (waTextView == null) {
                                    throw C18270x1.A0S("textTool");
                                } else if (!waTextView.isSelected()) {
                                    AnonymousClass5Y7 r3 = imageComposerFragment2.A07;
                                    if (r3.A07 == null) {
                                        r3.A07 = new FilterSelectorController$4(r3);
                                        View view = r3.A0J;
                                        C002002f A0W2 = AnonymousClass001.A0W(view);
                                        BottomSheetBehavior bottomSheetBehavior = r3.A07;
                                        A0W2.A01(bottomSheetBehavior);
                                        C1232167o r0 = new C1232167o(r3, 10);
                                        r3.A06 = r0;
                                        bottomSheetBehavior.A0Z(r0);
                                        if (r3.A07.A0O == 3) {
                                            r3.A06.A03(view, 3);
                                        }
                                        C86614Ku.A1J(r3.A0M.getViewTreeObserver(), r3, 11);
                                    }
                                    C114755nY r24 = this.A0w;
                                    boolean A072 = this.A0t.A07();
                                    C148287Hu r02 = r24.A05;
                                    if (A072) {
                                        FilterSwipeView filterSwipeView = r02.A01;
                                        TextView textView = filterSwipeView.A00;
                                        if (textView.getVisibility() != 0) {
                                            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, 0.0f);
                                            translateAnimation.setDuration(1);
                                            AnimationSet animationSet = new AnimationSet(false);
                                            AlphaAnimation A0H2 = C86604Kt.A0H();
                                            A0H2.setDuration(300);
                                            animationSet.addAnimation(A0H2);
                                            animationSet.addAnimation(translateAnimation);
                                            textView.startAnimation(animationSet);
                                        }
                                        filterSwipeView.setFilterSwipeTextVisibility(0);
                                    }
                                }
                            }
                        }
                        this.A10.A0I.setCropToolVisibility(0);
                        A76.A1J();
                    }
                }
                if (!(A76 instanceof GifComposerFragment)) {
                    if (A76 instanceof VideoComposerFragment) {
                        A76.A1N();
                    } else {
                        StringBuilder A0o2 = AnonymousClass001.A0o();
                        A0o2.append("Unhandled fragment instance type ");
                        C18260x0.A1M(A0o2, C18310x6.A0n(A76));
                        A76.A1J();
                    }
                }
                this.A10.A0I.setCropToolVisibility(8);
                FilterSwipeView filterSwipeView2 = this.A0w.A05.A01;
                filterSwipeView2.A00.clearAnimation();
                filterSwipeView2.setFilterSwipeTextVisibility(8);
                A76.A1J();
            }
            Uri A022 = this.A0t.A02();
            this.A1u.add(A022);
            C106105Xq r03 = this.A1n;
            C626936e.A06(A022);
            AnonymousClass5YF A002 = r03.A00(A022);
            if (A002.A09() != null) {
                spannableStringBuilder = C18330xA.A00(A002.A09());
                this.A13.A05(this, spannableStringBuilder, (C95814uZ) null, this.A12.A00(A002.A0B()));
            } else {
                spannableStringBuilder = null;
            }
            this.A0w.A00(spannableStringBuilder, true);
        }
    }

    public final void A7P(boolean z) {
        long j;
        byte A022;
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("MediaComposerActivity/openContactPicker uris size = ");
        C18260x0.A1G(A0o2, AnonymousClass4SG.A2L(this));
        HashSet A0K2 = AnonymousClass002.A0K();
        boolean A1U2 = AnonymousClass000.A1U(C86604Kt.A05(this.A0t.A06), 3);
        C106105Xq r1 = this.A1n;
        if (A1U2) {
            j = A0C(r1.A00((Uri) C18290x4.A0k(AnonymousClass4SG.A31(this))));
            C105385Us r7 = this.A0t;
            AnonymousClass08M r12 = r7.A03;
            if (0 >= C86614Ku.A06(r12)) {
                A022 = -1;
            } else {
                A022 = r7.A0A.A02(r7.A09.A00((Uri) C86634Kw.A0w(r12, 0)));
            }
            int i = 42;
            if (A022 == 3) {
                i = 43;
            }
            C18270x1.A1K(A0K2, i);
        } else {
            j = -1;
            for (AnonymousClass5YF r13 : C18300x5.A0v(r1.A00)) {
                if (r13.A08() != null) {
                    C18270x1.A1K(A0K2, r13.A08().byteValue());
                    j = Math.max(j, A0C(r13));
                }
            }
        }
        List B8s = B8s();
        AnonymousClass5PH r14 = new AnonymousClass5PH(this);
        r14.A0H = true;
        r14.A0b = B8s;
        r14.A0L = true;
        r14.A0T = Long.valueOf(j);
        r14.A0Z = AnonymousClass002.A0J(A0K2);
        r14.A0M = Boolean.valueOf(z);
        Intent A012 = AnonymousClass5PH.A01(r14);
        this.A1E.A01(A012, (C108845de) this.A0t.A04.A07());
        startActivityForResult(A012, 1);
    }

    public final boolean A7Q() {
        MediaComposerFragment A76 = A76();
        if (A76 == null) {
            return false;
        }
        if (!A7R()) {
            return true;
        }
        if (!(A76 instanceof ImageComposerFragment) || !this.A0q.A02.A0Y(C58422vE.A01, 6033)) {
            return false;
        }
        return true;
    }

    public final boolean A7R() {
        if (!AnonymousClass000.A1W(C627336j.A03(AnonymousClass4SG.A30(this)))) {
            return false;
        }
        for (Object obj : AnonymousClass4SG.A30(this)) {
            if (!(obj instanceof C135166kE)) {
                return false;
            }
        }
        return true;
    }

    public final boolean A7S() {
        int intExtra = getIntent().getIntExtra("origin", 1);
        if (intExtra == 5 || intExtra == 8 || intExtra == 9 || intExtra == 23 || intExtra == 22 || intExtra == 24 || intExtra == 25 || intExtra == 29 || intExtra == 35 || intExtra == 37 || intExtra == 40) {
            return true;
        }
        return false;
    }

    public int B9Q() {
        AnonymousClass1VX r1;
        int i;
        if (AnonymousClass000.A1W(C627336j.A03(AnonymousClass4SG.A30(this)))) {
            r1 = this.A0D;
            i = 6728;
        } else if (getIntent().getIntExtra("origin", 1) != 35) {
            return -1;
        } else {
            r1 = this.A0D;
            i = 3402;
        }
        return r1.A0N(i);
    }

    public void BM5() {
        MediaComposerFragment A76 = A76();
        if (A76 != null && A76.A1S()) {
            return;
        }
        if (this.A1W) {
            A79();
            A7A();
            Intent A072 = C18320x8.A07();
            A072.putParcelableArrayListExtra("android.intent.extra.STREAM", AnonymousClass002.A0J(C86664Kz.A1P(this.A0t.A03)));
            C86654Ky.A0x(A072, B8s());
            Integer num = this.A1Q;
            if (num != null) {
                A072.putExtra("media_quality_selection", num);
            }
            C106105Xq r0 = this.A1n;
            Bundle A082 = AnonymousClass002.A08();
            r0.A03(A082);
            A072.putExtra("media_preview_params", A082);
            this.A02 = 1;
            setResult(1, A072);
            finish();
        } else if (!C627336j.A0N(this.A0t.A0B) || this.A0D.A0X(5643)) {
            Object[] objArr = new Object[1];
            this.A05.A0P(getString(R.string.f11nameremoved, objArr), C18300x5.A1Y(objArr, this.A01) ? 1 : 0);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
        if (r0.equals(r11) != false) goto L_0x0015;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00f8, code lost:
        if (r0 != 3) goto L_0x00fa;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BWA(java.lang.Integer r11) {
        /*
            r10 = this;
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "MediaComposerActivity/onMediaQualityUpdated/"
            X.C18260x0.A1P(r1, r0, r11)
            java.lang.Integer r0 = r10.A1Q
            r9 = 1
            if (r0 == 0) goto L_0x0015
            boolean r0 = r0.equals(r11)
            r1 = 1
            if (r0 == 0) goto L_0x0016
        L_0x0015:
            r1 = 0
        L_0x0016:
            r10.A1Q = r11
            X.2ld r0 = r10.A0s
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x0023
            r10.A7F()
        L_0x0023:
            r10.A7O(r9)
            if (r1 == 0) goto L_0x0122
            java.lang.Integer r0 = r10.A1Q
            r2 = 0
            if (r0 == 0) goto L_0x0078
            int r0 = r0.intValue()
            r7 = 3
            if (r0 != r7) goto L_0x0078
            java.util.HashSet r0 = r10.A1v
            java.util.Iterator r6 = r0.iterator()
            r5 = 0
            r4 = 0
            r3 = 0
        L_0x003d:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x006a
            android.net.Uri r0 = X.C86664Kz.A0c(r6)
            X.5YF r1 = X.AnonymousClass4SG.A2l(r0, r10)
            X.53q r0 = r10.A0o
            byte r0 = r0.A02(r1)
            if (r0 != r9) goto L_0x0056
            int r5 = r5 + 1
            goto L_0x003d
        L_0x0056:
            if (r0 != r7) goto L_0x0061
            boolean r0 = r1.A0J()
            if (r0 != 0) goto L_0x0061
            int r4 = r4 + 1
            goto L_0x003d
        L_0x0061:
            boolean r0 = r1.A0J()
            if (r0 == 0) goto L_0x003d
            int r3 = r3 + 1
            goto L_0x003d
        L_0x006a:
            java.lang.Integer[] r1 = new java.lang.Integer[r7]
            X.C86604Kt.A1X(r1, r5, r2, r4, r9)
            r0 = 2
            X.AnonymousClass000.A1P(r1, r3, r0)
            java.util.List r0 = java.util.Arrays.asList(r1)
            goto L_0x00bf
        L_0x0078:
            X.5Xq r0 = r10.A1n
            java.util.Map r0 = r0.A00
            java.util.ArrayList r0 = X.C18300x5.A0v(r0)
            java.util.Iterator r8 = r0.iterator()
            r7 = 0
            r6 = 0
            r5 = 0
        L_0x0087:
            boolean r0 = r8.hasNext()
            r4 = 2
            r3 = 3
            if (r0 == 0) goto L_0x00b3
            java.lang.Object r1 = r8.next()
            X.5YF r1 = (X.AnonymousClass5YF) r1
            X.53q r0 = r10.A0o
            byte r0 = r0.A02(r1)
            if (r0 != r9) goto L_0x017b
            int r7 = r7 + 1
            if (r7 <= r9) goto L_0x00a5
            if (r6 <= r9) goto L_0x00a5
        L_0x00a3:
            if (r5 > r9) goto L_0x00b3
        L_0x00a5:
            boolean r0 = r1.A0J()
            if (r0 == 0) goto L_0x0087
            int r5 = r5 + 1
            if (r5 <= r9) goto L_0x0087
            if (r7 <= r9) goto L_0x0087
            if (r6 <= r9) goto L_0x0087
        L_0x00b3:
            java.lang.Integer[] r0 = new java.lang.Integer[r3]
            X.C86604Kt.A1X(r0, r7, r2, r6, r9)
            X.AnonymousClass000.A1P(r0, r5, r4)
            java.util.List r0 = java.util.Arrays.asList(r0)
        L_0x00bf:
            java.util.ArrayList r1 = X.AnonymousClass002.A0J(r0)
            X.33j r4 = r10.A0Z
            java.lang.Integer r8 = r10.A1Q
            X.C162457s7.A0J(r4, r2)
            int r7 = X.C86614Ku.A07(r1, r2)
            int r6 = X.C86614Ku.A07(r1, r9)
            r0 = 2
            int r5 = X.C86614Ku.A07(r1, r0)
            java.util.Iterator r3 = r1.iterator()
            r1 = 0
        L_0x00dc:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00ec
            int r0 = X.C18280x3.A05(r3)
            if (r0 <= 0) goto L_0x00dc
            int r1 = r1 + 1
            if (r1 <= r9) goto L_0x00dc
        L_0x00ec:
            r3 = 3
            if (r1 <= r9) goto L_0x0123
            if (r8 == 0) goto L_0x00fa
            int r0 = r8.intValue()
            r1 = 2131755198(0x7f1000be, float:1.9141269E38)
            if (r0 == r3) goto L_0x00fd
        L_0x00fa:
            r1 = 2131755197(0x7f1000bd, float:1.9141266E38)
        L_0x00fd:
            int r7 = r7 + r6
            int r7 = r7 + r5
        L_0x00ff:
            java.lang.String r1 = X.C86604Kt.A0q(r4, r7, r2, r1)
            X.C162457s7.A0D(r1)
            android.widget.Toast r0 = r10.A08
            if (r0 == 0) goto L_0x0110
            r0.cancel()
            r0 = 0
            r10.A08 = r0
        L_0x0110:
            X.3Wi r0 = r10.A05
            android.widget.Toast r1 = r0.A0C(r1)
            r10.A08 = r1
            r0 = 17
            r1.setGravity(r0, r2, r2)
            android.widget.Toast r0 = r10.A08
            r0.show()
        L_0x0122:
            return
        L_0x0123:
            if (r7 <= 0) goto L_0x0149
            if (r8 == 0) goto L_0x0141
            int r0 = r8.intValue()
            if (r0 != r3) goto L_0x0141
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            r0 = 2131755185(0x7f1000b1, float:1.9141242E38)
        L_0x0134:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r7 = r1.intValue()
            int r1 = r0.intValue()
            goto L_0x00ff
        L_0x0141:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            r0 = 2131755184(0x7f1000b0, float:1.914124E38)
            goto L_0x0134
        L_0x0149:
            if (r6 <= 0) goto L_0x0163
            if (r8 == 0) goto L_0x015b
            int r0 = r8.intValue()
            if (r0 != r3) goto L_0x015b
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            r0 = 2131755394(0x7f100182, float:1.9141666E38)
            goto L_0x0134
        L_0x015b:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            r0 = 2131755393(0x7f100181, float:1.9141664E38)
            goto L_0x0134
        L_0x0163:
            if (r8 == 0) goto L_0x0173
            int r0 = r8.intValue()
            if (r0 != r3) goto L_0x0173
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            r0 = 2131755130(0x7f10007a, float:1.914113E38)
            goto L_0x0134
        L_0x0173:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            r0 = 2131755129(0x7f100079, float:1.9141129E38)
            goto L_0x0134
        L_0x017b:
            if (r0 != r3) goto L_0x00a5
            boolean r0 = r1.A0J()
            if (r0 != 0) goto L_0x00a5
            int r6 = r6 + 1
            if (r6 <= r9) goto L_0x00a5
            if (r7 <= r9) goto L_0x00a5
            goto L_0x00a3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.mediacomposer.MediaComposerActivity.BWA(java.lang.Integer):void");
    }

    public void Bng(Uri uri, long j, long j2) {
        AnonymousClass5YF A2l = AnonymousClass4SG.A2l(uri, this);
        Point point = new Point((int) j, (int) j2);
        synchronized (A2l) {
            A2l.A03 = point;
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1 && intent != null) {
            if (i2 == -1) {
                this.A0t.A01.A0H(Collections.unmodifiableList(C86634Kw.A12(intent, C95814uZ.class, "jids")));
                C626936e.A06(intent);
                C108845de A002 = this.A1E.A00(intent.getExtras());
                if (A002 != null) {
                    this.A0t.A04.A0H(A002);
                }
                Log.d("MediaComposerActivity/sendMedia/onActivityResult");
                A7D();
            } else if (i2 == 0) {
                List A122 = C86634Kw.A12(intent, C95814uZ.class, "jids");
                C108845de A003 = this.A1E.A00(intent.getExtras());
                this.A0t.A01.A0H(Collections.unmodifiableList(A122));
                C105385Us r0 = this.A0t;
                C626936e.A06(A003);
                r0.A04.A0H(A003);
                C105385Us r1 = this.A0t;
                r1.A05(r1.A01());
            }
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        A7C();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return super.onKeyDown(i, keyEvent);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        A7B();
        return true;
    }

    public void onResume() {
        super.onResume();
        A7G();
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelableArrayList("uris", AnonymousClass002.A0J(C86664Kz.A1P(this.A0t.A03)));
        ArrayList A0s2 = AnonymousClass001.A0s();
        for (Object obj : AnonymousClass4SG.A31(this)) {
            A0s2.add(this.A1r.get(obj));
        }
        bundle.putSerializable("ids", A0s2);
        bundle.putInt("position", C86604Kt.A05(this.A0t.A02));
        bundle.putInt("view_once", C86604Kt.A05(this.A0t.A06));
        Integer num = this.A1Q;
        if (num != null) {
            bundle.putInt("media_quality_selection", num.intValue());
        }
        C106105Xq r0 = this.A1n;
        Bundle A082 = AnonymousClass002.A08();
        r0.A03(A082);
        bundle.putBundle("media_preview_params", A082);
        bundle.putBoolean("optimistic_started", this.A1g);
    }

    public void onStart() {
        super.onStart();
        this.A1U = true;
        A7J(C86604Kt.A05(this.A0t.A02));
        if (this.A0A.A07() == null && !this.A1i && this.A0v != null && this.A0Y.A04() != C997357z.DENIED) {
            ArrayList A0s2 = AnonymousClass001.A0s();
            Iterator it = AnonymousClass4SG.A31(this).iterator();
            while (it.hasNext()) {
                Uri A0c2 = C86664Kz.A0c(it);
                File A062 = AnonymousClass4SG.A2l(A0c2, this).A06();
                if (A062 == null || !A062.exists()) {
                    A0s2.add(A0c2);
                }
            }
            int size = A0s2.size();
            if (size != 0) {
                C69263Wi r5 = this.A05;
                Object[] objArr = new Object[1];
                C18270x1.A1Q(objArr, size);
                r5.A0P(this.A0Z.A0L(objArr, R.plurals.f9nameremoved, (long) size), 1);
                if (size == AnonymousClass4SG.A2L(this)) {
                    finish();
                    return;
                }
                Iterator it2 = A0s2.iterator();
                while (it2.hasNext()) {
                    Uri A0c3 = C86664Kz.A0c(it2);
                    if (A0c3 != null) {
                        A7K(A0c3);
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x009b, code lost:
        if (r1 != false) goto L_0x009d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0020 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onStop() {
        /*
            r8 = this;
            super.onStop()
            r0 = 0
            r8.A1U = r0
            boolean r0 = r8.A1i
            if (r0 != 0) goto L_0x000d
            r8.A78()
        L_0x000d:
            boolean r0 = r8.A1X
            if (r0 == 0) goto L_0x012b
            r8.A79()
            java.util.HashMap r5 = X.AnonymousClass001.A0t()
            java.util.List r0 = X.AnonymousClass4SG.A31(r8)
            java.util.Iterator r7 = r0.iterator()
        L_0x0020:
            boolean r0 = r7.hasNext()
            r6 = 13
            r3 = 0
            if (r0 == 0) goto L_0x00af
            android.net.Uri r0 = X.C86664Kz.A0c(r7)
            X.5YF r2 = X.AnonymousClass4SG.A2l(r0, r8)
            X.53q r0 = r8.A0o
            byte r1 = r0.A01(r2)
            boolean r0 = r2.A0J()
            if (r0 != 0) goto L_0x003e
            r6 = r1
        L_0x003e:
            java.lang.Byte r0 = java.lang.Byte.valueOf(r6)
            java.lang.Object r4 = r5.get(r0)
            X.4sn r4 = (X.C95204sn) r4
            if (r4 != 0) goto L_0x0051
            X.4sn r4 = r8.A75(r6)
            r5.put(r0, r4)
        L_0x0051:
            java.lang.Long r0 = r4.A0B
            java.lang.Long r0 = X.C86624Kv.A0Y(r0)
            r4.A0B = r0
            java.io.File r0 = r2.A05()
            r6 = 1
            if (r0 == 0) goto L_0x0069
            java.lang.Long r0 = r4.A0A
            java.lang.Long r0 = X.C86624Kv.A0Y(r0)
            r4.A0A = r0
            r3 = 1
        L_0x0069:
            int r0 = r2.A01()
            if (r0 != 0) goto L_0x0070
            r6 = r3
        L_0x0070:
            java.lang.String r3 = r2.A0A()
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L_0x00ad
            com.whatsapp.mediacomposer.MediaComposerFragment r0 = r8.A76()
            if (r0 == 0) goto L_0x00ad
            X.C626936e.A06(r3)
            X.5Y0 r2 = r8.A0C
            X.33j r1 = r8.A0Z
            X.33O r0 = r0.A0J
            X.5aV r0 = X.C106985aV.A03(r8, r1, r2, r0, r3)
            if (r0 == 0) goto L_0x00ad
            r0.A09(r4)
            java.util.List r0 = r0.A04
            if (r0 == 0) goto L_0x009d
            boolean r1 = r0.isEmpty()
            r0 = 0
            if (r1 == 0) goto L_0x009e
        L_0x009d:
            r0 = 1
        L_0x009e:
            r0 = r0 ^ 1
        L_0x00a0:
            r0 = r0 | r6
            if (r0 == 0) goto L_0x0020
            java.lang.Long r0 = r4.A09
            java.lang.Long r0 = X.C86624Kv.A0Y(r0)
            r4.A09 = r0
            goto L_0x0020
        L_0x00ad:
            r0 = 0
            goto L_0x00a0
        L_0x00af:
            java.util.HashSet r3 = r8.A1s
            java.util.Iterator r4 = r3.iterator()
        L_0x00b5:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x00eb
            java.lang.Object r1 = r4.next()
            X.5YF r1 = (X.AnonymousClass5YF) r1
            X.53q r0 = r8.A0o
            byte r2 = r0.A01(r1)
            boolean r0 = r1.A0J()
            if (r0 == 0) goto L_0x00cf
            r2 = 13
        L_0x00cf:
            java.lang.Byte r0 = java.lang.Byte.valueOf(r2)
            java.lang.Object r1 = r5.get(r0)
            X.4sn r1 = (X.C95204sn) r1
            if (r1 != 0) goto L_0x00e2
            X.4sn r1 = r8.A75(r2)
            r5.put(r0, r1)
        L_0x00e2:
            java.lang.Long r0 = r1.A0B
            java.lang.Long r0 = X.C86624Kv.A0Y(r0)
            r1.A0B = r0
            goto L_0x00b5
        L_0x00eb:
            java.util.Iterator r2 = X.C18290x4.A10(r5)
        L_0x00ef:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0101
            java.lang.Object r1 = r2.next()
            X.3ZG r1 = (X.AnonymousClass3ZG) r1
            X.4FV r0 = r8.A0j
            r0.BhB(r1)
            goto L_0x00ef
        L_0x0101:
            X.53r r2 = r8.A1K
            java.util.Collection r1 = r8.A1q
            X.5Xq r0 = r8.A1n
            java.util.Map r0 = r0.A00
            java.util.ArrayList r0 = X.C18300x5.A0v(r0)
            X.C989053r.A04(r2, r1, r0)
            X.53r r0 = r8.A1K
            X.C989053r.A04(r0, r1, r3)
            java.util.List r0 = X.AnonymousClass4SG.A31(r8)
            java.util.Iterator r1 = r0.iterator()
        L_0x011d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x012b
            android.net.Uri r0 = X.C86664Kz.A0c(r1)
            r8.A7L(r0)
            goto L_0x011d
        L_0x012b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.mediacomposer.MediaComposerActivity.onStop():void");
    }

    public int A5t() {
        return 78318969;
    }

    public void onBackPressed() {
        A7B();
    }

    public MediaComposerActivity() {
        this(0);
        this.A02 = 0;
        this.A1X = false;
        this.A1p = new C71533cG(this, 39);
        this.A1o = new C107355bB(this, 0);
        this.A1n = new C106105Xq();
        this.A1r = AnonymousClass001.A0t();
        this.A1s = AnonymousClass002.A0K();
        this.A1w = AnonymousClass001.A0t();
        this.A1q = AnonymousClass001.A0s();
        this.A1l = AnonymousClass000.A0A();
        this.A1m = AnonymousClass000.A0A();
        this.A1k = AnonymousClass001.A0N();
        this.A1j = new PointF();
        this.A1v = AnonymousClass002.A0K();
        this.A1t = AnonymousClass002.A0K();
        this.A1u = AnonymousClass002.A0K();
        this.A1e = false;
        this.A1Z = true;
        this.A1a = true;
        this.A1S = new C71533cG(this, 45);
        this.A1d = false;
    }
}
