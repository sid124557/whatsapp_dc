package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.34e  reason: invalid class name and case insensitive filesystem */
public class C622234e {
    public int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final long A04;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C622234e)) {
            return false;
        }
        C622234e r7 = (C622234e) obj;
        return this.A01 == r7.A01 && this.A00 == r7.A00 && this.A04 == r7.A04 && this.A03 == r7.A03 && this.A02 == r7.A02;
    }

    public int hashCode() {
        Object[] objArr = new Object[5];
        AnonymousClass000.A1L(objArr, this.A01);
        AnonymousClass000.A1M(objArr, this.A00);
        AnonymousClass0x2.A1U(objArr, this.A04);
        AnonymousClass000.A1O(objArr, this.A03);
        C18280x3.A1P(objArr, this.A02);
        return Arrays.hashCode(objArr);
    }

    public C622234e(int i, int i2, int i3, long j, int i4) {
        this.A01 = i;
        this.A00 = i2;
        this.A04 = j;
        this.A03 = i3;
        if (i4 < 0 || i4 > 2) {
            this.A02 = -1;
        } else {
            this.A02 = i4;
        }
    }

    public static C622234e A00(JSONObject jSONObject) {
        int i;
        try {
            i = jSONObject.getInt(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
        } catch (JSONException unused) {
            i = 0;
        }
        try {
            return new C622234e(jSONObject.getInt(PublicKeyCredentialControllerUtility.JSON_KEY_ID), jSONObject.getInt("stage"), jSONObject.getInt("version"), jSONObject.getLong("t"), i);
        } catch (JSONException e) {
            Log.e("UserNoticeMetadata/fromJSON exception: ", e);
            return null;
        }
    }

    public static JSONObject A01(C622234e r4) {
        JSONObject A1G = AnonymousClass0x9.A1G();
        try {
            A1G.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, r4.A01);
            A1G.put("stage", r4.A00);
            A1G.put("t", r4.A04);
            A1G.put("version", r4.A03);
            A1G.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, r4.A02);
            return A1G;
        } catch (JSONException e) {
            Log.e("UserNoticeMetadata/toJSON exception: ", e);
            return null;
        }
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("UserNoticeMetadata{noticeId=");
        A0o.append(this.A01);
        A0o.append(", stage=");
        A0o.append(this.A00);
        A0o.append(", timestamp=");
        A0o.append(this.A04);
        A0o.append(", version=");
        A0o.append(this.A03);
        A0o.append(", type=");
        A0o.append(this.A02);
        return AnonymousClass000.A0d(A0o);
    }

    public C622234e(int i) {
        this(i, 0, 1, 0, 2);
    }
}
