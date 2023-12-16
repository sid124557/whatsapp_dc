package X;

import android.text.TextUtils;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.85B  reason: invalid class name */
public class AnonymousClass85B implements C186538vW {
    public final /* synthetic */ AnonymousClass567 A00;

    public void BfR(float f, int i, int i2, int i3) {
        this.A00.A0T.A0S(new AnonymousClass8MO(this, f, i, i2, i3, 4));
    }

    public AnonymousClass85B(AnonymousClass567 r1) {
        this.A00 = r1;
    }

    public void BRg() {
        C117105rO.A00(this.A00.A0T, this, 1);
    }

    public void BVD(boolean z) {
    }

    public /* synthetic */ void BWz(byte[] bArr) {
    }

    public void BYB() {
    }

    public void BYo() {
    }

    public void Bb5(long j) {
    }

    public void BcA(C166427yf r4, C166537yr r5, String str, long j, boolean z, boolean z2) {
        this.A00.A0T.A0S(new C117095rN(this, 49));
    }

    public void Bco(long j, long j2, boolean z, boolean z2) {
        this.A00.A0T.A0S(new C117095rN(this, 48));
    }

    public void Bct(C147697Fh r3) {
        C117105rO.A00(this.A00.A0T, this, 3);
    }

    public void Bcu(boolean z) {
    }

    public void BeA(List list) {
    }

    public void BfG(C147697Fh r3, C142486xH r4, C166427yf r5, C166537yr r6, String str, boolean z, boolean z2) {
        C117105rO.A00(this.A00.A0T, this, 2);
    }

    public void BfO(C147697Fh r3, C142486xH r4, C166427yf r5, C166537yr r6, String str, String str2, String str3, long j, long j2, boolean z) {
        C117105rO.A00(this.A00.A0T, this, 0);
    }

    public void BfP() {
    }

    public void BfQ() {
    }

    public void BfT(C166427yf r3, C166537yr r4, String str, String str2, String str3, String str4, String str5, long j, boolean z, boolean z2) {
        C117105rO.A00(this.A00.A0T, this, 4);
    }

    public void Bfg(C160117n4 r1) {
    }

    public void BYD(C147697Fh r8, C160117n4 r9, C166427yf r10, C166537yr r11, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            str2 = "exoplayer_error_type_unknown";
        }
        AnonymousClass567 r6 = this.A00;
        String string = r6.A02.getString(R.string.f11nameremoved);
        String replace = str2.replace(" ", "_");
        Integer A0S = C18280x3.A0S();
        C18260x0.A0r("ExoPlayerVideoPlayer/onError=", string, AnonymousClass001.A0o());
        r6.A0Y(string, true, replace);
        C153387bE r0 = r6.A0B;
        if (r0 != null) {
            r0.A04(A0S, true);
        }
    }

    public void BYm(C166537yr r1, String str) {
    }

    public void BfL(String str, String str2) {
    }

    public void Bfb(boolean z, boolean z2) {
    }

    public void BQi(long j, String str, boolean z) {
    }

    public void BYG(C166537yr r1, float f, long j) {
    }

    public void BSU(C160117n4 r1, String str, String str2, String str3, long j) {
    }

    public void BfE(C166427yf r1, C166537yr r2, String str, String str2, String str3, String str4, long j, boolean z) {
    }
}
