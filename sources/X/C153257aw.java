package X;

import java.io.File;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.7aw  reason: invalid class name and case insensitive filesystem */
public class C153257aw {
    public final long A00;
    public final C153247av A01;
    public final File A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C153257aw r7 = (C153257aw) obj;
            if (this.A00 != r7.A00) {
                return false;
            }
            File file = this.A02;
            File file2 = r7.A02;
            return (file == file2 || file.equals(file2)) && this.A01.equals(r7.A01);
        }
    }

    public int hashCode() {
        Object[] objArr = new Object[6];
        objArr[0] = this.A02;
        objArr[1] = null;
        objArr[2] = this.A01;
        AnonymousClass0x2.A1V(objArr, this.A00);
        objArr[4] = -1L;
        C18310x6.A1U(objArr, -1);
        return Arrays.hashCode(objArr);
    }

    public boolean A01() {
        File file = this.A02;
        if (this.A00 >= 0 || AnonymousClass726.A00(file.getPath(), "video/mp4").contains("image")) {
            return true;
        }
        return false;
    }

    public C153257aw(AnonymousClass7JS r3) {
        this.A02 = r3.A02;
        this.A01 = r3.A01;
        this.A00 = r3.A00;
    }

    public JSONObject A00() {
        JSONObject A1G = AnonymousClass0x9.A1G();
        A1G.put("mSourceFile", this.A02.getPath());
        A1G.put("mSourceTimeRange", this.A01.A00());
        A1G.put("mPhotoDurationUs", this.A00);
        A1G.put("mMediaOriginalDurationMs", -1);
        A1G.put("mOutputFps", -1);
        return A1G;
    }

    public String toString() {
        try {
            return A00().toString();
        } catch (JSONException unused) {
            return "";
        }
    }
}
