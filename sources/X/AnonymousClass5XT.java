package X;

import android.graphics.Bitmap;
import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.5XT  reason: invalid class name */
public final class AnonymousClass5XT {
    public final Bitmap A00;
    public final UserJid A01;
    public final List A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5XT) {
                AnonymousClass5XT r5 = (AnonymousClass5XT) obj;
                if (!C162457s7.A0P(this.A02, r5.A02) || !C162457s7.A0P(this.A00, r5.A00) || !C162457s7.A0P(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((AnonymousClass000.A07(this.A02) * 31) + AnonymousClass000.A07(this.A00)) * 31) + C18310x6.A07(this.A01);
    }

    public AnonymousClass5XT(Bitmap bitmap, UserJid userJid, List list) {
        this.A02 = list;
        this.A00 = bitmap;
        this.A01 = userJid;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("State(matchingBotCommands=");
        A0o.append(this.A02);
        A0o.append(", profilePhoto=");
        A0o.append(this.A00);
        A0o.append(", userJid=");
        return C18260x0.A04(this.A01, A0o);
    }

    public AnonymousClass5XT() {
        this((Bitmap) null, (UserJid) null, (List) null);
    }
}
