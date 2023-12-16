package X;

import java.util.HashSet;
import java.util.Set;

/* renamed from: X.31y  reason: invalid class name and case insensitive filesystem */
public class C617131y {
    public static final Set A00 = C18280x3.A0h(new String[]{"audio", "image", "video", "ptv", "kyc-id", "sticker", "document", "ptt", "gif", "md-app-state", "md-msg-hist", "ppic", "newsletter-image", "newsletter-document", "newsletter-video", "newsletter-sticker", "newsletter-audio", "newsletter-ptt", "newsletter-gif", "newsletter-thumbnail-link", "thumbnail-video", "thumbnail-image", "thumbnail-document", "thumbnail-gif", "thumbnail-link"});

    public static Set A00(AnonymousClass36K r6, Set set) {
        if (r6 == null) {
            return null;
        }
        HashSet A0K = AnonymousClass002.A0K();
        AnonymousClass36K[] r4 = r6.A03;
        if (r4 != null) {
            for (AnonymousClass36K r1 : r4) {
                if (set == null || set.contains(r1.A00)) {
                    A0K.add(r1.A00);
                }
            }
        }
        return A0K;
    }
}
