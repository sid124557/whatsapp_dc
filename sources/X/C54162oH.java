package X;

import com.whatsapp.util.Log;
import java.util.concurrent.CopyOnWriteArrayList;
import org.whispersystems.curve25519.NativeVOPRFExtension;

/* renamed from: X.2oH  reason: invalid class name and case insensitive filesystem */
public class C54162oH {
    public CopyOnWriteArrayList A00;
    public NativeVOPRFExtension A01;
    public final int A02;
    public final C29411im A03;
    public final AnonymousClass5IH A04;
    public final C55242q2 A05;
    public final AnonymousClass3TF A06;
    public final C56612sH A07;
    public final AnonymousClass1VX A08;
    public final C72173dI A09;
    public final String A0A;
    public volatile int A0B;
    public volatile long A0C;
    public volatile long A0D;
    public volatile String A0E;
    public volatile boolean A0F;
    public volatile boolean A0G = false;
    public volatile byte[] A0H;
    public volatile byte[] A0I;

    public final synchronized void A00() {
        Log.d("ACSToken/resetTokens");
        this.A0E = null;
        this.A0H = null;
        this.A0B = 0;
        this.A0G = false;
        this.A0F = false;
        C55242q2 r3 = this.A05;
        r3.A04("original_token_string", (String) null);
        r3.A04("next_original_token_string", (String) null);
        r3.A03("base_timestamp", 0);
        r3.A03("time_to_live_in_seconds", 0);
        r3.A04("blinding_factor_string", (String) null);
        r3.A02("redeem_count", -1);
        r3.A04("shared_secret_string", (String) null);
    }

    public final synchronized void A02(boolean z) {
        Log.d("ACSToken/abortGeneratingTokens");
        this.A0F = false;
        C55242q2 r2 = this.A05;
        r2.A04("blinding_factor_string", (String) null);
        if (this.A0G) {
            r2.A04("next_original_token_string", (String) null);
        } else {
            r2.A04("original_token_string", (String) null);
        }
        this.A0G = false;
        this.A0H = null;
        if (!z) {
            this.A0E = null;
            this.A0B = 0;
        }
    }

    public final void A01(int i) {
        int i2 = this.A0B;
        C55242q2 r3 = this.A05;
        if (i2 < r3.A00().getInt("max_sign_retry_count", 0)) {
            this.A0B++;
            this.A09.A04(new C70043Zq(this, 36), AnonymousClass0x2.A0B(r3.A00(), "sign_retry_interval_sec") * ((long) this.A0B) * ((long) this.A0B) * 1000);
            return;
        }
        int i3 = 10;
        if (i == 5) {
            i3 = 9;
        }
        r3.A01(i3);
        A02(false);
    }

    public C54162oH(C29411im r2, AnonymousClass5IH r3, C55242q2 r4, AnonymousClass3TF r5, C56612sH r6, AnonymousClass1VX r7, AnonymousClass4FS r8, String str) {
        this.A07 = r6;
        this.A08 = r7;
        this.A05 = r4;
        this.A0A = str;
        this.A06 = r5;
        r5.A00 = this;
        this.A04 = r3;
        this.A03 = r2;
        this.A00 = new CopyOnWriteArrayList();
        this.A09 = C72173dI.A00(r8);
        this.A02 = C18280x3.A00(str.equals("WA_BizDirectorySearch") ? 1 : 0);
    }
}
