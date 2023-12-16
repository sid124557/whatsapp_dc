package X;

import android.os.Bundle;
import com.whatsapp.SuspiciousLinkWarningDialogFragment;
import java.util.Set;

/* renamed from: X.24s  reason: invalid class name and case insensitive filesystem */
public final class C379624s {
    public static final SuspiciousLinkWarningDialogFragment A00(String str, String str2, Set set) {
        C162457s7.A0J(str, 0);
        C18260x0.A0Q(set, str2);
        SuspiciousLinkWarningDialogFragment suspiciousLinkWarningDialogFragment = new SuspiciousLinkWarningDialogFragment();
        Bundle A0F = AnonymousClass0x7.A0F("url", str);
        A0F.putSerializable("message_key_id", str2);
        A0F.putSerializable("phishingChars", AnonymousClass0x9.A15(set));
        suspiciousLinkWarningDialogFragment.A0u(A0F);
        return suspiciousLinkWarningDialogFragment;
    }
}
