package com.whatsapp.mediacomposer;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0Y8;
import X.AnonymousClass0YY;
import X.AnonymousClass0x2;
import X.AnonymousClass0x9;
import X.AnonymousClass1VX;
import X.AnonymousClass33D;
import X.AnonymousClass3Z6;
import X.AnonymousClass4FV;
import X.AnonymousClass4SG;
import X.AnonymousClass5NV;
import X.AnonymousClass5YF;
import X.AnonymousClass5YG;
import X.AnonymousClass5ZM;
import X.AnonymousClass69R;
import X.AnonymousClass6DM;
import X.AnonymousClass8HX;
import X.C08310eF;
import X.C104315Qm;
import X.C105025Tg;
import X.C105305Uj;
import X.C106105Xq;
import X.C106985aV;
import X.C107335b8;
import X.C107535bT;
import X.C107565bW;
import X.C109365eV;
import X.C113895mA;
import X.C114745nX;
import X.C114825nf;
import X.C1234168i;
import X.C135166kE;
import X.C138066pi;
import X.C152347Yn;
import X.C162287rd;
import X.C171258Gj;
import X.C18290x4;
import X.C18330xA;
import X.C186068uh;
import X.C1893190v;
import X.C34221uQ;
import X.C52532ld;
import X.C53492nB;
import X.C54292oU;
import X.C56612sH;
import X.C620633i;
import X.C626936e;
import X.C627336j;
import X.C633138t;
import X.C69263Wi;
import X.C70353aM;
import X.C71533cG;
import X.C86604Kt;
import X.C86634Kw;
import X.C86644Kx;
import X.C86654Ky;
import X.C86664Kz;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import com.whatsapp.videoplayback.VideoSurfaceView;
import java.io.File;
import java.util.List;

public class VideoComposerFragment extends Hilt_VideoComposerFragment {
    public int A00 = 0;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05 = -1;
    public long A06;
    public long A07;
    public long A08;
    public View.OnClickListener A09 = new C109365eV(this, 24);
    public View.OnClickListener A0A = new C109365eV(this, 23);
    public View A0B;
    public View A0C;
    public View A0D;
    public View A0E;
    public ImageView A0F;
    public ImageView A0G;
    public TextView A0H;
    public TextView A0I;
    public TextView A0J;
    public C113895mA A0K;
    public C56612sH A0L;
    public AnonymousClass4FV A0M;
    public C152347Yn A0N;
    public C152347Yn A0O;
    public C162287rd A0P;
    public C52532ld A0Q;
    public VideoTimelineView A0R;
    public C105305Uj A0S;
    public C105025Tg A0T;
    public AnonymousClass33D A0U = AnonymousClass33D.A01;
    public C104315Qm A0V;
    public AnonymousClass5YG A0W;
    public File A0X;
    public AnonymousClass3Z6 A0Y;
    public AnonymousClass3Z6 A0Z;
    public boolean A0a;
    public boolean A0b;
    public boolean A0c;
    public boolean A0d;
    public boolean A0e;
    public boolean A0f;
    public boolean A0g;
    public final View.OnAttachStateChangeListener A0h = new C1893190v(this, 1);
    public final Runnable A0i = new C71533cG((Object) this, 46);

    public void A0q(Bundle bundle) {
        bundle.putBoolean("key_video_is_muted", this.A0b);
    }

    public void A0w(Bundle bundle, View view) {
        boolean z;
        C633138t r5;
        boolean z2;
        long j;
        String str;
        int i;
        int i2;
        int i3;
        int i4;
        Bundle bundle2 = bundle;
        View view2 = view;
        super.A0w(bundle2, view2);
        C626936e.A0C(AnonymousClass000.A1X(this.A0W));
        C186068uh A1E = C86664Kz.A1E(this);
        Uri uri = this.A00;
        MediaComposerActivity mediaComposerActivity = (MediaComposerActivity) A1E;
        C106105Xq r0 = mediaComposerActivity.A1n;
        this.A0X = r0.A00(uri).A07();
        C104315Qm A042 = r0.A00(this.A00).A04();
        this.A0V = A042;
        if (A042 == null) {
            try {
                this.A0V = new C104315Qm(this.A0X);
            } catch (C138066pi e) {
                Log.e("VideoComposerFragment/bad video", e);
            }
        }
        this.A0a = this.A0Q.A01((Rect) null, this.A0P.A0E(A1D(), this.A00, this.A0V, 1280));
        this.A0S = mediaComposerActivity.A10;
        boolean A0X2 = this.A0A.A0X(5416);
        C56612sH r14 = this.A0L;
        AnonymousClass1VX r13 = this.A0A;
        AnonymousClass4FV r12 = this.A0M;
        long A0B2 = C18290x4.A0B(this.A0V.A04);
        long length = this.A0X.length();
        C104315Qm r6 = this.A0V;
        C34221uQ r34 = new C34221uQ(r14, r13, r12, 2, 1, 2, A0B2, -1, length, (long) r6.A03, (long) r6.A01);
        boolean z3 = false;
        C70353aM.A00(this.A0P, this, r34, this.A0X, 0);
        AnonymousClass1VX r16 = this.A0A;
        C69263Wi r15 = this.A03;
        C620633i r142 = this.A05;
        Context A0G2 = A0G();
        C54292oU r132 = this.A06;
        File file = this.A0X;
        AnonymousClass5YF A002 = r0.A00(this.A00);
        synchronized (A002) {
            z = A002.A0D;
        }
        boolean A1S = AnonymousClass000.A1S(z ? 1 : 0);
        boolean A1S2 = AnonymousClass000.A1S(C107535bT.A01() ? 1 : 0);
        C69263Wi r22 = r15;
        C620633i r23 = r142;
        AnonymousClass5YG A022 = AnonymousClass5YG.A02(A0G2, r22, r23, r132, r16, (AnonymousClass5NV) this.A0S.get(), this.A0P, r34, file, false, A1S, A1S2, A0X2);
        this.A0W = A022;
        A022.A0S(2);
        if (this.A0A.A0X(6678)) {
            this.A0W.A0I();
        }
        this.A0W.A09().addOnAttachStateChangeListener(this.A0h);
        if (this.A00.equals(A1E.B4X())) {
            this.A0W.A09().setAlpha(0.0f);
            A0Q().A5V();
        }
        this.A0d = r0.A00(this.A00).A0J();
        C162287rd r10 = this.A0P;
        if (C627336j.A0N(A1E.B8s())) {
            r5 = C633138t.A0V;
        } else {
            r5 = C633138t.A0g;
        }
        this.A0g = r10.A0I(r5, this.A0X);
        this.A07 = 0;
        long j2 = this.A0V.A04;
        this.A08 = j2;
        this.A02 = j2;
        this.A04 = j2;
        this.A03 = j2;
        r0.A00(this.A00).A02 = j2;
        List B8s = mediaComposerActivity.B8s();
        if (!B8s.isEmpty() && B8s.size() == 1) {
            z3 = B8s.get(0) instanceof C135166kE;
        }
        this.A0f = z3;
        this.A0e = C627336j.A0N(mediaComposerActivity.B8s());
        List B8s2 = mediaComposerActivity.B8s();
        if (!mediaComposerActivity.B8s().isEmpty()) {
            z2 = B8s2.contains(C135166kE.A00);
        } else {
            z2 = false;
        }
        this.A0E = view2.findViewById(R.id.video_controls);
        View findViewById = view2.findViewById(R.id.play);
        this.A0C = findViewById;
        C18290x4.A1F(findViewById, this, 25);
        this.A0I = AnonymousClass002.A09(view2, R.id.size);
        this.A0H = AnonymousClass002.A09(view2, R.id.duration);
        this.A0J = AnonymousClass002.A09(view2, R.id.trim_info);
        this.A0D = view2.findViewById(R.id.trim_info_container);
        this.A0G = AnonymousClass0x9.A0F(view2, R.id.video_gif_toggle);
        this.A0B = view2.findViewById(R.id.mute_video_container);
        this.A0F = AnonymousClass0x9.A0F(view2, R.id.mute_video);
        if (this.A0A.A0X(325)) {
            this.A0B.setVisibility(0);
            A1Y();
            this.A0B.setOnClickListener(this.A09);
        }
        long A1V = A1V();
        C152347Yn r3 = this.A0N;
        if (r3 == null) {
            r3 = this.A0P.A0D(this.A0f, this.A0d, this.A0e);
            this.A0N = r3;
        }
        long j3 = (long) r3.A00;
        if (A1V > j3 * 1048576) {
            this.A04 = ((this.A0V.A04 * j3) * 1048576) / A1V;
        }
        int B9Q = A1E.B9Q();
        if (B9Q > 0) {
            long j4 = this.A04;
            long A0A2 = C18290x4.A0A(B9Q);
            if (j4 > A0A2) {
                this.A04 = A0A2;
                if (this.A0A.A0X(4361)) {
                    if (this.A0f || z2) {
                        this.A0T.A00();
                    } else {
                        this.A0T.A00.A0P(AnonymousClass0x2.A0Y(A0G().getResources(), B9Q, 0, R.plurals.f9nameremoved), 1);
                    }
                }
            }
        }
        if (this.A0a) {
            long A1U = A1U();
            C152347Yn r32 = this.A0O;
            if (r32 == null) {
                r32 = this.A0P.A0C();
                this.A0O = r32;
            }
            long j5 = (long) r32.A00;
            if (A1U > j5 * 1048576) {
                this.A03 = ((this.A0V.A04 * j5) * 1048576) / A1U;
            }
            int B9Q2 = A1E.B9Q();
            if (B9Q2 > 0) {
                long j6 = this.A03;
                long A0A3 = C18290x4.A0A(B9Q2);
                if (j6 > A0A3) {
                    this.A03 = A0A3;
                }
            }
        }
        if (this.A00 == 3) {
            j = this.A03;
        } else {
            j = this.A04;
        }
        this.A02 = j;
        this.A08 = j;
        Point A023 = r0.A00(this.A00).A02();
        if (A023 != null) {
            this.A07 = (long) A023.x;
            this.A08 = (long) A023.y;
        } else {
            A1E.Bng(this.A00, this.A07, this.A08);
        }
        A1V();
        if (this.A0a) {
            A1U();
        }
        VideoTimelineView videoTimelineView = (VideoTimelineView) view2.findViewById(R.id.timeline_view);
        this.A0R = videoTimelineView;
        File file2 = this.A0X;
        long j7 = this.A0V.A04;
        videoTimelineView.A0O = file2;
        videoTimelineView.A0P = null;
        AnonymousClass5ZM r52 = videoTimelineView.A0L;
        if (r52 != null) {
            r52.A0D(true);
            videoTimelineView.A0L = null;
        }
        if (file2 == null) {
            videoTimelineView.A0D = 0;
        } else if (j7 == 0) {
            AnonymousClass6DM r122 = new AnonymousClass6DM();
            try {
                r122.setDataSource(file2.getAbsolutePath());
                videoTimelineView.A0D = Long.parseLong(r122.extractMetadata(9));
                r122.close();
            } catch (Throwable th) {
                th.addSuppressed(th);
                throw th;
            }
        } else {
            videoTimelineView.A0D = j7;
        }
        videoTimelineView.A0F = 0;
        videoTimelineView.A0G = videoTimelineView.A0D;
        videoTimelineView.invalidate();
        VideoTimelineView videoTimelineView2 = this.A0R;
        long j8 = this.A07;
        long j9 = this.A08;
        videoTimelineView2.A0F = j8;
        videoTimelineView2.A0G = j9;
        videoTimelineView2.invalidate();
        VideoTimelineView videoTimelineView3 = this.A0R;
        boolean z4 = this.A0d;
        long j10 = this.A02;
        if (z4) {
            j10 = Math.min(j10, 7000);
        }
        videoTimelineView3.A0E = j10;
        videoTimelineView3.A0I = new C114745nX(this);
        videoTimelineView3.A0J = new AnonymousClass8HX(this);
        AnonymousClass5YG r4 = this.A0W;
        r4.A07 = new AnonymousClass69R(this, 0);
        if (r4.A09() instanceof VideoSurfaceView) {
            VideoSurfaceView videoSurfaceView = (VideoSurfaceView) this.A0W.A09();
            C104315Qm r53 = this.A0V;
            if (r53.A02()) {
                i3 = r53.A01;
                i4 = r53.A03;
            } else {
                i3 = r53.A03;
                i4 = r53.A01;
            }
            videoSurfaceView.A03(i3, i4);
            C1234168i r54 = new C1234168i(this, 1);
            C53492nB r42 = mediaComposerActivity.A0k;
            if (r42 != null) {
                r42.A02(r54, new C171258Gj(this, videoSurfaceView));
            }
        }
        if (bundle == null) {
            String A0A4 = r0.A00(this.A00).A0A();
            AnonymousClass5YF A2l = AnonymousClass4SG.A2l(this.A00, mediaComposerActivity);
            synchronized (A2l) {
                str = A2l.A0B;
            }
            if (A0A4 == null) {
                C104315Qm r55 = this.A0V;
                boolean A024 = r55.A02();
                if (A024) {
                    i = r55.A01;
                } else {
                    i = r55.A03;
                }
                float f = (float) i;
                if (A024) {
                    i2 = r55.A03;
                } else {
                    i2 = r55.A01;
                }
                RectF rectF = new RectF(0.0f, 0.0f, f, (float) i2);
                C114825nf r33 = this.A0E;
                r33.A0N.A06 = rectF;
                r33.A0M.A00 = 0.0f;
                r33.A07(rectF);
            } else {
                C106985aV A032 = C106985aV.A03(A0G(), this.A08, this.A09, this.A0J, A0A4);
                if (A032 != null) {
                    C114825nf r35 = this.A0E;
                    r35.A0M.setDoodle(A032);
                    r35.A0T.A05(str);
                }
            }
        } else {
            this.A0b = bundle2.getBoolean("key_video_is_muted", false);
            A1Z();
        }
        ViewGroup A0J2 = C86644Kx.A0J(view2, R.id.video_player);
        AnonymousClass0YY.A06(A0J2, 2);
        AnonymousClass5YG.A03(A0J2, this.A0W);
        this.A0W.A0P(((int) this.A07) + 1);
        View findViewById2 = view2.findViewById(R.id.color_picker_container);
        C86604Kt.A1D(findViewById2, findViewById2.getPaddingLeft(), findViewById2.getPaddingTop() * 2);
        C18290x4.A1F(A0J2, this, 26);
        if (this.A00.equals(A1E.B4X())) {
            C86644Kx.A0x(A0J(), R.id.content);
        }
    }

    public final long A1U() {
        C152347Yn r15 = this.A0O;
        if (r15 == null) {
            r15 = this.A0P.A0C();
            this.A0O = r15;
        }
        long j = this.A08;
        long j2 = this.A07;
        long j3 = j - j2;
        if (this.A00 != 3) {
            long j4 = this.A03;
            long j5 = this.A04;
            if (j3 > j4 || (j3 == j5 && j4 > j5)) {
                j = Math.min(j2 + Math.max(j4, 1000), this.A0V.A04);
            }
        }
        C162287rd r14 = this.A0P;
        C104315Qm r12 = this.A0V;
        File file = this.A0X;
        long j6 = j;
        C104315Qm r16 = r12;
        File file2 = file;
        long A0A2 = r14.A0A(r15, r16, file2, j6, j2, this.A0d, this.A0b, this.A0g);
        if (this.A00 == 3) {
            C107565bW.A0I(this.A0H, this.A08, Math.max(this.A08 - this.A07, 1000) / 1000);
            C86634Kw.A1J(this.A0I, this.A08, A0A2);
        }
        this.A01 = A0A2;
        C162287rd r6 = this.A0P;
        Uri fromFile = Uri.fromFile(this.A0X);
        this.A0Y = r6.A0E(A1D(), fromFile, this.A0V, this.A0O.A02);
        return A0A2;
    }

    public final long A1V() {
        C152347Yn A0D2 = this.A0P.A0D(this.A0f, this.A0d, this.A0e);
        this.A0N = A0D2;
        long j = this.A08;
        long j2 = this.A07;
        long j3 = j - j2;
        long max = Math.max(j3, 1000);
        if (this.A00 == 3) {
            long j4 = this.A04;
            long j5 = this.A03;
            if (j3 > j4 || (j3 == j5 && j4 > j5)) {
                j = Math.min(j2 + Math.max(j4, 1000), this.A0V.A04);
            }
        }
        C162287rd r9 = this.A0P;
        C104315Qm r8 = this.A0V;
        File file = this.A0X;
        C162287rd r16 = r9;
        C104315Qm r18 = r8;
        File file2 = file;
        long A0A2 = r16.A0A(A0D2, r18, file2, j, j2, this.A0d, this.A0b, this.A0g);
        if (this.A00 != 3) {
            C107565bW.A0I(this.A0H, this.A08, max / 1000);
            C86634Kw.A1J(this.A0I, this.A08, A0A2);
        }
        this.A06 = A0A2;
        C162287rd r6 = this.A0P;
        Uri fromFile = Uri.fromFile(this.A0X);
        this.A0Z = r6.A0E(A1D(), fromFile, this.A0V, this.A0N.A02);
        return A0A2;
    }

    public final void A1W() {
        StringBuilder A0A2 = C18330xA.A0A(C107565bW.A0A(this.A08, this.A07 / 1000));
        A0A2.append(" - ");
        A0A2.append(C107565bW.A0A(this.A08, this.A08 / 1000));
        this.A0J.setText(A0A2.toString());
    }

    public final void A1X() {
        if (this.A0W.A0a()) {
            A1T();
            return;
        }
        this.A0W.A09().setBackground((Drawable) null);
        if (((long) this.A0W.A05()) > this.A08 - 2000) {
            this.A0W.A0P((int) this.A07);
        }
        A1M();
    }

    public final void A1Z() {
        if (!this.A0d) {
            C186068uh A1E = C86664Kz.A1E(this);
            Uri uri = this.A00;
            boolean z = this.A0b;
            AnonymousClass5YF A2l = AnonymousClass4SG.A2l(uri, (MediaComposerActivity) A1E);
            synchronized (A2l) {
                A2l.A0E = z;
            }
            A1Y();
            this.A0W.A0Z(this.A0b);
            A1V();
            if (this.A0a) {
                A1U();
            }
        }
    }

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return AnonymousClass001.A0R(layoutInflater, viewGroup, R.layout.f8nameremoved);
    }

    public void A0a() {
        super.A0a();
        AnonymousClass5YG r0 = this.A0W;
        if (r0 != null) {
            r0.A0G();
            this.A0W.A0D();
            this.A0W = null;
        }
    }

    public void A0c() {
        super.A0c();
        VideoTimelineView videoTimelineView = this.A0R;
        if (videoTimelineView != null) {
            videoTimelineView.A0I = null;
            this.A0R = null;
        }
        AnonymousClass5YG r0 = this.A0W;
        if (r0 != null) {
            r0.A0G();
            this.A0W.A0D();
            this.A0W = null;
        }
    }

    public void A0e() {
        super.A0e();
        A1T();
    }

    public void A0f() {
        super.A0f();
        int A052 = this.A0W.A05();
        AnonymousClass5YG r1 = this.A0W;
        int i = A052 + 1;
        if (A052 > 0) {
            i = A052 - 1;
        }
        r1.A0P(i);
        this.A0W.A0P(A052);
    }

    public void A1J() {
        super.A1J();
        if (this.A0d) {
            A1M();
        }
    }

    public void A1P(Rect rect) {
        super.A1P(rect);
        if (this.A0B != null) {
            this.A0E.setPadding(rect.left, C86654Ky.A02(C08310eF.A09(this), R.dimen.f6nameremoved, rect.top), rect.right, C86654Ky.A02(C08310eF.A09(this), R.dimen.f6nameremoved, rect.bottom));
            this.A0D.setPadding(rect.left, rect.top, rect.right, 0);
        }
    }

    public void A1R(boolean z) {
        super.A1R(z);
        this.A0c = z;
    }

    public final void A1Y() {
        ImageView imageView;
        int i;
        View view;
        View.OnClickListener onClickListener;
        Context A0G2 = A0G();
        if (this.A0d) {
            this.A0F.setImageResource(R.drawable.ic_unmute);
            C107335b8.A0E(this.A0F, AnonymousClass0Y8.A04(A0G2, R.color.f5nameremoved));
            view = this.A0B;
            onClickListener = null;
        } else {
            boolean z = this.A0b;
            ImageView imageView2 = this.A0F;
            if (z) {
                imageView2.setImageResource(R.drawable.ic_unmute);
                imageView = this.A0F;
                i = R.string.f11nameremoved;
            } else {
                imageView2.setImageResource(R.drawable.ic_mute);
                imageView = this.A0F;
                i = R.string.f11nameremoved;
            }
            C86634Kw.A1D(imageView, this, i);
            C107335b8.A0E(this.A0F, AnonymousClass0Y8.A04(A0G2, R.color.f5nameremoved));
            view = this.A0B;
            onClickListener = this.A09;
        }
        view.setOnClickListener(onClickListener);
    }
}
