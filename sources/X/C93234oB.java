package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.search.views.itemviews.AudioPlayerView;
import com.whatsapp.search.views.itemviews.VoiceNoteProfileAvatarView;

/* renamed from: X.4oB  reason: invalid class name and case insensitive filesystem */
public class C93234oB extends C92644n1 {
    public TextView A00;
    public C54602oz A01;
    public C182938pE A02;
    public AnonymousClass5UY A03;
    public C95884uo A04;
    public final View.OnClickListener A05 = new C109345eT(this, 35);
    public final ImageView A06;
    public final ImageView A07;
    public final C105365Uq A08;
    public final C113895mA A09;
    public final AnonymousClass5NZ A0A;
    public final AudioPlayerView A0B;
    public final VoiceNoteProfileAvatarView A0C;
    public final C184608sD A0D = new C116645qc(this);
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0047, code lost:
        if (r0.A09.A0X(5884) != false) goto L_0x0049;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C93234oB(android.content.Context r10, X.C105365Uq r11, X.AnonymousClass677 r12, X.AnonymousClass5RC r13, X.C113895mA r14, X.C30721mu r15) {
        /*
            r9 = this;
            r3 = r9
            r4 = r10
            r5 = r12
            r6 = r13
            r7 = r14
            r8 = r15
            r3.<init>(r4, r5, r6, r7, r8)
            X.5qc r0 = new X.5qc
            r0.<init>(r9)
            r9.A0D = r0
            r1 = 35
            X.5eT r0 = new X.5eT
            r0.<init>(r9, r1)
            r9.A05 = r0
            r9.A08 = r11
            r9.A09 = r14
            X.1VX r0 = r9.A0O
            boolean r0 = X.AnonymousClass5ZQ.A01(r0)
            r9.A0G = r0
            r0 = 2131429122(0x7f0b0702, float:1.8479908E38)
            android.view.View r0 = X.C06560Yg.A02(r9, r0)
            com.whatsapp.search.views.itemviews.AudioPlayerView r0 = (com.whatsapp.search.views.itemviews.AudioPlayerView) r0
            r9.A0B = r0
            boolean r2 = X.AnonymousClass2z0.A0C(r15)
            X.4uo r0 = r9.A04
            boolean r1 = r0.A0A()
            if (r2 == 0) goto L_0x004a
            if (r1 == 0) goto L_0x0049
            X.1VX r1 = r0.A09
            r0 = 5884(0x16fc, float:8.245E-42)
            boolean r0 = r1.A0X(r0)
            r1 = 1
            if (r0 == 0) goto L_0x004a
        L_0x0049:
            r1 = 0
        L_0x004a:
            r9.A0F = r1
            if (r1 == 0) goto L_0x0057
            r0 = 2131427783(0x7f0b01c7, float:1.8477192E38)
            X.5UY r0 = X.AnonymousClass0x2.A0M(r9, r0)
            r9.A03 = r0
        L_0x0057:
            r0 = 2131429152(0x7f0b0720, float:1.8479969E38)
            android.view.View r1 = X.C06560Yg.A02(r9, r0)
            com.whatsapp.search.views.itemviews.VoiceNoteProfileAvatarView r1 = (com.whatsapp.search.views.itemviews.VoiceNoteProfileAvatarView) r1
            r9.A0C = r1
            android.widget.ImageView r0 = r1.A05
            r9.A07 = r0
            android.widget.ImageView r0 = r1.A03
            r9.A06 = r0
            r0 = 2131429404(0x7f0b081c, float:1.848048E38)
            android.widget.TextView r0 = X.AnonymousClass002.A09(r9, r0)
            r9.A00 = r0
            X.33i r0 = r9.A0L
            boolean r0 = X.C107295b4.A09(r0)
            r9.A0E = r0
            X.8pE r0 = r9.A02
            X.5NZ r0 = r0.B04(r1)
            r9.A0A = r0
            r0 = 0
            r9.A2B(r0, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C93234oB.<init>(android.content.Context, X.5Uq, X.677, X.5RC, X.5mA, X.1mu):void");
    }

    public void A1H() {
        super.A1H();
        A2B(false, false);
    }

    public void A1q(C624134x r3, boolean z) {
        boolean A1W = C18300x5.A1W(r3, (C30471mV) this.A0S);
        super.A1q(r3, z);
        if (z || A1W) {
            A2B(false, false);
        }
    }

    public void A1r(C624134x r3, boolean z) {
        super.A1q(r3, true);
        A2B(false, true);
    }

    public void A1N() {
        C182278o9 r0;
        C30721mu A022;
        C113895mA r5 = this.A09;
        C107465bM.A04(this.A03.getRootView(), r5, this.A00);
        C30721mu r11 = (C30721mu) ((C30471mV) this.A0S);
        AnonymousClass677 r4 = this.A0m;
        if (r4 instanceof C185928uT) {
            C185928uT r42 = (C185928uT) r4;
            boolean BIv = r42.BIv();
            if (this.A02 != null) {
                if (!RequestPermissionActivity.A0r(getContext(), this.A02, this.A0O)) {
                    return;
                }
            }
            Context context = getContext();
            AnonymousClass92K r12 = new AnonymousClass92K(this, 0);
            C105025Tg r13 = this.A0T;
            C626936e.A06(r13);
            if (C107135al.A03(context, this.A0X, r11, r12, r13, this.A22)) {
                if (!(!this.A0G || (A022 = r5.A02()) == null || A022.A1L == r11.A1L)) {
                    r42.Bs6(A022, 0, false);
                }
                C116095pj A002 = this.A06.A00(C111095hX.A04(this), r11, true);
                A002.A0B(r11);
                A002.A0K = new AnonymousClass5AT(this, 0);
                if (BIv) {
                    r42.setFollowPlayingVoiceMemo(true);
                    r0 = new AnonymousClass69Z(this, A002, r11, 0);
                } else {
                    r0 = new C113085kr(this, r11);
                }
                A002.A0I = r0;
                A002.A0E(true);
                super.A1H();
                A2B(true, true);
                return;
            }
            return;
        }
        super.A1N();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:67:0x014d, code lost:
        if (r0 != null) goto L_0x014f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x016d  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x017d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A2B(boolean r13, boolean r14) {
        /*
            r12 = this;
            X.34x r6 = r12.A0S
            X.1mV r6 = (X.C30471mV) r6
            X.1mu r6 = (X.C30721mu) r6
            X.2z0 r8 = r6.A1J
            X.4uZ r9 = r8.A00
            boolean r10 = r9 instanceof X.C95804uY
            if (r10 != 0) goto L_0x0014
            X.2mS r0 = r6.A0z()
            if (r0 == 0) goto L_0x0019
        L_0x0014:
            com.whatsapp.search.views.itemviews.VoiceNoteProfileAvatarView r0 = r12.A0C
            r0.setIsNewsletterAudioOrPttUi(r6)
        L_0x0019:
            com.whatsapp.search.views.itemviews.AudioPlayerView r5 = r12.A0B
            com.whatsapp.search.views.itemviews.VoiceNoteProfileAvatarView r4 = r12.A0C
            X.AnonymousClass5YN.A02(r6, r5, r4)
            X.5Uq r7 = r12.A08
            X.2sr r1 = r12.A0Z
            X.3Ex r3 = r12.A0t
            X.1VX r2 = r12.A0O
            r0 = 1040(0x410, float:1.457E-42)
            boolean r0 = r2.A0X(r0)
            if (r0 == 0) goto L_0x0137
            boolean r0 = r6.A24()
            if (r0 == 0) goto L_0x0137
            X.2mS r0 = r6.A0z()
            if (r0 != 0) goto L_0x0137
            r0 = 1
            r4.setIsForwardedByNonAuthorPttUi(r0)
        L_0x0040:
            X.1VX r1 = r12.A0O
            r0 = 637(0x27d, float:8.93E-43)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x005a
            r0 = 32768(0x8000, float:4.5918E-41)
            boolean r0 = r6.A1s(r0)
            if (r0 != 0) goto L_0x0126
            r0 = 0
            r5.setTag(r0)
            r5.A00()
        L_0x005a:
            boolean r0 = r12.A0G
            if (r0 == 0) goto L_0x00d7
            android.view.View$OnClickListener r0 = r12.A05
            r4.setOnFastPlaybackButtonClickListener(r0)
            X.34x r7 = r12.A0S
            X.1mV r7 = (X.C30471mV) r7
            X.5RC r0 = r12.A06
            X.5mA r1 = r0.A03
            boolean r0 = r1.A0D(r7)
            if (r0 == 0) goto L_0x0123
            X.5pj r3 = r1.A00()
        L_0x0075:
            X.5mA r0 = r12.A09
            X.1mu r2 = r0.A02()
            X.5pj r1 = r0.A00()
            X.2z0 r0 = r7.A1J
            boolean r8 = r0.A02
            X.4uZ r0 = r0.A00
            boolean r9 = X.C627336j.A0K(r0)
            if (r3 == 0) goto L_0x0091
            boolean r0 = r3.A0I()
            if (r0 != 0) goto L_0x00a5
        L_0x0091:
            if (r13 != 0) goto L_0x00a5
            if (r1 == 0) goto L_0x009b
            boolean r0 = r1.A0I()
            if (r0 != 0) goto L_0x011e
        L_0x009b:
            if (r2 == 0) goto L_0x011e
            long r2 = r2.A1L
            long r0 = r7.A1L
            int r7 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r7 != 0) goto L_0x011e
        L_0x00a5:
            int r0 = X.C116095pj.A12
            r4.A03(r0, r14, r8, r9)
            boolean r0 = r12.A0E
            if (r0 == 0) goto L_0x00d7
            if (r8 == 0) goto L_0x00d7
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 22
            if (r1 < r0) goto L_0x00d7
            r0 = 2131429084(0x7f0b06dc, float:1.847983E38)
            android.view.View r3 = r5.findViewById(r0)
            r0 = 2131430090(0x7f0b0aca, float:1.8481871E38)
            android.view.View r2 = r4.findViewById(r0)
            if (r3 == 0) goto L_0x00d7
            if (r2 == 0) goto L_0x00d7
            int r0 = r2.getVisibility()
            if (r0 != 0) goto L_0x00d7
            r1 = 2
            X.8zS r0 = new X.8zS
            r0.<init>(r3, r1, r12)
            X.C06560Yg.A0O(r2, r0)
        L_0x00d7:
            boolean r0 = r12.A0F
            if (r0 == 0) goto L_0x011a
            X.5UY r3 = r12.A03
            if (r3 == 0) goto L_0x011a
            r0 = 0
            android.view.View r7 = X.AnonymousClass5UY.A00(r3, r0)
            com.whatsapp.voicetranscription.AudioTranscriptionView r7 = (com.whatsapp.voicetranscription.AudioTranscriptionView) r7
            X.34x r0 = r12.A0S
            X.1mV r0 = (X.C30471mV) r0
            long r4 = r7.A00
            long r1 = r0.A1L
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x011a
            r0 = -1
            r7.A00 = r0
            com.whatsapp.WaTextView r0 = r7.A01
            X.C86634Kw.A1I(r0)
            X.34x r0 = r12.A0S
            X.1mV r0 = (X.C30471mV) r0
            boolean r0 = X.C627636p.A10(r0)
            if (r0 == 0) goto L_0x011a
            X.4uo r2 = r12.A04
            X.34x r1 = r12.A0S
            X.1mV r1 = (X.C30471mV) r1
            X.1mu r1 = (X.C30721mu) r1
            X.8sD r0 = r12.A0D
            boolean r0 = r2.A0B(r1, r0)
            if (r0 != 0) goto L_0x011a
            r0 = 8
            r3.A06(r0)
        L_0x011a:
            r12.A26(r6)
            return
        L_0x011e:
            r0 = 0
            r4.A04(r0, r14, r8, r9)
            goto L_0x00d7
        L_0x0123:
            r3 = 0
            goto L_0x0075
        L_0x0126:
            r5.setTag(r8)
            X.2oz r2 = r12.A01
            r1 = 27
            X.3bw r0 = new X.3bw
            r0.<init>(r12, r1, r6)
            r2.A03(r6, r0)
            goto L_0x005a
        L_0x0137:
            r11 = 0
            r4.setIsForwardedByNonAuthorPttUi(r11)
            boolean r0 = r8.A02
            if (r0 == 0) goto L_0x0154
            android.widget.ImageView r2 = r4.A05
            if (r10 != 0) goto L_0x0167
            X.2mS r0 = r6.A0z()
            if (r0 != 0) goto L_0x0167
            X.1RR r0 = X.C56972sr.A01(r1)
            if (r0 == 0) goto L_0x0040
        L_0x014f:
            r7.A08(r2, r0)
            goto L_0x0040
        L_0x0154:
            android.widget.ImageView r10 = r4.A03
            android.widget.ImageView r2 = r4.A05
            boolean r1 = X.C627336j.A0K(r9)
            r0 = 8
            if (r1 == 0) goto L_0x018c
            r10.setVisibility(r11)
            r2.setVisibility(r0)
            r2 = r10
        L_0x0167:
            X.2mS r0 = r6.A0z()
            if (r0 == 0) goto L_0x017d
            X.2mS r0 = r6.A0z()
            X.4uY r9 = r0.A01
        L_0x0173:
            X.C626936e.A06(r9)
            X.4uZ r9 = (X.C95814uZ) r9
            X.3ZH r0 = r3.A0A(r9)
            goto L_0x014f
        L_0x017d:
            boolean r0 = X.C627336j.A0K(r9)
            if (r0 != 0) goto L_0x0187
            boolean r0 = r9 instanceof X.C135166kE
            if (r0 == 0) goto L_0x0173
        L_0x0187:
            X.4uZ r9 = r6.A0n()
            goto L_0x0173
        L_0x018c:
            r10.setVisibility(r0)
            goto L_0x0167
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C93234oB.A2B(boolean, boolean):void");
    }

    public int getMainChildMaxWidth() {
        if (this.A0n.BHf((C30471mV) this.A0S)) {
            return 0;
        }
        return getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
    }

    public int getUserNameInGroupLayoutOption() {
        return 2;
    }

    public void setDuration(String str) {
        TextView textView = this.A00;
        if (textView == null) {
            textView = AnonymousClass002.A09(this, R.id.description);
            this.A00 = textView;
        }
        textView.setText(str);
    }

    public int getCenteredLayoutId() {
        return R.layout.f8nameremoved;
    }

    public int getIncomingLayoutId() {
        return R.layout.f8nameremoved;
    }

    public int getOutgoingLayoutId() {
        return R.layout.f8nameremoved;
    }
}
