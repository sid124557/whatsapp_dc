package X;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import androidx.fragment.app.DialogFragment;
import com.facebook.msys.mci.DefaultCrypto;
import com.whatsapp.R;
import com.whatsapp.payments.ui.IndiaUpiQrCodeScannedDialogFragment;
import com.whatsapp.payments.ui.IndiaUpiSendPaymentActivity;
import com.whatsapp.payments.ui.IndiaUpiSendPaymentActivityBottomSheet;
import com.whatsapp.payments.ui.international.IndiaUpiInternationalValidateQrActivity;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/* renamed from: X.9bk  reason: invalid class name and case insensitive filesystem */
public class C196789bk implements AnonymousClass4FF {
    public final C66663Mh A00;
    public final AnonymousClass1VX A01;
    public final C196629bS A02;
    public final C197109ca A03;
    public final C160757oG A04 = C160757oG.A00("IndiaUpiPaymentQrManager", "payment", "IN");
    public final AnonymousClass9WN A05;

    public DialogFragment BBn(C95814uZ r2, String str, String str2, int i) {
        String str3;
        if (i != 3) {
            str3 = "SCANNED_QR_CODE";
        } else {
            str3 = "GALLERY_QR_CODE";
        }
        return IndiaUpiQrCodeScannedDialogFragment.A00(r2, str, str3, str2);
    }

    public void A00(Activity activity, C95814uZ r19, C202949ms r20, String str, String str2, String str3) {
        Class cls;
        int i;
        String str4;
        AnonymousClass1VX r4 = this.A01;
        C196629bS r2 = this.A02;
        Activity activity2 = activity;
        String str5 = str;
        String str6 = str2;
        String str7 = str3;
        if (!C161957qt.A02(r4, r2.A07()) || !C161957qt.A03(r4, str5)) {
            C195179Wl A012 = C195179Wl.A01(str5, str6);
            String A002 = C196629bS.A00(r2);
            C202949ms r3 = r20;
            if (A012 != null && (str4 = A012.A0O) != null && str4.equalsIgnoreCase(A002)) {
                i = R.string.f11nameremoved;
            } else if (r20 != null && str != null && str5.startsWith("upi://mandate") && r4.A0X(2211)) {
                this.A05.A07(activity2, A012, new C192749Lk(r3, 0), str7, true);
                return;
            } else if (AnonymousClass9WY.A04(A012)) {
                i = R.string.f11nameremoved;
            } else {
                if (C154437dA.A00(r4)) {
                    cls = IndiaUpiSendPaymentActivityBottomSheet.class;
                } else {
                    cls = IndiaUpiSendPaymentActivity.class;
                }
                Intent A08 = AnonymousClass0x9.A08(activity2, cls);
                AnonymousClass9WY.A02(A08, this.A00, r19, A012, str7, true);
                activity2.startActivity(A08);
                if (r20 != null) {
                    r3.Bam();
                    return;
                }
                return;
            }
            String string = activity2.getString(i);
            this.A03.BKB(C18290x4.A0Z(), (Integer) null, "qr_code_scan_error", str7);
            C19340zH A003 = AnonymousClass5V0.A00(activity2);
            C204219p0.A01(A003, r3, 0, R.string.f11nameremoved);
            A003.A0g(string);
            A003.A0V(new C204279p6(r3, 0));
            C18280x3.A0q(A003);
            return;
        }
        Intent A082 = AnonymousClass0x9.A08(activity2, IndiaUpiInternationalValidateQrActivity.class);
        try {
            A082.putExtra("INTERNATIONAL_QR_PAYLOAD", URLEncoder.encode(str5, DefaultCrypto.UTF_8));
        } catch (UnsupportedEncodingException e) {
            this.A04.A0A("Url encode of qr payload failure: ", e);
        }
        A082.putExtra("INTERNATIONAL_QR_SOURCE", str6);
        A082.putExtra("referral_screen", str7);
        activity2.startActivity(A082);
    }

    public void BpE(Activity activity, C95814uZ r9, String str, String str2) {
        A00(activity, r9, new C196599bE(), str, "SCANNED_QR_CODE", str2);
    }

    public C196789bk(C66663Mh r4, AnonymousClass1VX r5, C196629bS r6, C197109ca r7, AnonymousClass9WN r8) {
        this.A02 = r6;
        this.A00 = r4;
        this.A03 = r7;
        this.A01 = r5;
        this.A05 = r8;
    }

    public String BAr(String str) {
        C195179Wl A002 = C195179Wl.A00(Uri.parse(str), "SCANNED_QR_CODE");
        if (A002 != null) {
            return A002.A0O;
        }
        return null;
    }

    public boolean BJG(String str) {
        C195179Wl A002 = C195179Wl.A00(Uri.parse(str), "SCANNED_QR_CODE");
        if (!AnonymousClass000.A1S(str.startsWith("upi://mandate") ? 1 : 0) ? A002 != null : !(!this.A01.A0X(2211) || A002 == null || A002.A0L != null)) {
            if (!TextUtils.isEmpty(A002.A0O)) {
                return true;
            }
        }
        return false;
    }

    public boolean BJH(String str, int i, int i2) {
        return false;
    }

    public void BF6(C003203q r1, String str, int i, int i2) {
    }
}
