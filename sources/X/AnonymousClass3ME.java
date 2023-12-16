package X;

import android.app.Activity;
import com.whatsapp.jid.UserJid;
import javax.crypto.SecretKey;

/* renamed from: X.3ME  reason: invalid class name */
public final class AnonymousClass3ME implements AnonymousClass4EG {
    public final Activity A00;
    public final C59062wH A01;
    public final C69263Wi A02;
    public final AnonymousClass2ZN A03;
    public final C60032xt A04;
    public final C66543Lv A05;
    public final AnonymousClass1VX A06;
    public final AnonymousClass4FS A07;
    public final C49702gx A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final SecretKey A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final byte[] A0G;

    public final void A00(Activity activity, AnonymousClass2ZN r14, C27091dG r15, String str, String str2, String str3, boolean z, boolean z2) {
        String str4 = str3;
        this.A02.BkS(new C71083bX(activity, r14, this, r15, str4, str2, str, 0, z, z2));
    }

    public void BQb(String str) {
        C162457s7.A0J(str, 0);
        A00(this.A00, this.A03, (C27091dG) null, str, (String) null, (String) null, true, false);
    }

    public void BQc(UserJid userJid, String str, int i, boolean z, boolean z2) {
        C162457s7.A0J(str, 1);
        C71403c3.A00(this.A07, this, userJid, str, 17);
    }

    public AnonymousClass3ME(Activity activity, C59062wH r3, C69263Wi r4, AnonymousClass2ZN r5, C60032xt r6, C66543Lv r7, AnonymousClass1VX r8, AnonymousClass4FS r9, C49702gx r10, String str, String str2, String str3, String str4, SecretKey secretKey, byte[] bArr, boolean z, boolean z2) {
        this.A00 = activity;
        this.A03 = r5;
        this.A0E = z;
        this.A0C = str;
        this.A0B = str2;
        this.A0A = str3;
        this.A09 = str4;
        this.A0F = z2;
        this.A0D = secretKey;
        this.A0G = bArr;
        this.A08 = r10;
        this.A01 = r3;
        this.A02 = r4;
        this.A07 = r9;
        this.A05 = r7;
        this.A06 = r8;
        this.A04 = r6;
    }

    public void BUw(boolean z, String str) {
    }
}
