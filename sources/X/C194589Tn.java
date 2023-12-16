package X;

import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* renamed from: X.9Tn  reason: invalid class name and case insensitive filesystem */
public class C194589Tn {
    public final C64393Dh A00;
    public final C69263Wi A01;
    public final AnonymousClass33p A02;
    public final C620733j A03;
    public final C55192px A04;
    public final AnonymousClass1VX A05;
    public final AnonymousClass9Q8 A06;
    public final C194169Rv A07;
    public final AnonymousClass9RV A08;
    public final AnonymousClass9S1 A09;
    public final C29341if A0A;
    public final C58522vO A0B;
    public final AnonymousClass9VS A0C;
    public final AnonymousClass4FS A0D;

    public void A01(ImageView imageView, TextView textView, AnonymousClass39R r6) {
        AnonymousClass0Y9.A07(textView, 4, 20, 2, 2);
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        layoutParams.width = textView.getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
        textView.setLayoutParams(layoutParams);
        textView.setTextColor(r6.A0C);
        textView.requestLayout();
        imageView.setBackgroundColor(r6.A0A);
        if (!TextUtils.isEmpty(r6.A01)) {
            imageView.setContentDescription(r6.A01);
        }
        int i = imageView.getLayoutParams().width;
        int i2 = imageView.getLayoutParams().height;
        if (A00(this.A00, r6)) {
            this.A08.A00(imageView, r6, i, i2);
        } else {
            C18270x1.A0l(this.A02.A0U(), "payment_background_batch_require_fetch", true);
        }
    }

    public void A02(AnonymousClass39R r5) {
        if (A00(this.A00, r5)) {
            return;
        }
        if (this.A05.A0X(1084)) {
            this.A0C.A03(r5, this.A0A);
            return;
        }
        C18270x1.A0w(new C203999oe((Object) null, 1, this), this.A0D);
    }

    public void A03(AnonymousClass39R r7) {
        if (!this.A05.A0X(1084) || A00(this.A00, r7)) {
            AnonymousClass33p r5 = this.A02;
            if (AnonymousClass0x2.A0A(AnonymousClass0x2.A0F(r5), "payment_backgrounds_batch_last_fetch_timestamp") == -1) {
                C18270x1.A0w(new C203999oe((Object) null, 1, this), this.A0D);
            } else if (!A00(this.A00, r7)) {
                C18270x1.A0l(r5.A0U(), "payment_background_batch_require_fetch", true);
            }
        } else {
            this.A0C.A03(r7, this.A0A);
        }
    }

    public final void A04(AnonymousClass39R r24, C202649mM r25) {
        C625435m r2;
        StringBuilder A0o;
        C64393Dh r22 = this.A00;
        AnonymousClass39R r7 = r24;
        boolean A002 = A00(r22, r7);
        String str = r7.A0G;
        File file = null;
        if (!"image/webp".equals(str)) {
            A0o = AnonymousClass001.A0o();
            A0o.append("PAY: PaymentBackgroundRepository/downloadPaymentBackground/unsupported mimetype=");
            A0o.append(str);
        } else {
            File A022 = r7.A02(r22.A0F());
            if (!A022.exists()) {
                if (TextUtils.isEmpty(r7.A05)) {
                    A0o = AnonymousClass001.A0o();
                    A0o.append("PAY: PaymentBackgroundRepository/downloadPaymentBackground/missing url for background id=");
                    A0o.append(r7.A0F);
                } else {
                    AnonymousClass9Q8 r1 = this.A06;
                    C56612sH r5 = r1.A03;
                    AnonymousClass1VX r8 = r1.A05;
                    C1906499g r23 = new C1906499g(r1.A00, r1.A02, r5, r1.A04, r7, r8, r1.A06, r1.A07, r1.A08, A022);
                    C620133d r13 = r23.A02;
                    AnonymousClass4EV A003 = r23.A00();
                    String str2 = r23.A00.A05;
                    C626936e.A06(str2);
                    if (r13.A0F(A003, r23, (C47662dc) null, (C30471mV) null, str2, false)) {
                        try {
                            r2 = (C625435m) r23.A03.get();
                        } catch (InterruptedException | ExecutionException e) {
                            Log.e("DuplicatePaymentBackgroundDownloadListener/waitForResult ", e);
                            r2 = new C625435m(1);
                        }
                    } else {
                        r23.AwR(r23);
                        r2 = r23.A02().A00;
                    }
                    if (!r2.A03()) {
                        A022 = null;
                    }
                }
            }
            file = A022;
            this.A01.A0S(new C201379jy(r7, r25, this, file, A002));
        }
        C18280x3.A13(A0o);
        this.A01.A0S(new C201379jy(r7, r25, this, file, A002));
    }

    public final void A05(C197059cS r4) {
        C55192px r2 = this.A04;
        Log.i("PAY: PaymentBackgroundStore/getPaymentBackgroundsForPicker");
        List<AnonymousClass39R> A022 = r2.A02("SELECT payment_background.background_id, file_size, width, height, mime_type, placeholder_color, text_color, subtext_color, media_key, media_key_timestamp, file_sha256, file_enc_sha256, direct_path, fullsize_url, description, lg FROM payment_background INNER JOIN payment_background_order ON payment_background_order.background_id=payment_background.background_id ORDER BY payment_background_order.background_order ASC", "payments/QUERY_PAYMENT_BACKGROUNDS_FOR_PICKER");
        StringBuilder A0o = AnonymousClass001.A0o();
        AnonymousClass000.A1H("PAY: PaymentBackgroundStore/getPaymentBackgroundsForPicker/result size=", A0o, A022);
        C18280x3.A14(A0o);
        this.A01.A0S(new C200909jD(this, r4, A022));
        for (AnonymousClass39R A042 : A022) {
            A04(A042, r4);
        }
    }

    public C194589Tn(C64393Dh r1, C69263Wi r2, AnonymousClass33p r3, C620733j r4, C55192px r5, AnonymousClass1VX r6, AnonymousClass9Q8 r7, C194169Rv r8, AnonymousClass9RV r9, AnonymousClass9S1 r10, C29341if r11, C58522vO r12, AnonymousClass9VS r13, AnonymousClass4FS r14) {
        this.A05 = r6;
        this.A01 = r2;
        this.A0D = r14;
        this.A00 = r1;
        this.A03 = r4;
        this.A02 = r3;
        this.A04 = r5;
        this.A0A = r11;
        this.A0C = r13;
        this.A08 = r9;
        this.A07 = r8;
        this.A06 = r7;
        this.A09 = r10;
        this.A0B = r12;
    }

    public static boolean A00(C64393Dh r0, AnonymousClass39R r1) {
        return r1.A02(r0.A0F()).exists();
    }
}
