package X;

import android.database.AbstractCursor;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.Jid;
import java.util.List;

/* renamed from: X.0xw  reason: invalid class name and case insensitive filesystem */
public class C18590xw extends AbstractCursor {
    public static final String[] A03 = {"jid", PublicKeyCredentialControllerUtility.JSON_KEY_NAME};
    public final C64773Ex A00;
    public final AnonymousClass5ZU A01;
    public final AnonymousClass314 A02;

    public int getCount() {
        return this.A02.A02();
    }

    public double getDouble(int i) {
        return 0.0d;
    }

    public float getFloat(int i) {
        return 0.0f;
    }

    public int getInt(int i) {
        return 0;
    }

    public long getLong(int i) {
        return 0;
    }

    public short getShort(int i) {
        return 0;
    }

    public String getString(int i) {
        String A0H;
        if (i == 0) {
            List A05 = this.A02.A05();
            int position = getPosition();
            if (A05.size() > position) {
                return ((Jid) A05.get(position)).getRawString();
            }
        } else if (i != 1) {
            return "";
        }
        List A052 = this.A02.A05();
        int position2 = getPosition();
        if (A052.size() <= position2 || (A0H = this.A01.A0H(this.A00.A0A((C95814uZ) A052.get(position2)))) == null) {
            return "";
        }
        return A0H;
    }

    public boolean isNull(int i) {
        return false;
    }

    public C18590xw(C64773Ex r1, AnonymousClass5ZU r2, AnonymousClass314 r3) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }

    public String[] getColumnNames() {
        return A03;
    }
}
