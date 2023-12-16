package X;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.math.BigDecimal;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1S3  reason: invalid class name */
public class AnonymousClass1S3 extends AnonymousClass3H6 {
    public static C85204Fi A04;
    public static C85204Fi A05;
    public static C85204Fi A06;
    public static final BigDecimal A07;
    public static final Parcelable.Creator CREATOR = AnonymousClass4IW.A00(1);
    public AnonymousClass39Q A00;
    public final AnonymousClass39Q A01;
    public final String A02;
    public final String A03;

    static {
        BigDecimal bigDecimal = new BigDecimal(1);
        A07 = bigDecimal;
        BigDecimal bigDecimal2 = BigDecimal.ZERO;
        A06 = new AnonymousClass1S3("XXX", "XXX", "#", "#", bigDecimal2, bigDecimal2, -1, 10, 1, 0);
        BigDecimal bigDecimal3 = bigDecimal;
        A05 = new AnonymousClass1S3("INR", "₹", "R", "r", BigDecimal.valueOf(5000), bigDecimal3, 0, 100, 2, 0);
        A04 = new AnonymousClass1S3("BRL", "R$", "B", "b", BigDecimal.valueOf(1000), bigDecimal3, 0, 100, 2, 0);
    }

    public CharSequence B6J(Context context, int i) {
        String str;
        if (i == 1) {
            str = this.A03;
        } else {
            str = this.A02;
        }
        SpannableStringBuilder A002 = C18330xA.A00(str);
        Typeface A022 = C06400Xn.A02(context, R.font.payment_icons_regular);
        if (A022 != null) {
            A002.setSpan(new AnonymousClass6EH(A022), 0, this.A02.length(), 0);
        }
        return A002;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass1S3)) {
            return false;
        }
        AnonymousClass1S3 r4 = (AnonymousClass1S3) obj;
        return super.equals(r4) && this.A02.equals(r4.A02) && this.A03.equals(r4.A03) && this.A01.equals(r4.A01) && this.A00.equals(r4.A00);
    }

    public String B3U(C620733j r7, AnonymousClass39Q r8) {
        String str = this.A04;
        BigDecimal bigDecimal = r8.A00;
        return AnonymousClass359.A01(r7, str, this.A05, bigDecimal, bigDecimal.scale(), false);
    }

    public BigDecimal B3c(C620733j r8, String str) {
        C160617ny A0M = AnonymousClass0x7.A0M(C160617ny.A02, this.A04);
        try {
            String str2 = A0M.A00;
            int A002 = C160617ny.A00(str2);
            AnonymousClass7T2 A003 = C159827mW.A00(r8, false);
            C158737kT r3 = new C158737kT(A003.A00(), C620733j.A02(r8));
            if (A003.A02) {
                new C157407iF(r8.A0A(9));
                new C157407iF(r8.A0A(11));
                r8.A0A(10);
                new C157407iF(r8.A0A(6));
                new C157407iF(r8.A0A(8));
                r8.A0A(7);
            }
            String A022 = A0M.A02(r8);
            r3.A03(A002);
            return new BigDecimal(r3.A00(str.replace(A022, "").replace(str2, "").replace(C58152un.A09, "").trim()).toString());
        } catch (Exception e) {
            Log.w("Currency parse threw: ", e);
            try {
                return new BigDecimal(str);
            } catch (Exception e2) {
                Log.w("Currency parse fallback threw: ", e2);
                return null;
            }
        }
    }

    public AnonymousClass1S3(JSONObject jSONObject) {
        super(jSONObject);
        this.A02 = jSONObject.optString("currencyIconText");
        this.A03 = jSONObject.optString("requestCurrencyIconText");
        JSONObject optJSONObject = jSONObject.optJSONObject("maxValue");
        int i = this.A01;
        this.A00 = AnonymousClass39Q.A00(optJSONObject.optString("amount", ""), i);
        this.A01 = AnonymousClass39Q.A00(jSONObject.optJSONObject("minValue").optString("amount", ""), i);
    }

    public JSONObject Bqs() {
        JSONObject Bqs = super.Bqs();
        try {
            Bqs.put("currencyIconText", this.A02);
            Bqs.put("requestCurrencyIconText", this.A03);
            Bqs.put("maxValue", this.A00.A01());
            Bqs.put("minValue", this.A01.A01());
            return Bqs;
        } catch (JSONException e) {
            Log.e("PAY: PaymentCurrency toJsonObject threw: ", e);
            return Bqs;
        }
    }

    public int describeContents() {
        return 0;
    }

    public int hashCode() {
        return super.hashCode() + C18310x6.A09(this.A02) + C18310x6.A09(this.A03) + C18300x5.A04(this.A01) + C18300x5.A04(this.A00);
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeParcelable(this.A00, i);
        parcel.writeParcelable(this.A01, i);
    }

    public AnonymousClass1S3(Parcel parcel) {
        super(parcel);
        this.A02 = parcel.readString();
        this.A03 = parcel.readString();
        Class<AnonymousClass39Q> cls = AnonymousClass39Q.class;
        this.A00 = (AnonymousClass39Q) C18280x3.A0C(parcel, cls);
        this.A01 = (AnonymousClass39Q) C18280x3.A0C(parcel, cls);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass1S3(java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, java.math.BigDecimal r16, java.math.BigDecimal r17, int r18, int r19, int r20, int r21) {
        /*
            r11 = this;
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r18
            r8 = r19
            r9 = r20
            r10 = r21
            r4.<init>(r5, r6, r7, r8, r9, r10)
            double r0 = (double) r8
            double r2 = java.lang.Math.log10(r0)
            int r1 = (int) r2
            X.39Q r0 = new X.39Q
            r2 = r16
            r0.<init>(r2, r1)
            r11.A00 = r0
            X.39Q r0 = new X.39Q
            r2 = r17
            r0.<init>(r2, r1)
            r11.A01 = r0
            r11.A02 = r14
            r11.A03 = r15
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1S3.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.math.BigDecimal, java.math.BigDecimal, int, int, int, int):void");
    }
}
