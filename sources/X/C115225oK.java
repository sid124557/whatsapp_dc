package X;

import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;

/* renamed from: X.5oK  reason: invalid class name and case insensitive filesystem */
public final class C115225oK implements AnonymousClass4DP {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass5ZD A01;
    public final /* synthetic */ C55862r2 A02;
    public final /* synthetic */ C55782qu A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ WeakReference A05;
    public final /* synthetic */ boolean A06;

    public void onFailure(Exception exc) {
        C162457s7.A0J(exc, 0);
        Log.e("Failed to create an avatar user:", exc);
        C55782qu r2 = this.A03;
        int i = this.A00;
        r2.A01(i, "user_creation_failed");
        r2.A02(C372621o.FAIL, i);
        AnonymousClass5ZD r5 = this.A01;
        r5.A05.set(false);
        this.A02.A04(AnonymousClass001.A0f(), exc.getMessage(), 7, this.A06);
        C89654ea A002 = AnonymousClass5ZD.A00(this.A05);
        if (A002 == null) {
            Log.e("Unable to obtain Activity reference.");
            return;
        }
        A002.BjL();
        r5.A02(A002, new AnonymousClass0F6(exc));
    }

    public C115225oK(AnonymousClass5ZD r1, C55862r2 r2, C55782qu r3, String str, WeakReference weakReference, int i, boolean z) {
        this.A03 = r3;
        this.A00 = i;
        this.A01 = r1;
        this.A05 = weakReference;
        this.A02 = r2;
        this.A04 = str;
        this.A06 = z;
    }

    public void onSuccess() {
        C55782qu r2 = this.A03;
        int i = this.A00;
        r2.A01(i, "user_created");
        this.A01.A03(this.A02, r2, this.A04, this.A05, i, this.A06);
    }
}
