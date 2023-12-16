package X;

import android.app.Application;
import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.jobqueue.job.GetVNameCertificateJob;
import com.whatsapp.util.Log;
import java.net.MalformedURLException;
import java.util.List;

/* renamed from: X.4UA  reason: invalid class name */
public class AnonymousClass4UA extends AnonymousClass08N implements C85044Es {
    public int A00;
    public C66513Ls A01;
    public AnonymousClass4CM A02;
    public C149437Ml A03;
    public C83854Ab A04 = null;
    public C55592qb A05;
    public Runnable A06 = null;
    public String A07;
    public boolean A08;
    public boolean A09 = false;
    public boolean A0A;
    public boolean A0B;
    public final Handler A0C;
    public final C06270Wx A0D;
    public final AnonymousClass08M A0E;
    public final AnonymousClass08M A0F;
    public final AnonymousClass08M A0G;
    public final AnonymousClass08M A0H;
    public final C69263Wi A0I;
    public final C56492s4 A0J;
    public final C49712gy A0K;
    public final C29411im A0L;
    public final C620433g A0M;
    public final C105405Uu A0N;
    public final AnonymousClass5Y9 A0O;
    public final C50482iF A0P;
    public final C56422rx A0Q;
    public final C47892e0 A0R;
    public final C56612sH A0S;
    public final C620733j A0T;
    public final AnonymousClass36Y A0U;
    public final AnonymousClass1VX A0V;
    public final C106685Zz A0W;
    public final C620033c A0X;
    public final AnonymousClass31C A0Y;
    public final AnonymousClass5UP A0Z;
    public final C102055Hh A0a;
    public final C84634Dc A0b;
    public final C85104Ey A0c;
    public final AnonymousClass4FS A0d;
    public final List A0e;

    /* JADX WARNING: Removed duplicated region for block: B:47:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00da  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0E(android.text.Editable r12, X.C152967aS r13, X.C95814uZ r14, boolean r15, boolean r16) {
        /*
            r11 = this;
            r6 = r11
            r11.A0B = r15
            r0 = r16
            r11.A0A = r0
            X.3Ls r1 = r11.A01
            boolean r0 = r1 instanceof X.AnonymousClass1Hk
            if (r0 == 0) goto L_0x0013
            X.59D r0 = X.AnonymousClass59D.PAGE_UPDATED
            r11.A0H(r1, r0)
        L_0x0012:
            return
        L_0x0013:
            X.5Zz r4 = r11.A0W
            java.lang.String r0 = r12.toString()
            java.lang.String r9 = r4.A03(r0)
            if (r9 == 0) goto L_0x0031
            java.lang.String r0 = "/"
            boolean r0 = r9.endsWith(r0)
            if (r0 == 0) goto L_0x0031
            int r0 = r9.length()
            int r0 = r0 + -1
            java.lang.String r9 = X.AnonymousClass0x7.A0r(r9, r0)
        L_0x0031:
            java.lang.String r2 = r11.A07
            r11.A0N(r9)
            r5 = 0
            if (r9 == 0) goto L_0x00f1
            r11.A0O(r5)
            X.3Ls r0 = r11.A01
            if (r0 == 0) goto L_0x0048
            java.lang.String r0 = r0.A0Z
            boolean r0 = android.text.TextUtils.equals(r0, r9)
            if (r0 != 0) goto L_0x0012
        L_0x0048:
            boolean r0 = r11.A0R()
            if (r0 == 0) goto L_0x005a
            X.08M r3 = r11.A0H
            X.59D r1 = X.AnonymousClass59D.LOADING
            X.5SA r0 = new X.5SA
            r0.<init>(r5, r1, r5)
            r3.A0H(r0)
        L_0x005a:
            X.36Y r0 = r11.A0U
            boolean r0 = r0.A0J(r9)
            r8 = r13
            r7 = r14
            if (r0 == 0) goto L_0x00a4
            android.net.Uri r0 = android.net.Uri.parse(r9)
            com.whatsapp.jid.UserJid r0 = X.AnonymousClass36Y.A01(r0)
            if (r0 == 0) goto L_0x00c3
            r11.A0J(r13, r0, r9)
        L_0x0071:
            X.3Ls r0 = r11.A01
            if (r0 != 0) goto L_0x0012
            boolean r0 = r11.A09
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
            if (r0 == 0) goto L_0x0097
            if (r2 == 0) goto L_0x0097
            boolean r0 = r2.contains(r9)
            if (r0 != 0) goto L_0x008b
            boolean r0 = r9.contains(r2)
            if (r0 == 0) goto L_0x0097
        L_0x008b:
            X.1VX r1 = r11.A0V
            r0 = 4054(0xfd6, float:5.681E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x0097
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
        L_0x0097:
            boolean r0 = r3.booleanValue()
            r11.A0D()
            if (r0 == 0) goto L_0x00df
            r11.A0I(r13, r14, r9)
            return
        L_0x00a4:
            X.2iF r3 = r11.A0P
            boolean r0 = r3.A01()
            if (r0 == 0) goto L_0x00c3
            X.2ep r0 = r3.A08
            boolean r0 = r0.A01(r9)
            if (r0 == 0) goto L_0x00c3
            X.2s4 r1 = r11.A0J
            X.6eR r0 = new X.6eR
            r0.<init>(r1, r4, r9)
            r11.A01 = r0
            X.4Dc r0 = r11.A0b
            r3.A00(r0, r9)
            goto L_0x0071
        L_0x00c3:
            boolean r0 = r14 instanceof X.C95804uY
            if (r0 == 0) goto L_0x00da
            X.5UP r0 = r11.A0Z
            X.1VX r1 = r0.A01
            r0 = 5287(0x14a7, float:7.409E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x00da
            r1 = 0
        L_0x00d4:
            X.59D r0 = X.AnonymousClass59D.SMALL_THUMBNAIL_LOADED
            r11.A0H(r1, r0)
            goto L_0x0071
        L_0x00da:
            X.3Ls r1 = X.C57782uC.A00(r9)
            goto L_0x00d4
        L_0x00df:
            r0 = 700(0x2bc, float:9.81E-43)
            r10 = 19
            X.3cN r5 = new X.3cN
            r5.<init>(r6, r7, r8, r9, r10)
            r11.A06 = r5
            android.os.Handler r2 = r11.A0C
            long r0 = (long) r0
            r2.postDelayed(r5, r0)
            return
        L_0x00f1:
            r11.A0D()
            X.08M r0 = r11.A0E
            r0.A0H(r5)
            X.08M r0 = r11.A0H
            r0.A0H(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4UA.A0E(android.text.Editable, X.7aS, X.4uZ, boolean, boolean):void");
    }

    public void A0C() {
        for (Object A1K : this.A0e) {
            AnonymousClass0x9.A1K(A1K);
        }
        A0D();
    }

    public final void A0D() {
        Runnable runnable = this.A06;
        if (runnable != null) {
            this.A0C.removeCallbacks(runnable);
            this.A06 = null;
        }
        this.A04 = null;
    }

    public void A0F(C66513Ls r3) {
        String str;
        if (this.A00 == 0 && r3 != null && (str = r3.A0Z) != null && str.equals(this.A07)) {
            this.A00 = 1;
            this.A01 = r3;
            this.A05 = null;
        }
    }

    public void A0I(C152967aS r5, C95814uZ r6, String str) {
        if (str != null) {
            if (this.A0U.A0J(str)) {
                UserJid A012 = AnonymousClass36Y.A01(Uri.parse(str));
                if (A012 != null) {
                    A0J(r5, A012, str);
                    return;
                }
            } else {
                C50482iF r3 = this.A0P;
                if (r3.A01() && r3.A08.A01(str)) {
                    this.A01 = new C131946eR(this.A0J, this.A0W, str);
                    r3.A00(this.A0b, str);
                    return;
                }
            }
            A0K(r6, str);
        }
    }

    public final void A0J(C152967aS r7, UserJid userJid, String str) {
        this.A01 = new C131936eQ(this.A0J, userJid, this.A0W, str);
        int dimensionPixelSize = this.A00.getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
        C108815db A092 = this.A0N.A09(userJid);
        if (A092 != null) {
            r7.A02((ImageView) null, A092, (C181758nH) null, new C111875ip(this, userJid), 2);
            return;
        }
        AnonymousClass5Y9 r2 = this.A0O;
        C148047Gs A042 = r2.A0C.A04(userJid);
        if ((A042 == null || A042.A01) && !r2.A02) {
            int i = 1;
            if (r2.A08.A0a(userJid)) {
                i = 4;
            }
            r2.A06(userJid, dimensionPixelSize, i * 6, false);
            return;
        }
        C117155rT.A00(this.A0d, this, userJid, 15);
    }

    public final void A0L(UserJid userJid) {
        if (this.A01 != null) {
            C55502qS A012 = this.A0Q.A01(userJid);
            if (A012 != null) {
                this.A01.A0J = A012.A08;
                Log.d("ConversationDelegate/onPreviewLoadingInfoUpdated fetch Catalog Taxes");
                A0G(this.A01, AnonymousClass59D.PAGE_UPDATED);
                return;
            }
            this.A0K.A02(new GetVNameCertificateJob(userJid));
        }
    }

    public final void A0M(C55592qb r3, boolean z, boolean z2) {
        C624134x r0;
        C149437Ml r02 = this.A03;
        if (r02 != null) {
            if (z) {
                this.A0G.A0G(r02.A01);
            }
            if (z2 && (r0 = this.A03.A00) != null) {
                this.A0F.A0G(Pair.create(r0, r3));
            }
        }
        this.A03 = null;
    }

    public void A0N(String str) {
        if (!AnonymousClass75J.A00(str, this.A07)) {
            this.A00 = 0;
            this.A07 = str;
            this.A08 = true;
            this.A01 = null;
            this.A05 = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        if (r1 == false) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0O(java.lang.String r5) {
        /*
            r4 = this;
            java.lang.String r0 = r4.A07
            boolean r0 = android.text.TextUtils.equals(r0, r5)
            if (r0 == 0) goto L_0x0021
            r3 = 0
            r4.A08 = r3
            r2 = 0
            r4.A01 = r2
            r4.A05 = r2
            X.7Ml r0 = r4.A03
            if (r0 == 0) goto L_0x001d
            java.lang.String r0 = r0.A02
            boolean r1 = android.text.TextUtils.equals(r0, r5)
            r0 = 1
            if (r1 != 0) goto L_0x001e
        L_0x001d:
            r0 = 0
        L_0x001e:
            r4.A0M(r2, r0, r3)
        L_0x0021:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4UA.A0O(java.lang.String):void");
    }

    public void A0P(boolean z) {
        C66513Ls r1;
        if (this.A00 == 1 && (r1 = this.A01) != null && r1.A0W != null && this.A08 && !(r1 instanceof AnonymousClass1Hk)) {
            this.A0d.BkM(new C71703cX(30, (Object) this, z));
        }
    }

    public boolean A0Q() {
        C66513Ls r0 = this.A01;
        if (r0 == null || !TextUtils.equals(this.A07, r0.A0Z) || !this.A01.A0F() || !this.A08) {
            return false;
        }
        return true;
    }

    public final boolean A0R() {
        if (!this.A0A || !this.A0V.A0Y(C58422vE.A01, 3254)) {
            return false;
        }
        return true;
    }

    public void Bma(String str) {
        if (this.A00 != 3 || !this.A08 || !str.equals(this.A07)) {
            C149437Ml r0 = this.A03;
            if (r0 != null && str.equals(r0.A02)) {
                this.A00 = 5;
                A0M((C55592qb) null, false, true);
                return;
            }
            return;
        }
        this.A00 = 5;
        if (A0R()) {
            this.A0H.A0G(new AnonymousClass5SA((C66513Ls) null, AnonymousClass59D.LARGE_THUMBNAIL_FAILED, (String) null));
        }
        this.A03 = null;
    }

    public void Bmb(C55592qb r3, String str) {
        if (this.A00 == 1 && str.equals(this.A07)) {
            this.A00 = 2;
            if (this.A08) {
                this.A05 = r3;
            }
        }
    }

    public void Bmc(C55592qb r6, String str) {
        if (this.A00 != 3 || !str.equals(this.A07)) {
            C149437Ml r0 = this.A03;
            if (r0 != null && str.equals(r0.A02)) {
                this.A00 = 4;
                A0M(r6, false, true);
                return;
            }
            return;
        }
        this.A00 = 4;
        C66513Ls r4 = this.A01;
        if (r4 != null && A0R()) {
            this.A0H.A0G(new AnonymousClass5SA(r4, AnonymousClass59D.LARGE_THUMBNAIL_LOADED, (String) null));
        }
        if (this.A08) {
            this.A05 = r6;
        }
        this.A03 = null;
    }

    public void Bmd(AnonymousClass65N r4, String str) {
        if (this.A00 == 2 && str.equals(this.A07)) {
            this.A00 = 3;
            A0M((C55592qb) null, true, false);
            this.A03 = new C149437Ml(this, r4, str);
        }
    }

    public AnonymousClass4UA(Application application, Handler handler, C69263Wi r6, C56492s4 r7, C49712gy r8, C29411im r9, C620433g r10, AnonymousClass4CM r11, C105405Uu r12, AnonymousClass5Y9 r13, C50482iF r14, C56422rx r15, C47892e0 r16, C56612sH r17, C620733j r18, AnonymousClass36Y r19, AnonymousClass1VX r20, C106685Zz r21, C620033c r22, AnonymousClass31C r23, AnonymousClass5UP r24, C102055Hh r25, AnonymousClass4FS r26) {
        super(application);
        AnonymousClass08M A012 = AnonymousClass08M.A01();
        this.A0E = A012;
        this.A0H = AnonymousClass08M.A01();
        this.A0D = C05110Rz.A00(new AnonymousClass921(this, 1), A012);
        this.A0F = AnonymousClass08M.A01();
        this.A0G = AnonymousClass08M.A01();
        this.A0e = AnonymousClass0x9.A18();
        this.A0b = new C124136Bc(this, 1);
        this.A0c = new C116225pw(this);
        this.A0S = r17;
        this.A0V = r20;
        this.A0I = r6;
        this.A02 = r11;
        this.A0d = r26;
        this.A0W = r21;
        this.A0J = r7;
        this.A0P = r14;
        this.A0K = r8;
        this.A0Y = r23;
        this.A0O = r13;
        this.A0U = r19;
        this.A0T = r18;
        this.A0X = r22;
        this.A0Z = r24;
        this.A0L = r9;
        this.A0Q = r15;
        this.A0N = r12;
        this.A0M = r10;
        this.A0R = r16;
        this.A0a = r25;
        this.A0C = handler;
    }

    public final void A0G(C66513Ls r4, AnonymousClass59D r5) {
        String str;
        if (!A0R()) {
            this.A0E.A0G(r4);
        } else if (r4 != null) {
            AnonymousClass08M r2 = this.A0H;
            try {
                str = r4.A07();
            } catch (MalformedURLException unused) {
                str = r4.A0Z;
            }
            r2.A0G(new AnonymousClass5SA(r4, r5, str));
        }
    }

    public final void A0H(C66513Ls r4, AnonymousClass59D r5) {
        String str;
        if (!A0R()) {
            this.A0E.A0G(r4);
        } else if (r4 != null) {
            AnonymousClass08M r2 = this.A0H;
            try {
                str = r4.A07();
            } catch (MalformedURLException unused) {
                str = r4.A0Z;
            }
            r2.A0H(new AnonymousClass5SA(r4, r5, str));
        }
    }

    public final void A0K(C95814uZ r11, String str) {
        this.A04 = new C114655nO(this, SystemClock.elapsedRealtime());
        String str2 = str;
        if (!(r11 instanceof C95804uY) || !this.A0Z.A01.A0X(5287)) {
            C69263Wi r2 = this.A0I;
            AnonymousClass4FS r7 = this.A0d;
            C57772uB.A00(r2, new C66513Ls(this.A0J, this.A0W, str), this.A0T, this.A0V, this.A04, r7, str2, this.A0B);
            return;
        }
        C102055Hh r3 = this.A0a;
        C115075o4 r22 = new C115075o4(this, str);
        C162457s7.A0J(str, 0);
        C71403c3.A00(r3.A01, r3, r22, str, 1);
    }
}
