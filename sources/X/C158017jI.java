package X;

import android.content.SharedPreferences;
import com.whatsapp.util.Log;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.7jI  reason: invalid class name and case insensitive filesystem */
public class C158017jI {
    public SharedPreferences A00;
    public final C60152y5 A01;

    public C160167n9 A00(int i, int i2, int i3, long j, boolean z) {
        C160167n9 A002;
        int i4 = i;
        int i5 = i;
        if (!(i == 2 || i == 3 || i == 5)) {
            i5 = 1;
        }
        Locale locale = Locale.US;
        Object[] objArr = new Object[5];
        long j2 = j;
        AnonymousClass000.A1Q(objArr, 0, j);
        int i6 = i2;
        AnonymousClass6C7.A1U(objArr, i5, i2);
        int i7 = i3;
        AnonymousClass000.A1P(objArr, i3, 3);
        boolean z2 = z;
        AnonymousClass6C7.A1V(objArr, 4, z2);
        String format = String.format(locale, "%d_%d_%d_%d_%b", objArr);
        SharedPreferences sharedPreferences = this.A00;
        if (sharedPreferences == null) {
            sharedPreferences = this.A01.A03("media_daily_usage_preferences_v1");
            this.A00 = sharedPreferences;
        }
        String A0Z = C18280x3.A0Z(sharedPreferences, format);
        if (A0Z != null && !A0Z.isEmpty() && (A002 = C160167n9.A00(A0Z)) != null) {
            return A002;
        }
        if (!(i == 2 || i == 3 || i == 5)) {
            i4 = 1;
        }
        return new C160167n9(i4, i6, i7, j2, z2);
    }

    public void A01(C160167n9 r6, int i, int i2, int i3, long j, boolean z) {
        if (!(i == 2 || i == 3 || i == 5)) {
            i = 1;
        }
        Locale locale = Locale.US;
        Object[] objArr = new Object[5];
        AnonymousClass000.A1Q(objArr, 0, j);
        AnonymousClass6C7.A1U(objArr, i, i2);
        AnonymousClass000.A1P(objArr, i3, 3);
        AnonymousClass6C7.A1V(objArr, 4, z);
        String format = String.format(locale, "%d_%d_%d_%d_%b", objArr);
        try {
            JSONObject A1G = AnonymousClass0x9.A1G();
            A1G.put("bytesSent", r6.A01);
            A1G.put("bytesReceived", r6.A00);
            A1G.put("countMessageSent", r6.A05);
            A1G.put("countMessageReceived", r6.A04);
            A1G.put("countUploaded", r6.A07);
            A1G.put("countDownloaded", r6.A02);
            A1G.put("countForward", r6.A03);
            A1G.put("countShared", r6.A06);
            A1G.put("countViewed", r6.A08);
            A1G.put("transferDate", r6.A0C);
            A1G.put("mediaType", r6.A0A);
            A1G.put("transferRadio", r6.A0B);
            A1G.put("mediaTransferOrigin", r6.A09);
            A1G.put("isAutoDownload", r6.A0D);
            String obj = A1G.toString();
            SharedPreferences sharedPreferences = this.A00;
            if (sharedPreferences == null) {
                sharedPreferences = this.A01.A03("media_daily_usage_preferences_v1");
                this.A00 = sharedPreferences;
            }
            C18270x1.A0j(sharedPreferences.edit(), format, obj);
        } catch (JSONException e) {
            Log.d(AnonymousClass000.A0a("MediaDailyUsageSharedPreferences/setWamMediaDailyUsage/", AnonymousClass001.A0o(), e));
        }
    }

    public C158017jI(C60152y5 r1) {
        this.A01 = r1;
    }
}
