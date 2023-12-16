package X;

import android.app.Activity;
import com.whatsapp.jid.UserJid;
import javax.crypto.SecretKey;

/* renamed from: X.3MF  reason: invalid class name */
public final class AnonymousClass3MF implements AnonymousClass4EG {
    public final Activity A00;
    public final C59062wH A01;
    public final C69263Wi A02;
    public final AnonymousClass2XW A03;
    public final C41182Jg A04;
    public final C60032xt A05;
    public final C56612sH A06;
    public final C66543Lv A07;
    public final C59652xG A08;
    public final AnonymousClass1VX A09;
    public final AnonymousClass4FS A0A;
    public final C49702gx A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final SecretKey A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final byte[] A0J;

    public final void A00(Activity activity, C41182Jg r14, C27091dG r15, String str, String str2, String str3, boolean z, boolean z2) {
        String str4 = str3;
        this.A02.BkS(new C71083bX(activity, this, r14, r15, str4, str2, str, 1, z, z2));
    }

    public void BQb(String str) {
        C162457s7.A0J(str, 0);
        A00(this.A00, this.A04, (C27091dG) null, str, (String) null, (String) null, true, false);
    }

    public void BQc(UserJid userJid, String str, int i, boolean z, boolean z2) {
        C162457s7.A0J(str, 1);
        C71403c3.A00(this.A0A, this, userJid, str, 18);
    }

    public AnonymousClass3MF(Activity activity, C59062wH r3, C69263Wi r4, AnonymousClass2XW r5, C41182Jg r6, C60032xt r7, C56612sH r8, C66543Lv r9, C59652xG r10, AnonymousClass1VX r11, AnonymousClass4FS r12, C49702gx r13, String str, String str2, String str3, String str4, SecretKey secretKey, byte[] bArr, boolean z, boolean z2) {
        this.A00 = activity;
        this.A04 = r6;
        this.A0H = z;
        this.A03 = r5;
        this.A0F = str;
        this.A0E = str2;
        this.A0D = str3;
        this.A0C = str4;
        this.A0I = z2;
        this.A0G = secretKey;
        this.A0J = bArr;
        this.A0B = r13;
        this.A01 = r3;
        this.A02 = r4;
        this.A0A = r12;
        this.A07 = r9;
        this.A09 = r11;
        this.A08 = r10;
        this.A06 = r8;
        this.A05 = r7;
    }

    public void BUw(boolean z, String str) {
    }
}
