package X;

import com.google.android.exoplayer2.Timeline;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.85w  reason: invalid class name and case insensitive filesystem */
public class C1685585w implements C186488vR {
    public final /* synthetic */ C138386qG A00;

    public C1685585w(C138386qG r1) {
        this.A00 = r1;
    }

    public /* synthetic */ void BSZ(boolean z) {
    }

    public /* synthetic */ void BUm(boolean z) {
    }

    public void BUn(boolean z) {
    }

    public void BYE(C158477k2 r1) {
    }

    public /* synthetic */ void BYI(int i) {
    }

    public /* synthetic */ void BYJ(int i) {
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BYK(X.C143886zd r8) {
        /*
            r7 = this;
            int r0 = r8.type
            r5 = 1
            if (r0 != r5) goto L_0x0085
            java.lang.Throwable r1 = r8.cause
            r1.getClass()
            java.lang.Exception r1 = (java.lang.Exception) r1
            boolean r0 = r1 instanceof X.C143836zY
            if (r0 == 0) goto L_0x0085
            X.6zY r1 = (X.C143836zY) r1
            X.7o8 r0 = r1.codecInfo
            if (r0 != 0) goto L_0x0082
            java.lang.Throwable r0 = r1.getCause()
            boolean r0 = r0 instanceof X.C143176yS
            if (r0 == 0) goto L_0x0078
            java.lang.String r2 = "error querying decoder"
        L_0x0020:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "ExoPlayerVideoPlayer/error in playback errorMessage="
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " playerid="
            r1.append(r0)
            X.6qG r6 = r7.A00
            int r0 = r6.hashCode()
            java.lang.String r0 = X.AnonymousClass000.A0h(r1, r0)
            com.whatsapp.util.Log.e(r0, r8)
            if (r2 != 0) goto L_0x004f
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "exoplayer_error_type_"
            r1.append(r0)
            int r0 = r8.type
            java.lang.String r2 = X.AnonymousClass000.A0h(r1, r0)
        L_0x004f:
            android.app.Activity r1 = r6.A02
            r0 = 2131889132(0x7f120bec, float:1.9412919E38)
            java.lang.String r4 = r1.getString(r0)
            java.lang.String r1 = " "
            java.lang.String r0 = "_"
            java.lang.String r3 = r2.replace(r1, r0)
            java.lang.Integer r2 = X.C18280x3.A0S()
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "ExoPlayerVideoPlayer/onError="
            X.C18260x0.A0r(r0, r4, r1)
            r6.A0Y(r4, r5, r3)
            X.7bE r0 = r6.A08
            if (r0 == 0) goto L_0x0077
            r0.A04(r2, r5)
        L_0x0077:
            return
        L_0x0078:
            boolean r0 = r1.secureDecoderRequired
            if (r0 == 0) goto L_0x007f
            java.lang.String r2 = "error no secure decoder"
            goto L_0x0020
        L_0x007f:
            java.lang.String r2 = "no secure decoder"
            goto L_0x0020
        L_0x0082:
            java.lang.String r2 = "error instantiating decoder"
            goto L_0x0020
        L_0x0085:
            r2 = 0
            goto L_0x0020
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1685585w.BYK(X.6zd):void");
    }

    public /* synthetic */ void BYS(int i) {
    }

    public /* synthetic */ void Bb4() {
    }

    public /* synthetic */ void BcO(List list) {
    }

    public /* synthetic */ void BW7(C151877Wq r1, int i) {
    }

    public /* synthetic */ void BYA(boolean z, int i) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0077, code lost:
        if (r6 != false) goto L_0x004e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BYM(boolean r6, int r7) {
        /*
            r5 = this;
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "ExoPlayerVideoPlayer/playerState="
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " playWhenReady="
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = " playerStoppedForReuse="
            r1.append(r0)
            X.6qG r4 = r5.A00
            boolean r0 = r4.A0G
            X.C18260x0.A1U(r1, r0)
            r3 = 0
            r2 = 1
            if (r7 != r2) goto L_0x0028
            r4.A0G = r3
            r4.A0D = r3
        L_0x0028:
            boolean r0 = r4.A0G
            if (r0 != 0) goto L_0x0074
            X.8pt r0 = r4.A0A
            if (r0 == 0) goto L_0x0033
            r0.BYM(r6, r7)
        L_0x0033:
            X.7bE r0 = r4.A08
            if (r0 == 0) goto L_0x003a
            r0.A05(r6, r7)
        L_0x003a:
            r0 = 3
            if (r7 != r0) goto L_0x0075
            if (r6 == 0) goto L_0x007a
            boolean r0 = r4.A0H
            if (r0 == 0) goto L_0x004e
            r4.A0H = r3
            X.561 r1 = r4.A09
            if (r1 == 0) goto L_0x004e
            r0 = 500(0x1f4, float:7.0E-43)
            r1.A0E(r0)
        L_0x004e:
            r4.A0D = r2
            boolean r0 = r4.A0F
            if (r0 != 0) goto L_0x005d
            r4.A0F = r2
            X.8ps r0 = r4.A09
            if (r0 == 0) goto L_0x005d
            r0.Bc9(r4)
        L_0x005d:
            r4.A0E = r3
        L_0x005f:
            boolean r2 = r4.A0A
            r1 = 2
            boolean r0 = X.AnonymousClass000.A1U(r7, r1)
            if (r2 == r0) goto L_0x0074
            if (r7 != r1) goto L_0x006b
            r3 = 1
        L_0x006b:
            r4.A0A = r3
            X.8pp r0 = r4.A06
            if (r0 == 0) goto L_0x0074
            r0.BNm(r4, r3)
        L_0x0074:
            return
        L_0x0075:
            if (r7 != r0) goto L_0x007a
            if (r6 == 0) goto L_0x007a
            goto L_0x004e
        L_0x007a:
            r4.A0D = r3
            r0 = 4
            if (r7 != r0) goto L_0x005d
            boolean r0 = r4.A0E
            if (r0 != 0) goto L_0x005f
            r4.A0E = r2
            r4.A0H()
            goto L_0x005f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1685585w.BYM(boolean, int):void");
    }

    public /* synthetic */ void Be5(Timeline timeline, int i) {
        AnonymousClass727.A00(this, timeline, i);
    }

    public void BeS(C166387yb r8, C151537Ve r9) {
        String string;
        Integer A0b;
        String str;
        C86604Kt.A1V(AnonymousClass001.A0o(), "ExoPlayerVideoPlayer/track selection changed  playerid=", this);
        C138386qG r6 = this.A00;
        AnonymousClass7UF r1 = r6.A06.A00;
        if (r1 != null) {
            if (r1.A00(2) == 1) {
                Log.i("ExoPlayerVideoPlayer/unplayable video track");
                string = r6.A02.getString(R.string.f11nameremoved);
                A0b = C18290x4.A0a();
                str = "unplayable_video_track";
            } else if (r1.A00(1) == 1) {
                Log.i("ExoPlayerVideoPlayer/unplayable audio track");
                string = r6.A02.getString(R.string.f11nameremoved);
                A0b = C18290x4.A0b();
                str = "unplayable_audio_track";
            } else {
                return;
            }
            C18260x0.A0r("ExoPlayerVideoPlayer/onError=", string, AnonymousClass001.A0o());
            r6.A0Y(string, true, str);
            C153387bE r0 = r6.A08;
            if (r0 != null) {
                r0.A04(A0b, true);
            }
        }
    }

    public /* synthetic */ void Be6(Timeline timeline, Object obj, int i) {
    }
}
