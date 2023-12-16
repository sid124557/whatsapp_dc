package X;

import android.content.ContentValues;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.net.Uri;
import android.text.TextUtils;
import android.util.JsonReader;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.Me;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: X.99O  reason: invalid class name */
public class AnonymousClass99O extends C56782sY {
    public final C56972sr A00;
    public final AnonymousClass33p A01;
    public final C620733j A02;
    public final C55192px A03;
    public final C85134Fb A04;
    public final AnonymousClass4FS A05;

    public /* bridge */ /* synthetic */ boolean A0C(Object obj) {
        return C18320x8.A1U(AnonymousClass0x2.A0F(this.A01).getString("payment_background_store_etag", (String) null));
    }

    public void A0E(C85034Er r11, String str) {
        String A06;
        String A0X;
        String str2;
        C56972sr r0 = this.A00;
        r0.A0P();
        Me me = r0.A00;
        if (me != null) {
            A06 = C106675Zy.A01(me.cc, me.number);
        } else {
            A06 = this.A02.A06();
        }
        AnonymousClass9OG r6 = new AnonymousClass9OG(str, A06);
        if (TextUtils.isEmpty("")) {
            A0X = null;
        } else {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("https://www.");
            A0o.append("");
            A0X = AnonymousClass000.A0X(".facebook.com/cdn/cacheable/whatsapp", A0o);
        }
        if (!TextUtils.isEmpty(A0X)) {
            str2 = AnonymousClass000.A0X("/payments/background", AnonymousClass000.A0l(A0X));
        } else {
            str2 = "https://static.whatsapp.net/payments/background";
        }
        Uri.Builder buildUpon = Uri.parse(str2).buildUpon();
        String str3 = r6.A01;
        if (!TextUtils.isEmpty(str3)) {
            buildUpon.appendQueryParameter(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str3);
        } else {
            buildUpon.appendQueryParameter("country", r6.A00);
        }
        super.A02(r11, (AnonymousClass486) null, r6, buildUpon.toString(), (String) null, (Map) null);
    }

    public /* bridge */ /* synthetic */ String A04(Object obj) {
        return C18280x3.A0Z(AnonymousClass0x2.A0F(this.A01), "payment_background_store_etag");
    }

    public /* bridge */ /* synthetic */ void A09(Object obj, String str) {
        SharedPreferences.Editor putString;
        SharedPreferences.Editor A0U = this.A01.A0U();
        if (str == null) {
            putString = A0U.remove("payment_background_store_etag");
        } else {
            putString = A0U.putString("payment_background_store_etag", str);
        }
        putString.apply();
    }

    public /* bridge */ /* synthetic */ boolean A0B(InputStream inputStream, Object obj, Map map) {
        String str;
        JsonReader jsonReader;
        C69833Yo Axl;
        JsonReader jsonReader2;
        AnonymousClass9OG r15 = (AnonymousClass9OG) obj;
        if (r15 == null || TextUtils.isEmpty(r15.A01)) {
            ArrayList A0s = AnonymousClass001.A0s();
            try {
                jsonReader = new JsonReader(new InputStreamReader(inputStream));
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    AnonymousClass39R A002 = A00(jsonReader);
                    if (A002 != null) {
                        A0s.add(A002);
                    }
                }
                jsonReader.endArray();
                jsonReader.close();
                C55192px r8 = this.A03;
                C18260x0.A1B("PAY: PaymentBackgroundStore/updatePaymentBackgroundsForPicker/size=", AnonymousClass001.A0o(), A0s);
                C85284Fq A042 = r8.A00.A04();
                try {
                    Axl = A042.Axl();
                    C56862sg r6 = ((AnonymousClass3H0) A042).A03;
                    C18260x0.A0y("PAY: PaymentBackgroundStore/updatePaymentBackgroundsForPicker/background order rows deleted: ", AnonymousClass001.A0o(), r6.A07("payment_background_order", (String) null, "payments/UPDATE_BACKGROUNDS_FOR_PICKER/DELETE_ALL_BACKGROUND_ORDERS", (String[]) null));
                    for (int i = 0; i < A0s.size(); i++) {
                        AnonymousClass39R r3 = (AnonymousClass39R) A0s.get(i);
                        ContentValues contentValues = new ContentValues(2);
                        contentValues.put("background_id", r3.A0F);
                        C18270x1.A0b(contentValues, "background_order", i);
                        if (r6.A0C("payment_background_order", "payments/UPDATE_BACKGROUNDS_FOR_PICKER/INSERT_ORDER", contentValues, 5) == -1) {
                            StringBuilder A0o = AnonymousClass001.A0o();
                            A0o.append("PAY: PaymentBackgroundStore/updatePaymentBackgroundsForPicker/insert background order failed for id: ");
                            C18260x0.A1K(A0o, r3.A0F);
                        }
                        r8.A03(A042, r3, "payments/UPDATE_BACKGROUNDS_FOR_PICKER/INSERT_PAYMENT_BACKGROUND");
                    }
                    Axl.A00();
                    Axl.close();
                    A042.close();
                    return true;
                } catch (Throwable th) {
                    try {
                        A042.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            } catch (IOException e) {
                e = e;
                str = "PAY: PaymentBackgroundMetadataNetworkClient/handle-network-response/failed";
                Log.e(str, e);
                return false;
            } catch (Throwable th3) {
                th.addSuppressed(th3);
            }
        } else {
            try {
                jsonReader2 = new JsonReader(new InputStreamReader(inputStream));
                AnonymousClass39R A003 = A00(jsonReader2);
                jsonReader2.close();
                if (A003 == null) {
                    return false;
                }
                this.A03.A04(A003);
                return true;
            } catch (IOException e2) {
                e = e2;
                str = "PAY: PaymentBackgroundMetadataNetworkClient/handle-network-response-for-background/failed";
            } catch (Throwable th4) {
                th.addSuppressed(th4);
            }
        }
        throw th;
        throw th;
        throw th;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass99O(X.C56972sr r8, X.C56492s4 r9, X.C54292oU r10, X.AnonymousClass33p r11, X.C620733j r12, X.C55192px r13, X.AnonymousClass33K r14, X.C85134Fb r15, X.C55132pq r16, X.AnonymousClass4FS r17) {
        /*
            r7 = this;
            java.lang.Integer r6 = X.C18320x8.A0W()
            r0 = r7
            r1 = r9
            r2 = r10
            r3 = r14
            r4 = r16
            r5 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.A05 = r5
            r7.A00 = r8
            r7.A02 = r12
            r7.A01 = r11
            r7.A03 = r13
            r7.A04 = r15
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass99O.<init>(X.2sr, X.2s4, X.2oU, X.33p, X.33j, X.2px, X.33K, X.4Fb, X.2pq, X.4FS):void");
    }

    public static AnonymousClass39R A00(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        long j = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            switch (nextName.hashCode()) {
                case -1724546052:
                    if (!nextName.equals("description")) {
                        break;
                    } else {
                        str4 = jsonReader.nextString();
                        break;
                    }
                case -1391167122:
                    if (!nextName.equals("mimetype")) {
                        break;
                    } else {
                        str2 = jsonReader.nextString();
                        break;
                    }
                case -1362486862:
                    if (!nextName.equals("file-size")) {
                        break;
                    } else {
                        j = jsonReader.nextLong();
                        break;
                    }
                case -1221029593:
                    if (!nextName.equals("height")) {
                        break;
                    } else {
                        i2 = jsonReader.nextInt();
                        break;
                    }
                case -718200573:
                    if (!nextName.equals("subtext-color")) {
                        break;
                    } else {
                        i5 = Color.parseColor(jsonReader.nextString());
                        break;
                    }
                case -342731470:
                    if (!nextName.equals("fullsize-url")) {
                        break;
                    } else {
                        str3 = jsonReader.nextString();
                        break;
                    }
                case 3355:
                    if (!nextName.equals(PublicKeyCredentialControllerUtility.JSON_KEY_ID)) {
                        break;
                    } else {
                        str = jsonReader.nextString();
                        break;
                    }
                case 113126854:
                    if (!nextName.equals("width")) {
                        break;
                    } else {
                        i = jsonReader.nextInt();
                        break;
                    }
                case 748171971:
                    if (!nextName.equals("text-color")) {
                        break;
                    } else {
                        i4 = Color.parseColor(jsonReader.nextString());
                        break;
                    }
                case 2018420361:
                    if (!nextName.equals("placeholder-color")) {
                        break;
                    } else {
                        i3 = Color.parseColor(jsonReader.nextString());
                        break;
                    }
            }
        }
        jsonReader.endObject();
        if (str == null || j == 0 || ((long) i) == 0 || ((long) i2) == 0 || str2 == null || str3 == null || i3 == 0 || i4 == 0 || i5 == 0) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("PAY: PaymentBackgroundMetadataNetworkClient/parseMetadata/missing field/id=");
            A0o.append(str);
            A0o.append(", fileSize=");
            A0o.append(j);
            A0o.append(", width=");
            A0o.append(i);
            A0o.append(", height=");
            A0o.append(i2);
            A0o.append(", mimetype=");
            A0o.append(str2);
            A0o.append(", fullsizeUrl=");
            A0o.append(str3);
            A0o.append(", placeholderColor=");
            A0o.append(i3);
            A0o.append(", textColor=");
            A0o.append(i4);
            C18260x0.A0x(", subtextColor=", A0o, i5);
            return null;
        }
        return new AnonymousClass39R(str, str2, str3, str4, (String) null, i, i2, i3, i4, i5, j);
    }

    public boolean A0D(String str, Map map, byte[] bArr) {
        return true;
    }
}
