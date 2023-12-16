package X;

import java.util.List;

/* renamed from: X.5hH  reason: invalid class name and case insensitive filesystem */
public final class C110935hH implements C186538vW {
    public final /* synthetic */ AnonymousClass5TM A00;

    public C110935hH(AnonymousClass5TM r1) {
        this.A00 = r1;
    }

    public void BRg() {
    }

    public void BYo() {
    }

    public void BfL(String str, String str2) {
    }

    public void BfP() {
    }

    public void BfQ() {
    }

    public void Bfb(boolean z, boolean z2) {
    }

    public void BVD(boolean z) {
    }

    public /* synthetic */ void BWz(byte[] bArr) {
    }

    public void BYB() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("TransitionHeroPlayer - onPlaybackAboutToFinish() - playerId: ");
        AnonymousClass5TM r3 = this.A00;
        C18260x0.A1F(A0o, r3.A09);
        r3.A0B.A0S(new C117095rN(r3, 42));
    }

    public void BYD(C147697Fh r5, C160117n4 r6, C166427yf r7, C166537yr r8, String str, String str2) {
        C160117n4 r0;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("TransitionHeroPlayer - onPlaybackError() - playerId: ");
        AnonymousClass5TM r3 = this.A00;
        A0o.append(r3.A09);
        A0o.append(", videoId: ");
        String str3 = r3.A07;
        if (str3 == null) {
            str3 = "";
        }
        A0o.append(str3);
        A0o.append(", videoErrorInfo: ");
        if (r6 == null) {
            r0 = new C160117n4();
        } else {
            r0 = r6;
        }
        C18260x0.A0m(r0, A0o);
        if (r6 == null) {
            r6 = new C160117n4();
        }
        r3.A03 = r6;
        r3.A0B.A0S(new C117095rN(r3, 41));
    }

    public void BYm(C166537yr r5, String str) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("TransitionHeroPlayer - onPrepared() - playerId: ");
        AnonymousClass5TM r3 = this.A00;
        C18260x0.A1F(A0o, r3.A09);
        r3.A0B.A0S(new C117095rN(r3, 43));
    }

    public void Bb5(long j) {
    }

    public void Bct(C147697Fh r5) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("TransitionHeroPlayer - onStopped() - playerId: ");
        AnonymousClass5TM r3 = this.A00;
        C18260x0.A1F(A0o, r3.A09);
        r3.A0B.A0S(new C70153a2(r3, 5, r5));
    }

    public void Bcu(boolean z) {
    }

    public void BeA(List list) {
    }

    public void BfG(C147697Fh r5, C142486xH r6, C166427yf r7, C166537yr r8, String str, boolean z, boolean z2) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("TransitionHeroPlayer - onVideoComplete() - playerId: ");
        AnonymousClass5TM r3 = this.A00;
        C18260x0.A1F(A0o, r3.A09);
        r3.A0B.A0S(new C71403c3(r3, r5, str, 16));
    }

    public void BfR(float f, int i, int i2, int i3) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("TransitionHeroPlayer - onVideoSizeChanged() - playerId: ");
        AnonymousClass5TM r2 = this.A00;
        C18260x0.A1F(A0o, r2.A09);
        r2.A0B.A0S(new C117275rf(r2, f, i, i2));
    }

    public void BfT(C166427yf r5, C166537yr r6, String str, String str2, String str3, String str4, String str5, long j, boolean z, boolean z2) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("TransitionHeroPlayer - onVideoStartedPlaying() - playerId: ");
        AnonymousClass5TM r3 = this.A00;
        C18260x0.A1F(A0o, r3.A09);
        r3.A0B.A0S(new C70083Zv(r3, j, 25));
    }

    public void Bfg(C160117n4 r1) {
    }

    public void BQi(long j, String str, boolean z) {
    }

    public void BYG(C166537yr r1, float f, long j) {
    }

    public void BSU(C160117n4 r1, String str, String str2, String str3, long j) {
    }

    public void Bco(long j, long j2, boolean z, boolean z2) {
    }

    public void BcA(C166427yf r1, C166537yr r2, String str, long j, boolean z, boolean z2) {
    }

    public void BfE(C166427yf r1, C166537yr r2, String str, String str2, String str3, String str4, long j, boolean z) {
    }

    public void BfO(C147697Fh r1, C142486xH r2, C166427yf r3, C166537yr r4, String str, String str2, String str3, long j, long j2, boolean z) {
    }
}
