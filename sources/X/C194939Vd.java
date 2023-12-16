package X;

import android.content.DialogInterface;
import android.os.Build;
import android.text.TextUtils;
import com.whatsapp.R;
import com.whatsapp.authentication.FingerprintBottomSheet;
import com.whatsapp.payments.pin.ui.PinBottomSheetDialogFragment;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9Vd  reason: invalid class name and case insensitive filesystem */
public abstract class C194939Vd {
    public C165897xo A00;
    public String A01 = "payment_home";
    public List A02;
    public boolean A03;
    public final C69263Wi A04;
    public final C56972sr A05;
    public final C89644eZ A06;
    public final C56612sH A07;
    public final AnonymousClass30K A08;
    public final C1906899l A09;
    public final C194479Ta A0A;
    public final C40602Ha A0B;
    public final C620933l A0C;
    public final AnonymousClass9U5 A0D;
    public final AnonymousClass9WM A0E;
    public final C194089Rn A0F;
    public final AnonymousClass9VU A0G;
    public final C203499no A0H;
    public final AnonymousClass9W3 A0I;
    public final AnonymousClass9TR A0J;
    public final C203199nH A0K;

    public static /* synthetic */ void A00(C193849Qh r7, PinBottomSheetDialogFragment pinBottomSheetDialogFragment, C194939Vd r9, String str) {
        AnonymousClass9V6 r5 = new AnonymousClass9V6(r9.A05, r9.A07, r9.A0D);
        r9.A0F.A00(new AnonymousClass9UP(r7, r9, pinBottomSheetDialogFragment, r5, 2), r7, str);
    }

    public void A07(String str, String str2) {
        AnonymousClass3ZO r1;
        AnonymousClass3ZO A012;
        A03();
        if (!TextUtils.isEmpty(str) && str.equals("STEP_UP")) {
            C18270x1.A0l(C620933l.A00(this.A0C), "payment_step_up_update_ack", true);
            this.A01 = "push_notification";
            if (!(str2 == null || (A012 = this.A08.A01(str2)) == null)) {
                A012.A00 = false;
                if (this.A03) {
                    C203499no r0 = this.A0H;
                    String str3 = this.A01;
                    r0.BJy(A012, 1, (Integer) null, str3, str3);
                }
            }
            this.A0A.A01(str2);
        }
        if (this.A03) {
            List A022 = this.A08.A02();
            if (!A022.isEmpty()) {
                if (A022.size() == 1) {
                    r1 = (AnonymousClass3ZO) C18290x4.A0k(A022);
                } else {
                    r1 = null;
                }
                this.A0H.BJy(r1, C18290x4.A0Z(), (Integer) null, "payment_home", this.A01);
            }
        }
        this.A02 = AnonymousClass001.A0s();
    }

    public void A01() {
        this.A0K.Bld(false);
        this.A0C.A0A();
        if (!this.A02.isEmpty()) {
            this.A08.A05(this.A02);
            Iterator it = this.A02.iterator();
            while (it.hasNext()) {
                this.A0A.A01(AnonymousClass001.A0m(it));
            }
        }
    }

    public void A02() {
        C89644eZ r2 = this.A06;
        AnonymousClass9WM.A00(r2, (DialogInterface.OnDismissListener) null, r2.getString(R.string.f11nameremoved)).show();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0015, code lost:
        if (r3.A08.A02().size() > 0) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03() {
        /*
            r3 = this;
            X.9nH r2 = r3.A0K
            X.33l r0 = r3.A0C
            X.7xo r0 = r0.A04()
            if (r0 != 0) goto L_0x0017
            X.30K r0 = r3.A08
            java.util.List r0 = r0.A02()
            int r1 = r0.size()
            r0 = 0
            if (r1 <= 0) goto L_0x0018
        L_0x0017:
            r0 = 1
        L_0x0018:
            r2.Bld(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C194939Vd.A03():void");
    }

    public void A05(AnonymousClass3ZO r7) {
        C165817xg r2;
        AnonymousClass3ZO r1 = r7;
        if (this.A03) {
            this.A0H.BJy(r1, AnonymousClass001.A0f(), C18290x4.A0Z(), "payment_home", this.A01);
        }
        C165897xo r0 = r7.A03;
        this.A00 = r0;
        if (r0 != null && (r2 = r0.A00) != null && r2.A00.equals("WEBVIEW")) {
            if (((C137086nl) r2).A00) {
                if (Build.VERSION.SDK_INT >= 23) {
                    AnonymousClass9W3 r12 = this.A0I;
                    if (r12.A05() && r12.A01() == 1) {
                        A04();
                        return;
                    }
                }
                PinBottomSheetDialogFragment A002 = AnonymousClass9SH.A00();
                A002.A0B = new C205099qQ(A002, 1, this);
                this.A06.Bon(A002, (String) null);
                return;
            }
            A06((PinBottomSheetDialogFragment) null, (AnonymousClass36K) null);
        }
    }

    public void A06(PinBottomSheetDialogFragment pinBottomSheetDialogFragment, AnonymousClass36K r7) {
        new C194009Rf(this.A06, this.A04, this.A0B, this.A0D).A00(new C197019cO(pinBottomSheetDialogFragment, this), this.A00, r7, (String) null);
    }

    public C194939Vd(C69263Wi r2, C56972sr r3, C89644eZ r4, C56612sH r5, AnonymousClass30K r6, C1906899l r7, C194479Ta r8, C40602Ha r9, C620933l r10, AnonymousClass9U5 r11, AnonymousClass9WM r12, C194089Rn r13, AnonymousClass9VU r14, C203499no r15, AnonymousClass9W3 r16, AnonymousClass9TR r17, C203199nH r18) {
        this.A07 = r5;
        this.A04 = r2;
        this.A05 = r3;
        this.A08 = r6;
        this.A0F = r13;
        this.A0C = r10;
        this.A09 = r7;
        this.A0J = r17;
        this.A0D = r11;
        this.A0H = r15;
        this.A0E = r12;
        this.A0B = r9;
        this.A0I = r16;
        this.A0G = r14;
        this.A0A = r8;
        this.A06 = r4;
        this.A0K = r18;
    }

    public final void A04() {
        FingerprintBottomSheet A072 = C1899693i.A07();
        C56612sH r3 = this.A07;
        C194109Rp r4 = new C194109Rp(this.A05, r3, this.A0D, this.A0I, "AUTH");
        AnonymousClass9TR r6 = this.A0J;
        C89644eZ r1 = this.A06;
        A072.A05 = new AnonymousClass988(r1, A072, r3, r4, new C197189ci(A072, this), r6);
        r1.Bon(A072, (String) null);
    }
}
